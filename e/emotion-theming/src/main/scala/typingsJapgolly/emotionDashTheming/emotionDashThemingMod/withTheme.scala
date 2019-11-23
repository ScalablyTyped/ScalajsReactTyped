package typingsJapgolly.emotionDashTheming.emotionDashThemingMod

import typingsJapgolly.emotionDashTheming.emotionDashThemingStrings.theme
import typingsJapgolly.emotionDashTheming.typesHelperMod.AddOptionalTo
import typingsJapgolly.emotionDashTheming.typesHelperMod.PropsOf
import typingsJapgolly.react.reactMod.ComponentType
import typingsJapgolly.react.reactMod.SFC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("emotion-theming", "withTheme")
@js.native
object withTheme extends js.Object {
  def apply[C /* <: ComponentType[_] */](component: C): SFC[AddOptionalTo[PropsOf[C], theme]] = js.native
}

