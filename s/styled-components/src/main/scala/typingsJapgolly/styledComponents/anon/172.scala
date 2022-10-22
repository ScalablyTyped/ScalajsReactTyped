package typingsJapgolly.styledComponents.anon

import typingsJapgolly.styledComponents.nativeDistTypesMod.IStyledComponent
import typingsJapgolly.styledComponents.nativeDistTypesMod.Interpolation
import typingsJapgolly.styledComponents.nativeDistTypesMod.StyledOptions
import typingsJapgolly.styledComponents.nativeDistTypesMod.Styles
import typingsJapgolly.styledComponents.nativeDistTypesMod.WebTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `172`[Target /* <: WebTarget */] extends StObject {
  
  def apply[Props, Statics](initialStyles: Styles[Props], interpolations: Interpolation[Props]*): (IStyledComponent[Target, Props, js.Object]) & Statics = js.native
  
  def attrs(attrs: typingsJapgolly.styledComponents.nativeDistTypesMod.Attrs[Any]): Any = js.native
  
  def withConfig(
    config: StyledOptions[
      Any, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Props */ Any
    ]
  ): Any = js.native
}
