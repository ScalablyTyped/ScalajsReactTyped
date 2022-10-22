package typingsJapgolly.rotJs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import typingsJapgolly.rotJs.libDisplayTypesMod.DisplayData
import typingsJapgolly.rotJs.libDisplayTypesMod.DisplayOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDisplayBackendMod {
  
  /* note: abstract class */ @JSImport("rot-js/lib/display/backend", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Backend {
    
    /* CompleteClass */
    var _options: DisplayOptions = js.native
    
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /* CompleteClass */
    override def computeFontSize(availWidth: Double, availHeight: Double): Double = js.native
    
    /* CompleteClass */
    override def computeSize(availWidth: Double, availHeight: Double): js.Tuple2[Double, Double] = js.native
    
    /* CompleteClass */
    override def draw(data: DisplayData, clearBefore: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def eventToPosition(x: Double, y: Double): js.Tuple2[Double, Double] = js.native
    
    /* CompleteClass */
    override def getContainer(): HTMLElement | Null = js.native
    
    /* CompleteClass */
    override def schedule(cb: js.Function0[Unit]): Unit = js.native
    
    /* CompleteClass */
    override def setOptions(options: DisplayOptions): Unit = js.native
  }
  
  trait Backend extends StObject {
    
    var _options: DisplayOptions
    
    def clear(): Unit
    
    def computeFontSize(availWidth: Double, availHeight: Double): Double
    
    def computeSize(availWidth: Double, availHeight: Double): js.Tuple2[Double, Double]
    
    def draw(data: DisplayData, clearBefore: Boolean): Unit
    
    def eventToPosition(x: Double, y: Double): js.Tuple2[Double, Double]
    
    def getContainer(): HTMLElement | Null
    
    def schedule(cb: js.Function0[Unit]): Unit
    
    def setOptions(options: DisplayOptions): Unit
  }
  object Backend {
    
    inline def apply(
      _options: DisplayOptions,
      clear: Callback,
      computeFontSize: (Double, Double) => Double,
      computeSize: (Double, Double) => js.Tuple2[Double, Double],
      draw: (DisplayData, Boolean) => Callback,
      eventToPosition: (Double, Double) => js.Tuple2[Double, Double],
      getContainer: CallbackTo[HTMLElement | Null],
      schedule: js.Function0[Unit] => Callback,
      setOptions: DisplayOptions => Callback
    ): Backend = {
      val __obj = js.Dynamic.literal(_options = _options.asInstanceOf[js.Any], clear = clear.toJsFn, computeFontSize = js.Any.fromFunction2(computeFontSize), computeSize = js.Any.fromFunction2(computeSize), draw = js.Any.fromFunction2((t0: DisplayData, t1: Boolean) => (draw(t0, t1)).runNow()), eventToPosition = js.Any.fromFunction2(eventToPosition), getContainer = getContainer.toJsFn, schedule = js.Any.fromFunction1((t0: js.Function0[Unit]) => schedule(t0).runNow()), setOptions = js.Any.fromFunction1((t0: DisplayOptions) => setOptions(t0).runNow()))
      __obj.asInstanceOf[Backend]
    }
    
    extension [Self <: Backend](x: Self) {
      
      inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
      
      inline def setComputeFontSize(value: (Double, Double) => Double): Self = StObject.set(x, "computeFontSize", js.Any.fromFunction2(value))
      
      inline def setComputeSize(value: (Double, Double) => js.Tuple2[Double, Double]): Self = StObject.set(x, "computeSize", js.Any.fromFunction2(value))
      
      inline def setDraw(value: (DisplayData, Boolean) => Callback): Self = StObject.set(x, "draw", js.Any.fromFunction2((t0: DisplayData, t1: Boolean) => (value(t0, t1)).runNow()))
      
      inline def setEventToPosition(value: (Double, Double) => js.Tuple2[Double, Double]): Self = StObject.set(x, "eventToPosition", js.Any.fromFunction2(value))
      
      inline def setGetContainer(value: CallbackTo[HTMLElement | Null]): Self = StObject.set(x, "getContainer", value.toJsFn)
      
      inline def setSchedule(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "schedule", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
      
      inline def setSetOptions(value: DisplayOptions => Callback): Self = StObject.set(x, "setOptions", js.Any.fromFunction1((t0: DisplayOptions) => value(t0).runNow()))
      
      inline def set_options(value: DisplayOptions): Self = StObject.set(x, "_options", value.asInstanceOf[js.Any])
    }
  }
}
