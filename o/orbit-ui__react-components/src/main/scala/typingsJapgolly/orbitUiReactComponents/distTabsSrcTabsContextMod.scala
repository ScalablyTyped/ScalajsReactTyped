package typingsJapgolly.orbitUiReactComponents

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.horizontal
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.vertical
import typingsJapgolly.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTabsSrcTabsContextMod {
  
  @JSImport("@orbit-ui/react-components/dist/tabs/src/TabsContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/tabs/src/TabsContext", "TabsContext")
  @js.native
  val TabsContext: Context[TabsContextType] = js.native
  
  inline def useTabsContext(): TabsContextType = ^.asInstanceOf[js.Dynamic].applyDynamic("useTabsContext")().asInstanceOf[TabsContextType]
  
  trait TabsContextType extends StObject {
    
    var isManual: js.UndefOr[Boolean] = js.undefined
    
    var onSelect: js.UndefOr[js.Function2[/* event */ ReactEventFrom[Element], /* key */ String, Unit]] = js.undefined
    
    var orientation: js.UndefOr[horizontal | vertical] = js.undefined
    
    var selectedKey: js.UndefOr[String] = js.undefined
  }
  object TabsContextType {
    
    inline def apply(): TabsContextType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabsContextType]
    }
    
    extension [Self <: TabsContextType](x: Self) {
      
      inline def setIsManual(value: Boolean): Self = StObject.set(x, "isManual", value.asInstanceOf[js.Any])
      
      inline def setIsManualUndefined: Self = StObject.set(x, "isManual", js.undefined)
      
      inline def setOnSelect(value: (/* event */ ReactEventFrom[Element], /* key */ String) => Callback): Self = StObject.set(x, "onSelect", js.Any.fromFunction2((t0: /* event */ ReactEventFrom[Element], t1: /* key */ String) => (value(t0, t1)).runNow()))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOrientation(value: horizontal | vertical): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setSelectedKey(value: String): Self = StObject.set(x, "selectedKey", value.asInstanceOf[js.Any])
      
      inline def setSelectedKeyUndefined: Self = StObject.set(x, "selectedKey", js.undefined)
    }
  }
}
