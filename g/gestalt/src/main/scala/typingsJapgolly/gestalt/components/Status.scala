package typingsJapgolly.gestalt.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.gestalt.gestaltStrings.canceled
import typingsJapgolly.gestalt.gestaltStrings.halted
import typingsJapgolly.gestalt.gestaltStrings.inProgress
import typingsJapgolly.gestalt.gestaltStrings.ok
import typingsJapgolly.gestalt.gestaltStrings.problem
import typingsJapgolly.gestalt.gestaltStrings.unstarted
import typingsJapgolly.gestalt.gestaltStrings.warning
import typingsJapgolly.gestalt.mod.StatusProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Status {
  
  inline def apply(`type`: unstarted | inProgress | halted | ok | problem | canceled | warning): Builder = {
    val __props = js.Dynamic.literal()
    __props.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[StatusProps]))
  }
  
  @JSImport("gestalt", "Status")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def accessibilityLabel(value: String): this.type = set("accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def subtext(value: String): this.type = set("subtext", value.asInstanceOf[js.Any])
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: StatusProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
