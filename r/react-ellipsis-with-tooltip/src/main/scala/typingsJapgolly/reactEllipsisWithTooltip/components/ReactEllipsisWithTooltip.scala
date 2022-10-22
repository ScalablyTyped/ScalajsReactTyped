package typingsJapgolly.reactEllipsisWithTooltip.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactEllipsisWithTooltip.mod.EllipsisWithTooltipProps
import typingsJapgolly.reactEllipsisWithTooltip.mod.default
import typingsJapgolly.reactEllipsisWithTooltip.reactEllipsisWithTooltipStrings.`auto-end`
import typingsJapgolly.reactEllipsisWithTooltip.reactEllipsisWithTooltipStrings.`auto-start`
import typingsJapgolly.reactEllipsisWithTooltip.reactEllipsisWithTooltipStrings.`bottom-end`
import typingsJapgolly.reactEllipsisWithTooltip.reactEllipsisWithTooltipStrings.`bottom-start`
import typingsJapgolly.reactEllipsisWithTooltip.reactEllipsisWithTooltipStrings.`left-end`
import typingsJapgolly.reactEllipsisWithTooltip.reactEllipsisWithTooltipStrings.`left-start`
import typingsJapgolly.reactEllipsisWithTooltip.reactEllipsisWithTooltipStrings.`right-end`
import typingsJapgolly.reactEllipsisWithTooltip.reactEllipsisWithTooltipStrings.`right-start`
import typingsJapgolly.reactEllipsisWithTooltip.reactEllipsisWithTooltipStrings.`top-end`
import typingsJapgolly.reactEllipsisWithTooltip.reactEllipsisWithTooltipStrings.`top-start`
import typingsJapgolly.reactEllipsisWithTooltip.reactEllipsisWithTooltipStrings.auto
import typingsJapgolly.reactEllipsisWithTooltip.reactEllipsisWithTooltipStrings.bottom
import typingsJapgolly.reactEllipsisWithTooltip.reactEllipsisWithTooltipStrings.left
import typingsJapgolly.reactEllipsisWithTooltip.reactEllipsisWithTooltipStrings.right
import typingsJapgolly.reactEllipsisWithTooltip.reactEllipsisWithTooltipStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactEllipsisWithTooltip {
  
  @JSImport("react-ellipsis-with-tooltip", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def delayHide(value: Double): this.type = set("delayHide", value.asInstanceOf[js.Any])
    
    inline def delayShow(value: Double): this.type = set("delayShow", value.asInstanceOf[js.Any])
    
    inline def placement(
      value: `auto-start` | auto | `auto-end` | `top-start` | top | `top-end` | `right-start` | right | `right-end` | `bottom-end` | bottom | `bottom-start` | `left-end` | left | `left-start`
    ): this.type = set("placement", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactEllipsisWithTooltip.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: EllipsisWithTooltipProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
