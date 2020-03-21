package typingsJapgolly.firebaseFirestore

import typingsJapgolly.firebaseFirestore.coreListenSequenceMod.SequenceNumberSyncer
import typingsJapgolly.firebaseFirestore.localLruGarbageCollectorMod.LruParams
import typingsJapgolly.firebaseFirestore.localSharedClientStateMod.ClientId
import typingsJapgolly.firebaseFirestore.platformPlatformMod.Platform
import typingsJapgolly.firebaseFirestore.remoteSerializerMod.JsonProtoSerializer
import typingsJapgolly.firebaseFirestore.utilAsyncQueueMod.AsyncQueue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClientId extends js.Object {
  var allowTabSynchronization: Boolean
  var clientId: ClientId
  var lruParams: LruParams
  var persistenceKey: String
  var platform: Platform
  var queue: AsyncQueue
  var sequenceNumberSyncer: SequenceNumberSyncer
  var serializer: JsonProtoSerializer
}

object AnonClientId {
  @scala.inline
  def apply(
    allowTabSynchronization: Boolean,
    clientId: ClientId,
    lruParams: LruParams,
    persistenceKey: String,
    platform: Platform,
    queue: AsyncQueue,
    sequenceNumberSyncer: SequenceNumberSyncer,
    serializer: JsonProtoSerializer
  ): AnonClientId = {
    val __obj = js.Dynamic.literal(allowTabSynchronization = allowTabSynchronization.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], lruParams = lruParams.asInstanceOf[js.Any], persistenceKey = persistenceKey.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], sequenceNumberSyncer = sequenceNumberSyncer.asInstanceOf[js.Any], serializer = serializer.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonClientId]
  }
}

