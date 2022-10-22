package typingsJapgolly.screeps.anon

import typingsJapgolly.screeps.EventAttackType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttackType extends StObject {
  
  var attackType: EventAttackType
  
  var damage: Double
  
  var targetId: String
}
object AttackType {
  
  inline def apply(attackType: EventAttackType, damage: Double, targetId: String): AttackType = {
    val __obj = js.Dynamic.literal(attackType = attackType.asInstanceOf[js.Any], damage = damage.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttackType]
  }
  
  extension [Self <: AttackType](x: Self) {
    
    inline def setAttackType(value: EventAttackType): Self = StObject.set(x, "attackType", value.asInstanceOf[js.Any])
    
    inline def setDamage(value: Double): Self = StObject.set(x, "damage", value.asInstanceOf[js.Any])
    
    inline def setTargetId(value: String): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
  }
}
