package typingsJapgolly.prosemirrorCollab

import typingsJapgolly.prosemirrorModel.mod.Schema
import typingsJapgolly.prosemirrorState.mod.EditorState
import typingsJapgolly.prosemirrorState.mod.Plugin
import typingsJapgolly.prosemirrorState.mod.Transaction
import typingsJapgolly.prosemirrorTransform.mod.Step
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-collab", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def collab(): Plugin[_, _] = js.native
  def collab(config: AnonClientID): Plugin[_, _] = js.native
  def getVersion(state: EditorState[_]): Double = js.native
  def receiveTransaction[S /* <: Schema[_, _] */](state: EditorState[S], steps: js.Array[Step[S]], clientIDs: js.Array[Double | String]): Transaction[S] = js.native
  def sendableSteps[S /* <: Schema[_, _] */](state: EditorState[S]): js.UndefOr[AnonOrigins[S] | Null] = js.native
}

