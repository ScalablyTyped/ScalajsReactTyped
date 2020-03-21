package typingsJapgolly.prosemirrorState.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.prosemirrorModel.mod.Node
import typingsJapgolly.prosemirrorModel.mod.Schema
import typingsJapgolly.prosemirrorTransform.mod.Mapping
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionBookmark[S /* <: Schema[_, _] */] extends js.Object {
  /**
    * Map the bookmark through a set of changes.
    */
  def map(mapping: Mapping): SelectionBookmark[S]
  /**
    * Resolve the bookmark to a real selection again. This may need to
    * do some error checking and may fall back to a default (usually
    * [`TextSelection.between`](#state.TextSelection^between)) if
    * mapping made the bookmark invalid.
    */
  def resolve(doc: Node[S]): Selection[S]
}

object SelectionBookmark {
  @scala.inline
  def apply[S /* <: Schema[_, _] */](map: Mapping => CallbackTo[SelectionBookmark[S]], resolve: Node[S] => CallbackTo[Selection[S]]): SelectionBookmark[S] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("map")(js.Any.fromFunction1((t0: typingsJapgolly.prosemirrorTransform.mod.Mapping) => map(t0).runNow()))
    __obj.updateDynamic("resolve")(js.Any.fromFunction1((t0: typingsJapgolly.prosemirrorModel.mod.Node[S]) => resolve(t0).runNow()))
    __obj.asInstanceOf[SelectionBookmark[S]]
  }
}

