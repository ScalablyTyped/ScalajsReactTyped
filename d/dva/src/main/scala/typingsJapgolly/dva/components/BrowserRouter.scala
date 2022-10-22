package typingsJapgolly.dva.components

import org.scalajs.dom.Window
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactRouterDom.mod.BrowserRouterProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BrowserRouter {
  
  @JSImport("dva/router", "BrowserRouter")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def basename(value: String): this.type = set("basename", value.asInstanceOf[js.Any])
    
    inline def window(value: Window): this.type = set("window", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: BrowserRouter.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: BrowserRouterProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
