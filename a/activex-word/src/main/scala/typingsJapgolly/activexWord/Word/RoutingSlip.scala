package typingsJapgolly.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoutingSlip extends StObject {
  
  def AddRecipient(Recipient: String): Unit = js.native
  
  val Application: typingsJapgolly.activexWord.Word.Application = js.native
  
  val Creator: Double = js.native
  
  var Delivery: WdRoutingSlipDelivery = js.native
  
  var Message: String = js.native
  
  val Parent: Any = js.native
  
  var Protect: WdProtectionType = js.native
  
  def Recipients(): Any = js.native
  def Recipients(Index: Any): Any = js.native
  
  def Reset(): Unit = js.native
  
  var ReturnWhenDone: Boolean = js.native
  
  val Status: WdRoutingSlipStatus = js.native
  
  var Subject: String = js.native
  
  var TrackStatus: Boolean = js.native
  
  /* private */ @JSName("Word.RoutingSlip_typekey")
  var WordDotRoutingSlip_typekey: RoutingSlip = js.native
}
