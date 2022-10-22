package typingsJapgolly.antd.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antd.libTooltipMod.TooltipProps
import typingsJapgolly.antd.libTypographyBaseEllipsisTooltipMod.EllipsisTooltipProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object EllipsisTooltip {
  
  inline def apply(enabledEllipsis: Boolean): Builder = {
    val __props = js.Dynamic.literal(enabledEllipsis = enabledEllipsis.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[EllipsisTooltipProps]))
  }
  
  @JSImport("antd/lib/typography/Base/EllipsisTooltip", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def isEllipsis(value: Boolean): this.type = set("isEllipsis", value.asInstanceOf[js.Any])
    
    inline def tooltipProps(value: TooltipProps): this.type = set("tooltipProps", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: EllipsisTooltipProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
