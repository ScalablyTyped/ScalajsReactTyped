package typingsJapgolly.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attack extends StObject {
  
  var attack: typingsJapgolly.screeps.screepsInts.`2`
}
object Attack {
  
  inline def apply(): Attack = {
    val __obj = js.Dynamic.literal(attack = 2)
    __obj.asInstanceOf[Attack]
  }
  
  extension [Self <: Attack](x: Self) {
    
    inline def setAttack(value: typingsJapgolly.screeps.screepsInts.`2`): Self = StObject.set(x, "attack", value.asInstanceOf[js.Any])
  }
}
