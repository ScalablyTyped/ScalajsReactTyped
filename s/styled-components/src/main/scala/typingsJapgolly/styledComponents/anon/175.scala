package typingsJapgolly.styledComponents.anon

import typingsJapgolly.styledComponents.nativeDistDistTypesMod.IStyledNativeComponent
import typingsJapgolly.styledComponents.nativeDistDistTypesMod.StyledNativeOptions
import typingsJapgolly.styledComponents.nativeDistTypesMod.Interpolation
import typingsJapgolly.styledComponents.nativeDistTypesMod.NativeTarget
import typingsJapgolly.styledComponents.nativeDistTypesMod.Styles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `175`[Target /* <: NativeTarget */] extends StObject {
  
  def apply[Props, Statics](initialStyles: Styles[Props], interpolations: Interpolation[Props]*): (IStyledNativeComponent[Target, Props]) & Statics = js.native
  
  def attrs(attrs: typingsJapgolly.styledComponents.nativeDistTypesMod.Attrs[Any]): Any = js.native
  
  def withConfig(config: StyledNativeOptions[Any]): Any = js.native
}
