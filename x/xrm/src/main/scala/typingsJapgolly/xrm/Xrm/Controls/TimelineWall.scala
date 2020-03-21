package typingsJapgolly.xrm.Xrm.Controls

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a Timeline control.
  * @see {@link Control}
  */
trait TimelineWall extends Control {
  /**
    * Refreshes the data displayed in a timelinewall and timer control.
    */
  def refresh(): Unit
}

object TimelineWall {
  @scala.inline
  def apply(
    getControlType: CallbackTo[ControlType | String],
    getLabel: CallbackTo[String],
    getName: CallbackTo[String],
    getParent: CallbackTo[Section],
    getVisible: CallbackTo[Boolean],
    refresh: Callback,
    setLabel: String => Callback
  ): TimelineWall = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getControlType")(getControlType.toJsFn)
    __obj.updateDynamic("getLabel")(getLabel.toJsFn)
    __obj.updateDynamic("getName")(getName.toJsFn)
    __obj.updateDynamic("getParent")(getParent.toJsFn)
    __obj.updateDynamic("getVisible")(getVisible.toJsFn)
    __obj.updateDynamic("refresh")(refresh.toJsFn)
    __obj.updateDynamic("setLabel")(js.Any.fromFunction1((t0: java.lang.String) => setLabel(t0).runNow()))
    __obj.asInstanceOf[TimelineWall]
  }
}

