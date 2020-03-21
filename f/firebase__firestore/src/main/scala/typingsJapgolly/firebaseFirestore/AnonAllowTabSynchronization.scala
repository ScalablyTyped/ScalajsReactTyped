package typingsJapgolly.firebaseFirestore

import typingsJapgolly.firebaseFirestore.asyncQueueMod.AsyncQueue
import typingsJapgolly.firebaseFirestore.listenSequenceMod.SequenceNumberSyncer
import typingsJapgolly.firebaseFirestore.lruGarbageCollectorMod.LruParams
import typingsJapgolly.firebaseFirestore.platformMod.Platform
import typingsJapgolly.firebaseFirestore.serializerMod.JsonProtoSerializer
import typingsJapgolly.firebaseFirestore.sharedClientStateMod.ClientId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllowTabSynchronization extends js.Object {
  var allowTabSynchronization: Boolean
  var clientId: ClientId
  var lruParams: LruParams
  var persistenceKey: String
  var platform: Platform
  var queue: AsyncQueue
  var sequenceNumberSyncer: SequenceNumberSyncer
  var serializer: JsonProtoSerializer
}

object AnonAllowTabSynchronization {
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
  ): AnonAllowTabSynchronization = {
    val __obj = js.Dynamic.literal(allowTabSynchronization = allowTabSynchronization.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], lruParams = lruParams.asInstanceOf[js.Any], persistenceKey = persistenceKey.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], sequenceNumberSyncer = sequenceNumberSyncer.asInstanceOf[js.Any], serializer = serializer.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAllowTabSynchronization]
  }
}

