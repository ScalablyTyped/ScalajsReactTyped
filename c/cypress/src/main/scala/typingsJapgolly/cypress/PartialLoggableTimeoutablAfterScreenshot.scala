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

/* Inlined std.Partial<cypress.cypress.Cypress.Loggable & cypress.cypress.Cypress.Timeoutable & cypress.cypress.Cypress.ScreenshotOptions> */
trait PartialLoggableTimeoutablAfterScreenshot extends js.Object {
  var afterScreenshot: js.UndefOr[js.Function1[/* doc */ Document_, Unit]] = js.undefined
  var beforeScreenshot: js.UndefOr[js.Function1[/* doc */ Document_, Unit]] = js.undefined
  var blackout: js.UndefOr[js.Array[String]] = js.undefined
  var capture: js.UndefOr[runner | viewport | fullPage] = js.undefined
  var clip: js.UndefOr[Dimensions] = js.undefined
  var disableTimersAndAnimations: js.UndefOr[Boolean] = js.undefined
  var log: js.UndefOr[Boolean] = js.undefined
  var padding: js.UndefOr[Padding] = js.undefined
  var scale: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object PartialLoggableTimeoutablAfterScreenshot {
  @scala.inline
  def apply(
    afterScreenshot: /* doc */ Document_ => Callback = null,
    beforeScreenshot: /* doc */ Document_ => Callback = null,
    blackout: js.Array[String] = null,
    capture: runner | viewport | fullPage = null,
    clip: Dimensions = null,
    disableTimersAndAnimations: js.UndefOr[Boolean] = js.undefined,
    log: js.UndefOr[Boolean] = js.undefined,
    padding: Padding = null,
    scale: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null
  ): PartialLoggableTimeoutablAfterScreenshot = {
    val __obj = js.Dynamic.literal()
    if (afterScreenshot != null) __obj.updateDynamic("afterScreenshot")(js.Any.fromFunction1((t0: /* doc */ typingsJapgolly.std.Document_) => afterScreenshot(t0).runNow()))
    if (beforeScreenshot != null) __obj.updateDynamic("beforeScreenshot")(js.Any.fromFunction1((t0: /* doc */ typingsJapgolly.std.Document_) => beforeScreenshot(t0).runNow()))
    if (blackout != null) __obj.updateDynamic("blackout")(blackout.asInstanceOf[js.Any])
    if (capture != null) __obj.updateDynamic("capture")(capture.asInstanceOf[js.Any])
    if (clip != null) __obj.updateDynamic("clip")(clip.asInstanceOf[js.Any])
    if (!js.isUndefined(disableTimersAndAnimations)) __obj.updateDynamic("disableTimersAndAnimations")(disableTimersAndAnimations.asInstanceOf[js.Any])
    if (!js.isUndefined(log)) __obj.updateDynamic("log")(log.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialLoggableTimeoutablAfterScreenshot]
  }
}

