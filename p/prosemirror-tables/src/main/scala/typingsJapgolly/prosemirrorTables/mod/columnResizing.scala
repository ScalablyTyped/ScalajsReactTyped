package typingsJapgolly.prosemirrorTables.mod

import typingsJapgolly.prosemirrorModel.mod.Schema
import typingsJapgolly.prosemirrorState.mod.Plugin
import typingsJapgolly.prosemirrorTables.AnonCellMinWidth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-tables", "columnResizing")
@js.native
object columnResizing extends js.Object {
  def apply[S /* <: Schema[_, _] */](props: AnonCellMinWidth[S]): Plugin[S, _] = js.native
}

