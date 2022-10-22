package typingsJapgolly.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Phase2IntegrityAlgorithmsRequestListValue extends StObject {
  
  /**
    * The integrity algorithm.
    */
  var Value: js.UndefOr[String] = js.undefined
}
object Phase2IntegrityAlgorithmsRequestListValue {
  
  inline def apply(): Phase2IntegrityAlgorithmsRequestListValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Phase2IntegrityAlgorithmsRequestListValue]
  }
  
  extension [Self <: Phase2IntegrityAlgorithmsRequestListValue](x: Self) {
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
