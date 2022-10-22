package typingsJapgolly.materialUiStyles

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.materialUiStyles.anon.ClassName
import typingsJapgolly.materialUiStyles.anon.ThemeTheme
import typingsJapgolly.materialUiStyles.defaultThemeMod.DefaultTheme
import typingsJapgolly.materialUiStyles.materialUiStylesStrings.className
import typingsJapgolly.materialUiStyles.materialUiStylesStrings.classes
import typingsJapgolly.materialUiStyles.materialUiStylesStrings.root
import typingsJapgolly.materialUiStyles.withStylesWithStylesMod.CreateCSSProperties
import typingsJapgolly.materialUiStyles.withStylesWithStylesMod.StyledComponentProps
import typingsJapgolly.materialUiStyles.withStylesWithStylesMod.WithStylesOptions
import typingsJapgolly.materialUiTypes.mod.Omit
import typingsJapgolly.materialUiTypes.mod.Overwrite
import typingsJapgolly.react.mod.ComponentProps
import typingsJapgolly.react.mod.ComponentPropsWithoutRef
import typingsJapgolly.react.mod.global.JSX.LibraryManagedAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styledStyledMod {
  
  @JSImport("@material-ui/styles/styled/styled", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Component /* <: ElementType */](Component: Component): ComponentCreator[Component] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(Component.asInstanceOf[js.Any]).asInstanceOf[ComponentCreator[Component]]
  
  type ComponentCreator[Component /* <: ElementType */] = js.Function2[
    /* styles */ CreateCSSProperties[ComponentPropsWithoutRef[Component]] | (js.Function1[
      /* props */ ThemeTheme[DefaultTheme] & ComponentPropsWithoutRef[Component], 
      CreateCSSProperties[ComponentPropsWithoutRef[Component]]
    ]), 
    /* options */ js.UndefOr[WithStylesOptions[DefaultTheme]], 
    StyledComponent[
      (Omit[
        LibraryManagedAttributes[Component, ComponentProps[Component]], 
        classes | className
      ]) & StyledComponentProps[root] & (Overwrite[ComponentPropsWithoutRef[Component], ClassName[DefaultTheme]])
    ]
  ]
  
  type StyledComponent[P /* <: js.Object */] = js.Function1[/* props */ P, Element | Null]
  
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
