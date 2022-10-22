package typingsJapgolly.rcTable.libInterfaceMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderExpandIconProps[RecordType] extends StObject {
  
  var expandable: Boolean
  
  var expanded: Boolean
  
  var onExpand: TriggerEventHandler[RecordType]
  
  var prefixCls: String
  
  var record: RecordType
}
object RenderExpandIconProps {
  
  inline def apply[RecordType](
    expandable: Boolean,
    expanded: Boolean,
    onExpand: (RecordType, /* event */ ReactMouseEventFrom[HTMLElement]) => Callback,
    prefixCls: String,
    record: RecordType
  ): RenderExpandIconProps[RecordType] = {
    val __obj = js.Dynamic.literal(expandable = expandable.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], onExpand = js.Any.fromFunction2((t0: RecordType, t1: /* event */ ReactMouseEventFrom[HTMLElement]) => (onExpand(t0, t1)).runNow()), prefixCls = prefixCls.asInstanceOf[js.Any], record = record.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderExpandIconProps[RecordType]]
  }
  
  extension [Self <: RenderExpandIconProps[?], RecordType](x: Self & RenderExpandIconProps[RecordType]) {
    
    inline def setExpandable(value: Boolean): Self = StObject.set(x, "expandable", value.asInstanceOf[js.Any])
    
    inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    inline def setOnExpand(value: (RecordType, /* event */ ReactMouseEventFrom[HTMLElement]) => Callback): Self = StObject.set(x, "onExpand", js.Any.fromFunction2((t0: RecordType, t1: /* event */ ReactMouseEventFrom[HTMLElement]) => (value(t0, t1)).runNow()))
    
    inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    
    inline def setRecord(value: RecordType): Self = StObject.set(x, "record", value.asInstanceOf[js.Any])
  }
}
