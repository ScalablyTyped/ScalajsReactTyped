package typingsJapgolly.redisBloom.anon

import typingsJapgolly.redisBloom.distCommandsBloomInfoMod.InfoRawReply
import typingsJapgolly.redisBloom.distCommandsBloomInfoMod.InfoReply
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransformArguments extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  def transformArguments(key: String): js.Array[String] = js.native
  
  def transformReply(reply: InfoRawReply): InfoReply = js.native
  def transformReply(reply: typingsJapgolly.redisBloom.distCommandsCountMinSketchInfoMod.InfoRawReply): typingsJapgolly.redisBloom.distCommandsCountMinSketchInfoMod.InfoReply = js.native
  def transformReply(reply: typingsJapgolly.redisBloom.distCommandsCuckooInfoMod.InfoRawReply): typingsJapgolly.redisBloom.distCommandsCuckooInfoMod.InfoReply = js.native
  def transformReply(reply: typingsJapgolly.redisBloom.distCommandsTopKInfoMod.InfoRawReply): typingsJapgolly.redisBloom.distCommandsTopKInfoMod.InfoReply = js.native
}
