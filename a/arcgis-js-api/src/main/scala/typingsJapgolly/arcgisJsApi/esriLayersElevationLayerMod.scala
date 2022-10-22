package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.ElevationLayer
import typingsJapgolly.arcgisJsApi.esri.ElevationLayerConstructor
import typingsJapgolly.arcgisJsApi.esri.ElevationLayerProperties
import typingsJapgolly.arcgisJsApi.esri.PortalItem
import typingsJapgolly.arcgisJsApi.esri.SpatialReference
import typingsJapgolly.arcgisJsApi.esri.TileInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriLayersElevationLayerMod extends Shortcut {
  
  @JSImport("esri/layers/ElevationLayer", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ElevationLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/ElevationLayer", JSImport.Namespace)
  @js.native
  /**
    * ElevationLayer is a tile layer used for rendering elevations in [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html)
    */
  open class Class ()
    extends StObject
       with ElevationLayer {
    def this(properties: ElevationLayerProperties) = this()
    
    /**
      * The copyright text as defined by the service.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISCachedService.html#copyright)
      */
    /* CompleteClass */
    var copyright: String = js.native
    
    /**
      * The portal item from which the layer is loaded.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-PortalLayer.html#portalItem)
      */
    /* CompleteClass */
    var portalItem: PortalItem = js.native
    
    /**
      * The spatial reference of the layer as defined by the service.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISCachedService.html#spatialReference)
      */
    /* CompleteClass */
    override val spatialReference: SpatialReference = js.native
    
    /**
      * Contains information about the tiling scheme for the layer.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISCachedService.html#tileInfo)
      */
    /* CompleteClass */
    var tileInfo: TileInfo = js.native
  }
  
  type _To = js.Object & ElevationLayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriLayersElevationLayerMod.foo` */
  override def _to: js.Object & ElevationLayerConstructor = ^
}
