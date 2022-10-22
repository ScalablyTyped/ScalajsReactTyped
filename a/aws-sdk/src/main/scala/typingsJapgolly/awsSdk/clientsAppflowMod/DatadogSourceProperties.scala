package typingsJapgolly.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatadogSourceProperties extends StObject {
  
  /**
    *  The object specified in the Datadog flow source. 
    */
  var `object`: Object
}
object DatadogSourceProperties {
  
  inline def apply(`object`: Object): DatadogSourceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatadogSourceProperties]
  }
  
  extension [Self <: DatadogSourceProperties](x: Self) {
    
    inline def setObject(value: Object): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
  }
}
