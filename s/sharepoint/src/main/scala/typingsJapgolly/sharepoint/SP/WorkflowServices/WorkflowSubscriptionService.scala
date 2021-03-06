package typingsJapgolly.sharepoint.SP.WorkflowServices

import typingsJapgolly.sharepoint.SP.ClientObject
import typingsJapgolly.sharepoint.SP.ClientRuntimeContext
import typingsJapgolly.sharepoint.SP.Guid
import typingsJapgolly.sharepoint.SP.GuidResult
import typingsJapgolly.sharepoint.SP.ObjectPathStaticProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.WorkflowServices.WorkflowSubscriptionService")
@js.native
class WorkflowSubscriptionService protected () extends ClientObject {
  def this(context: ClientRuntimeContext, objectPath: ObjectPathStaticProperty) = this()
  def deleteSubscription(subscriptionId: Guid): WorkflowSubscription = js.native
  /** Retrieves workflow subscriptions that contains all of the workflow subscriptions on the Web  */
  def enumerateSubscriptions(): WorkflowSubscriptionCollection = js.native
  /** Retrieves workflow subscriptions based on workflow definition */
  def enumerateSubscriptionsByDefinition(definitionId: String): WorkflowSubscriptionCollection = js.native
  /** Retrieves workflow subscriptions based on the specified EventSourceId */
  def enumerateSubscriptionsByEventSource(eventSourceId: String): WorkflowSubscriptionCollection = js.native
  /** Retrieves workflow subscriptions based on the specified list.
    @param listId The unique identifier (GUID) of the list on which to filter the subscriptions. */
  def enumerateSubscriptionsByList(listId: String): WorkflowSubscriptionCollection = js.native
  def getSubscription(subscriptionId: Guid): WorkflowSubscription = js.native
  /** Creates a workflow subscription for a workflow, and returns the unique identifier of the new subscription. */
  def publishSubscription(subscription: WorkflowSubscription): GuidResult = js.native
  /** Creates a workflow subscription for a workflow and if necessary an event receiver on the specified list.
    Also writes an EventSourceId that matches the list as the event source.
    Returns the unique identifier of the new subscription.
    @param listId Unique identifier (GUID) for the specified list. */
  def publishSubscriptionForList(subscription: WorkflowSubscription, listId: String): GuidResult = js.native
  /** Ensures that an event receiver will monitor a list for the specified event.
    @param listId Unique identifier (GUID) for the specified list.
    @eventName eventName The name of the event to be monitored. */
  def registerInterestInList(listId: String, eventName: String): Unit = js.native
  /** Removes monitoring for an event receiver on the specified list with the specified event.
    @param listId GUID of the list containing the event receiver to be unregistered.
    @eventName eventName The name of the event to be removed. */
  def unregisterInterestInList(listId: String, eventName: String): Unit = js.native
}

/* static members */
@JSGlobal("SP.WorkflowServices.WorkflowSubscriptionService")
@js.native
object WorkflowSubscriptionService extends js.Object {
  def getCurrent(context: ClientRuntimeContext): WorkflowSubscriptionService = js.native
}

