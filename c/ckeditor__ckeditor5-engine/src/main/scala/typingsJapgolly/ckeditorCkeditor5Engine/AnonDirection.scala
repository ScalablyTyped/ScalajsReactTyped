package typingsJapgolly.ckeditorCkeditor5Engine

import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.backward
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.character
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.codePoint
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.forward
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.word
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDirection extends js.Object {
  var direction: js.UndefOr[forward | backward] = js.undefined
  var unit: js.UndefOr[character | codePoint | word] = js.undefined
}

object AnonDirection {
  @scala.inline
  def apply(direction: forward | backward = null, unit: character | codePoint | word = null): AnonDirection = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDirection]
  }
}

