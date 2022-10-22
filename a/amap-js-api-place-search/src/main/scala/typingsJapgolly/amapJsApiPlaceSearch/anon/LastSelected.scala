package typingsJapgolly.amapJsApiPlaceSearch.anon

import org.scalajs.dom.MouseEvent
import typingsJapgolly.amapJsApiPlaceSearch.AMap.PlaceSearch.SelectChangeEvent
import typingsJapgolly.amapJsApiPlaceSearch.AMap.PlaceSearch.SelectChangeEventData
import typingsJapgolly.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.listElementClick
import typingsJapgolly.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.markerClick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LastSelected extends StObject {
  
  var lastSelected: SelectChangeEventData | (SelectChangeEvent[
    markerClick | listElementClick, 
    (/* import warning: importer.ImportType#apply Failed type conversion: amap-js-api.AMap.Marker.EventMap<amap-js-api.AMap.Marker<any>>['click'] */ js.Any) | MouseEvent
  ]) | Null
  
  var selected: SelectChangeEventData | (SelectChangeEvent[
    markerClick | listElementClick, 
    (/* import warning: importer.ImportType#apply Failed type conversion: amap-js-api.AMap.Marker.EventMap<amap-js-api.AMap.Marker<any>>['click'] */ js.Any) | MouseEvent
  ])
}
object LastSelected {
  
  inline def apply(
    selected: SelectChangeEventData | (SelectChangeEvent[
      markerClick | listElementClick, 
      (/* import warning: importer.ImportType#apply Failed type conversion: amap-js-api.AMap.Marker.EventMap<amap-js-api.AMap.Marker<any>>['click'] */ js.Any) | MouseEvent
    ])
  ): LastSelected = {
    val __obj = js.Dynamic.literal(selected = selected.asInstanceOf[js.Any], lastSelected = null)
    __obj.asInstanceOf[LastSelected]
  }
  
  extension [Self <: LastSelected](x: Self) {
    
    inline def setLastSelected(
      value: SelectChangeEventData | (SelectChangeEvent[
          markerClick | listElementClick, 
          (/* import warning: importer.ImportType#apply Failed type conversion: amap-js-api.AMap.Marker.EventMap<amap-js-api.AMap.Marker<any>>['click'] */ js.Any) | MouseEvent
        ])
    ): Self = StObject.set(x, "lastSelected", value.asInstanceOf[js.Any])
    
    inline def setLastSelectedNull: Self = StObject.set(x, "lastSelected", null)
    
    inline def setSelected(
      value: SelectChangeEventData | (SelectChangeEvent[
          markerClick | listElementClick, 
          (/* import warning: importer.ImportType#apply Failed type conversion: amap-js-api.AMap.Marker.EventMap<amap-js-api.AMap.Marker<any>>['click'] */ js.Any) | MouseEvent
        ])
    ): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
  }
}
