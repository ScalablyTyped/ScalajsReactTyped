package typingsJapgolly.forgeApis.mod

import typingsJapgolly.forgeApis.AnonAccess
import typingsJapgolly.forgeApis.AnonBeginsWith
import typingsJapgolly.forgeApis.AnonContentDisposition
import typingsJapgolly.forgeApis.AnonIfMatch
import typingsJapgolly.forgeApis.AnonIfModifiedSince
import typingsJapgolly.forgeApis.AnonIfNoneMatch
import typingsJapgolly.forgeApis.AnonWith
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("forge-apis", "ObjectsApi")
@js.native
class ObjectsApi () extends js.Object {
  /**
    * Copies an object to another object name in the same bucket.
    */
  def copyTo(
    bucketKey: String,
    objectName: String,
    newObjName: String,
    oauth2Client: AuthClient,
    credentials: AuthToken
  ): js.Promise[ApiResponse] = js.native
  /**
    * This endpoint creates a signed URL that can be used to download an object within the specified expiration time. Be aware that
    * if the object the signed URL points to is deleted or expires before the signed URL expires, then the signed URL will no longer
    * be valid. A successful call to this endpoint requires bucket owner access.
    */
  def createSignedResource(
    bucketKey: String,
    objectName: String,
    postBucketsSigned: PostBucketsSigned,
    opts: AnonAccess,
    oauth2Client: AuthClient,
    credentials: AuthToken
  ): js.Promise[ApiResponse] = js.native
  /**
    * Deletes an object from the bucket.
    */
  def deleteObject(bucketKey: String, objectName: String, oauth2Client: AuthClient, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  /**
    * Delete a signed URL. A successful call to this endpoint requires bucket owner access.
    */
  def deleteSignedResource(id: String, region: String, oauth2Client: AuthClient, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  /**
    * Download an object.
    */
  def getObject(
    bucketKey: String,
    objectName: String,
    opts: AnonIfModifiedSince,
    oauth2Client: AuthClient,
    credentials: AuthToken
  ): js.Promise[ApiResponse] = js.native
  /**
    * Returns object details in JSON format.
    */
  def getObjectDetails(
    bucketKey: String,
    objectName: String,
    opts: AnonWith,
    oauth2Client: AuthClient,
    credentials: AuthToken
  ): js.Promise[ApiResponse] = js.native
  /**
    * List objects in a bucket. It is only available to the bucket creator.
    */
  def getObjects(bucketKey: String, opts: AnonBeginsWith, oauth2Client: AuthClient, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  /**
    * Download an object using a signed URL.
    */
  def getSignedResource(id: String, opts: AnonIfNoneMatch, oauth2Client: AuthClient, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  /**
    * This endpoint returns status information about a resumable upload.
    */
  def getStatusBySessionId(
    bucketKey: String,
    objectName: String,
    sessionId: String,
    oauth2Client: AuthClient,
    credentials: AuthToken
  ): js.Promise[ApiResponse] = js.native
  /**
    * This endpoint allows resumable uploads for large files in chunks.
    */
  def uploadChunk(
    bucketKey: String,
    objectName: String,
    contentLength: Double,
    contentRange: String,
    sessionId: String,
    body: String,
    opts: AnonContentDisposition,
    oauth2Client: AuthClient,
    credentials: AuthToken
  ): js.Promise[ApiResponse] = js.native
  def uploadChunk(
    bucketKey: String,
    objectName: String,
    contentLength: Double,
    contentRange: String,
    sessionId: String,
    body: Buffer,
    opts: AnonContentDisposition,
    oauth2Client: AuthClient,
    credentials: AuthToken
  ): js.Promise[ApiResponse] = js.native
  /**
    * Upload an object. If the specified object name already exists in the bucket, the uploaded content will
    * overwrite the existing content for the bucket name/object name combination.
    */
  def uploadObject(
    bucketKey: String,
    objectName: String,
    contentLength: Double,
    body: String,
    opts: AnonContentDisposition,
    oauth2Client: AuthClient,
    credentials: AuthToken
  ): js.Promise[ApiResponse] = js.native
  def uploadObject(
    bucketKey: String,
    objectName: String,
    contentLength: Double,
    body: Buffer,
    opts: AnonContentDisposition,
    oauth2Client: AuthClient,
    credentials: AuthToken
  ): js.Promise[ApiResponse] = js.native
  /**
    * Overwrite a existing object using a signed URL. Conditions to call this operation: Object is available Expiration
    * period is valid Signed URL should be created with `write` or `readwrite`.
    */
  def uploadSignedResource(
    id: String,
    contentLength: Double,
    body: String,
    opts: AnonIfMatch,
    oauth2Client: AuthClient,
    credentials: AuthToken
  ): js.Promise[ApiResponse] = js.native
  def uploadSignedResource(
    id: String,
    contentLength: Double,
    body: Buffer,
    opts: AnonIfMatch,
    oauth2Client: AuthClient,
    credentials: AuthToken
  ): js.Promise[ApiResponse] = js.native
  /**
    * Resumable upload for signed URLs.
    */
  def uploadSignedResourcesChunk(
    id: String,
    contentLength: Double,
    sessionId: String,
    body: String,
    opts: AnonContentDisposition,
    oauth2Client: AuthClient,
    credentials: AuthToken
  ): js.Promise[ApiResponse] = js.native
  def uploadSignedResourcesChunk(
    id: String,
    contentLength: Double,
    sessionId: String,
    body: Buffer,
    opts: AnonContentDisposition,
    oauth2Client: AuthClient,
    credentials: AuthToken
  ): js.Promise[ApiResponse] = js.native
}

