package typingsJapgolly.rcTabs

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.rcTabs.esInterfaceMod.Tab
import typingsJapgolly.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTabContextMod extends Shortcut {
  
  @JSImport("rc-tabs/es/TabContext", JSImport.Default)
  @js.native
  val default: Context[TabContextProps] = js.native
  
  trait TabContextProps extends StObject {
    
    var prefixCls: String
    
    var tabs: js.Array[Tab]
  }
  object TabContextProps {
    
    inline def apply(prefixCls: String, tabs: js.Array[Tab]): TabContextProps = {
      val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabContextProps]
    }
    
    extension [Self <: TabContextProps](x: Self) {
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setTabs(value: js.Array[Tab]): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
      
      inline def setTabsVarargs(value: Tab*): Self = StObject.set(x, "tabs", js.Array(value*))
    }
  }
  
  type _To = Context[TabContextProps]
  
  /* This means you don't have to write `default`, but can instead just say `esTabContextMod.foo` */
  override def _to: Context[TabContextProps] = default
}
