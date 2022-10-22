package typingsJapgolly.antd

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTimelineTimelineItemMod extends Shortcut {
  
  @JSImport("antd/lib/timeline/TimelineItem", JSImport.Default)
  @js.native
  val default: FC[TimelineItemProps] = js.native
  
  trait TimeLineItemProps_
    extends StObject
       with TimelineItemProps {
    
    var __deprecated_do_not_use_it__ : js.UndefOr[Any] = js.undefined
  }
  object TimeLineItemProps_ {
    
    inline def apply(): TimeLineItemProps_ = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimeLineItemProps_]
    }
    
    extension [Self <: TimeLineItemProps_](x: Self) {
      
      inline def set__deprecated_do_not_use_it__(value: Any): Self = StObject.set(x, "__deprecated_do_not_use_it__", value.asInstanceOf[js.Any])
      
      inline def set__deprecated_do_not_use_it__Undefined: Self = StObject.set(x, "__deprecated_do_not_use_it__", js.undefined)
    }
  }
  
  trait TimelineItemProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var dot: js.UndefOr[Node] = js.undefined
    
    var label: js.UndefOr[Node] = js.undefined
    
    var pending: js.UndefOr[Boolean] = js.undefined
    
    var position: js.UndefOr[String] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object TimelineItemProps {
    
    inline def apply(): TimelineItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimelineItemProps]
    }
    
    extension [Self <: TimelineItemProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDot(value: VdomNode): Self = StObject.set(x, "dot", value.rawNode.asInstanceOf[js.Any])
      
      inline def setDotNull: Self = StObject.set(x, "dot", null)
      
      inline def setDotUndefined: Self = StObject.set(x, "dot", js.undefined)
      
      inline def setDotVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "dot", js.Array(value*))
      
      inline def setDotVdomElement(value: VdomElement): Self = StObject.set(x, "dot", value.rawElement.asInstanceOf[js.Any])
      
      inline def setLabel(value: VdomNode): Self = StObject.set(x, "label", value.rawNode.asInstanceOf[js.Any])
      
      inline def setLabelNull: Self = StObject.set(x, "label", null)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLabelVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "label", js.Array(value*))
      
      inline def setLabelVdomElement(value: VdomElement): Self = StObject.set(x, "label", value.rawElement.asInstanceOf[js.Any])
      
      inline def setPending(value: Boolean): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
      
      inline def setPendingUndefined: Self = StObject.set(x, "pending", js.undefined)
      
      inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type _To = FC[TimelineItemProps]
  
  /* This means you don't have to write `default`, but can instead just say `libTimelineTimelineItemMod.foo` */
  override def _to: FC[TimelineItemProps] = default
}
