package typingsJapgolly.styletronReact.mod

import typingsJapgolly.react.mod.ComponentProps
import typingsJapgolly.styletronStandard.mod.StyleObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WithStyleFn extends js.Object {
  def apply[C /* <: StyletronComponent[_] */](component: C, style: StyleObject): StyletronComponent[ComponentProps[C]] = js.native
  def apply[C /* <: StyletronComponent[_] */, P /* <: js.Object */](component: C, style: js.Function1[/* props */ P, StyleObject]): StyletronComponent[ComponentProps[C] with P] = js.native
}

