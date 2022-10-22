package typingsJapgolly.redisClient.anon

import typingsJapgolly.redisClient.distLibCommandsGenericTransformersMod.StreamsMessagesReply
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArgument
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArguments
import typingsJapgolly.redisClient.distLibCommandsXreadMod.XReadOptions
import typingsJapgolly.redisClient.distLibCommandsXreadMod.XReadStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofimportedXREAD extends StObject {
  
  def FIRST_KEY_INDEX(streams: js.Array[XReadStream]): RedisCommandArgument = js.native
  def FIRST_KEY_INDEX(streams: XReadStream): RedisCommandArgument = js.native
  
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  def transformArguments(streams: js.Array[XReadStream]): RedisCommandArguments = js.native
  def transformArguments(streams: js.Array[XReadStream], options: XReadOptions): RedisCommandArguments = js.native
  def transformArguments(streams: XReadStream): RedisCommandArguments = js.native
  def transformArguments(streams: XReadStream, options: XReadOptions): RedisCommandArguments = js.native
  
  def transformReply(): StreamsMessagesReply | Null = js.native
  def transformReply(reply: js.Array[Any]): StreamsMessagesReply | Null = js.native
}
