package typingsJapgolly.openstackWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openstack-wrapper", "getSimpleProject")
@js.native
object getSimpleProject extends js.Object {
  def apply(
    username: String,
    password: String,
    project_id: String,
    keystone_url: String,
    cb: js.Function1[/* repeated */ js.Any, _]
  ): Unit = js.native
}

