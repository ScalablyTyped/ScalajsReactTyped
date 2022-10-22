package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`default-curve-extension`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`keep-end-attributes`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`no-end-attributes`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`no-extend-at-from`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`no-extend-at-to`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`relocate-ends`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrimExtendParameters
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * A flag used with the `trimExtend` operation.
    *
    * @default "default-curve-extension"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TrimExtendParameters.html#extendHow)
    */
  var extendHow: `default-curve-extension` | `relocate-ends` | `keep-end-attributes` | `no-end-attributes` | `no-extend-at-from` | `no-extend-at-to` = js.native
  
  /**
    * The array of polylines to trim or extend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TrimExtendParameters.html#polylines)
    */
  var polylines: js.Array[Polyline] = js.native
  
  /**
    * A polyline used as a guide for trimming or extending input polylines.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TrimExtendParameters.html#trimExtendTo)
    */
  var trimExtendTo: Polyline = js.native
}
