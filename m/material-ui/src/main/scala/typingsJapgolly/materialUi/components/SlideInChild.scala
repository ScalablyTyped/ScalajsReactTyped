package typingsJapgolly.materialUi.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.materialUi.internalSlideInChildMod.SlideInChildProps
import typingsJapgolly.materialUi.internalSlideInChildMod.default
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SlideInChild {
  
  inline def apply(getLeaveDirection: js.Function): Builder = {
    val __props = js.Dynamic.literal(getLeaveDirection = getLeaveDirection.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SlideInChildProps]))
  }
  
  @JSImport("material-ui/internal/SlideInChild", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def direction(value: String): this.type = set("direction", value.asInstanceOf[js.Any])
    
    inline def enterDelay(value: Double): this.type = set("enterDelay", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SlideInChildProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
