package typingsJapgolly.fullcalendar.eventManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/EventManager", "Default")
@js.native
class Default_ protected () extends js.Object {
  def this(calendar: js.Any) = this()
  var calendar: js.Any = js.native
  var currentPeriod: js.Any = js.native
  @JSName("hasHandlers")
  var hasHandlers_Original: js.Function1[/* type */ js.Any, _] = js.native
  @JSName("listenTo")
  var listenTo_Original: js.Function3[/* other */ js.Any, /* arg */ js.Any, /* callback */ js.UndefOr[js.Any], _] = js.native
  @JSName("off")
  var off_Original: js.Function2[/* types */ js.Any, /* handler */ js.Any, _] = js.native
  @JSName("on")
  var on_Original: js.Function2[/* types */ js.Any, /* handler */ js.Any, _] = js.native
  @JSName("one")
  var one_Original: js.Function2[/* types */ js.Any, /* handler */ js.Any, _] = js.native
  var otherSources: js.Any = js.native
  var stickySource: js.Any = js.native
  @JSName("stopListeningTo")
  var stopListeningTo_Original: js.Function2[/* other */ js.Any, /* eventName */ js.UndefOr[js.Any], _] = js.native
  @JSName("triggerWith")
  var triggerWith_Original: js.Function3[/* types */ js.Any, /* context */ js.Any, /* args */ js.Any, _] = js.native
  @JSName("trigger")
  var trigger_Original: js.Function2[/* types */ js.Any, /* repeated */ js.Any, _] = js.native
  def addEventDef(eventDef: js.Any, isSticky: js.Any): Unit = js.native
  def addSource(eventSource: js.Any): Unit = js.native
  def bindPeriod(eventPeriod: js.Any): Unit = js.native
  def buildMutatedEventInstanceGroup(eventDefId: js.Any, eventDefMutation: js.Any): typingsJapgolly.fullcalendar.eventInstanceGroupMod.default = js.native
  def freeze(): Unit = js.native
  def getEventDefByUid(uid: js.Any): js.Any = js.native
  def getEventDefsById(eventDefId: js.Any): js.Any = js.native
  def getEventInstances(): js.Any = js.native
  def getEventInstancesWithId(eventDefId: js.Any): js.Any = js.native
  def getEventInstancesWithoutId(eventDefId: js.Any): js.Any = js.native
  def getSourceById(id: js.Any): js.Any = js.native
  def getSources(): js.Array[_] = js.native
  def hasHandlers(`type`: js.Any): js.Any = js.native
  def listenTo(other: js.Any, arg: js.Any): js.Any = js.native
  def listenTo(other: js.Any, arg: js.Any, callback: js.Any): js.Any = js.native
  def multiQuerySources(matchInputs: js.Any): js.Array[_] = js.native
  def mutateEventsWithId(eventDefId: js.Any, eventDefMutation: js.Any): js.Function0[Unit] = js.native
  def off(types: js.Any, handler: js.Any): js.Any = js.native
  def on(types: js.Any, handler: js.Any): js.Any = js.native
  def one(types: js.Any, handler: js.Any): js.Any = js.native
  def querySources(matchInput: js.Any): js.Array[_] = js.native
  def refetchAllSources(): Unit = js.native
  def refetchSource(eventSource: js.Any): Unit = js.native
  def removeAllEventDefs(): Unit = js.native
  def removeAllSources(): Unit = js.native
  def removeEventDefsById(eventId: js.Any): Unit = js.native
  def removeSource(doomedSource: js.Any): Unit = js.native
  def requestEvents(start: js.Any, end: js.Any, timezone: js.Any, force: js.Any): js.Any = js.native
  def setPeriod(eventPeriod: js.Any): Unit = js.native
  def stopListeningTo(other: js.Any): js.Any = js.native
  def stopListeningTo(other: js.Any, eventName: js.Any): js.Any = js.native
  def thaw(): Unit = js.native
  def trigger(types: js.Any, args: js.Any*): js.Any = js.native
  def triggerWith(types: js.Any, context: js.Any, args: js.Any): js.Any = js.native
  def unbindPeriod(eventPeriod: js.Any): Unit = js.native
}

