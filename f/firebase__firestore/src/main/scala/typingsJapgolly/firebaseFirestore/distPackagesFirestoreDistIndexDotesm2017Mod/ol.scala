package typingsJapgolly.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A `QuerySnapshot` contains zero or more `DocumentSnapshot` objects
  * representing the results of a query. The documents can be accessed as an
  * array via the `docs` property or enumerated using the `forEach` method. The
  * number of documents can be determined via the `empty` and `size`
  * properties.
  */ @js.native
trait ol extends StObject {
  
  var _cachedChanges: Any = js.native
  
  var _cachedChangesIncludeMetadataChanges: Any = js.native
  
  var _firestore: Any = js.native
  
  var _snapshot: Any = js.native
  
  var _userDataWriter: Any = js.native
  
  /**
    * Returns an array of the documents changes since the last snapshot. If this
    * is the first snapshot, all documents will be in the list as 'added'
    * changes.
    *
    * @param options - `SnapshotListenOptions` that control whether metadata-only
    * changes (i.e. only `DocumentSnapshot.metadata` changed) should trigger
    * snapshot events.
    */ def docChanges(): Any = js.native
  def docChanges(t: js.Object): Any = js.native
  
  /** An array of all the documents in the `QuerySnapshot`. */ def docs: js.Array[Any] = js.native
  
  /** True if there are no documents in the `QuerySnapshot`. */ def empty: Boolean = js.native
  
  /**
    * Enumerates all of the documents in the `QuerySnapshot`.
    *
    * @param callback - A callback to be called with a `QueryDocumentSnapshot` for
    * each document in the snapshot.
    * @param thisArg - The `this` binding for the callback.
    */ def forEach(t: Any, e: Any): Unit = js.native
  
  var metadata: sl = js.native
  
  var query: Any = js.native
  
  /** The number of documents in the `QuerySnapshot`. */ def size: Any = js.native
}
