package typingsJapgolly.reactWidgets.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactWidgets.esmAddToListOptionMod.AddToListOptionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AddToListOption {
  
  inline def apply(onSelect: ReactMouseEventFrom[Element] => Callback): Default[js.Object] = {
    val __props = js.Dynamic.literal(onSelect = js.Any.fromFunction1((t0: ReactMouseEventFrom[Element]) => onSelect(t0).runNow()))
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[AddToListOptionProps]))
  }
  
  @JSImport("react-widgets/esm/AddToListOption", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: AddToListOptionProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
