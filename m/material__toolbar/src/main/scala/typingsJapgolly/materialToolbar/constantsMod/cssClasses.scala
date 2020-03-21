package typingsJapgolly.materialToolbar.constantsMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.materialBase.foundationMod.MDCStrings
import typingsJapgolly.materialToolbar.materialToolbarStrings.`mdc-toolbar--fixed-at-last-row`
import typingsJapgolly.materialToolbar.materialToolbarStrings.`mdc-toolbar--fixed-lastrow-only`
import typingsJapgolly.materialToolbar.materialToolbarStrings.`mdc-toolbar--fixed`
import typingsJapgolly.materialToolbar.materialToolbarStrings.`mdc-toolbar--flexible-default-behavior`
import typingsJapgolly.materialToolbar.materialToolbarStrings.`mdc-toolbar--flexible-space-maximized`
import typingsJapgolly.materialToolbar.materialToolbarStrings.`mdc-toolbar--flexible-space-minimized`
import typingsJapgolly.materialToolbar.materialToolbarStrings.`mdc-toolbar--flexible`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait cssClasses extends MDCStrings {
  var FIXED: `mdc-toolbar--fixed`
  var FIXED_AT_LAST_ROW: `mdc-toolbar--fixed-at-last-row`
  var FIXED_LASTROW: `mdc-toolbar--fixed-lastrow-only`
  var FLEXIBLE_DEFAULT_BEHAVIOR: `mdc-toolbar--flexible-default-behavior`
  var FLEXIBLE_MAX: `mdc-toolbar--flexible-space-maximized`
  var FLEXIBLE_MIN: `mdc-toolbar--flexible-space-minimized`
  var TOOLBAR_ROW_FLEXIBLE: `mdc-toolbar--flexible`
}

object cssClasses {
  @scala.inline
  def apply(
    FIXED: `mdc-toolbar--fixed`,
    FIXED_AT_LAST_ROW: `mdc-toolbar--fixed-at-last-row`,
    FIXED_LASTROW: `mdc-toolbar--fixed-lastrow-only`,
    FLEXIBLE_DEFAULT_BEHAVIOR: `mdc-toolbar--flexible-default-behavior`,
    FLEXIBLE_MAX: `mdc-toolbar--flexible-space-maximized`,
    FLEXIBLE_MIN: `mdc-toolbar--flexible-space-minimized`,
    TOOLBAR_ROW_FLEXIBLE: `mdc-toolbar--flexible`,
    StringDictionary: StringDictionary[String] = null
  ): cssClasses = {
    val __obj = js.Dynamic.literal(FIXED = FIXED.asInstanceOf[js.Any], FIXED_AT_LAST_ROW = FIXED_AT_LAST_ROW.asInstanceOf[js.Any], FIXED_LASTROW = FIXED_LASTROW.asInstanceOf[js.Any], FLEXIBLE_DEFAULT_BEHAVIOR = FLEXIBLE_DEFAULT_BEHAVIOR.asInstanceOf[js.Any], FLEXIBLE_MAX = FLEXIBLE_MAX.asInstanceOf[js.Any], FLEXIBLE_MIN = FLEXIBLE_MIN.asInstanceOf[js.Any], TOOLBAR_ROW_FLEXIBLE = TOOLBAR_ROW_FLEXIBLE.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[cssClasses]
  }
}

