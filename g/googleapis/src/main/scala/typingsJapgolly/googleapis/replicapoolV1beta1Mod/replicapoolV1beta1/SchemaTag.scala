package typingsJapgolly.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Compute Engine Instance tag, identical to the tags on the corresponding
  * Compute Engine Instance resource.
  */
@js.native
trait SchemaTag extends js.Object {
  /**
    * The fingerprint of the tag. Required for updating the list of tags.
    */
  var fingerPrint: js.UndefOr[String] = js.native
  /**
    * Items contained in this tag.
    */
  var items: js.UndefOr[js.Array[String]] = js.native
}

object SchemaTag {
  @scala.inline
  def apply(fingerPrint: String = null, items: js.Array[String] = null): SchemaTag = {
    val __obj = js.Dynamic.literal()
    if (fingerPrint != null) __obj.updateDynamic("fingerPrint")(fingerPrint.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTag]
  }
}

