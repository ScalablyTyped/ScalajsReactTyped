package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesVerticalTabsMod.VerticalTabsProps
import typingsJapgolly.wixStyleReact.distTypesVerticalTabsMod.VerticalTabsSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VerticalTabs {
  
  @JSImport("wix-style-react", "VerticalTabs")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.VerticalTabs] {
    
    inline def activeTabId(value: Double): this.type = set("activeTabId", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def onChange(value: /* id */ Double => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* id */ Double) => value(t0).runNow()))
    
    inline def size(value: VerticalTabsSize): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: VerticalTabs.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: VerticalTabsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
