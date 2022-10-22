package typingsJapgolly.mirrorx.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.mirrorx.mod.RedirectProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Redirect {
  
  inline def apply(
    to: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify H.LocationDescriptor */ Any
  ): Builder = {
    val __props = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[RedirectProps]))
  }
  
  @JSImport("mirrorx", "Redirect")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.mirrorx.mod.Redirect] {
    
    inline def exact(value: Boolean): this.type = set("exact", value.asInstanceOf[js.Any])
    
    inline def from(value: String): this.type = set("from", value.asInstanceOf[js.Any])
    
    inline def path(value: String): this.type = set("path", value.asInstanceOf[js.Any])
    
    inline def push(value: Boolean): this.type = set("push", value.asInstanceOf[js.Any])
    
    inline def strict(value: Boolean): this.type = set("strict", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: RedirectProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
