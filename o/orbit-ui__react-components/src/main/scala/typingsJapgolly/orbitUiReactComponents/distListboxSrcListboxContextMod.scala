package typingsJapgolly.orbitUiReactComponents

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.orbitUiReactComponents.distSharedMod.FocusManager
import typingsJapgolly.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distListboxSrcListboxContextMod {
  
  @JSImport("@orbit-ui/react-components/dist/listbox/src/ListboxContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/listbox/src/ListboxContext", "ListboxContext")
  @js.native
  val ListboxContext: Context[ListboxContextType] = js.native
  
  inline def useListboxContext(): ListboxContextType = ^.asInstanceOf[js.Dynamic].applyDynamic("useListboxContext")().asInstanceOf[ListboxContextType]
  
  trait ListboxContextType extends StObject {
    
    var focusManager: js.UndefOr[FocusManager] = js.undefined
    
    var focusOnHover: js.UndefOr[Boolean] = js.undefined
    
    var onFocus: js.UndefOr[
        js.Function3[
          /* event */ ReactEventFrom[Element], 
          /* key */ String, 
          /* activeElement */ HTMLElement, 
          Unit
        ]
      ] = js.undefined
    
    var onSelect: js.UndefOr[js.Function2[/* event */ ReactEventFrom[Element], /* key */ String, Unit]] = js.undefined
    
    var selectedKeys: js.UndefOr[js.Array[String]] = js.undefined
  }
  object ListboxContextType {
    
    inline def apply(): ListboxContextType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListboxContextType]
    }
    
    extension [Self <: ListboxContextType](x: Self) {
      
      inline def setFocusManager(value: FocusManager): Self = StObject.set(x, "focusManager", value.asInstanceOf[js.Any])
      
      inline def setFocusManagerUndefined: Self = StObject.set(x, "focusManager", js.undefined)
      
      inline def setFocusOnHover(value: Boolean): Self = StObject.set(x, "focusOnHover", value.asInstanceOf[js.Any])
      
      inline def setFocusOnHoverUndefined: Self = StObject.set(x, "focusOnHover", js.undefined)
      
      inline def setOnFocus(
        value: (/* event */ ReactEventFrom[Element], /* key */ String, /* activeElement */ HTMLElement) => Callback
      ): Self = StObject.set(x, "onFocus", js.Any.fromFunction3((t0: /* event */ ReactEventFrom[Element], t1: /* key */ String, t2: /* activeElement */ HTMLElement) => (value(t0, t1, t2)).runNow()))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnSelect(value: (/* event */ ReactEventFrom[Element], /* key */ String) => Callback): Self = StObject.set(x, "onSelect", js.Any.fromFunction2((t0: /* event */ ReactEventFrom[Element], t1: /* key */ String) => (value(t0, t1)).runNow()))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setSelectedKeys(value: js.Array[String]): Self = StObject.set(x, "selectedKeys", value.asInstanceOf[js.Any])
      
      inline def setSelectedKeysUndefined: Self = StObject.set(x, "selectedKeys", js.undefined)
      
      inline def setSelectedKeysVarargs(value: String*): Self = StObject.set(x, "selectedKeys", js.Array(value*))
    }
  }
}
