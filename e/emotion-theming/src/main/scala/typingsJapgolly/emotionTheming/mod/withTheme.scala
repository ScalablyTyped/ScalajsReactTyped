package typingsJapgolly.emotionTheming.mod

import typingsJapgolly.emotionTheming.emotionThemingStrings.theme
import typingsJapgolly.emotionTheming.helperMod.AddOptionalTo
import typingsJapgolly.emotionTheming.helperMod.PropsOf
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.SFC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("emotion-theming", "withTheme")
@js.native
object withTheme extends js.Object {
  def apply[C /* <: ComponentType[_] */](component: C): SFC[AddOptionalTo[PropsOf[C], theme]] = js.native
}

