package typingsJapgolly.atEmotionStyledDashBase.atEmotionStyledDashBaseMod

import typingsJapgolly.atEmotionSerialize.atEmotionSerializeMod.Interpolation
import typingsJapgolly.atEmotionStyledDashBase.typesHelperMod.Omit
import typingsJapgolly.atEmotionStyledDashBase.typesHelperMod.Overwrapped
import typingsJapgolly.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateStyledComponentBaseThemed[InnerProps, ExtraProps, StyledInstanceTheme /* <: js.Object */] extends CreateStyledComponentBase[InnerProps, ExtraProps, StyledInstanceTheme] {
  def apply[StyleProps /* <: Omit[Overwrapped[InnerProps, StyleProps], ReactClassPropKeys] */](styles: (Interpolation[WithTheme[StyleProps, StyledInstanceTheme]])*): StyledComponent[InnerProps, StyleProps, StyledInstanceTheme] = js.native
  def apply[StyleProps /* <: Omit[Overwrapped[InnerProps, StyleProps], ReactClassPropKeys] */](
    template: TemplateStringsArray,
    styles: (Interpolation[WithTheme[StyleProps, StyledInstanceTheme]])*
  ): StyledComponent[InnerProps, StyleProps, StyledInstanceTheme] = js.native
}

