package typingsJapgolly.baseui.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.phoneInputFlagMod.FlagProps
import typingsJapgolly.baseui.phoneInputTypesMod.CountryIso
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Flag {
  
  inline def apply($iso: CountryIso): Builder = {
    val __props = js.Dynamic.literal($iso = $iso.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[FlagProps]))
  }
  
  @JSImport("baseui/phone-input", "Flag")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def iso(value: CountryIso): this.type = set("iso", value.asInstanceOf[js.Any])
    
    inline def width(value: String): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: FlagProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
