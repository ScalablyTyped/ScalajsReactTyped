package typingsJapgolly.firebaseFirestore.remotePersistentStreamMod

import typingsJapgolly.firebaseFirestore.coreSnapshotVersionMod.SnapshotVersion
import typingsJapgolly.firebaseFirestore.remoteWatchChangeMod.WatchChange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WatchStreamListener extends PersistentStreamListener {
  /**
    * Called on a watchChange. The snapshot parameter will be MIN if the watch
    * change did not have a snapshot associated with it.
    */
  def onWatchChange(watchChange: WatchChange, snapshot: SnapshotVersion): js.Promise[Unit] = js.native
}

