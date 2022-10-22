package typingsJapgolly.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Heal extends StObject {
  
  var heal: typingsJapgolly.screeps.screepsInts.`2`
  
  var rangedHeal: typingsJapgolly.screeps.screepsInts.`2`
}
object Heal {
  
  inline def apply(): Heal = {
    val __obj = js.Dynamic.literal(heal = 2, rangedHeal = 2)
    __obj.asInstanceOf[Heal]
  }
  
  extension [Self <: Heal](x: Self) {
    
    inline def setHeal(value: typingsJapgolly.screeps.screepsInts.`2`): Self = StObject.set(x, "heal", value.asInstanceOf[js.Any])
    
    inline def setRangedHeal(value: typingsJapgolly.screeps.screepsInts.`2`): Self = StObject.set(x, "rangedHeal", value.asInstanceOf[js.Any])
  }
}
