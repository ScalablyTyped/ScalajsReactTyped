package typingsJapgolly.dojo.dojox.data

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/data/css.html
  *
  *
  */
trait css_ extends js.Object {
  /**
    *
    */
  var rules: js.Object
  /**
    *
    * @param initialStylesheets
    */
  def determineContext(initialStylesheets: js.Any): js.Array[_]
  /**
    *
    * @param sheet
    */
  def findStyleSheet(sheet: js.Any): js.Array[_]
  /**
    *
    * @param sheets
    */
  def findStyleSheets(sheets: js.Any): js.Array[_]
}

object css_ {
  @scala.inline
  def apply(
    determineContext: js.Any => CallbackTo[js.Array[js.Any]],
    findStyleSheet: js.Any => CallbackTo[js.Array[js.Any]],
    findStyleSheets: js.Any => CallbackTo[js.Array[js.Any]],
    rules: js.Object
  ): css_ = {
    val __obj = js.Dynamic.literal(rules = rules.asInstanceOf[js.Any])
    __obj.updateDynamic("determineContext")(js.Any.fromFunction1((t0: js.Any) => determineContext(t0).runNow()))
    __obj.updateDynamic("findStyleSheet")(js.Any.fromFunction1((t0: js.Any) => findStyleSheet(t0).runNow()))
    __obj.updateDynamic("findStyleSheets")(js.Any.fromFunction1((t0: js.Any) => findStyleSheets(t0).runNow()))
    __obj.asInstanceOf[css_]
  }
}

