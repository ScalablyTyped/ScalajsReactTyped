package typingsJapgolly.themeUiColorModes

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.DetailedReactHTMLElement
import typingsJapgolly.react.mod.Dispatch
import typingsJapgolly.react.mod.SetStateAction
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.themeUiColorModes.anon.Children
import typingsJapgolly.themeUiColorModes.anon.DangerouslySetInnerHTML
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcMod {
  
  @JSImport("@theme-ui/color-modes/dist/declarations/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ColorModeProvider(hasChildren: Children): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ColorModeProvider")(hasChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InitializeColorMode(): DetailedReactHTMLElement[DangerouslySetInnerHTML, HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("InitializeColorMode")().asInstanceOf[DetailedReactHTMLElement[DangerouslySetInnerHTML, HTMLElement]]
  
  inline def useColorMode[T /* <: String */](): js.Tuple2[T, Dispatch[SetStateAction[T]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useColorMode")().asInstanceOf[js.Tuple2[T, Dispatch[SetStateAction[T]]]]
  
  /* augmented module */
  object themeUiCoreAugmentingMod {
    
    trait ThemeUIContextValue extends StObject {
      
      var colorMode: js.UndefOr[String] = js.undefined
      
      var setColorMode: js.UndefOr[js.Function1[/* colorMode */ SetStateAction[js.UndefOr[String]], Unit]] = js.undefined
    }
    object ThemeUIContextValue {
      
      inline def apply(): ThemeUIContextValue = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ThemeUIContextValue]
      }
      
      extension [Self <: ThemeUIContextValue](x: Self) {
        
        inline def setColorMode(value: String): Self = StObject.set(x, "colorMode", value.asInstanceOf[js.Any])
        
        inline def setColorModeUndefined: Self = StObject.set(x, "colorMode", js.undefined)
        
        inline def setSetColorMode(value: /* colorMode */ SetStateAction[js.UndefOr[String]] => Callback): Self = StObject.set(x, "setColorMode", js.Any.fromFunction1((t0: /* colorMode */ SetStateAction[js.UndefOr[String]]) => value(t0).runNow()))
        
        inline def setSetColorModeUndefined: Self = StObject.set(x, "setColorMode", js.undefined)
      }
    }
  }
}
