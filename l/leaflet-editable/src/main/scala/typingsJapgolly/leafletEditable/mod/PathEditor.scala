package typingsJapgolly.leafletEditable.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Inherit from L.Editable.BaseEditor.
  * Inherited by L.Editable.PolylineEditor and L.Editable.PolygonEditor.
  */
trait PathEditor extends BaseEditor {
  /**
    * Rebuild edit elements (vertex, middlemarker, etc.).
    */
  def reset(): Unit
}

object PathEditor {
  @scala.inline
  def apply(
    disable: CallbackTo[MarkerEditor | PolylineEditor | PolygonEditor],
    enable: CallbackTo[MarkerEditor | PolylineEditor | PolygonEditor],
    reset: Callback
  ): PathEditor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("disable")(disable.toJsFn)
    __obj.updateDynamic("enable")(enable.toJsFn)
    __obj.updateDynamic("reset")(reset.toJsFn)
    __obj.asInstanceOf[PathEditor]
  }
}

