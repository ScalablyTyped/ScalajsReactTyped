package typingsJapgolly.prosemirrorTables.mod

import typingsJapgolly.prosemirrorModel.mod.Schema
import typingsJapgolly.prosemirrorState.mod.EditorState
import typingsJapgolly.prosemirrorState.mod.Transaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-tables", "goToNextCell")
@js.native
object goToNextCell extends js.Object {
  def apply[S /* <: Schema[_, _] */](direction: Double): js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = js.native
}

