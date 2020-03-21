package typingsJapgolly.mongodb.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindOperatorsOrdered extends js.Object {
  def delete(): OrderedBulkOperation
  def deleteOne(): OrderedBulkOperation
  def replaceOne(doc: js.Object): OrderedBulkOperation
  def update(doc: js.Object): OrderedBulkOperation
  def updateOne(doc: js.Object): OrderedBulkOperation
  def upsert(): FindOperatorsOrdered
}

object FindOperatorsOrdered {
  @scala.inline
  def apply(
    delete: CallbackTo[OrderedBulkOperation],
    deleteOne: CallbackTo[OrderedBulkOperation],
    replaceOne: js.Object => CallbackTo[OrderedBulkOperation],
    update: js.Object => CallbackTo[OrderedBulkOperation],
    updateOne: js.Object => CallbackTo[OrderedBulkOperation],
    upsert: CallbackTo[FindOperatorsOrdered]
  ): FindOperatorsOrdered = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(delete.toJsFn)
    __obj.updateDynamic("deleteOne")(deleteOne.toJsFn)
    __obj.updateDynamic("replaceOne")(js.Any.fromFunction1((t0: js.Object) => replaceOne(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: js.Object) => update(t0).runNow()))
    __obj.updateDynamic("updateOne")(js.Any.fromFunction1((t0: js.Object) => updateOne(t0).runNow()))
    __obj.updateDynamic("upsert")(upsert.toJsFn)
    __obj.asInstanceOf[FindOperatorsOrdered]
  }
}

