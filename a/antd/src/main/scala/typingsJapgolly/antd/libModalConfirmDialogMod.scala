package typingsJapgolly.antd

import japgolly.scalajs.react.Callback
import typingsJapgolly.antd.libModalModalMod.ModalFuncProps
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModalConfirmDialogMod {
  
  @JSImport("antd/lib/modal/ConfirmDialog", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: ConfirmDialogProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait ConfirmDialogProps
    extends StObject
       with ModalFuncProps {
    
    def close(args: Any*): Unit
    
    var iconPrefixCls: js.UndefOr[String] = js.undefined
    
    var rootPrefixCls: String
  }
  object ConfirmDialogProps {
    
    inline def apply(close: /* repeated */ Any => Callback, rootPrefixCls: String): ConfirmDialogProps = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction1((t0: /* repeated */ Any) => close(t0).runNow()), rootPrefixCls = rootPrefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfirmDialogProps]
    }
    
    extension [Self <: ConfirmDialogProps](x: Self) {
      
      inline def setClose(value: /* repeated */ Any => Callback): Self = StObject.set(x, "close", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
      
      inline def setIconPrefixCls(value: String): Self = StObject.set(x, "iconPrefixCls", value.asInstanceOf[js.Any])
      
      inline def setIconPrefixClsUndefined: Self = StObject.set(x, "iconPrefixCls", js.undefined)
      
      inline def setRootPrefixCls(value: String): Self = StObject.set(x, "rootPrefixCls", value.asInstanceOf[js.Any])
    }
  }
}
