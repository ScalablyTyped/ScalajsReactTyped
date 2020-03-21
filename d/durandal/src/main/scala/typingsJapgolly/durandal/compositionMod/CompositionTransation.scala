package typingsJapgolly.durandal.compositionMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompositionTransation extends js.Object {
  /**
    * Registers a callback which will be invoked when the current composition transaction has completed. The transaction includes all parent and children compositions.
    * @param {function} callback The callback to be invoked when composition is complete.
    */
  def complete(callback: js.Function): Unit
}

object CompositionTransation {
  @scala.inline
  def apply(complete: js.Function => Callback): CompositionTransation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: js.Function) => complete(t0).runNow()))
    __obj.asInstanceOf[CompositionTransation]
  }
}

