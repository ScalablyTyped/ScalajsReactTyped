package typingsJapgolly.materialRadio.constantsMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.materialBase.foundationMod.MDCStrings
import typingsJapgolly.materialRadio.materialRadioStrings.`Dotmdc-radio__native-control`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait strings extends MDCStrings {
  var NATIVE_CONTROL_SELECTOR: `Dotmdc-radio__native-control`
}

object strings {
  @scala.inline
  def apply(
    NATIVE_CONTROL_SELECTOR: `Dotmdc-radio__native-control`,
    StringDictionary: StringDictionary[String] = null
  ): strings = {
    val __obj = js.Dynamic.literal(NATIVE_CONTROL_SELECTOR = NATIVE_CONTROL_SELECTOR.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[strings]
  }
}

