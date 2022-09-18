package screen

import extensions.getNotEmptyString


/*
step 1. 장바구니에 추가한 상품 관리
step 2. 사용자 입력값 요청 처리 공통화
step 3. 프로젝트 전역에서 참조하는 상수
 */
class ShoppingCategory {
    public fun showCategories() {
        val categories = arrayOf("패션", "전자기기", "반려동물용품")

        for (cate in categories) {
            println(cate)
        }

        println("=> 장바구니로 이동하시려면 #을 입력해주세요")

        var selectedCate = readLine().getNotEmptyString()

        if (selectedCate == "#") {
            val shoppingCart = ShoppingCart()
            shoppingCart.showCartItems()
        }
        else {
            if (categories.contains(selectedCate)){
                val shoppingProductList = ShoppingProductList()
                shoppingProductList.showProducts(selectedCate)

            }
            else {
                showErrorMessage(selectedCate)

            }
        }
    }

    private fun showErrorMessage(selectedCate: String?) {
        println("[$selectedCate] : 존재하지 않는 카테고리 입니다. 다시 입력하세요")
        showCategories()
    }

}