package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`process-definition`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`process-start`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`process-stop`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.abort
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.empty
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.error
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.informative
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NAMessage
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * A description of the network analyst message.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-NAMessage.html#description)
    */
  var description: String = js.native
  
  /**
    * The network analyst message type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-NAMessage.html#type)
    */
  var `type`: informative | `process-definition` | `process-start` | `process-stop` | warning | error | empty | abort = js.native
}
