package typingsJapgolly.maximMazurokGapiClientPubsub.gapi.client.pubsub

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientPubsub.anon.Callback
import typingsJapgolly.maximMazurokGapiClientPubsub.anon.Key
import typingsJapgolly.maximMazurokGapiClientPubsub.anon.KeyName
import typingsJapgolly.maximMazurokGapiClientPubsub.anon.NameOauthtoken
import typingsJapgolly.maximMazurokGapiClientPubsub.anon.OauthtokenPrettyPrint
import typingsJapgolly.maximMazurokGapiClientPubsub.anon.PageSize
import typingsJapgolly.maximMazurokGapiClientPubsub.anon.PrettyPrint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicsResource extends StObject {
  
  def create(request: Callback, body: Topic): Request[Topic] = js.native
  /** Creates the given topic with the given name. See the [resource name rules] (https://cloud.google.com/pubsub/docs/admin#resource_names). */
  def create(request: KeyName): Request[Topic] = js.native
  
  /**
    * Deletes the topic with the given name. Returns `NOT_FOUND` if the topic does not exist. After a topic is deleted, a new topic may be created with the same name; this is an entirely
    * new topic with none of the old configuration or subscriptions. Existing subscriptions to this topic are not deleted, but their `topic` field is set to `_deleted-topic_`.
    */
  def delete(): Request[js.Object] = js.native
  def delete(request: typingsJapgolly.maximMazurokGapiClientPubsub.anon.Topic): Request[js.Object] = js.native
  
  /** Gets the configuration of a topic. */
  def get(): Request[Topic] = js.native
  def get(request: typingsJapgolly.maximMazurokGapiClientPubsub.anon.Topic): Request[Topic] = js.native
  
  /** Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set. */
  def getIamPolicy(): Request[Policy] = js.native
  def getIamPolicy(request: Key): Request[Policy] = js.native
  
  /** Lists matching topics. */
  def list(): Request[ListTopicsResponse] = js.native
  def list(request: PageSize): Request[ListTopicsResponse] = js.native
  
  def patch(request: Callback, body: UpdateTopicRequest): Request[Topic] = js.native
  /** Updates an existing topic. Note that certain properties of a topic are not modifiable. */
  def patch(request: NameOauthtoken): Request[Topic] = js.native
  
  /** Adds one or more messages to the topic. Returns `NOT_FOUND` if the topic does not exist. */
  def publish(request: OauthtokenPrettyPrint): Request[PublishResponse] = js.native
  def publish(request: typingsJapgolly.maximMazurokGapiClientPubsub.anon.Topic, body: PublishRequest): Request[PublishResponse] = js.native
  
  /** Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors. */
  def setIamPolicy(request: PrettyPrint, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  var snapshots: SnapshotsResource = js.native
  
  var subscriptions: SubscriptionsResource = js.native
  
  /**
    * Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This
    * operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may "fail open" without warning.
    */
  def testIamPermissions(request: PrettyPrint, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
}
