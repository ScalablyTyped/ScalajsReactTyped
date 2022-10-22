package typingsJapgolly.reactNativeModalPopover.components

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNativeModalPopover.libPopoverControllerMod.PopoverControllerRenderProps
import typingsJapgolly.reactNativeModalPopover.libPopoverControllerMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PopoverController {
  
  inline def apply(children: PopoverControllerRenderProps => Element): Builder = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("react-native-modal-popover", "PopoverController")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactNativeModalPopover.mod.PopoverController] {
    
    inline def calculateStatusBar(value: Boolean): this.type = set("calculateStatusBar", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
