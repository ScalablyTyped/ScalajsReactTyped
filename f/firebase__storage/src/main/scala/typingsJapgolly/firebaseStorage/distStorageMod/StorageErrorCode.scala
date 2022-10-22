package typingsJapgolly.firebaseStorage.distStorageMod

import typingsJapgolly.firebaseStorage.firebaseStorageStrings.`app-deleted`
import typingsJapgolly.firebaseStorage.firebaseStorageStrings.`bucket-not-found`
import typingsJapgolly.firebaseStorage.firebaseStorageStrings.`cannot-slice-blob`
import typingsJapgolly.firebaseStorage.firebaseStorageStrings.`internal-error`
import typingsJapgolly.firebaseStorage.firebaseStorageStrings.`invalid-argument-count`
import typingsJapgolly.firebaseStorage.firebaseStorageStrings.`invalid-argument`
import typingsJapgolly.firebaseStorage.firebaseStorageStrings.`invalid-checksum`
import typingsJapgolly.firebaseStorage.firebaseStorageStrings.`invalid-default-bucket`
import typingsJapgolly.firebaseStorage.firebaseStorageStrings.`invalid-event-name`
import typingsJapgolly.firebaseStorage.firebaseStorageStrings.`invalid-format`
import typingsJapgolly.firebaseStorage.firebaseStorageStrings.`invalid-root-operation`
import typingsJapgolly.firebaseStorage.firebaseStorageStrings.`invalid-url`
import typingsJapgolly.firebaseStorage.firebaseStorageStrings.`no-default-bucket`
import typingsJapgolly.firebaseStorage.firebaseStorageStrings.`no-download-url`
import typingsJapgolly.firebaseStorage.firebaseStorageStrings.`object-not-found`
import typingsJapgolly.firebaseStorage.firebaseStorageStrings.`project-not-found`
import typingsJapgolly.firebaseStorage.firebaseStorageStrings.`quota-exceeded`
import typingsJapgolly.firebaseStorage.firebaseStorageStrings.`retry-limit-exceeded`
import typingsJapgolly.firebaseStorage.firebaseStorageStrings.`server-file-wrong-size`
import typingsJapgolly.firebaseStorage.firebaseStorageStrings.`unauthorized-app`
import typingsJapgolly.firebaseStorage.firebaseStorageStrings.`unsupported-environment`
import typingsJapgolly.firebaseStorage.firebaseStorageStrings.canceled
import typingsJapgolly.firebaseStorage.firebaseStorageStrings.unauthenticated
import typingsJapgolly.firebaseStorage.firebaseStorageStrings.unauthorized
import typingsJapgolly.firebaseStorage.firebaseStorageStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @public
  * Error codes that can be attached to `StorageError`s.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firebaseStorage.firebaseStorageStrings.unknown
  - typingsJapgolly.firebaseStorage.firebaseStorageStrings.`object-not-found`
  - typingsJapgolly.firebaseStorage.firebaseStorageStrings.`bucket-not-found`
  - typingsJapgolly.firebaseStorage.firebaseStorageStrings.`project-not-found`
  - typingsJapgolly.firebaseStorage.firebaseStorageStrings.`quota-exceeded`
  - typingsJapgolly.firebaseStorage.firebaseStorageStrings.unauthenticated
  - typingsJapgolly.firebaseStorage.firebaseStorageStrings.unauthorized
  - typingsJapgolly.firebaseStorage.firebaseStorageStrings.`unauthorized-app`
  - typingsJapgolly.firebaseStorage.firebaseStorageStrings.`retry-limit-exceeded`
  - typingsJapgolly.firebaseStorage.firebaseStorageStrings.`invalid-checksum`
  - typingsJapgolly.firebaseStorage.firebaseStorageStrings.canceled
  - typingsJapgolly.firebaseStorage.firebaseStorageStrings.`invalid-event-name`
  - typingsJapgolly.firebaseStorage.firebaseStorageStrings.`invalid-url`
  - typingsJapgolly.firebaseStorage.firebaseStorageStrings.`invalid-default-bucket`
  - typingsJapgolly.firebaseStorage.firebaseStorageStrings.`no-default-bucket`
  - typingsJapgolly.firebaseStorage.firebaseStorageStrings.`cannot-slice-blob`
  - typingsJapgolly.firebaseStorage.firebaseStorageStrings.`server-file-wrong-size`
  - typingsJapgolly.firebaseStorage.firebaseStorageStrings.`no-download-url`
  - typingsJapgolly.firebaseStorage.firebaseStorageStrings.`invalid-argument`
  - typingsJapgolly.firebaseStorage.firebaseStorageStrings.`invalid-argument-count`
  - typingsJapgolly.firebaseStorage.firebaseStorageStrings.`app-deleted`
  - typingsJapgolly.firebaseStorage.firebaseStorageStrings.`invalid-root-operation`
  - typingsJapgolly.firebaseStorage.firebaseStorageStrings.`invalid-format`
  - typingsJapgolly.firebaseStorage.firebaseStorageStrings.`internal-error`
  - typingsJapgolly.firebaseStorage.firebaseStorageStrings.`unsupported-environment`
*/
trait StorageErrorCode extends StObject
object StorageErrorCode {
  
  inline def APP_DELETED: `app-deleted` = "app-deleted".asInstanceOf[`app-deleted`]
  
  inline def BUCKET_NOT_FOUND: `bucket-not-found` = "bucket-not-found".asInstanceOf[`bucket-not-found`]
  
  inline def CANCELED: canceled = "canceled".asInstanceOf[canceled]
  
  inline def CANNOT_SLICE_BLOB: `cannot-slice-blob` = "cannot-slice-blob".asInstanceOf[`cannot-slice-blob`]
  
  inline def INTERNAL_ERROR: `internal-error` = "internal-error".asInstanceOf[`internal-error`]
  
  inline def INVALID_ARGUMENT: `invalid-argument` = "invalid-argument".asInstanceOf[`invalid-argument`]
  
  inline def INVALID_ARGUMENT_COUNT: `invalid-argument-count` = "invalid-argument-count".asInstanceOf[`invalid-argument-count`]
  
  inline def INVALID_CHECKSUM: `invalid-checksum` = "invalid-checksum".asInstanceOf[`invalid-checksum`]
  
  inline def INVALID_DEFAULT_BUCKET: `invalid-default-bucket` = "invalid-default-bucket".asInstanceOf[`invalid-default-bucket`]
  
  inline def INVALID_EVENT_NAME: `invalid-event-name` = "invalid-event-name".asInstanceOf[`invalid-event-name`]
  
  inline def INVALID_FORMAT: `invalid-format` = "invalid-format".asInstanceOf[`invalid-format`]
  
  inline def INVALID_ROOT_OPERATION: `invalid-root-operation` = "invalid-root-operation".asInstanceOf[`invalid-root-operation`]
  
  inline def INVALID_URL: `invalid-url` = "invalid-url".asInstanceOf[`invalid-url`]
  
  inline def NO_DEFAULT_BUCKET: `no-default-bucket` = "no-default-bucket".asInstanceOf[`no-default-bucket`]
  
  inline def NO_DOWNLOAD_URL: `no-download-url` = "no-download-url".asInstanceOf[`no-download-url`]
  
  inline def OBJECT_NOT_FOUND: `object-not-found` = "object-not-found".asInstanceOf[`object-not-found`]
  
  inline def PROJECT_NOT_FOUND: `project-not-found` = "project-not-found".asInstanceOf[`project-not-found`]
  
  inline def QUOTA_EXCEEDED: `quota-exceeded` = "quota-exceeded".asInstanceOf[`quota-exceeded`]
  
  inline def RETRY_LIMIT_EXCEEDED: `retry-limit-exceeded` = "retry-limit-exceeded".asInstanceOf[`retry-limit-exceeded`]
  
  inline def SERVER_FILE_WRONG_SIZE: `server-file-wrong-size` = "server-file-wrong-size".asInstanceOf[`server-file-wrong-size`]
  
  inline def UNAUTHENTICATED: unauthenticated = "unauthenticated".asInstanceOf[unauthenticated]
  
  inline def UNAUTHORIZED: unauthorized = "unauthorized".asInstanceOf[unauthorized]
  
  inline def UNAUTHORIZED_APP: `unauthorized-app` = "unauthorized-app".asInstanceOf[`unauthorized-app`]
  
  inline def UNKNOWN: unknown = "unknown".asInstanceOf[unknown]
  
  inline def UNSUPPORTED_ENVIRONMENT: `unsupported-environment` = "unsupported-environment".asInstanceOf[`unsupported-environment`]
}
