package typingsJapgolly.themeUiCore

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.react.anon.Children
import typingsJapgolly.react.mod.ExoticComponent
import typingsJapgolly.themeUiCore.distDeclarationsSrcJsxNamespaceMod.ThemeUIJSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcJsxRuntimeMod {
  
  @JSImport("@theme-ui/core/dist/declarations/src/jsx-runtime", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@theme-ui/core/dist/declarations/src/jsx-runtime", "Fragment")
  @js.native
  val Fragment: ExoticComponent[Children] = js.native
  
  inline def jsx[P](`type`: ElementType, props: P): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def jsx[P](`type`: ElementType, props: P, key: String): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Element]
  
  inline def jsxs[P](`type`: ElementType, props: P): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("jsxs")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def jsxs[P](`type`: ElementType, props: P, key: String): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("jsxs")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Element]
}
