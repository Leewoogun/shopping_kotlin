package screen

class ShoppingCategory {
    public fun showCategories() {
        val categories = arrayOf("패션", "전자기기", "반려동물용품")

        for (cate in categories) {
            println(cate)
        }

        println("=> 장바구니로 이동하시려면 #을 입력해주세요")

        var selectedCate = readLine()
        while (selectedCate.isNullOrBlank()) {
            println("값을 입력하세요")
            selectedCate = readLine()
        }

        if (selectedCate == "#") {
            // TODO 1. 장바구니 이동
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