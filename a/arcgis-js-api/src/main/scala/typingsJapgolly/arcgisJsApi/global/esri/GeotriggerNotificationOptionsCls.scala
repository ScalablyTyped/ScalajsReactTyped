package typingsJapgolly.arcgisJsApi.global.esri

import typingsJapgolly.arcgisJsApi.esri.GeotriggerNotificationOptionsProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.GeotriggerNotificationOptions")
@js.native
/**
  * Options that control the notification information sent to a client app client when a Geotrigger condition is met.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-geotriggersInfo-GeotriggerNotificationOptions.html)
  */
open class GeotriggerNotificationOptionsCls ()
  extends StObject
     with typingsJapgolly.arcgisJsApi.esri.GeotriggerNotificationOptions {
  def this(properties: GeotriggerNotificationOptionsProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
