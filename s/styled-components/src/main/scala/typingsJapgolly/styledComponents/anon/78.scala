package typingsJapgolly.styledComponents.anon

import typingsJapgolly.std.ReturnType
import typingsJapgolly.styledComponents.nativeDistDistTypesMod.Interpolation
import typingsJapgolly.styledComponents.nativeDistDistTypesMod.Styles
import typingsJapgolly.styledComponents.styledComponentsStrings.native
import typingsJapgolly.styledComponents.styledComponentsStrings.web
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `78`[OuterProps, Environment /* <: web | native */, // used for styled<{}>().attrs() so attrs() gets the generic prop context
OuterStatics] extends StObject {
  
  def apply[Props, Statics](initialStyles: Styles[OuterProps & Props], interpolations: (Interpolation[OuterProps & Props])*): ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: Environment extends 'web' ? styled-components.styled-components/native/dist/dist/types.IStyledComponentFactory<'s', OuterProps & Props, OuterStatics & Statics> : styled-components.styled-components/native/dist/dist/types.IStyledNativeComponentFactory<'s', OuterProps & Props, OuterStatics & Statics> */ js.Any
  ] = js.native
  
  def attrs(attrs: typingsJapgolly.styledComponents.nativeDistDistTypesMod.Attrs[OuterProps]): Any = js.native
  
  /**
    * If config methods are called, wrap up a new template function and merge options */
  @JSName("withConfig")
  def withConfig_web(
    config: /* import warning: importer.ImportType#apply Failed type conversion: Environment extends 'web' ? styled-components.styled-components/native/dist/dist/types.StyledOptions<OuterProps> : styled-components.styled-components/native/dist/dist/types.StyledNativeOptions<OuterProps> */ js.Any
  ): Any = js.native
}
