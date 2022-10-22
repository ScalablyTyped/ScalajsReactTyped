package typingsJapgolly.vsoNodeApi

import typingsJapgolly.vsoNodeApi.clientApiBasesMod.ClientApiBase
import typingsJapgolly.vsoNodeApi.interfacesCommonVsoBaseInterfacesMod.IRequestHandler
import typingsJapgolly.vsoNodeApi.interfacesCommonVsoBaseInterfacesMod.IRequestOptions
import typingsJapgolly.vsoNodeApi.interfacesCommonVssinterfacesMod.VssNotificationEvent
import typingsJapgolly.vsoNodeApi.interfacesNotificationInterfacesMod.BatchNotificationOperation
import typingsJapgolly.vsoNodeApi.interfacesNotificationInterfacesMod.FieldValuesQuery
import typingsJapgolly.vsoNodeApi.interfacesNotificationInterfacesMod.NotificationEventField
import typingsJapgolly.vsoNodeApi.interfacesNotificationInterfacesMod.NotificationEventType
import typingsJapgolly.vsoNodeApi.interfacesNotificationInterfacesMod.NotificationReason
import typingsJapgolly.vsoNodeApi.interfacesNotificationInterfacesMod.NotificationSubscriber
import typingsJapgolly.vsoNodeApi.interfacesNotificationInterfacesMod.NotificationSubscriberUpdateParameters
import typingsJapgolly.vsoNodeApi.interfacesNotificationInterfacesMod.NotificationSubscription
import typingsJapgolly.vsoNodeApi.interfacesNotificationInterfacesMod.NotificationSubscriptionCreateParameters
import typingsJapgolly.vsoNodeApi.interfacesNotificationInterfacesMod.NotificationSubscriptionTemplate
import typingsJapgolly.vsoNodeApi.interfacesNotificationInterfacesMod.NotificationSubscriptionUpdateParameters
import typingsJapgolly.vsoNodeApi.interfacesNotificationInterfacesMod.NotificationTracing
import typingsJapgolly.vsoNodeApi.interfacesNotificationInterfacesMod.NotificationTracingSetParameters
import typingsJapgolly.vsoNodeApi.interfacesNotificationInterfacesMod.SubscriptionQuery
import typingsJapgolly.vsoNodeApi.interfacesNotificationInterfacesMod.SubscriptionQueryFlags
import typingsJapgolly.vsoNodeApi.interfacesNotificationInterfacesMod.SubscriptionUserSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notificationApiMod {
  
  @JSImport("vso-node-api/NotificationApi", "NotificationApi")
  @js.native
  open class NotificationApi protected () extends INotificationApi {
    def this(baseUrl: String, handlers: js.Array[IRequestHandler]) = this()
    def this(baseUrl: String, handlers: js.Array[IRequestHandler], options: IRequestOptions) = this()
  }
  
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
    def listSubscriptions(targetId: String, ids: Unit, queryFlags: SubscriptionQueryFlags): js.Promise[js.Array[NotificationSubscription]] = js.native
    def listSubscriptions(targetId: Unit, ids: js.Array[String]): js.Promise[js.Array[NotificationSubscription]] = js.native
    def listSubscriptions(targetId: Unit, ids: js.Array[String], queryFlags: SubscriptionQueryFlags): js.Promise[js.Array[NotificationSubscription]] = js.native
    def listSubscriptions(targetId: Unit, ids: Unit, queryFlags: SubscriptionQueryFlags): js.Promise[js.Array[NotificationSubscription]] = js.native
    
    def performBatchNotificationOperations(operation: BatchNotificationOperation): js.Promise[Unit] = js.native
    
    def publishEvent(notificationEvent: VssNotificationEvent): js.Promise[VssNotificationEvent] = js.native
    
    def queryEventTypes(inputValuesQuery: FieldValuesQuery, eventType: String): js.Promise[js.Array[NotificationEventField]] = js.native
    
    def querySubscriptions(subscriptionQuery: SubscriptionQuery): js.Promise[js.Array[NotificationSubscription]] = js.native
    
    def updateNotificationTracing(setParameters: NotificationTracingSetParameters, subscriptionId: String): js.Promise[NotificationTracing] = js.native
    
    def updateSubscriber(updateParameters: NotificationSubscriberUpdateParameters, subscriberId: String): js.Promise[NotificationSubscriber] = js.native
    
    def updateSubscription(updateParameters: NotificationSubscriptionUpdateParameters, subscriptionId: String): js.Promise[NotificationSubscription] = js.native
    
    def updateSubscriptionUserSettings(userSettings: SubscriptionUserSettings, subscriptionId: String, userId: String): js.Promise[SubscriptionUserSettings] = js.native
  }
}
