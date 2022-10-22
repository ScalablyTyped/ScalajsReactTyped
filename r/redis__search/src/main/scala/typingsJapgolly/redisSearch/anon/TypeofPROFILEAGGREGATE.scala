package typingsJapgolly.redisSearch.anon

import typingsJapgolly.redisSearch.distCommandsAggregateMod.AggregateOptions
import typingsJapgolly.redisSearch.distCommandsMod.ProfileOptions
import typingsJapgolly.redisSearch.distCommandsMod.ProfileReply
import typingsJapgolly.redisSearch.distCommandsProfileAGGREGATEMod.ProfileAggeregateRawReply
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofPROFILEAGGREGATE extends StObject {
  
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  def transformArguments(index: String, query: String): js.Array[String] = js.native
  def transformArguments(index: String, query: String, options: ProfileOptions & AggregateOptions): js.Array[String] = js.native
  
  def transformReply(reply: ProfileAggeregateRawReply): ProfileReply = js.native
}
