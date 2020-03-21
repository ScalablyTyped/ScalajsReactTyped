package typingsJapgolly.jspdf

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCollections extends js.Object {
  var collections: js.Any
  var events: js.Any
  var pageSize: AnonGetHeight
  var pages: js.Array[Double]
  var scaleFactor: Double
  def f2(number: Double): Double
  def getCoordinateString(value: Double): Double
  def getCurrentPageInfo(): js.Any
  def getFont(): js.Any
  def getFontSize(): Double
  def getLineHeight(): Double
  def getNumberOfPages(): Double
  def getPageInfo(pageNumberOneBased: Double): js.Any
  def getStyle(style: String): js.Any
  def getVerticalCoordinateString(value: Double): Double
  def newAdditionalObject(): js.Any
  def newObject(): Double
  def newObjectDeferred(): Double
  def newObjectDeferredBegin(oid: Double): Unit
  def out(string: String): Unit
  def output(`type`: js.Any, options: js.Any): js.Any
  def pdfEscape(text: String, flags: js.Any): js.Any
  def putStream(str: String): Unit
  def write(string1: String): js.Any
}

object AnonCollections {
  @scala.inline
  def apply(
    collections: js.Any,
    events: js.Any,
    f2: Double => CallbackTo[Double],
    getCoordinateString: Double => CallbackTo[Double],
    getCurrentPageInfo: CallbackTo[js.Any],
    getFont: CallbackTo[js.Any],
    getFontSize: CallbackTo[Double],
    getLineHeight: CallbackTo[Double],
    getNumberOfPages: CallbackTo[Double],
    getPageInfo: Double => CallbackTo[js.Any],
    getStyle: String => CallbackTo[js.Any],
    getVerticalCoordinateString: Double => CallbackTo[Double],
    newAdditionalObject: CallbackTo[js.Any],
    newObject: CallbackTo[Double],
    newObjectDeferred: CallbackTo[Double],
    newObjectDeferredBegin: Double => Callback,
    out: String => Callback,
    output: (js.Any, js.Any) => CallbackTo[js.Any],
    pageSize: AnonGetHeight,
    pages: js.Array[Double],
    pdfEscape: (String, js.Any) => CallbackTo[js.Any],
    putStream: String => Callback,
    scaleFactor: Double,
    write: String => CallbackTo[js.Any]
  ): AnonCollections = {
    val __obj = js.Dynamic.literal(collections = collections.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], pageSize = pageSize.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], scaleFactor = scaleFactor.asInstanceOf[js.Any])
    __obj.updateDynamic("f2")(js.Any.fromFunction1((t0: scala.Double) => f2(t0).runNow()))
    __obj.updateDynamic("getCoordinateString")(js.Any.fromFunction1((t0: scala.Double) => getCoordinateString(t0).runNow()))
    __obj.updateDynamic("getCurrentPageInfo")(getCurrentPageInfo.toJsFn)
    __obj.updateDynamic("getFont")(getFont.toJsFn)
    __obj.updateDynamic("getFontSize")(getFontSize.toJsFn)
    __obj.updateDynamic("getLineHeight")(getLineHeight.toJsFn)
    __obj.updateDynamic("getNumberOfPages")(getNumberOfPages.toJsFn)
    __obj.updateDynamic("getPageInfo")(js.Any.fromFunction1((t0: scala.Double) => getPageInfo(t0).runNow()))
    __obj.updateDynamic("getStyle")(js.Any.fromFunction1((t0: java.lang.String) => getStyle(t0).runNow()))
    __obj.updateDynamic("getVerticalCoordinateString")(js.Any.fromFunction1((t0: scala.Double) => getVerticalCoordinateString(t0).runNow()))
    __obj.updateDynamic("newAdditionalObject")(newAdditionalObject.toJsFn)
    __obj.updateDynamic("newObject")(newObject.toJsFn)
    __obj.updateDynamic("newObjectDeferred")(newObjectDeferred.toJsFn)
    __obj.updateDynamic("newObjectDeferredBegin")(js.Any.fromFunction1((t0: scala.Double) => newObjectDeferredBegin(t0).runNow()))
    __obj.updateDynamic("out")(js.Any.fromFunction1((t0: java.lang.String) => out(t0).runNow()))
    __obj.updateDynamic("output")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => output(t0, t1).runNow()))
    __obj.updateDynamic("pdfEscape")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => pdfEscape(t0, t1).runNow()))
    __obj.updateDynamic("putStream")(js.Any.fromFunction1((t0: java.lang.String) => putStream(t0).runNow()))
    __obj.updateDynamic("write")(js.Any.fromFunction1((t0: java.lang.String) => write(t0).runNow()))
    __obj.asInstanceOf[AnonCollections]
  }
}

