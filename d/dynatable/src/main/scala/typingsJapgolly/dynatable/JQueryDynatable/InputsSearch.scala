package typingsJapgolly.dynatable.JQueryDynatable

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.dynatable.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputsSearch extends js.Object {
  /** Inject the search form at the target location */
  def attach(): Unit
  /**
    * Build the html markup for the search form
    *
    * @return The jQuery object for the search form
    */
  def create(): JQuery
  /** Call the `attach()` method */
  def init(): Unit
  /**
    * Check if the search feature is enabled in `settings.features`
    *
    * @return A boolean
    */
  def initOnLoad(): Boolean
}

object InputsSearch {
  @scala.inline
  def apply(attach: Callback, create: CallbackTo[JQuery], init: Callback, initOnLoad: CallbackTo[Boolean]): InputsSearch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attach")(attach.toJsFn)
    __obj.updateDynamic("create")(create.toJsFn)
    __obj.updateDynamic("init")(init.toJsFn)
    __obj.updateDynamic("initOnLoad")(initOnLoad.toJsFn)
    __obj.asInstanceOf[InputsSearch]
  }
}

