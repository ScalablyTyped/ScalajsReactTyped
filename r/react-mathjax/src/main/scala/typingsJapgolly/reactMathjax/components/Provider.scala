package typingsJapgolly.reactMathjax.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactMathjax.anon.Children
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Provider {
  
  @JSImport("react-mathjax", "default.Provider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactMathjax.mod.default.Provider] {
    
    inline def options(value: js.Object): this.type = set("options", value.asInstanceOf[js.Any])
    
    inline def script(value: String | Boolean): this.type = set("script", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Provider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Children): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
