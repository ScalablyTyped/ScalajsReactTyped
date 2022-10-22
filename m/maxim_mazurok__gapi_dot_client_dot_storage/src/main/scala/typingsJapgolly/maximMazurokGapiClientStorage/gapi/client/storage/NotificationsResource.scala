package typingsJapgolly.maximMazurokGapiClientStorage.gapi.client.storage

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientStorage.anon.BucketFields
import typingsJapgolly.maximMazurokGapiClientStorage.anon.Fields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationsResource extends StObject {
  
  /** Permanently deletes a notification subscription. */
  def delete(): Request[Unit] = js.native
  def delete(request: typingsJapgolly.maximMazurokGapiClientStorage.anon.Notification): Request[Unit] = js.native
  
  /** View a notification configuration. */
  def get(): Request[Notification] = js.native
  def get(request: typingsJapgolly.maximMazurokGapiClientStorage.anon.Notification): Request[Notification] = js.native
  
  /** Creates a notification subscription for a given bucket. */
  def insert(request: BucketFields): Request[Notification] = js.native
  def insert(request: Fields, body: Notification): Request[Notification] = js.native
  
  /** Retrieves a list of notification subscriptions for a given bucket. */
  def list(): Request[Notifications] = js.native
  def list(request: Fields): Request[Notifications] = js.native
}
