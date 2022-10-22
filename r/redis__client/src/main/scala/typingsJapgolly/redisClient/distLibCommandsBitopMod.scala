package typingsJapgolly.redisClient

import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArgument
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsBitopMod {
  
  @JSImport("@redis/client/dist/lib/commands/BITOP", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client/dist/lib/commands/BITOP", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 2 */ Double = js.native
  
  inline def transformArguments(operation: BitOperations, destKey: RedisCommandArgument, key: js.Array[RedisCommandArgument]): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(operation.asInstanceOf[js.Any], destKey.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(operation: BitOperations, destKey: RedisCommandArgument, key: RedisCommandArgument): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(operation.asInstanceOf[js.Any], destKey.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[Double]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.redisClient.redisClientStrings.AND
    - typingsJapgolly.redisClient.redisClientStrings.OR
    - typingsJapgolly.redisClient.redisClientStrings.XOR
    - typingsJapgolly.redisClient.redisClientStrings.NOT
  */
  trait BitOperations extends StObject
  object BitOperations {
    
    inline def AND: typingsJapgolly.redisClient.redisClientStrings.AND = "AND".asInstanceOf[typingsJapgolly.redisClient.redisClientStrings.AND]
    
    inline def NOT: typingsJapgolly.redisClient.redisClientStrings.NOT = "NOT".asInstanceOf[typingsJapgolly.redisClient.redisClientStrings.NOT]
    
    inline def OR: typingsJapgolly.redisClient.redisClientStrings.OR = "OR".asInstanceOf[typingsJapgolly.redisClient.redisClientStrings.OR]
    
    inline def XOR: typingsJapgolly.redisClient.redisClientStrings.XOR = "XOR".asInstanceOf[typingsJapgolly.redisClient.redisClientStrings.XOR]
  }
}
