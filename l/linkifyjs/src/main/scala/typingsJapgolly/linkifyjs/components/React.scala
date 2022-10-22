package typingsJapgolly.linkifyjs.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.linkifyjs.mod.Options
import typingsJapgolly.linkifyjs.reactMod.LinkifyProps
import typingsJapgolly.linkifyjs.reactMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object React {
  
  @JSImport("linkifyjs/react", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def options(value: Options): this.type = set("options", value.asInstanceOf[js.Any])
    
    inline def tagName(value: String): this.type = set("tagName", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: React.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: LinkifyProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
