package typingsJapgolly.gapiClientServiceuser.gapi.client.serviceuser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mixin extends js.Object {
  /** The fully qualified name of the interface which is included. */
  var name: js.UndefOr[String] = js.undefined
  /**
    * If non-empty specifies a path under which inherited HTTP paths
    * are rooted.
    */
  var root: js.UndefOr[String] = js.undefined
}

object Mixin {
  @scala.inline
  def apply(name: String = null, root: String = null): Mixin = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mixin]
  }
}

