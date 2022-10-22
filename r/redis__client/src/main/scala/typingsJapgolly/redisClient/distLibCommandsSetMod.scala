package typingsJapgolly.redisClient

import typingsJapgolly.redisClient.anon.KEEPTTL
import typingsJapgolly.redisClient.anon.NX
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArgument
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArguments
import typingsJapgolly.redisClient.redisClientBooleans.`true`
import typingsJapgolly.redisClient.redisClientStrings.EX
import typingsJapgolly.redisClient.redisClientStrings.EXAT
import typingsJapgolly.redisClient.redisClientStrings.PX
import typingsJapgolly.redisClient.redisClientStrings.PXAT
import typingsJapgolly.redisClient.redisClientStrings.XX
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsSetMod {
  
  @JSImport("@redis/client/dist/lib/commands/SET", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client/dist/lib/commands/SET", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  inline def transformArguments(key: RedisCommandArgument, value: Double): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(key: RedisCommandArgument, value: Double, options: SetOptions): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(key: RedisCommandArgument, value: RedisCommandArgument): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(key: RedisCommandArgument, value: RedisCommandArgument, options: SetOptions): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(): RedisCommandArgument | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[RedisCommandArgument | Null]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    K extends keyof T ? {[ P in K ]:? T[K]} & std.Partial<std.Record<std.Exclude<keyof T, K>, never>> : never
    }}}
    */
  @js.native
  trait MaximumOneOf[T, K /* <: /* keyof T */ String */] extends StObject
  
  trait SetCommonOptions extends StObject {
    
    var GET: js.UndefOr[`true`] = js.undefined
  }
  object SetCommonOptions {
    
    inline def apply(): SetCommonOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SetCommonOptions]
    }
    
    extension [Self <: SetCommonOptions](x: Self) {
      
      inline def setGET(value: `true`): Self = StObject.set(x, "GET", value.asInstanceOf[js.Any])
      
      inline def setGETUndefined: Self = StObject.set(x, "GET", js.undefined)
    }
  }
  
  type SetGuards = MaximumOneOf[
    NX, 
    /* keyof @redis/client.anon.NX */ typingsJapgolly.redisClient.redisClientStrings.NX | XX
  ]
  
  type SetOptions = SetTTL & SetGuards & SetCommonOptions
  
  type SetTTL = MaximumOneOf[
    KEEPTTL, 
    /* keyof @redis/client.anon.KEEPTTL */ EX | PX | EXAT | PXAT | typingsJapgolly.redisClient.redisClientStrings.KEEPTTL
  ]
}
