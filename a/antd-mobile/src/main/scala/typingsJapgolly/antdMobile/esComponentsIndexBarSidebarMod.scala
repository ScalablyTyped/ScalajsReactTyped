package typingsJapgolly.antdMobile

import japgolly.scalajs.react.Callback
import typingsJapgolly.antdMobile.anon.Brief
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsIndexBarSidebarMod {
  
  @JSImport("antd-mobile/es/components/index-bar/sidebar", "Sidebar")
  @js.native
  val Sidebar: FC[SidebarProps] = js.native
  
  trait SidebarProps extends StObject {
    
    var activeIndex: String | Null
    
    var indexItems: js.Array[Brief]
    
    def onActive(index: String): Unit
  }
  object SidebarProps {
    
    inline def apply(indexItems: js.Array[Brief], onActive: String => Callback): SidebarProps = {
      val __obj = js.Dynamic.literal(indexItems = indexItems.asInstanceOf[js.Any], onActive = js.Any.fromFunction1((t0: String) => onActive(t0).runNow()), activeIndex = null)
      __obj.asInstanceOf[SidebarProps]
    }
    
    extension [Self <: SidebarProps](x: Self) {
      
      inline def setActiveIndex(value: String): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
      
      inline def setActiveIndexNull: Self = StObject.set(x, "activeIndex", null)
      
      inline def setIndexItems(value: js.Array[Brief]): Self = StObject.set(x, "indexItems", value.asInstanceOf[js.Any])
      
      inline def setIndexItemsVarargs(value: Brief*): Self = StObject.set(x, "indexItems", js.Array(value*))
      
      inline def setOnActive(value: String => Callback): Self = StObject.set(x, "onActive", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
}
