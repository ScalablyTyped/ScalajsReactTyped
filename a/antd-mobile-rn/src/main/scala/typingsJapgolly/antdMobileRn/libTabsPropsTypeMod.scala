package typingsJapgolly.antdMobileRn

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.rmcTabs.libModelsMod.Models.TabData
import typingsJapgolly.rmcTabs.libPropsTypeMod.PropsType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTabsPropsTypeMod {
  
  trait TabsProps
    extends StObject
       with PropsType {
    
    /** render for replace the tab of tabbar. */
    var renderTab: js.UndefOr[js.Function1[/* tab */ TabData, Node]] = js.undefined
  }
  object TabsProps {
    
    inline def apply(tabs: js.Array[TabData]): TabsProps = {
      val __obj = js.Dynamic.literal(tabs = tabs.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabsProps]
    }
    
    extension [Self <: TabsProps](x: Self) {
      
      inline def setRenderTab(value: /* tab */ TabData => Node): Self = StObject.set(x, "renderTab", js.Any.fromFunction1(value))
      
      inline def setRenderTabUndefined: Self = StObject.set(x, "renderTab", js.undefined)
    }
  }
}
