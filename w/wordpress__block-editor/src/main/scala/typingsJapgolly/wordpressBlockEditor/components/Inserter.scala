package typingsJapgolly.wordpressBlockEditor.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.wordpressBlockEditor.componentsInserterMod.Inserter.Props
import typingsJapgolly.wordpressComponents.dropdownMod.Dropdown.RenderProps
import typingsJapgolly.wordpressComponents.popoverMod.Popover.Position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Inserter {
  
  @JSImport("@wordpress/block-editor", "Inserter")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def clientId(value: String): this.type = set("clientId", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def isAppender(value: Boolean): this.type = set("isAppender", value.asInstanceOf[js.Any])
    
    inline def onToggle(value: /* isOpen */ Boolean => Callback): this.type = set("onToggle", js.Any.fromFunction1((t0: /* isOpen */ Boolean) => value(t0).runNow()))
    
    inline def position(value: Position): this.type = set("position", value.asInstanceOf[js.Any])
    
    inline def renderToggle(value: /* props */ RenderProps => Element): this.type = set("renderToggle", js.Any.fromFunction1(value))
    
    inline def rootClientId(value: String): this.type = set("rootClientId", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Inserter.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
