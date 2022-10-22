package typingsJapgolly.wixUiCore.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixUiCore.distEsSrcComponentsEllipsisTooltipStateFullComponentWrapMod.StateFullComponentWrapProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StateFullComponentWrap {
  
  @JSImport("wix-ui-core/dist/es/src/components/ellipsis-tooltip/StateFullComponentWrap", "StateFullComponentWrap")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[
          typingsJapgolly.wixUiCore.distEsSrcComponentsEllipsisTooltipStateFullComponentWrapMod.StateFullComponentWrap
        ] {
    
    inline def children(value: Any): this.type = set("children", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: StateFullComponentWrap.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: StateFullComponentWrapProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
