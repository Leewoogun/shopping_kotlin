package screen

class ShoppingHome {
    fun start(){
        welcome()
        showCategories()
    }

    private fun welcome() {
        println("안녕하세요, shopping에 오신 것을 환영합니다.")
        println("쇼핑을 계속 하시려면 이름을 입력해주세요")

        val name = readLine()
        println(
            """
            감사합니다. 반갑습니다 $name 님
            원하시는 카테고리를 입력해주세요.
            ===========================================
        """.trimIndent()
        )
    }

    private fun showCategories() {
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
        } else {
            // TODO 2. 카테고리 상품 목록 보여주기
            // TODO 3. 카테고리 목록에 없는 값을 입력
        }
    }


}