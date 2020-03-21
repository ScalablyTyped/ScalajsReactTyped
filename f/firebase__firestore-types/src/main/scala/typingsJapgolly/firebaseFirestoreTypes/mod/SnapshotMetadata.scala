package typingsJapgolly.firebaseFirestoreTypes.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotMetadata extends js.Object {
  val fromCache: Boolean
  val hasPendingWrites: Boolean
  def isEqual(other: SnapshotMetadata): Boolean
}

object SnapshotMetadata {
  @scala.inline
  def apply(fromCache: Boolean, hasPendingWrites: Boolean, isEqual: SnapshotMetadata => CallbackTo[Boolean]): SnapshotMetadata = {
    val __obj = js.Dynamic.literal(fromCache = fromCache.asInstanceOf[js.Any], hasPendingWrites = hasPendingWrites.asInstanceOf[js.Any])
    __obj.updateDynamic("isEqual")(js.Any.fromFunction1((t0: typingsJapgolly.firebaseFirestoreTypes.mod.SnapshotMetadata) => isEqual(t0).runNow()))
    __obj.asInstanceOf[SnapshotMetadata]
  }
}

