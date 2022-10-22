package typingsJapgolly.redisSearch.anon

import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArguments
import typingsJapgolly.redisSearch.distCommandsSynupdateMod.SynUpdateOptions
import typingsJapgolly.redisSearch.redisSearchStrings.OK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofSYNUPDATE extends StObject {
  
  def transformArguments(index: String, groupId: String, terms: String): RedisCommandArguments = js.native
  def transformArguments(index: String, groupId: String, terms: String, options: SynUpdateOptions): RedisCommandArguments = js.native
  def transformArguments(index: String, groupId: String, terms: js.Array[String]): RedisCommandArguments = js.native
  def transformArguments(index: String, groupId: String, terms: js.Array[String], options: SynUpdateOptions): RedisCommandArguments = js.native
  
  def transformReply(): OK = js.native
}
