package typingsJapgolly.redisSearch.anon

import typingsJapgolly.redisSearch.distCommandsDropindexMod.DropIndexOptions
import typingsJapgolly.redisSearch.redisSearchStrings.OK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofDROPINDEX extends StObject {
  
  def transformArguments(index: String): js.Array[String] = js.native
  def transformArguments(index: String, options: DropIndexOptions): js.Array[String] = js.native
  
  def transformReply(): OK = js.native
}
