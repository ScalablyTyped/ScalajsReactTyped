package typingsJapgolly.materialUiCore

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.materialUiCore.anon.ThemeTheme
import typingsJapgolly.materialUiCore.anon.`12`
import typingsJapgolly.materialUiCore.materialUiCoreStrings.className
import typingsJapgolly.materialUiCore.materialUiCoreStrings.classes
import typingsJapgolly.materialUiCore.materialUiCoreStrings.root
import typingsJapgolly.materialUiStyles.withStylesWithStylesMod.CreateCSSProperties
import typingsJapgolly.materialUiStyles.withStylesWithStylesMod.StyledComponentProps
import typingsJapgolly.materialUiStyles.withStylesWithStylesMod.WithStylesOptions
import typingsJapgolly.materialUiTypes.mod.Omit
import typingsJapgolly.react.mod.ComponentProps
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.global.JSX.LibraryManagedAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylesStyledMod {
  
  @JSImport("@material-ui/core/styles/styled", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Component /* <: ElementType */](Component: Component): ComponentCreator[Component] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(Component.asInstanceOf[js.Any]).asInstanceOf[ComponentCreator[Component]]
  
  type ComponentCreator[Component /* <: ElementType */] = js.Function2[
    /* styles */ CreateCSSProperties[js.Object] | (js.Function1[/* props */ ThemeTheme[Any] & js.Object, CreateCSSProperties[js.Object]]), 
    /* options */ js.UndefOr[WithStylesOptions[Any]], 
    ComponentType[
      (Omit[
        LibraryManagedAttributes[Component, ComponentProps[Component]], 
        classes | className
      ]) & StyledComponentProps[root] & `12` & (/* import warning: importer.ImportType#apply Failed type conversion: {} extends {  theme :any} ? @material-ui/types.@material-ui/types.Omit<{}, 'theme'> & {  theme :any | undefined} : {} */ js.Any)
    ]
  ]
  
  trait StyledProps extends StObject {
    
    var className: String
  }
  object StyledProps {
    
    inline def apply(className: String): StyledProps = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
      __obj.asInstanceOf[StyledProps]
    }
    
    extension [Self <: StyledProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    }
  }
}
