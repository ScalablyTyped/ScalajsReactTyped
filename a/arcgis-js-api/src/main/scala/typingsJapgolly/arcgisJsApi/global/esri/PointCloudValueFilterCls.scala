package typingsJapgolly.arcgisJsApi.global.esri

import typingsJapgolly.arcgisJsApi.esri.PointCloudValueFilterProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.PointCloudValueFilter")
@js.native
/**
  * Every lidar point can have a classification that defines the type of surface that reflected the laser pulse.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-pointCloudFilters-PointCloudValueFilter.html)
  */
open class PointCloudValueFilterCls ()
  extends StObject
     with typingsJapgolly.arcgisJsApi.esri.PointCloudValueFilter {
  def this(properties: PointCloudValueFilterProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
