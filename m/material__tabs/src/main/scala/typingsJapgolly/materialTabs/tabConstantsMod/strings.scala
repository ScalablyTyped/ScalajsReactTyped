package typingsJapgolly.materialTabs.tabConstantsMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.materialBase.foundationMod.MDCStrings
import typingsJapgolly.materialTabs.materialTabsStrings.MDCTabColonselected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait strings extends MDCStrings {
  var SELECTED_EVENT: MDCTabColonselected
}

object strings {
  @scala.inline
  def apply(SELECTED_EVENT: MDCTabColonselected, StringDictionary: StringDictionary[String] = null): strings = {
    val __obj = js.Dynamic.literal(SELECTED_EVENT = SELECTED_EVENT.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[strings]
  }
}

