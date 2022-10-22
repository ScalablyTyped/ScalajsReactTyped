package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.HTMLUListElement
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.FC
import typingsJapgolly.typeZoo.mod.Omit
import typingsJapgolly.wixUiCore.wixUiCoreStrings.menuContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsHorizontalMenuHorizontalMenuContextMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/horizontal-menu/HorizontalMenuContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-ui-core/dist/es/src/components/horizontal-menu/HorizontalMenuContext", "HorizontalMenuContext")
  @js.native
  val HorizontalMenuContext: Context[HorizontalMenuContextValue] = js.native
  
  inline def withHorizontalMenuContext[P /* <: WithHorizontalMenuContextProps */](WrappedComponent: ComponentType[P]): FC[Omit[P, menuContext]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withHorizontalMenuContext")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[FC[Omit[P, menuContext]]]
  
  trait HorizontalMenuContextValue extends StObject {
    
    var columnsLayoutClassName: String
    
    var gridLayoutClassName: String
    
    var menuItemClassName: String
    
    var rootMenuRef: RefHandle[HTMLUListElement]
  }
  object HorizontalMenuContextValue {
    
    inline def apply(
      columnsLayoutClassName: String,
      gridLayoutClassName: String,
      menuItemClassName: String,
      rootMenuRef: RefHandle[HTMLUListElement]
    ): HorizontalMenuContextValue = {
      val __obj = js.Dynamic.literal(columnsLayoutClassName = columnsLayoutClassName.asInstanceOf[js.Any], gridLayoutClassName = gridLayoutClassName.asInstanceOf[js.Any], menuItemClassName = menuItemClassName.asInstanceOf[js.Any], rootMenuRef = rootMenuRef.asInstanceOf[js.Any])
      __obj.asInstanceOf[HorizontalMenuContextValue]
    }
    
    extension [Self <: HorizontalMenuContextValue](x: Self) {
      
      inline def setColumnsLayoutClassName(value: String): Self = StObject.set(x, "columnsLayoutClassName", value.asInstanceOf[js.Any])
      
      inline def setGridLayoutClassName(value: String): Self = StObject.set(x, "gridLayoutClassName", value.asInstanceOf[js.Any])
      
      inline def setMenuItemClassName(value: String): Self = StObject.set(x, "menuItemClassName", value.asInstanceOf[js.Any])
      
      inline def setRootMenuRef(value: RefHandle[HTMLUListElement]): Self = StObject.set(x, "rootMenuRef", value.asInstanceOf[js.Any])
    }
  }
  
  trait WithHorizontalMenuContextProps extends StObject {
    
    var menuContext: HorizontalMenuContextValue
  }
  object WithHorizontalMenuContextProps {
    
    inline def apply(menuContext: HorizontalMenuContextValue): WithHorizontalMenuContextProps = {
      val __obj = js.Dynamic.literal(menuContext = menuContext.asInstanceOf[js.Any])
      __obj.asInstanceOf[WithHorizontalMenuContextProps]
    }
    
    extension [Self <: WithHorizontalMenuContextProps](x: Self) {
      
      inline def setMenuContext(value: HorizontalMenuContextValue): Self = StObject.set(x, "menuContext", value.asInstanceOf[js.Any])
    }
  }
}
