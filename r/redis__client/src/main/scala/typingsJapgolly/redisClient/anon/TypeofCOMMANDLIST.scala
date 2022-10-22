package typingsJapgolly.redisClient.anon

import typingsJapgolly.redisClient.distLibCommandsCommandLISTMod.Filter
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofCOMMANDLIST extends StObject {
  
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  def transformArguments(): RedisCommandArguments = js.native
  def transformArguments(filter: Filter): RedisCommandArguments = js.native
  
  def transformReply(): js.Array[String] = js.native
}
