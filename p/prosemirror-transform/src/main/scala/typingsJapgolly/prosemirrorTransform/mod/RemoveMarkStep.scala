package typingsJapgolly.prosemirrorTransform.mod

import typingsJapgolly.prosemirrorModel.mod.Mark
import typingsJapgolly.prosemirrorModel.mod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-transform", "RemoveMarkStep")
@js.native
class RemoveMarkStep[S /* <: Schema[_, _] */] protected () extends Step[S] {
  def this(from: Double, to: Double, mark: Mark[S]) = this()
}

