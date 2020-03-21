package typingsJapgolly.relayRuntime.relayStoreTypesMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.relayRuntime.normalizationNodeMod.NormalizationSplitOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationLoader extends js.Object {
  /**
    * Synchronously load an operation, returning either the node or null if it
    * cannot be resolved synchronously.
    */
  def get(reference: js.Any): js.UndefOr[NormalizationSplitOperation | Null]
  /**
    * Asynchronously load an operation.
    */
  def load(reference: js.Any): js.Promise[js.UndefOr[NormalizationSplitOperation | Null]]
}

object OperationLoader {
  @scala.inline
  def apply(
    get: js.Any => CallbackTo[js.UndefOr[NormalizationSplitOperation | Null]],
    load: js.Any => CallbackTo[js.Promise[js.UndefOr[NormalizationSplitOperation | Null]]]
  ): OperationLoader = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: js.Any) => get(t0).runNow()))
    __obj.updateDynamic("load")(js.Any.fromFunction1((t0: js.Any) => load(t0).runNow()))
    __obj.asInstanceOf[OperationLoader]
  }
}

