package typingsJapgolly.arcgisJsApi.global.esri

import typingsJapgolly.arcgisJsApi.esri.ImagePixelLocationParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.ImagePixelLocationParameters")
@js.native
/**
  * Input parameters for the [ImageryLayer.computePixelSpaceLocations()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#computePixelSpaceLocations) or [imageService.computePixelSpaceLocations()](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-imageService.html#computePixelSpaceLocations) methods.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImagePixelLocationParameters.html)
  */
open class ImagePixelLocationParametersCls ()
  extends StObject
     with typingsJapgolly.arcgisJsApi.esri.ImagePixelLocationParameters {
  def this(properties: ImagePixelLocationParametersProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
