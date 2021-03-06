package typingsJapgolly.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NotificationStatisticType extends js.Object

@JSImport("vso-node-api/interfaces/NotificationInterfaces", "NotificationStatisticType")
@js.native
object NotificationStatisticType extends js.Object {
  @js.native
  sealed trait DelayRangeStart extends NotificationStatisticType
  
  @js.native
  sealed trait EventPipelineTime extends NotificationStatisticType
  
  @js.native
  sealed trait Events extends NotificationStatisticType
  
  @js.native
  sealed trait EventsByEventType extends NotificationStatisticType
  
  @js.native
  sealed trait EventsByEventTypePerUser extends NotificationStatisticType
  
  @js.native
  sealed trait HourlyEventPipelineTime extends NotificationStatisticType
  
  @js.native
  sealed trait HourlyEvents extends NotificationStatisticType
  
  @js.native
  sealed trait HourlyEventsByEventTypePerUser extends NotificationStatisticType
  
  @js.native
  sealed trait HourlyNotificationBySubscription extends NotificationStatisticType
  
  @js.native
  sealed trait HourlyNotificationPipelineTime extends NotificationStatisticType
  
  @js.native
  sealed trait HourlyNotifications extends NotificationStatisticType
  
  @js.native
  sealed trait HourlyRangeStart extends NotificationStatisticType
  
  @js.native
  sealed trait HourlyTotalPipelineTime extends NotificationStatisticType
  
  @js.native
  sealed trait HourlyUnprocessedEventDelayByPublisher extends NotificationStatisticType
  
  @js.native
  sealed trait HourlyUnprocessedEventsByPublisher extends NotificationStatisticType
  
  @js.native
  sealed trait HourlyUnprocessedNotificationDelayByChannelByPublisher extends NotificationStatisticType
  
  @js.native
  sealed trait HourlyUnprocessedNotificationsByChannelByPublisher extends NotificationStatisticType
  
  @js.native
  sealed trait NotificationByEventType extends NotificationStatisticType
  
  @js.native
  sealed trait NotificationByEventTypePerUser extends NotificationStatisticType
  
  @js.native
  sealed trait NotificationBySubscription extends NotificationStatisticType
  
  @js.native
  sealed trait NotificationFailureBySubscription extends NotificationStatisticType
  
  @js.native
  sealed trait NotificationPipelineTime extends NotificationStatisticType
  
  @js.native
  sealed trait Notifications extends NotificationStatisticType
  
  @js.native
  sealed trait TotalPipelineTime extends NotificationStatisticType
  
  @js.native
  sealed trait UnprocessedEventDelayByPublisher extends NotificationStatisticType
  
  @js.native
  sealed trait UnprocessedEventsByPublisher extends NotificationStatisticType
  
  @js.native
  sealed trait UnprocessedNotificationDelayByChannelByPublisher extends NotificationStatisticType
  
  @js.native
  sealed trait UnprocessedNotificationsByChannelByPublisher extends NotificationStatisticType
  
  @js.native
  sealed trait UnprocessedRangeStart extends NotificationStatisticType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NotificationStatisticType with Double] = js.native
  /* 200 */ @js.native
  object DelayRangeStart extends TopLevel[DelayRangeStart with Double]
  
  /* 203 */ @js.native
  object EventPipelineTime extends TopLevel[EventPipelineTime with Double]
  
  /* 5 */ @js.native
  object Events extends TopLevel[Events with Double]
  
  /* 1 */ @js.native
  object EventsByEventType extends TopLevel[EventsByEventType with Double]
  
  /* 3 */ @js.native
  object EventsByEventTypePerUser extends TopLevel[EventsByEventTypePerUser with Double]
  
  /* 1203 */ @js.native
  object HourlyEventPipelineTime extends TopLevel[HourlyEventPipelineTime with Double]
  
  /* 1003 */ @js.native
  object HourlyEvents extends TopLevel[HourlyEvents with Double]
  
  /* 1002 */ @js.native
  object HourlyEventsByEventTypePerUser extends TopLevel[HourlyEventsByEventTypePerUser with Double]
  
  /* 1001 */ @js.native
  object HourlyNotificationBySubscription extends TopLevel[HourlyNotificationBySubscription with Double]
  
  /* 1202 */ @js.native
  object HourlyNotificationPipelineTime extends TopLevel[HourlyNotificationPipelineTime with Double]
  
  /* 1004 */ @js.native
  object HourlyNotifications extends TopLevel[HourlyNotifications with Double]
  
  /* 1000 */ @js.native
  object HourlyRangeStart extends TopLevel[HourlyRangeStart with Double]
  
  /* 1201 */ @js.native
  object HourlyTotalPipelineTime extends TopLevel[HourlyTotalPipelineTime with Double]
  
  /* 1102 */ @js.native
  object HourlyUnprocessedEventDelayByPublisher extends TopLevel[HourlyUnprocessedEventDelayByPublisher with Double]
  
  /* 1101 */ @js.native
  object HourlyUnprocessedEventsByPublisher extends TopLevel[HourlyUnprocessedEventsByPublisher with Double]
  
  /* 1104 */ @js.native
  object HourlyUnprocessedNotificationDelayByChannelByPublisher extends TopLevel[HourlyUnprocessedNotificationDelayByChannelByPublisher with Double]
  
  /* 1103 */ @js.native
  object HourlyUnprocessedNotificationsByChannelByPublisher extends TopLevel[HourlyUnprocessedNotificationsByChannelByPublisher with Double]
  
  /* 2 */ @js.native
  object NotificationByEventType extends TopLevel[NotificationByEventType with Double]
  
  /* 4 */ @js.native
  object NotificationByEventTypePerUser extends TopLevel[NotificationByEventTypePerUser with Double]
  
  /* 0 */ @js.native
  object NotificationBySubscription extends TopLevel[NotificationBySubscription with Double]
  
  /* 7 */ @js.native
  object NotificationFailureBySubscription extends TopLevel[NotificationFailureBySubscription with Double]
  
  /* 202 */ @js.native
  object NotificationPipelineTime extends TopLevel[NotificationPipelineTime with Double]
  
  /* 6 */ @js.native
  object Notifications extends TopLevel[Notifications with Double]
  
  /* 201 */ @js.native
  object TotalPipelineTime extends TopLevel[TotalPipelineTime with Double]
  
  /* 102 */ @js.native
  object UnprocessedEventDelayByPublisher extends TopLevel[UnprocessedEventDelayByPublisher with Double]
  
  /* 101 */ @js.native
  object UnprocessedEventsByPublisher extends TopLevel[UnprocessedEventsByPublisher with Double]
  
  /* 104 */ @js.native
  object UnprocessedNotificationDelayByChannelByPublisher extends TopLevel[UnprocessedNotificationDelayByChannelByPublisher with Double]
  
  /* 103 */ @js.native
  object UnprocessedNotificationsByChannelByPublisher extends TopLevel[UnprocessedNotificationsByChannelByPublisher with Double]
  
  /* 100 */ @js.native
  object UnprocessedRangeStart extends TopLevel[UnprocessedRangeStart with Double]
  
}

