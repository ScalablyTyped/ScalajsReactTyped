package typingsJapgolly.antDesignPro

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCountDownMod {
  
  @JSImport("ant-design-pro/lib/CountDown", JSImport.Default)
  @js.native
  open class default () extends Component[ICountDownProps, Any, Any]
  
  type CountDown = japgolly.scalajs.react.facade.React.Component[ICountDownProps & js.Object, js.Object]
  
  trait ICountDownProps extends StObject {
    
    var format: js.UndefOr[js.Function1[/* time */ Double, Unit]] = js.undefined
    
    var onEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var target: js.Date | Double
  }
  object ICountDownProps {
    
    inline def apply(target: js.Date | Double): ICountDownProps = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICountDownProps]
    }
    
    extension [Self <: ICountDownProps](x: Self) {
      
      inline def setFormat(value: /* time */ Double => Callback): Self = StObject.set(x, "format", js.Any.fromFunction1((t0: /* time */ Double) => value(t0).runNow()))
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setOnEnd(value: Callback): Self = StObject.set(x, "onEnd", value.toJsFn)
      
      inline def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTarget(value: js.Date | Double): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
