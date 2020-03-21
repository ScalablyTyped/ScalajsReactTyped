package typingsJapgolly.cypress.cypressMod.Cypress

import japgolly.scalajs.react.Callback
import typingsJapgolly.cypress.cypressStrings.fullPage
import typingsJapgolly.cypress.cypressStrings.runner
import typingsJapgolly.cypress.cypressStrings.viewport
import typingsJapgolly.std.Document_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScreenshotDefaultsOptions extends ScreenshotOptions {
  var screenshotOnRunFailure: Boolean
}

object ScreenshotDefaultsOptions {
  @scala.inline
  def apply(
    afterScreenshot: Document_ => Callback,
    beforeScreenshot: Document_ => Callback,
    blackout: js.Array[String],
    capture: runner | viewport | fullPage,
    clip: Dimensions,
    disableTimersAndAnimations: Boolean,
    padding: Padding,
    scale: Boolean,
    screenshotOnRunFailure: Boolean
  ): ScreenshotDefaultsOptions = {
    val __obj = js.Dynamic.literal(blackout = blackout.asInstanceOf[js.Any], capture = capture.asInstanceOf[js.Any], clip = clip.asInstanceOf[js.Any], disableTimersAndAnimations = disableTimersAndAnimations.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], screenshotOnRunFailure = screenshotOnRunFailure.asInstanceOf[js.Any])
    __obj.updateDynamic("afterScreenshot")(js.Any.fromFunction1((t0: typingsJapgolly.std.Document_) => afterScreenshot(t0).runNow()))
    __obj.updateDynamic("beforeScreenshot")(js.Any.fromFunction1((t0: typingsJapgolly.std.Document_) => beforeScreenshot(t0).runNow()))
    __obj.asInstanceOf[ScreenshotDefaultsOptions]
  }
}

