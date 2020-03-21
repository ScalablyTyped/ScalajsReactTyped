package typingsJapgolly.prosemirrorTables.mod

import typingsJapgolly.prosemirrorModel.mod.ResolvedPos
import typingsJapgolly.prosemirrorModel.mod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-tables", "nextCell")
@js.native
object nextCell extends js.Object {
  def apply[S /* <: Schema[_, _] */](pos: ResolvedPos[S], axis: String, dir: Double): Null | ResolvedPos[S] = js.native
}

