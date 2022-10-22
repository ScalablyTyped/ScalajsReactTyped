package typingsJapgolly.antd.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antd.libConfigProviderDisabledContextMod.DisabledContextProps
import typingsJapgolly.antd.libConfigProviderDisabledContextMod.DisabledType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DisabledContextProvider {
  
  @JSImport("antd/lib/config-provider/DisabledContext", "DisabledContextProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def disabled(value: DisabledType): this.type = set("disabled", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: DisabledContextProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DisabledContextProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
