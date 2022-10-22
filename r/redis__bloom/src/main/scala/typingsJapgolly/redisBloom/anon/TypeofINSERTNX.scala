package typingsJapgolly.redisBloom.anon

import typingsJapgolly.redisBloom.distCommandsCuckooMod.InsertOptions
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofINSERTNX extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  def transformArguments(key: String, items: String): RedisCommandArguments = js.native
  def transformArguments(key: String, items: String, options: InsertOptions): RedisCommandArguments = js.native
  def transformArguments(key: String, items: js.Array[String]): RedisCommandArguments = js.native
  def transformArguments(key: String, items: js.Array[String], options: InsertOptions): RedisCommandArguments = js.native
  
  def transformReply(reply: js.Array[Double]): js.Array[Boolean] = js.native
}
