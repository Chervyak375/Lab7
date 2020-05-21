

object TextManager {
  def print(text: TextCustom): Unit = {
    text match {
      case f: TextMixer => printf("[MIXER] ")
      case b: TextTranslit => printf("[STRANSLIT] ")
    }

    text.draw();
  }
}
