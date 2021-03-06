package typingsJapgolly.heredatalens.H.datalens

import typingsJapgolly.heredatalens.H.datalens.SpatialLayer.Options
import typingsJapgolly.heredatalens.H.datalens.SpatialLayer.StyleState
import typingsJapgolly.heremaps.H.map.Object
import typingsJapgolly.heremaps.H.map.layer.TileLayer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Renders vector tiles using data-driven styles
  * This layer binds the spatial data and user data, all provided by the Data Lens REST API. The layer renders geometry features using data-driven styles.
  */
@JSGlobal("H.datalens.SpatialLayer")
@js.native
class SpatialLayer_ protected () extends TileLayer {
  /**
    * Constructor
    * @param dataProvider - Source of tiled data (pass in null if data come from feature properties)
    * @param spatialProvider - Source of geometry data
    * @param options - Configuration for data processing and rendering
    */
  def this(dataProvider: Provider, spatialProvider: SpatialTileProvider, options: Options) = this()
  /**
    * Forces re-rendering of the layer. When the callbacks passed to the layer options are not pure functions, you can call this method to force re-rendering.
    */
  def redraw(): Unit = js.native
  /**
    * This method changes the state of a map object; for example, style on mouse event.
    */
  def updateSpatialStyle(spatial: Object, state: StyleState): Unit = js.native
}

