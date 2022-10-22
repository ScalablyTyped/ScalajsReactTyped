package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.IntegratedMeshLayer
import typingsJapgolly.arcgisJsApi.esri.IntegratedMeshLayerConstructor
import typingsJapgolly.arcgisJsApi.esri.IntegratedMeshLayerProperties
import typingsJapgolly.arcgisJsApi.esri.PortalItem
import typingsJapgolly.arcgisJsApi.esri.SceneServiceVersion
import typingsJapgolly.arcgisJsApi.esri.SpatialReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriLayersIntegratedMeshLayerMod extends Shortcut {
  
  @JSImport("esri/layers/IntegratedMeshLayer", JSImport.Namespace)
  @js.native
  val ^ : js.Object & IntegratedMeshLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/IntegratedMeshLayer", JSImport.Namespace)
  @js.native
  /**
    * The IntegratedMeshLayer is designed for visualizing accurate representations in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) of infrastructure and natural landscapes that are difficult to access.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-IntegratedMeshLayer.html)
    */
  open class Class ()
    extends StObject
       with IntegratedMeshLayer {
    def this(properties: IntegratedMeshLayerProperties) = this()
    
    /**
      * An authorization string used to access a resource or service.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-APIKeyMixin.html#apiKey)
      */
    /* CompleteClass */
    var apiKey: String = js.native
    
    /**
      * The copyright text as defined by the scene service.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-SceneService.html#copyright)
      */
    /* CompleteClass */
    var copyright: String = js.native
    
    /**
      * The layer ID, or layer index, of a Scene Service layer.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-SceneService.html#layerId)
      */
    /* CompleteClass */
    var layerId: Double = js.native
    
    /**
      * The maximum scale (most zoomed in) at which the layer is visible in the view.
      *
      * @default 0
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#maxScale)
      */
    /* CompleteClass */
    var maxScale: Double = js.native
    
    /**
      * The minimum scale (most zoomed out) at which the layer is visible in the view.
      *
      * @default 0
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#minScale)
      */
    /* CompleteClass */
    var minScale: Double = js.native
    
    /**
      * The portal item from which the layer is loaded.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-PortalLayer.html#portalItem)
      */
    /* CompleteClass */
    var portalItem: PortalItem = js.native
    
    /**
      * The spatial reference of the layer.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-SceneService.html#spatialReference)
      */
    /* CompleteClass */
    var spatialReference: SpatialReference = js.native
    
    /**
      * The URL of the REST endpoint of the layer or scene service.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-SceneService.html#url)
      */
    /* CompleteClass */
    var url: String = js.native
    
    /**
      * The version of the scene service specification used for this service.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-SceneService.html#version)
      */
    /* CompleteClass */
    override val version: SceneServiceVersion = js.native
  }
  
  type _To = js.Object & IntegratedMeshLayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriLayersIntegratedMeshLayerMod.foo` */
  override def _to: js.Object & IntegratedMeshLayerConstructor = ^
}
