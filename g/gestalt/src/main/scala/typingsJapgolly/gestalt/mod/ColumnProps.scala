package typingsJapgolly.gestalt.mod

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnProps extends StObject {
  
  var children: js.UndefOr[Node] = js.undefined
  
  var lgSpan: js.UndefOr[UnsignedUpTo12] = js.undefined
  
  var mdSpan: js.UndefOr[UnsignedUpTo12] = js.undefined
  
  var smSpan: js.UndefOr[UnsignedUpTo12] = js.undefined
  
  var span: UnsignedUpTo12
}
object ColumnProps {
  
  inline def apply(span: UnsignedUpTo12): ColumnProps = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnProps]
  }
  
  extension [Self <: ColumnProps](x: Self) {
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setLgSpan(value: UnsignedUpTo12): Self = StObject.set(x, "lgSpan", value.asInstanceOf[js.Any])
    
    inline def setLgSpanUndefined: Self = StObject.set(x, "lgSpan", js.undefined)
    
    inline def setMdSpan(value: UnsignedUpTo12): Self = StObject.set(x, "mdSpan", value.asInstanceOf[js.Any])
    
    inline def setMdSpanUndefined: Self = StObject.set(x, "mdSpan", js.undefined)
    
    inline def setSmSpan(value: UnsignedUpTo12): Self = StObject.set(x, "smSpan", value.asInstanceOf[js.Any])
    
    inline def setSmSpanUndefined: Self = StObject.set(x, "smSpan", js.undefined)
    
    inline def setSpan(value: UnsignedUpTo12): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
  }
}
