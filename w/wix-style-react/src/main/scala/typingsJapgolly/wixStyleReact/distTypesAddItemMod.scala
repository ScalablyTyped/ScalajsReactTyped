package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.csstype.mod.Property.BorderRadius
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.wixStyleReact.distTypesCommonMod.TooltipCommonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesAddItemMod {
  
  @JSImport("wix-style-react/dist/types/AddItem", JSImport.Default)
  @js.native
  open class default () extends AddItem
  
  @js.native
  trait AddItem
    extends Component[AddItemProps, js.Object, Any] {
    
    def blur(): Unit = js.native
    
    def focus(): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.center
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.right
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.left
  */
  trait AddItemAlignItems extends StObject
  object AddItemAlignItems {
    
    inline def center: typingsJapgolly.wixStyleReact.wixStyleReactStrings.center = "center".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.center]
    
    inline def left: typingsJapgolly.wixStyleReact.wixStyleReactStrings.left = "left".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.left]
    
    inline def right: typingsJapgolly.wixStyleReact.wixStyleReactStrings.right = "right".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.right]
  }
  
  trait AddItemProps extends StObject {
    
    var alignItems: js.UndefOr[AddItemAlignItems] = js.undefined
    
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    var ariaLabelledBy: js.UndefOr[String] = js.undefined
    
    var borderRadius: js.UndefOr[BorderRadius[String | Double]] = js.undefined
    
    var children: js.UndefOr[Node | js.Function0[Node]] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var icon: js.UndefOr[Node] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    var removePadding: js.UndefOr[Boolean] = js.undefined
    
    var showIcon: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[AddItemSize] = js.undefined
    
    var subtitle: js.UndefOr[Node] = js.undefined
    
    var theme: js.UndefOr[AddItemTheme] = js.undefined
    
    var tooltipContent: js.UndefOr[Node] = js.undefined
    
    var tooltipProps: js.UndefOr[TooltipCommonProps] = js.undefined
  }
  object AddItemProps {
    
    inline def apply(): AddItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddItemProps]
    }
    
    extension [Self <: AddItemProps](x: Self) {
      
      inline def setAlignItems(value: AddItemAlignItems): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
      
      inline def setAlignItemsUndefined: Self = StObject.set(x, "alignItems", js.undefined)
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setAriaLabelledBy(value: String): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setBorderRadius(value: BorderRadius[String | Double]): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
      
      inline def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
      
      inline def setChildren(value: Node | js.Function0[Node]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenCallbackTo(value: CallbackTo[Node]): Self = StObject.set(x, "children", value.toJsFn)
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setIcon(value: VdomNode): Self = StObject.set(x, "icon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setIconNull: Self = StObject.set(x, "icon", null)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "icon", js.Array(value*))
      
      inline def setIconVdomElement(value: VdomElement): Self = StObject.set(x, "icon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnClick(value: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setRemovePadding(value: Boolean): Self = StObject.set(x, "removePadding", value.asInstanceOf[js.Any])
      
      inline def setRemovePaddingUndefined: Self = StObject.set(x, "removePadding", js.undefined)
      
      inline def setShowIcon(value: Boolean): Self = StObject.set(x, "showIcon", value.asInstanceOf[js.Any])
      
      inline def setShowIconUndefined: Self = StObject.set(x, "showIcon", js.undefined)
      
      inline def setSize(value: AddItemSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSubtitle(value: VdomNode): Self = StObject.set(x, "subtitle", value.rawNode.asInstanceOf[js.Any])
      
      inline def setSubtitleNull: Self = StObject.set(x, "subtitle", null)
      
      inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      inline def setSubtitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "subtitle", js.Array(value*))
      
      inline def setSubtitleVdomElement(value: VdomElement): Self = StObject.set(x, "subtitle", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTheme(value: AddItemTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTooltipContent(value: VdomNode): Self = StObject.set(x, "tooltipContent", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTooltipContentNull: Self = StObject.set(x, "tooltipContent", null)
      
      inline def setTooltipContentUndefined: Self = StObject.set(x, "tooltipContent", js.undefined)
      
      inline def setTooltipContentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "tooltipContent", js.Array(value*))
      
      inline def setTooltipContentVdomElement(value: VdomElement): Self = StObject.set(x, "tooltipContent", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTooltipProps(value: TooltipCommonProps): Self = StObject.set(x, "tooltipProps", value.asInstanceOf[js.Any])
      
      inline def setTooltipPropsUndefined: Self = StObject.set(x, "tooltipProps", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.large
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.small
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.tiny
  */
  trait AddItemSize extends StObject
  object AddItemSize {
    
    inline def large: typingsJapgolly.wixStyleReact.wixStyleReactStrings.large = "large".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.large]
    
    inline def medium: typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium = "medium".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium]
    
    inline def small: typingsJapgolly.wixStyleReact.wixStyleReactStrings.small = "small".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.small]
    
    inline def tiny: typingsJapgolly.wixStyleReact.wixStyleReactStrings.tiny = "tiny".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.tiny]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.dashes
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.plain
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.filled
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.image
  */
  trait AddItemTheme extends StObject
  object AddItemTheme {
    
    inline def dashes: typingsJapgolly.wixStyleReact.wixStyleReactStrings.dashes = "dashes".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.dashes]
    
    inline def filled: typingsJapgolly.wixStyleReact.wixStyleReactStrings.filled = "filled".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.filled]
    
    inline def image: typingsJapgolly.wixStyleReact.wixStyleReactStrings.image = "image".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.image]
    
    inline def plain: typingsJapgolly.wixStyleReact.wixStyleReactStrings.plain = "plain".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.plain]
  }
}
