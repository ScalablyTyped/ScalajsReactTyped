package typingsJapgolly.mongodb.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BulkWriteResult extends js.Object {
  var nInserted: scala.Double
  var nModified: scala.Double
  var nRemoved: scala.Double
  var nUpdated: scala.Double
  var nUpserted: scala.Double
  var ok: scala.Double
  def getInsertedIds(): js.Array[js.Object]
  def getLastOp(): js.Object
  def getRawResponse(): js.Object
  def getUpsertedIdAt(index: scala.Double): BulkWriteResultUpsertedIdObject
  def getUpsertedIds(): js.Array[BulkWriteResultUpsertedIdObject]
  def getWriteConcernError(): WriteConcernError
  def getWriteErrorAt(index: scala.Double): WriteError
  def getWriteErrorCount(): scala.Double
  def getWriteErrors(): js.Array[js.Object]
  def hasWriteErrors(): Boolean
}

object BulkWriteResult {
  @scala.inline
  def apply(
    getInsertedIds: CallbackTo[js.Array[js.Object]],
    getLastOp: CallbackTo[js.Object],
    getRawResponse: CallbackTo[js.Object],
    getUpsertedIdAt: scala.Double => CallbackTo[BulkWriteResultUpsertedIdObject],
    getUpsertedIds: CallbackTo[js.Array[BulkWriteResultUpsertedIdObject]],
    getWriteConcernError: CallbackTo[WriteConcernError],
    getWriteErrorAt: scala.Double => CallbackTo[WriteError],
    getWriteErrorCount: CallbackTo[scala.Double],
    getWriteErrors: CallbackTo[js.Array[js.Object]],
    hasWriteErrors: CallbackTo[Boolean],
    nInserted: scala.Double,
    nModified: scala.Double,
    nRemoved: scala.Double,
    nUpdated: scala.Double,
    nUpserted: scala.Double,
    ok: scala.Double
  ): BulkWriteResult = {
    val __obj = js.Dynamic.literal(nInserted = nInserted.asInstanceOf[js.Any], nModified = nModified.asInstanceOf[js.Any], nRemoved = nRemoved.asInstanceOf[js.Any], nUpdated = nUpdated.asInstanceOf[js.Any], nUpserted = nUpserted.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any])
    __obj.updateDynamic("getInsertedIds")(getInsertedIds.toJsFn)
    __obj.updateDynamic("getLastOp")(getLastOp.toJsFn)
    __obj.updateDynamic("getRawResponse")(getRawResponse.toJsFn)
    __obj.updateDynamic("getUpsertedIdAt")(js.Any.fromFunction1((t0: scala.Double) => getUpsertedIdAt(t0).runNow()))
    __obj.updateDynamic("getUpsertedIds")(getUpsertedIds.toJsFn)
    __obj.updateDynamic("getWriteConcernError")(getWriteConcernError.toJsFn)
    __obj.updateDynamic("getWriteErrorAt")(js.Any.fromFunction1((t0: scala.Double) => getWriteErrorAt(t0).runNow()))
    __obj.updateDynamic("getWriteErrorCount")(getWriteErrorCount.toJsFn)
    __obj.updateDynamic("getWriteErrors")(getWriteErrors.toJsFn)
    __obj.updateDynamic("hasWriteErrors")(hasWriteErrors.toJsFn)
    __obj.asInstanceOf[BulkWriteResult]
  }
}

