package typingsJapgolly.ably.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Types {
  type ChannelEvent = typingsJapgolly.ably.mod.Types.ChannelEvent.FAILED | typingsJapgolly.ably.mod.Types.ChannelEvent.INITIALIZED | typingsJapgolly.ably.mod.Types.ChannelEvent.SUSPENDED | typingsJapgolly.ably.mod.Types.ChannelEvent.ATTACHED | typingsJapgolly.ably.mod.Types.ChannelEvent.ATTACHING | typingsJapgolly.ably.mod.Types.ChannelEvent.DETACHED | typingsJapgolly.ably.mod.Types.ChannelEvent.DETACHING | typingsJapgolly.ably.mod.Types.ChannelEvent.UPDATE
  type ChannelState = typingsJapgolly.ably.mod.Types.ChannelState.FAILED | typingsJapgolly.ably.mod.Types.ChannelState.INITIALIZED | typingsJapgolly.ably.mod.Types.ChannelState.SUSPENDED | typingsJapgolly.ably.mod.Types.ChannelState.ATTACHED | typingsJapgolly.ably.mod.Types.ChannelState.ATTACHING | typingsJapgolly.ably.mod.Types.ChannelState.DETACHED | typingsJapgolly.ably.mod.Types.ChannelState.DETACHING
  type ConnectionEvent = typingsJapgolly.ably.mod.Types.ConnectionEvent.INITIALIZED | typingsJapgolly.ably.mod.Types.ConnectionEvent.CONNECTED | typingsJapgolly.ably.mod.Types.ConnectionEvent.CONNECTING | typingsJapgolly.ably.mod.Types.ConnectionEvent.DISCONNECTED | typingsJapgolly.ably.mod.Types.ConnectionEvent.SUSPENDED | typingsJapgolly.ably.mod.Types.ConnectionEvent.CLOSED | typingsJapgolly.ably.mod.Types.ConnectionEvent.CLOSING | typingsJapgolly.ably.mod.Types.ConnectionEvent.FAILED | typingsJapgolly.ably.mod.Types.ConnectionEvent.UPDATE
  type ConnectionState = typingsJapgolly.ably.mod.Types.ConnectionState.INITIALIZED | typingsJapgolly.ably.mod.Types.ConnectionState.CONNECTED | typingsJapgolly.ably.mod.Types.ConnectionState.CONNECTING | typingsJapgolly.ably.mod.Types.ConnectionState.DISCONNECTED | typingsJapgolly.ably.mod.Types.ConnectionState.SUSPENDED | typingsJapgolly.ably.mod.Types.ConnectionState.CLOSED | typingsJapgolly.ably.mod.Types.ConnectionState.CLOSING | typingsJapgolly.ably.mod.Types.ConnectionState.FAILED
  type HTTPMethods = typingsJapgolly.ably.mod.Types.HTTPMethods.GET | typingsJapgolly.ably.mod.Types.HTTPMethods.POST
  type PresenceAction = typingsJapgolly.ably.mod.Types.PresenceAction.ABSENT | typingsJapgolly.ably.mod.Types.PresenceAction.PRESENT | typingsJapgolly.ably.mod.Types.PresenceAction.ENTER | typingsJapgolly.ably.mod.Types.PresenceAction.LEAVE | typingsJapgolly.ably.mod.Types.PresenceAction.UPDATE
  type StatsIntervalGranularity = typingsJapgolly.ably.mod.Types.StatsIntervalGranularity.MINUTE | typingsJapgolly.ably.mod.Types.StatsIntervalGranularity.HOUR | typingsJapgolly.ably.mod.Types.StatsIntervalGranularity.DAY | typingsJapgolly.ably.mod.Types.StatsIntervalGranularity.MONTH
  type channelEventCallback = js.Function1[
    /* changeStateChange */ typingsJapgolly.ably.mod.Types.ChannelStateChange, 
    scala.Unit
  ]
  type connectionEventCallback = js.Function1[
    /* connectionStateChange */ typingsJapgolly.ably.mod.Types.ConnectionStateChange, 
    scala.Unit
  ]
  type errorCallback = js.Function1[/* error */ typingsJapgolly.ably.mod.Types.ErrorInfo, scala.Unit]
  type fromEncoded[T] = js.Function2[
    /* JsonObject */ js.Any, 
    /* channelOptions */ js.UndefOr[typingsJapgolly.ably.mod.Types.ChannelOptions], 
    T
  ]
  type fromEncodedArray[T] = js.Function2[
    /* JsonArray */ js.Array[js.Any], 
    /* channelOptions */ js.UndefOr[typingsJapgolly.ably.mod.Types.ChannelOptions], 
    js.Array[T]
  ]
  type messageCallback[T] = js.Function1[/* message */ T, scala.Unit]
  // Common Listeners
  type paginatedResultCallback[T] = js.Function2[
    /* error */ typingsJapgolly.ably.mod.Types.ErrorInfo, 
    /* results */ typingsJapgolly.ably.mod.Types.PaginatedResult[T], 
    scala.Unit
  ]
  type realtimePresenceGetCallback = js.Function2[
    /* error */ typingsJapgolly.ably.mod.Types.ErrorInfo, 
    /* messages */ js.Array[typingsJapgolly.ably.mod.Types.PresenceMessage], 
    scala.Unit
  ]
  type standardCallback = js.Function2[
    /* error */ typingsJapgolly.ably.mod.Types.ErrorInfo, 
    /* results */ js.Any, 
    scala.Unit
  ]
  type timeCallback = js.Function2[
    /* error */ typingsJapgolly.ably.mod.Types.ErrorInfo, 
    /* time */ scala.Double, 
    scala.Unit
  ]
  type tokenDetailsCallback = js.Function2[
    /* error */ typingsJapgolly.ably.mod.Types.ErrorInfo, 
    /* Results */ typingsJapgolly.ably.mod.Types.TokenDetails, 
    scala.Unit
  ]
  type tokenRequestCallback = js.Function2[
    /* error */ typingsJapgolly.ably.mod.Types.ErrorInfo, 
    /* Results */ typingsJapgolly.ably.mod.Types.TokenRequest, 
    scala.Unit
  ]
}
