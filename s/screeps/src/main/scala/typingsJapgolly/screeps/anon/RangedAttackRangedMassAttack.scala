package typingsJapgolly.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RangedAttackRangedMassAttack extends StObject {
  
  var rangedAttack: typingsJapgolly.screeps.screepsInts.`4`
  
  var rangedMassAttack: typingsJapgolly.screeps.screepsInts.`4`
}
object RangedAttackRangedMassAttack {
  
  inline def apply(): RangedAttackRangedMassAttack = {
    val __obj = js.Dynamic.literal(rangedAttack = 4, rangedMassAttack = 4)
    __obj.asInstanceOf[RangedAttackRangedMassAttack]
  }
  
  extension [Self <: RangedAttackRangedMassAttack](x: Self) {
    
    inline def setRangedAttack(value: typingsJapgolly.screeps.screepsInts.`4`): Self = StObject.set(x, "rangedAttack", value.asInstanceOf[js.Any])
    
    inline def setRangedMassAttack(value: typingsJapgolly.screeps.screepsInts.`4`): Self = StObject.set(x, "rangedMassAttack", value.asInstanceOf[js.Any])
  }
}
