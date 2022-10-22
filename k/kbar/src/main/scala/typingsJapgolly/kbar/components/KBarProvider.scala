package typingsJapgolly.kbar.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.kbar.libTypesMod.Action
import typingsJapgolly.kbar.libTypesMod.KBarOptions
import typingsJapgolly.kbar.libTypesMod.KBarProviderProps
import typingsJapgolly.react.mod.PropsWithChildren
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object KBarProvider {
  
  @JSImport("kbar", "KBarProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def actions(value: js.Array[Action]): this.type = set("actions", value.asInstanceOf[js.Any])
    
    inline def actionsVarargs(value: Action*): this.type = set("actions", js.Array(value*))
    
    inline def options(value: KBarOptions): this.type = set("options", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: KBarProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PropsWithChildren[KBarProviderProps]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
