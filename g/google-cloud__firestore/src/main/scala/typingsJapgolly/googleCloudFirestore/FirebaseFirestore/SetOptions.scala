package typingsJapgolly.googleCloudFirestore.FirebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetOptions extends js.Object {
  /**
    * Changes the behavior of a set() call to only replace the values specified
    * in its data argument. Fields omitted from the set() call remain
    * untouched.
    */
  val merge: js.UndefOr[Boolean] = js.undefined
  /**
    * Changes the behavior of set() calls to only replace the specified field
    * paths. Any field path that is not specified is ignored and remains
    * untouched.
    *
    * It is an error to pass a SetOptions object to a set() call that is
    * missing a value for any of the fields specified here.
    */
  val mergeFields: js.UndefOr[js.Array[String | FieldPath]] = js.undefined
}

object SetOptions {
  @scala.inline
  def apply(merge: js.UndefOr[Boolean] = js.undefined, mergeFields: js.Array[String | FieldPath] = null): SetOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(merge)) __obj.updateDynamic("merge")(merge.asInstanceOf[js.Any])
    if (mergeFields != null) __obj.updateDynamic("mergeFields")(mergeFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetOptions]
  }
}

