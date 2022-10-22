package typingsJapgolly.fbt.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fbt.fbtStrings.ifMany
import typingsJapgolly.fbt.fbtStrings.no
import typingsJapgolly.fbt.fbtStrings.yes
import typingsJapgolly.fbt.mod.FbtPluralProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FbtPlural {
  
  inline def apply(count: Double): Builder = {
    val __props = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[FbtPluralProps]))
  }
  
  @JSImport("fbt", "FbtPlural")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def many(value: String): this.type = set("many", value.asInstanceOf[js.Any])
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def showCount(value: yes | no | ifMany): this.type = set("showCount", value.asInstanceOf[js.Any])
    
    inline def value(value: Any): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: FbtPluralProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
