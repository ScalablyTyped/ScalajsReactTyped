package typingsJapgolly.fullcalendar.exportsMod

import typingsJapgolly.fullcalendar.eventSourceMod.Default_
import typingsJapgolly.fullcalendar.eventSourceMod.default
import typingsJapgolly.fullcalendar.fullcalendarBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/src/exports", "EventSource")
@js.native
class EventSource protected () extends default {
  def this(calendar: js.Any) = this()
}

/* static members */
@JSImport("fullcalendar/src/exports", "EventSource")
@js.native
object EventSource extends js.Object {
  var copyVerbatimStandardProps: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ParsableModelMixin.copyVerbatimStandardProps */ js.Any = js.native
  var defineStandardProps: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ParsableModelMixin.defineStandardProps */ js.Any = js.native
  var uuid: Double = js.native
  def normalizeId(id: js.Any): String = js.native
  def parse(rawInput: js.Any, calendar: js.Any): `false` | Default_ = js.native
}

