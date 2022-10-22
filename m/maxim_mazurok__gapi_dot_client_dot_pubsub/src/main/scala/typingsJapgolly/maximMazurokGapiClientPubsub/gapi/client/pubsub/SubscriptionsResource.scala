package typingsJapgolly.maximMazurokGapiClientPubsub.gapi.client.pubsub

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientPubsub.anon.AccesstokenAlt
import typingsJapgolly.maximMazurokGapiClientPubsub.anon.AltCallback
import typingsJapgolly.maximMazurokGapiClientPubsub.anon.Callback
import typingsJapgolly.maximMazurokGapiClientPubsub.anon.CallbackFields
import typingsJapgolly.maximMazurokGapiClientPubsub.anon.FieldsKey
import typingsJapgolly.maximMazurokGapiClientPubsub.anon.Key
import typingsJapgolly.maximMazurokGapiClientPubsub.anon.KeyOauthtoken
import typingsJapgolly.maximMazurokGapiClientPubsub.anon.PageSize
import typingsJapgolly.maximMazurokGapiClientPubsub.anon.PageToken
import typingsJapgolly.maximMazurokGapiClientPubsub.anon.PrettyPrint
import typingsJapgolly.maximMazurokGapiClientPubsub.anon.Uploadprotocol
import typingsJapgolly.maximMazurokGapiClientPubsub.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubscriptionsResource extends StObject {
  
  /**
    * Acknowledges the messages associated with the `ack_ids` in the `AcknowledgeRequest`. The Pub/Sub system can remove the relevant messages from the subscription. Acknowledging a
    * message whose ack deadline has expired may succeed, but such a message may be redelivered later. Acknowledging a message more than once will not result in an error.
    */
  def acknowledge(request: typingsJapgolly.maximMazurokGapiClientPubsub.anon.Subscription): Request[js.Object] = js.native
  def acknowledge(request: Uploadprotocol, body: AcknowledgeRequest): Request[js.Object] = js.native
  
  def create(request: Callback, body: Subscription): Request[Subscription] = js.native
  /**
    * Creates a subscription to a given topic. See the [resource name rules] (https://cloud.google.com/pubsub/docs/admin#resource_names). If the subscription already exists, returns
    * `ALREADY_EXISTS`. If the corresponding topic doesn't exist, returns `NOT_FOUND`. If the name is not provided in the request, the server will assign a random name for this
    * subscription on the same project as the topic, conforming to the [resource name format] (https://cloud.google.com/pubsub/docs/admin#resource_names). The generated name is populated
    * in the returned Subscription object. Note that for REST API requests, you must specify a name in the request.
    */
  def create(request: Xgafv): Request[Subscription] = js.native
  
  /**
    * Deletes an existing subscription. All messages retained in the subscription are immediately dropped. Calls to `Pull` after deletion will return `NOT_FOUND`. After a subscription is
    * deleted, a new one may be created with the same name, but the new one has no association with the old subscription or its topic unless the same topic is specified.
    */
  def delete(): Request[js.Object] = js.native
  def delete(request: Uploadprotocol): Request[js.Object] = js.native
  
  /**
    * Detaches a subscription from this topic. All messages retained in the subscription are dropped. Subsequent `Pull` and `StreamingPull` requests will return FAILED_PRECONDITION. If
    * the subscription is a push subscription, pushes to the endpoint will stop.
    */
  def detach(): Request[js.Object] = js.native
  def detach(request: Uploadprotocol): Request[js.Object] = js.native
  
  /** Gets the configuration details of a subscription. */
  def get(): Request[Subscription] = js.native
  def get(request: Uploadprotocol): Request[Subscription] = js.native
  
  /** Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set. */
  def getIamPolicy(): Request[Policy] = js.native
  def getIamPolicy(request: Key): Request[Policy] = js.native
  
  /** Lists matching subscriptions. */
  /** Lists the names of the attached subscriptions on this topic. */
  def list(): Request[ListSubscriptionsResponse] = js.native
  def list(request: PageSize): Request[ListSubscriptionsResponse] = js.native
  def list(request: PageToken): Request[ListTopicSubscriptionsResponse] = js.native
  
  /**
    * Modifies the ack deadline for a specific message. This method is useful to indicate that more time is needed to process a message by the subscriber, or to make the message available
    * for redelivery if the processing was interrupted. Note that this does not modify the subscription-level `ackDeadlineSeconds` used for subsequent messages.
    */
  def modifyAckDeadline(request: AccesstokenAlt): Request[js.Object] = js.native
  def modifyAckDeadline(request: Uploadprotocol, body: ModifyAckDeadlineRequest): Request[js.Object] = js.native
  
  /**
    * Modifies the `PushConfig` for a specified subscription. This may be used to change a push subscription to a pull one (signified by an empty `PushConfig`) or vice versa, or change
    * the endpoint URL and other attributes of a push subscription. Messages will accumulate for delivery continuously through the call regardless of changes to the `PushConfig`.
    */
  def modifyPushConfig(request: AltCallback): Request[js.Object] = js.native
  def modifyPushConfig(request: Uploadprotocol, body: ModifyPushConfigRequest): Request[js.Object] = js.native
  
  /** Updates an existing subscription. Note that certain properties of a subscription, such as its topic, are not modifiable. */
  def patch(request: CallbackFields): Request[Subscription] = js.native
  def patch(request: Callback, body: UpdateSubscriptionRequest): Request[Subscription] = js.native
  
  /** Pulls messages from the server. */
  def pull(request: FieldsKey): Request[PullResponse] = js.native
  def pull(request: Uploadprotocol, body: PullRequest): Request[PullResponse] = js.native
  
  /**
    * Seeks an existing subscription to a point in time or to a given snapshot, whichever is provided in the request. Snapshots are used in [Seek]
    * (https://cloud.google.com/pubsub/docs/replay-overview) operations, which allow you to manage message acknowledgments in bulk. That is, you can set the acknowledgment state of
    * messages in an existing subscription to the state captured by a snapshot. Note that both the subscription and the snapshot must be on the same topic.
    */
  def seek(request: KeyOauthtoken): Request[js.Object] = js.native
  def seek(request: Uploadprotocol, body: SeekRequest): Request[js.Object] = js.native
  
  /** Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors. */
  def setIamPolicy(request: PrettyPrint, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  /**
    * Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This
    * operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may "fail open" without warning.
    */
  def testIamPermissions(request: PrettyPrint, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
}
