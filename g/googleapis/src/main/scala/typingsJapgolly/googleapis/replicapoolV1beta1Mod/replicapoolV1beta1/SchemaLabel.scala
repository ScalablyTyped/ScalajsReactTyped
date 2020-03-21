package typingsJapgolly.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A label to apply to this replica pool.
  */
@js.native
trait SchemaLabel extends js.Object {
  /**
    * The key for this label.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * The value of this label.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaLabel {
  @scala.inline
  def apply(key: String = null, value: String = null): SchemaLabel = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLabel]
  }
}

