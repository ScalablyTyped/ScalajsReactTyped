package typingsJapgolly.storybookRouter.components

import org.scalajs.dom.Window
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.storybookRouter.distTs3Dot9ModulesReactRouterDomIndexMod.HashRouterProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HashRouter {
  
  @JSImport("@storybook/router/dist/ts3.9/_modules/react-router-dom-index", "HashRouter")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def basename(value: String): this.type = set("basename", value.asInstanceOf[js.Any])
    
    inline def window(value: Window): this.type = set("window", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: HashRouter.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: HashRouterProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
