package typingsJapgolly.gapiClientProximitybeacon.gapi.client.proximitybeacon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientProximitybeacon.AnonAlt
import typingsJapgolly.gapiClientProximitybeacon.AnonAttachmentName
import typingsJapgolly.gapiClientProximitybeacon.AnonBeaconName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachmentsResource extends js.Object {
  /**
    * Deletes multiple attachments on a given beacon. This operation is
    * permanent and cannot be undone.
    *
    * You can optionally specify `namespacedType` to choose which attachments
    * should be deleted. If you do not specify `namespacedType`,  all your
    * attachments on the given beacon will be deleted. You also may explicitly
    * specify `&#42;/&#42;` to delete all.
    *
    * Authenticate using an [OAuth access token](https://developers.google.com/identity/protocols/OAuth2)
    * from a signed-in user with &#42;&#42;Is owner&#42;&#42; or &#42;&#42;Can edit&#42;&#42; permissions in the
    * Google Developers Console project.
    */
  def batchDelete(request: AnonAlt): Request_[DeleteAttachmentsResponse]
  /**
    * Associates the given data with the specified beacon. Attachment data must
    * contain two parts:
    * <ul>
    * <li>A namespaced type.</li>
    * <li>The actual attachment data itself.</li>
    * </ul>
    * The namespaced type consists of two parts, the namespace and the type.
    * The namespace must be one of the values returned by the `namespaces`
    * endpoint, while the type can be a string of any characters except for the
    * forward slash (`/`) up to 100 characters in length.
    *
    * Attachment data can be up to 1024 bytes long.
    *
    * Authenticate using an [OAuth access token](https://developers.google.com/identity/protocols/OAuth2)
    * from a signed-in user with &#42;&#42;Is owner&#42;&#42; or &#42;&#42;Can edit&#42;&#42; permissions in the
    * Google Developers Console project.
    */
  def create(request: AnonBeaconName): Request_[BeaconAttachment]
  /**
    * Deletes the specified attachment for the given beacon. Each attachment has
    * a unique attachment name (`attachmentName`) which is returned when you
    * fetch the attachment data via this API. You specify this with the delete
    * request to control which attachment is removed. This operation cannot be
    * undone.
    *
    * Authenticate using an [OAuth access token](https://developers.google.com/identity/protocols/OAuth2)
    * from a signed-in user with &#42;&#42;Is owner&#42;&#42; or &#42;&#42;Can edit&#42;&#42; permissions in the
    * Google Developers Console project.
    */
  def delete(request: AnonAttachmentName): Request_[js.Object]
  /**
    * Returns the attachments for the specified beacon that match the specified
    * namespaced-type pattern.
    *
    * To control which namespaced types are returned, you add the
    * `namespacedType` query parameter to the request. You must either use
    * `&#42;/&#42;`, to return all attachments, or the namespace must be one of
    * the ones returned from the  `namespaces` endpoint.
    *
    * Authenticate using an [OAuth access token](https://developers.google.com/identity/protocols/OAuth2)
    * from a signed-in user with &#42;&#42;viewer&#42;&#42;, &#42;&#42;Is owner&#42;&#42; or &#42;&#42;Can edit&#42;&#42;
    * permissions in the Google Developers Console project.
    */
  def list(request: AnonAlt): Request_[ListBeaconAttachmentsResponse]
}

object AttachmentsResource {
  @scala.inline
  def apply(
    batchDelete: AnonAlt => CallbackTo[Request_[DeleteAttachmentsResponse]],
    create: AnonBeaconName => CallbackTo[Request_[BeaconAttachment]],
    delete: AnonAttachmentName => CallbackTo[Request_[js.Object]],
    list: AnonAlt => CallbackTo[Request_[ListBeaconAttachmentsResponse]]
  ): AttachmentsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("batchDelete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientProximitybeacon.AnonAlt) => batchDelete(t0).runNow()))
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientProximitybeacon.AnonBeaconName) => create(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientProximitybeacon.AnonAttachmentName) => delete(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientProximitybeacon.AnonAlt) => list(t0).runNow()))
    __obj.asInstanceOf[AttachmentsResource]
  }
}

