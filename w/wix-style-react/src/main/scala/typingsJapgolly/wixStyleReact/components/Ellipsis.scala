package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesCommonEllipsisMod.IEllipsisProps
import typingsJapgolly.wixStyleReact.distTypesCommonEllipsisMod.RenderProps
import typingsJapgolly.wixStyleReact.distTypesCommonEllipsisMod.default
import typingsJapgolly.wixStyleReact.distTypesPopoverPopoverDottypesMod.AppendTo
import typingsJapgolly.wixStyleReact.distTypesPopoverPopoverDottypesMod.Placement
import typingsJapgolly.wixStyleReact.distTypesTooltipTooltipDottypesMod.TooltipSize
import typingsJapgolly.wixStyleReact.distTypesTooltipTooltipDottypesMod.TooltipTextAlign
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Ellipsis {
  
  inline def apply(render: RenderProps[Any] => Element): Builder = {
    val __props = js.Dynamic.literal(render = js.Any.fromFunction1(render))
    new Builder(js.Array(this.component, __props.asInstanceOf[IEllipsisProps]))
  }
  
  @JSImport("wix-style-react/dist/types/common/Ellipsis", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def appendTo(value: AppendTo): this.type = set("appendTo", value.asInstanceOf[js.Any])
    
    inline def appendToFunction1(value: /* s */ org.scalajs.dom.Element => Boolean): this.type = set("appendTo", js.Any.fromFunction1(value))
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def ellipsis(value: Boolean): this.type = set("ellipsis", value.asInstanceOf[js.Any])
    
    inline def enterDelay(value: Double): this.type = set("enterDelay", value.asInstanceOf[js.Any])
    
    inline def exitDelay(value: Double): this.type = set("exitDelay", value.asInstanceOf[js.Any])
    
    inline def fixed(value: Boolean): this.type = set("fixed", value.asInstanceOf[js.Any])
    
    inline def flip(value: Boolean): this.type = set("flip", value.asInstanceOf[js.Any])
    
    inline def maxLines(value: Double): this.type = set("maxLines", value.asInstanceOf[js.Any])
    
    inline def maxWidth(
      value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['maxWidth'] */ js.Any
    ): this.type = set("maxWidth", value.asInstanceOf[js.Any])
    
    inline def moveArrowTo(value: Double): this.type = set("moveArrowTo", value.asInstanceOf[js.Any])
    
    inline def moveBy(
      value: /* import warning: importer.ImportType#apply Failed type conversion: wix-style-react.wix-style-react/dist/types/Popover/Popover.types.PopoverProps['moveBy'] */ js.Any
    ): this.type = set("moveBy", value.asInstanceOf[js.Any])
    
    inline def onHide(value: Callback): this.type = set("onHide", value.toJsFn)
    
    inline def onShow(value: Callback): this.type = set("onShow", value.toJsFn)
    
    inline def placement(value: Placement): this.type = set("placement", value.asInstanceOf[js.Any])
    
    inline def showTooltip(value: Boolean): this.type = set("showTooltip", value.asInstanceOf[js.Any])
    
    inline def size(value: TooltipSize): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def textAlign(value: TooltipTextAlign): this.type = set("textAlign", value.asInstanceOf[js.Any])
    
    inline def wrapperClassName(value: String): this.type = set("wrapperClassName", value.asInstanceOf[js.Any])
    
    inline def zIndex(value: Double): this.type = set("zIndex", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IEllipsisProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
