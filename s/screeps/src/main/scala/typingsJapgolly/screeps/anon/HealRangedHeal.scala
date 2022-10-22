package typingsJapgolly.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HealRangedHeal extends StObject {
  
  var heal: typingsJapgolly.screeps.screepsInts.`4`
  
  var rangedHeal: typingsJapgolly.screeps.screepsInts.`4`
}
object HealRangedHeal {
  
  inline def apply(): HealRangedHeal = {
    val __obj = js.Dynamic.literal(heal = 4, rangedHeal = 4)
    __obj.asInstanceOf[HealRangedHeal]
  }
  
  extension [Self <: HealRangedHeal](x: Self) {
    
    inline def setHeal(value: typingsJapgolly.screeps.screepsInts.`4`): Self = StObject.set(x, "heal", value.asInstanceOf[js.Any])
    
    inline def setRangedHeal(value: typingsJapgolly.screeps.screepsInts.`4`): Self = StObject.set(x, "rangedHeal", value.asInstanceOf[js.Any])
  }
}
