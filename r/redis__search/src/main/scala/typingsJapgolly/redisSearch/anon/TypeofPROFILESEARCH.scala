package typingsJapgolly.redisSearch.anon

import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArguments
import typingsJapgolly.redisSearch.distCommandsMod.ProfileOptions
import typingsJapgolly.redisSearch.distCommandsMod.ProfileReply
import typingsJapgolly.redisSearch.distCommandsProfileSEARCHMod.ProfileSearchRawReply
import typingsJapgolly.redisSearch.distCommandsSearchMod.SearchOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofPROFILESEARCH extends StObject {
  
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  def transformArguments(index: String, query: String): RedisCommandArguments = js.native
  def transformArguments(index: String, query: String, options: ProfileOptions & SearchOptions): RedisCommandArguments = js.native
  
  def transformReply(reply: ProfileSearchRawReply): ProfileReply = js.native
}
