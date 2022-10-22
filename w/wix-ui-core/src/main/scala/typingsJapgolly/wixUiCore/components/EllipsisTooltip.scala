package typingsJapgolly.wixUiCore.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixUiCore.anon.DictotherPropName
import typingsJapgolly.wixUiCore.distEsSrcComponentsEllipsisTooltipEllipsisTooltipMod.EllipsisTooltipProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object EllipsisTooltip {
  
  inline def apply(children: Any => DictotherPropName): Builder = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Builder(js.Array(this.component, __props.asInstanceOf[EllipsisTooltipProps]))
  }
  
  @JSImport("wix-ui-core/dist/es/src", "EllipsisTooltip")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixUiCore.distEsSrcMod.EllipsisTooltip] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def `data-hook`(value: String): this.type = set("data-hook", value.asInstanceOf[js.Any])
    
    inline def showTooltip(value: Boolean): this.type = set("showTooltip", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: EllipsisTooltipProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
