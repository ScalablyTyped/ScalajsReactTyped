package typingsJapgolly.mongodb.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindOperatorsUnordered extends js.Object {
  var length: scala.Double
  def remove(): UnorderedBulkOperation
  def removeOne(): UnorderedBulkOperation
  def replaceOne(doc: js.Object): UnorderedBulkOperation
  def update(doc: js.Object): UnorderedBulkOperation
  def updateOne(doc: js.Object): UnorderedBulkOperation
  def upsert(): FindOperatorsUnordered
}

object FindOperatorsUnordered {
  @scala.inline
  def apply(
    length: scala.Double,
    remove: CallbackTo[UnorderedBulkOperation],
    removeOne: CallbackTo[UnorderedBulkOperation],
    replaceOne: js.Object => CallbackTo[UnorderedBulkOperation],
    update: js.Object => CallbackTo[UnorderedBulkOperation],
    updateOne: js.Object => CallbackTo[UnorderedBulkOperation],
    upsert: CallbackTo[FindOperatorsUnordered]
  ): FindOperatorsUnordered = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    __obj.updateDynamic("remove")(remove.toJsFn)
    __obj.updateDynamic("removeOne")(removeOne.toJsFn)
    __obj.updateDynamic("replaceOne")(js.Any.fromFunction1((t0: js.Object) => replaceOne(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: js.Object) => update(t0).runNow()))
    __obj.updateDynamic("updateOne")(js.Any.fromFunction1((t0: js.Object) => updateOne(t0).runNow()))
    __obj.updateDynamic("upsert")(upsert.toJsFn)
    __obj.asInstanceOf[FindOperatorsUnordered]
  }
}

