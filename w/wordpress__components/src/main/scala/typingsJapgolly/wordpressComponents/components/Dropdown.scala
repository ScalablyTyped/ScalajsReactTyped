package typingsJapgolly.wordpressComponents.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.wordpressComponents.dropdownMod.Dropdown.Props
import typingsJapgolly.wordpressComponents.dropdownMod.Dropdown.RenderProps
import typingsJapgolly.wordpressComponents.popoverMod.Popover.Position
import typingsJapgolly.wordpressComponents.wordpressComponentsBooleans.`false`
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.container
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.firstElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Dropdown {
  
  inline def apply(renderContent: RenderProps => Element, renderToggle: RenderProps => Element): Builder = {
    val __props = js.Dynamic.literal(renderContent = js.Any.fromFunction1(renderContent), renderToggle = js.Any.fromFunction1(renderToggle))
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("@wordpress/components", "Dropdown")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def contentClassName(value: String): this.type = set("contentClassName", value.asInstanceOf[js.Any])
    
    inline def expandOnMobile(value: Boolean): this.type = set("expandOnMobile", value.asInstanceOf[js.Any])
    
    inline def focusOnMount(value: firstElement | container | `false`): this.type = set("focusOnMount", value.asInstanceOf[js.Any])
    
    inline def headerTitle(value: VdomNode): this.type = set("headerTitle", value.rawNode.asInstanceOf[js.Any])
    
    inline def headerTitleNull: this.type = set("headerTitle", null)
    
    inline def headerTitleVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): this.type = set("headerTitle", js.Array(value*))
    
    inline def headerTitleVdomElement(value: VdomElement): this.type = set("headerTitle", value.rawElement.asInstanceOf[js.Any])
    
    inline def position(value: Position): this.type = set("position", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
