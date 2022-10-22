package typingsJapgolly.orbitUiReactComponents.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.orbitUiReactComponents.distTabsSrcTabListMod.InnerTabListProps
import typingsJapgolly.orbitUiReactComponents.distTabsSrcUseTabsItemsMod.TabType
import typingsJapgolly.react.mod.ForwardedRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InnerTabList {
  
  @JSImport("@orbit-ui/react-components", "InnerTabList")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def autoFocus(value: Boolean | Double): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    inline def forwardedRef(value: ForwardedRef[Any]): this.type = set("forwardedRef", value.asInstanceOf[js.Any])
    
    inline def forwardedRefFunction1(value: /* instance */ Any | Null => Callback): this.type = set("forwardedRef", js.Any.fromFunction1((t0: /* instance */ Any | Null) => value(t0).runNow()))
    
    inline def forwardedRefNull: this.type = set("forwardedRef", null)
    
    inline def tabs(value: js.Array[TabType]): this.type = set("tabs", value.asInstanceOf[js.Any])
    
    inline def tabsVarargs(value: TabType*): this.type = set("tabs", js.Array(value*))
  }
  
  implicit def make(companion: InnerTabList.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: InnerTabListProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
