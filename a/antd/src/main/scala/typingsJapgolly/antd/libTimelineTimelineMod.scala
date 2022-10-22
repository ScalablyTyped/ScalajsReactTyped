package typingsJapgolly.antd

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.antd.antdStrings.alternate
import typingsJapgolly.antd.antdStrings.left
import typingsJapgolly.antd.antdStrings.right
import typingsJapgolly.antd.libTimelineTimelineItemMod.TimelineItemProps
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTimelineTimelineMod extends Shortcut {
  
  @JSImport("antd/lib/timeline/Timeline", JSImport.Default)
  @js.native
  val default: TimelineType = js.native
  
  trait TimelineProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var mode: js.UndefOr[left | alternate | right] = js.undefined
    
    /** 指定最后一个幽灵节点是否存在或内容 */
    var pending: js.UndefOr[Node] = js.undefined
    
    var pendingDot: js.UndefOr[Node] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var reverse: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object TimelineProps {
    
    inline def apply(): TimelineProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimelineProps]
    }
    
    extension [Self <: TimelineProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setMode(value: left | alternate | right): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setPending(value: VdomNode): Self = StObject.set(x, "pending", value.rawNode.asInstanceOf[js.Any])
      
      inline def setPendingDot(value: VdomNode): Self = StObject.set(x, "pendingDot", value.rawNode.asInstanceOf[js.Any])
      
      inline def setPendingDotNull: Self = StObject.set(x, "pendingDot", null)
      
      inline def setPendingDotUndefined: Self = StObject.set(x, "pendingDot", js.undefined)
      
      inline def setPendingDotVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "pendingDot", js.Array(value*))
      
      inline def setPendingDotVdomElement(value: VdomElement): Self = StObject.set(x, "pendingDot", value.rawElement.asInstanceOf[js.Any])
      
      inline def setPendingNull: Self = StObject.set(x, "pending", null)
      
      inline def setPendingUndefined: Self = StObject.set(x, "pending", js.undefined)
      
      inline def setPendingVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "pending", js.Array(value*))
      
      inline def setPendingVdomElement(value: VdomElement): Self = StObject.set(x, "pending", value.rawElement.asInstanceOf[js.Any])
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  @js.native
  trait TimelineType
    extends StObject
       with FunctionComponent[TimelineProps] {
    
    var Item: FC[TimelineItemProps] = js.native
  }
  
  type _To = TimelineType
  
  /* This means you don't have to write `default`, but can instead just say `libTimelineTimelineMod.foo` */
  override def _to: TimelineType = default
}
