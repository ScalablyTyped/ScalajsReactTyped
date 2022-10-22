package typingsJapgolly.fullcalendarVue.mod

import typingsJapgolly.fullcalendarCommon.mod.CalendarListeners
import typingsJapgolly.fullcalendarCommon.mod.Duration
import typingsJapgolly.fullcalendarCommon.mod.ScrollRequestHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@fullcalendar/vue", "ScrollResponder")
@js.native
open class ScrollResponder protected ()
  extends typingsJapgolly.fullcalendarCore.mod.ScrollResponder {
  def this(
    execFunc: ScrollRequestHandler,
    emitter: typingsJapgolly.fullcalendarCommon.mod.Emitter[CalendarListeners],
    scrollTime: Duration,
    scrollTimeReset: Boolean
  ) = this()
}
