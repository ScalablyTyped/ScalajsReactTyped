package typingsJapgolly.redisTimeSeries.anon

import typingsJapgolly.redisTimeSeries.distCommandsMod.SampleRawReply
import typingsJapgolly.redisTimeSeries.distCommandsMod.SampleReply
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofGET extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  def transformArguments(key: String): js.Array[String] = js.native
  
  def transformReply(reply: js.Array[Any]): Null | SampleReply = js.native
  def transformReply(reply: SampleRawReply): Null | SampleReply = js.native
}
