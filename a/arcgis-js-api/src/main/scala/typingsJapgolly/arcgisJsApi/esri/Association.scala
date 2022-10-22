package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.attachment
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.connectivity
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.containment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Association
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * The type of association.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-Association.html#associationType)
    */
  var associationType: attachment | connectivity | containment = js.native
  
  var errorCode: Double = js.native
  
  var errorMessage: String = js.native
  
  /**
    * The from side network element of the association.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-Association.html#fromNetworkElement)
    */
  var fromNetworkElement: NetworkElement = js.native
  
  /**
    * The globalId (UUID) of the association record, uniquely identifes this association row.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-Association.html#globalId)
    */
  var globalId: String = js.native
  
  var isContentVisible: Boolean = js.native
  
  /**
    * The synthesized [polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html) geometry created between the two network elements.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-Association.html#line)
    */
  var line: Polyline = js.native
  
  var percentAlong: Double = js.native
  
  var status: Double = js.native
  
  /**
    * The to side network element of the association.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-Association.html#toNetworkElement)
    */
  var toNetworkElement: NetworkElement = js.native
}
