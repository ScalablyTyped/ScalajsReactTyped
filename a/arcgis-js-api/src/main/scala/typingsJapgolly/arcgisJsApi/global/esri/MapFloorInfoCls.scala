package typingsJapgolly.arcgisJsApi.global.esri

import typingsJapgolly.arcgisJsApi.esri.MapFloorInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.MapFloorInfo")
@js.native
/**
  * Floor-aware maps facilitate visualizing, editing, and analyzing indoor data and they allow for fast navigation of buildings in maps and scenes.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-MapFloorInfo.html)
  */
open class MapFloorInfoCls ()
  extends StObject
     with typingsJapgolly.arcgisJsApi.esri.MapFloorInfo {
  def this(properties: MapFloorInfoProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
