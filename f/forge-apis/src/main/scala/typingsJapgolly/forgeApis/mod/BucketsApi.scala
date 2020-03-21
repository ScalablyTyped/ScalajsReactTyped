package typingsJapgolly.forgeApis.mod

import typingsJapgolly.forgeApis.AnonLimit
import typingsJapgolly.forgeApis.AnonXAdsRegion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("forge-apis", "BucketsApi")
@js.native
class BucketsApi () extends js.Object {
  /**
    * Use this endpoint to create a bucket. Buckets are arbitrary spaces created and owned by applications.
    * Bucket keys are globally unique across all regions, regardless of where they were created, and they
    * cannot be changed. The application creating the bucket is the owner of the bucket.
    */
  def createBucket(
    postBuckets: PostBucketsPayload,
    opts: AnonXAdsRegion,
    oauth2Client: AuthClient,
    credentials: AuthToken
  ): js.Promise[ApiResponse] = js.native
  /**
    * This endpoint will delete a bucket.
    */
  def deleteBucket(bucketKey: String, oauth2Client: AuthClient, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  /**
    * This endpoint will return the details of a bucket.
    */
  def getBucketDetails(bucketKey: String, oauth2Client: AuthClient, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  /**
    * This endpoint will return the buckets owned by the application. This endpoint supports pagination.
    */
  def getBuckets(opts: AnonLimit, oauth2Client: AuthClient, credentials: AuthToken): js.Promise[ApiResponse] = js.native
}

