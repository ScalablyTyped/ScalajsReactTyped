package typingsJapgolly.reactCalendarTimeline.mod

import japgolly.scalajs.react.facade.React.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<react-calendar-timeline.react-calendar-timeline.MarkerProps, 'date'> */
trait CursorMarkerProps extends StObject {
  
  var children: js.UndefOr[js.Function1[/* props */ CustomMarkerChildrenProps, Node]] = js.undefined
}
object CursorMarkerProps {
  
  inline def apply(): CursorMarkerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CursorMarkerProps]
  }
  
  extension [Self <: CursorMarkerProps](x: Self) {
    
    inline def setChildren(value: /* props */ CustomMarkerChildrenProps => Node): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
  }
}
