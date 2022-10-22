package typingsJapgolly.wordpressComponents.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.wordpressComponents.tabPanelMod.TabPanel.Props
import typingsJapgolly.wordpressComponents.tabPanelMod.TabPanel.Tab
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.horizontal
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TabPanel {
  
  inline def apply(children: Tab => Element, tabs: js.Array[Tab]): Builder = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children), tabs = tabs.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("@wordpress/components", "TabPanel")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def activeClass(value: String): this.type = set("activeClass", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def initialTabName(value: String): this.type = set("initialTabName", value.asInstanceOf[js.Any])
    
    inline def onSelect(value: /* tabName */ String => Callback): this.type = set("onSelect", js.Any.fromFunction1((t0: /* tabName */ String) => value(t0).runNow()))
    
    inline def orientation(value: horizontal | vertical): this.type = set("orientation", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
