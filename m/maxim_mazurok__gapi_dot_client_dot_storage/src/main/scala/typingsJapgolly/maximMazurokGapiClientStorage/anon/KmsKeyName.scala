package typingsJapgolly.maximMazurokGapiClientStorage.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KmsKeyName extends StObject {
  
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  
  /** Name of the bucket in which to store the new object. Overrides the provided object metadata's bucket value, if any. */
  var bucket: String
  
  /**
    * If set, sets the contentEncoding property of the final object to this value. Setting this parameter is equivalent to setting the contentEncoding metadata property. This can be
    * useful when uploading an object with uploadType=media to indicate the encoding of the content being uploaded.
    */
  var contentEncoding: js.UndefOr[String] = js.undefined
  
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  
  /**
    * Makes the operation conditional on whether the object's current generation matches the given value. Setting to 0 makes the operation succeed only if there are no live versions
    * of the object.
    */
  var ifGenerationMatch: js.UndefOr[String] = js.undefined
  
  /**
    * Makes the operation conditional on whether the object's current generation does not match the given value. If no live object exists, the precondition fails. Setting to 0 makes
    * the operation succeed only if there is a live version of the object.
    */
  var ifGenerationNotMatch: js.UndefOr[String] = js.undefined
  
  /** Makes the operation conditional on whether the object's current metageneration matches the given value. */
  var ifMetagenerationMatch: js.UndefOr[String] = js.undefined
  
  /** Makes the operation conditional on whether the object's current metageneration does not match the given value. */
  var ifMetagenerationNotMatch: js.UndefOr[String] = js.undefined
  
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  
  /**
    * Resource name of the Cloud KMS key, of the form projects/my-project/locations/global/keyRings/my-kr/cryptoKeys/my-key, that will be used to encrypt the object. Overrides the
    * object metadata's kms_key_name value, if any.
    */
  var kmsKeyName: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the object. Required when the object metadata is not otherwise provided. Overrides the object metadata's name value, if any. For information about how to URL encode
    * object names to be path safe, see Encoding URI Path Parts.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  
  /** Apply a predefined set of access controls to this object. */
  var predefinedAcl: js.UndefOr[String] = js.undefined
  
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  
  /** Set of properties to return. Defaults to noAcl, unless the object resource specifies the acl property, when it defaults to full. */
  var projection: js.UndefOr[String] = js.undefined
  
  /** An opaque string that represents a user for quota purposes. Must not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.undefined
  
  /** Upload protocol for media (e.g. "media", "multipart", "resumable"). */
  var uploadType: js.UndefOr[String] = js.undefined
  
  /** Deprecated. Please use quotaUser instead. */
  var userIp: js.UndefOr[String] = js.undefined
  
  /** The project to be billed for this request. Required for Requester Pays buckets. */
  var userProject: js.UndefOr[String] = js.undefined
}
object KmsKeyName {
  
  inline def apply(bucket: String): KmsKeyName = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[KmsKeyName]
  }
  
  extension [Self <: KmsKeyName](x: Self) {
    
    inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    inline def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    inline def setContentEncoding(value: String): Self = StObject.set(x, "contentEncoding", value.asInstanceOf[js.Any])
    
    inline def setContentEncodingUndefined: Self = StObject.set(x, "contentEncoding", js.undefined)
    
    inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setIfGenerationMatch(value: String): Self = StObject.set(x, "ifGenerationMatch", value.asInstanceOf[js.Any])
    
    inline def setIfGenerationMatchUndefined: Self = StObject.set(x, "ifGenerationMatch", js.undefined)
    
    inline def setIfGenerationNotMatch(value: String): Self = StObject.set(x, "ifGenerationNotMatch", value.asInstanceOf[js.Any])
    
    inline def setIfGenerationNotMatchUndefined: Self = StObject.set(x, "ifGenerationNotMatch", js.undefined)
    
    inline def setIfMetagenerationMatch(value: String): Self = StObject.set(x, "ifMetagenerationMatch", value.asInstanceOf[js.Any])
    
    inline def setIfMetagenerationMatchUndefined: Self = StObject.set(x, "ifMetagenerationMatch", js.undefined)
    
    inline def setIfMetagenerationNotMatch(value: String): Self = StObject.set(x, "ifMetagenerationNotMatch", value.asInstanceOf[js.Any])
    
    inline def setIfMetagenerationNotMatchUndefined: Self = StObject.set(x, "ifMetagenerationNotMatch", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setKmsKeyName(value: String): Self = StObject.set(x, "kmsKeyName", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyNameUndefined: Self = StObject.set(x, "kmsKeyName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
    
    inline def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
    
    inline def setPredefinedAcl(value: String): Self = StObject.set(x, "predefinedAcl", value.asInstanceOf[js.Any])
    
    inline def setPredefinedAclUndefined: Self = StObject.set(x, "predefinedAcl", js.undefined)
    
    inline def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
    
    inline def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
    
    inline def setProjection(value: String): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    inline def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
    
    inline def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
    
    inline def setUploadType(value: String): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
    
    inline def setUploadTypeUndefined: Self = StObject.set(x, "uploadType", js.undefined)
    
    inline def setUserIp(value: String): Self = StObject.set(x, "userIp", value.asInstanceOf[js.Any])
    
    inline def setUserIpUndefined: Self = StObject.set(x, "userIp", js.undefined)
    
    inline def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
    
    inline def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
  }
}
