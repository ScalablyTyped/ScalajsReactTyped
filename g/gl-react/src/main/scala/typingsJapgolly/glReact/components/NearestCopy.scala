package typingsJapgolly.glReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.glReact.mod.NearestCopyProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NearestCopy {
  
  @JSImport("gl-react", "NearestCopy")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.glReact.mod.NearestCopy] {
    
    inline def children(value: Any): this.type = set("children", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: NearestCopy.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: NearestCopyProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
