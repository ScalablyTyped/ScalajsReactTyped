package typingsJapgolly.reactTimeout

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.ComponentClassP
import typingsJapgolly.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T](SourceComponent: ComponentClassP[T & js.Object]): ComponentClassP[T & js.Object] = ^.asInstanceOf[js.Dynamic].apply(SourceComponent.asInstanceOf[js.Any]).asInstanceOf[ComponentClassP[T & js.Object]]
  inline def apply[T](SourceComponent: FunctionComponent[T]): ComponentClassP[T & js.Object] = ^.asInstanceOf[js.Dynamic].apply(SourceComponent.asInstanceOf[js.Any]).asInstanceOf[ComponentClassP[T & js.Object]]
  
  @JSImport("react-timeout", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Id = Double
  
  trait ReactTimeoutProps extends StObject {
    
    var cancelAnimationFrame: js.UndefOr[js.Function1[/* id */ Id, Unit]] = js.undefined
    
    var clearImmediate: js.UndefOr[js.Function1[/* id */ Id, Unit]] = js.undefined
    
    var clearInterval: js.UndefOr[js.Function1[/* id */ Id, Unit]] = js.undefined
    
    var clearTimeout: js.UndefOr[js.Function1[/* timer */ Timer, Unit]] = js.undefined
    
    var requestAnimationFrame: js.UndefOr[js.Function1[/* callback */ js.Function1[/* repeated */ Any, Unit], Id]] = js.undefined
    
    var setImmediate: js.UndefOr[
        js.Function2[/* callback */ js.Function1[/* repeated */ Any, Unit], /* repeated */ Any, Id]
      ] = js.undefined
    
    var setInterval: js.UndefOr[
        js.Function3[
          /* callback */ js.Function1[/* repeated */ Any, Unit], 
          /* ms */ Double, 
          /* repeated */ Any, 
          Id
        ]
      ] = js.undefined
    
    var setTimeout: js.UndefOr[
        js.Function3[
          /* callback */ js.Function1[/* repeated */ Any, Unit], 
          /* ms */ Double, 
          /* repeated */ Any, 
          Timer
        ]
      ] = js.undefined
  }
  object ReactTimeoutProps {
    
    inline def apply(): ReactTimeoutProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactTimeoutProps]
    }
    
    extension [Self <: ReactTimeoutProps](x: Self) {
      
      inline def setCancelAnimationFrame(value: /* id */ Id => Callback): Self = StObject.set(x, "cancelAnimationFrame", js.Any.fromFunction1((t0: /* id */ Id) => value(t0).runNow()))
      
      inline def setCancelAnimationFrameUndefined: Self = StObject.set(x, "cancelAnimationFrame", js.undefined)
      
      inline def setClearImmediate(value: /* id */ Id => Callback): Self = StObject.set(x, "clearImmediate", js.Any.fromFunction1((t0: /* id */ Id) => value(t0).runNow()))
      
      inline def setClearImmediateUndefined: Self = StObject.set(x, "clearImmediate", js.undefined)
      
      inline def setClearInterval(value: /* id */ Id => Callback): Self = StObject.set(x, "clearInterval", js.Any.fromFunction1((t0: /* id */ Id) => value(t0).runNow()))
      
      inline def setClearIntervalUndefined: Self = StObject.set(x, "clearInterval", js.undefined)
      
      inline def setClearTimeout(value: /* timer */ Timer => Callback): Self = StObject.set(x, "clearTimeout", js.Any.fromFunction1((t0: /* timer */ Timer) => value(t0).runNow()))
      
      inline def setClearTimeoutUndefined: Self = StObject.set(x, "clearTimeout", js.undefined)
      
      inline def setRequestAnimationFrame(value: /* callback */ js.Function1[/* repeated */ Any, Unit] => Id): Self = StObject.set(x, "requestAnimationFrame", js.Any.fromFunction1(value))
      
      inline def setRequestAnimationFrameUndefined: Self = StObject.set(x, "requestAnimationFrame", js.undefined)
      
      inline def setSetImmediate(value: (/* callback */ js.Function1[/* repeated */ Any, Unit], /* repeated */ Any) => Id): Self = StObject.set(x, "setImmediate", js.Any.fromFunction2(value))
      
      inline def setSetImmediateUndefined: Self = StObject.set(x, "setImmediate", js.undefined)
      
      inline def setSetInterval(
        value: (/* callback */ js.Function1[/* repeated */ Any, Unit], /* ms */ Double, /* repeated */ Any) => Id
      ): Self = StObject.set(x, "setInterval", js.Any.fromFunction3(value))
      
      inline def setSetIntervalUndefined: Self = StObject.set(x, "setInterval", js.undefined)
      
      inline def setSetTimeout(
        value: (/* callback */ js.Function1[/* repeated */ Any, Unit], /* ms */ Double, /* repeated */ Any) => Timer
      ): Self = StObject.set(x, "setTimeout", js.Any.fromFunction3(value))
      
      inline def setSetTimeoutUndefined: Self = StObject.set(x, "setTimeout", js.undefined)
    }
  }
  
  type Timer = typingsJapgolly.node.timersMod.global.NodeJS.Timer | Double
}
