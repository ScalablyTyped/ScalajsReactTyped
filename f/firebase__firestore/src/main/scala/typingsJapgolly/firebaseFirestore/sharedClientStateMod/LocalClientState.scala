package typingsJapgolly.firebaseFirestore.sharedClientStateMod

import typingsJapgolly.firebaseFirestore.collectionsMod.TargetIdSet_
import typingsJapgolly.firebaseFirestore.sortedSetMod.SortedSet
import typingsJapgolly.firebaseFirestore.typesMod.TargetId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/local/shared_client_state", "LocalClientState")
@js.native
class LocalClientState () extends ClientState {
  /* CompleteClass */
  override val activeTargetIds: TargetIdSet_ = js.native
  @JSName("activeTargetIds")
  var activeTargetIds_LocalClientState: SortedSet[Double] = js.native
  def addQueryTarget(targetId: TargetId): Unit = js.native
  def removeQueryTarget(targetId: TargetId): Unit = js.native
  /**
    * Converts this entry into a JSON-encoded format we can use for WebStorage.
    * Does not encode `clientId` as it is part of the key in WebStorage.
    */
  def toWebStorageJSON(): String = js.native
}

