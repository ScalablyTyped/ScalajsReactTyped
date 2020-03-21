package typingsJapgolly.baseui.mod

import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.baseui.AnonClassName
import typingsJapgolly.baseui.AnonTheme
import typingsJapgolly.react.mod.ComponentProps
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.std.Exclude
import typingsJapgolly.std.Pick
import typingsJapgolly.styletronReact.mod.StyletronComponent
import typingsJapgolly.styletronStandard.mod.StyleObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui", "styled")
@js.native
object styled extends js.Object {
  def apply[P /* <: js.Object */, C /* <: ComponentClassP[js.Object] | FunctionComponent[_] */, T](component: C, styledFn: js.Function1[/* props */ AnonTheme[T] with P, StyleObject]): StyletronComponent[(Pick[ComponentProps[C], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */, C /* <: ComponentClassP[js.Object] | FunctionComponent[_] */, T](component: C, styledFn: StyleObject): StyletronComponent[(Pick[ComponentProps[C], Exclude[String, AnonClassName]]) with P] = js.native
}

