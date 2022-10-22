package typingsJapgolly.ionicCore

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsGestureRecognizersMod {
  
  @JSImport("@ionic/core/dist/types/utils/gesture/recognizers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createPanRecognizer(direction: String, thresh: Double, maxAngle: Double): PanRecognizer = (^.asInstanceOf[js.Dynamic].applyDynamic("createPanRecognizer")(direction.asInstanceOf[js.Any], thresh.asInstanceOf[js.Any], maxAngle.asInstanceOf[js.Any])).asInstanceOf[PanRecognizer]
  
  trait PanRecognizer extends StObject {
    
    def detect(x: Double, y: Double): Boolean
    
    def getDirection(): Double
    
    def isGesture(): Boolean
    
    def start(x: Double, y: Double): Unit
  }
  object PanRecognizer {
    
    inline def apply(
      detect: (Double, Double) => Boolean,
      getDirection: CallbackTo[Double],
      isGesture: CallbackTo[Boolean],
      start: (Double, Double) => Callback
    ): PanRecognizer = {
      val __obj = js.Dynamic.literal(detect = js.Any.fromFunction2(detect), getDirection = getDirection.toJsFn, isGesture = isGesture.toJsFn, start = js.Any.fromFunction2((t0: Double, t1: Double) => (start(t0, t1)).runNow()))
      __obj.asInstanceOf[PanRecognizer]
    }
    
    extension [Self <: PanRecognizer](x: Self) {
      
      inline def setDetect(value: (Double, Double) => Boolean): Self = StObject.set(x, "detect", js.Any.fromFunction2(value))
      
      inline def setGetDirection(value: CallbackTo[Double]): Self = StObject.set(x, "getDirection", value.toJsFn)
      
      inline def setIsGesture(value: CallbackTo[Boolean]): Self = StObject.set(x, "isGesture", value.toJsFn)
      
      inline def setStart(value: (Double, Double) => Callback): Self = StObject.set(x, "start", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    }
  }
}
