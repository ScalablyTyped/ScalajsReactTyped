package typingsJapgolly.dynatable.JQueryDynatable

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationPage extends js.Object {
  /** Parse the current window.location in order to determine the target page */
  def init(): Unit
  /**
    * Check if the paginate feature is enabled in `settings.features`
    *
    * @return A boolean
    */
  def initOnLoad(): Boolean
  /**
    * Set the page in the dataset
    *
    * @param page The new page number
    */
  def set(page: Double): Unit
}

object PaginationPage {
  @scala.inline
  def apply(init: Callback, initOnLoad: CallbackTo[Boolean], set: Double => Callback): PaginationPage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("init")(init.toJsFn)
    __obj.updateDynamic("initOnLoad")(initOnLoad.toJsFn)
    __obj.updateDynamic("set")(js.Any.fromFunction1((t0: scala.Double) => set(t0).runNow()))
    __obj.asInstanceOf[PaginationPage]
  }
}

