package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`150-kilometers`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`50-kilometers`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`benoit-1895-b-chains`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`clarke-feet`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`clarke-links`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`clarke-yards`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`gold-coast-feet`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`gravity-related-height`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`indian-1937-yards`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`indian-yards`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`sears-1922-truncated-chains`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`sears-chains`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`sears-feet`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`sears-yards`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`us-feet`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.ellipsoidal
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.feet_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.meters_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeightModelInfo
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * The surface type or height model of the vertical coordinate system (VCS).
    *
    * @default "gravity-related-height"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-HeightModelInfo.html#heightModel)
    */
  val heightModel: `gravity-related-height` | ellipsoidal = js.native
  
  /**
    * The unit of the vertical coordinate system.
    *
    * @default "meters"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-HeightModelInfo.html#heightUnit)
    */
  val heightUnit: meters_ | feet_ | `us-feet` | `clarke-feet` | `clarke-yards` | `clarke-links` | `sears-yards` | `sears-feet` | `sears-chains` | `benoit-1895-b-chains` | `indian-yards` | `indian-1937-yards` | `gold-coast-feet` | `sears-1922-truncated-chains` | `50-kilometers` | `150-kilometers` = js.native
  
  /**
    * The datum realization of the vertical coordinate system.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-HeightModelInfo.html#vertCRS)
    */
  val vertCRS: String = js.native
}
