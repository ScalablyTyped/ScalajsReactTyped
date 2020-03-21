package typingsJapgolly.reactNativeVideo

import typingsJapgolly.reactNativeVideo.reactNativeVideoStrings.disabled
import typingsJapgolly.reactNativeVideo.reactNativeVideoStrings.index
import typingsJapgolly.reactNativeVideo.reactNativeVideoStrings.language
import typingsJapgolly.reactNativeVideo.reactNativeVideoStrings.system
import typingsJapgolly.reactNativeVideo.reactNativeVideoStrings.title
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType extends js.Object {
  var `type`: system | disabled | title | language | index
  var value: js.UndefOr[String | Double] = js.undefined
}

object AnonType {
  @scala.inline
  def apply(`type`: system | disabled | title | language | index, value: String | Double = null): AnonType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType]
  }
}

