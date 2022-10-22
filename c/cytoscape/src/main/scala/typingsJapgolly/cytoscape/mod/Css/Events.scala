package typingsJapgolly.cytoscape.mod.Css

import typingsJapgolly.cytoscape.cytoscapeStrings.no
import typingsJapgolly.cytoscape.cytoscapeStrings.yes
import typingsJapgolly.cytoscape.mod.EdgeSingular
import typingsJapgolly.cytoscape.mod.NodeSingular
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#style/events
  */
trait Events[SingularType /* <: NodeSingular | EdgeSingular */] extends StObject {
  
  /**
    * Whether events should occur on an element (e.g.tap, mouseover, etc.).
    *  * For "no", the element receives no events and events simply pass through to the core/viewport.
    */
  var events: PropertyValue[SingularType, yes | no]
  
  /**
    *  Whether events should occur on an element if the label receives an event.
    * You may want a style applied to the text on active so you know the text is activatable.
    */
  var `text-events`: PropertyValue[SingularType, yes | no]
}
object Events {
  
  inline def apply[SingularType /* <: NodeSingular | EdgeSingular */](
    events: PropertyValue[SingularType, yes | no],
    `text-events`: PropertyValue[SingularType, yes | no]
  ): Events[SingularType] = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any])
    __obj.updateDynamic("text-events")(`text-events`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Events[SingularType]]
  }
  
  extension [Self <: Events[?], SingularType /* <: NodeSingular | EdgeSingular */](x: Self & Events[SingularType]) {
    
    inline def setEvents(value: PropertyValue[SingularType, yes | no]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsFunction1(value: SingularType => yes | no): Self = StObject.set(x, "events", js.Any.fromFunction1(value))
    
    inline def `setText-events`(value: PropertyValue[SingularType, yes | no]): Self = StObject.set(x, "text-events", value.asInstanceOf[js.Any])
    
    inline def `setText-eventsFunction1`(value: SingularType => yes | no): Self = StObject.set(x, "text-events", js.Any.fromFunction1(value))
  }
}
