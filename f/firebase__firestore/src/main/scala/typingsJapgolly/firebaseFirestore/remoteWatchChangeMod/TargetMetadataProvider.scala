package typingsJapgolly.firebaseFirestore.remoteWatchChangeMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.firebaseFirestore.coreTypesMod.TargetId
import typingsJapgolly.firebaseFirestore.localTargetDataMod.TargetData
import typingsJapgolly.firebaseFirestore.modelCollectionsMod.DocumentKeySet_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetMetadataProvider extends js.Object {
  /**
    * Returns the set of remote document keys for the given target ID as of the
    * last raised snapshot.
    */
  def getRemoteKeysForTarget(targetId: TargetId): DocumentKeySet_
  /**
    * Returns the TargetData for an active target ID or 'null' if this target
    * has become inactive
    */
  def getTargetDataForTarget(targetId: TargetId): TargetData | Null
}

object TargetMetadataProvider {
  @scala.inline
  def apply(
    getRemoteKeysForTarget: TargetId => CallbackTo[DocumentKeySet_],
    getTargetDataForTarget: TargetId => CallbackTo[TargetData | Null]
  ): TargetMetadataProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getRemoteKeysForTarget")(js.Any.fromFunction1((t0: typingsJapgolly.firebaseFirestore.coreTypesMod.TargetId) => getRemoteKeysForTarget(t0).runNow()))
    __obj.updateDynamic("getTargetDataForTarget")(js.Any.fromFunction1((t0: typingsJapgolly.firebaseFirestore.coreTypesMod.TargetId) => getTargetDataForTarget(t0).runNow()))
    __obj.asInstanceOf[TargetMetadataProvider]
  }
}

