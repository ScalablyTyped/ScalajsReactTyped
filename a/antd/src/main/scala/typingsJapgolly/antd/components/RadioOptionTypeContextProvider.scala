package typingsJapgolly.antd.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antd.libRadioInterfaceMod.RadioGroupOptionType
import typingsJapgolly.react.mod.ProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RadioOptionTypeContextProvider {
  
  @JSImport("antd/lib/radio/context", "RadioOptionTypeContextProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def value(value: RadioGroupOptionType): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def valueNull: this.type = set("value", null)
  }
  
  implicit def make(companion: RadioOptionTypeContextProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ProviderProps[RadioGroupOptionType | Null]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
