package typingsJapgolly.redisClient.anon

import typingsJapgolly.redisClient.distLibCommandsFunctionLISTWITHCODEMod.FunctionListWithCodeItemReply
import typingsJapgolly.redisClient.distLibCommandsFunctionLISTWITHCODEMod.FunctionListWithCodeRawItemReply
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofFUNCTIONLISTWITHC extends StObject {
  
  def transformArguments(): RedisCommandArguments = js.native
  def transformArguments(pattern: String): RedisCommandArguments = js.native
  
  def transformReply(reply: js.Array[FunctionListWithCodeRawItemReply]): js.Array[FunctionListWithCodeItemReply] = js.native
}
