package typingsJapgolly.jsmediatags.chunkedFileDataMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jsmediatags.AnonEndIx
import typingsJapgolly.jsmediatags.typesMod.DataType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChunkedFileData extends js.Object {
  def _concatData(dataA: DataType, dataB: DataType): DataType
  def _getChunkRange(offsetStart: Double, offsetEnd: Double): AnonEndIx
  def _sliceData(data: DataType, begin: Double, end: Double): DataType
  def addData(offset: Double, data: DataType): Unit
  def getByteAt(offset: Double): js.Any
  def hasDataRange(offsetStart: Double, offsetEnd: Double): Boolean
}

object ChunkedFileData {
  @scala.inline
  def apply(
    _concatData: (DataType, DataType) => CallbackTo[DataType],
    _getChunkRange: (Double, Double) => CallbackTo[AnonEndIx],
    _sliceData: (DataType, Double, Double) => CallbackTo[DataType],
    addData: (Double, DataType) => Callback,
    getByteAt: Double => CallbackTo[js.Any],
    hasDataRange: (Double, Double) => CallbackTo[Boolean]
  ): ChunkedFileData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_concatData")(js.Any.fromFunction2((t0: typingsJapgolly.jsmediatags.typesMod.DataType, t1: typingsJapgolly.jsmediatags.typesMod.DataType) => _concatData(t0, t1).runNow()))
    __obj.updateDynamic("_getChunkRange")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => _getChunkRange(t0, t1).runNow()))
    __obj.updateDynamic("_sliceData")(js.Any.fromFunction3((t0: typingsJapgolly.jsmediatags.typesMod.DataType, t1: scala.Double, t2: scala.Double) => _sliceData(t0, t1, t2).runNow()))
    __obj.updateDynamic("addData")(js.Any.fromFunction2((t0: scala.Double, t1: typingsJapgolly.jsmediatags.typesMod.DataType) => addData(t0, t1).runNow()))
    __obj.updateDynamic("getByteAt")(js.Any.fromFunction1((t0: scala.Double) => getByteAt(t0).runNow()))
    __obj.updateDynamic("hasDataRange")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => hasDataRange(t0, t1).runNow()))
    __obj.asInstanceOf[ChunkedFileData]
  }
}

