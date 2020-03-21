package typingsJapgolly.dojo.dojo.dnd

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/dnd/common.html
  *
  * TODOC
  *
  */
trait common_ extends js.Object {
  /**
    *
    * @param evt
    */
  def getCopyKeyState(evt: js.Any): js.Any
  /**
    * returns a unique string for use with any DOM element
    *
    */
  def getUniqueId(): String
  /**
    * returns true if user clicked on a form element
    *
    * @param e
    */
  def isFormElement(e: Event_): Unit
  /**
    * Returns the current DnD manager.  Creates one if it is not created yet.
    *
    */
  def manager(): js.Any
}

object common_ {
  @scala.inline
  def apply(
    getCopyKeyState: js.Any => CallbackTo[js.Any],
    getUniqueId: CallbackTo[String],
    isFormElement: Event_ => Callback,
    manager: CallbackTo[js.Any]
  ): common_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getCopyKeyState")(js.Any.fromFunction1((t0: js.Any) => getCopyKeyState(t0).runNow()))
    __obj.updateDynamic("getUniqueId")(getUniqueId.toJsFn)
    __obj.updateDynamic("isFormElement")(js.Any.fromFunction1((t0: typingsJapgolly.std.Event_) => isFormElement(t0).runNow()))
    __obj.updateDynamic("manager")(manager.toJsFn)
    __obj.asInstanceOf[common_]
  }
}

