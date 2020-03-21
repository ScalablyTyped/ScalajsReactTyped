package typingsJapgolly.firebaseFirestore.apiDatabaseMod

import typingsJapgolly.firebaseFirestore.apiFieldPathMod.FieldPath
import typingsJapgolly.firebaseFirestore.apiObserverMod.PartialObserver
import typingsJapgolly.firebaseFirestore.apiObserverMod.Unsubscribe
import typingsJapgolly.firebaseFirestoreTypes.mod.FirestoreDataConverter
import typingsJapgolly.firebaseFirestoreTypes.mod.OrderByDirection
import typingsJapgolly.firebaseFirestoreTypes.mod.SnapshotListenOptions
import typingsJapgolly.firebaseFirestoreTypes.mod.WhereFilterOp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/api/database", "Query")
@js.native
class Query[T] protected ()
  extends typingsJapgolly.firebaseFirestoreTypes.mod.Query[T] {
  def this(_query: typingsJapgolly.firebaseFirestore.coreQueryMod.Query, firestore: Firestore) = this()
  def this(
    _query: typingsJapgolly.firebaseFirestore.coreQueryMod.Query,
    firestore: Firestore,
    _converter: FirestoreDataConverter[T]
  ) = this()
  val _converter: js.UndefOr[FirestoreDataConverter[T]] = js.native
  var _query: typingsJapgolly.firebaseFirestore.coreQueryMod.Query = js.native
  /** Helper function to create a bound from a document or fields */
  var boundFromDocOrFields: js.Any = js.native
  /**
    * Create a Bound from a query and a document.
    *
    * Note that the Bound will always include the key of the document
    * and so only the provided document will compare equal to the returned
    * position.
    *
    * Will throw if the document does not contain all fields of the order by
    * of the query or if any of the fields in the order by are an uncommitted
    * server timestamp.
    */
  var boundFromDocument: js.Any = js.native
  /**
    * Converts a list of field values to a Bound for the given query.
    */
  var boundFromFields: js.Any = js.native
  var getViaSnapshotListener: js.Any = js.native
  var onSnapshotInternal: js.Any = js.native
  /**
    * Parses the given documentIdValue into a ReferenceValue, throwing
    * appropriate errors if the value is anything other than a DocumentReference
    * or String, or if the string is malformed.
    */
  var parseDocumentIdValue: js.Any = js.native
  /**
    * Validates that the value passed into a disjunctrive filter satisfies all
    * array requirements.
    */
  var validateDisjunctiveFilterElements: js.Any = js.native
  var validateHasExplicitOrderByForLimitToLast: js.Any = js.native
  var validateNewFilter: js.Any = js.native
  var validateNewOrderBy: js.Any = js.native
  var validateOrderByAndInequalityMatch: js.Any = js.native
  def endAt(docOrField: js.Any, fields: js.Any*): typingsJapgolly.firebaseFirestoreTypes.mod.Query[T] = js.native
  def endAt(docOrField: typingsJapgolly.firebaseFirestoreTypes.mod.DocumentSnapshot[_], fields: js.Any*): typingsJapgolly.firebaseFirestoreTypes.mod.Query[T] = js.native
  def endBefore(docOrField: js.Any, fields: js.Any*): typingsJapgolly.firebaseFirestoreTypes.mod.Query[T] = js.native
  def endBefore(docOrField: typingsJapgolly.firebaseFirestoreTypes.mod.DocumentSnapshot[_], fields: js.Any*): typingsJapgolly.firebaseFirestoreTypes.mod.Query[T] = js.native
  def onSnapshot(observer: PartialObserver[typingsJapgolly.firebaseFirestoreTypes.mod.QuerySnapshot[T]]): Unsubscribe = js.native
  def onSnapshot(
    options: SnapshotListenOptions,
    observer: PartialObserver[typingsJapgolly.firebaseFirestoreTypes.mod.QuerySnapshot[T]]
  ): Unsubscribe = js.native
  def orderBy(field: FieldPath): typingsJapgolly.firebaseFirestoreTypes.mod.Query[T] = js.native
  def orderBy(field: FieldPath, directionStr: OrderByDirection): typingsJapgolly.firebaseFirestoreTypes.mod.Query[T] = js.native
  def startAfter(docOrField: js.Any, fields: js.Any*): typingsJapgolly.firebaseFirestoreTypes.mod.Query[T] = js.native
  def startAfter(docOrField: typingsJapgolly.firebaseFirestoreTypes.mod.DocumentSnapshot[_], fields: js.Any*): typingsJapgolly.firebaseFirestoreTypes.mod.Query[T] = js.native
  def startAt(docOrField: js.Any, fields: js.Any*): typingsJapgolly.firebaseFirestoreTypes.mod.Query[T] = js.native
  def startAt(docOrField: typingsJapgolly.firebaseFirestoreTypes.mod.DocumentSnapshot[_], fields: js.Any*): typingsJapgolly.firebaseFirestoreTypes.mod.Query[T] = js.native
  def where(field: FieldPath, opStr: WhereFilterOp, value: js.Any): typingsJapgolly.firebaseFirestoreTypes.mod.Query[T] = js.native
}

