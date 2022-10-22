package typingsJapgolly.redisClient

import typingsJapgolly.redisClient.distLibCommandsGenericTransformersMod.GeoCoordinates
import typingsJapgolly.redisClient.distLibCommandsGenericTransformersMod.GeoRadiusStoreOptions
import typingsJapgolly.redisClient.distLibCommandsGenericTransformersMod.GeoUnits
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArgument
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsGeoradiusstoreMod {
  
  @JSImport("@redis/client/dist/lib/commands/GEORADIUSSTORE", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client/dist/lib/commands/GEORADIUSSTORE", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  @JSImport("@redis/client/dist/lib/commands/GEORADIUSSTORE", "IS_READ_ONLY")
  @js.native
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  inline def transformArguments(
    key: RedisCommandArgument,
    coordinates: GeoCoordinates,
    radius: Double,
    unit: GeoUnits,
    destination: RedisCommandArgument
  ): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], coordinates.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], unit.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(
    key: RedisCommandArgument,
    coordinates: GeoCoordinates,
    radius: Double,
    unit: GeoUnits,
    destination: RedisCommandArgument,
    options: GeoRadiusStoreOptions
  ): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], coordinates.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], unit.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[Double]
}
