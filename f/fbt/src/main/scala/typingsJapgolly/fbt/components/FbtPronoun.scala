package typingsJapgolly.fbt.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fbt.mod.FbtPronounProps
import typingsJapgolly.fbt.mod.GenderConst
import typingsJapgolly.fbt.mod.PronounType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FbtPronoun {
  
  inline def apply(gender: GenderConst, `type`: PronounType): Builder = {
    val __props = js.Dynamic.literal(gender = gender.asInstanceOf[js.Any])
    __props.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[FbtPronounProps]))
  }
  
  @JSImport("fbt", "FbtPronoun")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def capitalize(value: Boolean): this.type = set("capitalize", value.asInstanceOf[js.Any])
    
    inline def human(value: Boolean): this.type = set("human", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: FbtPronounProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
