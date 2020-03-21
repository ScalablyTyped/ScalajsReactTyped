package typingsJapgolly.sharepoint.SP.JsGrid

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.microsoftAjax.Sys.UI.DomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait IEditActorGridContext extends js.Object {
  var RTL: js.Any
  var bLightFocus: Boolean
  var emptyValue: js.Any
  var jsGridObj: JsGridControl
  var parentNode: HTMLElement
  var styleManager: IStyleManager
  def OnKeyDown(domEvent: DomEvent): Unit
}

object IEditActorGridContext {
  @scala.inline
  def apply(
    OnKeyDown: DomEvent => Callback,
    RTL: js.Any,
    bLightFocus: Boolean,
    emptyValue: js.Any,
    jsGridObj: JsGridControl,
    parentNode: HTMLElement,
    styleManager: IStyleManager
  ): IEditActorGridContext = {
    val __obj = js.Dynamic.literal(RTL = RTL.asInstanceOf[js.Any], bLightFocus = bLightFocus.asInstanceOf[js.Any], emptyValue = emptyValue.asInstanceOf[js.Any], jsGridObj = jsGridObj.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], styleManager = styleManager.asInstanceOf[js.Any])
    __obj.updateDynamic("OnKeyDown")(js.Any.fromFunction1((t0: typingsJapgolly.microsoftAjax.Sys.UI.DomEvent) => OnKeyDown(t0).runNow()))
    __obj.asInstanceOf[IEditActorGridContext]
  }
}

