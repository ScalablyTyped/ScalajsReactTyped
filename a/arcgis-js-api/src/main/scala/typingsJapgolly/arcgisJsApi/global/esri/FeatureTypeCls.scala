package typingsJapgolly.arcgisJsApi.global.esri

import typingsJapgolly.arcgisJsApi.esri.FeatureTypeProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.FeatureType")
@js.native
/**
  * FeatureType is a subset of features defined in a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) that share the same attributes.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureType.html)
  */
open class FeatureTypeCls ()
  extends StObject
     with typingsJapgolly.arcgisJsApi.esri.FeatureType {
  def this(properties: FeatureTypeProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
