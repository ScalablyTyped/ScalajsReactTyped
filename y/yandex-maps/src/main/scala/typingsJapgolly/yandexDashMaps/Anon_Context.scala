package typingsJapgolly.yandexDashMaps

import typingsJapgolly.yandexDashMaps.yandexDashMapsMod.IEventManager
import typingsJapgolly.yandexDashMaps.yandexDashMapsMod.IEventWorkflowController
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Context extends js.Object {
  var context: js.UndefOr[js.Object] = js.undefined
  var controllers: js.UndefOr[js.Array[IEventWorkflowController]] = js.undefined
  var parent: js.UndefOr[IEventManager] = js.undefined
}

object Anon_Context {
  @scala.inline
  def apply(
    context: js.Object = null,
    controllers: js.Array[IEventWorkflowController] = null,
    parent: IEventManager = null
  ): Anon_Context = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (controllers != null) __obj.updateDynamic("controllers")(controllers.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Context]
  }
}

