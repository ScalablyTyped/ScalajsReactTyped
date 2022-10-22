package typingsJapgolly.fullcalendarCore.mod

import typingsJapgolly.fullcalendarCommon.mod.CalendarListeners
import typingsJapgolly.fullcalendarCommon.mod.Duration
import typingsJapgolly.fullcalendarCommon.mod.ScrollRequestHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@fullcalendar/core", "ScrollResponder")
@js.native
open class ScrollResponder protected ()
  extends typingsJapgolly.fullcalendarCommon.mod.ScrollResponder {
  def this(
    execFunc: ScrollRequestHandler,
    emitter: typingsJapgolly.fullcalendarCommon.mod.Emitter[CalendarListeners],
    scrollTime: Duration,
    scrollTimeReset: Boolean
  ) = this()
}
