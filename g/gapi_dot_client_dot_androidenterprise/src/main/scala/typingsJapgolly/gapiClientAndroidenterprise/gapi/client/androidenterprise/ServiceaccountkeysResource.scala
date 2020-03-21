package typingsJapgolly.gapiClientAndroidenterprise.gapi.client.androidenterprise

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAndroidenterprise.AnonKey
import typingsJapgolly.gapiClientAndroidenterprise.AnonKeyId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceaccountkeysResource extends js.Object {
  /**
    * Removes and invalidates the specified credentials for the service account associated with this enterprise. The calling service account must have been
    * retrieved by calling Enterprises.GetServiceAccount and must have been set as the enterprise service account by calling Enterprises.SetAccount.
    */
  def delete(request: AnonKeyId): Request_[Unit]
  /**
    * Generates new credentials for the service account associated with this enterprise. The calling service account must have been retrieved by calling
    * Enterprises.GetServiceAccount and must have been set as the enterprise service account by calling Enterprises.SetAccount.
    *
    * Only the type of the key should be populated in the resource to be inserted.
    */
  def insert(request: AnonKey): Request_[ServiceAccountKey]
  /**
    * Lists all active credentials for the service account associated with this enterprise. Only the ID and key type are returned. The calling service
    * account must have been retrieved by calling Enterprises.GetServiceAccount and must have been set as the enterprise service account by calling
    * Enterprises.SetAccount.
    */
  def list(request: AnonKey): Request_[ServiceAccountKeysListResponse]
}

object ServiceaccountkeysResource {
  @scala.inline
  def apply(
    delete: AnonKeyId => CallbackTo[Request_[Unit]],
    insert: AnonKey => CallbackTo[Request_[ServiceAccountKey]],
    list: AnonKey => CallbackTo[Request_[ServiceAccountKeysListResponse]]
  ): ServiceaccountkeysResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidenterprise.AnonKeyId) => delete(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidenterprise.AnonKey) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidenterprise.AnonKey) => list(t0).runNow()))
    __obj.asInstanceOf[ServiceaccountkeysResource]
  }
}

