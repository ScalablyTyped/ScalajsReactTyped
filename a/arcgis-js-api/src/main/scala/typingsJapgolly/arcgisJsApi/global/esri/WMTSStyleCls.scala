package typingsJapgolly.arcgisJsApi.global.esri

import typingsJapgolly.arcgisJsApi.esri.WMTSStyleProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.WMTSStyle")
@js.native
/**
  * Contains information about the WMTS Style for [WMTSSublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSStyle.html)
  */
open class WMTSStyleCls ()
  extends StObject
     with typingsJapgolly.arcgisJsApi.esri.WMTSStyle {
  def this(properties: WMTSStyleProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
