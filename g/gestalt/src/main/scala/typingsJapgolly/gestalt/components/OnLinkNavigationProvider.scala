package typingsJapgolly.gestalt.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.gestalt.mod.EventHandlerType
import typingsJapgolly.gestalt.mod.OnLinkNavigationProviderProps
import typingsJapgolly.gestalt.mod.OnNavigationArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object OnLinkNavigationProvider {
  
  @JSImport("gestalt", "OnLinkNavigationProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def onNavigation(value: /* args */ OnNavigationArgs => js.UndefOr[EventHandlerType | Null]): this.type = set("onNavigation", js.Any.fromFunction1(value))
  }
  
  implicit def make(companion: OnLinkNavigationProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: OnLinkNavigationProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
