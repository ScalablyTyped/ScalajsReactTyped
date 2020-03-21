package typingsJapgolly.fullcalendar.exportsMod

import typingsJapgolly.fullcalendar.calendarMod.default
import typingsJapgolly.fullcalendar.inputTypesMod.OptionsInput
import typingsJapgolly.fullcalendar.jqueryHooksMod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/src/exports", "Calendar")
@js.native
class Calendar protected () extends default {
  def this(el: JQuery, overrides: OptionsInput) = this()
}

/* static members */
@JSImport("fullcalendar/src/exports", "Calendar")
@js.native
object Calendar extends js.Object {
  var defaults: js.Any = js.native
  var englishDefaults: js.Any = js.native
  var rtlDefaults: js.Any = js.native
}

