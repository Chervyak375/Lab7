import scala.util.matching.Regex

/** The special format of the text that is used in the application. */
class TextMixer(text: String) extends TextCustom(text) {
  def draw(): Unit = {
    var text_formated = new String(text)
    val mask: Regex = "\\s|_".r

    for (c <- mask.findAllMatchIn(text)) {
      c.matched match {
        case "_" => text_formated = text_formated.updated(c.start, ' ')
        case " " => text_formated = text_formated.updated(c.start, '_')
      }
    }

    println(text_formated)
  }
}
