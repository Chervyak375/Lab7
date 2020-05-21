import org.scalatest.FunSuite

class TextManagerTestTest extends FunSuite {

  test("matching styles") {

    val content = "It's my first post on this Service_App."
    val user_post_body_with_style = new TextMixer(content)
    val user_post_body = new TextTranslit(content)
    TextManager.print(user_post_body_with_style);
    TextManager.print(user_post_body);
  }
}