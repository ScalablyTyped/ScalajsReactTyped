package typingsJapgolly.pdfjsDist.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFDataRangeTransport extends js.Object {
  def abort(): Unit
  def addProgressListener(listener: PDFDataRangeTransportListener): Unit
  def addProgressiveDoneListener(listener: PDFDataRangeTransportListener): Unit
  def addProgressiveReadListener(listener: PDFDataRangeTransportListener): Unit
  def addRangeListener(listener: PDFDataRangeTransportListener): Unit
  def onDataProgress(loaded: Double, total: Double): Unit
  def onDataProgressiveDone(): Unit
  def onDataProgressiveRead(chunk: js.Any): Unit
  def onDataRange(begin: Double, chunk: js.Any): Unit
  def requestDataRange(begin: Double, end: Double): Unit
  def transportReady(): Unit
}

object PDFDataRangeTransport {
  @scala.inline
  def apply(
    abort: Callback,
    addProgressListener: PDFDataRangeTransportListener => Callback,
    addProgressiveDoneListener: PDFDataRangeTransportListener => Callback,
    addProgressiveReadListener: PDFDataRangeTransportListener => Callback,
    addRangeListener: PDFDataRangeTransportListener => Callback,
    onDataProgress: (Double, Double) => Callback,
    onDataProgressiveDone: Callback,
    onDataProgressiveRead: js.Any => Callback,
    onDataRange: (Double, js.Any) => Callback,
    requestDataRange: (Double, Double) => Callback,
    transportReady: Callback
  ): PDFDataRangeTransport = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("abort")(abort.toJsFn)
    __obj.updateDynamic("addProgressListener")(js.Any.fromFunction1((t0: typingsJapgolly.pdfjsDist.mod.PDFDataRangeTransportListener) => addProgressListener(t0).runNow()))
    __obj.updateDynamic("addProgressiveDoneListener")(js.Any.fromFunction1((t0: typingsJapgolly.pdfjsDist.mod.PDFDataRangeTransportListener) => addProgressiveDoneListener(t0).runNow()))
    __obj.updateDynamic("addProgressiveReadListener")(js.Any.fromFunction1((t0: typingsJapgolly.pdfjsDist.mod.PDFDataRangeTransportListener) => addProgressiveReadListener(t0).runNow()))
    __obj.updateDynamic("addRangeListener")(js.Any.fromFunction1((t0: typingsJapgolly.pdfjsDist.mod.PDFDataRangeTransportListener) => addRangeListener(t0).runNow()))
    __obj.updateDynamic("onDataProgress")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => onDataProgress(t0, t1).runNow()))
    __obj.updateDynamic("onDataProgressiveDone")(onDataProgressiveDone.toJsFn)
    __obj.updateDynamic("onDataProgressiveRead")(js.Any.fromFunction1((t0: js.Any) => onDataProgressiveRead(t0).runNow()))
    __obj.updateDynamic("onDataRange")(js.Any.fromFunction2((t0: scala.Double, t1: js.Any) => onDataRange(t0, t1).runNow()))
    __obj.updateDynamic("requestDataRange")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => requestDataRange(t0, t1).runNow()))
    __obj.updateDynamic("transportReady")(transportReady.toJsFn)
    __obj.asInstanceOf[PDFDataRangeTransport]
  }
}

