package typingsJapgolly.amapJsApiAutocomplete

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Info extends StObject {
    
    var info: String
  }
  object Info {
    
    inline def apply(info: String): Info = {
      val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any])
      __obj.asInstanceOf[Info]
    }
    
    extension [Self <: Info](x: Self) {
      
      inline def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    }
  }
  
  trait Tip extends StObject {
    
    var tip: typingsJapgolly.amapJsApiAutocomplete.AMap.Autocomplete.Tip
  }
  object Tip {
    
    inline def apply(tip: typingsJapgolly.amapJsApiAutocomplete.AMap.Autocomplete.Tip): Tip = {
      val __obj = js.Dynamic.literal(tip = tip.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tip]
    }
    
    extension [Self <: Tip](x: Self) {
      
      inline def setTip(value: typingsJapgolly.amapJsApiAutocomplete.AMap.Autocomplete.Tip): Self = StObject.set(x, "tip", value.asInstanceOf[js.Any])
    }
  }
}
