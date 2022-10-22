package typingsJapgolly.redisClient.anon

import typingsJapgolly.redisClient.distLibCommandsMigrateMod.MigrateOptions
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArgument
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofimportedMIGRATE extends StObject {
  
  def transformArguments(
    host: RedisCommandArgument,
    port: Double,
    key: js.Array[RedisCommandArgument],
    destinationDb: Double,
    timeout: Double
  ): RedisCommandArguments = js.native
  def transformArguments(
    host: RedisCommandArgument,
    port: Double,
    key: js.Array[RedisCommandArgument],
    destinationDb: Double,
    timeout: Double,
    options: MigrateOptions
  ): RedisCommandArguments = js.native
  def transformArguments(
    host: RedisCommandArgument,
    port: Double,
    key: RedisCommandArgument,
    destinationDb: Double,
    timeout: Double
  ): RedisCommandArguments = js.native
  def transformArguments(
    host: RedisCommandArgument,
    port: Double,
    key: RedisCommandArgument,
    destinationDb: Double,
    timeout: Double,
    options: MigrateOptions
  ): RedisCommandArguments = js.native
  
  def transformReply(): String = js.native
}
