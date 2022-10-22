package typingsJapgolly.reactCalendarTimeline.mod

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.reactCalendarTimeline.reactCalendarTimelineStrings.both
import typingsJapgolly.reactCalendarTimeline.reactCalendarTimelineStrings.left
import typingsJapgolly.reactCalendarTimeline.reactCalendarTimelineStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimelineItemBase[DateType] extends StObject {
  
  var canChangeGroup: js.UndefOr[Boolean] = js.undefined
  
  var canMove: js.UndefOr[Boolean] = js.undefined
  
  var canResize: js.UndefOr[Boolean | left | right | both] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var end_time: DateType
  
  var group: Id
  
  var id: Id
  
  var itemProps: js.UndefOr[HTMLAttributes[HTMLDivElement]] = js.undefined
  
  var start_time: DateType
  
  var style: js.UndefOr[CSSProperties] = js.undefined
  
  var title: js.UndefOr[Node] = js.undefined
}
object TimelineItemBase {
  
  inline def apply[DateType](end_time: DateType, group: Id, id: Id, start_time: DateType): TimelineItemBase[DateType] = {
    val __obj = js.Dynamic.literal(end_time = end_time.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineItemBase[DateType]]
  }
  
  extension [Self <: TimelineItemBase[?], DateType](x: Self & TimelineItemBase[DateType]) {
    
    inline def setCanChangeGroup(value: Boolean): Self = StObject.set(x, "canChangeGroup", value.asInstanceOf[js.Any])
    
    inline def setCanChangeGroupUndefined: Self = StObject.set(x, "canChangeGroup", js.undefined)
    
    inline def setCanMove(value: Boolean): Self = StObject.set(x, "canMove", value.asInstanceOf[js.Any])
    
    inline def setCanMoveUndefined: Self = StObject.set(x, "canMove", js.undefined)
    
    inline def setCanResize(value: Boolean | left | right | both): Self = StObject.set(x, "canResize", value.asInstanceOf[js.Any])
    
    inline def setCanResizeUndefined: Self = StObject.set(x, "canResize", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setEnd_time(value: DateType): Self = StObject.set(x, "end_time", value.asInstanceOf[js.Any])
    
    inline def setGroup(value: Id): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setItemProps(value: HTMLAttributes[HTMLDivElement]): Self = StObject.set(x, "itemProps", value.asInstanceOf[js.Any])
    
    inline def setItemPropsUndefined: Self = StObject.set(x, "itemProps", js.undefined)
    
    inline def setStart_time(value: DateType): Self = StObject.set(x, "start_time", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTitle(value: VdomNode): Self = StObject.set(x, "title", value.rawNode.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "title", js.Array(value*))
    
    inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
  }
}
