package typingsJapgolly.reactNativeCalendars.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNativeCalendars.mod.TimelineEvent
import typingsJapgolly.reactNativeCalendars.mod.TimelineProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Timeline {
  
  @JSImport("react-native-calendars", "Timeline")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactNativeCalendars.mod.Timeline] {
    
    inline def end(value: Double): this.type = set("end", value.asInstanceOf[js.Any])
    
    inline def eventTapped(value: /* event */ TimelineEvent => Any): this.type = set("eventTapped", js.Any.fromFunction1(value))
    
    inline def events(value: js.Array[TimelineEvent]): this.type = set("events", value.asInstanceOf[js.Any])
    
    inline def eventsVarargs(value: TimelineEvent*): this.type = set("events", js.Array(value*))
    
    inline def format24h(value: Boolean): this.type = set("format24h", value.asInstanceOf[js.Any])
    
    inline def start(value: Double): this.type = set("start", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Timeline.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TimelineProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
