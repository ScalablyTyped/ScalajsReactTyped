package typingsJapgolly.reactCalendarTimeline.mod

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.reactCalendarTimeline.reactCalendarTimelineStrings.left
import typingsJapgolly.reactCalendarTimeline.reactCalendarTimelineStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SidebarHeaderProps[Data] extends StObject {
  
  def children(props: SidebarHeaderChildrenFnProps[Data]): Node
  
  var headerData: js.UndefOr[Data] = js.undefined
  
  var variant: js.UndefOr[left | right] = js.undefined
}
object SidebarHeaderProps {
  
  inline def apply[Data](children: SidebarHeaderChildrenFnProps[Data] => Node): SidebarHeaderProps[Data] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[SidebarHeaderProps[Data]]
  }
  
  extension [Self <: SidebarHeaderProps[?], Data](x: Self & SidebarHeaderProps[Data]) {
    
    inline def setChildren(value: SidebarHeaderChildrenFnProps[Data] => Node): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    inline def setHeaderData(value: Data): Self = StObject.set(x, "headerData", value.asInstanceOf[js.Any])
    
    inline def setHeaderDataUndefined: Self = StObject.set(x, "headerData", js.undefined)
    
    inline def setVariant(value: left | right): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
