package typingsJapgolly.arcgisJsApi.global.esri

import typingsJapgolly.arcgisJsApi.esri.SlicePlaneProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.SlicePlane")
@js.native
/**
  * Provides the shape definition of a slice plane for a [Slice](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slice.html) widget or [SliceAnalysis](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-SliceAnalysis.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-SlicePlane.html)
  */
open class SlicePlaneCls ()
  extends StObject
     with typingsJapgolly.arcgisJsApi.esri.SlicePlane {
  def this(properties: SlicePlaneProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
