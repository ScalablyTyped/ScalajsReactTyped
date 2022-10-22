package typingsJapgolly.reactCalendarTimeline.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimelineHeadersProps extends StObject {
  
  var calendarHeaderClassName: js.UndefOr[String] = js.undefined
  
  var calendarHeaderStyle: js.UndefOr[CSSProperties] = js.undefined
  
  var children: js.UndefOr[Node] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var headerRef: js.UndefOr[Ref[Any]] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
}
object TimelineHeadersProps {
  
  inline def apply(): TimelineHeadersProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimelineHeadersProps]
  }
  
  extension [Self <: TimelineHeadersProps](x: Self) {
    
    inline def setCalendarHeaderClassName(value: String): Self = StObject.set(x, "calendarHeaderClassName", value.asInstanceOf[js.Any])
    
    inline def setCalendarHeaderClassNameUndefined: Self = StObject.set(x, "calendarHeaderClassName", js.undefined)
    
    inline def setCalendarHeaderStyle(value: CSSProperties): Self = StObject.set(x, "calendarHeaderStyle", value.asInstanceOf[js.Any])
    
    inline def setCalendarHeaderStyleUndefined: Self = StObject.set(x, "calendarHeaderStyle", js.undefined)
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setHeaderRef(value: Ref[Any]): Self = StObject.set(x, "headerRef", value.asInstanceOf[js.Any])
    
    inline def setHeaderRefFunction1(value: Any | Null => Callback): Self = StObject.set(x, "headerRef", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
    
    inline def setHeaderRefNull: Self = StObject.set(x, "headerRef", null)
    
    inline def setHeaderRefUndefined: Self = StObject.set(x, "headerRef", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
