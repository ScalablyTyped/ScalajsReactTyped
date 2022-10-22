package typingsJapgolly.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceLocationFeedConstructor
  extends StObject
     with /**
  * A Geotrigger feed which uses the device location to provide updates.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-geotriggersInfo-DeviceLocationFeed.html)
  */
Instantiable0[DeviceLocationFeed]
     with Instantiable1[/* properties */ DeviceLocationFeedProperties, DeviceLocationFeed] {
  
  def fromJSON(json: Any): DeviceLocationFeed = js.native
}
