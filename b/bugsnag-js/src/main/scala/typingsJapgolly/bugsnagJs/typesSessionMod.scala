package typingsJapgolly.bugsnagJs

import japgolly.scalajs.react.Callback
import typingsJapgolly.bugsnagJs.anon.Handled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSessionMod {
  
  @JSImport("bugsnag-js/types/session", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Session {
    
    /* CompleteClass */
    var events: Handled = js.native
    
    /* CompleteClass */
    var id: String = js.native
    
    /* CompleteClass */
    var startedAt: String = js.native
    
    /* CompleteClass */
    override def trackError(report: typingsJapgolly.bugsnagJs.typesReportMod.default): Unit = js.native
  }
  
  trait Session extends StObject {
    
    var events: Handled
    
    var id: String
    
    var startedAt: String
    
    def trackError(report: typingsJapgolly.bugsnagJs.typesReportMod.default): Unit
  }
  object Session {
    
    inline def apply(
      events: Handled,
      id: String,
      startedAt: String,
      trackError: typingsJapgolly.bugsnagJs.typesReportMod.default => Callback
    ): Session = {
      val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], startedAt = startedAt.asInstanceOf[js.Any], trackError = js.Any.fromFunction1((t0: typingsJapgolly.bugsnagJs.typesReportMod.default) => trackError(t0).runNow()))
      __obj.asInstanceOf[Session]
    }
    
    extension [Self <: Session](x: Self) {
      
      inline def setEvents(value: Handled): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setStartedAt(value: String): Self = StObject.set(x, "startedAt", value.asInstanceOf[js.Any])
      
      inline def setTrackError(value: typingsJapgolly.bugsnagJs.typesReportMod.default => Callback): Self = StObject.set(x, "trackError", js.Any.fromFunction1((t0: typingsJapgolly.bugsnagJs.typesReportMod.default) => value(t0).runNow()))
    }
  }
}
