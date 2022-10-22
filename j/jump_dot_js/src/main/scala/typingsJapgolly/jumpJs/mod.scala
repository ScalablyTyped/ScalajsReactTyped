package typingsJapgolly.jumpJs

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(target: String): Unit = ^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(target: String, opts: Options): Unit = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(target: Element): Unit = ^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(target: Element, opts: Options): Unit = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(target: Double): Unit = ^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(target: Double, opts: Options): Unit = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("jump.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var a11y: js.UndefOr[Boolean] = js.undefined
    
    var callback: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var duration: js.UndefOr[Double | (js.Function1[/* distance */ Double, Double])] = js.undefined
    
    var easing: js.UndefOr[TransitionFunc] = js.undefined
    
    var offset: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setA11y(value: Boolean): Self = StObject.set(x, "a11y", value.asInstanceOf[js.Any])
      
      inline def setA11yUndefined: Self = StObject.set(x, "a11y", js.undefined)
      
      inline def setCallback(value: Callback): Self = StObject.set(x, "callback", value.toJsFn)
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDuration(value: Double | (js.Function1[/* distance */ Double, Double])): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationFunction1(value: /* distance */ Double => Double): Self = StObject.set(x, "duration", js.Any.fromFunction1(value))
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEasing(value: (/* t */ Double, /* b */ Double, /* c */ Double, /* d */ Double) => Double): Self = StObject.set(x, "easing", js.Any.fromFunction4(value))
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    }
  }
  
  type TransitionFunc = js.Function4[/* t */ Double, /* b */ Double, /* c */ Double, /* d */ Double, Double]
}
