package typingsJapgolly.xstate.scxmlMod

import typingsJapgolly.xstate.mod.StateNode
import typingsJapgolly.xstate.typesMod.EventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/lib/scxml", "toMachine")
@js.native
object toMachine extends js.Object {
  def apply(xml: String, options: ScxmlToMachineOptions): StateNode[_, _, EventObject, _] = js.native
}

