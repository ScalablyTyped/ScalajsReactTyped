package typingsJapgolly.redisClient

import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArgument
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsGetexMod {
  
  @JSImport("@redis/client/dist/lib/commands/GETEX", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client/dist/lib/commands/GETEX", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  inline def transformArguments(key: RedisCommandArgument, mode: GetExModes): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(): RedisCommandArgument | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[RedisCommandArgument | Null]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.redisClient.anon.EX
    - typingsJapgolly.redisClient.anon.PX
    - typingsJapgolly.redisClient.anon.EXAT
    - typingsJapgolly.redisClient.anon.PXAT
    - typingsJapgolly.redisClient.anon.PERSIST
  */
  trait GetExModes extends StObject
  object GetExModes {
    
    inline def EX(EX: Double): typingsJapgolly.redisClient.anon.EX = {
      val __obj = js.Dynamic.literal(EX = EX.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.redisClient.anon.EX]
    }
    
    inline def EXAT(EXAT: Double | js.Date): typingsJapgolly.redisClient.anon.EXAT = {
      val __obj = js.Dynamic.literal(EXAT = EXAT.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.redisClient.anon.EXAT]
    }
    
    inline def PERSIST(): typingsJapgolly.redisClient.anon.PERSIST = {
      val __obj = js.Dynamic.literal(PERSIST = true)
      __obj.asInstanceOf[typingsJapgolly.redisClient.anon.PERSIST]
    }
    
    inline def PX(PX: Double): typingsJapgolly.redisClient.anon.PX = {
      val __obj = js.Dynamic.literal(PX = PX.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.redisClient.anon.PX]
    }
    
    inline def PXAT(PXAT: Double | js.Date): typingsJapgolly.redisClient.anon.PXAT = {
      val __obj = js.Dynamic.literal(PXAT = PXAT.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.redisClient.anon.PXAT]
    }
  }
}
