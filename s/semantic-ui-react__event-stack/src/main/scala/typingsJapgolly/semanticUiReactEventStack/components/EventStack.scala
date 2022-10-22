package typingsJapgolly.semanticUiReactEventStack.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.semanticUiReactEventStack.libTypesEventStackMod.EventStackProps
import typingsJapgolly.semanticUiReactEventStack.libTypesTypesMod.InputEventListener
import typingsJapgolly.semanticUiReactEventStack.libTypesTypesMod.InputTargetElement
import typingsJapgolly.semanticUiReactEventStack.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object EventStack {
  
  inline def apply(name: String, on: InputEventListener): Builder = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[EventStackProps]))
  }
  
  @JSImport("@semantic-ui-react/event-stack", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def pool(value: String): this.type = set("pool", value.asInstanceOf[js.Any])
    
    inline def target(value: InputTargetElement): this.type = set("target", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: EventStackProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
