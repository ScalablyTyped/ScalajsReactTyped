package typingsJapgolly.storybookTheming.mod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.raw.React.Ref
import typingsJapgolly.emotionUtils.mod.EmotionCache
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.SFC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/theming", "withEmotionCache")
@js.native
object withEmotionCache extends js.Object {
  def apply[Props, RefType](func: js.Function3[/* props */ Props, /* context */ EmotionCache, /* ref */ Ref, Node]): SFC[Props with ClassAttributes[RefType]] = js.native
}

