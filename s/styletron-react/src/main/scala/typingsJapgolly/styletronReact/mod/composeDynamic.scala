package typingsJapgolly.styletronReact.mod

import typingsJapgolly.styletronStandard.mod.StyleObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("styletron-react", "composeDynamic")
@js.native
object composeDynamic extends js.Object {
  def apply(
    styletron: Styletron,
    reducer: js.Function2[/* style */ StyleObject, /* props */ js.Object, StyleObject]
  ): Styletron = js.native
}

