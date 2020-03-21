package typingsJapgolly.dynatable.JQueryDynatable

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.dynatable.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessingIndicator extends js.Object {
  /** Insert the processing indicator inside the page */
  def attach(): Unit
  /**
    * Generate the html markup for the processing indicator
    *
    * @return A jQuery object containing the generated html
    */
  def create(): JQuery
  /** Hide the processing indicator */
  def hide(): Unit
  /** Set up the processing indicator */
  def init(): Unit
  /**
    * Position the processing indicator at the center
    *
    * @return A jQuery object containing the processing indicator
    */
  def position(): JQuery
  /** Show the processing indicator */
  def show(): Unit
}

object ProcessingIndicator {
  @scala.inline
  def apply(
    attach: Callback,
    create: CallbackTo[JQuery],
    hide: Callback,
    init: Callback,
    position: CallbackTo[JQuery],
    show: Callback
  ): ProcessingIndicator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attach")(attach.toJsFn)
    __obj.updateDynamic("create")(create.toJsFn)
    __obj.updateDynamic("hide")(hide.toJsFn)
    __obj.updateDynamic("init")(init.toJsFn)
    __obj.updateDynamic("position")(position.toJsFn)
    __obj.updateDynamic("show")(show.toJsFn)
    __obj.asInstanceOf[ProcessingIndicator]
  }
}

