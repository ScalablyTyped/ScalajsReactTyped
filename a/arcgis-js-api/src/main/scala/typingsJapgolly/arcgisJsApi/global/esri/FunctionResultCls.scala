package typingsJapgolly.arcgisJsApi.global.esri

import typingsJapgolly.arcgisJsApi.esri.FunctionResultProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.FunctionResult")
@js.native
/**
  * A trace can optionally return a aggregated function result if the trace configuration asked for it.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-FunctionResult.html)
  */
open class FunctionResultCls ()
  extends StObject
     with typingsJapgolly.arcgisJsApi.esri.FunctionResult {
  def this(properties: FunctionResultProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
