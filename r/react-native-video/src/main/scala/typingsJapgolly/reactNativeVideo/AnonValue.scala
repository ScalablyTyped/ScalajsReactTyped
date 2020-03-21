package typingsJapgolly.reactNativeVideo

import typingsJapgolly.reactNativeVideo.reactNativeVideoStrings.auto
import typingsJapgolly.reactNativeVideo.reactNativeVideoStrings.disabled
import typingsJapgolly.reactNativeVideo.reactNativeVideoStrings.index
import typingsJapgolly.reactNativeVideo.reactNativeVideoStrings.resolution
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValue extends js.Object {
  var `type`: auto | disabled | resolution | index
  var value: js.UndefOr[String | Double] = js.undefined
}

object AnonValue {
  @scala.inline
  def apply(`type`: auto | disabled | resolution | index, value: String | Double = null): AnonValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonValue]
  }
}

