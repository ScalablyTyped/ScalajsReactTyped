package typingsJapgolly.materialUiCore.components

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Document
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.materialUiCore.unstableTrapFocusUnstableTrapFocusMod.TrapFocusProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object UnstableTrapFocus {
  
  inline def apply(getDoc: CallbackTo[Document], isEnabled: CallbackTo[Boolean], open: Boolean): Builder = {
    val __props = js.Dynamic.literal(getDoc = getDoc.toJsFn, isEnabled = isEnabled.toJsFn, open = open.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TrapFocusProps]))
  }
  
  @JSImport("@material-ui/core", "UnstableTrapFocus")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def disableAutoFocus(value: Boolean): this.type = set("disableAutoFocus", value.asInstanceOf[js.Any])
    
    inline def disableEnforceFocus(value: Boolean): this.type = set("disableEnforceFocus", value.asInstanceOf[js.Any])
    
    inline def disableRestoreFocus(value: Boolean): this.type = set("disableRestoreFocus", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TrapFocusProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
