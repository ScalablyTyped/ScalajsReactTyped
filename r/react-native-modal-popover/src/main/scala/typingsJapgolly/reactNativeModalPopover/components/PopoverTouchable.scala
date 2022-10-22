package typingsJapgolly.reactNativeModalPopover.components

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNativeModalPopover.libPopoverTouchableMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PopoverTouchable {
  
  @JSImport("react-native-modal-popover", "PopoverTouchable")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactNativeModalPopover.mod.PopoverTouchable] {
    
    inline def onPopoverDisplayed(value: CallbackTo[Any]): this.type = set("onPopoverDisplayed", value.toJsFn)
  }
  
  implicit def make(companion: PopoverTouchable.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
