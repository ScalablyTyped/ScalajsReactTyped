package typingsJapgolly.storybookUi.components

import org.scalajs.dom.History
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.storybookUi.mod.Provider
import typingsJapgolly.storybookUi.mod.RootProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Root {
  
  inline def apply(provider: Provider): Builder = {
    val __props = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[RootProps]))
  }
  
  @JSImport("@storybook/ui", "Root")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def history(value: History): this.type = set("history", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: RootProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
