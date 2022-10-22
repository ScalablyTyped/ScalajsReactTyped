package typingsJapgolly.reactCalendarTimeline.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReactCalendarGroupRendererProps[CustomGroup /* <: TimelineGroupBase */] extends StObject {
  
  var group: CustomGroup
  
  var isRightSidebar: js.UndefOr[Boolean] = js.undefined
}
object ReactCalendarGroupRendererProps {
  
  inline def apply[CustomGroup /* <: TimelineGroupBase */](group: CustomGroup): ReactCalendarGroupRendererProps[CustomGroup] = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactCalendarGroupRendererProps[CustomGroup]]
  }
  
  extension [Self <: ReactCalendarGroupRendererProps[?], CustomGroup /* <: TimelineGroupBase */](x: Self & ReactCalendarGroupRendererProps[CustomGroup]) {
    
    inline def setGroup(value: CustomGroup): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setIsRightSidebar(value: Boolean): Self = StObject.set(x, "isRightSidebar", value.asInstanceOf[js.Any])
    
    inline def setIsRightSidebarUndefined: Self = StObject.set(x, "isRightSidebar", js.undefined)
  }
}
