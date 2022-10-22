package typingsJapgolly.bent

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Blob
import org.scalajs.dom.FormData
import org.scalajs.dom.ResponseType
import typingsJapgolly.bent.bentStrings.buffer
import typingsJapgolly.bent.bentStrings.json
import typingsJapgolly.bent.bentStrings.string
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.streamMod.PassThrough
import typingsJapgolly.node.streamMod.Stream
import typingsJapgolly.std.Error
import typingsJapgolly.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(baseUrl: String, args: Options*): RequestFunction[ValidResponse] = ^.asInstanceOf[js.Dynamic].apply(scala.List(baseUrl.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[RequestFunction[ValidResponse]]
  inline def apply(baseUrl: String, `type`: buffer, args: Options*): RequestFunction[Buffer | js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].apply((scala.List(baseUrl.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[RequestFunction[Buffer | js.typedarray.ArrayBuffer]]
  // Method or url first
  inline def apply(baseUrl: String, `type`: string, args: Options*): RequestFunction[String] = (^.asInstanceOf[js.Dynamic].apply((scala.List(baseUrl.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[RequestFunction[String]]
  inline def apply(`type`: buffer, args: Options*): RequestFunction[Buffer | js.typedarray.ArrayBuffer] = ^.asInstanceOf[js.Dynamic].apply(scala.List(`type`.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[RequestFunction[Buffer | js.typedarray.ArrayBuffer]]
  // Type first
  inline def apply(`type`: string, args: Options*): RequestFunction[String] = ^.asInstanceOf[js.Dynamic].apply(scala.List(`type`.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[RequestFunction[String]]
  // tslint:disable-next-line no-unnecessary-generics
  inline def apply[T /* <: ValidResponse */](args: Options*): RequestFunction[T] = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[RequestFunction[T]]
  inline def apply[T /* <: Json */](baseUrl: String, `type`: json, args: Options*): // tslint:disable-next-line no-unnecessary-generics
  RequestFunction[T] = (^.asInstanceOf[js.Dynamic].apply((scala.List(baseUrl.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[// tslint:disable-next-line no-unnecessary-generics
  RequestFunction[T]]
  // tslint:disable-next-line no-unnecessary-generics
  inline def apply[T /* <: Json */](`type`: json, args: Options*): RequestFunction[T] = ^.asInstanceOf[js.Dynamic].apply(scala.List(`type`.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[RequestFunction[T]]
  
  @JSImport("bent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("bent", "StatusError")
  @js.native
  open class StatusError ()
    extends StObject
       with Error {
    
    def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer | Buffer] = js.native
    
    var headers: StringDictionary[Any] = js.native
    
    def json(): js.Promise[Json] = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var responseBody: js.Promise[js.typedarray.ArrayBuffer | Buffer] = js.native
    
    var statusCode: Double = js.native
    
    def text(): js.Promise[String] = js.native
  }
  
  type BaseUrl = String
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.bent.mod.NodeResponse
    - typingsJapgolly.bent.mod.FetchResponse
  */
  trait BentResponse extends StObject
  
  trait FetchResponse
    extends StObject
       with Response
       with BentResponse {
    
    var statusCode: Double
  }
  object FetchResponse {
    
    inline def apply(
      arrayBuffer: CallbackTo[js.Promise[js.typedarray.ArrayBuffer]],
      blob: CallbackTo[js.Promise[Blob]],
      bodyUsed: Boolean,
      formData: CallbackTo[js.Promise[FormData]],
      headers: org.scalajs.dom.Headers,
      json: CallbackTo[js.Promise[Any]],
      ok: Boolean,
      redirected: Boolean,
      status: Double,
      statusCode: Double,
      statusText: String,
      text: CallbackTo[js.Promise[String]],
      `type`: ResponseType,
      url: String
    ): FetchResponse = {
      val __obj = js.Dynamic.literal(arrayBuffer = arrayBuffer.toJsFn, blob = blob.toJsFn, bodyUsed = bodyUsed.asInstanceOf[js.Any], formData = formData.toJsFn, headers = headers.asInstanceOf[js.Any], json = json.toJsFn, ok = ok.asInstanceOf[js.Any], redirected = redirected.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], text = text.toJsFn, url = url.asInstanceOf[js.Any], body = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FetchResponse]
    }
    
    extension [Self <: FetchResponse](x: Self) {
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
  
  type Headers = StringDictionary[Any]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.bent.bentStrings.GET
    - typingsJapgolly.bent.bentStrings.POST
    - typingsJapgolly.bent.bentStrings.DELETE
    - typingsJapgolly.bent.bentStrings.PUT
    - typingsJapgolly.bent.bentStrings.PATCH
    - typingsJapgolly.bent.bentStrings.HEAD
    - typingsJapgolly.bent.bentStrings.OPTIONS
    - typingsJapgolly.bent.bentStrings.CONNECT
    - typingsJapgolly.bent.bentStrings.TRACE
  */
  trait HttpMethod extends StObject
  object HttpMethod {
    
    inline def CONNECT: typingsJapgolly.bent.bentStrings.CONNECT = "CONNECT".asInstanceOf[typingsJapgolly.bent.bentStrings.CONNECT]
    
    inline def DELETE: typingsJapgolly.bent.bentStrings.DELETE = "DELETE".asInstanceOf[typingsJapgolly.bent.bentStrings.DELETE]
    
    inline def GET: typingsJapgolly.bent.bentStrings.GET = "GET".asInstanceOf[typingsJapgolly.bent.bentStrings.GET]
    
    inline def HEAD: typingsJapgolly.bent.bentStrings.HEAD = "HEAD".asInstanceOf[typingsJapgolly.bent.bentStrings.HEAD]
    
    inline def OPTIONS: typingsJapgolly.bent.bentStrings.OPTIONS = "OPTIONS".asInstanceOf[typingsJapgolly.bent.bentStrings.OPTIONS]
    
    inline def PATCH: typingsJapgolly.bent.bentStrings.PATCH = "PATCH".asInstanceOf[typingsJapgolly.bent.bentStrings.PATCH]
    
    inline def POST: typingsJapgolly.bent.bentStrings.POST = "POST".asInstanceOf[typingsJapgolly.bent.bentStrings.POST]
    
    inline def PUT: typingsJapgolly.bent.bentStrings.PUT = "PUT".asInstanceOf[typingsJapgolly.bent.bentStrings.PUT]
    
    inline def TRACE: typingsJapgolly.bent.bentStrings.TRACE = "TRACE".asInstanceOf[typingsJapgolly.bent.bentStrings.TRACE]
  }
  
  type Json = (StringDictionary[Any] & NumberDictionary[Any]) | js.Array[Any]
  
  @js.native
  trait NodeResponse
    extends PassThrough
       with BentResponse {
    
    def arrayBuffer(): js.Promise[Buffer] = js.native
    
    var headers: Headers = js.native
    
    def json(): js.Promise[Json] = js.native
    
    var statusCode: Double = js.native
    
    var statusMessage: String = js.native
    
    def text(): js.Promise[String] = js.native
  }
  
  type Options = HttpMethod | StatusCode | Headers | BaseUrl
  
  type RequestBody = String | Stream | Buffer | js.typedarray.ArrayBuffer | Json
  
  type RequestFunction[T /* <: ValidResponse */] = js.Function3[
    /* url */ String, 
    /* body */ js.UndefOr[RequestBody], 
    /* headers */ js.UndefOr[Headers], 
    js.Promise[T]
  ]
  
  type StatusCode = Double
  
  type ValidResponse = BentResponse | String | Buffer | js.typedarray.ArrayBuffer | Json
}
