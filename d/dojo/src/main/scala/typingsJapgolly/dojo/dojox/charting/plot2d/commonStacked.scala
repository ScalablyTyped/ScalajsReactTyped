package typingsJapgolly.dojo.dojox.charting.plot2d

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/charting/plot2d/commonStacked.html
  *
  *
  */
trait commonStacked extends js.Object {
  /**
    *
    * @param series
    */
  def collectStats(series: js.Any): js.Any
  /**
    *
    * @param series
    * @param i
    * @param index
    */
  def getIndexValue(series: js.Any, i: js.Any, index: js.Any): js.Array[_]
  /**
    *
    * @param series
    * @param i
    * @param x
    */
  def getValue(series: js.Any, i: js.Any, x: js.Any): js.Array[_]
}

object commonStacked {
  @scala.inline
  def apply(
    collectStats: js.Any => CallbackTo[js.Any],
    getIndexValue: (js.Any, js.Any, js.Any) => CallbackTo[js.Array[js.Any]],
    getValue: (js.Any, js.Any, js.Any) => CallbackTo[js.Array[js.Any]]
  ): commonStacked = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("collectStats")(js.Any.fromFunction1((t0: js.Any) => collectStats(t0).runNow()))
    __obj.updateDynamic("getIndexValue")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Any) => getIndexValue(t0, t1, t2).runNow()))
    __obj.updateDynamic("getValue")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Any) => getValue(t0, t1, t2).runNow()))
    __obj.asInstanceOf[commonStacked]
  }
}

