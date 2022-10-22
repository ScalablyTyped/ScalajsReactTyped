package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.PointCloudReturnFilter
import typingsJapgolly.arcgisJsApi.esri.PointCloudReturnFilterConstructor
import typingsJapgolly.arcgisJsApi.esri.PointCloudReturnFilterProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriLayersPointCloudFiltersPointCloudReturnFilterMod extends Shortcut {
  
  @JSImport("esri/layers/pointCloudFilters/PointCloudReturnFilter", JSImport.Namespace)
  @js.native
  val ^ : js.Object & PointCloudReturnFilterConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/pointCloudFilters/PointCloudReturnFilter", JSImport.Namespace)
  @js.native
  /**
    * Laser pulses emitted from a lidar system can have several returns depending on the surfaces that they encounter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-pointCloudFilters-PointCloudReturnFilter.html)
    */
  open class Class ()
    extends StObject
       with PointCloudReturnFilter {
    def this(properties: PointCloudReturnFilterProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & PointCloudReturnFilterConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriLayersPointCloudFiltersPointCloudReturnFilterMod.foo` */
  override def _to: js.Object & PointCloudReturnFilterConstructor = ^
}
