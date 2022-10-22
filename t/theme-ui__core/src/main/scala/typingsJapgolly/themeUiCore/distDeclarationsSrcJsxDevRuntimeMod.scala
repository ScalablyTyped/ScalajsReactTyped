package typingsJapgolly.themeUiCore

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.react.anon.Children
import typingsJapgolly.react.mod.ExoticComponent
import typingsJapgolly.themeUiCore.anon.ColumnNumber
import typingsJapgolly.themeUiCore.distDeclarationsSrcJsxNamespaceMod.ThemeUIJSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcJsxDevRuntimeMod {
  
  @JSImport("@theme-ui/core/dist/declarations/src/jsx-dev-runtime", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@theme-ui/core/dist/declarations/src/jsx-dev-runtime", "Fragment")
  @js.native
  val Fragment: ExoticComponent[Children] = js.native
  
  inline def jsxDEV[P](
    `type`: ElementType,
    props: P,
    key: String,
    isStaticChildren: Boolean,
    source: ColumnNumber,
    self: Any
  ): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("jsxDEV")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], key.asInstanceOf[js.Any], isStaticChildren.asInstanceOf[js.Any], source.asInstanceOf[js.Any], self.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def jsxDEV[P](
    `type`: ElementType,
    props: P,
    key: Unit,
    isStaticChildren: Boolean,
    source: ColumnNumber,
    self: Any
  ): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("jsxDEV")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], key.asInstanceOf[js.Any], isStaticChildren.asInstanceOf[js.Any], source.asInstanceOf[js.Any], self.asInstanceOf[js.Any])).asInstanceOf[Element]
}
