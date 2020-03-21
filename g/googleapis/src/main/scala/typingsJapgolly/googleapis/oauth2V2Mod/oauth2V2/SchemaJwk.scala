package typingsJapgolly.googleapis.oauth2V2Mod.oauth2V2

import typingsJapgolly.googleapis.AnonAlg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaJwk extends js.Object {
  var keys: js.UndefOr[js.Array[AnonAlg]] = js.native
}

object SchemaJwk {
  @scala.inline
  def apply(keys: js.Array[AnonAlg] = null): SchemaJwk = {
    val __obj = js.Dynamic.literal()
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaJwk]
  }
}

