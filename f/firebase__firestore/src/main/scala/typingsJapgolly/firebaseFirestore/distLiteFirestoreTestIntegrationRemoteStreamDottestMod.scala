package typingsJapgolly.firebaseFirestore

import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcApiCredentialsMod.EmptyAuthCredentialsProvider
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcCoreSnapshotVersionMod.SnapshotVersion
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcRemotePersistentStreamMod.PersistentListenStream
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcRemotePersistentStreamMod.PersistentWriteStream
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcRemotePersistentStreamMod.WatchStreamListener
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcRemotePersistentStreamMod.WriteStreamListener
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcRemoteWatchChangeMod.DocumentWatchChange
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcRemoteWatchChangeMod.ExistenceFilterChange
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcRemoteWatchChangeMod.WatchTargetChange
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcUtilAsyncQueueImplMod.AsyncQueueImpl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLiteFirestoreTestIntegrationRemoteStreamDottestMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/test/integration/remote/stream.test", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def withTestWatchStream(
    fn: js.Function2[
      /* watchStream */ PersistentListenStream, 
      /* streamListener */ StreamStatusListener, 
      js.Promise[Unit]
    ]
  ): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("withTestWatchStream")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def withTestWriteStream(
    fn: js.Function3[
      /* writeStream */ PersistentWriteStream, 
      /* streamListener */ StreamStatusListener, 
      /* queue */ AsyncQueueImpl, 
      js.Promise[Unit]
    ]
  ): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("withTestWriteStream")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def withTestWriteStream(
    fn: js.Function3[
      /* writeStream */ PersistentWriteStream, 
      /* streamListener */ StreamStatusListener, 
      /* queue */ AsyncQueueImpl, 
      js.Promise[Unit]
    ],
    credentialsProvider: EmptyAuthCredentialsProvider
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("withTestWriteStream")(fn.asInstanceOf[js.Any], credentialsProvider.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * StreamEventType combines the events that can be observed by the
    * WatchStreamListener and WriteStreamListener.
    */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.handshakeComplete
    - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.mutationResult
    - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.watchChange
    - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.open
    - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.close
  */
  trait StreamEventType extends StObject
  object StreamEventType {
    
    inline def close: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.close = "close".asInstanceOf[typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.close]
    
    inline def handshakeComplete: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.handshakeComplete = "handshakeComplete".asInstanceOf[typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.handshakeComplete]
    
    inline def mutationResult: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.mutationResult = "mutationResult".asInstanceOf[typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.mutationResult]
    
    inline def open: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.open = "open".asInstanceOf[typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.open]
    
    inline def watchChange: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.watchChange = "watchChange".asInstanceOf[typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.watchChange]
  }
  
  @js.native
  trait StreamStatusListener
    extends StObject
       with WatchStreamListener
       with WriteStreamListener {
    
    /**
      * Returns a Promise that resolves when the next callback fires. Resolves the
      * returned Promise immediately if there is already an unprocessed callback.
      *
      * This method asserts that the observed callback type matches
      * `expectedCallback`.
      */
    def awaitCallback(expectedCallback: StreamEventType): js.Promise[Unit] = js.native
    
    def onWatchChange(watchChange: DocumentWatchChange, snapshot: SnapshotVersion): js.Promise[Unit] = js.native
    def onWatchChange(watchChange: ExistenceFilterChange, snapshot: SnapshotVersion): js.Promise[Unit] = js.native
    def onWatchChange(watchChange: WatchTargetChange, snapshot: SnapshotVersion): js.Promise[Unit] = js.native
    
    /* private */ var pendingCallbacks: Any = js.native
    
    /* private */ var pendingPromises: Any = js.native
    
    /* private */ var resolvePending: Any = js.native
    
    /**
      * Verifies that we did not encounter any unexpected callbacks.
      */
    def verifyNoPendingCallbacks(): Unit = js.native
  }
}
