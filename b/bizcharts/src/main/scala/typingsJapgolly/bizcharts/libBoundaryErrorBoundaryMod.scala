package typingsJapgolly.bizcharts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.bizcharts.anon.ComponentStack
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBoundaryErrorBoundaryMod {
  
  @JSImport("bizcharts/lib/boundary/ErrorBoundary", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ErrorFallback(args: Any): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ErrorFallback")(args.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def setDefaultErrorFallback(CustComponents: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultErrorFallback")(CustComponents.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait ErrorBoundaryProps
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var fallback: js.UndefOr[japgolly.scalajs.react.facade.React.Element | Null] = js.undefined
    
    var onError: js.UndefOr[js.Function2[/* error */ js.Error, /* info */ ComponentStack, Unit]] = js.undefined
    
    var onReset: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onResetKeysChange: js.UndefOr[
        js.Function2[/* prevResetKeys */ js.Array[Any], /* resetKeys */ js.Array[Any], Unit]
      ] = js.undefined
    
    var resetKeys: js.UndefOr[js.Array[Any]] = js.undefined
  }
  object ErrorBoundaryProps {
    
    inline def apply(): ErrorBoundaryProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorBoundaryProps]
    }
    
    extension [Self <: ErrorBoundaryProps](x: Self) {
      
      inline def setFallback(value: VdomElement): Self = StObject.set(x, "fallback", value.rawElement.asInstanceOf[js.Any])
      
      inline def setFallbackNull: Self = StObject.set(x, "fallback", null)
      
      inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      inline def setOnError(value: (/* error */ js.Error, /* info */ ComponentStack) => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction2((t0: /* error */ js.Error, t1: /* info */ ComponentStack) => (value(t0, t1)).runNow()))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnReset(value: Callback): Self = StObject.set(x, "onReset", value.toJsFn)
      
      inline def setOnResetKeysChange(value: (/* prevResetKeys */ js.Array[Any], /* resetKeys */ js.Array[Any]) => Callback): Self = StObject.set(x, "onResetKeysChange", js.Any.fromFunction2((t0: /* prevResetKeys */ js.Array[Any], t1: /* resetKeys */ js.Array[Any]) => (value(t0, t1)).runNow()))
      
      inline def setOnResetKeysChangeUndefined: Self = StObject.set(x, "onResetKeysChange", js.undefined)
      
      inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      inline def setResetKeys(value: js.Array[Any]): Self = StObject.set(x, "resetKeys", value.asInstanceOf[js.Any])
      
      inline def setResetKeysUndefined: Self = StObject.set(x, "resetKeys", js.undefined)
      
      inline def setResetKeysVarargs(value: Any*): Self = StObject.set(x, "resetKeys", js.Array(value*))
    }
  }
}
