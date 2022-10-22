package typingsJapgolly.redisTimeSeries.anon

import typingsJapgolly.redisTimeSeries.distCommandsAddMod.AddOptions
import typingsJapgolly.redisTimeSeries.distCommandsMod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofADD extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  def transformArguments(key: String, timestamp: Timestamp, value: Double): js.Array[String] = js.native
  def transformArguments(key: String, timestamp: Timestamp, value: Double, options: AddOptions): js.Array[String] = js.native
  
  def transformReply(): Double = js.native
}
