package typingsJapgolly.evaporate

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.File
import org.scalajs.dom.ReadableStream
import org.scalajs.dom.XMLHttpRequest
import typingsJapgolly.evaporate.evaporateStrings.`2`
import typingsJapgolly.evaporate.evaporateStrings.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("evaporate", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Evaporate {
    def this(config: CreateConfig) = this()
  }
  @JSImport("evaporate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(config: CreateConfig): js.Promise[Evaporate] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Evaporate]]
  
  trait AddConfig extends StObject {
    
    var beforeSigner: js.UndefOr[js.Function2[/* xhr */ XMLHttpRequest, /* url */ String, Unit]] = js.undefined
    
    var cancelled: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var complete: js.UndefOr[
        js.Function3[/* xhr */ XMLHttpRequest, /* awsObjectKey */ String, /* stats */ TransferStats, Unit]
      ] = js.undefined
    
    var contentType: js.UndefOr[String] = js.undefined
    
    var error: js.UndefOr[js.Function1[/* msg */ String, Unit]] = js.undefined
    
    var file: File
    
    var info: js.UndefOr[js.Function1[/* msg */ String, Unit]] = js.undefined
    
    var name: String
    
    var nameChanged: js.UndefOr[js.Function1[/* awsObjectKey */ String, Unit]] = js.undefined
    
    var notSignedHeadersAtInitiate: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var paused: js.UndefOr[js.Function1[/* file_key */ String, Unit]] = js.undefined
    
    var pausing: js.UndefOr[js.Function1[/* file_key */ String, Unit]] = js.undefined
    
    var progress: js.UndefOr[js.Function2[/* p */ Double, /* stats */ TransferStats, Unit]] = js.undefined
    
    var resumed: js.UndefOr[js.Function1[/* file_key */ String, Unit]] = js.undefined
    
    var started: js.UndefOr[js.Function1[/* file_key */ String, Unit]] = js.undefined
    
    var uploadInitiated: js.UndefOr[js.Function1[/* s3UploadId */ js.UndefOr[String], Unit]] = js.undefined
    
    var warn: js.UndefOr[js.Function1[/* msg */ String, Unit]] = js.undefined
    
    var xAmzHeadersAtComplete: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var xAmzHeadersAtInitiate: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var xAmzHeadersAtUpload: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var xAmzHeadersCommon: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object AddConfig {
    
    inline def apply(file: File, name: String): AddConfig = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddConfig]
    }
    
    extension [Self <: AddConfig](x: Self) {
      
      inline def setBeforeSigner(value: (/* xhr */ XMLHttpRequest, /* url */ String) => Callback): Self = StObject.set(x, "beforeSigner", js.Any.fromFunction2((t0: /* xhr */ XMLHttpRequest, t1: /* url */ String) => (value(t0, t1)).runNow()))
      
      inline def setBeforeSignerUndefined: Self = StObject.set(x, "beforeSigner", js.undefined)
      
      inline def setCancelled(value: Callback): Self = StObject.set(x, "cancelled", value.toJsFn)
      
      inline def setCancelledUndefined: Self = StObject.set(x, "cancelled", js.undefined)
      
      inline def setComplete(
        value: (/* xhr */ XMLHttpRequest, /* awsObjectKey */ String, /* stats */ TransferStats) => Callback
      ): Self = StObject.set(x, "complete", js.Any.fromFunction3((t0: /* xhr */ XMLHttpRequest, t1: /* awsObjectKey */ String, t2: /* stats */ TransferStats) => (value(t0, t1, t2)).runNow()))
      
      inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      inline def setError(value: /* msg */ String => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: /* msg */ String) => value(t0).runNow()))
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setFile(value: File): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setInfo(value: /* msg */ String => Callback): Self = StObject.set(x, "info", js.Any.fromFunction1((t0: /* msg */ String) => value(t0).runNow()))
      
      inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameChanged(value: /* awsObjectKey */ String => Callback): Self = StObject.set(x, "nameChanged", js.Any.fromFunction1((t0: /* awsObjectKey */ String) => value(t0).runNow()))
      
      inline def setNameChangedUndefined: Self = StObject.set(x, "nameChanged", js.undefined)
      
      inline def setNotSignedHeadersAtInitiate(value: StringDictionary[String]): Self = StObject.set(x, "notSignedHeadersAtInitiate", value.asInstanceOf[js.Any])
      
      inline def setNotSignedHeadersAtInitiateUndefined: Self = StObject.set(x, "notSignedHeadersAtInitiate", js.undefined)
      
      inline def setPaused(value: /* file_key */ String => Callback): Self = StObject.set(x, "paused", js.Any.fromFunction1((t0: /* file_key */ String) => value(t0).runNow()))
      
      inline def setPausedUndefined: Self = StObject.set(x, "paused", js.undefined)
      
      inline def setPausing(value: /* file_key */ String => Callback): Self = StObject.set(x, "pausing", js.Any.fromFunction1((t0: /* file_key */ String) => value(t0).runNow()))
      
      inline def setPausingUndefined: Self = StObject.set(x, "pausing", js.undefined)
      
      inline def setProgress(value: (/* p */ Double, /* stats */ TransferStats) => Callback): Self = StObject.set(x, "progress", js.Any.fromFunction2((t0: /* p */ Double, t1: /* stats */ TransferStats) => (value(t0, t1)).runNow()))
      
      inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
      
      inline def setResumed(value: /* file_key */ String => Callback): Self = StObject.set(x, "resumed", js.Any.fromFunction1((t0: /* file_key */ String) => value(t0).runNow()))
      
      inline def setResumedUndefined: Self = StObject.set(x, "resumed", js.undefined)
      
      inline def setStarted(value: /* file_key */ String => Callback): Self = StObject.set(x, "started", js.Any.fromFunction1((t0: /* file_key */ String) => value(t0).runNow()))
      
      inline def setStartedUndefined: Self = StObject.set(x, "started", js.undefined)
      
      inline def setUploadInitiated(value: /* s3UploadId */ js.UndefOr[String] => Callback): Self = StObject.set(x, "uploadInitiated", js.Any.fromFunction1((t0: /* s3UploadId */ js.UndefOr[String]) => value(t0).runNow()))
      
      inline def setUploadInitiatedUndefined: Self = StObject.set(x, "uploadInitiated", js.undefined)
      
      inline def setWarn(value: /* msg */ String => Callback): Self = StObject.set(x, "warn", js.Any.fromFunction1((t0: /* msg */ String) => value(t0).runNow()))
      
      inline def setWarnUndefined: Self = StObject.set(x, "warn", js.undefined)
      
      inline def setXAmzHeadersAtComplete(value: StringDictionary[String]): Self = StObject.set(x, "xAmzHeadersAtComplete", value.asInstanceOf[js.Any])
      
      inline def setXAmzHeadersAtCompleteUndefined: Self = StObject.set(x, "xAmzHeadersAtComplete", js.undefined)
      
      inline def setXAmzHeadersAtInitiate(value: StringDictionary[String]): Self = StObject.set(x, "xAmzHeadersAtInitiate", value.asInstanceOf[js.Any])
      
      inline def setXAmzHeadersAtInitiateUndefined: Self = StObject.set(x, "xAmzHeadersAtInitiate", js.undefined)
      
      inline def setXAmzHeadersAtUpload(value: StringDictionary[String]): Self = StObject.set(x, "xAmzHeadersAtUpload", value.asInstanceOf[js.Any])
      
      inline def setXAmzHeadersAtUploadUndefined: Self = StObject.set(x, "xAmzHeadersAtUpload", js.undefined)
      
      inline def setXAmzHeadersCommon(value: StringDictionary[String]): Self = StObject.set(x, "xAmzHeadersCommon", value.asInstanceOf[js.Any])
      
      inline def setXAmzHeadersCommonUndefined: Self = StObject.set(x, "xAmzHeadersCommon", js.undefined)
    }
  }
  
  /* Inlined std.Exclude<keyof evaporate.evaporate.CreateConfig, evaporate.evaporate.ImmutableOptionKeys> */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.evaporate.evaporateStrings.maxRetryBackoffSecs
    - typingsJapgolly.evaporate.evaporateStrings.signerUrl
    - typingsJapgolly.evaporate.evaporateStrings.abortCompletionThrottlingMs
    - typingsJapgolly.evaporate.evaporateStrings.readableStreams
    - typingsJapgolly.evaporate.evaporateStrings.sendCanonicalRequestToSignerUrl
    - typingsJapgolly.evaporate.evaporateStrings.customAuthMethod
    - typingsJapgolly.evaporate.evaporateStrings.signResponseHandler
    - typingsJapgolly.evaporate.evaporateStrings.bucket
    - typingsJapgolly.evaporate.evaporateStrings.s3FileCacheHoursAgo
    - typingsJapgolly.evaporate.evaporateStrings.retryBackoffPower
    - typingsJapgolly.evaporate.evaporateStrings.xhrWithCredentials
    - typingsJapgolly.evaporate.evaporateStrings.progressIntervalMS
    - typingsJapgolly.evaporate.evaporateStrings.maxFileSize
    - typingsJapgolly.evaporate.evaporateStrings.partSize
    - typingsJapgolly.evaporate.evaporateStrings.s3Acceleration
    - typingsJapgolly.evaporate.evaporateStrings.aws_key
    - typingsJapgolly.evaporate.evaporateStrings.signHeaders
    - typingsJapgolly.evaporate.evaporateStrings.signParams
    - typingsJapgolly.evaporate.evaporateStrings.readableStreamPartMethod
    - typingsJapgolly.evaporate.evaporateStrings.localTimeOffset
    - typingsJapgolly.evaporate.evaporateStrings.mockLocalStorage
    - typingsJapgolly.evaporate.evaporateStrings.aws_url
  */
  trait AddOverrideOptionKeys extends StObject
  object AddOverrideOptionKeys {
    
    inline def abortCompletionThrottlingMs: typingsJapgolly.evaporate.evaporateStrings.abortCompletionThrottlingMs = "abortCompletionThrottlingMs".asInstanceOf[typingsJapgolly.evaporate.evaporateStrings.abortCompletionThrottlingMs]
    
    inline def aws_key: typingsJapgolly.evaporate.evaporateStrings.aws_key = "aws_key".asInstanceOf[typingsJapgolly.evaporate.evaporateStrings.aws_key]
    
    inline def aws_url: typingsJapgolly.evaporate.evaporateStrings.aws_url = "aws_url".asInstanceOf[typingsJapgolly.evaporate.evaporateStrings.aws_url]
    
    inline def bucket: typingsJapgolly.evaporate.evaporateStrings.bucket = "bucket".asInstanceOf[typingsJapgolly.evaporate.evaporateStrings.bucket]
    
    inline def customAuthMethod: typingsJapgolly.evaporate.evaporateStrings.customAuthMethod = "customAuthMethod".asInstanceOf[typingsJapgolly.evaporate.evaporateStrings.customAuthMethod]
    
    inline def localTimeOffset: typingsJapgolly.evaporate.evaporateStrings.localTimeOffset = "localTimeOffset".asInstanceOf[typingsJapgolly.evaporate.evaporateStrings.localTimeOffset]
    
    inline def maxFileSize: typingsJapgolly.evaporate.evaporateStrings.maxFileSize = "maxFileSize".asInstanceOf[typingsJapgolly.evaporate.evaporateStrings.maxFileSize]
    
    inline def maxRetryBackoffSecs: typingsJapgolly.evaporate.evaporateStrings.maxRetryBackoffSecs = "maxRetryBackoffSecs".asInstanceOf[typingsJapgolly.evaporate.evaporateStrings.maxRetryBackoffSecs]
    
    inline def mockLocalStorage: typingsJapgolly.evaporate.evaporateStrings.mockLocalStorage = "mockLocalStorage".asInstanceOf[typingsJapgolly.evaporate.evaporateStrings.mockLocalStorage]
    
    inline def partSize: typingsJapgolly.evaporate.evaporateStrings.partSize = "partSize".asInstanceOf[typingsJapgolly.evaporate.evaporateStrings.partSize]
    
    inline def progressIntervalMS: typingsJapgolly.evaporate.evaporateStrings.progressIntervalMS = "progressIntervalMS".asInstanceOf[typingsJapgolly.evaporate.evaporateStrings.progressIntervalMS]
    
    inline def readableStreamPartMethod: typingsJapgolly.evaporate.evaporateStrings.readableStreamPartMethod = "readableStreamPartMethod".asInstanceOf[typingsJapgolly.evaporate.evaporateStrings.readableStreamPartMethod]
    
    inline def readableStreams: typingsJapgolly.evaporate.evaporateStrings.readableStreams = "readableStreams".asInstanceOf[typingsJapgolly.evaporate.evaporateStrings.readableStreams]
    
    inline def retryBackoffPower: typingsJapgolly.evaporate.evaporateStrings.retryBackoffPower = "retryBackoffPower".asInstanceOf[typingsJapgolly.evaporate.evaporateStrings.retryBackoffPower]
    
    inline def s3Acceleration: typingsJapgolly.evaporate.evaporateStrings.s3Acceleration = "s3Acceleration".asInstanceOf[typingsJapgolly.evaporate.evaporateStrings.s3Acceleration]
    
    inline def s3FileCacheHoursAgo: typingsJapgolly.evaporate.evaporateStrings.s3FileCacheHoursAgo = "s3FileCacheHoursAgo".asInstanceOf[typingsJapgolly.evaporate.evaporateStrings.s3FileCacheHoursAgo]
    
    inline def sendCanonicalRequestToSignerUrl: typingsJapgolly.evaporate.evaporateStrings.sendCanonicalRequestToSignerUrl = "sendCanonicalRequestToSignerUrl".asInstanceOf[typingsJapgolly.evaporate.evaporateStrings.sendCanonicalRequestToSignerUrl]
    
    inline def signHeaders: typingsJapgolly.evaporate.evaporateStrings.signHeaders = "signHeaders".asInstanceOf[typingsJapgolly.evaporate.evaporateStrings.signHeaders]
    
    inline def signParams: typingsJapgolly.evaporate.evaporateStrings.signParams = "signParams".asInstanceOf[typingsJapgolly.evaporate.evaporateStrings.signParams]
    
    inline def signResponseHandler: typingsJapgolly.evaporate.evaporateStrings.signResponseHandler = "signResponseHandler".asInstanceOf[typingsJapgolly.evaporate.evaporateStrings.signResponseHandler]
    
    inline def signerUrl: typingsJapgolly.evaporate.evaporateStrings.signerUrl = "signerUrl".asInstanceOf[typingsJapgolly.evaporate.evaporateStrings.signerUrl]
    
    inline def xhrWithCredentials: typingsJapgolly.evaporate.evaporateStrings.xhrWithCredentials = "xhrWithCredentials".asInstanceOf[typingsJapgolly.evaporate.evaporateStrings.xhrWithCredentials]
  }
  
  /* Inlined parent std.Pick<evaporate.evaporate.CreateConfig, evaporate.evaporate.AddOverrideOptionKeys> */
  trait AddOverrideOptions extends StObject {
    
    var abortCompletionThrottlingMs: js.UndefOr[Double] = js.undefined
    
    var aws_key: js.UndefOr[String] = js.undefined
    
    var aws_url: js.UndefOr[String] = js.undefined
    
    var bucket: String
    
    var customAuthMethod: js.UndefOr[
        Null | (js.Function5[
          /* signParams */ js.Object, 
          /* signHeaders */ js.Object, 
          /* stringToSign */ String, 
          /* signatureDateTime */ String, 
          /* canonicalRequest */ String, 
          js.Promise[String]
        ])
      ] = js.undefined
    
    var localTimeOffset: js.UndefOr[Double] = js.undefined
    
    var maxFileSize: js.UndefOr[Double] = js.undefined
    
    var maxRetryBackoffSecs: js.UndefOr[Double] = js.undefined
    
    var mockLocalStorage: js.UndefOr[Boolean] = js.undefined
    
    var partSize: js.UndefOr[Double] = js.undefined
    
    var progressIntervalMS: js.UndefOr[Double] = js.undefined
    
    var readableStreamPartMethod: js.UndefOr[
        Null | (js.Function3[/* file */ File, /* start */ Double, /* end */ Double, ReadableStream[Any]])
      ] = js.undefined
    
    var readableStreams: js.UndefOr[Boolean] = js.undefined
    
    var retryBackoffPower: js.UndefOr[Double] = js.undefined
    
    var s3Acceleration: js.UndefOr[Boolean] = js.undefined
    
    var s3FileCacheHoursAgo: js.UndefOr[Null | Double] = js.undefined
    
    var sendCanonicalRequestToSignerUrl: js.UndefOr[Boolean] = js.undefined
    
    var signHeaders: js.UndefOr[js.Object] = js.undefined
    
    var signParams: js.UndefOr[js.Object] = js.undefined
    
    var signResponseHandler: js.UndefOr[
        Null | (js.Function3[
          /* response */ Any, 
          /* stringToSign */ String, 
          /* signatureDateTime */ String, 
          js.Promise[String]
        ])
      ] = js.undefined
    
    var signerUrl: js.UndefOr[String] = js.undefined
    
    var xhrWithCredentials: js.UndefOr[Boolean] = js.undefined
  }
  object AddOverrideOptions {
    
    inline def apply(bucket: String): AddOverrideOptions = {
      val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddOverrideOptions]
    }
    
    extension [Self <: AddOverrideOptions](x: Self) {
      
      inline def setAbortCompletionThrottlingMs(value: Double): Self = StObject.set(x, "abortCompletionThrottlingMs", value.asInstanceOf[js.Any])
      
      inline def setAbortCompletionThrottlingMsUndefined: Self = StObject.set(x, "abortCompletionThrottlingMs", js.undefined)
      
      inline def setAws_key(value: String): Self = StObject.set(x, "aws_key", value.asInstanceOf[js.Any])
      
      inline def setAws_keyUndefined: Self = StObject.set(x, "aws_key", js.undefined)
      
      inline def setAws_url(value: String): Self = StObject.set(x, "aws_url", value.asInstanceOf[js.Any])
      
      inline def setAws_urlUndefined: Self = StObject.set(x, "aws_url", js.undefined)
      
      inline def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      inline def setCustomAuthMethod(
        value: (/* signParams */ js.Object, /* signHeaders */ js.Object, /* stringToSign */ String, /* signatureDateTime */ String, /* canonicalRequest */ String) => js.Promise[String]
      ): Self = StObject.set(x, "customAuthMethod", js.Any.fromFunction5(value))
      
      inline def setCustomAuthMethodNull: Self = StObject.set(x, "customAuthMethod", null)
      
      inline def setCustomAuthMethodUndefined: Self = StObject.set(x, "customAuthMethod", js.undefined)
      
      inline def setLocalTimeOffset(value: Double): Self = StObject.set(x, "localTimeOffset", value.asInstanceOf[js.Any])
      
      inline def setLocalTimeOffsetUndefined: Self = StObject.set(x, "localTimeOffset", js.undefined)
      
      inline def setMaxFileSize(value: Double): Self = StObject.set(x, "maxFileSize", value.asInstanceOf[js.Any])
      
      inline def setMaxFileSizeUndefined: Self = StObject.set(x, "maxFileSize", js.undefined)
      
      inline def setMaxRetryBackoffSecs(value: Double): Self = StObject.set(x, "maxRetryBackoffSecs", value.asInstanceOf[js.Any])
      
      inline def setMaxRetryBackoffSecsUndefined: Self = StObject.set(x, "maxRetryBackoffSecs", js.undefined)
      
      inline def setMockLocalStorage(value: Boolean): Self = StObject.set(x, "mockLocalStorage", value.asInstanceOf[js.Any])
      
      inline def setMockLocalStorageUndefined: Self = StObject.set(x, "mockLocalStorage", js.undefined)
      
      inline def setPartSize(value: Double): Self = StObject.set(x, "partSize", value.asInstanceOf[js.Any])
      
      inline def setPartSizeUndefined: Self = StObject.set(x, "partSize", js.undefined)
      
      inline def setProgressIntervalMS(value: Double): Self = StObject.set(x, "progressIntervalMS", value.asInstanceOf[js.Any])
      
      inline def setProgressIntervalMSUndefined: Self = StObject.set(x, "progressIntervalMS", js.undefined)
      
      inline def setReadableStreamPartMethod(value: (/* file */ File, /* start */ Double, /* end */ Double) => ReadableStream[Any]): Self = StObject.set(x, "readableStreamPartMethod", js.Any.fromFunction3(value))
      
      inline def setReadableStreamPartMethodNull: Self = StObject.set(x, "readableStreamPartMethod", null)
      
      inline def setReadableStreamPartMethodUndefined: Self = StObject.set(x, "readableStreamPartMethod", js.undefined)
      
      inline def setReadableStreams(value: Boolean): Self = StObject.set(x, "readableStreams", value.asInstanceOf[js.Any])
      
      inline def setReadableStreamsUndefined: Self = StObject.set(x, "readableStreams", js.undefined)
      
      inline def setRetryBackoffPower(value: Double): Self = StObject.set(x, "retryBackoffPower", value.asInstanceOf[js.Any])
      
      inline def setRetryBackoffPowerUndefined: Self = StObject.set(x, "retryBackoffPower", js.undefined)
      
      inline def setS3Acceleration(value: Boolean): Self = StObject.set(x, "s3Acceleration", value.asInstanceOf[js.Any])
      
      inline def setS3AccelerationUndefined: Self = StObject.set(x, "s3Acceleration", js.undefined)
      
      inline def setS3FileCacheHoursAgo(value: Double): Self = StObject.set(x, "s3FileCacheHoursAgo", value.asInstanceOf[js.Any])
      
      inline def setS3FileCacheHoursAgoNull: Self = StObject.set(x, "s3FileCacheHoursAgo", null)
      
      inline def setS3FileCacheHoursAgoUndefined: Self = StObject.set(x, "s3FileCacheHoursAgo", js.undefined)
      
      inline def setSendCanonicalRequestToSignerUrl(value: Boolean): Self = StObject.set(x, "sendCanonicalRequestToSignerUrl", value.asInstanceOf[js.Any])
      
      inline def setSendCanonicalRequestToSignerUrlUndefined: Self = StObject.set(x, "sendCanonicalRequestToSignerUrl", js.undefined)
      
      inline def setSignHeaders(value: js.Object): Self = StObject.set(x, "signHeaders", value.asInstanceOf[js.Any])
      
      inline def setSignHeadersUndefined: Self = StObject.set(x, "signHeaders", js.undefined)
      
      inline def setSignParams(value: js.Object): Self = StObject.set(x, "signParams", value.asInstanceOf[js.Any])
      
      inline def setSignParamsUndefined: Self = StObject.set(x, "signParams", js.undefined)
      
      inline def setSignResponseHandler(
        value: (/* response */ Any, /* stringToSign */ String, /* signatureDateTime */ String) => js.Promise[String]
      ): Self = StObject.set(x, "signResponseHandler", js.Any.fromFunction3(value))
      
      inline def setSignResponseHandlerNull: Self = StObject.set(x, "signResponseHandler", null)
      
      inline def setSignResponseHandlerUndefined: Self = StObject.set(x, "signResponseHandler", js.undefined)
      
      inline def setSignerUrl(value: String): Self = StObject.set(x, "signerUrl", value.asInstanceOf[js.Any])
      
      inline def setSignerUrlUndefined: Self = StObject.set(x, "signerUrl", js.undefined)
      
      inline def setXhrWithCredentials(value: Boolean): Self = StObject.set(x, "xhrWithCredentials", value.asInstanceOf[js.Any])
      
      inline def setXhrWithCredentialsUndefined: Self = StObject.set(x, "xhrWithCredentials", js.undefined)
    }
  }
  
  trait CreateConfig extends StObject {
    
    var abortCompletionThrottlingMs: js.UndefOr[Double] = js.undefined
    
    var allowS3ExistenceOptimization: js.UndefOr[Boolean] = js.undefined
    
    var awsRegion: js.UndefOr[String] = js.undefined
    
    var awsSignatureVersion: js.UndefOr[`2` | `4`] = js.undefined
    
    var aws_key: js.UndefOr[String] = js.undefined
    
    var aws_url: js.UndefOr[String] = js.undefined
    
    var bucket: String
    
    var cloudfront: js.UndefOr[Boolean] = js.undefined
    
    var computeContentMd5: js.UndefOr[Boolean] = js.undefined
    
    var cryptoHexEncodedHash256: js.UndefOr[
        Null | (js.Function1[/* data */ String | js.typedarray.ArrayBuffer | Null, String])
      ] = js.undefined
    
    var cryptoMd5Method: js.UndefOr[Null | (js.Function1[/* data */ js.typedarray.ArrayBuffer, String])] = js.undefined
    
    var customAuthMethod: js.UndefOr[
        Null | (js.Function5[
          /* signParams */ js.Object, 
          /* signHeaders */ js.Object, 
          /* stringToSign */ String, 
          /* signatureDateTime */ String, 
          /* canonicalRequest */ String, 
          js.Promise[String]
        ])
      ] = js.undefined
    
    var encodeFilename: js.UndefOr[Boolean] = js.undefined
    
    var evaporateChanged: js.UndefOr[js.Function2[/* evaporate */ Evaporate, /* evaporatingCount */ Double, Unit]] = js.undefined
    
    var localTimeOffset: js.UndefOr[Double] = js.undefined
    
    var logging: js.UndefOr[Boolean] = js.undefined
    
    var maxConcurrentParts: js.UndefOr[Double] = js.undefined
    
    var maxFileSize: js.UndefOr[Double] = js.undefined
    
    var maxRetryBackoffSecs: js.UndefOr[Double] = js.undefined
    
    var mockLocalStorage: js.UndefOr[Boolean] = js.undefined
    
    var onlyRetryForSameFileName: js.UndefOr[Boolean] = js.undefined
    
    var partSize: js.UndefOr[Double] = js.undefined
    
    var progressIntervalMS: js.UndefOr[Double] = js.undefined
    
    var readableStreamPartMethod: js.UndefOr[
        Null | (js.Function3[/* file */ File, /* start */ Double, /* end */ Double, ReadableStream[Any]])
      ] = js.undefined
    
    var readableStreams: js.UndefOr[Boolean] = js.undefined
    
    var retryBackoffPower: js.UndefOr[Double] = js.undefined
    
    var s3Acceleration: js.UndefOr[Boolean] = js.undefined
    
    var s3FileCacheHoursAgo: js.UndefOr[Null | Double] = js.undefined
    
    var sendCanonicalRequestToSignerUrl: js.UndefOr[Boolean] = js.undefined
    
    var signHeaders: js.UndefOr[js.Object] = js.undefined
    
    var signParams: js.UndefOr[js.Object] = js.undefined
    
    var signResponseHandler: js.UndefOr[
        Null | (js.Function3[
          /* response */ Any, 
          /* stringToSign */ String, 
          /* signatureDateTime */ String, 
          js.Promise[String]
        ])
      ] = js.undefined
    
    var signerUrl: js.UndefOr[String] = js.undefined
    
    var timeUrl: js.UndefOr[String] = js.undefined
    
    var xhrWithCredentials: js.UndefOr[Boolean] = js.undefined
  }
  object CreateConfig {
    
    inline def apply(bucket: String): CreateConfig = {
      val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateConfig]
    }
    
    extension [Self <: CreateConfig](x: Self) {
      
      inline def setAbortCompletionThrottlingMs(value: Double): Self = StObject.set(x, "abortCompletionThrottlingMs", value.asInstanceOf[js.Any])
      
      inline def setAbortCompletionThrottlingMsUndefined: Self = StObject.set(x, "abortCompletionThrottlingMs", js.undefined)
      
      inline def setAllowS3ExistenceOptimization(value: Boolean): Self = StObject.set(x, "allowS3ExistenceOptimization", value.asInstanceOf[js.Any])
      
      inline def setAllowS3ExistenceOptimizationUndefined: Self = StObject.set(x, "allowS3ExistenceOptimization", js.undefined)
      
      inline def setAwsRegion(value: String): Self = StObject.set(x, "awsRegion", value.asInstanceOf[js.Any])
      
      inline def setAwsRegionUndefined: Self = StObject.set(x, "awsRegion", js.undefined)
      
      inline def setAwsSignatureVersion(value: `2` | `4`): Self = StObject.set(x, "awsSignatureVersion", value.asInstanceOf[js.Any])
      
      inline def setAwsSignatureVersionUndefined: Self = StObject.set(x, "awsSignatureVersion", js.undefined)
      
      inline def setAws_key(value: String): Self = StObject.set(x, "aws_key", value.asInstanceOf[js.Any])
      
      inline def setAws_keyUndefined: Self = StObject.set(x, "aws_key", js.undefined)
      
      inline def setAws_url(value: String): Self = StObject.set(x, "aws_url", value.asInstanceOf[js.Any])
      
      inline def setAws_urlUndefined: Self = StObject.set(x, "aws_url", js.undefined)
      
      inline def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      inline def setCloudfront(value: Boolean): Self = StObject.set(x, "cloudfront", value.asInstanceOf[js.Any])
      
      inline def setCloudfrontUndefined: Self = StObject.set(x, "cloudfront", js.undefined)
      
      inline def setComputeContentMd5(value: Boolean): Self = StObject.set(x, "computeContentMd5", value.asInstanceOf[js.Any])
      
      inline def setComputeContentMd5Undefined: Self = StObject.set(x, "computeContentMd5", js.undefined)
      
      inline def setCryptoHexEncodedHash256(value: /* data */ String | js.typedarray.ArrayBuffer | Null => String): Self = StObject.set(x, "cryptoHexEncodedHash256", js.Any.fromFunction1(value))
      
      inline def setCryptoHexEncodedHash256Null: Self = StObject.set(x, "cryptoHexEncodedHash256", null)
      
      inline def setCryptoHexEncodedHash256Undefined: Self = StObject.set(x, "cryptoHexEncodedHash256", js.undefined)
      
      inline def setCryptoMd5Method(value: /* data */ js.typedarray.ArrayBuffer => String): Self = StObject.set(x, "cryptoMd5Method", js.Any.fromFunction1(value))
      
      inline def setCryptoMd5MethodNull: Self = StObject.set(x, "cryptoMd5Method", null)
      
      inline def setCryptoMd5MethodUndefined: Self = StObject.set(x, "cryptoMd5Method", js.undefined)
      
      inline def setCustomAuthMethod(
        value: (/* signParams */ js.Object, /* signHeaders */ js.Object, /* stringToSign */ String, /* signatureDateTime */ String, /* canonicalRequest */ String) => js.Promise[String]
      ): Self = StObject.set(x, "customAuthMethod", js.Any.fromFunction5(value))
      
      inline def setCustomAuthMethodNull: Self = StObject.set(x, "customAuthMethod", null)
      
      inline def setCustomAuthMethodUndefined: Self = StObject.set(x, "customAuthMethod", js.undefined)
      
      inline def setEncodeFilename(value: Boolean): Self = StObject.set(x, "encodeFilename", value.asInstanceOf[js.Any])
      
      inline def setEncodeFilenameUndefined: Self = StObject.set(x, "encodeFilename", js.undefined)
      
      inline def setEvaporateChanged(value: (/* evaporate */ Evaporate, /* evaporatingCount */ Double) => Callback): Self = StObject.set(x, "evaporateChanged", js.Any.fromFunction2((t0: /* evaporate */ Evaporate, t1: /* evaporatingCount */ Double) => (value(t0, t1)).runNow()))
      
      inline def setEvaporateChangedUndefined: Self = StObject.set(x, "evaporateChanged", js.undefined)
      
      inline def setLocalTimeOffset(value: Double): Self = StObject.set(x, "localTimeOffset", value.asInstanceOf[js.Any])
      
      inline def setLocalTimeOffsetUndefined: Self = StObject.set(x, "localTimeOffset", js.undefined)
      
      inline def setLogging(value: Boolean): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
      
      inline def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
      
      inline def setMaxConcurrentParts(value: Double): Self = StObject.set(x, "maxConcurrentParts", value.asInstanceOf[js.Any])
      
      inline def setMaxConcurrentPartsUndefined: Self = StObject.set(x, "maxConcurrentParts", js.undefined)
      
      inline def setMaxFileSize(value: Double): Self = StObject.set(x, "maxFileSize", value.asInstanceOf[js.Any])
      
      inline def setMaxFileSizeUndefined: Self = StObject.set(x, "maxFileSize", js.undefined)
      
      inline def setMaxRetryBackoffSecs(value: Double): Self = StObject.set(x, "maxRetryBackoffSecs", value.asInstanceOf[js.Any])
      
      inline def setMaxRetryBackoffSecsUndefined: Self = StObject.set(x, "maxRetryBackoffSecs", js.undefined)
      
      inline def setMockLocalStorage(value: Boolean): Self = StObject.set(x, "mockLocalStorage", value.asInstanceOf[js.Any])
      
      inline def setMockLocalStorageUndefined: Self = StObject.set(x, "mockLocalStorage", js.undefined)
      
      inline def setOnlyRetryForSameFileName(value: Boolean): Self = StObject.set(x, "onlyRetryForSameFileName", value.asInstanceOf[js.Any])
      
      inline def setOnlyRetryForSameFileNameUndefined: Self = StObject.set(x, "onlyRetryForSameFileName", js.undefined)
      
      inline def setPartSize(value: Double): Self = StObject.set(x, "partSize", value.asInstanceOf[js.Any])
      
      inline def setPartSizeUndefined: Self = StObject.set(x, "partSize", js.undefined)
      
      inline def setProgressIntervalMS(value: Double): Self = StObject.set(x, "progressIntervalMS", value.asInstanceOf[js.Any])
      
      inline def setProgressIntervalMSUndefined: Self = StObject.set(x, "progressIntervalMS", js.undefined)
      
      inline def setReadableStreamPartMethod(value: (/* file */ File, /* start */ Double, /* end */ Double) => ReadableStream[Any]): Self = StObject.set(x, "readableStreamPartMethod", js.Any.fromFunction3(value))
      
      inline def setReadableStreamPartMethodNull: Self = StObject.set(x, "readableStreamPartMethod", null)
      
      inline def setReadableStreamPartMethodUndefined: Self = StObject.set(x, "readableStreamPartMethod", js.undefined)
      
      inline def setReadableStreams(value: Boolean): Self = StObject.set(x, "readableStreams", value.asInstanceOf[js.Any])
      
      inline def setReadableStreamsUndefined: Self = StObject.set(x, "readableStreams", js.undefined)
      
      inline def setRetryBackoffPower(value: Double): Self = StObject.set(x, "retryBackoffPower", value.asInstanceOf[js.Any])
      
      inline def setRetryBackoffPowerUndefined: Self = StObject.set(x, "retryBackoffPower", js.undefined)
      
      inline def setS3Acceleration(value: Boolean): Self = StObject.set(x, "s3Acceleration", value.asInstanceOf[js.Any])
      
      inline def setS3AccelerationUndefined: Self = StObject.set(x, "s3Acceleration", js.undefined)
      
      inline def setS3FileCacheHoursAgo(value: Double): Self = StObject.set(x, "s3FileCacheHoursAgo", value.asInstanceOf[js.Any])
      
      inline def setS3FileCacheHoursAgoNull: Self = StObject.set(x, "s3FileCacheHoursAgo", null)
      
      inline def setS3FileCacheHoursAgoUndefined: Self = StObject.set(x, "s3FileCacheHoursAgo", js.undefined)
      
      inline def setSendCanonicalRequestToSignerUrl(value: Boolean): Self = StObject.set(x, "sendCanonicalRequestToSignerUrl", value.asInstanceOf[js.Any])
      
      inline def setSendCanonicalRequestToSignerUrlUndefined: Self = StObject.set(x, "sendCanonicalRequestToSignerUrl", js.undefined)
      
      inline def setSignHeaders(value: js.Object): Self = StObject.set(x, "signHeaders", value.asInstanceOf[js.Any])
      
      inline def setSignHeadersUndefined: Self = StObject.set(x, "signHeaders", js.undefined)
      
      inline def setSignParams(value: js.Object): Self = StObject.set(x, "signParams", value.asInstanceOf[js.Any])
      
      inline def setSignParamsUndefined: Self = StObject.set(x, "signParams", js.undefined)
      
      inline def setSignResponseHandler(
        value: (/* response */ Any, /* stringToSign */ String, /* signatureDateTime */ String) => js.Promise[String]
      ): Self = StObject.set(x, "signResponseHandler", js.Any.fromFunction3(value))
      
      inline def setSignResponseHandlerNull: Self = StObject.set(x, "signResponseHandler", null)
      
      inline def setSignResponseHandlerUndefined: Self = StObject.set(x, "signResponseHandler", js.undefined)
      
      inline def setSignerUrl(value: String): Self = StObject.set(x, "signerUrl", value.asInstanceOf[js.Any])
      
      inline def setSignerUrlUndefined: Self = StObject.set(x, "signerUrl", js.undefined)
      
      inline def setTimeUrl(value: String): Self = StObject.set(x, "timeUrl", value.asInstanceOf[js.Any])
      
      inline def setTimeUrlUndefined: Self = StObject.set(x, "timeUrl", js.undefined)
      
      inline def setXhrWithCredentials(value: Boolean): Self = StObject.set(x, "xhrWithCredentials", value.asInstanceOf[js.Any])
      
      inline def setXhrWithCredentialsUndefined: Self = StObject.set(x, "xhrWithCredentials", js.undefined)
    }
  }
  
  @js.native
  trait Evaporate extends StObject {
    
    def add(config: AddConfig): js.Promise[String] = js.native
    def add(config: AddConfig, options: AddOverrideOptions): js.Promise[String] = js.native
    
    def cancel(): js.Promise[js.Array[Unit]] = js.native
    def cancel(file_key: String): js.Promise[js.Array[Unit]] = js.native
    
    def pause(): js.Promise[js.Array[Unit]] = js.native
    def pause(file_key: String): js.Promise[js.Array[Unit]] = js.native
    def pause(file_key: String, options: js.Object): js.Promise[js.Array[Unit]] = js.native
    def pause(file_key: Unit, options: js.Object): js.Promise[js.Array[Unit]] = js.native
    
    def resume(): js.Promise[js.Array[Unit]] = js.native
    def resume(file_key: String): js.Promise[js.Array[Unit]] = js.native
    
    var supported: Boolean = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.evaporate.evaporateStrings.maxConcurrentParts
    - typingsJapgolly.evaporate.evaporateStrings.logging
    - typingsJapgolly.evaporate.evaporateStrings.cloudfront
    - typingsJapgolly.evaporate.evaporateStrings.encodeFilename
    - typingsJapgolly.evaporate.evaporateStrings.computeContentMd5
    - typingsJapgolly.evaporate.evaporateStrings.allowS3ExistenceOptimization
    - typingsJapgolly.evaporate.evaporateStrings.onlyRetryForSameFileName
    - typingsJapgolly.evaporate.evaporateStrings.timeUrl
    - typingsJapgolly.evaporate.evaporateStrings.cryptoMd5Method
    - typingsJapgolly.evaporate.evaporateStrings.cryptoHexEncodedHash256
    - typingsJapgolly.evaporate.evaporateStrings.awsRegion
    - typingsJapgolly.evaporate.evaporateStrings.awsSignatureVersion
    - typingsJapgolly.evaporate.evaporateStrings.evaporateChanged
  */
  trait ImmutableOptionKeys extends StObject
  object ImmutableOptionKeys {
    
    inline def allowS3ExistenceOptimization: typingsJapgolly.evaporate.evaporateStrings.allowS3ExistenceOptimization = "allowS3ExistenceOptimization".asInstanceOf[typingsJapgolly.evaporate.evaporateStrings.allowS3ExistenceOptimization]
    
    inline def awsRegion: typingsJapgolly.evaporate.evaporateStrings.awsRegion = "awsRegion".asInstanceOf[typingsJapgolly.evaporate.evaporateStrings.awsRegion]
    
    inline def awsSignatureVersion: typingsJapgolly.evaporate.evaporateStrings.awsSignatureVersion = "awsSignatureVersion".asInstanceOf[typingsJapgolly.evaporate.evaporateStrings.awsSignatureVersion]
    
    inline def cloudfront: typingsJapgolly.evaporate.evaporateStrings.cloudfront = "cloudfront".asInstanceOf[typingsJapgolly.evaporate.evaporateStrings.cloudfront]
    
    inline def computeContentMd5: typingsJapgolly.evaporate.evaporateStrings.computeContentMd5 = "computeContentMd5".asInstanceOf[typingsJapgolly.evaporate.evaporateStrings.computeContentMd5]
    
    inline def cryptoHexEncodedHash256: typingsJapgolly.evaporate.evaporateStrings.cryptoHexEncodedHash256 = "cryptoHexEncodedHash256".asInstanceOf[typingsJapgolly.evaporate.evaporateStrings.cryptoHexEncodedHash256]
    
    inline def cryptoMd5Method: typingsJapgolly.evaporate.evaporateStrings.cryptoMd5Method = "cryptoMd5Method".asInstanceOf[typingsJapgolly.evaporate.evaporateStrings.cryptoMd5Method]
    
    inline def encodeFilename: typingsJapgolly.evaporate.evaporateStrings.encodeFilename = "encodeFilename".asInstanceOf[typingsJapgolly.evaporate.evaporateStrings.encodeFilename]
    
    inline def evaporateChanged: typingsJapgolly.evaporate.evaporateStrings.evaporateChanged = "evaporateChanged".asInstanceOf[typingsJapgolly.evaporate.evaporateStrings.evaporateChanged]
    
    inline def logging: typingsJapgolly.evaporate.evaporateStrings.logging = "logging".asInstanceOf[typingsJapgolly.evaporate.evaporateStrings.logging]
    
    inline def maxConcurrentParts: typingsJapgolly.evaporate.evaporateStrings.maxConcurrentParts = "maxConcurrentParts".asInstanceOf[typingsJapgolly.evaporate.evaporateStrings.maxConcurrentParts]
    
    inline def onlyRetryForSameFileName: typingsJapgolly.evaporate.evaporateStrings.onlyRetryForSameFileName = "onlyRetryForSameFileName".asInstanceOf[typingsJapgolly.evaporate.evaporateStrings.onlyRetryForSameFileName]
    
    inline def timeUrl: typingsJapgolly.evaporate.evaporateStrings.timeUrl = "timeUrl".asInstanceOf[typingsJapgolly.evaporate.evaporateStrings.timeUrl]
  }
  
  trait PauseConfig extends StObject {
    
    var force: js.UndefOr[Boolean] = js.undefined
  }
  object PauseConfig {
    
    inline def apply(): PauseConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PauseConfig]
    }
    
    extension [Self <: PauseConfig](x: Self) {
      
      inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    }
  }
  
  trait TransferStats extends StObject {
    
    var fileSize: Double
    
    var loaded: Double
    
    var readableSpeed: String
    
    var remainingSize: Double
    
    var secondsLeft: Double
    
    var speed: Double
    
    var totalUploaded: Double
  }
  object TransferStats {
    
    inline def apply(
      fileSize: Double,
      loaded: Double,
      readableSpeed: String,
      remainingSize: Double,
      secondsLeft: Double,
      speed: Double,
      totalUploaded: Double
    ): TransferStats = {
      val __obj = js.Dynamic.literal(fileSize = fileSize.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any], readableSpeed = readableSpeed.asInstanceOf[js.Any], remainingSize = remainingSize.asInstanceOf[js.Any], secondsLeft = secondsLeft.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], totalUploaded = totalUploaded.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransferStats]
    }
    
    extension [Self <: TransferStats](x: Self) {
      
      inline def setFileSize(value: Double): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
      
      inline def setLoaded(value: Double): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
      
      inline def setReadableSpeed(value: String): Self = StObject.set(x, "readableSpeed", value.asInstanceOf[js.Any])
      
      inline def setRemainingSize(value: Double): Self = StObject.set(x, "remainingSize", value.asInstanceOf[js.Any])
      
      inline def setSecondsLeft(value: Double): Self = StObject.set(x, "secondsLeft", value.asInstanceOf[js.Any])
      
      inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      inline def setTotalUploaded(value: Double): Self = StObject.set(x, "totalUploaded", value.asInstanceOf[js.Any])
    }
  }
}
