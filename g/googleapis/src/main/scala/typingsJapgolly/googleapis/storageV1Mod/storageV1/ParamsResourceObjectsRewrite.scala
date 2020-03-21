package typingsJapgolly.googleapis.storageV1Mod.storageV1

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceObjectsRewrite extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Name of the bucket in which to store the new object. Overrides the
    * provided object metadata's bucket value, if any.
    */
  var destinationBucket: js.UndefOr[String] = js.native
  /**
    * Resource name of the Cloud KMS key, of the form
    * projects/my-project/locations/global/keyRings/my-kr/cryptoKeys/my-key,
    * that will be used to encrypt the object. Overrides the object metadata's
    * kms_key_name value, if any.
    */
  var destinationKmsKeyName: js.UndefOr[String] = js.native
  /**
    * Name of the new object. Required when the object metadata is not
    * otherwise provided. Overrides the object metadata's name value, if any.
    * For information about how to URL encode object names to be path safe, see
    * Encoding URI Path Parts.
    */
  var destinationObject: js.UndefOr[String] = js.native
  /**
    * Apply a predefined set of access controls to the destination object.
    */
  var destinationPredefinedAcl: js.UndefOr[String] = js.native
  /**
    * Makes the operation conditional on whether the object's current
    * generation matches the given value. Setting to 0 makes the operation
    * succeed only if there are no live versions of the object.
    */
  var ifGenerationMatch: js.UndefOr[String] = js.native
  /**
    * Makes the operation conditional on whether the object's current
    * generation does not match the given value. If no live object exists, the
    * precondition fails. Setting to 0 makes the operation succeed only if
    * there is a live version of the object.
    */
  var ifGenerationNotMatch: js.UndefOr[String] = js.native
  /**
    * Makes the operation conditional on whether the destination object's
    * current metageneration matches the given value.
    */
  var ifMetagenerationMatch: js.UndefOr[String] = js.native
  /**
    * Makes the operation conditional on whether the destination object's
    * current metageneration does not match the given value.
    */
  var ifMetagenerationNotMatch: js.UndefOr[String] = js.native
  /**
    * Makes the operation conditional on whether the source object's current
    * generation matches the given value.
    */
  var ifSourceGenerationMatch: js.UndefOr[String] = js.native
  /**
    * Makes the operation conditional on whether the source object's current
    * generation does not match the given value.
    */
  var ifSourceGenerationNotMatch: js.UndefOr[String] = js.native
  /**
    * Makes the operation conditional on whether the source object's current
    * metageneration matches the given value.
    */
  var ifSourceMetagenerationMatch: js.UndefOr[String] = js.native
  /**
    * Makes the operation conditional on whether the source object's current
    * metageneration does not match the given value.
    */
  var ifSourceMetagenerationNotMatch: js.UndefOr[String] = js.native
  /**
    * The maximum number of bytes that will be rewritten per rewrite request.
    * Most callers shouldn't need to specify this parameter - it is primarily
    * in place to support testing. If specified the value must be an integral
    * multiple of 1 MiB (1048576). Also, this only applies to requests where
    * the source and destination span locations and/or storage classes.
    * Finally, this value must not change across rewrite calls else you'll get
    * an error that the rewriteToken is invalid.
    */
  var maxBytesRewrittenPerCall: js.UndefOr[String] = js.native
  /**
    * Set of properties to return. Defaults to noAcl, unless the object
    * resource specifies the acl property, when it defaults to full.
    */
  var projection: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaObject] = js.native
  /**
    * Include this field (from the previous rewrite response) on each rewrite
    * request after the first one, until the rewrite response 'done' flag is
    * true. Calls that provide a rewriteToken can omit all other request
    * fields, but if included those fields must match the values provided in
    * the first rewrite request.
    */
  var rewriteToken: js.UndefOr[String] = js.native
  /**
    * Name of the bucket in which to find the source object.
    */
  var sourceBucket: js.UndefOr[String] = js.native
  /**
    * If present, selects a specific revision of the source object (as opposed
    * to the latest version, the default).
    */
  var sourceGeneration: js.UndefOr[String] = js.native
  /**
    * Name of the source object. For information about how to URL encode object
    * names to be path safe, see Encoding URI Path Parts.
    */
  var sourceObject: js.UndefOr[String] = js.native
  /**
    * The project to be billed for this request. Required for Requester Pays
    * buckets.
    */
  var userProject: js.UndefOr[String] = js.native
}

object ParamsResourceObjectsRewrite {
  @scala.inline
  def apply(
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    destinationBucket: String = null,
    destinationKmsKeyName: String = null,
    destinationObject: String = null,
    destinationPredefinedAcl: String = null,
    fields: String = null,
    ifGenerationMatch: String = null,
    ifGenerationNotMatch: String = null,
    ifMetagenerationMatch: String = null,
    ifMetagenerationNotMatch: String = null,
    ifSourceGenerationMatch: String = null,
    ifSourceGenerationNotMatch: String = null,
    ifSourceMetagenerationMatch: String = null,
    ifSourceMetagenerationNotMatch: String = null,
    key: String = null,
    maxBytesRewrittenPerCall: String = null,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    projection: String = null,
    quotaUser: String = null,
    requestBody: SchemaObject = null,
    rewriteToken: String = null,
    sourceBucket: String = null,
    sourceGeneration: String = null,
    sourceObject: String = null,
    userIp: String = null,
    userProject: String = null
  ): ParamsResourceObjectsRewrite = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (destinationBucket != null) __obj.updateDynamic("destinationBucket")(destinationBucket.asInstanceOf[js.Any])
    if (destinationKmsKeyName != null) __obj.updateDynamic("destinationKmsKeyName")(destinationKmsKeyName.asInstanceOf[js.Any])
    if (destinationObject != null) __obj.updateDynamic("destinationObject")(destinationObject.asInstanceOf[js.Any])
    if (destinationPredefinedAcl != null) __obj.updateDynamic("destinationPredefinedAcl")(destinationPredefinedAcl.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (ifGenerationMatch != null) __obj.updateDynamic("ifGenerationMatch")(ifGenerationMatch.asInstanceOf[js.Any])
    if (ifGenerationNotMatch != null) __obj.updateDynamic("ifGenerationNotMatch")(ifGenerationNotMatch.asInstanceOf[js.Any])
    if (ifMetagenerationMatch != null) __obj.updateDynamic("ifMetagenerationMatch")(ifMetagenerationMatch.asInstanceOf[js.Any])
    if (ifMetagenerationNotMatch != null) __obj.updateDynamic("ifMetagenerationNotMatch")(ifMetagenerationNotMatch.asInstanceOf[js.Any])
    if (ifSourceGenerationMatch != null) __obj.updateDynamic("ifSourceGenerationMatch")(ifSourceGenerationMatch.asInstanceOf[js.Any])
    if (ifSourceGenerationNotMatch != null) __obj.updateDynamic("ifSourceGenerationNotMatch")(ifSourceGenerationNotMatch.asInstanceOf[js.Any])
    if (ifSourceMetagenerationMatch != null) __obj.updateDynamic("ifSourceMetagenerationMatch")(ifSourceMetagenerationMatch.asInstanceOf[js.Any])
    if (ifSourceMetagenerationNotMatch != null) __obj.updateDynamic("ifSourceMetagenerationNotMatch")(ifSourceMetagenerationNotMatch.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (maxBytesRewrittenPerCall != null) __obj.updateDynamic("maxBytesRewrittenPerCall")(maxBytesRewrittenPerCall.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (requestBody != null) __obj.updateDynamic("requestBody")(requestBody.asInstanceOf[js.Any])
    if (rewriteToken != null) __obj.updateDynamic("rewriteToken")(rewriteToken.asInstanceOf[js.Any])
    if (sourceBucket != null) __obj.updateDynamic("sourceBucket")(sourceBucket.asInstanceOf[js.Any])
    if (sourceGeneration != null) __obj.updateDynamic("sourceGeneration")(sourceGeneration.asInstanceOf[js.Any])
    if (sourceObject != null) __obj.updateDynamic("sourceObject")(sourceObject.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    if (userProject != null) __obj.updateDynamic("userProject")(userProject.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResourceObjectsRewrite]
  }
}

