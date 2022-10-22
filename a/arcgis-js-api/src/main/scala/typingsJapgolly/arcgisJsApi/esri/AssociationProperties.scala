package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.attachment
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.connectivity
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.containment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociationProperties extends StObject {
  
  /**
    * The type of association.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-Association.html#associationType)
    */
  var associationType: js.UndefOr[attachment | connectivity | containment] = js.undefined
  
  var errorCode: js.UndefOr[Double] = js.undefined
  
  var errorMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The from side network element of the association.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-Association.html#fromNetworkElement)
    */
  var fromNetworkElement: js.UndefOr[NetworkElementProperties] = js.undefined
  
  /**
    * The globalId (UUID) of the association record, uniquely identifes this association row.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-Association.html#globalId)
    */
  var globalId: js.UndefOr[String] = js.undefined
  
  var isContentVisible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The synthesized [polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html) geometry created between the two network elements.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-Association.html#line)
    */
  var line: js.UndefOr[PolylineProperties] = js.undefined
  
  var percentAlong: js.UndefOr[Double] = js.undefined
  
  var status: js.UndefOr[Double] = js.undefined
  
  /**
    * The to side network element of the association.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-Association.html#toNetworkElement)
    */
  var toNetworkElement: js.UndefOr[NetworkElementProperties] = js.undefined
}
object AssociationProperties {
  
  inline def apply(): AssociationProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociationProperties]
  }
  
  extension [Self <: AssociationProperties](x: Self) {
    
    inline def setAssociationType(value: attachment | connectivity | containment): Self = StObject.set(x, "associationType", value.asInstanceOf[js.Any])
    
    inline def setAssociationTypeUndefined: Self = StObject.set(x, "associationType", js.undefined)
    
    inline def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setFromNetworkElement(value: NetworkElementProperties): Self = StObject.set(x, "fromNetworkElement", value.asInstanceOf[js.Any])
    
    inline def setFromNetworkElementUndefined: Self = StObject.set(x, "fromNetworkElement", js.undefined)
    
    inline def setGlobalId(value: String): Self = StObject.set(x, "globalId", value.asInstanceOf[js.Any])
    
    inline def setGlobalIdUndefined: Self = StObject.set(x, "globalId", js.undefined)
    
    inline def setIsContentVisible(value: Boolean): Self = StObject.set(x, "isContentVisible", value.asInstanceOf[js.Any])
    
    inline def setIsContentVisibleUndefined: Self = StObject.set(x, "isContentVisible", js.undefined)
    
    inline def setLine(value: PolylineProperties): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setPercentAlong(value: Double): Self = StObject.set(x, "percentAlong", value.asInstanceOf[js.Any])
    
    inline def setPercentAlongUndefined: Self = StObject.set(x, "percentAlong", js.undefined)
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setToNetworkElement(value: NetworkElementProperties): Self = StObject.set(x, "toNetworkElement", value.asInstanceOf[js.Any])
    
    inline def setToNetworkElementUndefined: Self = StObject.set(x, "toNetworkElement", js.undefined)
  }
}
