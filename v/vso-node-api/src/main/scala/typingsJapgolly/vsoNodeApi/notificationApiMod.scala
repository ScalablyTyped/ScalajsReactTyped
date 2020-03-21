package typingsJapgolly.vsoNodeApi

import typingsJapgolly.vsoNodeApi.clientApiBasesMod.ClientApiBase
import typingsJapgolly.vsoNodeApi.notificationInterfacesMod.BatchNotificationOperation
import typingsJapgolly.vsoNodeApi.notificationInterfacesMod.FieldValuesQuery
import typingsJapgolly.vsoNodeApi.notificationInterfacesMod.NotificationEventField
import typingsJapgolly.vsoNodeApi.notificationInterfacesMod.NotificationEventType
import typingsJapgolly.vsoNodeApi.notificationInterfacesMod.NotificationReason
import typingsJapgolly.vsoNodeApi.notificationInterfacesMod.NotificationSubscriber
import typingsJapgolly.vsoNodeApi.notificationInterfacesMod.NotificationSubscriberUpdateParameters
import typingsJapgolly.vsoNodeApi.notificationInterfacesMod.NotificationSubscription
import typingsJapgolly.vsoNodeApi.notificationInterfacesMod.NotificationSubscriptionCreateParameters
import typingsJapgolly.vsoNodeApi.notificationInterfacesMod.NotificationSubscriptionTemplate
import typingsJapgolly.vsoNodeApi.notificationInterfacesMod.NotificationSubscriptionUpdateParameters
import typingsJapgolly.vsoNodeApi.notificationInterfacesMod.NotificationTracing
import typingsJapgolly.vsoNodeApi.notificationInterfacesMod.NotificationTracingSetParameters
import typingsJapgolly.vsoNodeApi.notificationInterfacesMod.SubscriptionQuery
import typingsJapgolly.vsoNodeApi.notificationInterfacesMod.SubscriptionQueryFlags
import typingsJapgolly.vsoNodeApi.notificationInterfacesMod.SubscriptionUserSettings
import typingsJapgolly.vsoNodeApi.vsoBaseInterfacesMod.IRequestHandler
import typingsJapgolly.vsoNodeApi.vsoBaseInterfacesMod.IRequestOptions
import typingsJapgolly.vsoNodeApi.vssinterfacesMod.VssNotificationEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vso-node-api/NotificationApi", JSImport.Namespace)
@js.native
object notificationApiMod extends js.Object {
  @js.native
  trait INotificationApi extends ClientApiBase {
    def createSubscription(createParameters: NotificationSubscriptionCreateParameters): js.Promise[NotificationSubscription] = js.native
    def deleteSubscription(subscriptionId: String): js.Promise[Unit] = js.native
    def getEventType(eventType: String): js.Promise[NotificationEventType] = js.native
    def getNotificationReasons(notificationId: Double): js.Promise[NotificationReason] = js.native
    def getNotificationTracing(subscriptionId: String): js.Promise[NotificationTracing] = js.native
    def getSubscriber(subscriberId: String): js.Promise[NotificationSubscriber] = js.native
    def getSubscription(subscriptionId: String): js.Promise[NotificationSubscription] = js.native
    def getSubscription(subscriptionId: String, queryFlags: SubscriptionQueryFlags): js.Promise[NotificationSubscription] = js.native
    def getSubscriptionTemplates(): js.Promise[js.Array[NotificationSubscriptionTemplate]] = js.native
    def listEventTypes(): js.Promise[js.Array[NotificationEventType]] = js.native
    def listEventTypes(publisherId: String): js.Promise[js.Array[NotificationEventType]] = js.native
    def listNotificationReasons(): js.Promise[js.Array[NotificationReason]] = js.native
    def listNotificationReasons(notificationIds: Double): js.Promise[js.Array[NotificationReason]] = js.native
    def listSubscriptions(): js.Promise[js.Array[NotificationSubscription]] = js.native
    def listSubscriptions(targetId: String): js.Promise[js.Array[NotificationSubscription]] = js.native
    def listSubscriptions(targetId: String, ids: js.Array[String]): js.Promise[js.Array[NotificationSubscription]] = js.native
    def listSubscriptions(targetId: String, ids: js.Array[String], queryFlags: SubscriptionQueryFlags): js.Promise[js.Array[NotificationSubscription]] = js.native
    def performBatchNotificationOperations(operation: BatchNotificationOperation): js.Promise[Unit] = js.native
    def publishEvent(notificationEvent: VssNotificationEvent): js.Promise[VssNotificationEvent] = js.native
    def queryEventTypes(inputValuesQuery: FieldValuesQuery, eventType: String): js.Promise[js.Array[NotificationEventField]] = js.native
    def querySubscriptions(subscriptionQuery: SubscriptionQuery): js.Promise[js.Array[NotificationSubscription]] = js.native
    def updateNotificationTracing(setParameters: NotificationTracingSetParameters, subscriptionId: String): js.Promise[NotificationTracing] = js.native
    def updateSubscriber(updateParameters: NotificationSubscriberUpdateParameters, subscriberId: String): js.Promise[NotificationSubscriber] = js.native
    def updateSubscription(updateParameters: NotificationSubscriptionUpdateParameters, subscriptionId: String): js.Promise[NotificationSubscription] = js.native
    def updateSubscriptionUserSettings(userSettings: SubscriptionUserSettings, subscriptionId: String, userId: String): js.Promise[SubscriptionUserSettings] = js.native
  }
  
  @js.native
  class NotificationApi protected () extends INotificationApi {
    def this(baseUrl: String, handlers: js.Array[IRequestHandler]) = this()
    def this(baseUrl: String, handlers: js.Array[IRequestHandler], options: IRequestOptions) = this()
  }
  
}

