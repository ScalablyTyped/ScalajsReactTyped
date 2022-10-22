package typingsJapgolly.reactTreat

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcMod {
  
  @JSImport("react-treat/dist/declarations/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def TreatProvider(hasThemeChildren: TreatProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("TreatProvider")(hasThemeChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useClassName(
    classRef: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ClassRef */ Any
  ): String = ^.asInstanceOf[js.Dynamic].applyDynamic("useClassName")(classRef.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def useStyles[UserStyles /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreatModule */ Any */](styles: UserStyles): UserStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("useStyles")(styles.asInstanceOf[js.Any]).asInstanceOf[UserStyles]
  
  inline def useTheme(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("useTheme")().asInstanceOf[String]
  
  trait TreatProviderProps extends StObject {
    
    var children: Node
    
    var theme: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeRef */ Any
  }
  object TreatProviderProps {
    
    inline def apply(
      theme: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeRef */ Any
    ): TreatProviderProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any], children = null)
      __obj.asInstanceOf[TreatProviderProps]
    }
    
    extension [Self <: TreatProviderProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTheme(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeRef */ Any
      ): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
}
