package typingsJapgolly.reactWow.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactWow.mod.ReactWOWProps
import typingsJapgolly.reactWow.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactWow {
  
  inline def apply(
    animation: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 76, starting with typingsJapgolly.reactWow.reactWowStrings.bounce, typingsJapgolly.reactWow.reactWowStrings.flash, typingsJapgolly.reactWow.reactWowStrings.pulse */ Any
  ): Builder = {
    val __props = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ReactWOWProps]))
  }
  
  @JSImport("react-wow", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def animateClass(value: String): this.type = set("animateClass", value.asInstanceOf[js.Any])
    
    inline def callback(value: Callback): this.type = set("callback", value.toJsFn)
    
    inline def delay(value: String): this.type = set("delay", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def duration(value: String): this.type = set("duration", value.asInstanceOf[js.Any])
    
    inline def iteration(value: String): this.type = set("iteration", value.asInstanceOf[js.Any])
    
    inline def offset(value: Double | js.Array[Double]): this.type = set("offset", value.asInstanceOf[js.Any])
    
    inline def offsetVarargs(value: Double*): this.type = set("offset", js.Array(value*))
    
    inline def overflow(value: Boolean): this.type = set("overflow", value.asInstanceOf[js.Any])
    
    inline def resize(value: Boolean): this.type = set("resize", value.asInstanceOf[js.Any])
    
    inline def scroll(value: Boolean): this.type = set("scroll", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ReactWOWProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
