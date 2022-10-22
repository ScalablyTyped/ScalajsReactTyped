package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.HTMLLIElement
import org.scalajs.dom.HTMLUListElement
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.FC
import typingsJapgolly.typeZoo.mod.Omit
import typingsJapgolly.wixUiCore.distEsSrcComponentsHorizontalMenuHorizontalMenuItemHorizontalMenuItemMod.ExpandSize
import typingsJapgolly.wixUiCore.wixUiCoreStrings.menuItemContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsHorizontalMenuHorizontalMenuItemHorizontalMenuItemContextMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/horizontal-menu/horizontal-menu-item/HorizontalMenuItemContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-ui-core/dist/es/src/components/horizontal-menu/horizontal-menu-item/HorizontalMenuItemContext", "HorizontalMenuItemContext")
  @js.native
  val HorizontalMenuItemContext: Context[HorizontalMenuItemContextValue] = js.native
  
  inline def withHorizontalMenuItemContext[P /* <: WithHorizontalMenuItemContextProps */](WrappedComponent: ComponentType[P]): FC[Omit[P, menuItemContext]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withHorizontalMenuItemContext")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[FC[Omit[P, menuItemContext]]]
  
  trait HorizontalMenuItemContextValue extends StObject {
    
    var expandSize: js.UndefOr[ExpandSize] = js.undefined
    
    var isOpen: Boolean
    
    var menuItemRef: RefHandle[HTMLLIElement]
    
    var rootMenuRef: RefHandle[HTMLUListElement]
  }
  object HorizontalMenuItemContextValue {
    
    inline def apply(isOpen: Boolean, menuItemRef: RefHandle[HTMLLIElement], rootMenuRef: RefHandle[HTMLUListElement]): HorizontalMenuItemContextValue = {
      val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any], menuItemRef = menuItemRef.asInstanceOf[js.Any], rootMenuRef = rootMenuRef.asInstanceOf[js.Any])
      __obj.asInstanceOf[HorizontalMenuItemContextValue]
    }
    
    extension [Self <: HorizontalMenuItemContextValue](x: Self) {
      
      inline def setExpandSize(value: ExpandSize): Self = StObject.set(x, "expandSize", value.asInstanceOf[js.Any])
      
      inline def setExpandSizeUndefined: Self = StObject.set(x, "expandSize", js.undefined)
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setMenuItemRef(value: RefHandle[HTMLLIElement]): Self = StObject.set(x, "menuItemRef", value.asInstanceOf[js.Any])
      
      inline def setRootMenuRef(value: RefHandle[HTMLUListElement]): Self = StObject.set(x, "rootMenuRef", value.asInstanceOf[js.Any])
    }
  }
  
  trait WithHorizontalMenuItemContextProps extends StObject {
    
    var menuItemContext: HorizontalMenuItemContextValue
  }
  object WithHorizontalMenuItemContextProps {
    
    inline def apply(menuItemContext: HorizontalMenuItemContextValue): WithHorizontalMenuItemContextProps = {
      val __obj = js.Dynamic.literal(menuItemContext = menuItemContext.asInstanceOf[js.Any])
      __obj.asInstanceOf[WithHorizontalMenuItemContextProps]
    }
    
    extension [Self <: WithHorizontalMenuItemContextProps](x: Self) {
      
      inline def setMenuItemContext(value: HorizontalMenuItemContextValue): Self = StObject.set(x, "menuItemContext", value.asInstanceOf[js.Any])
    }
  }
}
