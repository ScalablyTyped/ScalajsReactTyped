package typingsJapgolly.orbitUiReactComponents

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.orbitUiReactComponents.distMenuSrcMenuMod.SelectionMode
import typingsJapgolly.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMenuSrcMenuContextMod {
  
  @JSImport("@orbit-ui/react-components/dist/menu/src/MenuContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/menu/src/MenuContext", "MenuContext")
  @js.native
  val MenuContext: Context[MenuContextType] = js.native
  
  inline def useMenuContext(): MenuContextType = ^.asInstanceOf[js.Dynamic].applyDynamic("useMenuContext")().asInstanceOf[MenuContextType]
  
  trait MenuContextType extends StObject {
    
    var onSelect: js.UndefOr[js.Function2[/* event */ ReactEventFrom[Element], /* key */ String, Unit]] = js.undefined
    
    var selectedKeys: js.UndefOr[js.Array[String]] = js.undefined
    
    var selectionMode: js.UndefOr[SelectionMode] = js.undefined
  }
  object MenuContextType {
    
    inline def apply(): MenuContextType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuContextType]
    }
    
    extension [Self <: MenuContextType](x: Self) {
      
      inline def setOnSelect(value: (/* event */ ReactEventFrom[Element], /* key */ String) => Callback): Self = StObject.set(x, "onSelect", js.Any.fromFunction2((t0: /* event */ ReactEventFrom[Element], t1: /* key */ String) => (value(t0, t1)).runNow()))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setSelectedKeys(value: js.Array[String]): Self = StObject.set(x, "selectedKeys", value.asInstanceOf[js.Any])
      
      inline def setSelectedKeysUndefined: Self = StObject.set(x, "selectedKeys", js.undefined)
      
      inline def setSelectedKeysVarargs(value: String*): Self = StObject.set(x, "selectedKeys", js.Array(value*))
      
      inline def setSelectionMode(value: SelectionMode): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
      
      inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
    }
  }
}
