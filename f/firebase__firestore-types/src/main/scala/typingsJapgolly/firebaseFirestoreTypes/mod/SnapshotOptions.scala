package typingsJapgolly.firebaseFirestoreTypes.mod

import typingsJapgolly.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.estimate
import typingsJapgolly.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.none
import typingsJapgolly.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.previous
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotOptions extends js.Object {
  val serverTimestamps: js.UndefOr[estimate | previous | none] = js.undefined
}

object SnapshotOptions {
  @scala.inline
  def apply(serverTimestamps: estimate | previous | none = null): SnapshotOptions = {
    val __obj = js.Dynamic.literal()
    if (serverTimestamps != null) __obj.updateDynamic("serverTimestamps")(serverTimestamps.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotOptions]
  }
}

