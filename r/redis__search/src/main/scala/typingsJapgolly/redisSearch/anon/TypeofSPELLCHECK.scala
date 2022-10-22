package typingsJapgolly.redisSearch.anon

import typingsJapgolly.redisSearch.distCommandsSpellcheckMod.SpellCheckOptions
import typingsJapgolly.redisSearch.distCommandsSpellcheckMod.SpellCheckRawReply
import typingsJapgolly.redisSearch.distCommandsSpellcheckMod.SpellCheckReply
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofSPELLCHECK extends StObject {
  
  def transformArguments(index: String, query: String): js.Array[String] = js.native
  def transformArguments(index: String, query: String, options: SpellCheckOptions): js.Array[String] = js.native
  
  def transformReply(rawReply: SpellCheckRawReply): SpellCheckReply = js.native
}
