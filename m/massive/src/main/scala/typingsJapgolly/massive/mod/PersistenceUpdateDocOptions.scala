package typingsJapgolly.massive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PersistenceUpdateDocOptions extends js.Object {
  var body: js.UndefOr[String] = js.undefined
}

object PersistenceUpdateDocOptions {
  @scala.inline
  def apply(body: String = null): PersistenceUpdateDocOptions = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersistenceUpdateDocOptions]
  }
}

