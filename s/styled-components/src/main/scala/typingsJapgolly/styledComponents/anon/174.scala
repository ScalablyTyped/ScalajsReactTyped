package typingsJapgolly.styledComponents.anon

import typingsJapgolly.styledComponents.nativeDistTypesMod.ExecutionContext
import typingsJapgolly.styledComponents.nativeDistTypesMod.ExtensibleObject
import typingsJapgolly.styledComponents.nativeDistTypesMod.IStyledComponent
import typingsJapgolly.styledComponents.nativeDistTypesMod.Interpolation
import typingsJapgolly.styledComponents.nativeDistTypesMod.NativeTarget
import typingsJapgolly.styledComponents.nativeDistTypesMod.StyledOptions
import typingsJapgolly.styledComponents.nativeDistTypesMod.Styles
import typingsJapgolly.styledComponents.styledComponentsStrings.native
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `174`[Target /* <: NativeTarget */] extends StObject {
  
  def apply[Props /* <: js.Object */, Statics](
    initialStyles: Styles[
      (/* import warning: importer.ImportType#apply Failed type conversion: Target extends styled-components.styled-components/native/dist/types.KnownTarget ? react.react.ComponentProps<Target> : unknown */ js.Any) & Props
    ],
    interpolations: (Interpolation[
      ExecutionContext & (/* import warning: importer.ImportType#apply Failed type conversion: Target extends styled-components.styled-components/native/dist/types.KnownTarget ? react.react.ComponentProps<Target> : unknown */ js.Any) & Props
    ])*
  ): (IStyledComponent[
    native, 
    Target, 
    (/* import warning: importer.ImportType#apply Failed type conversion: Target extends styled-components.styled-components/native/dist/types.KnownTarget ? react.react.ComponentProps<Target> : unknown */ js.Any) & Props
  ]) & Statics = js.native
  
  def attrs(
    attrs: typingsJapgolly.styledComponents.nativeDistTypesMod.Attrs[
      ExtensibleObject & (/* import warning: importer.ImportType#apply Failed type conversion: Target extends styled-components.styled-components/native/dist/types.KnownTarget ? react.react.ComponentProps<Target> : unknown */ js.Any)
    ]
  ): Any = js.native
  
  @JSName("withConfig")
  def withConfig_native(
    config: StyledOptions[
      native, 
      /* import warning: importer.ImportType#apply Failed type conversion: Target extends styled-components.styled-components/native/dist/types.KnownTarget ? react.react.ComponentProps<Target> : unknown */ js.Any
    ]
  ): Any = js.native
}
