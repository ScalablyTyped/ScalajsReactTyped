package typingsJapgolly.gestalt.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.gestalt.anon.ActiveTabIndex
import typingsJapgolly.gestalt.anon.Id
import typingsJapgolly.gestalt.gestaltStrings.default
import typingsJapgolly.gestalt.gestaltStrings.lg
import typingsJapgolly.gestalt.gestaltStrings.md
import typingsJapgolly.gestalt.gestaltStrings.transparent
import typingsJapgolly.gestalt.mod.TabsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tabs {
  
  inline def apply(activeTabIndex: Double, onChange: ActiveTabIndex => Callback, tabs: js.Array[Id]): Builder = {
    val __props = js.Dynamic.literal(activeTabIndex = activeTabIndex.asInstanceOf[js.Any], onChange = js.Any.fromFunction1((t0: ActiveTabIndex) => onChange(t0).runNow()), tabs = tabs.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TabsProps]))
  }
  
  @JSImport("gestalt", "Tabs")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def bgColor(value: default | transparent): this.type = set("bgColor", value.asInstanceOf[js.Any])
    
    inline def size(value: md | lg): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def wrap(value: Boolean): this.type = set("wrap", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TabsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
