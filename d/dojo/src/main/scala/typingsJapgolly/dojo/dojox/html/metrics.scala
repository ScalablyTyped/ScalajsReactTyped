package typingsJapgolly.dojo.dojox.html

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/html/metrics.html
  *
  *
  */
trait metrics extends js.Object {
  /**
    *
    * @param recalculate
    */
  def getCachedFontMeasurements(recalculate: js.Any): js.Any
  /**
    * Returns an object that has pixel equivilents of standard font size values.
    *
    */
  def getFontMeasurements(): js.Object
  /**
    *
    */
  def getScrollbar(): js.Object
  /**
    *
    * @param text
    * @param style
    * @param className               Optional
    */
  def getTextBox(text: String, style: js.Object, className: String): Unit
  /**
    *
    */
  def initOnFontResize(): Unit
}

object metrics {
  @scala.inline
  def apply(
    getCachedFontMeasurements: js.Any => CallbackTo[js.Any],
    getFontMeasurements: CallbackTo[js.Object],
    getScrollbar: CallbackTo[js.Object],
    getTextBox: (String, js.Object, String) => Callback,
    initOnFontResize: Callback
  ): metrics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getCachedFontMeasurements")(js.Any.fromFunction1((t0: js.Any) => getCachedFontMeasurements(t0).runNow()))
    __obj.updateDynamic("getFontMeasurements")(getFontMeasurements.toJsFn)
    __obj.updateDynamic("getScrollbar")(getScrollbar.toJsFn)
    __obj.updateDynamic("getTextBox")(js.Any.fromFunction3((t0: java.lang.String, t1: js.Object, t2: java.lang.String) => getTextBox(t0, t1, t2).runNow()))
    __obj.updateDynamic("initOnFontResize")(initOnFontResize.toJsFn)
    __obj.asInstanceOf[metrics]
  }
}

