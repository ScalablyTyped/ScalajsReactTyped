package typingsJapgolly.reactBootstrapTableNext.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactBootstrapTableNext.reactBootstrapTableNextStrings.left
import typingsJapgolly.reactBootstrapTableNext.reactBootstrapTableNextStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpandRowProps[T, K] extends StObject {
  
  var className: js.UndefOr[
    String | (js.Function3[/* isExpand */ Boolean, /* row */ T, /* rowIndex */ Double, String])
  ] = js.undefined
  
  var expandByColumnOnly: js.UndefOr[Boolean] = js.undefined
  
  var expandColumnPosition: js.UndefOr[left | right] = js.undefined
  
  var expandColumnRenderer: js.UndefOr[js.Function1[/* props */ ExpandColumnRendererProps, Element]] = js.undefined
  
  var expandHeaderColumnRenderer: js.UndefOr[js.Function1[/* props */ ExpandHeaderColumnRenderer, Element]] = js.undefined
  
  var expanded: js.UndefOr[js.Array[K]] = js.undefined
  
  var nonExpandable: js.UndefOr[js.Array[K]] = js.undefined
  
  var onExpand: js.UndefOr[
    js.Function4[
      /* row */ T, 
      /* isExpand */ Boolean, 
      /* rowIndex */ Double, 
      /* e */ ReactEventFrom[org.scalajs.dom.Element], 
      Unit
    ]
  ] = js.undefined
  
  var onExpandAll: js.UndefOr[
    js.Function3[
      /* isExpandAll */ Boolean, 
      /* results */ js.Array[T], 
      /* e */ ReactEventFrom[org.scalajs.dom.Element], 
      Unit
    ]
  ] = js.undefined
  
  var onlyOneExpanding: js.UndefOr[Boolean] = js.undefined
  
  def renderer(row: T, rowIndex: Double): Element
  
  var showExpandColumn: js.UndefOr[Boolean] = js.undefined
}
object ExpandRowProps {
  
  inline def apply[T, K](renderer: (T, Double) => Element): ExpandRowProps[T, K] = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction2(renderer))
    __obj.asInstanceOf[ExpandRowProps[T, K]]
  }
  
  extension [Self <: ExpandRowProps[?, ?], T, K](x: Self & (ExpandRowProps[T, K])) {
    
    inline def setClassName(value: String | (js.Function3[/* isExpand */ Boolean, /* row */ T, /* rowIndex */ Double, String])): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameFunction3(value: (/* isExpand */ Boolean, /* row */ T, /* rowIndex */ Double) => String): Self = StObject.set(x, "className", js.Any.fromFunction3(value))
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setExpandByColumnOnly(value: Boolean): Self = StObject.set(x, "expandByColumnOnly", value.asInstanceOf[js.Any])
    
    inline def setExpandByColumnOnlyUndefined: Self = StObject.set(x, "expandByColumnOnly", js.undefined)
    
    inline def setExpandColumnPosition(value: left | right): Self = StObject.set(x, "expandColumnPosition", value.asInstanceOf[js.Any])
    
    inline def setExpandColumnPositionUndefined: Self = StObject.set(x, "expandColumnPosition", js.undefined)
    
    inline def setExpandColumnRenderer(value: /* props */ ExpandColumnRendererProps => Element): Self = StObject.set(x, "expandColumnRenderer", js.Any.fromFunction1(value))
    
    inline def setExpandColumnRendererUndefined: Self = StObject.set(x, "expandColumnRenderer", js.undefined)
    
    inline def setExpandHeaderColumnRenderer(value: /* props */ ExpandHeaderColumnRenderer => Element): Self = StObject.set(x, "expandHeaderColumnRenderer", js.Any.fromFunction1(value))
    
    inline def setExpandHeaderColumnRendererUndefined: Self = StObject.set(x, "expandHeaderColumnRenderer", js.undefined)
    
    inline def setExpanded(value: js.Array[K]): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
    
    inline def setExpandedVarargs(value: K*): Self = StObject.set(x, "expanded", js.Array(value*))
    
    inline def setNonExpandable(value: js.Array[K]): Self = StObject.set(x, "nonExpandable", value.asInstanceOf[js.Any])
    
    inline def setNonExpandableUndefined: Self = StObject.set(x, "nonExpandable", js.undefined)
    
    inline def setNonExpandableVarargs(value: K*): Self = StObject.set(x, "nonExpandable", js.Array(value*))
    
    inline def setOnExpand(
      value: (/* row */ T, /* isExpand */ Boolean, /* rowIndex */ Double, /* e */ ReactEventFrom[org.scalajs.dom.Element]) => Callback
    ): Self = StObject.set(x, "onExpand", js.Any.fromFunction4((t0: /* row */ T, t1: /* isExpand */ Boolean, t2: /* rowIndex */ Double, t3: /* e */ ReactEventFrom[org.scalajs.dom.Element]) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setOnExpandAll(
      value: (/* isExpandAll */ Boolean, /* results */ js.Array[T], /* e */ ReactEventFrom[org.scalajs.dom.Element]) => Callback
    ): Self = StObject.set(x, "onExpandAll", js.Any.fromFunction3((t0: /* isExpandAll */ Boolean, t1: /* results */ js.Array[T], t2: /* e */ ReactEventFrom[org.scalajs.dom.Element]) => (value(t0, t1, t2)).runNow()))
    
    inline def setOnExpandAllUndefined: Self = StObject.set(x, "onExpandAll", js.undefined)
    
    inline def setOnExpandUndefined: Self = StObject.set(x, "onExpand", js.undefined)
    
    inline def setOnlyOneExpanding(value: Boolean): Self = StObject.set(x, "onlyOneExpanding", value.asInstanceOf[js.Any])
    
    inline def setOnlyOneExpandingUndefined: Self = StObject.set(x, "onlyOneExpanding", js.undefined)
    
    inline def setRenderer(value: (T, Double) => Element): Self = StObject.set(x, "renderer", js.Any.fromFunction2(value))
    
    inline def setShowExpandColumn(value: Boolean): Self = StObject.set(x, "showExpandColumn", value.asInstanceOf[js.Any])
    
    inline def setShowExpandColumnUndefined: Self = StObject.set(x, "showExpandColumn", js.undefined)
  }
}
