package typingsJapgolly.grommet.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.grommet.anon.SkipTo
import typingsJapgolly.grommet.es6ComponentsSkipLinksMod.SkipLinksProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SkipLinks {
  
  @JSImport("grommet/es6", "SkipLinks")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def messages(value: SkipTo): this.type = set("messages", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: SkipLinks.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SkipLinksProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
