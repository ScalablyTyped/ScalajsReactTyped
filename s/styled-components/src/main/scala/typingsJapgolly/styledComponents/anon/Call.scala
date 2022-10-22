package typingsJapgolly.styledComponents.anon

import typingsJapgolly.styledComponents.nativeDistTypesMod.ExecutionContext
import typingsJapgolly.styledComponents.nativeDistTypesMod.ExtensibleObject
import typingsJapgolly.styledComponents.nativeDistTypesMod.IStyledComponent
import typingsJapgolly.styledComponents.nativeDistTypesMod.Interpolation
import typingsJapgolly.styledComponents.nativeDistTypesMod.Runtime
import typingsJapgolly.styledComponents.nativeDistTypesMod.StyledOptions
import typingsJapgolly.styledComponents.nativeDistTypesMod.StyledTarget
import typingsJapgolly.styledComponents.nativeDistTypesMod.Styles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Call[DerivedProps, OuterProps, R /* <: Runtime */, Target /* <: StyledTarget[R] */, // used for styled<{}>().attrs() so attrs() gets the generic prop context
OuterStatics] extends StObject {
  
  def apply[Props /* <: js.Object */, Statics](
    initialStyles: Styles[DerivedProps & OuterProps & Props],
    interpolations: (Interpolation[ExecutionContext & DerivedProps & OuterProps & Props])*
  ): (IStyledComponent[R, Target, DerivedProps & OuterProps & Props]) & OuterStatics & Statics = js.native
  
  def attrs(
    attrs: typingsJapgolly.styledComponents.nativeDistTypesMod.Attrs[ExtensibleObject & DerivedProps & OuterProps]
  ): Any = js.native
  
  /**
    * If config methods are called, wrap up a new template function and merge options */
  def withConfig(config: StyledOptions[R, DerivedProps & OuterProps]): Any = js.native
}
