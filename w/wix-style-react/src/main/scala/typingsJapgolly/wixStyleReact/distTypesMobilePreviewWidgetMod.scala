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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMobilePreviewWidgetMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("wix-style-react/dist/types/MobilePreviewWidget", JSImport.Default)
  @js.native
  open class default protected ()
    extends Component[MobilePreviewWidgetProps, js.Object, Any] {
    def this(props: MobilePreviewWidgetProps) = this()
    def this(props: MobilePreviewWidgetProps, context: Any) = this()
  }
  @JSImport("wix-style-react/dist/types/MobilePreviewWidget", JSImport.Default)
  @js.native
  val default: ComponentClassP[MobilePreviewWidgetProps & js.Object] = js.native
  
  trait MobilePreviewWidgetProps extends StObject {
    
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    var children: Node
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var height: js.UndefOr[String] = js.undefined
    
    var skin: js.UndefOr[MobilePreviewWidgetSkin] = js.undefined
    
    var width: js.UndefOr[String] = js.undefined
  }
  object MobilePreviewWidgetProps {
    
    inline def apply(): MobilePreviewWidgetProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[MobilePreviewWidgetProps]
    }
    
    extension [Self <: MobilePreviewWidgetProps](x: Self) {
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setSkin(value: MobilePreviewWidgetSkin): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
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
  trait MobilePreviewWidgetSkin extends StObject
  object MobilePreviewWidgetSkin {
    
    inline def custom: typingsJapgolly.wixStyleReact.wixStyleReactStrings.custom = "custom".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.custom]
    
    inline def gradient: typingsJapgolly.wixStyleReact.wixStyleReactStrings.gradient = "gradient".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.gradient]
    
    inline def neutral: typingsJapgolly.wixStyleReact.wixStyleReactStrings.neutral = "neutral".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.neutral]
  }
  
  type _To = ComponentClassP[MobilePreviewWidgetProps & js.Object]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesMobilePreviewWidgetMod.foo` */
  override def _to: ComponentClassP[MobilePreviewWidgetProps & js.Object] = default
}
