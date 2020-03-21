package typingsJapgolly.sharepoint.SP.JsGrid

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.microsoftAjax.Sys.UI.DomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait IEditControlGridContext extends IEditActorGridContext {
  def OnActivateActor(): Unit
  def OnDeactivateActor(): Unit
}

object IEditControlGridContext {
  @scala.inline
  def apply(
    OnActivateActor: Callback,
    OnDeactivateActor: Callback,
    OnKeyDown: DomEvent => Callback,
    RTL: js.Any,
    bLightFocus: Boolean,
    emptyValue: js.Any,
    jsGridObj: JsGridControl,
    parentNode: HTMLElement,
    styleManager: IStyleManager
  ): IEditControlGridContext = {
    val __obj = js.Dynamic.literal(RTL = RTL.asInstanceOf[js.Any], bLightFocus = bLightFocus.asInstanceOf[js.Any], emptyValue = emptyValue.asInstanceOf[js.Any], jsGridObj = jsGridObj.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], styleManager = styleManager.asInstanceOf[js.Any])
    __obj.updateDynamic("OnActivateActor")(OnActivateActor.toJsFn)
    __obj.updateDynamic("OnDeactivateActor")(OnDeactivateActor.toJsFn)
    __obj.updateDynamic("OnKeyDown")(js.Any.fromFunction1((t0: typingsJapgolly.microsoftAjax.Sys.UI.DomEvent) => OnKeyDown(t0).runNow()))
    __obj.asInstanceOf[IEditControlGridContext]
  }
}

