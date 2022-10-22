package typingsJapgolly.antd

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLSpanElement
import typingsJapgolly.antd.libTagCheckableTagMod.CheckableTagProps
import typingsJapgolly.antd.libUtilColorsMod.PresetColorType
import typingsJapgolly.antd.libUtilColorsMod.PresetStatusColorType
import typingsJapgolly.antd.libUtilTypeMod.LiteralUnion
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTagMod extends Shortcut {
  
  @JSImport("antd/lib/tag", JSImport.Default)
  @js.native
  val default: TagType = js.native
  
  trait TagProps
    extends StObject
       with HTMLAttributes[HTMLSpanElement] {
    
    var closable: js.UndefOr[Boolean] = js.undefined
    
    var closeIcon: js.UndefOr[Node] = js.undefined
    
    @JSName("color")
    var color_TagProps: js.UndefOr[LiteralUnion[PresetColorType | PresetStatusColorType, String]] = js.undefined
    
    var icon: js.UndefOr[Node] = js.undefined
    
    var onClose: js.UndefOr[js.Function1[/* e */ ReactMouseEventFrom[HTMLElement], Unit]] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    /** @deprecated `visible` will be removed in next major version. */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object TagProps {
    
    inline def apply(): TagProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagProps]
    }
    
    extension [Self <: TagProps](x: Self) {
      
      inline def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
      
      inline def setClosableUndefined: Self = StObject.set(x, "closable", js.undefined)
      
      inline def setCloseIcon(value: VdomNode): Self = StObject.set(x, "closeIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setCloseIconNull: Self = StObject.set(x, "closeIcon", null)
      
      inline def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
      
      inline def setCloseIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "closeIcon", js.Array(value*))
      
      inline def setCloseIconVdomElement(value: VdomElement): Self = StObject.set(x, "closeIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setColor(value: LiteralUnion[PresetColorType | PresetStatusColorType, String]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setIcon(value: VdomNode): Self = StObject.set(x, "icon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setIconNull: Self = StObject.set(x, "icon", null)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "icon", js.Array(value*))
      
      inline def setIconVdomElement(value: VdomElement): Self = StObject.set(x, "icon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnClose(value: /* e */ ReactMouseEventFrom[HTMLElement] => Callback): Self = StObject.set(x, "onClose", js.Any.fromFunction1((t0: /* e */ ReactMouseEventFrom[HTMLElement]) => value(t0).runNow()))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  @js.native
  trait TagType
    extends StObject
       with ForwardRefExoticComponent[TagProps & RefAttributes[HTMLElement]] {
    
    var CheckableTag: FC[CheckableTagProps] = js.native
  }
  
  type _To = TagType
  
  /* This means you don't have to write `default`, but can instead just say `libTagMod.foo` */
  override def _to: TagType = default
}
