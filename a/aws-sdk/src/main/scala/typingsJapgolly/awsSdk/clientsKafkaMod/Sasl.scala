package typingsJapgolly.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sasl extends StObject {
  
  /**
    * 
    Indicates whether IAM access control is enabled.
    
    */
  var Iam: js.UndefOr[typingsJapgolly.awsSdk.clientsKafkaMod.Iam] = js.undefined
  
  /**
    * 
    Details for SASL/SCRAM client authentication.
    
    */
  var Scram: js.UndefOr[typingsJapgolly.awsSdk.clientsKafkaMod.Scram] = js.undefined
}
object Sasl {
  
  inline def apply(): Sasl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sasl]
  }
  
  extension [Self <: Sasl](x: Self) {
    
    inline def setIam(value: Iam): Self = StObject.set(x, "Iam", value.asInstanceOf[js.Any])
    
    inline def setIamUndefined: Self = StObject.set(x, "Iam", js.undefined)
    
    inline def setScram(value: Scram): Self = StObject.set(x, "Scram", value.asInstanceOf[js.Any])
    
    inline def setScramUndefined: Self = StObject.set(x, "Scram", js.undefined)
  }
}
