package typingsJapgolly.antd

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.HTMLElement
import typingsJapgolly.antd.libTableInterfaceMod.TableLocale
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTableExpandIconMod {
  
  @JSImport("antd/lib/table/ExpandIcon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(locale: TableLocale): js.Function1[
    /* hasPrefixClsOnExpandRecordExpandedExpandable */ DefaultExpandIconProps[Any], 
    Element
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(locale.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* hasPrefixClsOnExpandRecordExpandedExpandable */ DefaultExpandIconProps[Any], 
    Element
  ]]
  
  trait DefaultExpandIconProps[RecordType] extends StObject {
    
    var expandable: Boolean
    
    var expanded: Boolean
    
    def onExpand(record: RecordType, e: ReactMouseEventFrom[HTMLElement]): Unit
    
    var prefixCls: String
    
    var record: RecordType
  }
  object DefaultExpandIconProps {
    
    inline def apply[RecordType](
      expandable: Boolean,
      expanded: Boolean,
      onExpand: (RecordType, ReactMouseEventFrom[HTMLElement]) => Callback,
      prefixCls: String,
      record: RecordType
    ): DefaultExpandIconProps[RecordType] = {
      val __obj = js.Dynamic.literal(expandable = expandable.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], onExpand = js.Any.fromFunction2((t0: RecordType, t1: ReactMouseEventFrom[HTMLElement]) => (onExpand(t0, t1)).runNow()), prefixCls = prefixCls.asInstanceOf[js.Any], record = record.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultExpandIconProps[RecordType]]
    }
    
    extension [Self <: DefaultExpandIconProps[?], RecordType](x: Self & DefaultExpandIconProps[RecordType]) {
      
      inline def setExpandable(value: Boolean): Self = StObject.set(x, "expandable", value.asInstanceOf[js.Any])
      
      inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setOnExpand(value: (RecordType, ReactMouseEventFrom[HTMLElement]) => Callback): Self = StObject.set(x, "onExpand", js.Any.fromFunction2((t0: RecordType, t1: ReactMouseEventFrom[HTMLElement]) => (value(t0, t1)).runNow()))
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setRecord(value: RecordType): Self = StObject.set(x, "record", value.asInstanceOf[js.Any])
    }
  }
}
