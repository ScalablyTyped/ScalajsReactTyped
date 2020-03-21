package typingsJapgolly.ionicAngular.stackUtilsMod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.angularCore.mod.ComponentRef
import typingsJapgolly.angularRouter.mod.NavigationExtras
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteView extends js.Object {
  var element: HTMLElement
  var id: Double
  var ref: ComponentRef[_]
  var savedData: js.UndefOr[js.Any] = js.undefined
  var savedExtras: js.UndefOr[NavigationExtras] = js.undefined
  var stackId: js.UndefOr[String] = js.undefined
  var url: String
  def unlistenEvents(): Unit
}

object RouteView {
  @scala.inline
  def apply(
    element: HTMLElement,
    id: Double,
    ref: ComponentRef[_],
    unlistenEvents: Callback,
    url: String,
    savedData: js.Any = null,
    savedExtras: NavigationExtras = null,
    stackId: String = null
  ): RouteView = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("unlistenEvents")(unlistenEvents.toJsFn)
    if (savedData != null) __obj.updateDynamic("savedData")(savedData.asInstanceOf[js.Any])
    if (savedExtras != null) __obj.updateDynamic("savedExtras")(savedExtras.asInstanceOf[js.Any])
    if (stackId != null) __obj.updateDynamic("stackId")(stackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteView]
  }
}

