package typingsJapgolly.redisBloom.anon

import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FIRSTKEYINDEX extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  def transformArguments(key: String, items: String): RedisCommandArguments = js.native
  def transformArguments(key: String, items: js.Array[String]): RedisCommandArguments = js.native
  @JSName("transformArguments")
  def transformArguments_Array(key: String, item: String): js.Array[String] = js.native
  
  def transformReply(): js.Array[Null | String] = js.native
  def transformReply(reply: Double): Boolean = js.native
}
