package typingsJapgolly.redisClient.anon

import typingsJapgolly.redisClient.distLibCommandsGenericTransformersMod.BitValue
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArgument
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArguments
import typingsJapgolly.redisClient.redisClientStrings.BIT
import typingsJapgolly.redisClient.redisClientStrings.BYTE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofBITPOS extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  def transformArguments(key: RedisCommandArgument, bit: BitValue): RedisCommandArguments = js.native
  def transformArguments(key: RedisCommandArgument, bit: BitValue, start: Double): RedisCommandArguments = js.native
  def transformArguments(key: RedisCommandArgument, bit: BitValue, start: Double, end: Double): RedisCommandArguments = js.native
  def transformArguments(key: RedisCommandArgument, bit: BitValue, start: Double, end: Double, mode: BYTE | BIT): RedisCommandArguments = js.native
  def transformArguments(key: RedisCommandArgument, bit: BitValue, start: Double, end: Unit, mode: BYTE | BIT): RedisCommandArguments = js.native
  def transformArguments(key: RedisCommandArgument, bit: BitValue, start: Unit, end: Double): RedisCommandArguments = js.native
  def transformArguments(key: RedisCommandArgument, bit: BitValue, start: Unit, end: Double, mode: BYTE | BIT): RedisCommandArguments = js.native
  def transformArguments(key: RedisCommandArgument, bit: BitValue, start: Unit, end: Unit, mode: BYTE | BIT): RedisCommandArguments = js.native
  
  def transformReply(): Double = js.native
}
