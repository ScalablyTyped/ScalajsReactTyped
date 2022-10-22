package typingsJapgolly.cypress.Cypress

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import typingsJapgolly.cypress.JQuery
import typingsJapgolly.cypress.anon.Blackout
import typingsJapgolly.cypress.cypressStrings.fullPage
import typingsJapgolly.cypress.cypressStrings.runner
import typingsJapgolly.cypress.cypressStrings.viewport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScreenshotDefaultsOptions
  extends StObject
     with ScreenshotOptions {
  
  var screenshotOnRunFailure: Boolean
}
object ScreenshotDefaultsOptions {
  
  inline def apply(
    blackout: js.Array[String],
    capture: runner | viewport | fullPage,
    clip: Dimensions,
    disableTimersAndAnimations: Boolean,
    onAfterScreenshot: (JQuery[HTMLElement], Blackout) => Callback,
    onBeforeScreenshot: JQuery[HTMLElement] => Callback,
    overwrite: Boolean,
    padding: Padding,
    scale: Boolean,
    screenshotOnRunFailure: Boolean
  ): ScreenshotDefaultsOptions = {
    val __obj = js.Dynamic.literal(blackout = blackout.asInstanceOf[js.Any], capture = capture.asInstanceOf[js.Any], clip = clip.asInstanceOf[js.Any], disableTimersAndAnimations = disableTimersAndAnimations.asInstanceOf[js.Any], onAfterScreenshot = js.Any.fromFunction2((t0: JQuery[HTMLElement], t1: Blackout) => (onAfterScreenshot(t0, t1)).runNow()), onBeforeScreenshot = js.Any.fromFunction1((t0: JQuery[HTMLElement]) => onBeforeScreenshot(t0).runNow()), overwrite = overwrite.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], screenshotOnRunFailure = screenshotOnRunFailure.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScreenshotDefaultsOptions]
  }
  
  extension [Self <: ScreenshotDefaultsOptions](x: Self) {
    
    inline def setScreenshotOnRunFailure(value: Boolean): Self = StObject.set(x, "screenshotOnRunFailure", value.asInstanceOf[js.Any])
  }
}
