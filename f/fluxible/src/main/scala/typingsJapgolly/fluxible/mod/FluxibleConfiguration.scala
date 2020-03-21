package typingsJapgolly.fluxible.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FluxibleConfiguration extends js.Object {
  /**
    * Stores your top level React component for access using `getComponent()`
    */
  var component: js.Any
  /**
    * App level component action handler
    */
  var componentActionHandler: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object FluxibleConfiguration {
  @scala.inline
  def apply(component: js.Any, componentActionHandler: js.UndefOr[Callback] = js.undefined): FluxibleConfiguration = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    componentActionHandler.foreach(p => __obj.updateDynamic("componentActionHandler")(p.toJsFn))
    __obj.asInstanceOf[FluxibleConfiguration]
  }
}

