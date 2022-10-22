package typingsJapgolly.arcgisJsApi.global.esri

import typingsJapgolly.arcgisJsApi.esri.ImageAngleResultProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.ImageAngleResult")
@js.native
/**
  * The results from [imageService.computeAngles()](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-imageService.html#computeAngles) or [ImageryLayer.computeAngles()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#computeAngles) method.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageAngleResult.html)
  */
open class ImageAngleResultCls ()
  extends StObject
     with typingsJapgolly.arcgisJsApi.esri.ImageAngleResult {
  def this(properties: ImageAngleResultProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
