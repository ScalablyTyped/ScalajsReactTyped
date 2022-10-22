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

object distTypesBrowserPreviewWidgetMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("wix-style-react/dist/types/BrowserPreviewWidget", JSImport.Default)
  @js.native
  open class default protected ()
    extends Component[BrowserPreviewWidgetProps, js.Object, Any] {
    def this(props: BrowserPreviewWidgetProps) = this()
    def this(props: BrowserPreviewWidgetProps, context: Any) = this()
  }
  @JSImport("wix-style-react/dist/types/BrowserPreviewWidget", JSImport.Default)
  @js.native
  val default: ComponentClassP[BrowserPreviewWidgetProps & js.Object] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.size9
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.size12
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.size18
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.size24
  */
  trait BrowserBarSizes extends StObject
  object BrowserBarSizes {
    
    inline def size12: typingsJapgolly.wixStyleReact.wixStyleReactStrings.size12 = "size12".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.size12]
    
    inline def size18: typingsJapgolly.wixStyleReact.wixStyleReactStrings.size18 = "size18".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.size18]
    
    inline def size24: typingsJapgolly.wixStyleReact.wixStyleReactStrings.size24 = "size24".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.size24]
    
    inline def size9: typingsJapgolly.wixStyleReact.wixStyleReactStrings.size9 = "size9".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.size9]
  }
  
  trait BrowserPreviewWidgetProps extends StObject {
    
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    var browserBarSize: js.UndefOr[BrowserBarSizes] = js.undefined
    
    var children: Node
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var height: js.UndefOr[String] = js.undefined
    
    var skin: js.UndefOr[BrowserPreviewWidgetSkin] = js.undefined
    
    var width: js.UndefOr[String] = js.undefined
  }
  object BrowserPreviewWidgetProps {
    
    inline def apply(): BrowserPreviewWidgetProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[BrowserPreviewWidgetProps]
    }
    
    extension [Self <: BrowserPreviewWidgetProps](x: Self) {
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setBrowserBarSize(value: BrowserBarSizes): Self = StObject.set(x, "browserBarSize", value.asInstanceOf[js.Any])
      
      inline def setBrowserBarSizeUndefined: Self = StObject.set(x, "browserBarSize", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setSkin(value: BrowserPreviewWidgetSkin): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
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
  trait BrowserPreviewWidgetSkin extends StObject
  object BrowserPreviewWidgetSkin {
    
    inline def custom: typingsJapgolly.wixStyleReact.wixStyleReactStrings.custom = "custom".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.custom]
    
    inline def gradient: typingsJapgolly.wixStyleReact.wixStyleReactStrings.gradient = "gradient".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.gradient]
    
    inline def neutral: typingsJapgolly.wixStyleReact.wixStyleReactStrings.neutral = "neutral".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.neutral]
  }
  
  type _To = ComponentClassP[BrowserPreviewWidgetProps & js.Object]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesBrowserPreviewWidgetMod.foo` */
  override def _to: ComponentClassP[BrowserPreviewWidgetProps & js.Object] = default
}
