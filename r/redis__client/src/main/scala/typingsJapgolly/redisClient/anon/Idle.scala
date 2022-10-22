package typingsJapgolly.redisClient.anon

import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArgument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Idle extends StObject {
  
  var idle: Double
  
  var name: RedisCommandArgument
  
  var pending: Double
}
object Idle {
  
  inline def apply(idle: Double, name: RedisCommandArgument, pending: Double): Idle = {
    val __obj = js.Dynamic.literal(idle = idle.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any])
    __obj.asInstanceOf[Idle]
  }
  
  extension [Self <: Idle](x: Self) {
    
    inline def setIdle(value: Double): Self = StObject.set(x, "idle", value.asInstanceOf[js.Any])
    
    inline def setName(value: RedisCommandArgument): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPending(value: Double): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
  }
}
