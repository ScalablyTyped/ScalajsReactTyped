package typingsJapgolly.xstate.typesMod

import typingsJapgolly.xstate.stateNodeMod.StateNode
import typingsJapgolly.xstate.xstateStrings.deep
import typingsJapgolly.xstate.xstateStrings.shallow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistoryStateNode[TContext]
  extends StateNode[TContext, js.Any, EventObject, js.Any] {
  @JSName("history")
  var history_HistoryStateNode: shallow | deep = js.native
  @JSName("target")
  var target_FHistoryStateNode: js.UndefOr[StateValue] = js.native
}

