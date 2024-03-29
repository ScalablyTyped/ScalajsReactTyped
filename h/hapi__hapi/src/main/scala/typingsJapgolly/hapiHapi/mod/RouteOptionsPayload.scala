package typingsJapgolly.hapiHapi.mod

import typingsJapgolly.hapiHapi.anon.Output
import typingsJapgolly.hapiHapi.hapiHapiBooleans.`false`
import typingsJapgolly.hapiHapi.hapiHapiStrings.gunzip
import typingsJapgolly.hapiHapi.mod.Lifecycle.FailAction
import typingsJapgolly.hapiHapi.mod.Lifecycle.ReturnValue
import typingsJapgolly.hapiHapi.mod.Util.Dictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteOptionsPayload extends StObject {
  
  /**
    * @default allows parsing of the following mime types:
    * * application/json
    * * application/ *+json
    * * application/octet-stream
    * * application/x-www-form-urlencoded
    * * multipart/form-data
    * * text/ *
    * A string or an array of strings with the allowed mime types for the endpoint. Use this settings to limit the set of allowed mime types. Note that allowing additional mime types not listed
    * above will not enable them to be parsed, and if parse is true, the request will result in an error response.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionspayloadallow)
    */
  var allow: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    * @default none.
    * An object where each key is a content-encoding name and each value is an object with the desired decoder settings. Note that encoder settings are set in compression.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionspayloadcompression)
    */
  var compression: js.UndefOr[Dictionary[PayloadCompressionDecoderSettings]] = js.undefined
  
  /**
    * @default 'application/json'.
    * The default content type if the 'Content-Type' request header is missing.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionspayloaddefaultcontenttype)
    */
  var defaultContentType: js.UndefOr[String] = js.undefined
  
  /**
    * @default 'error' (return a Bad Request (400) error response).
    * A failAction value which determines how to handle payload parsing errors.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionspayloadfailaction)
    */
  var failAction: js.UndefOr[FailAction] = js.undefined
  
  /**
    * @default 1048576 (1MB).
    * Limits the size of incoming payloads to the specified byte count. Allowing very large payloads may cause the server to run out of memory.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionspayloadmaxbytes)
    */
  var maxBytes: js.UndefOr[Double] = js.undefined
  
  /**
    * @default none.
    * Overrides payload processing for multipart requests. Value can be one of:
    * * false - disable multipart processing.
    * an object with the following required options:
    * * output - same as the output option with an additional value option:
    * * * annotated - wraps each multipart part in an object with the following keys: // TODO type this?
    * * * * headers - the part headers.
    * * * * filename - the part file name.
    * * * * payload - the processed part payload.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionspayloadmultipart)
    */
  var multipart: js.UndefOr[`false` | Output] = js.undefined
  
  /**
    * @default 'data'.
    * The processed payload format. The value must be one of:
    * * 'data' - the incoming payload is read fully into memory. If parse is true, the payload is parsed (JSON, form-decoded, multipart) based on the 'Content-Type' header. If parse is false, a raw
    * Buffer is returned.
    * * 'stream' - the incoming payload is made available via a Stream.Readable interface. If the payload is 'multipart/form-data' and parse is true, field values are presented as text while files
    * are provided as streams. File streams from a 'multipart/form-data' upload will also have a hapi property containing the filename and headers properties. Note that payload streams for multipart
    * payloads are a synthetic interface created on top of the entire mutlipart content loaded into memory. To avoid loading large multipart payloads into memory, set parse to false and handle the
    * multipart payload in the handler using a streaming parser (e.g. pez).
    * * 'file' - the incoming payload is written to temporary file in the directory specified by the uploads settings. If the payload is 'multipart/form-data' and parse is true, field values are
    * presented as text while files are saved to disk. Note that it is the sole responsibility of the application to clean up the files generated by the framework. This can be done by keeping track
    * of which files are used (e.g. using the request.app object), and listening to the server 'response' event to perform cleanup.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionspayloadoutput)
    */
  var output: js.UndefOr[PayloadOutput] = js.undefined
  
  /**
    * @default none.
    * A mime type string overriding the 'Content-Type' header value received.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionspayloadoverride)
    */
  var `override`: js.UndefOr[String] = js.undefined
  
  /**
    * @default true.
    * Determines if the incoming payload is processed or presented raw. Available values:
    * * true - if the request 'Content-Type' matches the allowed mime types set by allow (for the whole payload as well as parts), the payload is converted into an object when possible. If the
    * format is unknown, a Bad Request (400) error response is sent. Any known content encoding is decoded.
    * * false - the raw payload is returned unmodified.
    * * 'gunzip' - the raw payload is returned unmodified after any known content encoding is decoded.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionspayloadparse)
    */
  var parse: js.UndefOr[Boolean | gunzip] = js.undefined
  
  /**
    * @default to 10000 (10 seconds).
    * Payload reception timeout in milliseconds. Sets the maximum time allowed for the client to transmit the request payload (body) before giving up and responding with a Request Timeout (408)
    * error response. Set to false to disable.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionspayloadtimeout)
    */
  var timeout: js.UndefOr[`false` | Double] = js.undefined
  
  /**
    * @default os.tmpdir().
    * The directory used for writing file uploads.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionspayloaduploads)
    */
  var uploads: js.UndefOr[String] = js.undefined
}
object RouteOptionsPayload {
  
  inline def apply(): RouteOptionsPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteOptionsPayload]
  }
  
  extension [Self <: RouteOptionsPayload](x: Self) {
    
    inline def setAllow(value: String | js.Array[String]): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
    
    inline def setAllowUndefined: Self = StObject.set(x, "allow", js.undefined)
    
    inline def setAllowVarargs(value: String*): Self = StObject.set(x, "allow", js.Array(value*))
    
    inline def setCompression(value: Dictionary[PayloadCompressionDecoderSettings]): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
    
    inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
    
    inline def setDefaultContentType(value: String): Self = StObject.set(x, "defaultContentType", value.asInstanceOf[js.Any])
    
    inline def setDefaultContentTypeUndefined: Self = StObject.set(x, "defaultContentType", js.undefined)
    
    inline def setFailAction(value: FailAction): Self = StObject.set(x, "failAction", value.asInstanceOf[js.Any])
    
    inline def setFailActionFunction3(
      value: (/* request */ Request, /* h */ ResponseToolkit, /* err */ js.UndefOr[js.Error]) => ReturnValue
    ): Self = StObject.set(x, "failAction", js.Any.fromFunction3(value))
    
    inline def setFailActionUndefined: Self = StObject.set(x, "failAction", js.undefined)
    
    inline def setMaxBytes(value: Double): Self = StObject.set(x, "maxBytes", value.asInstanceOf[js.Any])
    
    inline def setMaxBytesUndefined: Self = StObject.set(x, "maxBytes", js.undefined)
    
    inline def setMultipart(value: `false` | Output): Self = StObject.set(x, "multipart", value.asInstanceOf[js.Any])
    
    inline def setMultipartUndefined: Self = StObject.set(x, "multipart", js.undefined)
    
    inline def setOutput(value: PayloadOutput): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
    
    inline def setOverride(value: String): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
    
    inline def setOverrideUndefined: Self = StObject.set(x, "override", js.undefined)
    
    inline def setParse(value: Boolean | gunzip): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
    
    inline def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
    
    inline def setTimeout(value: `false` | Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setUploads(value: String): Self = StObject.set(x, "uploads", value.asInstanceOf[js.Any])
    
    inline def setUploadsUndefined: Self = StObject.set(x, "uploads", js.undefined)
  }
}
