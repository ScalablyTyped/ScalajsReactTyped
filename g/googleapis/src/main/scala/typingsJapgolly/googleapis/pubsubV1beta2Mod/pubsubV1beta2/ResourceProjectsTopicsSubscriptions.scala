package typingsJapgolly.googleapis.pubsubV1beta2Mod.pubsubV1beta2

import typingsJapgolly.gaxios.commonMod.GaxiosPromise
import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.BodyResponseCallback
import typingsJapgolly.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/pubsub/v1beta2", "pubsub_v1beta2.Resource$Projects$Topics$Subscriptions")
@js.native
class ResourceProjectsTopicsSubscriptions protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * pubsub.projects.topics.subscriptions.list
    * @desc Lists the name of the subscriptions for this topic.
    * @alias pubsub.projects.topics.subscriptions.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Maximum number of subscription names to return.
    * @param {string=} params.pageToken The value returned by the last `ListTopicSubscriptionsResponse`; indicates that this is a continuation of a prior `ListTopicSubscriptions` call, and that the system should return the next page of data.
    * @param {string} params.topic The name of the topic that subscriptions are attached to.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListTopicSubscriptionsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListTopicSubscriptionsResponse]): Unit = js.native
  def list(params: ParamsResourceProjectsTopicsSubscriptionsList): GaxiosPromise[SchemaListTopicSubscriptionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsTopicsSubscriptionsList,
    callback: BodyResponseCallback[SchemaListTopicSubscriptionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsTopicsSubscriptionsList,
    options: BodyResponseCallback[SchemaListTopicSubscriptionsResponse],
    callback: BodyResponseCallback[SchemaListTopicSubscriptionsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsTopicsSubscriptionsList, options: MethodOptions): GaxiosPromise[SchemaListTopicSubscriptionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsTopicsSubscriptionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListTopicSubscriptionsResponse]
  ): Unit = js.native
}

