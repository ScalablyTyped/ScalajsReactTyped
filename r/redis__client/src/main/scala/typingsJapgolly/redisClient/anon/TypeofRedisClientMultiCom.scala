package typingsJapgolly.redisClient.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.redisClient.distLibClientMultiCommandMod.InstantiableRedisMultiCommand
import typingsJapgolly.redisClient.distLibClientMultiCommandMod.RedisClientMultiCommand
import typingsJapgolly.redisClient.distLibClientMultiCommandMod.RedisClientMultiExecutor
import typingsJapgolly.redisClient.distLibCommandsMod.RedisExtensions
import typingsJapgolly.redisClient.distLibCommandsMod.RedisFunctions
import typingsJapgolly.redisClient.distLibCommandsMod.RedisModules
import typingsJapgolly.redisClient.distLibCommandsMod.RedisScripts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofRedisClientMultiCom
  extends StObject
     with Instantiable1[/* executor */ RedisClientMultiExecutor, RedisClientMultiCommand]
     with Instantiable2[
      /* executor */ RedisClientMultiExecutor, 
      /* legacyMode */ Boolean, 
      RedisClientMultiCommand
    ] {
  
  def extend[M /* <: RedisModules */, F /* <: RedisFunctions */, S /* <: RedisScripts */](): InstantiableRedisMultiCommand[M, F, S] = js.native
  def extend[M /* <: RedisModules */, F /* <: RedisFunctions */, S /* <: RedisScripts */](extensions: RedisExtensions[M, F, S]): InstantiableRedisMultiCommand[M, F, S] = js.native
}
