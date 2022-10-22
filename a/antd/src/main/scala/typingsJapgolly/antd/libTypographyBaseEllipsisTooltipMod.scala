package typingsJapgolly.antd

import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.antd.libTooltipMod.TooltipProps
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypographyBaseEllipsisTooltipMod {
  
  object default {
    
    inline def apply(hasEnabledEllipsisIsEllipsisChildrenTooltipProps: EllipsisTooltipProps): Element = ^.asInstanceOf[js.Dynamic].apply(hasEnabledEllipsisIsEllipsisChildrenTooltipProps.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("antd/lib/typography/Base/EllipsisTooltip", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd/lib/typography/Base/EllipsisTooltip", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  trait EllipsisTooltipProps extends StObject {
    
    var children: japgolly.scalajs.react.facade.React.Element
    
    var enabledEllipsis: Boolean
    
    var isEllipsis: js.UndefOr[Boolean] = js.undefined
    
    var tooltipProps: js.UndefOr[TooltipProps] = js.undefined
  }
  object EllipsisTooltipProps {
    
    inline def apply(children: VdomElement, enabledEllipsis: Boolean): EllipsisTooltipProps = {
      val __obj = js.Dynamic.literal(children = children.rawElement.asInstanceOf[js.Any], enabledEllipsis = enabledEllipsis.asInstanceOf[js.Any])
      __obj.asInstanceOf[EllipsisTooltipProps]
    }
    
    extension [Self <: EllipsisTooltipProps](x: Self) {
      
      inline def setChildren(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setEnabledEllipsis(value: Boolean): Self = StObject.set(x, "enabledEllipsis", value.asInstanceOf[js.Any])
      
      inline def setIsEllipsis(value: Boolean): Self = StObject.set(x, "isEllipsis", value.asInstanceOf[js.Any])
      
      inline def setIsEllipsisUndefined: Self = StObject.set(x, "isEllipsis", js.undefined)
      
      inline def setTooltipProps(value: TooltipProps): Self = StObject.set(x, "tooltipProps", value.asInstanceOf[js.Any])
      
      inline def setTooltipPropsUndefined: Self = StObject.set(x, "tooltipProps", js.undefined)
    }
  }
}
