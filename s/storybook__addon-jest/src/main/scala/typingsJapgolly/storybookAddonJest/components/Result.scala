package typingsJapgolly.storybookAddonJest.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.storybookAddonJest.distTs3Dot9ComponentsResultMod.ResultProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Result {
  
  inline def apply(failureMessages: Any, status: String): Builder = {
    val __props = js.Dynamic.literal(failureMessages = failureMessages.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ResultProps]))
  }
  
  @JSImport("@storybook/addon-jest/dist/ts3.9/components/Result", "Result")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def fullName(value: String): this.type = set("fullName", value.asInstanceOf[js.Any])
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ResultProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
