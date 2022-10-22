package typingsJapgolly.reactToastify.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactToastify.distComponentsCloseButtonMod.CloseButtonProps
import typingsJapgolly.reactToastify.distTypesMod.Theme
import typingsJapgolly.reactToastify.distTypesMod.TypeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CloseButton {
  
  inline def apply(closeToast: ReactMouseEventFrom[HTMLElement] => Callback, theme: Theme, `type`: TypeOptions): Builder = {
    val __props = js.Dynamic.literal(closeToast = js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement]) => closeToast(t0).runNow()), theme = theme.asInstanceOf[js.Any])
    __props.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[CloseButtonProps]))
  }
  
  @JSImport("react-toastify/dist/components", "CloseButton")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def ariaLabel(value: String): this.type = set("ariaLabel", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CloseButtonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
