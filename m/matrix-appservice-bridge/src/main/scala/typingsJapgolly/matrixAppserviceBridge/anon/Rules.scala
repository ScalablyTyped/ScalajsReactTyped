package typingsJapgolly.matrixAppserviceBridge.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rules extends StObject {
  
  var rules: typingsJapgolly.matrixAppserviceBridge.libComponentsRoomLinkValidatorMod.Rules
}
object Rules {
  
  inline def apply(rules: typingsJapgolly.matrixAppserviceBridge.libComponentsRoomLinkValidatorMod.Rules): Rules = {
    val __obj = js.Dynamic.literal(rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rules]
  }
  
  extension [Self <: Rules](x: Self) {
    
    inline def setRules(value: typingsJapgolly.matrixAppserviceBridge.libComponentsRoomLinkValidatorMod.Rules): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
  }
}
