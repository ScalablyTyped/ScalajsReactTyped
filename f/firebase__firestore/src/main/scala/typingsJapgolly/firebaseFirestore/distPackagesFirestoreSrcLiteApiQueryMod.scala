package typingsJapgolly.firebaseFirestore

import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcCoreDatabaseInfoMod.DatabaseId
import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcCoreTargetMod.Bound
import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcCoreTargetMod.Direction
import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcCoreTargetMod.FieldFilter
import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcCoreTargetMod.Operator
import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcCoreTargetMod.OrderBy
import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.Query
import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLiteApiSnapshotMod.DocumentSnapshot
import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLiteApiUserDataReaderMod.UserDataReader
import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcModelDocumentMod.Document
import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcModelPathMod.FieldPath
import typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.in_
import typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.limitToLast_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPackagesFirestoreSrcLiteApiQueryMod {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/lite-api/query", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* note: abstract class */ @JSImport("@firebase/firestore/dist/packages/firestore/src/lite-api/query", "QueryConstraint")
  @js.native
  open class QueryConstraint () extends StObject {
    
    /**
      * Takes the provided {@link Query} and returns a copy of the {@link Query} with this
      * {@link QueryConstraint} applied.
      */
    def _apply[T](query: Query[T]): Query[T] = js.native
    
    /** The type of this query constraints */
    val `type`: QueryConstraintType = js.native
  }
  
  inline def endAt(fieldValues: Any*): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[QueryConstraint]
  inline def endAt(snapshot: DocumentSnapshot[Any]): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(snapshot.asInstanceOf[js.Any]).asInstanceOf[QueryConstraint]
  
  inline def endBefore(fieldValues: Any*): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[QueryConstraint]
  inline def endBefore(snapshot: DocumentSnapshot[Any]): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(snapshot.asInstanceOf[js.Any]).asInstanceOf[QueryConstraint]
  
  inline def limit(limit: Double): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("limit")(limit.asInstanceOf[js.Any]).asInstanceOf[QueryConstraint]
  
  inline def limitToLast(limit: Double): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("limitToLast")(limit.asInstanceOf[js.Any]).asInstanceOf[QueryConstraint]
  
  inline def newQueryBoundFromDocument(
    query: typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcCoreQueryMod.Query,
    databaseId: DatabaseId,
    methodName: String,
    doc: Null,
    inclusive: Boolean
  ): Bound = (^.asInstanceOf[js.Dynamic].applyDynamic("newQueryBoundFromDocument")(query.asInstanceOf[js.Any], databaseId.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], doc.asInstanceOf[js.Any], inclusive.asInstanceOf[js.Any])).asInstanceOf[Bound]
  inline def newQueryBoundFromDocument(
    query: typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcCoreQueryMod.Query,
    databaseId: DatabaseId,
    methodName: String,
    doc: Document,
    inclusive: Boolean
  ): Bound = (^.asInstanceOf[js.Dynamic].applyDynamic("newQueryBoundFromDocument")(query.asInstanceOf[js.Any], databaseId.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], doc.asInstanceOf[js.Any], inclusive.asInstanceOf[js.Any])).asInstanceOf[Bound]
  
  inline def newQueryBoundFromFields(
    query: typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcCoreQueryMod.Query,
    databaseId: DatabaseId,
    dataReader: UserDataReader,
    methodName: String,
    values: js.Array[Any],
    inclusive: Boolean
  ): Bound = (^.asInstanceOf[js.Dynamic].applyDynamic("newQueryBoundFromFields")(query.asInstanceOf[js.Any], databaseId.asInstanceOf[js.Any], dataReader.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], values.asInstanceOf[js.Any], inclusive.asInstanceOf[js.Any])).asInstanceOf[Bound]
  
  inline def newQueryFilter(
    query: typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcCoreQueryMod.Query,
    methodName: String,
    dataReader: UserDataReader,
    databaseId: DatabaseId,
    fieldPath: FieldPath,
    op: Operator,
    value: Any
  ): FieldFilter = (^.asInstanceOf[js.Dynamic].applyDynamic("newQueryFilter")(query.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], dataReader.asInstanceOf[js.Any], databaseId.asInstanceOf[js.Any], fieldPath.asInstanceOf[js.Any], op.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[FieldFilter]
  
  inline def newQueryOrderBy(
    query: typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcCoreQueryMod.Query,
    fieldPath: FieldPath,
    direction: Direction
  ): OrderBy = (^.asInstanceOf[js.Dynamic].applyDynamic("newQueryOrderBy")(query.asInstanceOf[js.Any], fieldPath.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[OrderBy]
  
  inline def orderBy(fieldPath: String): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any]).asInstanceOf[QueryConstraint]
  inline def orderBy(fieldPath: String, directionStr: OrderByDirection): QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any], directionStr.asInstanceOf[js.Any])).asInstanceOf[QueryConstraint]
  inline def orderBy(fieldPath: typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLiteApiFieldPathMod.FieldPath): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any]).asInstanceOf[QueryConstraint]
  inline def orderBy(
    fieldPath: typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLiteApiFieldPathMod.FieldPath,
    directionStr: OrderByDirection
  ): QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(fieldPath.asInstanceOf[js.Any], directionStr.asInstanceOf[js.Any])).asInstanceOf[QueryConstraint]
  
  inline def query[T](query: Query[T], queryConstraints: QueryConstraint*): Query[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("query")(scala.List(query.asInstanceOf[js.Any]).`++`(queryConstraints.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Query[T]]
  
  inline def startAfter(fieldValues: Any*): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[QueryConstraint]
  inline def startAfter(snapshot: DocumentSnapshot[Any]): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(snapshot.asInstanceOf[js.Any]).asInstanceOf[QueryConstraint]
  
  inline def startAt(fieldValues: Any*): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(fieldValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[QueryConstraint]
  inline def startAt(snapshot: DocumentSnapshot[Any]): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(snapshot.asInstanceOf[js.Any]).asInstanceOf[QueryConstraint]
  
  inline def validateHasExplicitOrderByForLimitToLast(query: typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcCoreQueryMod.Query): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateHasExplicitOrderByForLimitToLast")(query.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def where(fieldPath: String, opStr: WhereFilterOp, value: Any): QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(fieldPath.asInstanceOf[js.Any], opStr.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[QueryConstraint]
  inline def where(
    fieldPath: typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLiteApiFieldPathMod.FieldPath,
    opStr: WhereFilterOp,
    value: Any
  ): QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(fieldPath.asInstanceOf[js.Any], opStr.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[QueryConstraint]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.desc
    - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.asc
  */
  trait OrderByDirection extends StObject
  object OrderByDirection {
    
    inline def asc: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.asc = "asc".asInstanceOf[typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.asc]
    
    inline def desc: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.desc = "desc".asInstanceOf[typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.desc]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.where
    - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.orderBy
    - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.limit
    - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.limitToLast_
    - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.startAt
    - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.startAfter
    - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.endAt
    - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.endBefore
  */
  trait QueryConstraintType extends StObject
  object QueryConstraintType {
    
    inline def endAt: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.endAt = "endAt".asInstanceOf[typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.endAt]
    
    inline def endBefore: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.endBefore = "endBefore".asInstanceOf[typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.endBefore]
    
    inline def limit: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.limit = "limit".asInstanceOf[typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.limit]
    
    inline def limitToLast: limitToLast_ = "limitToLast".asInstanceOf[limitToLast_]
    
    inline def orderBy: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.orderBy = "orderBy".asInstanceOf[typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.orderBy]
    
    inline def startAfter: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.startAfter = "startAfter".asInstanceOf[typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.startAfter]
    
    inline def startAt: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.startAt = "startAt".asInstanceOf[typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.startAt]
    
    inline def where: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.where = "where".asInstanceOf[typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.where]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.Lessthansign
    - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.LessthansignEqualssign
    - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.EqualssignEqualssign
    - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.ExclamationmarkEqualssign
    - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.GreaterthansignEqualssign
    - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.Greaterthansign
    - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.`array-contains`
    - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.in_
    - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.`array-contains-any`
    - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.`not-in`
  */
  trait WhereFilterOp extends StObject
  object WhereFilterOp {
    
    inline def EqualssignEqualssign: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.EqualssignEqualssign = "==".asInstanceOf[typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.EqualssignEqualssign]
    
    inline def ExclamationmarkEqualssign: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.ExclamationmarkEqualssign = "!=".asInstanceOf[typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.ExclamationmarkEqualssign]
    
    inline def Greaterthansign: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.Greaterthansign = ">".asInstanceOf[typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.Greaterthansign]
    
    inline def GreaterthansignEqualssign: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.GreaterthansignEqualssign = ">=".asInstanceOf[typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.GreaterthansignEqualssign]
    
    inline def Lessthansign: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.Lessthansign = "<".asInstanceOf[typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.Lessthansign]
    
    inline def LessthansignEqualssign: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.LessthansignEqualssign = "<=".asInstanceOf[typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.LessthansignEqualssign]
    
    inline def `array-contains`: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.`array-contains` = "array-contains".asInstanceOf[typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.`array-contains`]
    
    inline def `array-contains-any`: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.`array-contains-any` = "array-contains-any".asInstanceOf[typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.`array-contains-any`]
    
    inline def in: in_ = "in".asInstanceOf[in_]
    
    inline def `not-in`: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.`not-in` = "not-in".asInstanceOf[typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.`not-in`]
  }
}
