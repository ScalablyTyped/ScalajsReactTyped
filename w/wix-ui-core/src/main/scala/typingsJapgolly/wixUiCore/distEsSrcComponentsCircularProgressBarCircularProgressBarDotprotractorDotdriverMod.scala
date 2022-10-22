package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.protractor.mod.ElementFinder
import typingsJapgolly.wixUiCore.distEsSrcCommonBaseDriverDotprotractorMod.BaseDriver
import typingsJapgolly.wixUiCore.distEsSrcCommonBaseDriverDotprotractorMod.DriverFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsCircularProgressBarCircularProgressBarDotprotractorDotdriverMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/circular-progress-bar/CircularProgressBar.protractor.driver", "circularProgressBarDriverFactory")
  @js.native
  val circularProgressBarDriverFactory: DriverFactory[CircularProgressBarDriver] = js.native
  
  trait CircularProgressBarDriver
    extends StObject
       with BaseDriver {
    
    /** Returns true if the root element is present */
    def exists(): js.Promise[Boolean]
    
    /** Get the foreground arc value (percentage) */
    def getValue(): js.Promise[Double]
    
    /** Get the progress indication element value */
    def progressIndicationValue(): js.Promise[String]
  }
  object CircularProgressBarDriver {
    
    inline def apply(
      element: CallbackTo[ElementFinder],
      exists: CallbackTo[js.Promise[Boolean]],
      getValue: CallbackTo[js.Promise[Double]],
      progressIndicationValue: CallbackTo[js.Promise[String]]
    ): CircularProgressBarDriver = {
      val __obj = js.Dynamic.literal(element = element.toJsFn, exists = exists.toJsFn, getValue = getValue.toJsFn, progressIndicationValue = progressIndicationValue.toJsFn)
      __obj.asInstanceOf[CircularProgressBarDriver]
    }
    
    extension [Self <: CircularProgressBarDriver](x: Self) {
      
      inline def setExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "exists", value.toJsFn)
      
      inline def setGetValue(value: CallbackTo[js.Promise[Double]]): Self = StObject.set(x, "getValue", value.toJsFn)
      
      inline def setProgressIndicationValue(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "progressIndicationValue", value.toJsFn)
    }
  }
}
