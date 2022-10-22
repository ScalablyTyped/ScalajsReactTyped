package typingsJapgolly.redisClient.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.redisClient.distLibClusterMultiCommandMod.InstantiableRedisClusterMultiCommandType
import typingsJapgolly.redisClient.distLibClusterMultiCommandMod.RedisClusterMultiCommand
import typingsJapgolly.redisClient.distLibClusterMultiCommandMod.RedisClusterMultiExecutor
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArgument
import typingsJapgolly.redisClient.distLibCommandsMod.RedisExtensions
import typingsJapgolly.redisClient.distLibCommandsMod.RedisFunctions
import typingsJapgolly.redisClient.distLibCommandsMod.RedisModules
import typingsJapgolly.redisClient.distLibCommandsMod.RedisScripts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofRedisClusterMultiCo
  extends StObject
     with Instantiable1[/* executor */ RedisClusterMultiExecutor, RedisClusterMultiCommand]
     with Instantiable2[
      /* executor */ RedisClusterMultiExecutor, 
      /* firstKey */ RedisCommandArgument, 
      RedisClusterMultiCommand
    ] {
  
  def extend[M /* <: RedisModules */, F /* <: RedisFunctions */, S /* <: RedisScripts */](): InstantiableRedisClusterMultiCommandType[M, F, S] = js.native
  def extend[M /* <: RedisModules */, F /* <: RedisFunctions */, S /* <: RedisScripts */](extensions: RedisExtensions[M, F, S]): InstantiableRedisClusterMultiCommandType[M, F, S] = js.native
}
