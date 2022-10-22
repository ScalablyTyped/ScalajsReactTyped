package typingsJapgolly.arcgisJsApi.global.esri

import typingsJapgolly.arcgisJsApi.esri.TrimExtendParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.TrimExtendParameters")
@js.native
/**
  * Used to set the parameters for the [geometryService.trimExtend](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geometryService.html#trimExtend) operation.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TrimExtendParameters.html)
  */
open class TrimExtendParametersCls ()
  extends StObject
     with typingsJapgolly.arcgisJsApi.esri.TrimExtendParameters {
  def this(properties: TrimExtendParametersProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
