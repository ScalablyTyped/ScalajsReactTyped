package typingsJapgolly.styledComponents

import typingsJapgolly.std.TemplateStringsArray
import typingsJapgolly.styledComponents.anon.IsCss
import typingsJapgolly.styledComponents.nativeDistTypesMod.IStyledComponent
import typingsJapgolly.styledComponents.nativeDistTypesMod.Interpolation
import typingsJapgolly.styledComponents.nativeDistTypesMod.Keyframes
import typingsJapgolly.styledComponents.nativeDistTypesMod.StyleFunction
import typingsJapgolly.styledComponents.nativeDistTypesMod.StyledObject
import typingsJapgolly.styledComponents.nativeDistTypesMod.Styles
import typingsJapgolly.styledComponents.styledComponentsBooleans.`false`
import typingsJapgolly.styledComponents.styledComponentsStrings.web
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeDistConstructorsCssMod {
  
  @JSImport("styled-components/native/dist/constructors/css", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Props](styles: Styles[Props], interpolations: Interpolation[Props]*): js.UndefOr[
    String | Double | `false` | Keyframes | (IStyledComponent[web, Any, Any]) | TemplateStringsArray | StyledObject[Props] | StyleFunction[Props] | (js.Array[Interpolation[Props]] & IsCss) | Null
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(scala.List(styles.asInstanceOf[js.Any]).`++`(interpolations.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.UndefOr[
    String | Double | `false` | Keyframes | (IStyledComponent[web, Any, Any]) | TemplateStringsArray | StyledObject[Props] | StyleFunction[Props] | (js.Array[Interpolation[Props]] & IsCss) | Null
  ]]
}
