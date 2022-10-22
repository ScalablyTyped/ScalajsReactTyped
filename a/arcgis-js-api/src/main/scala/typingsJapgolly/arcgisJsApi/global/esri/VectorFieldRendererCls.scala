package typingsJapgolly.arcgisJsApi.global.esri

import typingsJapgolly.arcgisJsApi.esri.VectorFieldRendererProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.VectorFieldRenderer")
@js.native
/**
  * The VectorFieldRenderer allows you to display your raster data with vector symbols.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-VectorFieldRenderer.html)
  */
open class VectorFieldRendererCls ()
  extends StObject
     with typingsJapgolly.arcgisJsApi.esri.VectorFieldRenderer {
  def this(properties: VectorFieldRendererProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
