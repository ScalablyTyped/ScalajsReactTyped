package typingsJapgolly.cypress

import japgolly.scalajs.react.Callback
import typingsJapgolly.cypress.cypressMod.Cypress.Dimensions
import typingsJapgolly.cypress.cypressMod.Cypress.Padding
import typingsJapgolly.cypress.cypressStrings.fullPage
import typingsJapgolly.cypress.cypressStrings.runner
import typingsJapgolly.cypress.cypressStrings.viewport
import typingsJapgolly.std.Document_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<cypress.cypress.Cypress.ScreenshotDefaultsOptions> */
trait PartialScreenshotDefaults extends js.Object {
  var afterScreenshot: js.UndefOr[js.Function1[/* doc */ Document_, Unit]] = js.undefined
  var beforeScreenshot: js.UndefOr[js.Function1[/* doc */ Document_, Unit]] = js.undefined
  var blackout: js.UndefOr[js.Array[String]] = js.undefined
  var capture: js.UndefOr[runner | viewport | fullPage] = js.undefined
  var clip: js.UndefOr[Dimensions] = js.undefined
  var disableTimersAndAnimations: js.UndefOr[Boolean] = js.undefined
  var padding: js.UndefOr[Padding] = js.undefined
  var scale: js.UndefOr[Boolean] = js.undefined
  var screenshotOnRunFailure: js.UndefOr[Boolean] = js.undefined
}

object PartialScreenshotDefaults {
  @scala.inline
  def apply(
    afterScreenshot: /* doc */ Document_ => Callback = null,
    beforeScreenshot: /* doc */ Document_ => Callback = null,
    blackout: js.Array[String] = null,
    capture: runner | viewport | fullPage = null,
    clip: Dimensions = null,
    disableTimersAndAnimations: js.UndefOr[Boolean] = js.undefined,
    padding: Padding = null,
    scale: js.UndefOr[Boolean] = js.undefined,
    screenshotOnRunFailure: js.UndefOr[Boolean] = js.undefined
  ): PartialScreenshotDefaults = {
    val __obj = js.Dynamic.literal()
    if (afterScreenshot != null) __obj.updateDynamic("afterScreenshot")(js.Any.fromFunction1((t0: /* doc */ typingsJapgolly.std.Document_) => afterScreenshot(t0).runNow()))
    if (beforeScreenshot != null) __obj.updateDynamic("beforeScreenshot")(js.Any.fromFunction1((t0: /* doc */ typingsJapgolly.std.Document_) => beforeScreenshot(t0).runNow()))
    if (blackout != null) __obj.updateDynamic("blackout")(blackout.asInstanceOf[js.Any])
    if (capture != null) __obj.updateDynamic("capture")(capture.asInstanceOf[js.Any])
    if (clip != null) __obj.updateDynamic("clip")(clip.asInstanceOf[js.Any])
    if (!js.isUndefined(disableTimersAndAnimations)) __obj.updateDynamic("disableTimersAndAnimations")(disableTimersAndAnimations.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (!js.isUndefined(screenshotOnRunFailure)) __obj.updateDynamic("screenshotOnRunFailure")(screenshotOnRunFailure.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialScreenshotDefaults]
  }
}

