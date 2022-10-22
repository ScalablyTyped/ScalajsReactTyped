package typingsJapgolly.bingmaps.global.Microsoft.Maps

import typingsJapgolly.bingmaps.Microsoft.Maps.ITileLayerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Microsoft.Maps.TileLayer")
@js.native
open class TileLayer protected ()
  extends StObject
     with typingsJapgolly.bingmaps.Microsoft.Maps.TileLayer {
  /**
    * @constructor
    * @param options The options to use to define the tile layer.
    */
  def this(options: ITileLayerOptions) = this()
  
  /**
    * Gets the opacity of the tile layer, defined as a double between 0 (not visible) and 1.
    * @returns The opacity of the tile layer, defined as a double between 0 (not visible) and 1.
    */
  /* CompleteClass */
  override def getOpacity(): Double = js.native
  
  /**
    * Gets the tile source of the tile layer.
    * @returns The tile source of the tile layer.
    */
  /* CompleteClass */
  override def getTileSource(): typingsJapgolly.bingmaps.Microsoft.Maps.TileSource = js.native
  
  /**
    * Gets a boolean that indicates if the tile layer is visible or not.
    * @returns A boolean that indicates if the tile layer is visible or not.
    */
  /* CompleteClass */
  override def getVisible(): Boolean = js.native
  
  /**
    * Gets the zIndex of the tile layer.
    * @returns The zIndex of the tile layer.
    */
  /* CompleteClass */
  override def getZIndex(): Double = js.native
  
  /** Optional property to store any additional metadata for this layer. */
  /* CompleteClass */
  var metadata: Any = js.native
  
  /**
    * Sets the opacity of the tile layer. Value must be a number between 0 and 1.
    * @param opacity The opacity of the tile layer. Value must be a number between 0 and 1.
    */
  /* CompleteClass */
  override def setOpacity(opacity: Double): Unit = js.native
  
  /**
    * Sets options for the tile layer.
    * @param options The options for the tile layer.
    */
  /* CompleteClass */
  override def setOptions(options: ITileLayerOptions): Unit = js.native
  
  /**
    * Sets the visibility of the tile layer.
    * @param show A boolean indicating if the tile layer should be visible or not.
    */
  /* CompleteClass */
  override def setVisible(show: Boolean): Unit = js.native
  
  /**
    * Sets the zIndex of the tile layer.
    * @param idx The zIndex of the tile layer.
    */
  /* CompleteClass */
  override def setZIndex(idx: Double): Unit = js.native
}
