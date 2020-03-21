package typingsJapgolly.materialSelect.constantsMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.materialBase.foundationMod.MDCStrings
import typingsJapgolly.materialSelect.materialSelectStrings.`mdc-select--box`
import typingsJapgolly.materialSelect.materialSelectStrings.`mdc-select--disabled`
import typingsJapgolly.materialSelect.materialSelectStrings.`mdc-select`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait cssClasses extends MDCStrings {
  var BOX: `mdc-select--box`
  var DISABLED: `mdc-select--disabled`
  var ROOT: `mdc-select`
}

object cssClasses {
  @scala.inline
  def apply(
    BOX: `mdc-select--box`,
    DISABLED: `mdc-select--disabled`,
    ROOT: `mdc-select`,
    StringDictionary: StringDictionary[String] = null
  ): cssClasses = {
    val __obj = js.Dynamic.literal(BOX = BOX.asInstanceOf[js.Any], DISABLED = DISABLED.asInstanceOf[js.Any], ROOT = ROOT.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[cssClasses]
  }
}

