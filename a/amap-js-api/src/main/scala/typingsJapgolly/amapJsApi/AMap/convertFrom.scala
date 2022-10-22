package typingsJapgolly.amapJsApi.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object convertFrom {
  
  trait Result extends StObject {
    
    /**
      * 成功状态文字描述
      */
    var info: String
    
    // 'ok'
    /**
      * 高德坐标集合
      */
    var locations: js.Array[LngLat]
  }
  object Result {
    
    inline def apply(info: String, locations: js.Array[LngLat]): Result = {
      val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    extension [Self <: Result](x: Self) {
      
      inline def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setLocations(value: js.Array[LngLat]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
      
      inline def setLocationsVarargs(value: LngLat*): Self = StObject.set(x, "locations", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.amapJsApi.amapJsApiStrings.complete
    - typingsJapgolly.amapJsApi.amapJsApiStrings.error
  */
  trait SearchStatus extends StObject
  object SearchStatus {
    
    inline def complete: typingsJapgolly.amapJsApi.amapJsApiStrings.complete = "complete".asInstanceOf[typingsJapgolly.amapJsApi.amapJsApiStrings.complete]
    
    inline def error: typingsJapgolly.amapJsApi.amapJsApiStrings.error = "error".asInstanceOf[typingsJapgolly.amapJsApi.amapJsApiStrings.error]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.amapJsApi.amapJsApiStrings.gps
    - typingsJapgolly.amapJsApi.amapJsApiStrings.baidu
    - typingsJapgolly.amapJsApi.amapJsApiStrings.mapbar
  */
  trait Type extends StObject
  object Type {
    
    inline def baidu: typingsJapgolly.amapJsApi.amapJsApiStrings.baidu = "baidu".asInstanceOf[typingsJapgolly.amapJsApi.amapJsApiStrings.baidu]
    
    inline def gps: typingsJapgolly.amapJsApi.amapJsApiStrings.gps = "gps".asInstanceOf[typingsJapgolly.amapJsApi.amapJsApiStrings.gps]
    
    inline def mapbar: typingsJapgolly.amapJsApi.amapJsApiStrings.mapbar = "mapbar".asInstanceOf[typingsJapgolly.amapJsApi.amapJsApiStrings.mapbar]
  }
}
