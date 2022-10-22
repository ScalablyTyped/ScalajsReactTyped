package typingsJapgolly.gestalt.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.gestalt.anon.Name
import typingsJapgolly.gestalt.gestaltStrings.fit
import typingsJapgolly.gestalt.gestaltStrings.lg
import typingsJapgolly.gestalt.gestaltStrings.md
import typingsJapgolly.gestalt.mod.AvatarPairProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AvatarPair {
  
  inline def apply(collaborators: js.Array[Name]): Builder = {
    val __props = js.Dynamic.literal(collaborators = collaborators.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[AvatarPairProps]))
  }
  
  @JSImport("gestalt", "AvatarPair")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def size(value: md | lg | fit): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AvatarPairProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
