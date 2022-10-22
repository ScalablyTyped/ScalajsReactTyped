package typingsJapgolly.maximMazurokGapiClientContent.gapi.client.content

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientContent.anon.AccesstokenAlt
import typingsJapgolly.maximMazurokGapiClientContent.anon.OauthtokenPrettyPrintQuotaUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrdertrackingsignalsResource extends StObject {
  
  def create(request: AccesstokenAlt, body: OrderTrackingSignal): Request[OrderTrackingSignal] = js.native
  /** Creates new order tracking signal. */
  def create(request: OauthtokenPrettyPrintQuotaUser): Request[OrderTrackingSignal] = js.native
}
