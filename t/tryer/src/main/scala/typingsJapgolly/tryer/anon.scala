package typingsJapgolly.tryer

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Readonly<tryer.tryer.Options> */
  trait ReadonlyOptions extends StObject {
    
    val action: js.UndefOr[
        js.Function0[js.Promise[Any]] | (js.Function1[/* done */ js.Function0[Unit], Any])
      ] = js.undefined
    
    val fail: js.UndefOr[js.Function1[/* err */ js.Error, Unit]] = js.undefined
    
    val interval: js.UndefOr[Double] = js.undefined
    
    val limit: js.UndefOr[Double] = js.undefined
    
    val pass: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    val until: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    val when: js.UndefOr[js.Function0[Boolean]] = js.undefined
  }
  object ReadonlyOptions {
    
    inline def apply(): ReadonlyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyOptions]
    }
    
    extension [Self <: ReadonlyOptions](x: Self) {
      
      inline def setAction(value: js.Function0[js.Promise[Any]] | (js.Function1[/* done */ js.Function0[Unit], Any])): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionCallbackTo(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "action", value.toJsFn)
      
      inline def setActionFunction1(value: /* done */ js.Function0[Unit] => Any): Self = StObject.set(x, "action", js.Any.fromFunction1(value))
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setFail(value: /* err */ js.Error => Callback): Self = StObject.set(x, "fail", js.Any.fromFunction1((t0: /* err */ js.Error) => value(t0).runNow()))
      
      inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPass(value: Callback): Self = StObject.set(x, "pass", value.toJsFn)
      
      inline def setPassUndefined: Self = StObject.set(x, "pass", js.undefined)
      
      inline def setUntil(value: CallbackTo[Boolean]): Self = StObject.set(x, "until", value.toJsFn)
      
      inline def setUntilUndefined: Self = StObject.set(x, "until", js.undefined)
      
      inline def setWhen(value: CallbackTo[Boolean]): Self = StObject.set(x, "when", value.toJsFn)
      
      inline def setWhenUndefined: Self = StObject.set(x, "when", js.undefined)
    }
  }
}
