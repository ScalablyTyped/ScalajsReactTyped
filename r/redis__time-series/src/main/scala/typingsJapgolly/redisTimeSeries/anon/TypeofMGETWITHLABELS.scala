package typingsJapgolly.redisTimeSeries.anon

import typingsJapgolly.redisTimeSeries.distCommandsMgetMod.MGetRawReply
import typingsJapgolly.redisTimeSeries.distCommandsMgetWITHLABELSMod.MGetWithLabelsOptions
import typingsJapgolly.redisTimeSeries.distCommandsMgetWITHLABELSMod.MGetWithLabelsReply
import typingsJapgolly.redisTimeSeries.distCommandsMod.Filter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofMGETWITHLABELS extends StObject {
  
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  def transformArguments(filter: Filter): js.Array[String] = js.native
  def transformArguments(filter: Filter, options: MGetWithLabelsOptions): js.Array[String] = js.native
  
  def transformReply(reply: MGetRawReply): js.Array[MGetWithLabelsReply] = js.native
}
