package typingsJapgolly.djangoBananas.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.djangoBananas.authPermissionRequiredMod.PermissionRequiredProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PermissionRequired {
  
  inline def apply(permission: String | js.Array[String]): Builder = {
    val __props = js.Dynamic.literal(permission = permission.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PermissionRequiredProps]))
  }
  
  @JSImport("django-bananas/auth/PermissionRequired", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def allMustMatch(value: Boolean): this.type = set("allMustMatch", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PermissionRequiredProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
