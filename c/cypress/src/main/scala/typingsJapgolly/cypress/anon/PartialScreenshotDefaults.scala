package typingsJapgolly.cypress.anon

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import typingsJapgolly.cypress.Cypress.Dimensions
import typingsJapgolly.cypress.Cypress.Padding
import typingsJapgolly.cypress.JQuery
import typingsJapgolly.cypress.cypressStrings.fullPage
import typingsJapgolly.cypress.cypressStrings.runner
import typingsJapgolly.cypress.cypressStrings.viewport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<cypress.Cypress.ScreenshotDefaultsOptions> */
trait PartialScreenshotDefaults extends StObject {
  
  var blackout: js.UndefOr[js.Array[String]] = js.undefined
  
  var capture: js.UndefOr[runner | viewport | fullPage] = js.undefined
  
  var clip: js.UndefOr[Dimensions] = js.undefined
  
  var disableTimersAndAnimations: js.UndefOr[Boolean] = js.undefined
  
  var onAfterScreenshot: js.UndefOr[js.Function2[/* $el */ JQuery[HTMLElement], /* props */ Blackout, Unit]] = js.undefined
  
  var onBeforeScreenshot: js.UndefOr[js.Function1[/* $el */ JQuery[HTMLElement], Unit]] = js.undefined
  
  var overwrite: js.UndefOr[Boolean] = js.undefined
  
  var padding: js.UndefOr[Padding] = js.undefined
  
  var scale: js.UndefOr[Boolean] = js.undefined
  
  var screenshotOnRunFailure: js.UndefOr[Boolean] = js.undefined
}
object PartialScreenshotDefaults {
  
  inline def apply(): PartialScreenshotDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialScreenshotDefaults]
  }
  
  extension [Self <: PartialScreenshotDefaults](x: Self) {
    
    inline def setBlackout(value: js.Array[String]): Self = StObject.set(x, "blackout", value.asInstanceOf[js.Any])
    
    inline def setBlackoutUndefined: Self = StObject.set(x, "blackout", js.undefined)
    
    inline def setBlackoutVarargs(value: String*): Self = StObject.set(x, "blackout", js.Array(value*))
    
    inline def setCapture(value: runner | viewport | fullPage): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
    
    inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
    
    inline def setClip(value: Dimensions): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
    
    inline def setClipUndefined: Self = StObject.set(x, "clip", js.undefined)
    
    inline def setDisableTimersAndAnimations(value: Boolean): Self = StObject.set(x, "disableTimersAndAnimations", value.asInstanceOf[js.Any])
    
    inline def setDisableTimersAndAnimationsUndefined: Self = StObject.set(x, "disableTimersAndAnimations", js.undefined)
    
    inline def setOnAfterScreenshot(value: (/* $el */ JQuery[HTMLElement], /* props */ Blackout) => Callback): Self = StObject.set(x, "onAfterScreenshot", js.Any.fromFunction2((t0: /* $el */ JQuery[HTMLElement], t1: /* props */ Blackout) => (value(t0, t1)).runNow()))
    
    inline def setOnAfterScreenshotUndefined: Self = StObject.set(x, "onAfterScreenshot", js.undefined)
    
    inline def setOnBeforeScreenshot(value: /* $el */ JQuery[HTMLElement] => Callback): Self = StObject.set(x, "onBeforeScreenshot", js.Any.fromFunction1((t0: /* $el */ JQuery[HTMLElement]) => value(t0).runNow()))
    
    inline def setOnBeforeScreenshotUndefined: Self = StObject.set(x, "onBeforeScreenshot", js.undefined)
    
    inline def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
    
    inline def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
    
    inline def setPadding(value: Padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setPaddingVarargs(value: Double*): Self = StObject.set(x, "padding", js.Array(value*))
    
    inline def setScale(value: Boolean): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setScreenshotOnRunFailure(value: Boolean): Self = StObject.set(x, "screenshotOnRunFailure", value.asInstanceOf[js.Any])
    
    inline def setScreenshotOnRunFailureUndefined: Self = StObject.set(x, "screenshotOnRunFailure", js.undefined)
  }
}
