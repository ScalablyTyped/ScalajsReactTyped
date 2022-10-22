package typingsJapgolly.rcTable

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.rcTable.libInterfaceMod.CustomizeComponent
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBodyExpandedRowMod {
  
  @JSImport("rc-table/lib/Body/ExpandedRow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasPrefixClsChildrenComponentCellComponentClassNameExpandedColSpanIsEmpty: ExpandedRowProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasPrefixClsChildrenComponentCellComponentClassNameExpandedColSpanIsEmpty.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait ExpandedRowProps extends StObject {
    
    var cellComponent: CustomizeComponent
    
    var children: Node
    
    var className: String
    
    var colSpan: Double
    
    var component: CustomizeComponent
    
    var expanded: Boolean
    
    var isEmpty: Boolean
    
    var prefixCls: String
  }
  object ExpandedRowProps {
    
    inline def apply(
      cellComponent: CustomizeComponent,
      className: String,
      colSpan: Double,
      component: CustomizeComponent,
      expanded: Boolean,
      isEmpty: Boolean,
      prefixCls: String
    ): ExpandedRowProps = {
      val __obj = js.Dynamic.literal(cellComponent = cellComponent.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], colSpan = colSpan.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], isEmpty = isEmpty.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], children = null)
      __obj.asInstanceOf[ExpandedRowProps]
    }
    
    extension [Self <: ExpandedRowProps](x: Self) {
      
      inline def setCellComponent(value: CustomizeComponent): Self = StObject.set(x, "cellComponent", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
      
      inline def setComponent(value: CustomizeComponent): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setIsEmpty(value: Boolean): Self = StObject.set(x, "isEmpty", value.asInstanceOf[js.Any])
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    }
  }
}
