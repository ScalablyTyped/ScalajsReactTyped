package typingsJapgolly.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SampleValue extends StObject {
  
  /**
    * The value that can be used for a slot type.
    */
  var value: Value
}
object SampleValue {
  
  inline def apply(value: Value): SampleValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SampleValue]
  }
  
  extension [Self <: SampleValue](x: Self) {
    
    inline def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
