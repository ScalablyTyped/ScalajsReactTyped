package typingsJapgolly.baseui.mod

import typingsJapgolly.baseui.AnonClassName
import typingsJapgolly.baseui.AnonTheme
import typingsJapgolly.baseui.baseuiStrings.blockquote
import typingsJapgolly.react.mod.ComponentProps
import typingsJapgolly.std.Exclude
import typingsJapgolly.std.Pick
import typingsJapgolly.styletronReact.mod.StyletronComponent
import typingsJapgolly.styletronStandard.mod.StyleObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui", "styled")
@js.native
object styled_blockquote extends js.Object {
  def apply[P /* <: js.Object */, T](component: blockquote, styledFn: js.Function1[/* props */ AnonTheme[T] with P, StyleObject]): StyletronComponent[(Pick[ComponentProps[blockquote], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */, T](component: blockquote, styledFn: StyleObject): StyletronComponent[(Pick[ComponentProps[blockquote], Exclude[String, AnonClassName]]) with P] = js.native
}

