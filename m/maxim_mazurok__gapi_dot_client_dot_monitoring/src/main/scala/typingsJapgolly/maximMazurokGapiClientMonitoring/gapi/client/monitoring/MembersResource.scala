package typingsJapgolly.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientMonitoring.anon.IntervalendTime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MembersResource extends StObject {
  
  /** Lists the monitored resources that are members of a group. */
  def list(): Request[ListGroupMembersResponse] = js.native
  def list(request: IntervalendTime): Request[ListGroupMembersResponse] = js.native
}
