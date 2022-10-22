package typingsJapgolly.wordpressEditPost.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wordpressComponents.dashiconMod.Dashicon.Icon
import typingsJapgolly.wordpressEditPost.componentsBlockSettingsMenuPluginBlockSettingsMenuItemMod.PluginBlockSettingsMenuItem.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PluginBlockSettingsMenuItem {
  
  inline def apply(label: String, onClick: ReactMouseEventFrom[HTMLButtonElement & Element] => Callback): Builder = {
    val __props = js.Dynamic.literal(label = label.asInstanceOf[js.Any], onClick = js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & Element]) => onClick(t0).runNow()))
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("@wordpress/edit-post", "PluginBlockSettingsMenuItem")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def allowedBlocks(value: js.Array[String]): this.type = set("allowedBlocks", value.asInstanceOf[js.Any])
    
    inline def allowedBlocksVarargs(value: String*): this.type = set("allowedBlocks", js.Array(value*))
    
    inline def icon(value: typingsJapgolly.react.mod.global.JSX.Element | Icon): this.type = set("icon", value.asInstanceOf[js.Any])
    
    inline def iconVdomElement(value: VdomElement): this.type = set("icon", value.rawElement.asInstanceOf[js.Any])
    
    inline def small(value: Boolean): this.type = set("small", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
