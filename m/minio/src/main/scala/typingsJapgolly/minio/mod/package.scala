package typingsJapgolly.minio.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.minio.mod.^
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def ObjectCreatedAll: NotificationEvent = ^.asInstanceOf[js.Dynamic].selectDynamic("ObjectCreatedAll").asInstanceOf[NotificationEvent]

inline def ObjectCreatedCompleteMultipartUpload: NotificationEvent = ^.asInstanceOf[js.Dynamic].selectDynamic("ObjectCreatedCompleteMultipartUpload").asInstanceOf[NotificationEvent]

inline def ObjectCreatedCopy: NotificationEvent = ^.asInstanceOf[js.Dynamic].selectDynamic("ObjectCreatedCopy").asInstanceOf[NotificationEvent]

inline def ObjectCreatedPost: NotificationEvent = ^.asInstanceOf[js.Dynamic].selectDynamic("ObjectCreatedPost").asInstanceOf[NotificationEvent]

inline def ObjectCreatedPut: NotificationEvent = ^.asInstanceOf[js.Dynamic].selectDynamic("ObjectCreatedPut").asInstanceOf[NotificationEvent]

inline def ObjectReducedRedundancyLostObject: NotificationEvent = ^.asInstanceOf[js.Dynamic].selectDynamic("ObjectReducedRedundancyLostObject").asInstanceOf[NotificationEvent]

inline def ObjectRemovedAll: NotificationEvent = ^.asInstanceOf[js.Dynamic].selectDynamic("ObjectRemovedAll").asInstanceOf[NotificationEvent]

inline def ObjectRemovedDelete: NotificationEvent = ^.asInstanceOf[js.Dynamic].selectDynamic("ObjectRemovedDelete").asInstanceOf[NotificationEvent]

inline def ObjectRemovedDeleteMarkerCreated: NotificationEvent = ^.asInstanceOf[js.Dynamic].selectDynamic("ObjectRemovedDeleteMarkerCreated").asInstanceOf[NotificationEvent]

inline def buildARN(partition: String, service: String, region: String, accountId: String, resource: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildARN")(partition.asInstanceOf[js.Any], service.asInstanceOf[js.Any], region.asInstanceOf[js.Any], accountId.asInstanceOf[js.Any], resource.asInstanceOf[js.Any])).asInstanceOf[String]

type EmptyObject = Record[String, scala.Nothing]

type Encryption = EncryptionConfig | EmptyObject

type EncryptionRule = StringDictionary[Any]

type IsoDate = String

type ItemBucketMetadata = StringDictionary[Any]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.minio.mod.LifecycleConfig
  - scala.Null
  - typingsJapgolly.minio.minioStrings._empty
*/
type Lifecycle = _Lifecycle | Null

type LifecycleRule = StringDictionary[Any]

type Lock = LockConfig | EmptyObject

type NoResultCallback = js.Function1[/* error */ js.Error | Null, Unit]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.minio.minioStrings.s3ColonObjectCreatedColonAsterisk
  - typingsJapgolly.minio.minioStrings.s3ColonObjectCreatedColonPut
  - typingsJapgolly.minio.minioStrings.s3ColonObjectCreatedColonPost
  - typingsJapgolly.minio.minioStrings.s3ColonObjectCreatedColonCopy
  - typingsJapgolly.minio.minioStrings.s3ColonObjectCreatedColonCompleteMultipartUpload
  - typingsJapgolly.minio.minioStrings.s3ColonObjectRemovedColonAsterisk
  - typingsJapgolly.minio.minioStrings.s3ColonObjectRemovedColonDelete
  - typingsJapgolly.minio.minioStrings.s3ColonObjectRemovedColonDeleteMarkerCreated
  - typingsJapgolly.minio.minioStrings.s3ColonReducedRedundancyLostObject
  - typingsJapgolly.minio.minioStrings.s3ColonTestEvent
  - typingsJapgolly.minio.minioStrings.s3ColonObjectRestoreColonPost
  - typingsJapgolly.minio.minioStrings.s3ColonObjectRestoreColonCompleted
  - typingsJapgolly.minio.minioStrings.s3ColonReplicationColonOperationFailedReplication
  - typingsJapgolly.minio.minioStrings.s3ColonReplicationColonOperationMissedThreshold
  - typingsJapgolly.minio.minioStrings.s3ColonReplicationColonOperationReplicatedAfterThreshold
  - typingsJapgolly.minio.minioStrings.s3ColonReplicationColonOperationNotTracked
  - java.lang.String
*/
type NotificationEvent = _NotificationEvent | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.minio.minioStrings.`us-east-1`
  - typingsJapgolly.minio.minioStrings.`us-west-1`
  - typingsJapgolly.minio.minioStrings.`us-west-2`
  - typingsJapgolly.minio.minioStrings.`eu-west-1`
  - typingsJapgolly.minio.minioStrings.`eu-central-1`
  - typingsJapgolly.minio.minioStrings.`ap-southeast-1`
  - typingsJapgolly.minio.minioStrings.`ap-northeast-1`
  - typingsJapgolly.minio.minioStrings.`ap-southeast-2`
  - typingsJapgolly.minio.minioStrings.`sa-east-1`
  - typingsJapgolly.minio.minioStrings.`cn-north-1`
  - java.lang.String
*/
type Region = _Region | String

type ResultCallback[T] = js.Function2[/* error */ js.Error | Null, /* result */ T, Unit]

type Retention = RetentionOptions | EmptyObject

type TagList = Record[String, String]

type VersioningConfig = Record[String | Double | js.Symbol, Any]
