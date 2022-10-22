package typingsJapgolly.cryptex

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DataKey extends StObject {
    
    var dataKey: js.UndefOr[String] = js.undefined
    
    var region: js.UndefOr[String] = js.undefined
  }
  object DataKey {
    
    inline def apply(): DataKey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataKey]
    }
    
    extension [Self <: DataKey](x: Self) {
      
      inline def setDataKey(value: String): Self = StObject.set(x, "dataKey", value.asInstanceOf[js.Any])
      
      inline def setDataKeyUndefined: Self = StObject.set(x, "dataKey", js.undefined)
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    }
  }
}
