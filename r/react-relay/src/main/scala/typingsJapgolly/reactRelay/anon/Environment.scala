package typingsJapgolly.reactRelay.anon

import typingsJapgolly.reactRelay.reactRelayStrings.reset
import typingsJapgolly.reactRelay.relayHooksUseRefetchableFragmentNodeMod.Action
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Environment
  extends StObject
     with Action {
  
  var environment: typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.Environment
  
  var fragmentIdentifier: String
  
  var `type`: reset
}
object Environment {
  
  inline def apply(
    environment: typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.Environment,
    fragmentIdentifier: String
  ): Environment = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], fragmentIdentifier = fragmentIdentifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("reset")
    __obj.asInstanceOf[Environment]
  }
  
  extension [Self <: Environment](x: Self) {
    
    inline def setEnvironment(value: typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.Environment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setFragmentIdentifier(value: String): Self = StObject.set(x, "fragmentIdentifier", value.asInstanceOf[js.Any])
    
    inline def setType(value: reset): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
