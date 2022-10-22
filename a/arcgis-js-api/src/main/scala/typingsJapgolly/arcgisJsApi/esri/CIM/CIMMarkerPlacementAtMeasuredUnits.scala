package typingsJapgolly.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMMarkerPlacementAtMeasuredUnits
  extends StObject
     with CIMMarkerStrokePlacement
     with CIMMarkerPlacementType {
  
  /**
    * The interval of measured units used to place markers.
    */
  var interval: js.UndefOr[Double] = js.undefined
  
  /**
    * A value indicating whether markers should be placed at extremities.
    */
  var placeAtExtremities: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The rate of markers to skip.
    */
  var skipMarkerRate: js.UndefOr[Double] = js.undefined
  
  @JSName("type")
  var type_CIMMarkerPlacementAtMeasuredUnits: typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementAtMeasuredUnits
}
object CIMMarkerPlacementAtMeasuredUnits {
  
  inline def apply(): CIMMarkerPlacementAtMeasuredUnits = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CIMMarkerPlacementAtMeasuredUnits")
    __obj.asInstanceOf[CIMMarkerPlacementAtMeasuredUnits]
  }
  
  extension [Self <: CIMMarkerPlacementAtMeasuredUnits](x: Self) {
    
    inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    inline def setPlaceAtExtremities(value: Boolean): Self = StObject.set(x, "placeAtExtremities", value.asInstanceOf[js.Any])
    
    inline def setPlaceAtExtremitiesUndefined: Self = StObject.set(x, "placeAtExtremities", js.undefined)
    
    inline def setSkipMarkerRate(value: Double): Self = StObject.set(x, "skipMarkerRate", value.asInstanceOf[js.Any])
    
    inline def setSkipMarkerRateUndefined: Self = StObject.set(x, "skipMarkerRate", js.undefined)
    
    inline def setType(value: typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementAtMeasuredUnits): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
