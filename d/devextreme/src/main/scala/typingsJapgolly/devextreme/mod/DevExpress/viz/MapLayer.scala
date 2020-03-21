package typingsJapgolly.devextreme.mod.DevExpress.viz

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.devextreme.mod.DevExpress.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapLayer extends js.Object {
  /** The type of the layer elements. */
  var elementType: String
  /** The layer index in the layers array. */
  var index: Double
  /** The name of the layer. */
  var name: String
  /** The layer type. Can be "area", "line" or "marker". */
  var `type`: String
  /** Deselects all layer elements. */
  def clearSelection(): Unit
  /** Returns the DataSource instance. */
  def getDataSource(): DataSource
  /** Gets all layer elements. */
  def getElements(): js.Array[MapLayerElement]
}

object MapLayer {
  @scala.inline
  def apply(
    clearSelection: Callback,
    elementType: String,
    getDataSource: CallbackTo[DataSource],
    getElements: CallbackTo[js.Array[MapLayerElement]],
    index: Double,
    name: String,
    `type`: String
  ): MapLayer = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("clearSelection")(clearSelection.toJsFn)
    __obj.updateDynamic("getDataSource")(getDataSource.toJsFn)
    __obj.updateDynamic("getElements")(getElements.toJsFn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapLayer]
  }
}

