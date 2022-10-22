package typingsJapgolly.redisClient.anon

import typingsJapgolly.redisClient.distLibCommandsHelloMod.HelloOptions
import typingsJapgolly.redisClient.distLibCommandsHelloMod.HelloRawReply
import typingsJapgolly.redisClient.distLibCommandsHelloMod.HelloTransformedReply
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofHELLO extends StObject {
  
  def transformArguments(): RedisCommandArguments = js.native
  def transformArguments(options: HelloOptions): RedisCommandArguments = js.native
  
  def transformReply(reply: HelloRawReply): HelloTransformedReply = js.native
}
