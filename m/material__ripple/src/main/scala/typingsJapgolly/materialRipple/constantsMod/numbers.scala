package typingsJapgolly.materialRipple.constantsMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.materialBase.foundationMod.MDCNumbers
import typingsJapgolly.materialRipple.materialRippleNumbers.`0.6`
import typingsJapgolly.materialRipple.materialRippleNumbers.`10`
import typingsJapgolly.materialRipple.materialRippleNumbers.`150`
import typingsJapgolly.materialRipple.materialRippleNumbers.`225`
import typingsJapgolly.materialRipple.materialRippleNumbers.`300`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait numbers extends MDCNumbers {
  var DEACTIVATION_TIMEOUT_MS: `225`
   // Corresponds to $mdc-ripple-translate-duration (i.e. activation animation duration)
  var FG_DEACTIVATION_MS: `150`
  var INITIAL_ORIGIN_SCALE: `0.6`
  var PADDING: `10`
   // Corresponds to $mdc-ripple-fade-out-duration (i.e. deactivation animation duration)
  var TAP_DELAY_MS: `300`
}

object numbers {
  @scala.inline
  def apply(
    DEACTIVATION_TIMEOUT_MS: `225`,
    FG_DEACTIVATION_MS: `150`,
    INITIAL_ORIGIN_SCALE: `0.6`,
    PADDING: `10`,
    TAP_DELAY_MS: `300`,
    StringDictionary: StringDictionary[Double] = null
  ): numbers = {
    val __obj = js.Dynamic.literal(DEACTIVATION_TIMEOUT_MS = DEACTIVATION_TIMEOUT_MS.asInstanceOf[js.Any], FG_DEACTIVATION_MS = FG_DEACTIVATION_MS.asInstanceOf[js.Any], INITIAL_ORIGIN_SCALE = INITIAL_ORIGIN_SCALE.asInstanceOf[js.Any], PADDING = PADDING.asInstanceOf[js.Any], TAP_DELAY_MS = TAP_DELAY_MS.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[numbers]
  }
}

