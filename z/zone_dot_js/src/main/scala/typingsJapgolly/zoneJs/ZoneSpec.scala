package typingsJapgolly.zoneJs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides a way to configure the interception of zone events.
  *
  * Only the `name` property is required (all other are optional).
  */
trait ZoneSpec extends js.Object {
  /**
    * The name of the zone. Useful when debugging Zones.
    */
  var name: String
  /**
    * Allows interception of task cancellation.
    *
    * @param parentZoneDelegate Delegate which performs the parent [ZoneSpec] operation.
    * @param currentZone The current [Zone] where the current interceptor has been declared.
    * @param targetZone The [Zone] which originally received the request.
    * @param task The argument passed into the `cancelTask` method.
    */
  var onCancelTask: js.UndefOr[
    js.Function4[
      /* parentZoneDelegate */ ZoneDelegate, 
      /* currentZone */ Zone, 
      /* targetZone */ Zone, 
      /* task */ Task, 
      _
    ]
  ] = js.undefined
  /**
    * Allows the interception of zone forking.
    *
    * When the zone is being forked, the request is forwarded to this method for interception.
    *
    * @param parentZoneDelegate Delegate which performs the parent [ZoneSpec] operation.
    * @param currentZone The current [Zone] where the current interceptor has been declared.
    * @param targetZone The [Zone] which originally received the request.
    * @param zoneSpec The argument passed into the `fork` method.
    */
  var onFork: js.UndefOr[
    js.Function4[
      /* parentZoneDelegate */ ZoneDelegate, 
      /* currentZone */ Zone, 
      /* targetZone */ Zone, 
      /* zoneSpec */ ZoneSpec, 
      Zone
    ]
  ] = js.undefined
  /**
    * Allows interception of the error handling.
    *
    * @param parentZoneDelegate Delegate which performs the parent [ZoneSpec] operation.
    * @param currentZone The current [Zone] where the current interceptor has been declared.
    * @param targetZone The [Zone] which originally received the request.
    * @param error The argument passed into the `handleError` method.
    */
  var onHandleError: js.UndefOr[
    js.Function4[
      /* parentZoneDelegate */ ZoneDelegate, 
      /* currentZone */ Zone, 
      /* targetZone */ Zone, 
      /* error */ js.Any, 
      Boolean
    ]
  ] = js.undefined
  /**
    * Notifies of changes to the task queue empty status.
    *
    * @param parentZoneDelegate Delegate which performs the parent [ZoneSpec] operation.
    * @param currentZone The current [Zone] where the current interceptor has been declared.
    * @param targetZone The [Zone] which originally received the request.
    * @param hasTaskState
    */
  var onHasTask: js.UndefOr[
    js.Function4[
      /* parentZoneDelegate */ ZoneDelegate, 
      /* currentZone */ Zone, 
      /* targetZone */ Zone, 
      /* hasTaskState */ HasTaskState, 
      Unit
    ]
  ] = js.undefined
  /**
    * Allows interception of the wrapping of the callback.
    *
    * @param parentZoneDelegate Delegate which performs the parent [ZoneSpec] operation.
    * @param currentZone The current [Zone] where the current interceptor has been declared.
    * @param targetZone The [Zone] which originally received the request.
    * @param delegate The argument passed into the `wrap` method.
    * @param source The argument passed into the `wrap` method.
    */
  var onIntercept: js.UndefOr[
    js.Function5[
      /* parentZoneDelegate */ ZoneDelegate, 
      /* currentZone */ Zone, 
      /* targetZone */ Zone, 
      /* delegate */ js.Function, 
      /* source */ String, 
      js.Function
    ]
  ] = js.undefined
  /**
    * Allows interception of the callback invocation.
    *
    * @param parentZoneDelegate Delegate which performs the parent [ZoneSpec] operation.
    * @param currentZone The current [Zone] where the current interceptor has been declared.
    * @param targetZone The [Zone] which originally received the request.
    * @param delegate The argument passed into the `run` method.
    * @param applyThis The argument passed into the `run` method.
    * @param applyArgs The argument passed into the `run` method.
    * @param source The argument passed into the `run` method.
    */
  var onInvoke: js.UndefOr[
    js.Function7[
      /* parentZoneDelegate */ ZoneDelegate, 
      /* currentZone */ Zone, 
      /* targetZone */ Zone, 
      /* delegate */ js.Function, 
      /* applyThis */ js.Any, 
      /* applyArgs */ js.UndefOr[js.Array[_]], 
      /* source */ js.UndefOr[String], 
      _
    ]
  ] = js.undefined
  var onInvokeTask: js.UndefOr[
    js.Function6[
      /* parentZoneDelegate */ ZoneDelegate, 
      /* currentZone */ Zone, 
      /* targetZone */ Zone, 
      /* task */ Task, 
      /* applyThis */ js.Any, 
      /* applyArgs */ js.UndefOr[js.Array[_]], 
      _
    ]
  ] = js.undefined
  /**
    * Allows interception of task scheduling.
    *
    * @param parentZoneDelegate Delegate which performs the parent [ZoneSpec] operation.
    * @param currentZone The current [Zone] where the current interceptor has been declared.
    * @param targetZone The [Zone] which originally received the request.
    * @param task The argument passed into the `scheduleTask` method.
    */
  var onScheduleTask: js.UndefOr[
    js.Function4[
      /* parentZoneDelegate */ ZoneDelegate, 
      /* currentZone */ Zone, 
      /* targetZone */ Zone, 
      /* task */ Task, 
      Task
    ]
  ] = js.undefined
  /**
    * A set of properties to be associated with Zone. Use [Zone.get] to retrieve them.
    */
  var properties: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object ZoneSpec {
  @scala.inline
  def apply(
    name: String,
    onCancelTask: (/* parentZoneDelegate */ ZoneDelegate, /* currentZone */ Zone, /* targetZone */ Zone, /* task */ Task) => CallbackTo[js.Any] = null,
    onFork: (/* parentZoneDelegate */ ZoneDelegate, /* currentZone */ Zone, /* targetZone */ Zone, /* zoneSpec */ ZoneSpec) => CallbackTo[Zone] = null,
    onHandleError: (/* parentZoneDelegate */ ZoneDelegate, /* currentZone */ Zone, /* targetZone */ Zone, /* error */ js.Any) => CallbackTo[Boolean] = null,
    onHasTask: (/* parentZoneDelegate */ ZoneDelegate, /* currentZone */ Zone, /* targetZone */ Zone, /* hasTaskState */ HasTaskState) => Callback = null,
    onIntercept: (/* parentZoneDelegate */ ZoneDelegate, /* currentZone */ Zone, /* targetZone */ Zone, /* delegate */ js.Function, /* source */ String) => CallbackTo[js.Function] = null,
    onInvoke: (/* parentZoneDelegate */ ZoneDelegate, /* currentZone */ Zone, /* targetZone */ Zone, /* delegate */ js.Function, /* applyThis */ js.Any, /* applyArgs */ js.UndefOr[js.Array[js.Any]], /* source */ js.UndefOr[String]) => CallbackTo[js.Any] = null,
    onInvokeTask: (/* parentZoneDelegate */ ZoneDelegate, /* currentZone */ Zone, /* targetZone */ Zone, /* task */ Task, /* applyThis */ js.Any, /* applyArgs */ js.UndefOr[js.Array[js.Any]]) => CallbackTo[js.Any] = null,
    onScheduleTask: (/* parentZoneDelegate */ ZoneDelegate, /* currentZone */ Zone, /* targetZone */ Zone, /* task */ Task) => CallbackTo[Task] = null,
    properties: StringDictionary[js.Any] = null
  ): ZoneSpec = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (onCancelTask != null) __obj.updateDynamic("onCancelTask")(js.Any.fromFunction4((t0: /* parentZoneDelegate */ typingsJapgolly.zoneJs.ZoneDelegate, t1: /* currentZone */ typingsJapgolly.zoneJs.Zone, t2: /* targetZone */ typingsJapgolly.zoneJs.Zone, t3: /* task */ typingsJapgolly.zoneJs.Task) => onCancelTask(t0, t1, t2, t3).runNow()))
    if (onFork != null) __obj.updateDynamic("onFork")(js.Any.fromFunction4((t0: /* parentZoneDelegate */ typingsJapgolly.zoneJs.ZoneDelegate, t1: /* currentZone */ typingsJapgolly.zoneJs.Zone, t2: /* targetZone */ typingsJapgolly.zoneJs.Zone, t3: /* zoneSpec */ typingsJapgolly.zoneJs.ZoneSpec) => onFork(t0, t1, t2, t3).runNow()))
    if (onHandleError != null) __obj.updateDynamic("onHandleError")(js.Any.fromFunction4((t0: /* parentZoneDelegate */ typingsJapgolly.zoneJs.ZoneDelegate, t1: /* currentZone */ typingsJapgolly.zoneJs.Zone, t2: /* targetZone */ typingsJapgolly.zoneJs.Zone, t3: /* error */ js.Any) => onHandleError(t0, t1, t2, t3).runNow()))
    if (onHasTask != null) __obj.updateDynamic("onHasTask")(js.Any.fromFunction4((t0: /* parentZoneDelegate */ typingsJapgolly.zoneJs.ZoneDelegate, t1: /* currentZone */ typingsJapgolly.zoneJs.Zone, t2: /* targetZone */ typingsJapgolly.zoneJs.Zone, t3: /* hasTaskState */ typingsJapgolly.zoneJs.HasTaskState) => onHasTask(t0, t1, t2, t3).runNow()))
    if (onIntercept != null) __obj.updateDynamic("onIntercept")(js.Any.fromFunction5((t0: /* parentZoneDelegate */ typingsJapgolly.zoneJs.ZoneDelegate, t1: /* currentZone */ typingsJapgolly.zoneJs.Zone, t2: /* targetZone */ typingsJapgolly.zoneJs.Zone, t3: /* delegate */ js.Function, t4: /* source */ java.lang.String) => onIntercept(t0, t1, t2, t3, t4).runNow()))
    if (onInvoke != null) __obj.updateDynamic("onInvoke")(js.Any.fromFunction7((t0: /* parentZoneDelegate */ typingsJapgolly.zoneJs.ZoneDelegate, t1: /* currentZone */ typingsJapgolly.zoneJs.Zone, t2: /* targetZone */ typingsJapgolly.zoneJs.Zone, t3: /* delegate */ js.Function, t4: /* applyThis */ js.Any, t5: /* applyArgs */ js.UndefOr[js.Array[js.Any]], t6: /* source */ js.UndefOr[java.lang.String]) => onInvoke(t0, t1, t2, t3, t4, t5, t6).runNow()))
    if (onInvokeTask != null) __obj.updateDynamic("onInvokeTask")(js.Any.fromFunction6((t0: /* parentZoneDelegate */ typingsJapgolly.zoneJs.ZoneDelegate, t1: /* currentZone */ typingsJapgolly.zoneJs.Zone, t2: /* targetZone */ typingsJapgolly.zoneJs.Zone, t3: /* task */ typingsJapgolly.zoneJs.Task, t4: /* applyThis */ js.Any, t5: /* applyArgs */ js.UndefOr[js.Array[js.Any]]) => onInvokeTask(t0, t1, t2, t3, t4, t5).runNow()))
    if (onScheduleTask != null) __obj.updateDynamic("onScheduleTask")(js.Any.fromFunction4((t0: /* parentZoneDelegate */ typingsJapgolly.zoneJs.ZoneDelegate, t1: /* currentZone */ typingsJapgolly.zoneJs.Zone, t2: /* targetZone */ typingsJapgolly.zoneJs.Zone, t3: /* task */ typingsJapgolly.zoneJs.Task) => onScheduleTask(t0, t1, t2, t3).runNow()))
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoneSpec]
  }
}

