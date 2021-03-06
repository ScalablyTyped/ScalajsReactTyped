package typingsJapgolly.googleapis.v2beta2Mod.cloudtasksV2beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A queue is a container of related tasks. Queues are configured to manage
  * how those tasks are dispatched. Configurable properties include rate
  * limits, retry options, target types, and others.
  */
@js.native
trait SchemaQueue extends js.Object {
  /**
    * App Engine HTTP target.  An App Engine queue is a queue that has an
    * AppEngineHttpTarget.
    */
  var appEngineHttpTarget: js.UndefOr[SchemaAppEngineHttpTarget] = js.native
  /**
    * Caller-specified and required in CreateQueue, after which it becomes
    * output only.  The queue name.  The queue name must have the following
    * format: `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID`  *
    * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]),    hyphens
    * (-), colons (:), or periods (.).    For more information, see
    * [Identifying
    * projects](https://cloud.google.com/resource-manager/docs/creating-managing-projects#identifying_projects)
    * * `LOCATION_ID` is the canonical ID for the queue&#39;s location.    The
    * list of available locations can be obtained by calling    ListLocations.
    * For more information, see https://cloud.google.com/about/locations/. *
    * `QUEUE_ID` can contain letters ([A-Za-z]), numbers ([0-9]), or   hyphens
    * (-). The maximum length is 100 characters.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Pull target.  A pull queue is a queue that has a PullTarget.
    */
  var pullTarget: js.UndefOr[SchemaPullTarget] = js.native
  /**
    * Output only. The last time this queue was purged.  All tasks that were
    * created before this time were purged.  A queue can be purged using
    * PurgeQueue, the [App Engine Task Queue SDK, or the Cloud
    * Console](https://cloud.google.com/appengine/docs/standard/python/taskqueue/push/deleting-tasks-and-queues#purging_all_tasks_from_a_queue).
    * Purge time will be truncated to the nearest microsecond. Purge time will
    * be unset if the queue has never been purged.
    */
  var purgeTime: js.UndefOr[String] = js.native
  /**
    * Rate limits for task dispatches.  rate_limits and retry_config are
    * related because they both control task attempts however they control how
    * tasks are attempted in different ways:  * rate_limits controls the total
    * rate of   dispatches from a queue (i.e. all traffic dispatched from the
    * queue, regardless of whether the dispatch is from a first   attempt or a
    * retry). * retry_config controls what happens to   particular a task after
    * its first attempt fails. That is,   retry_config controls task retries
    * (the   second attempt, third attempt, etc).
    */
  var rateLimits: js.UndefOr[SchemaRateLimits] = js.native
  /**
    * Settings that determine the retry behavior.  * For tasks created using
    * Cloud Tasks: the queue-level retry settings   apply to all tasks in the
    * queue that were created using Cloud Tasks.   Retry settings cannot be set
    * on individual tasks. * For tasks created using the App Engine SDK: the
    * queue-level retry   settings apply to all tasks in the queue which do not
    * have retry settings   explicitly set on the task and were created by the
    * App Engine SDK. See   [App Engine
    * documentation](https://cloud.google.com/appengine/docs/standard/python/taskqueue/push/retrying-tasks).
    */
  var retryConfig: js.UndefOr[SchemaRetryConfig] = js.native
  /**
    * Output only. The state of the queue.  `state` can only be changed by
    * called PauseQueue, ResumeQueue, or uploading
    * [queue.yaml/xml](https://cloud.google.com/appengine/docs/python/config/queueref).
    * UpdateQueue cannot be used to change `state`.
    */
  var state: js.UndefOr[String] = js.native
}

object SchemaQueue {
  @scala.inline
  def apply(
    appEngineHttpTarget: SchemaAppEngineHttpTarget = null,
    name: String = null,
    pullTarget: SchemaPullTarget = null,
    purgeTime: String = null,
    rateLimits: SchemaRateLimits = null,
    retryConfig: SchemaRetryConfig = null,
    state: String = null
  ): SchemaQueue = {
    val __obj = js.Dynamic.literal()
    if (appEngineHttpTarget != null) __obj.updateDynamic("appEngineHttpTarget")(appEngineHttpTarget.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (pullTarget != null) __obj.updateDynamic("pullTarget")(pullTarget.asInstanceOf[js.Any])
    if (purgeTime != null) __obj.updateDynamic("purgeTime")(purgeTime.asInstanceOf[js.Any])
    if (rateLimits != null) __obj.updateDynamic("rateLimits")(rateLimits.asInstanceOf[js.Any])
    if (retryConfig != null) __obj.updateDynamic("retryConfig")(retryConfig.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaQueue]
  }
}

