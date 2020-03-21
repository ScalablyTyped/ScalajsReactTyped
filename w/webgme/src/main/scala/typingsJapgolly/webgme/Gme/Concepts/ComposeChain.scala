package typingsJapgolly.webgme.Gme.Concepts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComposeChain extends js.Object {
  var objId: String
  var subCompId: js.UndefOr[String] = js.undefined
}

object ComposeChain {
  @scala.inline
  def apply(objId: String, subCompId: String = null): ComposeChain = {
    val __obj = js.Dynamic.literal(objId = objId.asInstanceOf[js.Any])
    if (subCompId != null) __obj.updateDynamic("subCompId")(subCompId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComposeChain]
  }
}

