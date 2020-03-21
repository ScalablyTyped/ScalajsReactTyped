package typingsJapgolly.heremaps.H.map

import typingsJapgolly.heremaps.H.map.layer.Layer
import typingsJapgolly.heremaps.H.util.OList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The class represents data model of the map. It holds list of layers that are rendered by map's RenderEngine.
  * The class listens to 'update' events from layers and dispatches them to the RenderEngine.
  */
@JSGlobal("H.map.DataModel")
@js.native
/**
  * Constructor
  * @param opt_layers {Array=} - array of layers to be added to the data model
  */
class DataModel () extends OList {
  def this(opt_layers: js.Array[Layer]) = this()
}

