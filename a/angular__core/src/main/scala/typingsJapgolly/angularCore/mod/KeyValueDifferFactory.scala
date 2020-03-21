package typingsJapgolly.angularCore.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyValueDifferFactory extends js.Object {
  /**
    * Create a `KeyValueDiffer`.
    */
  def create[K, V](): KeyValueDiffer[K, V]
  /**
    * Test to see if the differ knows how to diff this kind of object.
    */
  def supports(objects: js.Any): Boolean
}

object KeyValueDifferFactory {
  @scala.inline
  def apply(create: CallbackTo[KeyValueDiffer[js.Any, js.Any]], supports: js.Any => CallbackTo[Boolean]): KeyValueDifferFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(create.toJsFn)
    __obj.updateDynamic("supports")(js.Any.fromFunction1((t0: js.Any) => supports(t0).runNow()))
    __obj.asInstanceOf[KeyValueDifferFactory]
  }
}

