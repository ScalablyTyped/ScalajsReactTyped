package typingsJapgolly.rrc.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.history.mod.Location
import typingsJapgolly.rrc.mod.OnUpdateProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object OnUpdate {
  
  inline def apply(call: /* location */ Location => Callback): Builder = {
    val __props = js.Dynamic.literal(call = js.Any.fromFunction1((t0: /* location */ Location) => call(t0).runNow()))
    new Builder(js.Array(this.component, __props.asInstanceOf[OnUpdateProps]))
  }
  
  @JSImport("rrc", "OnUpdate")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.rrc.mod.OnUpdate] {
    
    inline def immediate(value: Boolean): this.type = set("immediate", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: OnUpdateProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
