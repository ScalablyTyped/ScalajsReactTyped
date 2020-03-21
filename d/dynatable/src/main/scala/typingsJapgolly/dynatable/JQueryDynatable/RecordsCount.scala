package typingsJapgolly.dynatable.JQueryDynatable

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.dynatable.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecordsCount extends js.Object {
  /** Insert the record count inside the page */
  def attach(): Unit
  /**
    * Generate the html markup for the record count
    *
    * @return A jQuery object containing the generated html
    */
  def create(): JQuery
  /** Create and init the records count */
  def init(): Unit
  /**
    * Check if recordCount feature is enabled
    *
    * @return A boolean if recordCount feature is enabled
    */
  def initOnLoad(): Boolean
}

object RecordsCount {
  @scala.inline
  def apply(attach: Callback, create: CallbackTo[JQuery], init: Callback, initOnLoad: CallbackTo[Boolean]): RecordsCount = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attach")(attach.toJsFn)
    __obj.updateDynamic("create")(create.toJsFn)
    __obj.updateDynamic("init")(init.toJsFn)
    __obj.updateDynamic("initOnLoad")(initOnLoad.toJsFn)
    __obj.asInstanceOf[RecordsCount]
  }
}

