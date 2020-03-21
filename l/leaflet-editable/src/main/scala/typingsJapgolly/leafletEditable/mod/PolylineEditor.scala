package typingsJapgolly.leafletEditable.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Inherit from L.Editable.PathEditor.
  */
trait PolylineEditor extends PathEditor {
  /**
    * Set up drawing tools to continue the line backward.
    */
  def continueBackward(): Unit
  /**
    * Set up drawing tools to continue the line forward.
    */
  def continueForward(): Unit
}

object PolylineEditor {
  @scala.inline
  def apply(
    continueBackward: Callback,
    continueForward: Callback,
    disable: CallbackTo[MarkerEditor | PolylineEditor | PolygonEditor],
    enable: CallbackTo[MarkerEditor | PolylineEditor | PolygonEditor],
    reset: Callback
  ): PolylineEditor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("continueBackward")(continueBackward.toJsFn)
    __obj.updateDynamic("continueForward")(continueForward.toJsFn)
    __obj.updateDynamic("disable")(disable.toJsFn)
    __obj.updateDynamic("enable")(enable.toJsFn)
    __obj.updateDynamic("reset")(reset.toJsFn)
    __obj.asInstanceOf[PolylineEditor]
  }
}

