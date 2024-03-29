package typingsJapgolly.googleCloudFirestore.FirebaseFirestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QuerySnapshot[T] extends StObject {
  
  /**
    * Returns an array of the documents changes since the last snapshot. If
    * this is the first snapshot, all documents will be in the list as added
    * changes.
    */
  def docChanges(): js.Array[DocumentChange[T]] = js.native
  
  /** An array of all the documents in the QuerySnapshot. */
  val docs: js.Array[QueryDocumentSnapshot[T]] = js.native
  
  /** True if there are no documents in the QuerySnapshot. */
  val empty: Boolean = js.native
  
  /**
    * Enumerates all of the documents in the QuerySnapshot.
    *
    * @param callback A callback to be called with a `DocumentSnapshot` for
    * each document in the snapshot.
    * @param thisArg The `this` binding for the callback.
    */
  def forEach(callback: js.Function1[/* result */ QueryDocumentSnapshot[T], Unit]): Unit = js.native
  def forEach(callback: js.Function1[/* result */ QueryDocumentSnapshot[T], Unit], thisArg: Any): Unit = js.native
  
  /**
    * Returns true if the document data in this `QuerySnapshot` is equal to the
    * provided one.
    *
    * @param other The `QuerySnapshot` to compare against.
    * @return true if this `QuerySnapshot` is equal to the provided one.
    */
  def isEqual(other: QuerySnapshot[T]): Boolean = js.native
  
  /**
    * The query on which you called `get` or `onSnapshot` in order to get this
    * `QuerySnapshot`.
    */
  val query: Query[T] = js.native
  
  /** The time this query snapshot was obtained. */
  val readTime: Timestamp = js.native
  
  /** The number of documents in the QuerySnapshot. */
  val size: Double = js.native
}
