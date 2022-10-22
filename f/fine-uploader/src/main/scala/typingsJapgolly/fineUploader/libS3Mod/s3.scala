package typingsJapgolly.fineUploader.libS3Mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.fineUploader.libCoreMod.ChunkingOptions
import typingsJapgolly.fineUploader.libCoreMod.CoreEvents
import typingsJapgolly.fineUploader.libCoreMod.CoreOptions
import typingsJapgolly.fineUploader.libCoreMod.CorsOptions
import typingsJapgolly.fineUploader.libCoreMod.PromiseOptions
import typingsJapgolly.fineUploader.libCoreMod.RequestOptions
import typingsJapgolly.fineUploader.libCoreMod.ResumableFileObject
import typingsJapgolly.fineUploader.mod.UIOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object s3 {
  
  @JSImport("fine-uploader/lib/s3", "s3.FineUploader")
  @js.native
  open class FineUploader ()
    extends typingsJapgolly.fineUploader.mod.FineUploader {
    def this(fineuploaderOptions: S3UIOptions) = this()
    
    /**
      * Retrieve the S3 bucket name associated with the passed file (id). Note that the bucket name is not available before the file has started uploading
      *
      * @param number fileId : An ID corresponding to a file
      * @returns string : The S3 bucket name associated with the passed file (id)
      */
    def getBucket(fileId: Double): String = js.native
    
    /**
      * Retrieve the S3 object key associated with the passed file (id). Note that the key is not available before the file has started uploading.
      *
      * @param number fileId : An ID corresponding to a file
      * @returns string : The S3 object key associated with the passed file (id)
      */
    def getKey(fileId: Double): String = js.native
    
    /**
      * Set/update the ACL to be used for one or all file uploads. If the ID is omitted, the new ACL targets all future files that have not yet been uploaded
      *
      * @param any newAcl : Canned ACL value to be sent with the upload request. Used by S3
      * @param number id : File ID to target the ACL
      */
    def setAcl(newAcl: Any): Unit = js.native
    def setAcl(newAcl: Any, id: Double): Unit = js.native
    
    /**
      * Pass new or initial credentials. This is used to support the no-server workflow
      *
      * @param any newCredentials : The new or initial credentials to set for server-less uploads
      */
    def setCredentials(newCredentials: Any): Unit = js.native
    
    /**
      * Modify the endpoint that Fine Uploader should POST to when a file has been successfully uploaded to S3
      *
      * @param string endpoint : An endpoint that Fine Uploader should POST to when a file has been successfully uploaded to S3
      * @param number id : An ID corresponding to a file
      */
    def setUploadSuccessEndpoint(endpoint: String): Unit = js.native
    def setUploadSuccessEndpoint(endpoint: String, id: Double): Unit = js.native
    
    /**
      * Set additional parameters for the upload success request.
      *
      * ###Note:
      * Fine Uploader will still send the `bucket`, `name`, `key`, `filename`, `UUID`, and `etag` (if available) as well
      *
      * @param object newParams : The additional parameters set for the upload request
      * @param number id : A file id to apply these upload success parameters to
      */
    def setUploadSuccessParams(newParams: Any): Unit = js.native
    def setUploadSuccessParams(newParams: Any, id: Double): Unit = js.native
  }
  
  @JSImport("fine-uploader/lib/s3", "s3.FineUploaderBasic")
  @js.native
  open class FineUploaderBasic ()
    extends typingsJapgolly.fineUploader.libCoreMod.FineUploaderBasic {
    def this(fineuploaderOptions: S3CoreOptions) = this()
    
    /**
      * Retrieve the S3 bucket name associated with the passed file (id). Note that the bucket name is not available before the file has started uploading
      *
      * @param number fileId : An ID corresponding to a file
      * @returns string : The S3 bucket name associated with the passed file (id)
      */
    def getBucket(fileId: Double): String = js.native
    
    /**
      * Retrieve the S3 object key associated with the passed file (id). Note that the key is not available before the file has started uploading.
      *
      * @param number fileId : An ID corresponding to a file
      * @returns string : The S3 object key associated with the passed file (id)
      */
    def getKey(fileId: Double): String = js.native
    
    /**
      * Set/update the ACL to be used for one or all file uploads. If the ID is omitted, the new ACL targets all future files that have not yet been uploaded
      *
      * @param any newAcl : Canned ACL value to be sent with the upload request. Used by S3
      * @param number id : File ID to target the ACL
      */
    def setAcl(newAcl: Any): Unit = js.native
    def setAcl(newAcl: Any, id: Double): Unit = js.native
    
    /**
      * Pass new or initial credentials. This is used to support the no-server workflow
      *
      * @param any newCredentials : The new or initial credentials to set for server-less uploads
      */
    def setCredentials(newCredentials: Any): Unit = js.native
    
    /**
      * Modify the endpoint that Fine Uploader should POST to when a file has been successfully uploaded to S3
      *
      * @param string endpoint : An endpoint that Fine Uploader should POST to when a file has been successfully uploaded to S3
      * @param number id : An ID corresponding to a file
      */
    def setUploadSuccessEndpoint(endpoint: String): Unit = js.native
    def setUploadSuccessEndpoint(endpoint: String, id: Double): Unit = js.native
    
    /**
      * Set additional parameters for the upload success request.
      *
      * ###Note:
      * Fine Uploader will still send the `bucket`, `name`, `key`, `filename`, `UUID`, and `etag` (if available) as well
      *
      * @param object newParams : The additional parameters set for the upload request
      * @param number id : A file id to apply these upload success parameters to
      */
    def setUploadSuccessParams(newParams: Any): Unit = js.native
    def setUploadSuccessParams(newParams: Any, id: Double): Unit = js.native
  }
  
  type BucketFunction = js.Function1[/* id */ Double, PromiseOptions | String]
  
  type HostFunction = js.Function1[/* id */ Double, PromiseOptions | String]
  
  type KeyFunction = js.Function1[/* id */ Double, PromiseOptions | String]
  
  type OnCredentialsExpired = js.Function0[PromiseOptions]
  
  trait S3ChunkingOptions
    extends StObject
       with ChunkingOptions {
    
    /**
      * The maximum size of each part, in bytes
      *
      * @default `5242880`
      */
    @JSName("partSize")
    var partSize_S3ChunkingOptions: js.UndefOr[Double] = js.undefined
  }
  object S3ChunkingOptions {
    
    inline def apply(): S3ChunkingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[S3ChunkingOptions]
    }
    
    extension [Self <: S3ChunkingOptions](x: Self) {
      
      inline def setPartSize(value: Double): Self = StObject.set(x, "partSize", value.asInstanceOf[js.Any])
      
      inline def setPartSizeUndefined: Self = StObject.set(x, "partSize", js.undefined)
    }
  }
  
  trait S3CoreOptions
    extends StObject
       with CoreOptions {
    
    /**
      * chunking options
      */
    @JSName("chunking")
    var chunking_S3CoreOptions: js.UndefOr[S3ChunkingOptions] = js.undefined
    
    /**
      * cors options
      */
    @JSName("cors")
    var cors_S3CoreOptions: js.UndefOr[S3CorsOptions] = js.undefined
    
    /**
      * credentials
      */
    var credentials: js.UndefOr[S3CredentialsOptions] = js.undefined
    
    /**
      * iframeSupport options
      */
    var iframeSupport: js.UndefOr[S3iFrameSupportOptions] = js.undefined
    
    /**
      * objectProperties
      */
    var objectProperties: js.UndefOr[S3ObjectPropertyOptions] = js.undefined
    
    /**
      * request options
      */
    @JSName("request")
    var request_S3CoreOptions: js.UndefOr[S3RequestOptions] = js.undefined
    
    /**
      * signature options
      */
    var signature: js.UndefOr[S3SignatureOptions] = js.undefined
    
    /**
      * upload success options
      */
    var uploadSuccess: js.UndefOr[S3UploadSuccessOptions] = js.undefined
  }
  object S3CoreOptions {
    
    inline def apply(): S3CoreOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[S3CoreOptions]
    }
    
    extension [Self <: S3CoreOptions](x: Self) {
      
      inline def setChunking(value: S3ChunkingOptions): Self = StObject.set(x, "chunking", value.asInstanceOf[js.Any])
      
      inline def setChunkingUndefined: Self = StObject.set(x, "chunking", js.undefined)
      
      inline def setCors(value: S3CorsOptions): Self = StObject.set(x, "cors", value.asInstanceOf[js.Any])
      
      inline def setCorsUndefined: Self = StObject.set(x, "cors", js.undefined)
      
      inline def setCredentials(value: S3CredentialsOptions): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      inline def setIframeSupport(value: S3iFrameSupportOptions): Self = StObject.set(x, "iframeSupport", value.asInstanceOf[js.Any])
      
      inline def setIframeSupportUndefined: Self = StObject.set(x, "iframeSupport", js.undefined)
      
      inline def setObjectProperties(value: S3ObjectPropertyOptions): Self = StObject.set(x, "objectProperties", value.asInstanceOf[js.Any])
      
      inline def setObjectPropertiesUndefined: Self = StObject.set(x, "objectProperties", js.undefined)
      
      inline def setRequest(value: S3RequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      inline def setSignature(value: S3SignatureOptions): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
      
      inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
      
      inline def setUploadSuccess(value: S3UploadSuccessOptions): Self = StObject.set(x, "uploadSuccess", value.asInstanceOf[js.Any])
      
      inline def setUploadSuccessUndefined: Self = StObject.set(x, "uploadSuccess", js.undefined)
    }
  }
  
  trait S3CorsOptions
    extends StObject
       with CorsOptions
  object S3CorsOptions {
    
    inline def apply(): S3CorsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[S3CorsOptions]
    }
  }
  
  trait S3CredentialsOptions extends StObject {
    
    /**
      * Temporary public AWS key
      *
      * @default `null`
      */
    var accessKey: js.UndefOr[String] = js.undefined
    
    /**
      * Expiration date for temporary credentials. May be an ISO 8601 String or a `Date` object.
      *
      * @default `null`
      */
    var expiration: js.UndefOr[String | js.Date] = js.undefined
    
    /**
      * Temporary secret AWS key
      *
      * @default `null`
      */
    var secretKey: js.UndefOr[String] = js.undefined
    
    /**
      * Session token associated with the temporary credentials
      *
      * @default `null`
      */
    var sessionToken: js.UndefOr[String] = js.undefined
  }
  object S3CredentialsOptions {
    
    inline def apply(): S3CredentialsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[S3CredentialsOptions]
    }
    
    extension [Self <: S3CredentialsOptions](x: Self) {
      
      inline def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      inline def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
      
      inline def setExpiration(value: String | js.Date): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
      
      inline def setExpirationUndefined: Self = StObject.set(x, "expiration", js.undefined)
      
      inline def setSecretKey(value: String): Self = StObject.set(x, "secretKey", value.asInstanceOf[js.Any])
      
      inline def setSecretKeyUndefined: Self = StObject.set(x, "secretKey", js.undefined)
      
      inline def setSessionToken(value: String): Self = StObject.set(x, "sessionToken", value.asInstanceOf[js.Any])
      
      inline def setSessionTokenUndefined: Self = StObject.set(x, "sessionToken", js.undefined)
    }
  }
  
  type S3CustomHeaderFunction = js.Function1[/* id */ Double, Unit]
  
  trait S3Events
    extends StObject
       with CoreEvents {
    
    /**
      * Called before a request is sent to S3 if the temporary credentials have expired.
      *
      * You must return a promise. If your attempt to refresh the temporary credentials is successful, you must fulfill the promise via the success method, passing the new credentials object.
      * Otherwise, call failure with a descriptive reason.
      */
    var onCredentialsExpired: js.UndefOr[OnCredentialsExpired] = js.undefined
  }
  object S3Events {
    
    inline def apply(): S3Events = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[S3Events]
    }
    
    extension [Self <: S3Events](x: Self) {
      
      inline def setOnCredentialsExpired(value: CallbackTo[PromiseOptions]): Self = StObject.set(x, "onCredentialsExpired", value.toJsFn)
      
      inline def setOnCredentialsExpiredUndefined: Self = StObject.set(x, "onCredentialsExpired", js.undefined)
    }
  }
  
  trait S3FailedUploadTextDisplayOptions extends StObject {
    
    /**
      * You will most likely want to keep this at the default value of 'custom'. See the UI options documentation for more info on this option.
      *
      * @default `'custom'`
      */
    var mode: js.UndefOr[String] = js.undefined
  }
  object S3FailedUploadTextDisplayOptions {
    
    inline def apply(): S3FailedUploadTextDisplayOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[S3FailedUploadTextDisplayOptions]
    }
    
    extension [Self <: S3FailedUploadTextDisplayOptions](x: Self) {
      
      inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    }
  }
  
  trait S3ObjectPropertyOptions extends StObject {
    
    /**
      * This value corresponds to a canned ACL
      *
      * @default `'private'`
      */
    var acl: js.UndefOr[String] = js.undefined
    
    /**
      * Describes the name of the bucket used to house the file in S3.
      *
      * This is required if the bucket cannot be determined by examining the endpoint (such as if you are using a CDN as an endpoint).
      * Possible values are a string representing the bucket name, or a function.
      *
      * If the value is a function, Fine Uploader S3 will pass the associated file ID as a parameter when invoking your function.
      * If the value is a function it may return a `promise` or a `String`
      *
      * @default `(assumes the bucket can be determined by parsing the endpoint string)`
      */
    var bucket: js.UndefOr[String | BucketFunction] = js.undefined
    
    /**
      * The hostname of your S3 bucket.
      *
      * This is required if you are using version 4 signatures and sending files through a CDN.
      * Possible values are a string representing the host name, or a function.
      *
      * If the value is a function, Fine Uploader S3 will pass the associated file ID as a parameter when invoking your function.
      * If the value is a function it may return a `promise` or a `String`.
      *
      * @default `(uses the request endpoint to determine the hostname)`
      */
    var host: js.UndefOr[String | HostFunction] = js.undefined
    
    /**
      * Describes the object key used to identify the file in your S3 bucket.
      *
      * Possible values are 'uuid', 'filename' or a function.
      *
      * If the value is a function, Fine Uploader S3 will pass the associated file ID as a parameter when invoking your function.
      * If the value is a function it may return one of a `promise` or a `String`.
      *
      * @default `'uuid'`
      */
    var key: js.UndefOr[String | KeyFunction] = js.undefined
    
    /**
      * Set this to true if you would like to use the reduced redundancy storage class for all objects uploaded to S3
      *
      * @default `false`
      */
    var reducedRedundancy: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Version 4 signatures only: The S3 region identifier for the target bucket
      *
      * @default `'us-east-1'`
      */
    var region: js.UndefOr[String] = js.undefined
    
    /**
      * Set this to true if you would like all uploaded files to be encrypted by AWS
      *
      * @default `false`
      */
    var serverSideEncryption: js.UndefOr[Boolean] = js.undefined
  }
  object S3ObjectPropertyOptions {
    
    inline def apply(): S3ObjectPropertyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[S3ObjectPropertyOptions]
    }
    
    extension [Self <: S3ObjectPropertyOptions](x: Self) {
      
      inline def setAcl(value: String): Self = StObject.set(x, "acl", value.asInstanceOf[js.Any])
      
      inline def setAclUndefined: Self = StObject.set(x, "acl", js.undefined)
      
      inline def setBucket(value: String | BucketFunction): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      inline def setBucketFunction1(value: /* id */ Double => PromiseOptions | String): Self = StObject.set(x, "bucket", js.Any.fromFunction1(value))
      
      inline def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
      
      inline def setHost(value: String | HostFunction): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostFunction1(value: /* id */ Double => PromiseOptions | String): Self = StObject.set(x, "host", js.Any.fromFunction1(value))
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setKey(value: String | KeyFunction): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyFunction1(value: /* id */ Double => PromiseOptions | String): Self = StObject.set(x, "key", js.Any.fromFunction1(value))
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setReducedRedundancy(value: Boolean): Self = StObject.set(x, "reducedRedundancy", value.asInstanceOf[js.Any])
      
      inline def setReducedRedundancyUndefined: Self = StObject.set(x, "reducedRedundancy", js.undefined)
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setServerSideEncryption(value: Boolean): Self = StObject.set(x, "serverSideEncryption", value.asInstanceOf[js.Any])
      
      inline def setServerSideEncryptionUndefined: Self = StObject.set(x, "serverSideEncryption", js.undefined)
    }
  }
  
  trait S3RequestOptions
    extends StObject
       with RequestOptions {
    
    /**
      * Your AWS public key. NOT YOUR SECRET KEY. Ignored if `credentials` have been set
      *
      * @default `null`
      */
    var accessKey: js.UndefOr[String] = js.undefined
    
    /**
      * Number of milliseconds to add to the `x-amz-date` header and the policy expiration date to account for clock drift on the browser/client machine
      *
      * @default `0`
      */
    var clockDrift: js.UndefOr[Double] = js.undefined
  }
  object S3RequestOptions {
    
    inline def apply(): S3RequestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[S3RequestOptions]
    }
    
    extension [Self <: S3RequestOptions](x: Self) {
      
      inline def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      inline def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
      
      inline def setClockDrift(value: Double): Self = StObject.set(x, "clockDrift", value.asInstanceOf[js.Any])
      
      inline def setClockDriftUndefined: Self = StObject.set(x, "clockDrift", js.undefined)
    }
  }
  
  trait S3ResumableFileObject
    extends StObject
       with ResumableFileObject {
    
    /**
      * The associated object's S3 key
      */
    var key: js.UndefOr[String] = js.undefined
  }
  object S3ResumableFileObject {
    
    inline def apply(): S3ResumableFileObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[S3ResumableFileObject]
    }
    
    extension [Self <: S3ResumableFileObject](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
  
  trait S3SignatureOptions extends StObject {
    
    /**
      * Additional headers sent along with each signature request.
      *
      * If you declare a function as the value, the associated file's ID will be passed to your function when it is invoked
      *
      * @default `{}`
      */
    var customHeaders: js.UndefOr[Any | S3CustomHeaderFunction] = js.undefined
    
    /**
      * The endpoint that Fine Uploader can use to send policy documents (HTML form uploads) or other strings to sign (REST requests) before sending requests off to S3
      *
      * @default `null`
      */
    var endpoint: js.UndefOr[String] = js.undefined
    
    /**
      * The AWS/S3 signature version to use. Currently supported values are `2` and `4`. Directly related to `objectProperties.region`
      *
      * @default `2`
      */
    var version: js.UndefOr[Double] = js.undefined
  }
  object S3SignatureOptions {
    
    inline def apply(): S3SignatureOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[S3SignatureOptions]
    }
    
    extension [Self <: S3SignatureOptions](x: Self) {
      
      inline def setCustomHeaders(value: Any | S3CustomHeaderFunction): Self = StObject.set(x, "customHeaders", value.asInstanceOf[js.Any])
      
      inline def setCustomHeadersFunction1(value: /* id */ Double => Callback): Self = StObject.set(x, "customHeaders", js.Any.fromFunction1((t0: /* id */ Double) => value(t0).runNow()))
      
      inline def setCustomHeadersUndefined: Self = StObject.set(x, "customHeaders", js.undefined)
      
      inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.fineUploader.libCoreMod.CoreOptions because Already inherited
  - typingsJapgolly.fineUploader.libS3Mod.s3.S3CoreOptions because var conflicts: autoUpload, blobs, button, callbacks, camera, chunking, cors, debug, deleteFile, disableCancelForFormUploads, extraButtons, form, formatFileName, maxConnections, messages, multiple, paste, request, resume, scaling, session, text, validation, warnBeforeUnload, workarounds. Inlined credentials, iframeSupport, objectProperties, signature, uploadSuccess */ trait S3UIOptions
    extends StObject
       with UIOptions {
    
    /**
      * chunking options
      */
    @JSName("chunking")
    var chunking_S3UIOptions: js.UndefOr[S3ChunkingOptions] = js.undefined
    
    /**
      * cors options
      */
    @JSName("cors")
    var cors_S3UIOptions: js.UndefOr[S3CorsOptions] = js.undefined
    
    /**
      * credentials
      */
    var credentials: js.UndefOr[S3CredentialsOptions] = js.undefined
    
    /**
      * failedUploadText options
      */
    @JSName("failedUploadTextDisplay")
    var failedUploadTextDisplay_S3UIOptions: js.UndefOr[S3FailedUploadTextDisplayOptions] = js.undefined
    
    /**
      * iframeSupport options
      */
    var iframeSupport: js.UndefOr[S3iFrameSupportOptions] = js.undefined
    
    /**
      * objectProperties
      */
    var objectProperties: js.UndefOr[S3ObjectPropertyOptions] = js.undefined
    
    /**
      * request options
      */
    @JSName("request")
    var request_S3UIOptions: js.UndefOr[S3RequestOptions] = js.undefined
    
    /**
      * signature options
      */
    var signature: js.UndefOr[S3SignatureOptions] = js.undefined
    
    /**
      * upload success options
      */
    var uploadSuccess: js.UndefOr[S3UploadSuccessOptions] = js.undefined
  }
  object S3UIOptions {
    
    inline def apply(): S3UIOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[S3UIOptions]
    }
    
    extension [Self <: S3UIOptions](x: Self) {
      
      inline def setChunking(value: S3ChunkingOptions): Self = StObject.set(x, "chunking", value.asInstanceOf[js.Any])
      
      inline def setChunkingUndefined: Self = StObject.set(x, "chunking", js.undefined)
      
      inline def setCors(value: S3CorsOptions): Self = StObject.set(x, "cors", value.asInstanceOf[js.Any])
      
      inline def setCorsUndefined: Self = StObject.set(x, "cors", js.undefined)
      
      inline def setCredentials(value: S3CredentialsOptions): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      inline def setFailedUploadTextDisplay(value: S3FailedUploadTextDisplayOptions): Self = StObject.set(x, "failedUploadTextDisplay", value.asInstanceOf[js.Any])
      
      inline def setFailedUploadTextDisplayUndefined: Self = StObject.set(x, "failedUploadTextDisplay", js.undefined)
      
      inline def setIframeSupport(value: S3iFrameSupportOptions): Self = StObject.set(x, "iframeSupport", value.asInstanceOf[js.Any])
      
      inline def setIframeSupportUndefined: Self = StObject.set(x, "iframeSupport", js.undefined)
      
      inline def setObjectProperties(value: S3ObjectPropertyOptions): Self = StObject.set(x, "objectProperties", value.asInstanceOf[js.Any])
      
      inline def setObjectPropertiesUndefined: Self = StObject.set(x, "objectProperties", js.undefined)
      
      inline def setRequest(value: S3RequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      inline def setSignature(value: S3SignatureOptions): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
      
      inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
      
      inline def setUploadSuccess(value: S3UploadSuccessOptions): Self = StObject.set(x, "uploadSuccess", value.asInstanceOf[js.Any])
      
      inline def setUploadSuccessUndefined: Self = StObject.set(x, "uploadSuccess", js.undefined)
    }
  }
  
  trait S3UploadSuccessOptions extends StObject {
    
    /**
      * Additional headers sent along with each signature request
      *
      * @default `{}`
      */
    var customHeaders: js.UndefOr[Any] = js.undefined
    
    /**
      * An endpoint that Fine Uploader should POST to when a file has been successfully uploaded to S3
      *
      * @default `null`
      */
    var endpoint: js.UndefOr[String] = js.undefined
    
    /**
      * The request method (i.e. POST/PUT)
      *
      * @default `POST`
      */
    var method: js.UndefOr[String] = js.undefined
    
    /**
      * Any additional parameters to attach to upload success file requests.
      *
      * ###Note:
      * Fine Uploader will still send the `bucket`, `key`, `filename`, `UUID`, and `etag` (if available) as well
      *
      * @default `{}`
      */
    var params: js.UndefOr[Any] = js.undefined
  }
  object S3UploadSuccessOptions {
    
    inline def apply(): S3UploadSuccessOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[S3UploadSuccessOptions]
    }
    
    extension [Self <: S3UploadSuccessOptions](x: Self) {
      
      inline def setCustomHeaders(value: Any): Self = StObject.set(x, "customHeaders", value.asInstanceOf[js.Any])
      
      inline def setCustomHeadersUndefined: Self = StObject.set(x, "customHeaders", js.undefined)
      
      inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setParams(value: Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    }
  }
  
  trait S3iFrameSupportOptions extends StObject {
    
    /**
      * This is required if you plan on supporting browsers that do not implement the File API, such as IE9 and older.
      * This must point to a blank page on the same origin/domain as the page hosting Fine Uploader
      *
      * @default `null`
      */
    var localBlankPagePath: js.UndefOr[String] = js.undefined
  }
  object S3iFrameSupportOptions {
    
    inline def apply(): S3iFrameSupportOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[S3iFrameSupportOptions]
    }
    
    extension [Self <: S3iFrameSupportOptions](x: Self) {
      
      inline def setLocalBlankPagePath(value: String): Self = StObject.set(x, "localBlankPagePath", value.asInstanceOf[js.Any])
      
      inline def setLocalBlankPagePathUndefined: Self = StObject.set(x, "localBlankPagePath", js.undefined)
    }
  }
}
