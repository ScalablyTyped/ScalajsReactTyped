package typingsJapgolly.atlaskitVisuallyHidden.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.atlaskitVisuallyHidden.distTypesTypesMod.VisuallyHiddenProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VisuallyHidden {
  
  @JSImport("@atlaskit/visually-hidden", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
    
    inline def testId(value: String): this.type = set("testId", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: VisuallyHidden.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: VisuallyHiddenProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
