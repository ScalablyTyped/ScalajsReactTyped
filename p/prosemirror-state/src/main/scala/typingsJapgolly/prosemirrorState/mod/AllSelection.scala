package typingsJapgolly.prosemirrorState.mod

import typingsJapgolly.prosemirrorModel.mod.Node
import typingsJapgolly.prosemirrorModel.mod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-state", "AllSelection")
@js.native
class AllSelection[S /* <: Schema[_, _] */] protected () extends Selection[S] {
  /**
    * Create an all-selection over the given document.
    */
  def this(doc: Node[S]) = this()
}

