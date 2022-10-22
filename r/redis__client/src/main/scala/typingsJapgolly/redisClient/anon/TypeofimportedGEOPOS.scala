package typingsJapgolly.redisClient.anon

import typingsJapgolly.redisClient.distLibCommandsGeoposMod.GeoCoordinates
import typingsJapgolly.redisClient.distLibCommandsGeoposMod.GeoCoordinatesRawReply
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArgument
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofimportedGEOPOS extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  def transformArguments(key: RedisCommandArgument, member: js.Array[RedisCommandArgument]): RedisCommandArguments = js.native
  def transformArguments(key: RedisCommandArgument, member: RedisCommandArgument): RedisCommandArguments = js.native
  
  def transformReply(reply: GeoCoordinatesRawReply): js.Array[GeoCoordinates | Null] = js.native
}
