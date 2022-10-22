package typingsJapgolly.redisClient

import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArgument
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsLinsertMod {
  
  @JSImport("@redis/client/dist/lib/commands/LINSERT", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client/dist/lib/commands/LINSERT", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  inline def transformArguments(
    key: RedisCommandArgument,
    position: LInsertPosition,
    pivot: RedisCommandArgument,
    element: RedisCommandArgument
  ): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], position.asInstanceOf[js.Any], pivot.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[Double]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.redisClient.redisClientStrings.BEFORE
    - typingsJapgolly.redisClient.redisClientStrings.AFTER
  */
  trait LInsertPosition extends StObject
  object LInsertPosition {
    
    inline def AFTER: typingsJapgolly.redisClient.redisClientStrings.AFTER = "AFTER".asInstanceOf[typingsJapgolly.redisClient.redisClientStrings.AFTER]
    
    inline def BEFORE: typingsJapgolly.redisClient.redisClientStrings.BEFORE = "BEFORE".asInstanceOf[typingsJapgolly.redisClient.redisClientStrings.BEFORE]
  }
}
