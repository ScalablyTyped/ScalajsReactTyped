package typingsJapgolly.redisClient

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.redisClient.distLibLuaScriptMod.RedisScriptConfig
import typingsJapgolly.redisClient.distLibLuaScriptMod.SHA1
import typingsJapgolly.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    Type extends @redis/client.@redis/client/dist/lib/commands.RedisCommandArgument ? Type extends string & ToType ? Type : ToType : Type extends std.Set<infer Member> ? std.Set<@redis/client.@redis/client/dist/lib/commands.ConvertArgumentType<Member, ToType>> : Type extends std.Map<infer Key, infer Value> ? std.Map<Key, @redis/client.@redis/client/dist/lib/commands.ConvertArgumentType<Value, ToType>> : Type extends std.Array<infer Member> ? std.Array<@redis/client.@redis/client/dist/lib/commands.ConvertArgumentType<Member, ToType>> : Type extends std.Date ? Type : Type extends std.Record<std.PropertyKey, any> ? {[ Property in keyof Type ]: @redis/client.@redis/client/dist/lib/commands.ConvertArgumentType<Type[Property], ToType>} : Type
    }}}
    */
  @js.native
  trait ConvertArgumentType[Type, ToType] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    string extends S ? never : S
    }}}
    */
  @js.native
  trait ExcludeMappedString[S] extends StObject
  
  trait RedisCommand extends StObject {
    
    var FIRST_KEY_INDEX: js.UndefOr[Double | (js.Function1[/* repeated */ Any, js.UndefOr[RedisCommandArgument]])] = js.undefined
    
    var IS_READ_ONLY: js.UndefOr[Boolean] = js.undefined
    
    def transformArguments(args: Any*): RedisCommandArguments
    
    var transformReply: js.UndefOr[
        js.ThisFunction2[/* this */ Unit, /* reply */ Any, /* preserved */ js.UndefOr[Any], Any]
      ] = js.undefined
  }
  object RedisCommand {
    
    inline def apply(transformArguments: /* repeated */ Any => RedisCommandArguments): RedisCommand = {
      val __obj = js.Dynamic.literal(transformArguments = js.Any.fromFunction1(transformArguments))
      __obj.asInstanceOf[RedisCommand]
    }
    
    extension [Self <: RedisCommand](x: Self) {
      
      inline def setFIRST_KEY_INDEX(value: Double | (js.Function1[/* repeated */ Any, js.UndefOr[RedisCommandArgument]])): Self = StObject.set(x, "FIRST_KEY_INDEX", value.asInstanceOf[js.Any])
      
      inline def setFIRST_KEY_INDEXFunction1(value: /* repeated */ Any => js.UndefOr[RedisCommandArgument]): Self = StObject.set(x, "FIRST_KEY_INDEX", js.Any.fromFunction1(value))
      
      inline def setFIRST_KEY_INDEXUndefined: Self = StObject.set(x, "FIRST_KEY_INDEX", js.undefined)
      
      inline def setIS_READ_ONLY(value: Boolean): Self = StObject.set(x, "IS_READ_ONLY", value.asInstanceOf[js.Any])
      
      inline def setIS_READ_ONLYUndefined: Self = StObject.set(x, "IS_READ_ONLY", js.undefined)
      
      inline def setTransformArguments(value: /* repeated */ Any => RedisCommandArguments): Self = StObject.set(x, "transformArguments", js.Any.fromFunction1(value))
      
      inline def setTransformReply(value: js.ThisFunction2[/* this */ Unit, /* reply */ Any, /* preserved */ js.UndefOr[Any], Any]): Self = StObject.set(x, "transformReply", value.asInstanceOf[js.Any])
      
      inline def setTransformReplyUndefined: Self = StObject.set(x, "transformReply", js.undefined)
    }
  }
  
  type RedisCommandArgument = String | Buffer
  
  @js.native
  trait RedisCommandArguments
    extends StObject
       with Array[RedisCommandArgument] {
    
    var preserve: js.UndefOr[Any] = js.native
  }
  
  type RedisCommandRawReply = js.UndefOr[String | Double | Buffer | Null | js.Array[Any]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    C['transformReply'] extends (args : any): infer T ? T : @redis/client.@redis/client/dist/lib/commands.RedisCommandRawReply
    }}}
    */
  @js.native
  trait RedisCommandReply[C /* <: RedisCommand */] extends StObject
  
  type RedisCommandSignature[Command /* <: RedisCommand */, Params /* <: js.Array[Any] */] = js.Function1[
    /* args */ Params | (/* import warning: importer.ImportType#apply c repeated non-array type: Params */ /* rest */ js.Array[Params]), 
    js.Promise[
      ConvertArgumentType[
        RedisCommandReply[Command], 
        /* import warning: importer.ImportType#apply Failed type conversion: @redis/client.anon.CommandOptionsClientComma['returnBuffers'] extends true ? node.buffer.<global>.Buffer : string */ js.Any
      ]
    ]
  ]
  
  type RedisCommands = StringDictionary[RedisCommand]
  
  trait RedisExtensions[M /* <: RedisModules */, F /* <: RedisFunctions */, S /* <: RedisScripts */] extends StObject {
    
    var functions: js.UndefOr[F] = js.undefined
    
    var modules: js.UndefOr[M] = js.undefined
    
    var scripts: js.UndefOr[S] = js.undefined
  }
  object RedisExtensions {
    
    inline def apply[M /* <: RedisModules */, F /* <: RedisFunctions */, S /* <: RedisScripts */](): RedisExtensions[M, F, S] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RedisExtensions[M, F, S]]
    }
    
    extension [Self <: RedisExtensions[?, ?, ?], M /* <: RedisModules */, F /* <: RedisFunctions */, S /* <: RedisScripts */](x: Self & (RedisExtensions[M, F, S])) {
      
      inline def setFunctions(value: F): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
      
      inline def setFunctionsUndefined: Self = StObject.set(x, "functions", js.undefined)
      
      inline def setModules(value: M): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
      
      inline def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
      
      inline def setScripts(value: S): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
      
      inline def setScriptsUndefined: Self = StObject.set(x, "scripts", js.undefined)
    }
  }
  
  trait RedisFunction
    extends StObject
       with RedisCommand {
    
    var NUMBER_OF_KEYS: js.UndefOr[Double] = js.undefined
  }
  object RedisFunction {
    
    inline def apply(transformArguments: /* repeated */ Any => RedisCommandArguments): RedisFunction = {
      val __obj = js.Dynamic.literal(transformArguments = js.Any.fromFunction1(transformArguments))
      __obj.asInstanceOf[RedisFunction]
    }
    
    extension [Self <: RedisFunction](x: Self) {
      
      inline def setNUMBER_OF_KEYS(value: Double): Self = StObject.set(x, "NUMBER_OF_KEYS", value.asInstanceOf[js.Any])
      
      inline def setNUMBER_OF_KEYSUndefined: Self = StObject.set(x, "NUMBER_OF_KEYS", js.undefined)
    }
  }
  
  type RedisFunctionLibrary = StringDictionary[RedisFunction]
  
  type RedisFunctions = StringDictionary[RedisFunctionLibrary]
  
  type RedisModule = StringDictionary[RedisCommand]
  
  type RedisModules = StringDictionary[RedisModule]
  
  trait RedisScript
    extends StObject
       with RedisScriptConfig
       with SHA1
  object RedisScript {
    
    inline def apply(SCRIPT: String, SHA1: String, transformArguments: /* repeated */ Any => RedisCommandArguments): RedisScript = {
      val __obj = js.Dynamic.literal(SCRIPT = SCRIPT.asInstanceOf[js.Any], SHA1 = SHA1.asInstanceOf[js.Any], transformArguments = js.Any.fromFunction1(transformArguments))
      __obj.asInstanceOf[RedisScript]
    }
  }
  
  type RedisScripts = StringDictionary[RedisScript]
}
