

class TextTranslit(text: String) extends TextCustom(text){
  def draw(): Unit = {
    println(text.toUpperCase())
  }
}
