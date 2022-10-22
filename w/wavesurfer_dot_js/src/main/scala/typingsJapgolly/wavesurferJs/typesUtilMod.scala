package typingsJapgolly.wavesurferJs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLElement
import typingsJapgolly.wavesurferJs.anon.Typeofdebounce
import typingsJapgolly.wavesurferJs.srcUtilMod.Observer
import typingsJapgolly.wavesurferJs.typesXhrMod.XHROptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilMod {
  
  trait DrawingContextAttributes extends StObject {
    
    var desynchronized: Boolean
  }
  object DrawingContextAttributes {
    
    inline def apply(desynchronized: Boolean): DrawingContextAttributes = {
      val __obj = js.Dynamic.literal(desynchronized = desynchronized.asInstanceOf[js.Any])
      __obj.asInstanceOf[DrawingContextAttributes]
    }
    
    extension [Self <: DrawingContextAttributes](x: Self) {
      
      inline def setDesynchronized(value: Boolean): Self = StObject.set(x, "desynchronized", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EventHandler extends StObject {
    
    def apply(args: Any*): Unit = js.native
  }
  
  trait ListenerDescriptor extends StObject {
    
    /** The callback. */
    def callback(args: Any*): Unit
    
    /** The name of the event. */
    var name: String
    
    /** The function to call to remove the listener. */
    def un(): Unit
  }
  object ListenerDescriptor {
    
    inline def apply(callback: /* repeated */ Any => Callback, name: String, un: Callback): ListenerDescriptor = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1((t0: /* repeated */ Any) => callback(t0).runNow()), name = name.asInstanceOf[js.Any], un = un.toJsFn)
      __obj.asInstanceOf[ListenerDescriptor]
    }
    
    extension [Self <: ListenerDescriptor](x: Self) {
      
      inline def setCallback(value: /* repeated */ Any => Callback): Self = StObject.set(x, "callback", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setUn(value: Callback): Self = StObject.set(x, "un", value.toJsFn)
    }
  }
  
  type Styles = StringDictionary[String]
  
  trait WaveSurferUtil extends StObject {
    
    var Observer: Instantiable0[typingsJapgolly.wavesurferJs.srcUtilMod.Observer]
    
    def absMax(values: js.Array[Double]): Double
    
    def clamp(`val`: Double, min: Double, max: Double): Double
    
    val debounce: Typeofdebounce
    
    def fetchFile(options: XHROptions): Observer
    
    def frame[T](fn: js.Function1[/* arg */ T, Unit]): js.Function1[/* arg */ T, Unit]
    
    def getId(prefix: String): String
    
    def ignoreSilenceMode(): Unit
    
    def max(values: js.Array[Double]): Double
    
    def min(values: js.Array[Double]): Double
    
    def preventClick(): Unit
    
    def requestAnimationFrame(): js.Function1[/* fn */ js.Function1[/* t */ Double, Unit], Double]
    
    def style[T /* <: HTMLElement */](el: T, styles: Styles): T
    
    def withOrientation(target: HTMLElement, vertical: Boolean): HTMLElement
  }
  object WaveSurferUtil {
    
    inline def apply(
      Observer: Instantiable0[Observer],
      absMax: js.Array[Double] => Double,
      clamp: (Double, Double, Double) => Double,
      debounce: Typeofdebounce,
      fetchFile: XHROptions => Observer,
      frame: js.Function1[Any, Unit] => js.Function1[Any, Unit],
      getId: String => String,
      ignoreSilenceMode: Callback,
      max: js.Array[Double] => Double,
      min: js.Array[Double] => Double,
      preventClick: Callback,
      requestAnimationFrame: CallbackTo[js.Function1[/* fn */ js.Function1[/* t */ Double, Unit], Double]],
      style: (Any, Styles) => Any,
      withOrientation: (HTMLElement, Boolean) => HTMLElement
    ): WaveSurferUtil = {
      val __obj = js.Dynamic.literal(Observer = Observer.asInstanceOf[js.Any], absMax = js.Any.fromFunction1(absMax), clamp = js.Any.fromFunction3(clamp), debounce = debounce.asInstanceOf[js.Any], fetchFile = js.Any.fromFunction1(fetchFile), frame = js.Any.fromFunction1(frame), getId = js.Any.fromFunction1(getId), ignoreSilenceMode = ignoreSilenceMode.toJsFn, max = js.Any.fromFunction1(max), min = js.Any.fromFunction1(min), preventClick = preventClick.toJsFn, requestAnimationFrame = requestAnimationFrame.toJsFn, style = js.Any.fromFunction2(style), withOrientation = js.Any.fromFunction2(withOrientation))
      __obj.asInstanceOf[WaveSurferUtil]
    }
    
    extension [Self <: WaveSurferUtil](x: Self) {
      
      inline def setAbsMax(value: js.Array[Double] => Double): Self = StObject.set(x, "absMax", js.Any.fromFunction1(value))
      
      inline def setClamp(value: (Double, Double, Double) => Double): Self = StObject.set(x, "clamp", js.Any.fromFunction3(value))
      
      inline def setDebounce(value: Typeofdebounce): Self = StObject.set(x, "debounce", value.asInstanceOf[js.Any])
      
      inline def setFetchFile(value: XHROptions => Observer): Self = StObject.set(x, "fetchFile", js.Any.fromFunction1(value))
      
      inline def setFrame(value: js.Function1[Any, Unit] => js.Function1[Any, Unit]): Self = StObject.set(x, "frame", js.Any.fromFunction1(value))
      
      inline def setGetId(value: String => String): Self = StObject.set(x, "getId", js.Any.fromFunction1(value))
      
      inline def setIgnoreSilenceMode(value: Callback): Self = StObject.set(x, "ignoreSilenceMode", value.toJsFn)
      
      inline def setMax(value: js.Array[Double] => Double): Self = StObject.set(x, "max", js.Any.fromFunction1(value))
      
      inline def setMin(value: js.Array[Double] => Double): Self = StObject.set(x, "min", js.Any.fromFunction1(value))
      
      inline def setObserver(value: Instantiable0[Observer]): Self = StObject.set(x, "Observer", value.asInstanceOf[js.Any])
      
      inline def setPreventClick(value: Callback): Self = StObject.set(x, "preventClick", value.toJsFn)
      
      inline def setRequestAnimationFrame(value: CallbackTo[js.Function1[/* fn */ js.Function1[/* t */ Double, Unit], Double]]): Self = StObject.set(x, "requestAnimationFrame", value.toJsFn)
      
      inline def setStyle(value: (Any, Styles) => Any): Self = StObject.set(x, "style", js.Any.fromFunction2(value))
      
      inline def setWithOrientation(value: (HTMLElement, Boolean) => HTMLElement): Self = StObject.set(x, "withOrientation", js.Any.fromFunction2(value))
    }
  }
}
