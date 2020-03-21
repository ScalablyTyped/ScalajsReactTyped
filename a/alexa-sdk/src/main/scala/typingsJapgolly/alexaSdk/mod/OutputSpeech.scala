package typingsJapgolly.alexaSdk.mod

import typingsJapgolly.alexaSdk.alexaSdkStrings.PlainText
import typingsJapgolly.alexaSdk.alexaSdkStrings.SSML
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputSpeech extends js.Object {
  var ssml: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var `type`: PlainText | SSML
}

object OutputSpeech {
  @scala.inline
  def apply(`type`: PlainText | SSML, ssml: String = null, text: String = null): OutputSpeech = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (ssml != null) __obj.updateDynamic("ssml")(ssml.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputSpeech]
  }
}

