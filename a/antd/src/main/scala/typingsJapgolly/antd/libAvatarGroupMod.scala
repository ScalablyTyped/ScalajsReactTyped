package typingsJapgolly.antd

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.antd.antdStrings.bottom
import typingsJapgolly.antd.antdStrings.click
import typingsJapgolly.antd.antdStrings.focus
import typingsJapgolly.antd.antdStrings.hover
import typingsJapgolly.antd.antdStrings.top
import typingsJapgolly.antd.libAvatarSizeContextMod.AvatarSize
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAvatarGroupMod extends Shortcut {
  
  @JSImport("antd/lib/avatar/group", JSImport.Default)
  @js.native
  val default: FC[GroupProps] = js.native
  
  trait GroupProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var maxCount: js.UndefOr[Double] = js.undefined
    
    var maxPopoverPlacement: js.UndefOr[top | bottom] = js.undefined
    
    var maxPopoverTrigger: js.UndefOr[hover | focus | click] = js.undefined
    
    var maxStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[AvatarSize] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object GroupProps {
    
    inline def apply(): GroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GroupProps]
    }
    
    extension [Self <: GroupProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setMaxCount(value: Double): Self = StObject.set(x, "maxCount", value.asInstanceOf[js.Any])
      
      inline def setMaxCountUndefined: Self = StObject.set(x, "maxCount", js.undefined)
      
      inline def setMaxPopoverPlacement(value: top | bottom): Self = StObject.set(x, "maxPopoverPlacement", value.asInstanceOf[js.Any])
      
      inline def setMaxPopoverPlacementUndefined: Self = StObject.set(x, "maxPopoverPlacement", js.undefined)
      
      inline def setMaxPopoverTrigger(value: hover | focus | click): Self = StObject.set(x, "maxPopoverTrigger", value.asInstanceOf[js.Any])
      
      inline def setMaxPopoverTriggerUndefined: Self = StObject.set(x, "maxPopoverTrigger", js.undefined)
      
      inline def setMaxStyle(value: CSSProperties): Self = StObject.set(x, "maxStyle", value.asInstanceOf[js.Any])
      
      inline def setMaxStyleUndefined: Self = StObject.set(x, "maxStyle", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setSize(value: AvatarSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type _To = FC[GroupProps]
  
  /* This means you don't have to write `default`, but can instead just say `libAvatarGroupMod.foo` */
  override def _to: FC[GroupProps] = default
}
