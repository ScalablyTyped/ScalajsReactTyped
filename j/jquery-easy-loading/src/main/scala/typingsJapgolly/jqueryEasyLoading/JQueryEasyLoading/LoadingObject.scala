package typingsJapgolly.jqueryEasyLoading.JQueryEasyLoading

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jqueryEasyLoading.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadingObject extends js.Object {
  /**
    * Check whether the loading state is active or not
    *
    * @return {Boolean}
    */
  def active(): Boolean
  /**
    * Attach some internal methods to external events
    * e.g. overlay click, window resize etc
    */
  def attachMethodsToExternalEvents(): Unit
  /**
    * Attach the handlers defined on `options` for the respective events
    */
  def attachOptionsHandlers(): Unit
  /**
    * Calculate the z-index for the default overlay element
    * Return the z-index passed as setting to the plugin or calculate it
    * based on the target's z-index
    */
  def calcZIndex(): Double
  /**
    * Return a new default overlay
    *
    * @return {jQuery} A new overlay already appended to the page's body
    */
  def createOerlay(): JQuery
  /**
    * Initializes the overlay and attach handlers to the appropriate events
    */
  def init(): Unit
  /**
    * Reposition the overlay on the top of the target element
    * This method needs to be called if the target element changes position
    *  or dimension
    */
  def resize(): Unit
  /**
    * Trigger the `loading.start` event and turn on the loading state
    */
  def start(): Unit
  /**
    * Trigger the `loading.stop` event and turn off the loading state
    */
  def stop(): Unit
  /**
    * Toggle the state of the loading overlay
    */
  def toggle(): Unit
}

object LoadingObject {
  @scala.inline
  def apply(
    active: CallbackTo[Boolean],
    attachMethodsToExternalEvents: Callback,
    attachOptionsHandlers: Callback,
    calcZIndex: CallbackTo[Double],
    createOerlay: CallbackTo[JQuery],
    init: Callback,
    resize: Callback,
    start: Callback,
    stop: Callback,
    toggle: Callback
  ): LoadingObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("active")(active.toJsFn)
    __obj.updateDynamic("attachMethodsToExternalEvents")(attachMethodsToExternalEvents.toJsFn)
    __obj.updateDynamic("attachOptionsHandlers")(attachOptionsHandlers.toJsFn)
    __obj.updateDynamic("calcZIndex")(calcZIndex.toJsFn)
    __obj.updateDynamic("createOerlay")(createOerlay.toJsFn)
    __obj.updateDynamic("init")(init.toJsFn)
    __obj.updateDynamic("resize")(resize.toJsFn)
    __obj.updateDynamic("start")(start.toJsFn)
    __obj.updateDynamic("stop")(stop.toJsFn)
    __obj.updateDynamic("toggle")(toggle.toJsFn)
    __obj.asInstanceOf[LoadingObject]
  }
}

