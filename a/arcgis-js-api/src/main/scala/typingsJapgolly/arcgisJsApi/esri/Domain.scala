package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`coded-value`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.inherited
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Domain
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * The domain name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Domain.html#name)
    */
  var name: String = js.native
  
  /**
    * The domain type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Domain.html#type)
    */
  var `type`: range | `coded-value` | inherited = js.native
}
