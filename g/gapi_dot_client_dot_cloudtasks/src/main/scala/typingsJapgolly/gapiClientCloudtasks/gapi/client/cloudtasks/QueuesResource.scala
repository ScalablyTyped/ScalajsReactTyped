package typingsJapgolly.gapiClientCloudtasks.gapi.client.cloudtasks

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCloudtasks.AnonAccesstoken
import typingsJapgolly.gapiClientCloudtasks.AnonAlt
import typingsJapgolly.gapiClientCloudtasks.AnonFields
import typingsJapgolly.gapiClientCloudtasks.AnonFilter
import typingsJapgolly.gapiClientCloudtasks.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueuesResource extends js.Object {
  var tasks: TasksResource
  /**
    * Creates a queue.
    *
    * WARNING: This method is only available to whitelisted
    * users. Using this method carries some risk. Read
    * [Overview of Queue Management and queue.yaml](/cloud-tasks/docs/queue-yaml)
    * carefully and then sign up for
    * [whitelist access to this method](https://goo.gl/Fe5mUy).
    */
  def create(request: AnonAlt): Request_[Queue]
  /**
    * Deletes a queue.
    *
    * This command will delete the queue even if it has tasks in it.
    *
    * Note: If you delete a queue, a queue with the same name can't be created
    * for 7 days.
    *
    * WARNING: This method is only available to whitelisted
    * users. Using this method carries some risk. Read
    * [Overview of Queue Management and queue.yaml](/cloud-tasks/docs/queue-yaml)
    * carefully and then sign up for
    * [whitelist access to this method](https://goo.gl/Fe5mUy).
    */
  def delete(request: AnonAccesstoken): Request_[js.Object]
  /** Gets a queue. */
  def get(request: AnonAccesstoken): Request_[Queue]
  /**
    * Gets the access control policy for a Queue.
    * Returns an empty policy if the resource exists and does not have a policy
    * set.
    *
    * Authorization requires the following [Google IAM](/iam) permission on the
    * specified resource parent:
    *
    * &#42; `cloudtasks.queues.getIamPolicy`
    */
  def getIamPolicy(request: AnonFields): Request_[Policy]
  /**
    * Lists queues.
    *
    * Queues are returned in lexicographical order.
    */
  def list(request: AnonFilter): Request_[ListQueuesResponse]
  /**
    * Updates a queue.
    *
    * This method creates the queue if it does not exist and updates
    * the queue if it does exist.
    *
    * WARNING: This method is only available to whitelisted
    * users. Using this method carries some risk. Read
    * [Overview of Queue Management and queue.yaml](/cloud-tasks/docs/queue-yaml)
    * carefully and then sign up for
    * [whitelist access to this method](https://goo.gl/Fe5mUy).
    */
  def patch(request: AnonKey): Request_[Queue]
  /**
    * Pauses the queue.
    *
    * If a queue is paused then the system will stop executing the
    * tasks in the queue until it is resumed via
    * CloudTasks.ResumeQueue. Tasks can still be added when the
    * queue is paused. The state of the queue is stored in
    * Queue.queue_state; if paused it will be set to
    * Queue.QueueState.PAUSED.
    *
    * WARNING: This method is only available to whitelisted
    * users. Using this method carries some risk. Read
    * [Overview of Queue Management and queue.yaml](/cloud-tasks/docs/queue-yaml)
    * carefully and then sign up for
    * [whitelist access to this method](https://goo.gl/Fe5mUy).
    */
  def pause(request: AnonAccesstoken): Request_[Queue]
  /**
    * Purges a queue by deleting all of its tasks.
    *
    * All tasks created before this method is called are permanently deleted.
    *
    * Purge operations can take up to one minute to take effect. Tasks
    * might be dispatched before the purge takes effect. A purge is irreversible.
    */
  def purge(request: AnonAccesstoken): Request_[Queue]
  /**
    * Resume a queue.
    *
    * This method resumes a queue after it has been
    * Queue.QueueState.PAUSED or Queue.QueueState.DISABLED. The state of
    * a queue is stored in Queue.queue_state; after calling this method it
    * will be set to Queue.QueueState.RUNNING.
    *
    * WARNING: This method is only available to whitelisted
    * users. Using this method carries some risk. Read
    * [Overview of Queue Management and queue.yaml](/cloud-tasks/docs/queue-yaml)
    * carefully and then sign up for
    * [whitelist access to this method](https://goo.gl/Fe5mUy).
    *
    * WARNING: Resuming many high-QPS queues at the same time can
    * lead to target overloading. If you are resuming high-QPS
    * queues, follow the 500/50/5 pattern described in
    * [Managing Cloud Tasks Scaling Risks](/cloud-tasks/pdfs/managing-cloud-tasks-scaling-risks-2017-06-05.pdf).
    */
  def resume(request: AnonAccesstoken): Request_[Queue]
  /**
    * Sets the access control policy for a Queue. Replaces any existing
    * policy.
    *
    * Authorization requires the following [Google IAM](/iam) permission on the
    * specified resource parent:
    *
    * &#42; `cloudtasks.queues.setIamPolicy`
    */
  def setIamPolicy(request: AnonFields): Request_[Policy]
  /**
    * Returns permissions that a caller has on a Queue.
    * If the resource does not exist, this will return an empty set of
    * permissions, not a google.rpc.Code.NOT_FOUND error.
    *
    * Note: This operation is designed to be used for building permission-aware
    * UIs and command-line tools, not for authorization checking. This operation
    * may "fail open" without warning.
    */
  def testIamPermissions(request: AnonFields): Request_[TestIamPermissionsResponse]
}

object QueuesResource {
  @scala.inline
  def apply(
    create: AnonAlt => CallbackTo[Request_[Queue]],
    delete: AnonAccesstoken => CallbackTo[Request_[js.Object]],
    get: AnonAccesstoken => CallbackTo[Request_[Queue]],
    getIamPolicy: AnonFields => CallbackTo[Request_[Policy]],
    list: AnonFilter => CallbackTo[Request_[ListQueuesResponse]],
    patch: AnonKey => CallbackTo[Request_[Queue]],
    pause: AnonAccesstoken => CallbackTo[Request_[Queue]],
    purge: AnonAccesstoken => CallbackTo[Request_[Queue]],
    resume: AnonAccesstoken => CallbackTo[Request_[Queue]],
    setIamPolicy: AnonFields => CallbackTo[Request_[Policy]],
    tasks: TasksResource,
    testIamPermissions: AnonFields => CallbackTo[Request_[TestIamPermissionsResponse]]
  ): QueuesResource = {
    val __obj = js.Dynamic.literal(tasks = tasks.asInstanceOf[js.Any])
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudtasks.AnonAlt) => create(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudtasks.AnonAccesstoken) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudtasks.AnonAccesstoken) => get(t0).runNow()))
    __obj.updateDynamic("getIamPolicy")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudtasks.AnonFields) => getIamPolicy(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudtasks.AnonFilter) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudtasks.AnonKey) => patch(t0).runNow()))
    __obj.updateDynamic("pause")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudtasks.AnonAccesstoken) => pause(t0).runNow()))
    __obj.updateDynamic("purge")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudtasks.AnonAccesstoken) => purge(t0).runNow()))
    __obj.updateDynamic("resume")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudtasks.AnonAccesstoken) => resume(t0).runNow()))
    __obj.updateDynamic("setIamPolicy")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudtasks.AnonFields) => setIamPolicy(t0).runNow()))
    __obj.updateDynamic("testIamPermissions")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudtasks.AnonFields) => testIamPermissions(t0).runNow()))
    __obj.asInstanceOf[QueuesResource]
  }
}

