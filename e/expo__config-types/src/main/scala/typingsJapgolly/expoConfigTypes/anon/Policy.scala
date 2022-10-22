package typingsJapgolly.expoConfigTypes.anon

import typingsJapgolly.expoConfigTypes.mod.RuntimeVersionPolicy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Policy extends StObject {
  
  var policy: RuntimeVersionPolicy
}
object Policy {
  
  inline def apply(policy: RuntimeVersionPolicy): Policy = {
    val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Policy]
  }
  
  extension [Self <: Policy](x: Self) {
    
    inline def setPolicy(value: RuntimeVersionPolicy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
  }
}
