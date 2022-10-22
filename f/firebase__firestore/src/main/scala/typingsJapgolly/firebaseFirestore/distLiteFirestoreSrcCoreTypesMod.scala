package typingsJapgolly.firebaseFirestore

import typingsJapgolly.firebaseFirestore.firebaseFirestoreInts.`0`
import typingsJapgolly.firebaseFirestore.firebaseFirestoreInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLiteFirestoreSrcCoreTypesMod {
  
  type BatchId = Double
  
  type ListenSequenceNumber = Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.pending
    - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.acknowledged
    - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.rejected
  */
  trait MutationBatchState extends StObject
  object MutationBatchState {
    
    inline def acknowledged: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.acknowledged = "acknowledged".asInstanceOf[typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.acknowledged]
    
    inline def pending: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.pending = "pending".asInstanceOf[typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.pending]
    
    inline def rejected: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.rejected = "rejected".asInstanceOf[typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.rejected]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.Unknown
    - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.Online
    - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.Offline
  */
  trait OnlineState extends StObject
  object OnlineState {
    
    /**
      * The client is either trying to establish a connection but failing, or it
      * has been explicitly marked offline via a call to disableNetwork().
      * Higher-level components should operate in offline mode.
      */
    inline def Offline: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.Offline = "Offline".asInstanceOf[typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.Offline]
    
    /**
      * The client is connected and the connections are healthy. This state is
      * reached after a successful connection and there has been at least one
      * successful message received from the backends.
      */
    inline def Online: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.Online = "Online".asInstanceOf[typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.Online]
    
    /**
      * The Firestore client is in an unknown online state. This means the client
      * is either not actively trying to establish a connection or it is currently
      * trying to establish a connection, but it has not succeeded or failed yet.
      * Higher-level components should not operate in offline mode.
      */
    inline def Unknown: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.Unknown = "Unknown".asInstanceOf[typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.Unknown]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firebaseFirestore.firebaseFirestoreInts.`0`
    - typingsJapgolly.firebaseFirestore.firebaseFirestoreInts.`1`
  */
  trait OnlineStateSource extends StObject
  object OnlineStateSource {
    
    inline def RemoteStore: `0` = 0.asInstanceOf[`0`]
    
    inline def SharedClientState: `1` = 1.asInstanceOf[`1`]
  }
  
  type TargetId = Double
}
