package typingsJapgolly.followRedirects

import typingsJapgolly.node.httpMod.Agent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHttp extends js.Object {
  var http: js.UndefOr[Agent] = js.undefined
  var https: js.UndefOr[typingsJapgolly.node.httpsMod.Agent] = js.undefined
}

object AnonHttp {
  @scala.inline
  def apply(http: Agent = null, https: typingsJapgolly.node.httpsMod.Agent = null): AnonHttp = {
    val __obj = js.Dynamic.literal()
    if (http != null) __obj.updateDynamic("http")(http.asInstanceOf[js.Any])
    if (https != null) __obj.updateDynamic("https")(https.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHttp]
  }
}

