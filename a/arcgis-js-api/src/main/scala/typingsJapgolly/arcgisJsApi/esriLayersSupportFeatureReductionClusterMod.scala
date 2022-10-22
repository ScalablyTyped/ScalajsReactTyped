package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.FeatureReductionCluster
import typingsJapgolly.arcgisJsApi.esri.FeatureReductionClusterConstructor
import typingsJapgolly.arcgisJsApi.esri.FeatureReductionClusterProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriLayersSupportFeatureReductionClusterMod extends Shortcut {
  
  @JSImport("esri/layers/support/FeatureReductionCluster", JSImport.Namespace)
  @js.native
  val ^ : js.Object & FeatureReductionClusterConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/FeatureReductionCluster", JSImport.Namespace)
  @js.native
  /**
    * This class configures clustering as a means of reducing and summarizing point features in a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html), [CSVLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html), [GeoJSONLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html), [WFSLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WFSLayer.html), or [OGCFeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-OGCFeatureLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html)
    */
  open class Class ()
    extends StObject
       with FeatureReductionCluster {
    def this(properties: FeatureReductionClusterProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & FeatureReductionClusterConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriLayersSupportFeatureReductionClusterMod.foo` */
  override def _to: js.Object & FeatureReductionClusterConstructor = ^
}
