package typingsJapgolly.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RangedMassAttack extends StObject {
  
  var rangedAttack: typingsJapgolly.screeps.screepsInts.`3`
  
  var rangedMassAttack: typingsJapgolly.screeps.screepsInts.`3`
}
object RangedMassAttack {
  
  inline def apply(): RangedMassAttack = {
    val __obj = js.Dynamic.literal(rangedAttack = 3, rangedMassAttack = 3)
    __obj.asInstanceOf[RangedMassAttack]
  }
  
  extension [Self <: RangedMassAttack](x: Self) {
    
    inline def setRangedAttack(value: typingsJapgolly.screeps.screepsInts.`3`): Self = StObject.set(x, "rangedAttack", value.asInstanceOf[js.Any])
    
    inline def setRangedMassAttack(value: typingsJapgolly.screeps.screepsInts.`3`): Self = StObject.set(x, "rangedMassAttack", value.asInstanceOf[js.Any])
  }
}
