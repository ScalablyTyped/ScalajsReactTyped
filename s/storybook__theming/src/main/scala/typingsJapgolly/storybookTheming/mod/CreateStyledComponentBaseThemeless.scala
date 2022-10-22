package typingsJapgolly.storybookTheming.mod

import typingsJapgolly.std.TemplateStringsArray
import typingsJapgolly.storybookTheming.`distTs3Dot9Modules@emotionReactNodeModules@emotionSerializeTypesIndexMod`.Interpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateStyledComponentBaseThemeless[InnerProps, ExtraProps] extends StObject {
  
  def apply[StyleProps /* <: DistributiveOmit[Overwrapped[InnerProps, StyleProps], ReactClassPropKeys] */, Theme /* <: js.Object */](styles: (Interpolation[WithTheme_[StyleProps, Theme]])*): StyledComponent[InnerProps, StyleProps, Theme] = js.native
  def apply[StyleProps /* <: DistributiveOmit[Overwrapped[InnerProps, StyleProps], ReactClassPropKeys] */, Theme /* <: js.Object */](template: TemplateStringsArray, styles: (Interpolation[WithTheme_[StyleProps, Theme]])*): StyledComponent[InnerProps, StyleProps, Theme] = js.native
}
