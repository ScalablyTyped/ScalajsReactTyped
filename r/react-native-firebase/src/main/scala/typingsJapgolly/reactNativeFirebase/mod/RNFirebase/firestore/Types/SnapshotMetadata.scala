package typingsJapgolly.reactNativeFirebase.mod.RNFirebase.firestore.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotMetadata extends js.Object {
  var fromCache: Boolean
  var hasPendingWrites: Boolean
}

object SnapshotMetadata {
  @scala.inline
  def apply(fromCache: Boolean, hasPendingWrites: Boolean): SnapshotMetadata = {
    val __obj = js.Dynamic.literal(fromCache = fromCache.asInstanceOf[js.Any], hasPendingWrites = hasPendingWrites.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SnapshotMetadata]
  }
}

