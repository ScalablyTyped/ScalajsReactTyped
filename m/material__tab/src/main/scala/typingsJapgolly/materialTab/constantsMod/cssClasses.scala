package typingsJapgolly.materialTab.constantsMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.materialBase.foundationMod.MDCStrings
import typingsJapgolly.materialTab.materialTabStrings.`mdc-tab--active`
import typingsJapgolly.materialTab.materialTabStrings.`mdc-tab--animating-activate`
import typingsJapgolly.materialTab.materialTabStrings.`mdc-tab--animating-deactivate`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait cssClasses extends MDCStrings {
  var ACTIVE: `mdc-tab--active`
  var ANIMATING_ACTIVATE: `mdc-tab--animating-activate`
  var ANIMATING_DEACTIVATE: `mdc-tab--animating-deactivate`
}

object cssClasses {
  @scala.inline
  def apply(
    ACTIVE: `mdc-tab--active`,
    ANIMATING_ACTIVATE: `mdc-tab--animating-activate`,
    ANIMATING_DEACTIVATE: `mdc-tab--animating-deactivate`,
    StringDictionary: StringDictionary[String] = null
  ): cssClasses = {
    val __obj = js.Dynamic.literal(ACTIVE = ACTIVE.asInstanceOf[js.Any], ANIMATING_ACTIVATE = ANIMATING_ACTIVATE.asInstanceOf[js.Any], ANIMATING_DEACTIVATE = ANIMATING_DEACTIVATE.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[cssClasses]
  }
}

