package typingsJapgolly.redisBloom.anon

import typingsJapgolly.redisBloom.distCommandsCuckooReserveMod.ReserveOptions
import typingsJapgolly.redisBloom.redisBloomStrings.OK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FIRSTKEYINDEXISREADONLY extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  def transformArguments(key: String, capacity: Double, options: ReserveOptions): js.Array[String] = js.native
  def transformArguments(key: String, errorRate: Double, capacity: Double): js.Array[String] = js.native
  def transformArguments(
    key: String,
    errorRate: Double,
    capacity: Double,
    options: typingsJapgolly.redisBloom.distCommandsBloomReserveMod.ReserveOptions
  ): js.Array[String] = js.native
  def transformArguments(key: String, topK: Double): js.Array[String] = js.native
  def transformArguments(
    key: String,
    topK: Double,
    options: typingsJapgolly.redisBloom.distCommandsTopKReserveMod.ReserveOptions
  ): js.Array[String] = js.native
  
  def transformReply(): OK = js.native
}
