package typingsJapgolly.awsSdk.clientsCloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutManagedInsightRulesInput extends StObject {
  
  /**
    *  A list of ManagedRules to enable. 
    */
  var ManagedRules: typingsJapgolly.awsSdk.clientsCloudwatchMod.ManagedRules
}
object PutManagedInsightRulesInput {
  
  inline def apply(ManagedRules: ManagedRules): PutManagedInsightRulesInput = {
    val __obj = js.Dynamic.literal(ManagedRules = ManagedRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutManagedInsightRulesInput]
  }
  
  extension [Self <: PutManagedInsightRulesInput](x: Self) {
    
    inline def setManagedRules(value: ManagedRules): Self = StObject.set(x, "ManagedRules", value.asInstanceOf[js.Any])
    
    inline def setManagedRulesVarargs(value: ManagedRule*): Self = StObject.set(x, "ManagedRules", js.Array(value*))
  }
}
