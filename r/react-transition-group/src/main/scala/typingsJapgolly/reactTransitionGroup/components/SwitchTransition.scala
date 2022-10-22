package typingsJapgolly.reactTransitionGroup.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactTransitionGroup.reactTransitionGroupStrings.`in-out`
import typingsJapgolly.reactTransitionGroup.reactTransitionGroupStrings.`out-in`
import typingsJapgolly.reactTransitionGroup.switchTransitionMod.SwitchTransitionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SwitchTransition {
  
  @JSImport("react-transition-group", "SwitchTransition")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactTransitionGroup.mod.SwitchTransition] {
    
    inline def mode(value: `out-in` | `in-out`): this.type = set("mode", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: SwitchTransition.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SwitchTransitionProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
