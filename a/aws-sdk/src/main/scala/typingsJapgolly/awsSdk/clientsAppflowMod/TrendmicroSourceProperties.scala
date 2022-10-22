package typingsJapgolly.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrendmicroSourceProperties extends StObject {
  
  /**
    *  The object specified in the Trend Micro flow source. 
    */
  var `object`: Object
}
object TrendmicroSourceProperties {
  
  inline def apply(`object`: Object): TrendmicroSourceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrendmicroSourceProperties]
  }
  
  extension [Self <: TrendmicroSourceProperties](x: Self) {
    
    inline def setObject(value: Object): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
  }
}
