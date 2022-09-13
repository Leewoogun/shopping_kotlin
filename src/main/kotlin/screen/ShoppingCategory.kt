package screen

class ShoppingCategory {
    public fun showCategories() {
        val categories = arrayOf("패션, 전자기기, 반려동물용품")

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
            // TODO 2. 카테고리 상품 목록 보여주기
            if (categories.contains(selectedCate)){

            }
            else {
                showErrorMessage(selectedCate)

            }

            // TODO 3. 카테고리 목록에 없는 값을 입력
        }
    }

    private fun showErrorMessage(selectedCate: String?) {
        println("[$selectedCate] : 존재하지 않는 카테고리 입니다. 다시 입력하세요")
        showCategories()
    }

}