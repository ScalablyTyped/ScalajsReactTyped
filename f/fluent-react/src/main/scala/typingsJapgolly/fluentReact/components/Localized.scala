package typingsJapgolly.fluentReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fluentReact.mod.LocalizedProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Localized {
  
  inline def apply(id: String): Builder = {
    val __props = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[LocalizedProps]))
  }
  
  @JSImport("fluent-react", "Localized")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.fluentReact.mod.Localized] {
    
    inline def attrs(value: js.Object): this.type = set("attrs", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: LocalizedProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
