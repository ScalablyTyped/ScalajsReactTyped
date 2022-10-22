package typingsJapgolly.wordpressEditor.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wordpressBlockEditor.componentsBlockAlignmentToolbarMod.BlockAlignmentToolbar.Control
import typingsJapgolly.wordpressBlockEditor.componentsBlockAlignmentToolbarMod.BlockAlignmentToolbar.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BlockAlignmentToolbar {
  
  inline def apply(onChange: js.UndefOr[Control] => Callback): Builder = {
    val __props = js.Dynamic.literal(onChange = js.Any.fromFunction1((t0: js.UndefOr[Control]) => onChange(t0).runNow()))
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("@wordpress/editor", "BlockAlignmentToolbar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def controls(value: js.Array[Control]): this.type = set("controls", value.asInstanceOf[js.Any])
    
    inline def controlsVarargs(value: Control*): this.type = set("controls", js.Array(value*))
    
    inline def isCollapsed(value: Boolean): this.type = set("isCollapsed", value.asInstanceOf[js.Any])
    
    inline def value(value: Control): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
