package typingsJapgolly.wordpressComponents.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wordpressComponents.colorPickerMod.ColorPicker.OnChangeCompleteValue
import typingsJapgolly.wordpressComponents.colorPickerMod.ColorPicker.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ColorPicker {
  
  inline def apply(onChangeComplete: OnChangeCompleteValue => Callback): Builder = {
    val __props = js.Dynamic.literal(onChangeComplete = js.Any.fromFunction1((t0: OnChangeCompleteValue) => onChangeComplete(t0).runNow()))
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("@wordpress/components", "ColorPicker")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def disableAlpha(value: Boolean): this.type = set("disableAlpha", value.asInstanceOf[js.Any])
    
    inline def oldHue(value: Double): this.type = set("oldHue", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
