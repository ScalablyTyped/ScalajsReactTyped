package typingsJapgolly.antd

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTransferSearchMod {
  
  @JSImport("antd/lib/transfer/search", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: TransferSearchProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait TransferSearchProps extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var handleClear: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* e */ ReactEventFrom[HTMLElement], Unit]] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[String] = js.undefined
  }
  object TransferSearchProps {
    
    inline def apply(): TransferSearchProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransferSearchProps]
    }
    
    extension [Self <: TransferSearchProps](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setHandleClear(value: Callback): Self = StObject.set(x, "handleClear", value.toJsFn)
      
      inline def setHandleClearUndefined: Self = StObject.set(x, "handleClear", js.undefined)
      
      inline def setOnChange(value: /* e */ ReactEventFrom[HTMLElement] => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* e */ ReactEventFrom[HTMLElement]) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
