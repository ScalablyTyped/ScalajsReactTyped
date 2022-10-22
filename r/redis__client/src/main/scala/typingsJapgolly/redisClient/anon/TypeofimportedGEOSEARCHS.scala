package typingsJapgolly.redisClient.anon

import typingsJapgolly.redisClient.distLibCommandsGenericTransformersMod.GeoSearchBy
import typingsJapgolly.redisClient.distLibCommandsGenericTransformersMod.GeoSearchFrom
import typingsJapgolly.redisClient.distLibCommandsGeosearchstoreMod.GeoSearchStoreOptions
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArgument
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofimportedGEOSEARCHS extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  def transformArguments(
    destination: RedisCommandArgument,
    source: RedisCommandArgument,
    from: GeoSearchFrom,
    by: GeoSearchBy
  ): RedisCommandArguments = js.native
  def transformArguments(
    destination: RedisCommandArgument,
    source: RedisCommandArgument,
    from: GeoSearchFrom,
    by: GeoSearchBy,
    options: GeoSearchStoreOptions
  ): RedisCommandArguments = js.native
  
  def transformReply(reply: Double): Double = js.native
}
