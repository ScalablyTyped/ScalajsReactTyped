package typingsJapgolly.firebaseFirestore

import typingsJapgolly.firebaseFirestore.distFirestoreSrcCoreQueryMod.LimitType
import typingsJapgolly.firebaseFirestore.distFirestoreSrcCoreTypesMod.MutationBatchState
import typingsJapgolly.firebaseFirestore.distFirestoreSrcCoreTypesMod.OnlineState
import typingsJapgolly.firebaseFirestore.distFirestoreSrcUtilInputValidationMod.ValidationType
import typingsJapgolly.firebaseFirestore.distInternalMod.LimitType2
import typingsJapgolly.firebaseFirestore.distInternalMod.QueryTargetState
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcCoreTargetMod.Operator
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcLocalPersistenceTransactionMod.PersistenceTransactionMode
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcLocalSimpleDbMod.SimpleDbTransactionMode
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcUtilErrorMod.FirestoreErrorCode
import typingsJapgolly.firebaseFirestore.distLiteFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
import typingsJapgolly.firebaseFirestore.distLiteFirestoreTestUnitSpecsSpecTestRunnerMod.SpecLimitType
import typingsJapgolly.firebaseFirestore.distLiteInternalMod.Direction
import typingsJapgolly.firebaseFirestore.distLiteInternalMod.ServerTimestampBehavior
import typingsJapgolly.firebaseFirestore.distLiteInternalMod.TokenType
import typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcProtosFirestoreProtoApiMod.CompositeFilterOp
import typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcProtosFirestoreProtoApiMod.FieldFilterOp
import typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcProtosFirestoreProtoApiMod.FieldTransformSetToServerValue
import typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcProtosFirestoreProtoApiMod.IndexFieldMode
import typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcProtosFirestoreProtoApiMod.IndexState
import typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcProtosFirestoreProtoApiMod.OrderDirection
import typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcProtosFirestoreProtoApiMod.ProjectsDatabasesDocumentsApiClientAlt
import typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcProtosFirestoreProtoApiMod.ProjectsDatabasesDocumentsApiClientXgafv
import typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcProtosFirestoreProtoApiMod.ProjectsDatabasesIndexesApiClientAlt
import typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcProtosFirestoreProtoApiMod.ProjectsDatabasesIndexesApiClientXgafv
import typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcProtosFirestoreProtoApiMod.TargetChangeTargetChangeType
import typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcProtosFirestoreProtoApiMod.UnaryFilterOp
import typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcUtilAsyncQueueMod.TimerId
import typingsJapgolly.firebaseFirestore.distPackagesFirestoreTestIntegrationRemoteStreamDottestMod.StreamEventType
import typingsJapgolly.firebaseFirestore.mod.DocumentChangeType
import typingsJapgolly.firebaseFirestore.mod.OrderByDirection
import typingsJapgolly.firebaseFirestore.mod.QueryConstraintType
import typingsJapgolly.firebaseFirestore.mod.TaskState
import typingsJapgolly.firebaseFirestore.mod.WhereFilterOp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firebaseFirestoreStrings {
  
  @js.native
  sealed trait `1`
    extends StObject
       with ProjectsDatabasesDocumentsApiClientXgafv
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.ProjectsDatabasesDocumentsApiClientXgafv
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.ProjectsDatabasesDocumentsApiClientXgafv
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.ProjectsDatabasesDocumentsApiClientXgafv
       with ProjectsDatabasesIndexesApiClientXgafv
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.ProjectsDatabasesIndexesApiClientXgafv
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.ProjectsDatabasesIndexesApiClientXgafv
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.ProjectsDatabasesIndexesApiClientXgafv
  inline def `1`: `1` = "1".asInstanceOf[`1`]
  
  @js.native
  sealed trait `2`
    extends StObject
       with ProjectsDatabasesDocumentsApiClientXgafv
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.ProjectsDatabasesDocumentsApiClientXgafv
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.ProjectsDatabasesDocumentsApiClientXgafv
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.ProjectsDatabasesDocumentsApiClientXgafv
       with ProjectsDatabasesIndexesApiClientXgafv
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.ProjectsDatabasesIndexesApiClientXgafv
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.ProjectsDatabasesIndexesApiClientXgafv
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.ProjectsDatabasesIndexesApiClientXgafv
  inline def `2`: `2` = "2".asInstanceOf[`2`]
  
  @js.native
  sealed trait ADD
    extends StObject
       with TargetChangeTargetChangeType
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.TargetChangeTargetChangeType
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.TargetChangeTargetChangeType
       with typingsJapgolly.firebaseFirestore.distInternalMod.TargetChangeTargetChangeType
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.TargetChangeTargetChangeType
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.TargetChangeTargetChangeType
       with typingsJapgolly.firebaseFirestore.distPrivateMod.TargetChangeTargetChangeType
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.TargetChangeTargetChangeType
  inline def ADD: ADD = "ADD".asInstanceOf[ADD]
  
  @js.native
  sealed trait AND
    extends StObject
       with CompositeFilterOp
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.CompositeFilterOp
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.CompositeFilterOp
       with typingsJapgolly.firebaseFirestore.distInternalMod.CompositeFilterOp
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.CompositeFilterOp
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.CompositeFilterOp
       with typingsJapgolly.firebaseFirestore.distPrivateMod.CompositeFilterOp
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.CompositeFilterOp
  inline def AND: AND = "AND".asInstanceOf[AND]
  
  @js.native
  sealed trait ARRAY_CONTAINS
    extends StObject
       with FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distInternalMod.FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distPrivateMod.FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.FieldFilterOp
  inline def ARRAY_CONTAINS: ARRAY_CONTAINS = "ARRAY_CONTAINS".asInstanceOf[ARRAY_CONTAINS]
  
  @js.native
  sealed trait ARRAY_CONTAINS_ANY
    extends StObject
       with FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distInternalMod.FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distPrivateMod.FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.FieldFilterOp
  inline def ARRAY_CONTAINS_ANY: ARRAY_CONTAINS_ANY = "ARRAY_CONTAINS_ANY".asInstanceOf[ARRAY_CONTAINS_ANY]
  
  @js.native
  sealed trait ASCENDING
    extends StObject
       with IndexFieldMode
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.IndexFieldMode
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.IndexFieldMode
       with typingsJapgolly.firebaseFirestore.distInternalMod.IndexFieldMode
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.IndexFieldMode
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.IndexFieldMode
       with typingsJapgolly.firebaseFirestore.distPrivateMod.IndexFieldMode
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.IndexFieldMode
       with OrderDirection
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.OrderDirection
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.OrderDirection
       with typingsJapgolly.firebaseFirestore.distInternalMod.OrderDirection
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.OrderDirection
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.OrderDirection
       with typingsJapgolly.firebaseFirestore.distPrivateMod.OrderDirection
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.OrderDirection
  inline def ASCENDING: ASCENDING = "ASCENDING".asInstanceOf[ASCENDING]
  
  @js.native
  sealed trait `Acknowledge batch`
    extends StObject
       with PersistenceAction
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typingsJapgolly.firebaseFirestore.distFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
  inline def `Acknowledge batch`: `Acknowledge batch` = ("Acknowledge batch").asInstanceOf[`Acknowledge batch`]
  
  @js.native
  sealed trait `Allocate target`
    extends StObject
       with PersistenceAction
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typingsJapgolly.firebaseFirestore.distFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
  inline def `Allocate target`: `Allocate target` = ("Allocate target").asInstanceOf[`Allocate target`]
  
  @js.native
  sealed trait AppCheck
    extends StObject
       with TokenType
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcApiCredentialsMod.TokenType
       with typingsJapgolly.firebaseFirestore.distInternalMod.TokenType
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.TokenType
       with typingsJapgolly.firebaseFirestore.distPrivateMod.TokenType
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcApiCredentialsMod.TokenType
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcApiCredentialsMod.TokenType
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcApiCredentialsMod.TokenType
  inline def AppCheck: AppCheck = "AppCheck".asInstanceOf[AppCheck]
  
  @js.native
  sealed trait `Apply remote event`
    extends StObject
       with PersistenceAction
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typingsJapgolly.firebaseFirestore.distFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
  inline def `Apply remote event`: `Apply remote event` = ("Apply remote event").asInstanceOf[`Apply remote event`]
  
  @js.native
  sealed trait CONTAINS extends StObject
  inline def CONTAINS: CONTAINS = "CONTAINS".asInstanceOf[CONTAINS]
  
  @js.native
  sealed trait CREATING
    extends StObject
       with IndexState
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.IndexState
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.IndexState
       with typingsJapgolly.firebaseFirestore.distInternalMod.IndexState
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.IndexState
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.IndexState
       with typingsJapgolly.firebaseFirestore.distPrivateMod.IndexState
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.IndexState
  inline def CREATING: CREATING = "CREATING".asInstanceOf[CREATING]
  
  @js.native
  sealed trait CURRENT
    extends StObject
       with TargetChangeTargetChangeType
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.TargetChangeTargetChangeType
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.TargetChangeTargetChangeType
       with typingsJapgolly.firebaseFirestore.distInternalMod.TargetChangeTargetChangeType
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.TargetChangeTargetChangeType
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.TargetChangeTargetChangeType
       with typingsJapgolly.firebaseFirestore.distPrivateMod.TargetChangeTargetChangeType
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.TargetChangeTargetChangeType
  inline def CURRENT: CURRENT = "CURRENT".asInstanceOf[CURRENT]
  
  @js.native
  sealed trait `Collect garbage`
    extends StObject
       with PersistenceAction
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typingsJapgolly.firebaseFirestore.distFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
  inline def `Collect garbage`: `Collect garbage` = ("Collect garbage").asInstanceOf[`Collect garbage`]
  
  @js.native
  sealed trait DESCENDING
    extends StObject
       with IndexFieldMode
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.IndexFieldMode
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.IndexFieldMode
       with typingsJapgolly.firebaseFirestore.distInternalMod.IndexFieldMode
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.IndexFieldMode
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.IndexFieldMode
       with typingsJapgolly.firebaseFirestore.distPrivateMod.IndexFieldMode
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.IndexFieldMode
       with OrderDirection
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.OrderDirection
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.OrderDirection
       with typingsJapgolly.firebaseFirestore.distInternalMod.OrderDirection
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.OrderDirection
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.OrderDirection
       with typingsJapgolly.firebaseFirestore.distPrivateMod.OrderDirection
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.OrderDirection
  inline def DESCENDING: DESCENDING = "DESCENDING".asInstanceOf[DESCENDING]
  
  @js.native
  sealed trait DIRECTION_UNSPECIFIED
    extends StObject
       with OrderDirection
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.OrderDirection
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.OrderDirection
       with typingsJapgolly.firebaseFirestore.distInternalMod.OrderDirection
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.OrderDirection
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.OrderDirection
       with typingsJapgolly.firebaseFirestore.distPrivateMod.OrderDirection
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.OrderDirection
  inline def DIRECTION_UNSPECIFIED: DIRECTION_UNSPECIFIED = "DIRECTION_UNSPECIFIED".asInstanceOf[DIRECTION_UNSPECIFIED]
  
  @js.native
  sealed trait EQUAL
    extends StObject
       with FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distInternalMod.FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distPrivateMod.FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.FieldFilterOp
  inline def EQUAL: EQUAL = "EQUAL".asInstanceOf[EQUAL]
  
  @js.native
  sealed trait ERROR
    extends StObject
       with IndexState
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.IndexState
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.IndexState
       with typingsJapgolly.firebaseFirestore.distInternalMod.IndexState
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.IndexState
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.IndexState
       with typingsJapgolly.firebaseFirestore.distPrivateMod.IndexState
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.IndexState
  inline def ERROR: ERROR = "ERROR".asInstanceOf[ERROR]
  
  @js.native
  sealed trait EqualssignEqualssign
    extends StObject
       with Operator
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcCoreTargetMod.Operator
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcCoreTargetMod.Operator
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcCoreTargetMod.Operator
       with WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distInternalMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distLiteMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distPrivateMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.WhereFilterOp
  inline def EqualssignEqualssign: EqualssignEqualssign = "==".asInstanceOf[EqualssignEqualssign]
  
  @js.native
  sealed trait Error_
    extends StObject
       with TaskState
       with typingsJapgolly.firebaseFirestore.distInternalMod.TaskState
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcApiBundleMod.TaskState
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcApiBundleMod.TaskState
       with typingsJapgolly.firebaseFirestore.distPrivateMod.TaskState
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcApiBundleMod.TaskState
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcApiBundleMod.TaskState
  inline def Error_ : Error_ = "Error".asInstanceOf[Error_]
  
  @js.native
  sealed trait ExclamationmarkEqualssign
    extends StObject
       with Operator
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcCoreTargetMod.Operator
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcCoreTargetMod.Operator
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcCoreTargetMod.Operator
       with WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distInternalMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distLiteMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distPrivateMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.WhereFilterOp
  inline def ExclamationmarkEqualssign: ExclamationmarkEqualssign = "!=".asInstanceOf[ExclamationmarkEqualssign]
  
  @js.native
  sealed trait `Execute query`
    extends StObject
       with PersistenceAction
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typingsJapgolly.firebaseFirestore.distFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
  inline def `Execute query`: `Execute query` = ("Execute query").asInstanceOf[`Execute query`]
  
  @js.native
  sealed trait F
    extends StObject
       with LimitType
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.LimitType
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcCoreQueryMod.LimitType
       with typingsJapgolly.firebaseFirestore.distInternalMod.LimitType
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.LimitType
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcCoreQueryMod.LimitType
       with typingsJapgolly.firebaseFirestore.distPrivateMod.LimitType
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcCoreQueryMod.LimitType
  inline def F: F = "F".asInstanceOf[F]
  
  @js.native
  sealed trait FIRST
    extends StObject
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreBundleProtoMod.LimitType
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcProtosFirestoreBundleProtoMod.LimitType
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreBundleProtoMod.LimitType
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcProtosFirestoreBundleProtoMod.LimitType
       with LimitType2
       with typingsJapgolly.firebaseFirestore.distPrivateMod.LimitType2
  inline def FIRST: FIRST = "FIRST".asInstanceOf[FIRST]
  
  @js.native
  sealed trait FirstParty
    extends StObject
       with TokenType
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcApiCredentialsMod.TokenType
       with typingsJapgolly.firebaseFirestore.distInternalMod.TokenType
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.TokenType
       with typingsJapgolly.firebaseFirestore.distPrivateMod.TokenType
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcApiCredentialsMod.TokenType
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcApiCredentialsMod.TokenType
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcApiCredentialsMod.TokenType
  inline def FirstParty: FirstParty = "FirstParty".asInstanceOf[FirstParty]
  
  @js.native
  sealed trait GREATER_THAN
    extends StObject
       with FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distInternalMod.FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distPrivateMod.FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.FieldFilterOp
  inline def GREATER_THAN: GREATER_THAN = "GREATER_THAN".asInstanceOf[GREATER_THAN]
  
  @js.native
  sealed trait GREATER_THAN_OR_EQUAL
    extends StObject
       with FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distInternalMod.FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distPrivateMod.FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.FieldFilterOp
  inline def GREATER_THAN_OR_EQUAL: GREATER_THAN_OR_EQUAL = "GREATER_THAN_OR_EQUAL".asInstanceOf[GREATER_THAN_OR_EQUAL]
  
  @js.native
  sealed trait `Get highest unacknowledged batch id`
    extends StObject
       with PersistenceAction
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typingsJapgolly.firebaseFirestore.distFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
  inline def `Get highest unacknowledged batch id`: `Get highest unacknowledged batch id` = ("Get highest unacknowledged batch id").asInstanceOf[`Get highest unacknowledged batch id`]
  
  @js.native
  sealed trait `Get last remote snapshot version`
    extends StObject
       with PersistenceAction
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typingsJapgolly.firebaseFirestore.distFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
  inline def `Get last remote snapshot version`: `Get last remote snapshot version` = ("Get last remote snapshot version").asInstanceOf[`Get last remote snapshot version`]
  
  @js.native
  sealed trait `Get last stream token`
    extends StObject
       with PersistenceAction
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typingsJapgolly.firebaseFirestore.distFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
  inline def `Get last stream token`: `Get last stream token` = ("Get last stream token").asInstanceOf[`Get last stream token`]
  
  @js.native
  sealed trait `Get new document changes`
    extends StObject
       with PersistenceAction
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typingsJapgolly.firebaseFirestore.distFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
  inline def `Get new document changes`: `Get new document changes` = ("Get new document changes").asInstanceOf[`Get new document changes`]
  
  @js.native
  sealed trait `Get next mutation batch`
    extends StObject
       with PersistenceAction
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typingsJapgolly.firebaseFirestore.distFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
  inline def `Get next mutation batch`: `Get next mutation batch` = ("Get next mutation batch").asInstanceOf[`Get next mutation batch`]
  
  @js.native
  sealed trait `Get target data`
    extends StObject
       with PersistenceAction
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typingsJapgolly.firebaseFirestore.distFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
  inline def `Get target data`: `Get target data` = ("Get target data").asInstanceOf[`Get target data`]
  
  @js.native
  sealed trait Greaterthansign
    extends StObject
       with Operator
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcCoreTargetMod.Operator
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcCoreTargetMod.Operator
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcCoreTargetMod.Operator
       with WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distInternalMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distLiteMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distPrivateMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.WhereFilterOp
  inline def Greaterthansign: Greaterthansign = ">".asInstanceOf[Greaterthansign]
  
  @js.native
  sealed trait GreaterthansignEqualssign
    extends StObject
       with Operator
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcCoreTargetMod.Operator
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcCoreTargetMod.Operator
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcCoreTargetMod.Operator
       with WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distInternalMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distLiteMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distPrivateMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.WhereFilterOp
  inline def GreaterthansignEqualssign: GreaterthansignEqualssign = ">=".asInstanceOf[GreaterthansignEqualssign]
  
  @js.native
  sealed trait `Handle user change`
    extends StObject
       with PersistenceAction
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typingsJapgolly.firebaseFirestore.distFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
  inline def `Handle user change`: `Handle user change` = ("Handle user change").asInstanceOf[`Handle user change`]
  
  @js.native
  sealed trait IN
    extends StObject
       with FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distInternalMod.FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distPrivateMod.FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.FieldFilterOp
  inline def IN: IN = "IN".asInstanceOf[IN]
  
  @js.native
  sealed trait IS_NAN
    extends StObject
       with UnaryFilterOp
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.UnaryFilterOp
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.UnaryFilterOp
       with typingsJapgolly.firebaseFirestore.distInternalMod.UnaryFilterOp
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.UnaryFilterOp
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.UnaryFilterOp
       with typingsJapgolly.firebaseFirestore.distPrivateMod.UnaryFilterOp
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.UnaryFilterOp
  inline def IS_NAN: IS_NAN = "IS_NAN".asInstanceOf[IS_NAN]
  
  @js.native
  sealed trait IS_NOT_NAN
    extends StObject
       with UnaryFilterOp
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.UnaryFilterOp
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.UnaryFilterOp
       with typingsJapgolly.firebaseFirestore.distInternalMod.UnaryFilterOp
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.UnaryFilterOp
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.UnaryFilterOp
       with typingsJapgolly.firebaseFirestore.distPrivateMod.UnaryFilterOp
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.UnaryFilterOp
  inline def IS_NOT_NAN: IS_NOT_NAN = "IS_NOT_NAN".asInstanceOf[IS_NOT_NAN]
  
  @js.native
  sealed trait IS_NOT_NULL
    extends StObject
       with UnaryFilterOp
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.UnaryFilterOp
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.UnaryFilterOp
       with typingsJapgolly.firebaseFirestore.distInternalMod.UnaryFilterOp
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.UnaryFilterOp
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.UnaryFilterOp
       with typingsJapgolly.firebaseFirestore.distPrivateMod.UnaryFilterOp
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.UnaryFilterOp
  inline def IS_NOT_NULL: IS_NOT_NULL = "IS_NOT_NULL".asInstanceOf[IS_NOT_NULL]
  
  @js.native
  sealed trait IS_NULL
    extends StObject
       with UnaryFilterOp
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.UnaryFilterOp
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.UnaryFilterOp
       with typingsJapgolly.firebaseFirestore.distInternalMod.UnaryFilterOp
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.UnaryFilterOp
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.UnaryFilterOp
       with typingsJapgolly.firebaseFirestore.distPrivateMod.UnaryFilterOp
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.UnaryFilterOp
  inline def IS_NULL: IS_NULL = "IS_NULL".asInstanceOf[IS_NULL]
  
  @js.native
  sealed trait L
    extends StObject
       with LimitType
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.LimitType
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcCoreQueryMod.LimitType
       with typingsJapgolly.firebaseFirestore.distInternalMod.LimitType
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.LimitType
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcCoreQueryMod.LimitType
       with typingsJapgolly.firebaseFirestore.distPrivateMod.LimitType
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcCoreQueryMod.LimitType
  inline def L: L = "L".asInstanceOf[L]
  
  @js.native
  sealed trait LAST
    extends StObject
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreBundleProtoMod.LimitType
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcProtosFirestoreBundleProtoMod.LimitType
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreBundleProtoMod.LimitType
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcProtosFirestoreBundleProtoMod.LimitType
       with LimitType2
       with typingsJapgolly.firebaseFirestore.distPrivateMod.LimitType2
  inline def LAST: LAST = "LAST".asInstanceOf[LAST]
  
  @js.native
  sealed trait LESS_THAN
    extends StObject
       with FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distInternalMod.FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distPrivateMod.FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.FieldFilterOp
  inline def LESS_THAN: LESS_THAN = "LESS_THAN".asInstanceOf[LESS_THAN]
  
  @js.native
  sealed trait LESS_THAN_OR_EQUAL
    extends StObject
       with FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distInternalMod.FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distPrivateMod.FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.FieldFilterOp
  inline def LESS_THAN_OR_EQUAL: LESS_THAN_OR_EQUAL = "LESS_THAN_OR_EQUAL".asInstanceOf[LESS_THAN_OR_EQUAL]
  
  @js.native
  sealed trait Lessthansign
    extends StObject
       with Operator
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcCoreTargetMod.Operator
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcCoreTargetMod.Operator
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcCoreTargetMod.Operator
       with WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distInternalMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distLiteMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distPrivateMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.WhereFilterOp
  inline def Lessthansign: Lessthansign = "<".asInstanceOf[Lessthansign]
  
  @js.native
  sealed trait LessthansignEqualssign
    extends StObject
       with Operator
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcCoreTargetMod.Operator
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcCoreTargetMod.Operator
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcCoreTargetMod.Operator
       with WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distInternalMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distLiteMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distPrivateMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.WhereFilterOp
  inline def LessthansignEqualssign: LessthansignEqualssign = "<=".asInstanceOf[LessthansignEqualssign]
  
  @js.native
  sealed trait LimitToFirst
    extends StObject
       with SpecLimitType
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreTestUnitSpecsSpecTestRunnerMod.SpecLimitType
       with typingsJapgolly.firebaseFirestore.distFirestoreTestUnitSpecsSpecTestRunnerMod.SpecLimitType
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreTestUnitSpecsSpecTestRunnerMod.SpecLimitType
  inline def LimitToFirst: LimitToFirst = "LimitToFirst".asInstanceOf[LimitToFirst]
  
  @js.native
  sealed trait LimitToLast
    extends StObject
       with SpecLimitType
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreTestUnitSpecsSpecTestRunnerMod.SpecLimitType
       with typingsJapgolly.firebaseFirestore.distFirestoreTestUnitSpecsSpecTestRunnerMod.SpecLimitType
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreTestUnitSpecsSpecTestRunnerMod.SpecLimitType
  inline def LimitToLast: LimitToLast = "LimitToLast".asInstanceOf[LimitToLast]
  
  @js.native
  sealed trait `Locally write mutations`
    extends StObject
       with PersistenceAction
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typingsJapgolly.firebaseFirestore.distFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
  inline def `Locally write mutations`: `Locally write mutations` = ("Locally write mutations").asInstanceOf[`Locally write mutations`]
  
  @js.native
  sealed trait `Lookup mutation documents`
    extends StObject
       with PersistenceAction
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typingsJapgolly.firebaseFirestore.distFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
  inline def `Lookup mutation documents`: `Lookup mutation documents` = ("Lookup mutation documents").asInstanceOf[`Lookup mutation documents`]
  
  @js.native
  sealed trait MODE_UNSPECIFIED
    extends StObject
       with IndexFieldMode
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.IndexFieldMode
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.IndexFieldMode
       with typingsJapgolly.firebaseFirestore.distInternalMod.IndexFieldMode
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.IndexFieldMode
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.IndexFieldMode
       with typingsJapgolly.firebaseFirestore.distPrivateMod.IndexFieldMode
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.IndexFieldMode
  inline def MODE_UNSPECIFIED: MODE_UNSPECIFIED = "MODE_UNSPECIFIED".asInstanceOf[MODE_UNSPECIFIED]
  
  @js.native
  sealed trait NOT_EQUAL
    extends StObject
       with FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distInternalMod.FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distPrivateMod.FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.FieldFilterOp
  inline def NOT_EQUAL: NOT_EQUAL = "NOT_EQUAL".asInstanceOf[NOT_EQUAL]
  
  @js.native
  sealed trait NOT_IN
    extends StObject
       with FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distInternalMod.FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distPrivateMod.FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.FieldFilterOp
  inline def NOT_IN: NOT_IN = "NOT_IN".asInstanceOf[NOT_IN]
  
  @js.native
  sealed trait NO_CHANGE
    extends StObject
       with TargetChangeTargetChangeType
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.TargetChangeTargetChangeType
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.TargetChangeTargetChangeType
       with typingsJapgolly.firebaseFirestore.distInternalMod.TargetChangeTargetChangeType
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.TargetChangeTargetChangeType
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.TargetChangeTargetChangeType
       with typingsJapgolly.firebaseFirestore.distPrivateMod.TargetChangeTargetChangeType
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.TargetChangeTargetChangeType
  inline def NO_CHANGE: NO_CHANGE = "NO_CHANGE".asInstanceOf[NO_CHANGE]
  
  @js.native
  sealed trait NULL_VALUE extends StObject
  inline def NULL_VALUE: NULL_VALUE = "NULL_VALUE".asInstanceOf[NULL_VALUE]
  
  @js.native
  sealed trait NaN extends StObject
  inline def NaN: NaN = "NaN".asInstanceOf[NaN]
  
  @js.native
  sealed trait OAuth
    extends StObject
       with TokenType
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcApiCredentialsMod.TokenType
       with typingsJapgolly.firebaseFirestore.distInternalMod.TokenType
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.TokenType
       with typingsJapgolly.firebaseFirestore.distPrivateMod.TokenType
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcApiCredentialsMod.TokenType
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcApiCredentialsMod.TokenType
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcApiCredentialsMod.TokenType
  inline def OAuth: OAuth = "OAuth".asInstanceOf[OAuth]
  
  @js.native
  sealed trait OPERATOR_UNSPECIFIED
    extends StObject
       with CompositeFilterOp
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.CompositeFilterOp
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.CompositeFilterOp
       with typingsJapgolly.firebaseFirestore.distInternalMod.CompositeFilterOp
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.CompositeFilterOp
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.CompositeFilterOp
       with typingsJapgolly.firebaseFirestore.distPrivateMod.CompositeFilterOp
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.CompositeFilterOp
       with FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distInternalMod.FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distPrivateMod.FieldFilterOp
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.FieldFilterOp
       with UnaryFilterOp
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.UnaryFilterOp
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.UnaryFilterOp
       with typingsJapgolly.firebaseFirestore.distInternalMod.UnaryFilterOp
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.UnaryFilterOp
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.UnaryFilterOp
       with typingsJapgolly.firebaseFirestore.distPrivateMod.UnaryFilterOp
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.UnaryFilterOp
  inline def OPERATOR_UNSPECIFIED: OPERATOR_UNSPECIFIED = "OPERATOR_UNSPECIFIED".asInstanceOf[OPERATOR_UNSPECIFIED]
  
  @js.native
  sealed trait Offline
    extends StObject
       with OnlineState
       with typingsJapgolly.firebaseFirestore.distInternalMod.OnlineState
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcCoreTypesMod.OnlineState
       with typingsJapgolly.firebaseFirestore.distPrivateMod.OnlineState
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcCoreTypesMod.OnlineState
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcCoreTypesMod.OnlineState
  inline def Offline: Offline = "Offline".asInstanceOf[Offline]
  
  @js.native
  sealed trait Online
    extends StObject
       with OnlineState
       with typingsJapgolly.firebaseFirestore.distInternalMod.OnlineState
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcCoreTypesMod.OnlineState
       with typingsJapgolly.firebaseFirestore.distPrivateMod.OnlineState
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcCoreTypesMod.OnlineState
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcCoreTypesMod.OnlineState
  inline def Online: Online = "Online".asInstanceOf[Online]
  
  @js.native
  sealed trait READY
    extends StObject
       with IndexState
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.IndexState
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.IndexState
       with typingsJapgolly.firebaseFirestore.distInternalMod.IndexState
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.IndexState
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.IndexState
       with typingsJapgolly.firebaseFirestore.distPrivateMod.IndexState
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.IndexState
  inline def READY: READY = "READY".asInstanceOf[READY]
  
  @js.native
  sealed trait REMOVE
    extends StObject
       with TargetChangeTargetChangeType
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.TargetChangeTargetChangeType
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.TargetChangeTargetChangeType
       with typingsJapgolly.firebaseFirestore.distInternalMod.TargetChangeTargetChangeType
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.TargetChangeTargetChangeType
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.TargetChangeTargetChangeType
       with typingsJapgolly.firebaseFirestore.distPrivateMod.TargetChangeTargetChangeType
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.TargetChangeTargetChangeType
  inline def REMOVE: REMOVE = "REMOVE".asInstanceOf[REMOVE]
  
  @js.native
  sealed trait REQUEST_TIME
    extends StObject
       with FieldTransformSetToServerValue
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.FieldTransformSetToServerValue
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.FieldTransformSetToServerValue
       with typingsJapgolly.firebaseFirestore.distInternalMod.FieldTransformSetToServerValue
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.FieldTransformSetToServerValue
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.FieldTransformSetToServerValue
       with typingsJapgolly.firebaseFirestore.distPrivateMod.FieldTransformSetToServerValue
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.FieldTransformSetToServerValue
  inline def REQUEST_TIME: REQUEST_TIME = "REQUEST_TIME".asInstanceOf[REQUEST_TIME]
  
  @js.native
  sealed trait RESET
    extends StObject
       with TargetChangeTargetChangeType
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.TargetChangeTargetChangeType
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.TargetChangeTargetChangeType
       with typingsJapgolly.firebaseFirestore.distInternalMod.TargetChangeTargetChangeType
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.TargetChangeTargetChangeType
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.TargetChangeTargetChangeType
       with typingsJapgolly.firebaseFirestore.distPrivateMod.TargetChangeTargetChangeType
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.TargetChangeTargetChangeType
  inline def RESET: RESET = "RESET".asInstanceOf[RESET]
  
  @js.native
  sealed trait `Reject batch`
    extends StObject
       with PersistenceAction
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typingsJapgolly.firebaseFirestore.distFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
  inline def `Reject batch`: `Reject batch` = ("Reject batch").asInstanceOf[`Reject batch`]
  
  @js.native
  sealed trait `Release target`
    extends StObject
       with PersistenceAction
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typingsJapgolly.firebaseFirestore.distFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
  inline def `Release target`: `Release target` = ("Release target").asInstanceOf[`Release target`]
  
  @js.native
  sealed trait `Remote document keys`
    extends StObject
       with PersistenceAction
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typingsJapgolly.firebaseFirestore.distFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
  inline def `Remote document keys`: `Remote document keys` = ("Remote document keys").asInstanceOf[`Remote document keys`]
  
  @js.native
  sealed trait Running
    extends StObject
       with TaskState
       with typingsJapgolly.firebaseFirestore.distInternalMod.TaskState
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcApiBundleMod.TaskState
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcApiBundleMod.TaskState
       with typingsJapgolly.firebaseFirestore.distPrivateMod.TaskState
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcApiBundleMod.TaskState
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcApiBundleMod.TaskState
  inline def Running: Running = "Running".asInstanceOf[Running]
  
  @js.native
  sealed trait SERVER_VALUE_UNSPECIFIED
    extends StObject
       with FieldTransformSetToServerValue
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.FieldTransformSetToServerValue
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.FieldTransformSetToServerValue
       with typingsJapgolly.firebaseFirestore.distInternalMod.FieldTransformSetToServerValue
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.FieldTransformSetToServerValue
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.FieldTransformSetToServerValue
       with typingsJapgolly.firebaseFirestore.distPrivateMod.FieldTransformSetToServerValue
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.FieldTransformSetToServerValue
  inline def SERVER_VALUE_UNSPECIFIED: SERVER_VALUE_UNSPECIFIED = "SERVER_VALUE_UNSPECIFIED".asInstanceOf[SERVER_VALUE_UNSPECIFIED]
  
  @js.native
  sealed trait STATE_UNSPECIFIED
    extends StObject
       with IndexState
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.IndexState
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.IndexState
       with typingsJapgolly.firebaseFirestore.distInternalMod.IndexState
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.IndexState
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.IndexState
       with typingsJapgolly.firebaseFirestore.distPrivateMod.IndexState
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.IndexState
  inline def STATE_UNSPECIFIED: STATE_UNSPECIFIED = "STATE_UNSPECIFIED".asInstanceOf[STATE_UNSPECIFIED]
  
  @js.native
  sealed trait `Set last remote snapshot version`
    extends StObject
       with PersistenceAction
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typingsJapgolly.firebaseFirestore.distFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
  inline def `Set last remote snapshot version`: `Set last remote snapshot version` = ("Set last remote snapshot version").asInstanceOf[`Set last remote snapshot version`]
  
  @js.native
  sealed trait `Set last stream token`
    extends StObject
       with PersistenceAction
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typingsJapgolly.firebaseFirestore.distFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
  inline def `Set last stream token`: `Set last stream token` = ("Set last stream token").asInstanceOf[`Set last stream token`]
  
  @js.native
  sealed trait Success
    extends StObject
       with TaskState
       with typingsJapgolly.firebaseFirestore.distInternalMod.TaskState
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcApiBundleMod.TaskState
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcApiBundleMod.TaskState
       with typingsJapgolly.firebaseFirestore.distPrivateMod.TaskState
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcApiBundleMod.TaskState
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcApiBundleMod.TaskState
  inline def Success: Success = "Success".asInstanceOf[Success]
  
  @js.native
  sealed trait `Synchronize last document change read time`
    extends StObject
       with PersistenceAction
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typingsJapgolly.firebaseFirestore.distFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
  inline def `Synchronize last document change read time`: `Synchronize last document change read time` = ("Synchronize last document change read time").asInstanceOf[`Synchronize last document change read time`]
  
  @js.native
  sealed trait Unknown
    extends StObject
       with OnlineState
       with typingsJapgolly.firebaseFirestore.distInternalMod.OnlineState
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcCoreTypesMod.OnlineState
       with typingsJapgolly.firebaseFirestore.distPrivateMod.OnlineState
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcCoreTypesMod.OnlineState
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcCoreTypesMod.OnlineState
  inline def Unknown: Unknown = "Unknown".asInstanceOf[Unknown]
  
  @js.native
  sealed trait aborted
    extends StObject
       with FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcUtilErrorMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.mod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distInternalMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distLiteMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcUtilErrorMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distPrivateMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcUtilErrorMod.FirestoreErrorCode
  inline def aborted: aborted = "aborted".asInstanceOf[aborted]
  
  @js.native
  sealed trait acknowledged
    extends StObject
       with MutationBatchState
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcCoreTypesMod.MutationBatchState
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcCoreTypesMod.MutationBatchState
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcCoreTypesMod.MutationBatchState
  inline def acknowledged: acknowledged = "acknowledged".asInstanceOf[acknowledged]
  
  @js.native
  sealed trait added
    extends StObject
       with DocumentChangeType
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcApiSnapshotMod.DocumentChangeType
       with typingsJapgolly.firebaseFirestore.distInternalMod.DocumentChangeType
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcApiSnapshotMod.DocumentChangeType
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcApiSnapshotMod.DocumentChangeType
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcApiSnapshotMod.DocumentChangeType
       with typingsJapgolly.firebaseFirestore.distPrivateMod.DocumentChangeType
  inline def added: added = "added".asInstanceOf[added]
  
  @js.native
  sealed trait all
    extends StObject
       with TimerId
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcUtilAsyncQueueMod.TimerId
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.TimerId
       with typingsJapgolly.firebaseFirestore.distInternalMod.TimerId
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcUtilAsyncQueueMod.TimerId
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcUtilAsyncQueueMod.TimerId
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.TimerId
       with typingsJapgolly.firebaseFirestore.distPrivateMod.TimerId
  inline def all: all = "all".asInstanceOf[all]
  
  @js.native
  sealed trait `already-exists`
    extends StObject
       with FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcUtilErrorMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.mod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distInternalMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distLiteMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcUtilErrorMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distPrivateMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcUtilErrorMod.FirestoreErrorCode
  inline def `already-exists`: `already-exists` = "already-exists".asInstanceOf[`already-exists`]
  
  @js.native
  sealed trait `array-contains`
    extends StObject
       with Operator
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcCoreTargetMod.Operator
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcCoreTargetMod.Operator
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcCoreTargetMod.Operator
       with WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distInternalMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distLiteMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distPrivateMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.WhereFilterOp
  inline def `array-contains`: `array-contains` = "array-contains".asInstanceOf[`array-contains`]
  
  @js.native
  sealed trait `array-contains-any`
    extends StObject
       with Operator
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcCoreTargetMod.Operator
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcCoreTargetMod.Operator
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcCoreTargetMod.Operator
       with WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distInternalMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distLiteMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distPrivateMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.WhereFilterOp
  inline def `array-contains-any`: `array-contains-any` = "array-contains-any".asInstanceOf[`array-contains-any`]
  
  @js.native
  sealed trait asc
    extends StObject
       with Direction
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcCoreTargetMod.Direction
       with typingsJapgolly.firebaseFirestore.distInternalMod.Direction
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcCoreTargetMod.Direction
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcCoreTargetMod.Direction
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.Direction
       with typingsJapgolly.firebaseFirestore.distPrivateMod.Direction
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcCoreTargetMod.Direction
       with OrderByDirection
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.OrderByDirection
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.OrderByDirection
       with typingsJapgolly.firebaseFirestore.distInternalMod.OrderByDirection
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.OrderByDirection
       with typingsJapgolly.firebaseFirestore.distLiteMod.OrderByDirection
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.OrderByDirection
       with typingsJapgolly.firebaseFirestore.distPrivateMod.OrderByDirection
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.OrderByDirection
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.OrderByDirection
  inline def asc: asc = "asc".asInstanceOf[asc]
  
  @js.native
  sealed trait async_queue_retry
    extends StObject
       with TimerId
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcUtilAsyncQueueMod.TimerId
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.TimerId
       with typingsJapgolly.firebaseFirestore.distInternalMod.TimerId
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcUtilAsyncQueueMod.TimerId
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcUtilAsyncQueueMod.TimerId
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.TimerId
       with typingsJapgolly.firebaseFirestore.distPrivateMod.TimerId
  inline def async_queue_retry: async_queue_retry = "async_queue_retry".asInstanceOf[async_queue_retry]
  
  @js.native
  sealed trait boolean
    extends StObject
       with ValidationType
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcUtilInputValidationMod.ValidationType
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcUtilInputValidationMod.ValidationType
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcUtilInputValidationMod.ValidationType
  inline def boolean: boolean = "boolean".asInstanceOf[boolean]
  
  @js.native
  sealed trait cancelled
    extends StObject
       with FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcUtilErrorMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.mod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distInternalMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distLiteMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcUtilErrorMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distPrivateMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcUtilErrorMod.FirestoreErrorCode
  inline def cancelled: cancelled = "cancelled".asInstanceOf[cancelled]
  
  @js.native
  sealed trait client_metadata_refresh
    extends StObject
       with TimerId
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcUtilAsyncQueueMod.TimerId
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.TimerId
       with typingsJapgolly.firebaseFirestore.distInternalMod.TimerId
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcUtilAsyncQueueMod.TimerId
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcUtilAsyncQueueMod.TimerId
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.TimerId
       with typingsJapgolly.firebaseFirestore.distPrivateMod.TimerId
  inline def client_metadata_refresh: client_metadata_refresh = "client_metadata_refresh".asInstanceOf[client_metadata_refresh]
  
  @js.native
  sealed trait close
    extends StObject
       with StreamEventType
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreTestIntegrationRemoteStreamDottestMod.StreamEventType
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreTestIntegrationRemoteStreamDottestMod.StreamEventType
       with typingsJapgolly.firebaseFirestore.distFirestoreTestIntegrationRemoteStreamDottestMod.StreamEventType
  inline def close: close = "close".asInstanceOf[close]
  
  @js.native
  sealed trait collection extends StObject
  inline def collection: collection = "collection".asInstanceOf[collection]
  
  @js.native
  sealed trait current_
    extends StObject
       with QueryTargetState
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcLocalSharedClientStateSyncerMod.QueryTargetState
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLocalSharedClientStateSyncerMod.QueryTargetState
       with typingsJapgolly.firebaseFirestore.distPrivateMod.QueryTargetState
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcLocalSharedClientStateSyncerMod.QueryTargetState
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcLocalSharedClientStateSyncerMod.QueryTargetState
  inline def current_ : current_ = "current".asInstanceOf[current_]
  
  @js.native
  sealed trait `data-loss`
    extends StObject
       with FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcUtilErrorMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.mod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distInternalMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distLiteMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcUtilErrorMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distPrivateMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcUtilErrorMod.FirestoreErrorCode
  inline def `data-loss`: `data-loss` = "data-loss".asInstanceOf[`data-loss`]
  
  @js.native
  sealed trait `deadline-exceeded`
    extends StObject
       with FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcUtilErrorMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.mod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distInternalMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distLiteMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcUtilErrorMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distPrivateMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcUtilErrorMod.FirestoreErrorCode
  inline def `deadline-exceeded`: `deadline-exceeded` = "deadline-exceeded".asInstanceOf[`deadline-exceeded`]
  
  @js.native
  sealed trait desc
    extends StObject
       with Direction
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcCoreTargetMod.Direction
       with typingsJapgolly.firebaseFirestore.distInternalMod.Direction
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcCoreTargetMod.Direction
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcCoreTargetMod.Direction
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.Direction
       with typingsJapgolly.firebaseFirestore.distPrivateMod.Direction
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcCoreTargetMod.Direction
       with OrderByDirection
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.OrderByDirection
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.OrderByDirection
       with typingsJapgolly.firebaseFirestore.distInternalMod.OrderByDirection
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.OrderByDirection
       with typingsJapgolly.firebaseFirestore.distLiteMod.OrderByDirection
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.OrderByDirection
       with typingsJapgolly.firebaseFirestore.distPrivateMod.OrderByDirection
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.OrderByDirection
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.OrderByDirection
  inline def desc: desc = "desc".asInstanceOf[desc]
  
  @js.native
  sealed trait endAt
    extends StObject
       with QueryConstraintType
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.QueryConstraintType
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.QueryConstraintType
       with typingsJapgolly.firebaseFirestore.distInternalMod.QueryConstraintType
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryConstraintType
       with typingsJapgolly.firebaseFirestore.distLiteMod.QueryConstraintType
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.QueryConstraintType
       with typingsJapgolly.firebaseFirestore.distPrivateMod.QueryConstraintType
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraintType
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraintType
  inline def endAt: endAt = "endAt".asInstanceOf[endAt]
  
  @js.native
  sealed trait endBefore
    extends StObject
       with QueryConstraintType
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.QueryConstraintType
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.QueryConstraintType
       with typingsJapgolly.firebaseFirestore.distInternalMod.QueryConstraintType
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryConstraintType
       with typingsJapgolly.firebaseFirestore.distLiteMod.QueryConstraintType
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.QueryConstraintType
       with typingsJapgolly.firebaseFirestore.distPrivateMod.QueryConstraintType
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraintType
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraintType
  inline def endBefore: endBefore = "endBefore".asInstanceOf[endBefore]
  
  @js.native
  sealed trait estimate
    extends StObject
       with ServerTimestampBehavior
       with typingsJapgolly.firebaseFirestore.distInternalMod.ServerTimestampBehavior
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiUserDataWriterMod.ServerTimestampBehavior
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcLiteApiUserDataWriterMod.ServerTimestampBehavior
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.ServerTimestampBehavior
       with typingsJapgolly.firebaseFirestore.distPrivateMod.ServerTimestampBehavior
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLiteApiUserDataWriterMod.ServerTimestampBehavior
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcLiteApiUserDataWriterMod.ServerTimestampBehavior
  inline def estimate: estimate = "estimate".asInstanceOf[estimate]
  
  @js.native
  sealed trait `failed-precondition`
    extends StObject
       with FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcUtilErrorMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.mod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distInternalMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distLiteMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcUtilErrorMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distPrivateMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcUtilErrorMod.FirestoreErrorCode
  inline def `failed-precondition`: `failed-precondition` = "failed-precondition".asInstanceOf[`failed-precondition`]
  
  @js.native
  sealed trait firestore extends StObject
  inline def firestore: firestore = "firestore".asInstanceOf[firestore]
  
  @js.native
  sealed trait `firestore-lite` extends StObject
  inline def `firestore-lite`: `firestore-lite` = "firestore-lite".asInstanceOf[`firestore-lite`]
  
  @js.native
  sealed trait function
    extends StObject
       with ValidationType
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcUtilInputValidationMod.ValidationType
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcUtilInputValidationMod.ValidationType
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcUtilInputValidationMod.ValidationType
  inline def function: function = "function".asInstanceOf[function]
  
  @js.native
  sealed trait gapi extends StObject
  inline def gapi: gapi = "gapi".asInstanceOf[gapi]
  
  @js.native
  sealed trait getHighestListenSequenceNumber
    extends StObject
       with PersistenceAction
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typingsJapgolly.firebaseFirestore.distFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
  inline def getHighestListenSequenceNumber: getHighestListenSequenceNumber = "getHighestListenSequenceNumber".asInstanceOf[getHighestListenSequenceNumber]
  
  @js.native
  sealed trait handshakeComplete
    extends StObject
       with StreamEventType
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreTestIntegrationRemoteStreamDottestMod.StreamEventType
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreTestIntegrationRemoteStreamDottestMod.StreamEventType
       with typingsJapgolly.firebaseFirestore.distFirestoreTestIntegrationRemoteStreamDottestMod.StreamEventType
  inline def handshakeComplete: handshakeComplete = "handshakeComplete".asInstanceOf[handshakeComplete]
  
  @js.native
  sealed trait health_check_timeout
    extends StObject
       with TimerId
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcUtilAsyncQueueMod.TimerId
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.TimerId
       with typingsJapgolly.firebaseFirestore.distInternalMod.TimerId
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcUtilAsyncQueueMod.TimerId
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcUtilAsyncQueueMod.TimerId
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.TimerId
       with typingsJapgolly.firebaseFirestore.distPrivateMod.TimerId
  inline def health_check_timeout: health_check_timeout = "health_check_timeout".asInstanceOf[health_check_timeout]
  
  @js.native
  sealed trait in_
    extends StObject
       with Operator
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcCoreTargetMod.Operator
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcCoreTargetMod.Operator
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcCoreTargetMod.Operator
       with WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distInternalMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distLiteMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distPrivateMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.WhereFilterOp
  inline def in_ : in_ = "in".asInstanceOf[in_]
  
  @js.native
  sealed trait index_backfill
    extends StObject
       with TimerId
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcUtilAsyncQueueMod.TimerId
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.TimerId
       with typingsJapgolly.firebaseFirestore.distInternalMod.TimerId
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcUtilAsyncQueueMod.TimerId
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcUtilAsyncQueueMod.TimerId
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.TimerId
       with typingsJapgolly.firebaseFirestore.distPrivateMod.TimerId
  inline def index_backfill: index_backfill = "index_backfill".asInstanceOf[index_backfill]
  
  @js.native
  sealed trait internal
    extends StObject
       with FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcUtilErrorMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.mod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distInternalMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distLiteMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcUtilErrorMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distPrivateMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcUtilErrorMod.FirestoreErrorCode
  inline def internal: internal = "internal".asInstanceOf[internal]
  
  @js.native
  sealed trait `invalid-argument`
    extends StObject
       with FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcUtilErrorMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.mod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distInternalMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distLiteMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcUtilErrorMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distPrivateMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcUtilErrorMod.FirestoreErrorCode
  inline def `invalid-argument`: `invalid-argument` = "invalid-argument".asInstanceOf[`invalid-argument`]
  
  @js.native
  sealed trait json
    extends StObject
       with ProjectsDatabasesDocumentsApiClientAlt
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.ProjectsDatabasesDocumentsApiClientAlt
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.ProjectsDatabasesDocumentsApiClientAlt
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.ProjectsDatabasesDocumentsApiClientAlt
       with ProjectsDatabasesIndexesApiClientAlt
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.ProjectsDatabasesIndexesApiClientAlt
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.ProjectsDatabasesIndexesApiClientAlt
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.ProjectsDatabasesIndexesApiClientAlt
  inline def json: json = "json".asInstanceOf[json]
  
  @js.native
  sealed trait limit
    extends StObject
       with QueryConstraintType
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.QueryConstraintType
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.QueryConstraintType
       with typingsJapgolly.firebaseFirestore.distInternalMod.QueryConstraintType
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryConstraintType
       with typingsJapgolly.firebaseFirestore.distLiteMod.QueryConstraintType
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.QueryConstraintType
       with typingsJapgolly.firebaseFirestore.distPrivateMod.QueryConstraintType
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraintType
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraintType
  inline def limit: limit = "limit".asInstanceOf[limit]
  
  @js.native
  sealed trait limitToLast_
    extends StObject
       with QueryConstraintType
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.QueryConstraintType
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.QueryConstraintType
       with typingsJapgolly.firebaseFirestore.distInternalMod.QueryConstraintType
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryConstraintType
       with typingsJapgolly.firebaseFirestore.distLiteMod.QueryConstraintType
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.QueryConstraintType
       with typingsJapgolly.firebaseFirestore.distPrivateMod.QueryConstraintType
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraintType
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraintType
  inline def limitToLast_ : limitToLast_ = "limitToLast".asInstanceOf[limitToLast_]
  
  @js.native
  sealed trait listen_stream_connection_backoff
    extends StObject
       with TimerId
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcUtilAsyncQueueMod.TimerId
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.TimerId
       with typingsJapgolly.firebaseFirestore.distInternalMod.TimerId
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcUtilAsyncQueueMod.TimerId
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcUtilAsyncQueueMod.TimerId
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.TimerId
       with typingsJapgolly.firebaseFirestore.distPrivateMod.TimerId
  inline def listen_stream_connection_backoff: listen_stream_connection_backoff = "listen_stream_connection_backoff".asInstanceOf[listen_stream_connection_backoff]
  
  @js.native
  sealed trait listen_stream_idle
    extends StObject
       with TimerId
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcUtilAsyncQueueMod.TimerId
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.TimerId
       with typingsJapgolly.firebaseFirestore.distInternalMod.TimerId
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcUtilAsyncQueueMod.TimerId
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcUtilAsyncQueueMod.TimerId
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.TimerId
       with typingsJapgolly.firebaseFirestore.distPrivateMod.TimerId
  inline def listen_stream_idle: listen_stream_idle = "listen_stream_idle".asInstanceOf[listen_stream_idle]
  
  @js.native
  sealed trait lru_garbage_collection
    extends StObject
       with TimerId
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcUtilAsyncQueueMod.TimerId
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.TimerId
       with typingsJapgolly.firebaseFirestore.distInternalMod.TimerId
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcUtilAsyncQueueMod.TimerId
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcUtilAsyncQueueMod.TimerId
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.TimerId
       with typingsJapgolly.firebaseFirestore.distPrivateMod.TimerId
  inline def lru_garbage_collection: lru_garbage_collection = "lru_garbage_collection".asInstanceOf[lru_garbage_collection]
  
  @js.native
  sealed trait maybeGarbageCollectMultiClientState
    extends StObject
       with PersistenceAction
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typingsJapgolly.firebaseFirestore.distFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
  inline def maybeGarbageCollectMultiClientState: maybeGarbageCollectMultiClientState = "maybeGarbageCollectMultiClientState".asInstanceOf[maybeGarbageCollectMultiClientState]
  
  @js.native
  sealed trait media
    extends StObject
       with ProjectsDatabasesDocumentsApiClientAlt
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.ProjectsDatabasesDocumentsApiClientAlt
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.ProjectsDatabasesDocumentsApiClientAlt
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.ProjectsDatabasesDocumentsApiClientAlt
       with ProjectsDatabasesIndexesApiClientAlt
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.ProjectsDatabasesIndexesApiClientAlt
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.ProjectsDatabasesIndexesApiClientAlt
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.ProjectsDatabasesIndexesApiClientAlt
  inline def media: media = "media".asInstanceOf[media]
  
  @js.native
  sealed trait modified
    extends StObject
       with DocumentChangeType
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcApiSnapshotMod.DocumentChangeType
       with typingsJapgolly.firebaseFirestore.distInternalMod.DocumentChangeType
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcApiSnapshotMod.DocumentChangeType
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcApiSnapshotMod.DocumentChangeType
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcApiSnapshotMod.DocumentChangeType
       with typingsJapgolly.firebaseFirestore.distPrivateMod.DocumentChangeType
  inline def modified: modified = "modified".asInstanceOf[modified]
  
  @js.native
  sealed trait mutationResult
    extends StObject
       with StreamEventType
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreTestIntegrationRemoteStreamDottestMod.StreamEventType
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreTestIntegrationRemoteStreamDottestMod.StreamEventType
       with typingsJapgolly.firebaseFirestore.distFirestoreTestIntegrationRemoteStreamDottestMod.StreamEventType
  inline def mutationResult: mutationResult = "mutationResult".asInstanceOf[mutationResult]
  
  @js.native
  sealed trait `non-empty string`
    extends StObject
       with ValidationType
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcUtilInputValidationMod.ValidationType
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcUtilInputValidationMod.ValidationType
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcUtilInputValidationMod.ValidationType
  inline def `non-empty string`: `non-empty string` = ("non-empty string").asInstanceOf[`non-empty string`]
  
  @js.native
  sealed trait none
    extends StObject
       with ServerTimestampBehavior
       with typingsJapgolly.firebaseFirestore.distInternalMod.ServerTimestampBehavior
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiUserDataWriterMod.ServerTimestampBehavior
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcLiteApiUserDataWriterMod.ServerTimestampBehavior
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.ServerTimestampBehavior
       with typingsJapgolly.firebaseFirestore.distPrivateMod.ServerTimestampBehavior
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLiteApiUserDataWriterMod.ServerTimestampBehavior
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcLiteApiUserDataWriterMod.ServerTimestampBehavior
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait `not-current`
    extends StObject
       with QueryTargetState
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcLocalSharedClientStateSyncerMod.QueryTargetState
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLocalSharedClientStateSyncerMod.QueryTargetState
       with typingsJapgolly.firebaseFirestore.distPrivateMod.QueryTargetState
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcLocalSharedClientStateSyncerMod.QueryTargetState
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcLocalSharedClientStateSyncerMod.QueryTargetState
  inline def `not-current`: `not-current` = "not-current".asInstanceOf[`not-current`]
  
  @js.native
  sealed trait `not-found`
    extends StObject
       with FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcUtilErrorMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.mod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distInternalMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distLiteMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcUtilErrorMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distPrivateMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcUtilErrorMod.FirestoreErrorCode
  inline def `not-found`: `not-found` = "not-found".asInstanceOf[`not-found`]
  
  @js.native
  sealed trait `not-in`
    extends StObject
       with Operator
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcCoreTargetMod.Operator
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcCoreTargetMod.Operator
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcCoreTargetMod.Operator
       with WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distInternalMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distLiteMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distPrivateMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.WhereFilterOp
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.WhereFilterOp
  inline def `not-in`: `not-in` = "not-in".asInstanceOf[`not-in`]
  
  @js.native
  sealed trait notifyLocalViewChanges
    extends StObject
       with PersistenceAction
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typingsJapgolly.firebaseFirestore.distFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
  inline def notifyLocalViewChanges: notifyLocalViewChanges = "notifyLocalViewChanges".asInstanceOf[notifyLocalViewChanges]
  
  @js.native
  sealed trait number
    extends StObject
       with ValidationType
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcUtilInputValidationMod.ValidationType
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcUtilInputValidationMod.ValidationType
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcUtilInputValidationMod.ValidationType
  inline def number: number = "number".asInstanceOf[number]
  
  @js.native
  sealed trait `object`
    extends StObject
       with ValidationType
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcUtilInputValidationMod.ValidationType
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcUtilInputValidationMod.ValidationType
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcUtilInputValidationMod.ValidationType
  inline def `object`: `object` = "object".asInstanceOf[`object`]
  
  @js.native
  sealed trait online_state_timeout
    extends StObject
       with TimerId
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcUtilAsyncQueueMod.TimerId
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.TimerId
       with typingsJapgolly.firebaseFirestore.distInternalMod.TimerId
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcUtilAsyncQueueMod.TimerId
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcUtilAsyncQueueMod.TimerId
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.TimerId
       with typingsJapgolly.firebaseFirestore.distPrivateMod.TimerId
  inline def online_state_timeout: online_state_timeout = "online_state_timeout".asInstanceOf[online_state_timeout]
  
  @js.native
  sealed trait open
    extends StObject
       with StreamEventType
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreTestIntegrationRemoteStreamDottestMod.StreamEventType
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreTestIntegrationRemoteStreamDottestMod.StreamEventType
       with typingsJapgolly.firebaseFirestore.distFirestoreTestIntegrationRemoteStreamDottestMod.StreamEventType
  inline def open: open = "open".asInstanceOf[open]
  
  @js.native
  sealed trait orderBy
    extends StObject
       with QueryConstraintType
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.QueryConstraintType
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.QueryConstraintType
       with typingsJapgolly.firebaseFirestore.distInternalMod.QueryConstraintType
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryConstraintType
       with typingsJapgolly.firebaseFirestore.distLiteMod.QueryConstraintType
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.QueryConstraintType
       with typingsJapgolly.firebaseFirestore.distPrivateMod.QueryConstraintType
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraintType
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraintType
  inline def orderBy: orderBy = "orderBy".asInstanceOf[orderBy]
  
  @js.native
  sealed trait `out-of-range`
    extends StObject
       with FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcUtilErrorMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.mod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distInternalMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distLiteMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcUtilErrorMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distPrivateMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcUtilErrorMod.FirestoreErrorCode
  inline def `out-of-range`: `out-of-range` = "out-of-range".asInstanceOf[`out-of-range`]
  
  @js.native
  sealed trait pending
    extends StObject
       with MutationBatchState
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcCoreTypesMod.MutationBatchState
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcCoreTypesMod.MutationBatchState
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcCoreTypesMod.MutationBatchState
  inline def pending: pending = "pending".asInstanceOf[pending]
  
  @js.native
  sealed trait `permission-denied`
    extends StObject
       with FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcUtilErrorMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.mod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distInternalMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distLiteMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcUtilErrorMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distPrivateMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcUtilErrorMod.FirestoreErrorCode
  inline def `permission-denied`: `permission-denied` = "permission-denied".asInstanceOf[`permission-denied`]
  
  @js.native
  sealed trait previous
    extends StObject
       with ServerTimestampBehavior
       with typingsJapgolly.firebaseFirestore.distInternalMod.ServerTimestampBehavior
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiUserDataWriterMod.ServerTimestampBehavior
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcLiteApiUserDataWriterMod.ServerTimestampBehavior
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.ServerTimestampBehavior
       with typingsJapgolly.firebaseFirestore.distPrivateMod.ServerTimestampBehavior
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLiteApiUserDataWriterMod.ServerTimestampBehavior
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcLiteApiUserDataWriterMod.ServerTimestampBehavior
  inline def previous: previous = "previous".asInstanceOf[previous]
  
  @js.native
  sealed trait proto
    extends StObject
       with ProjectsDatabasesDocumentsApiClientAlt
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.ProjectsDatabasesDocumentsApiClientAlt
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.ProjectsDatabasesDocumentsApiClientAlt
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.ProjectsDatabasesDocumentsApiClientAlt
       with ProjectsDatabasesIndexesApiClientAlt
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.ProjectsDatabasesIndexesApiClientAlt
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.ProjectsDatabasesIndexesApiClientAlt
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.ProjectsDatabasesIndexesApiClientAlt
  inline def proto: proto = "proto".asInstanceOf[proto]
  
  @js.native
  sealed trait provider extends StObject
  inline def provider: provider = "provider".asInstanceOf[provider]
  
  @js.native
  sealed trait query extends StObject
  inline def query: query = "query".asInstanceOf[query]
  
  @js.native
  sealed trait `read document`
    extends StObject
       with PersistenceAction
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typingsJapgolly.firebaseFirestore.distFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
  inline def `read document`: `read document` = ("read document").asInstanceOf[`read document`]
  
  @js.native
  sealed trait readonly
    extends StObject
       with PersistenceTransactionMode
       with typingsJapgolly.firebaseFirestore.distInternalMod.PersistenceTransactionMode
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLocalPersistenceTransactionMod.PersistenceTransactionMode
       with typingsJapgolly.firebaseFirestore.distPrivateMod.PersistenceTransactionMode
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcLocalPersistenceTransactionMod.PersistenceTransactionMode
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcLocalPersistenceTransactionMod.PersistenceTransactionMode
       with SimpleDbTransactionMode
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcLocalSimpleDbMod.SimpleDbTransactionMode
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLocalSimpleDbMod.SimpleDbTransactionMode
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcLocalSimpleDbMod.SimpleDbTransactionMode
  inline def readonly: readonly = "readonly".asInstanceOf[readonly]
  
  @js.native
  sealed trait readwrite
    extends StObject
       with PersistenceTransactionMode
       with typingsJapgolly.firebaseFirestore.distInternalMod.PersistenceTransactionMode
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLocalPersistenceTransactionMod.PersistenceTransactionMode
       with typingsJapgolly.firebaseFirestore.distPrivateMod.PersistenceTransactionMode
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcLocalPersistenceTransactionMod.PersistenceTransactionMode
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcLocalPersistenceTransactionMod.PersistenceTransactionMode
       with SimpleDbTransactionMode
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcLocalSimpleDbMod.SimpleDbTransactionMode
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLocalSimpleDbMod.SimpleDbTransactionMode
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcLocalSimpleDbMod.SimpleDbTransactionMode
  inline def readwrite: readwrite = "readwrite".asInstanceOf[readwrite]
  
  @js.native
  sealed trait `readwrite-primary`
    extends StObject
       with PersistenceTransactionMode
       with typingsJapgolly.firebaseFirestore.distInternalMod.PersistenceTransactionMode
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLocalPersistenceTransactionMod.PersistenceTransactionMode
       with typingsJapgolly.firebaseFirestore.distPrivateMod.PersistenceTransactionMode
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcLocalPersistenceTransactionMod.PersistenceTransactionMode
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcLocalPersistenceTransactionMod.PersistenceTransactionMode
  inline def `readwrite-primary`: `readwrite-primary` = "readwrite-primary".asInstanceOf[`readwrite-primary`]
  
  @js.native
  sealed trait rejected
    extends StObject
       with MutationBatchState
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcCoreTypesMod.MutationBatchState
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcCoreTypesMod.MutationBatchState
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcCoreTypesMod.MutationBatchState
       with QueryTargetState
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcLocalSharedClientStateSyncerMod.QueryTargetState
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLocalSharedClientStateSyncerMod.QueryTargetState
       with typingsJapgolly.firebaseFirestore.distPrivateMod.QueryTargetState
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcLocalSharedClientStateSyncerMod.QueryTargetState
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcLocalSharedClientStateSyncerMod.QueryTargetState
  inline def rejected: rejected = "rejected".asInstanceOf[rejected]
  
  @js.native
  sealed trait removed
    extends StObject
       with DocumentChangeType
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcApiSnapshotMod.DocumentChangeType
       with typingsJapgolly.firebaseFirestore.distInternalMod.DocumentChangeType
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcApiSnapshotMod.DocumentChangeType
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcApiSnapshotMod.DocumentChangeType
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcApiSnapshotMod.DocumentChangeType
       with typingsJapgolly.firebaseFirestore.distPrivateMod.DocumentChangeType
  inline def removed: removed = "removed".asInstanceOf[removed]
  
  @js.native
  sealed trait `resource-exhausted`
    extends StObject
       with FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcUtilErrorMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.mod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distInternalMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distLiteMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcUtilErrorMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distPrivateMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcUtilErrorMod.FirestoreErrorCode
  inline def `resource-exhausted`: `resource-exhausted` = "resource-exhausted".asInstanceOf[`resource-exhausted`]
  
  @js.native
  sealed trait startAfter
    extends StObject
       with QueryConstraintType
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.QueryConstraintType
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.QueryConstraintType
       with typingsJapgolly.firebaseFirestore.distInternalMod.QueryConstraintType
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryConstraintType
       with typingsJapgolly.firebaseFirestore.distLiteMod.QueryConstraintType
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.QueryConstraintType
       with typingsJapgolly.firebaseFirestore.distPrivateMod.QueryConstraintType
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraintType
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraintType
  inline def startAfter: startAfter = "startAfter".asInstanceOf[startAfter]
  
  @js.native
  sealed trait startAt
    extends StObject
       with QueryConstraintType
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.QueryConstraintType
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.QueryConstraintType
       with typingsJapgolly.firebaseFirestore.distInternalMod.QueryConstraintType
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryConstraintType
       with typingsJapgolly.firebaseFirestore.distLiteMod.QueryConstraintType
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.QueryConstraintType
       with typingsJapgolly.firebaseFirestore.distPrivateMod.QueryConstraintType
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraintType
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraintType
  inline def startAt: startAt = "startAt".asInstanceOf[startAt]
  
  @js.native
  sealed trait string
    extends StObject
       with ValidationType
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcUtilInputValidationMod.ValidationType
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcUtilInputValidationMod.ValidationType
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcUtilInputValidationMod.ValidationType
  inline def string: string = "string".asInstanceOf[string]
  
  @js.native
  sealed trait transaction_retry
    extends StObject
       with TimerId
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcUtilAsyncQueueMod.TimerId
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.TimerId
       with typingsJapgolly.firebaseFirestore.distInternalMod.TimerId
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcUtilAsyncQueueMod.TimerId
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcUtilAsyncQueueMod.TimerId
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.TimerId
       with typingsJapgolly.firebaseFirestore.distPrivateMod.TimerId
  inline def transaction_retry: transaction_retry = "transaction_retry".asInstanceOf[transaction_retry]
  
  @js.native
  sealed trait unauthenticated
    extends StObject
       with FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcUtilErrorMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.mod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distInternalMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distLiteMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcUtilErrorMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distPrivateMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcUtilErrorMod.FirestoreErrorCode
  inline def unauthenticated: unauthenticated = "unauthenticated".asInstanceOf[unauthenticated]
  
  @js.native
  sealed trait unavailable
    extends StObject
       with FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcUtilErrorMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.mod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distInternalMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distLiteMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcUtilErrorMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distPrivateMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcUtilErrorMod.FirestoreErrorCode
  inline def unavailable: unavailable = "unavailable".asInstanceOf[unavailable]
  
  @js.native
  sealed trait undefined
    extends StObject
       with ValidationType
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcUtilInputValidationMod.ValidationType
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcUtilInputValidationMod.ValidationType
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcUtilInputValidationMod.ValidationType
  inline def undefined: undefined = "undefined".asInstanceOf[undefined]
  
  @js.native
  sealed trait unimplemented
    extends StObject
       with FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcUtilErrorMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.mod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distInternalMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distLiteMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcUtilErrorMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distPrivateMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcUtilErrorMod.FirestoreErrorCode
  inline def unimplemented: unimplemented = "unimplemented".asInstanceOf[unimplemented]
  
  @js.native
  sealed trait unknown_
    extends StObject
       with FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcUtilErrorMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.mod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distInternalMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distLiteMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcUtilErrorMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distPrivateMod.FirestoreErrorCode
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcUtilErrorMod.FirestoreErrorCode
  inline def unknown_ : unknown_ = "unknown".asInstanceOf[unknown_]
  
  @js.native
  sealed trait updateClientMetadataAndTryBecomePrimary
    extends StObject
       with PersistenceAction
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typingsJapgolly.firebaseFirestore.distFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
  inline def updateClientMetadataAndTryBecomePrimary: updateClientMetadataAndTryBecomePrimary = "updateClientMetadataAndTryBecomePrimary".asInstanceOf[updateClientMetadataAndTryBecomePrimary]
  
  @js.native
  sealed trait watchChange
    extends StObject
       with StreamEventType
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreTestIntegrationRemoteStreamDottestMod.StreamEventType
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreTestIntegrationRemoteStreamDottestMod.StreamEventType
       with typingsJapgolly.firebaseFirestore.distFirestoreTestIntegrationRemoteStreamDottestMod.StreamEventType
  inline def watchChange: watchChange = "watchChange".asInstanceOf[watchChange]
  
  @js.native
  sealed trait where
    extends StObject
       with QueryConstraintType
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.QueryConstraintType
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcLiteApiQueryMod.QueryConstraintType
       with typingsJapgolly.firebaseFirestore.distInternalMod.QueryConstraintType
       with typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiQueryMod.QueryConstraintType
       with typingsJapgolly.firebaseFirestore.distLiteMod.QueryConstraintType
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.QueryConstraintType
       with typingsJapgolly.firebaseFirestore.distPrivateMod.QueryConstraintType
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcLiteApiQueryMod.QueryConstraintType
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLiteApiQueryMod.QueryConstraintType
  inline def where: where = "where".asInstanceOf[where]
  
  @js.native
  sealed trait write_stream_connection_backoff
    extends StObject
       with TimerId
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcUtilAsyncQueueMod.TimerId
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.TimerId
       with typingsJapgolly.firebaseFirestore.distInternalMod.TimerId
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcUtilAsyncQueueMod.TimerId
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcUtilAsyncQueueMod.TimerId
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.TimerId
       with typingsJapgolly.firebaseFirestore.distPrivateMod.TimerId
  inline def write_stream_connection_backoff: write_stream_connection_backoff = "write_stream_connection_backoff".asInstanceOf[write_stream_connection_backoff]
  
  @js.native
  sealed trait write_stream_idle
    extends StObject
       with TimerId
       with typingsJapgolly.firebaseFirestore.distFirestoreSrcUtilAsyncQueueMod.TimerId
       with typingsJapgolly.firebaseFirestore.distLiteInternalMod.TimerId
       with typingsJapgolly.firebaseFirestore.distInternalMod.TimerId
       with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcUtilAsyncQueueMod.TimerId
       with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcUtilAsyncQueueMod.TimerId
       with typingsJapgolly.firebaseFirestore.distLitePrivateMod.TimerId
       with typingsJapgolly.firebaseFirestore.distPrivateMod.TimerId
  inline def write_stream_idle: write_stream_idle = "write_stream_idle".asInstanceOf[write_stream_idle]
}
