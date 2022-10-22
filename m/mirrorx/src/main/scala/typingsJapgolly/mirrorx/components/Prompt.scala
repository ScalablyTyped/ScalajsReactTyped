package typingsJapgolly.mirrorx.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.history.mod.Location
import typingsJapgolly.mirrorx.mod.PromptProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Prompt {
  
  inline def apply(message: String | (js.Function1[/* location */ Location, String | Boolean])): Builder = {
    val __props = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PromptProps]))
  }
  
  @JSImport("mirrorx", "Prompt")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.mirrorx.mod.Prompt] {
    
    inline def when(value: Boolean): this.type = set("when", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PromptProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
