package data

// 프로젝트 전역에서 활용할 계획이기 때문에 싱글턴 패턴 객체 생성
object CartItems {
    private val mutableProducts = mutableMapOf<Product, Int>()
    val products : Map<Product, Int> = mutableProducts

    fun addProduct(product : Product){
        mutableProducts[product]?.let{
            mutableProducts[product] = it + 1
        } ?: kotlin.run{
            mutableProducts[product] = 1
        }
    }
}