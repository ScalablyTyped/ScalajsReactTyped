package typingsJapgolly.antdMobile.components

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.antdMobile.esComponentsDialogDialogActionButtonMod.Action
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DialogActionButton {
  
  inline def apply(action: Action, onAction: CallbackTo[Unit | js.Promise[Unit]]): Default[js.Object] = {
    val __props = js.Dynamic.literal(action = action.asInstanceOf[js.Any], onAction = onAction.toJsFn)
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[typingsJapgolly.antdMobile.anon.Action]))
  }
  
  @JSImport("antd-mobile/es/components/dialog/dialog-action-button", "DialogActionButton")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: typingsJapgolly.antdMobile.anon.Action): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
