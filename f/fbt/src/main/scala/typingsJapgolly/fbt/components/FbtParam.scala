package typingsJapgolly.fbt.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fbt.fbtBooleans.`true`
import typingsJapgolly.fbt.mod.FbtParamProps
import typingsJapgolly.fbt.mod.IntlVariationsGender
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FbtParam {
  
  inline def apply(name: String): Builder = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[FbtParamProps]))
  }
  
  @JSImport("fbt", "FbtParam")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def gender(value: IntlVariationsGender): this.type = set("gender", value.asInstanceOf[js.Any])
    
    inline def number(value: Double | `true`): this.type = set("number", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: FbtParamProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
