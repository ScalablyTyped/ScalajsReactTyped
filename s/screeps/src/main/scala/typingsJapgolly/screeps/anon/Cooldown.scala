package typingsJapgolly.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cooldown extends StObject {
  
  /**
    * Cooldown ticks remaining, or undefined if the power creep is not spawned in the world.
    */
  var cooldown: js.UndefOr[Double] = js.undefined
  
  /**
    * Current level of the power
    */
  var level: Double
}
object Cooldown {
  
  inline def apply(level: Double): Cooldown = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cooldown]
  }
  
  extension [Self <: Cooldown](x: Self) {
    
    inline def setCooldown(value: Double): Self = StObject.set(x, "cooldown", value.asInstanceOf[js.Any])
    
    inline def setCooldownUndefined: Self = StObject.set(x, "cooldown", js.undefined)
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
  }
}
