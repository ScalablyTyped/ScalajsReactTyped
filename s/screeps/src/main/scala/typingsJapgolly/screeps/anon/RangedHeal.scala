package typingsJapgolly.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RangedHeal extends StObject {
  
  var heal: typingsJapgolly.screeps.screepsInts.`3`
  
  var rangedHeal: typingsJapgolly.screeps.screepsInts.`3`
}
object RangedHeal {
  
  inline def apply(): RangedHeal = {
    val __obj = js.Dynamic.literal(heal = 3, rangedHeal = 3)
    __obj.asInstanceOf[RangedHeal]
  }
  
  extension [Self <: RangedHeal](x: Self) {
    
    inline def setHeal(value: typingsJapgolly.screeps.screepsInts.`3`): Self = StObject.set(x, "heal", value.asInstanceOf[js.Any])
    
    inline def setRangedHeal(value: typingsJapgolly.screeps.screepsInts.`3`): Self = StObject.set(x, "rangedHeal", value.asInstanceOf[js.Any])
  }
}
