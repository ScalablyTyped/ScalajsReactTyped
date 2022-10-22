package typingsJapgolly.antDesignIcons

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.antDesignIcons.anon.Nonce
import typingsJapgolly.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsContextMod extends Shortcut {
  
  @JSImport("@ant-design/icons/es/components/Context", JSImport.Default)
  @js.native
  val default: Context[IconContextProps] = js.native
  
  trait IconContextProps extends StObject {
    
    var csp: js.UndefOr[Nonce] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
  }
  object IconContextProps {
    
    inline def apply(): IconContextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IconContextProps]
    }
    
    extension [Self <: IconContextProps](x: Self) {
      
      inline def setCsp(value: Nonce): Self = StObject.set(x, "csp", value.asInstanceOf[js.Any])
      
      inline def setCspUndefined: Self = StObject.set(x, "csp", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    }
  }
  
  type _To = Context[IconContextProps]
  
  /* This means you don't have to write `default`, but can instead just say `esComponentsContextMod.foo` */
  override def _to: Context[IconContextProps] = default
}
