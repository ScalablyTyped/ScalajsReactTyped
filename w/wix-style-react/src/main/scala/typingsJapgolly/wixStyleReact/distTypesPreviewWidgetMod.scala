package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.ComponentClassP
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.Component
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.none_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPreviewWidgetMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("wix-style-react/dist/types/PreviewWidget", JSImport.Default)
  @js.native
  open class default protected ()
    extends Component[PreviewWidgetProps, js.Object, Any] {
    def this(props: PreviewWidgetProps) = this()
    def this(props: PreviewWidgetProps, context: Any) = this()
  }
  @JSImport("wix-style-react/dist/types/PreviewWidget", JSImport.Default)
  @js.native
  val default: ComponentClassP[PreviewWidgetProps & js.Object] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.shadow
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.border
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.none_
  */
  trait PreviewWidgetContentOutline extends StObject
  object PreviewWidgetContentOutline {
    
    inline def border: typingsJapgolly.wixStyleReact.wixStyleReactStrings.border = "border".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.border]
    
    inline def none: none_ = "none".asInstanceOf[none_]
    
    inline def shadow: typingsJapgolly.wixStyleReact.wixStyleReactStrings.shadow = "shadow".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.shadow]
  }
  
  trait PreviewWidgetProps extends StObject {
    
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    var children: Node
    
    var className: js.UndefOr[String] = js.undefined
    
    var contentOutline: js.UndefOr[PreviewWidgetContentOutline] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var height: js.UndefOr[String] = js.undefined
    
    var scrollable: js.UndefOr[Boolean] = js.undefined
    
    var skin: js.UndefOr[PreviewWidgetSkin] = js.undefined
    
    var width: js.UndefOr[String] = js.undefined
  }
  object PreviewWidgetProps {
    
    inline def apply(): PreviewWidgetProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[PreviewWidgetProps]
    }
    
    extension [Self <: PreviewWidgetProps](x: Self) {
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContentOutline(value: PreviewWidgetContentOutline): Self = StObject.set(x, "contentOutline", value.asInstanceOf[js.Any])
      
      inline def setContentOutlineUndefined: Self = StObject.set(x, "contentOutline", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setScrollable(value: Boolean): Self = StObject.set(x, "scrollable", value.asInstanceOf[js.Any])
      
      inline def setScrollableUndefined: Self = StObject.set(x, "scrollable", js.undefined)
      
      inline def setSkin(value: PreviewWidgetSkin): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      inline def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.neutral
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.gradient
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.custom
  */
  trait PreviewWidgetSkin extends StObject
  object PreviewWidgetSkin {
    
    inline def custom: typingsJapgolly.wixStyleReact.wixStyleReactStrings.custom = "custom".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.custom]
    
    inline def gradient: typingsJapgolly.wixStyleReact.wixStyleReactStrings.gradient = "gradient".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.gradient]
    
    inline def neutral: typingsJapgolly.wixStyleReact.wixStyleReactStrings.neutral = "neutral".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.neutral]
  }
  
  type _To = ComponentClassP[PreviewWidgetProps & js.Object]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesPreviewWidgetMod.foo` */
  override def _to: ComponentClassP[PreviewWidgetProps & js.Object] = default
}
