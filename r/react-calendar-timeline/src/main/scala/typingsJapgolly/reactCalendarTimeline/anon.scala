package typingsJapgolly.reactCalendarTimeline

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.moment.mod.Moment
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.react.mod.ReactEventHandler
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.react.mod.TouchEventHandler
import typingsJapgolly.reactCalendarTimeline.mod.Interval
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ClassName extends StObject {
    
    var className: String
    
    var ref: Ref[Any]
    
    var style: CSSProperties
  }
  object ClassName {
    
    inline def apply(className: String, style: CSSProperties): ClassName = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], ref = null)
      __obj.asInstanceOf[ClassName]
    }
    
    extension [Self <: ClassName](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setRef(value: Ref[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: Any | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  trait CollisionLeft extends StObject {
    
    var collisionLeft: Double
    
    var collisionWidth: Double
    
    var height: Double
    
    var isDragging: Boolean
    
    var left: Double
    
    var order: Group
    
    var originalLeft: Double
    
    var stack: Boolean
    
    var top: Double | Null
    
    var width: Double
  }
  object CollisionLeft {
    
    inline def apply(
      collisionLeft: Double,
      collisionWidth: Double,
      height: Double,
      isDragging: Boolean,
      left: Double,
      order: Group,
      originalLeft: Double,
      stack: Boolean,
      width: Double
    ): CollisionLeft = {
      val __obj = js.Dynamic.literal(collisionLeft = collisionLeft.asInstanceOf[js.Any], collisionWidth = collisionWidth.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], isDragging = isDragging.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], originalLeft = originalLeft.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], top = null)
      __obj.asInstanceOf[CollisionLeft]
    }
    
    extension [Self <: CollisionLeft](x: Self) {
      
      inline def setCollisionLeft(value: Double): Self = StObject.set(x, "collisionLeft", value.asInstanceOf[js.Any])
      
      inline def setCollisionWidth(value: Double): Self = StObject.set(x, "collisionWidth", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setIsDragging(value: Boolean): Self = StObject.set(x, "isDragging", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setOrder(value: Group): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOriginalLeft(value: Double): Self = StObject.set(x, "originalLeft", value.asInstanceOf[js.Any])
      
      inline def setStack(value: Boolean): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopNull: Self = StObject.set(x, "top", null)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait EndTime extends StObject {
    
    var endTime: Moment
    
    var startTime: Moment
  }
  object EndTime {
    
    inline def apply(endTime: Moment, startTime: Moment): EndTime = {
      val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndTime]
    }
    
    extension [Self <: EndTime](x: Self) {
      
      inline def setEndTime(value: Moment): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
      
      inline def setStartTime(value: Moment): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    }
  }
  
  trait Group extends StObject {
    
    var group: Id
    
    var index: Double
  }
  object Group {
    
    inline def apply(group: Id, index: Double): Group = {
      val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[Group]
    }
    
    extension [Self <: Group](x: Self) {
      
      inline def setGroup(value: Id): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    }
  }
  
  trait Id extends StObject {
    
    var id: String
  }
  object Id {
    
    inline def apply(id: String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    extension [Self <: Id](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait Key extends StObject {
    
    var className: String
    
    var key: typingsJapgolly.reactCalendarTimeline.mod.Id
    
    var onContextMenu: ReactEventHandler[Element]
    
    var onDoubleClick: MouseEventHandler[Element]
    
    var onMouseDown: MouseEventHandler[Element]
    
    var onMouseUp: MouseEventHandler[Element]
    
    var onTouchEnd: TouchEventHandler[Element]
    
    var onTouchStart: TouchEventHandler[Element]
    
    var ref: Ref[Any]
    
    var style: CSSProperties
  }
  object Key {
    
    inline def apply(
      className: String,
      key: typingsJapgolly.reactCalendarTimeline.mod.Id,
      onContextMenu: ReactEventFrom[Element & Element] => Callback,
      onDoubleClick: ReactMouseEventFrom[Element & Element] => Callback,
      onMouseDown: ReactMouseEventFrom[Element & Element] => Callback,
      onMouseUp: ReactMouseEventFrom[Element & Element] => Callback,
      onTouchEnd: ReactTouchEventFrom[Element & Element] => Callback,
      onTouchStart: ReactTouchEventFrom[Element & Element] => Callback,
      style: CSSProperties
    ): Key = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], onContextMenu = js.Any.fromFunction1((t0: ReactEventFrom[Element & Element]) => onContextMenu(t0).runNow()), onDoubleClick = js.Any.fromFunction1((t0: ReactMouseEventFrom[Element & Element]) => onDoubleClick(t0).runNow()), onMouseDown = js.Any.fromFunction1((t0: ReactMouseEventFrom[Element & Element]) => onMouseDown(t0).runNow()), onMouseUp = js.Any.fromFunction1((t0: ReactMouseEventFrom[Element & Element]) => onMouseUp(t0).runNow()), onTouchEnd = js.Any.fromFunction1((t0: ReactTouchEventFrom[Element & Element]) => onTouchEnd(t0).runNow()), onTouchStart = js.Any.fromFunction1((t0: ReactTouchEventFrom[Element & Element]) => onTouchStart(t0).runNow()), style = style.asInstanceOf[js.Any], ref = null)
      __obj.asInstanceOf[Key]
    }
    
    extension [Self <: Key](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setKey(value: typingsJapgolly.reactCalendarTimeline.mod.Id): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setOnContextMenu(value: ReactEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1((t0: ReactEventFrom[Element & Element]) => value(t0).runNow()))
      
      inline def setOnDoubleClick(value: ReactMouseEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[Element & Element]) => value(t0).runNow()))
      
      inline def setOnMouseDown(value: ReactMouseEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1((t0: ReactMouseEventFrom[Element & Element]) => value(t0).runNow()))
      
      inline def setOnMouseUp(value: ReactMouseEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1((t0: ReactMouseEventFrom[Element & Element]) => value(t0).runNow()))
      
      inline def setOnTouchEnd(value: ReactTouchEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1((t0: ReactTouchEventFrom[Element & Element]) => value(t0).runNow()))
      
      inline def setOnTouchStart(value: ReactTouchEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1((t0: ReactTouchEventFrom[Element & Element]) => value(t0).runNow()))
      
      inline def setRef(value: Ref[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: Any | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  trait LabelWidth extends StObject {
    
    var endTime: Double
    
    var labelWidth: Double
    
    var left: Double
    
    var startTime: Double
  }
  object LabelWidth {
    
    inline def apply(endTime: Double, labelWidth: Double, left: Double, startTime: Double): LabelWidth = {
      val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], labelWidth = labelWidth.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[LabelWidth]
    }
    
    extension [Self <: LabelWidth](x: Self) {
      
      inline def setEndTime(value: Double): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
      
      inline def setLabelWidth(value: Double): Self = StObject.set(x, "labelWidth", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Required<react-calendar-timeline.react-calendar-timeline.GetIntervalProps> & {  key :string | number} */
  trait RequiredGetIntervalPropsk extends StObject {
    
    var interval: Interval
    
    var key: String | Double
    
    var onClick: MouseEventHandler[Element]
    
    var style: CSSProperties
  }
  object RequiredGetIntervalPropsk {
    
    inline def apply(
      interval: Interval,
      key: String | Double,
      onClick: ReactMouseEventFrom[Element & Element] => Callback,
      style: CSSProperties
    ): RequiredGetIntervalPropsk = {
      val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], onClick = js.Any.fromFunction1((t0: ReactMouseEventFrom[Element & Element]) => onClick(t0).runNow()), style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiredGetIntervalPropsk]
    }
    
    extension [Self <: RequiredGetIntervalPropsk](x: Self) {
      
      inline def setInterval(value: Interval): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String | Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: ReactMouseEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[Element & Element]) => value(t0).runNow()))
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  trait Style extends StObject {
    
    var style: CSSProperties
  }
  object Style {
    
    inline def apply(style: CSSProperties): Style = {
      val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[Style]
    }
    
    extension [Self <: Style](x: Self) {
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  trait X extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object X {
    
    inline def apply(x: Double, y: Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    extension [Self <: X](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
