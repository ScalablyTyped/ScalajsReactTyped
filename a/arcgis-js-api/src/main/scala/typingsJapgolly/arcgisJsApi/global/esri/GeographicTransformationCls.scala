package typingsJapgolly.arcgisJsApi.global.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.GeographicTransformation")
@js.native
/**
  * Projecting your data between coordinate systems sometimes requires transforming between geographic coordinate systems.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-GeographicTransformation.html)
  */
open class GeographicTransformationCls ()
  extends StObject
     with typingsJapgolly.arcgisJsApi.esri.GeographicTransformation {
  def this(properties: Any) = this()
  
  /**
    * Returns the inverse of the geographic transformation calling this method or `null` if the transformation is not invertible.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-GeographicTransformation.html#getInverse)
    */
  /* CompleteClass */
  override def getInverse(): typingsJapgolly.arcgisJsApi.esri.GeographicTransformation = js.native
  
  /**
    * Geographic transformation steps.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-GeographicTransformation.html#steps)
    */
  /* CompleteClass */
  var steps: js.Array[typingsJapgolly.arcgisJsApi.esri.GeographicTransformationStep] = js.native
}
