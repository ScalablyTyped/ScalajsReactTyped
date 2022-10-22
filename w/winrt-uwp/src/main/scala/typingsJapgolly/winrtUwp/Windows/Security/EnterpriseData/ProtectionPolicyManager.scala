package typingsJapgolly.winrtUwp.Windows.Security.EnterpriseData

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Manages enterprise-protection policy on protected content. */
trait ProtectionPolicyManager extends StObject {
  
  /** Gets or sets the enterprise identity. */
  var identity: String
}
object ProtectionPolicyManager {
  
  inline def apply(identity: String): ProtectionPolicyManager = {
    val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtectionPolicyManager]
  }
  
  extension [Self <: ProtectionPolicyManager](x: Self) {
    
    inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
  }
}
