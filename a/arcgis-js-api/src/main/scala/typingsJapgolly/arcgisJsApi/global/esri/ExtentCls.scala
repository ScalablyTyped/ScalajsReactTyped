package typingsJapgolly.arcgisJsApi.global.esri

import typingsJapgolly.arcgisJsApi.esri.ExtentProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.Extent")
@js.native
/**
  * The minimum and maximum X and Y coordinates of a bounding box.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html)
  */
open class ExtentCls ()
  extends StObject
     with typingsJapgolly.arcgisJsApi.esri.Extent {
  def this(properties: ExtentProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
