package typingsJapgolly.antdMobile

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilsRenderImperativelyMod {
  
  @JSImport("antd-mobile/es/utils/render-imperatively", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def renderImperatively(element: Element): ImperativeHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("renderImperatively")(element.asInstanceOf[js.Any]).asInstanceOf[ImperativeHandler]
  
  trait ImperativeHandler extends StObject {
    
    def close(): Unit
    
    def replace(element: Element): Unit
  }
  object ImperativeHandler {
    
    inline def apply(close: Callback, replace: Element => Callback): ImperativeHandler = {
      val __obj = js.Dynamic.literal(close = close.toJsFn, replace = js.Any.fromFunction1((t0: Element) => replace(t0).runNow()))
      __obj.asInstanceOf[ImperativeHandler]
    }
    
    extension [Self <: ImperativeHandler](x: Self) {
      
      inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
      
      inline def setReplace(value: Element => Callback): Self = StObject.set(x, "replace", js.Any.fromFunction1((t0: Element) => value(t0).runNow()))
    }
  }
  
  trait ImperativeProps extends StObject {
    
    var afterClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object ImperativeProps {
    
    inline def apply(): ImperativeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImperativeProps]
    }
    
    extension [Self <: ImperativeProps](x: Self) {
      
      inline def setAfterClose(value: Callback): Self = StObject.set(x, "afterClose", value.toJsFn)
      
      inline def setAfterCloseUndefined: Self = StObject.set(x, "afterClose", js.undefined)
      
      inline def setOnClose(value: Callback): Self = StObject.set(x, "onClose", value.toJsFn)
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  type TargetElement = Element
}
