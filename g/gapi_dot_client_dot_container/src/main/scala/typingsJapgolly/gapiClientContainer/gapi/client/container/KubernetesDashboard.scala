package typingsJapgolly.gapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KubernetesDashboard extends js.Object {
  /** Whether the Kubernetes Dashboard is enabled for this cluster. */
  var disabled: js.UndefOr[Boolean] = js.undefined
}

object KubernetesDashboard {
  @scala.inline
  def apply(disabled: js.UndefOr[Boolean] = js.undefined): KubernetesDashboard = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[KubernetesDashboard]
  }
}

