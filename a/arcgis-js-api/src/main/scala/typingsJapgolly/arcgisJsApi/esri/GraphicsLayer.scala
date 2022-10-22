package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.graphics
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GraphicsLayer
  extends StObject
     with Layer
     with ScaleRangeLayer
     with BlendLayer {
  
  /**
    * Adds a graphic to the layer's graphic collection.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html#add)
    */
  def add(graphic: Graphic): scala.Unit = js.native
  
  /**
    * Adds an array of graphics to the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html#addMany)
    */
  def addMany(graphics: js.Array[Graphic]): scala.Unit = js.native
  
  /**
    * Specifies how graphics are placed on the vertical axis (z).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html#elevationInfo)
    */
  var elevationInfo: GraphicsLayerElevationInfo = js.native
  
  /**
    * A collection of [graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html#graphics)
    */
  var graphics: Collection[Graphic] = js.native
  
  /**
    * Removes a graphic from the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html#remove)
    */
  def remove(graphic: Graphic): scala.Unit = js.native
  
  /**
    * Clears all the graphics from the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html#removeAll)
    */
  def removeAll(): scala.Unit = js.native
  
  /**
    * Removes an array of graphics from the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html#removeMany)
    */
  def removeMany(graphics: js.Array[Graphic]): scala.Unit = js.native
  
  /**
    * Apply perspective scaling to screen-size point symbols in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html#screenSizePerspectiveEnabled)
    */
  var screenSizePerspectiveEnabled: Boolean = js.native
  
  @JSName("type")
  val type_GraphicsLayer: graphics = js.native
}
