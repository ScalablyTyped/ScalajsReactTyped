package typingsJapgolly.maximMazurokGapiClientCalendar.gapi.client.calendar

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientCalendar.anon.Alt
import typingsJapgolly.maximMazurokGapiClientCalendar.anon.CalendarId
import typingsJapgolly.maximMazurokGapiClientCalendar.anon.Fields
import typingsJapgolly.maximMazurokGapiClientCalendar.anon.Key
import typingsJapgolly.maximMazurokGapiClientCalendar.anon.MaxResults
import typingsJapgolly.maximMazurokGapiClientCalendar.anon.Oauthtoken
import typingsJapgolly.maximMazurokGapiClientCalendar.anon.PrettyPrint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AclResource extends StObject {
  
  /** Deletes an access control rule. */
  def delete(): Request[Unit] = js.native
  def delete(request: Alt): Request[Unit] = js.native
  
  /** Returns an access control rule. */
  def get(): Request[AclRule] = js.native
  def get(request: Alt): Request[AclRule] = js.native
  
  /** Creates an access control rule. */
  def insert(request: CalendarId): Request[AclRule] = js.native
  def insert(request: Fields, body: AclRule): Request[AclRule] = js.native
  
  /** Returns the rules in the access control list for the calendar. */
  def list(): Request[Acl] = js.native
  def list(request: Key): Request[Acl] = js.native
  
  /** Updates an access control rule. This method supports patch semantics. */
  def patch(request: Oauthtoken): Request[AclRule] = js.native
  def patch(request: PrettyPrint, body: AclRule): Request[AclRule] = js.native
  
  /** Updates an access control rule. */
  def update(request: Oauthtoken): Request[AclRule] = js.native
  def update(request: PrettyPrint, body: AclRule): Request[AclRule] = js.native
  
  def watch(request: Key, body: Channel): Request[Channel] = js.native
  /** Watch for changes to ACL resources. */
  def watch(request: MaxResults): Request[Channel] = js.native
}
