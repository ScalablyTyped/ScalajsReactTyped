package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.react.mod.ButtonHTMLAttributes
import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.wixStyleReact.distTypesCommonMod.TooltipCommonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFillButtonMod {
  
  @JSImport("wix-style-react/dist/types/FillButton", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[FillButtonProps, js.Object, Any]
  
  type FillButton = PureComponent[FillButtonProps, js.Object, Any]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.small
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium
  */
  trait FillButtonIconSize extends StObject
  object FillButtonIconSize {
    
    inline def medium: typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium = "medium".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium]
    
    inline def small: typingsJapgolly.wixStyleReact.wixStyleReactStrings.small = "small".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.small]
  }
  
  trait FillButtonProps
    extends StObject
       with ButtonHTMLAttributes[HTMLButtonElement] {
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var fill: js.UndefOr[String] = js.undefined
    
    var icon: js.UndefOr[Node] = js.undefined
    
    var iconSize: js.UndefOr[FillButtonIconSize] = js.undefined
    
    var tooltipContent: js.UndefOr[Node] = js.undefined
    
    var tooltipProps: js.UndefOr[TooltipCommonProps] = js.undefined
  }
  object FillButtonProps {
    
    inline def apply(): FillButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FillButtonProps]
    }
    
    extension [Self <: FillButtonProps](x: Self) {
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setIcon(value: VdomNode): Self = StObject.set(x, "icon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setIconNull: Self = StObject.set(x, "icon", null)
      
      inline def setIconSize(value: FillButtonIconSize): Self = StObject.set(x, "iconSize", value.asInstanceOf[js.Any])
      
      inline def setIconSizeUndefined: Self = StObject.set(x, "iconSize", js.undefined)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "icon", js.Array(value*))
      
      inline def setIconVdomElement(value: VdomElement): Self = StObject.set(x, "icon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTooltipContent(value: VdomNode): Self = StObject.set(x, "tooltipContent", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTooltipContentNull: Self = StObject.set(x, "tooltipContent", null)
      
      inline def setTooltipContentUndefined: Self = StObject.set(x, "tooltipContent", js.undefined)
      
      inline def setTooltipContentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "tooltipContent", js.Array(value*))
      
      inline def setTooltipContentVdomElement(value: VdomElement): Self = StObject.set(x, "tooltipContent", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTooltipProps(value: TooltipCommonProps): Self = StObject.set(x, "tooltipProps", value.asInstanceOf[js.Any])
      
      inline def setTooltipPropsUndefined: Self = StObject.set(x, "tooltipProps", js.undefined)
    }
  }
}
