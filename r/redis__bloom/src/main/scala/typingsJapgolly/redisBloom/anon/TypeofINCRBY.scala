package typingsJapgolly.redisBloom.anon

import typingsJapgolly.redisBloom.distCommandsCountMinSketchIncrbyMod.IncrByItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofINCRBY extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  def transformArguments(key: String, items: js.Array[IncrByItem]): js.Array[String] = js.native
  def transformArguments(key: String, items: IncrByItem): js.Array[String] = js.native
  
  def transformReply(): js.Array[Double] = js.native
}
