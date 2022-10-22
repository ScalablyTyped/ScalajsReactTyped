package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.DeviceLocationFeed
import typingsJapgolly.arcgisJsApi.esri.DeviceLocationFeedConstructor
import typingsJapgolly.arcgisJsApi.esri.DeviceLocationFeedProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWebdocGeotriggersInfoDeviceLocationFeedMod extends Shortcut {
  
  @JSImport("esri/webdoc/geotriggersInfo/DeviceLocationFeed", JSImport.Namespace)
  @js.native
  val ^ : js.Object & DeviceLocationFeedConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/webdoc/geotriggersInfo/DeviceLocationFeed", JSImport.Namespace)
  @js.native
  /**
    * A Geotrigger feed which uses the device location to provide updates.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-geotriggersInfo-DeviceLocationFeed.html)
    */
  open class Class ()
    extends StObject
       with DeviceLocationFeed {
    def this(properties: DeviceLocationFeedProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & DeviceLocationFeedConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWebdocGeotriggersInfoDeviceLocationFeedMod.foo` */
  override def _to: js.Object & DeviceLocationFeedConstructor = ^
}
