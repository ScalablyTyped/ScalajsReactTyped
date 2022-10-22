package typingsJapgolly.redisClient.anon

import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArguments
import typingsJapgolly.redisClient.redisClientStrings.ALL
import typingsJapgolly.redisClient.redisClientStrings.OK
import typingsJapgolly.redisClient.redisClientStrings.WRITE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofCLIENTPAUSE extends StObject {
  
  def transformArguments(timeout: Double): RedisCommandArguments = js.native
  def transformArguments(timeout: Double, mode: WRITE | ALL): RedisCommandArguments = js.native
  
  def transformReply(): OK | Buffer = js.native
}
