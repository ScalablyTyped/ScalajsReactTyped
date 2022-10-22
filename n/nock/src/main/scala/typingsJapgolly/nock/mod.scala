package typingsJapgolly.nock

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.nock.anon.Context
import typingsJapgolly.nock.anon.Headers
import typingsJapgolly.nock.anon.Pass
import typingsJapgolly.node.NodeJS.ErrnoException
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.eventsMod.global.NodeJS.EventEmitter
import typingsJapgolly.node.fsMod.ReadStream
import typingsJapgolly.node.httpMod.ClientRequest
import typingsJapgolly.node.httpMod.ClientRequestArgs
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.urlMod.URLSearchParams
import typingsJapgolly.node.urlMod.Url
import typingsJapgolly.std.Map
import typingsJapgolly.std.ReadonlyArray
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(basePath: String): Scope = ^.asInstanceOf[js.Dynamic].apply(basePath.asInstanceOf[js.Any]).asInstanceOf[Scope]
  inline def apply(basePath: String, options: Options): Scope = (^.asInstanceOf[js.Dynamic].apply(basePath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Scope]
  inline def apply(basePath: js.RegExp): Scope = ^.asInstanceOf[js.Dynamic].apply(basePath.asInstanceOf[js.Any]).asInstanceOf[Scope]
  inline def apply(basePath: js.RegExp, options: Options): Scope = (^.asInstanceOf[js.Dynamic].apply(basePath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Scope]
  inline def apply(basePath: Url): Scope = ^.asInstanceOf[js.Dynamic].apply(basePath.asInstanceOf[js.Any]).asInstanceOf[Scope]
  inline def apply(basePath: Url, options: Options): Scope = (^.asInstanceOf[js.Dynamic].apply(basePath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Scope]
  
  @JSImport("nock", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def abortPendingRequests(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("abortPendingRequests")().asInstanceOf[Unit]
  
  inline def activate(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("activate")().asInstanceOf[Unit]
  
  inline def activeMocks(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("activeMocks")().asInstanceOf[js.Array[String]]
  
  @JSImport("nock", "back")
  @js.native
  def back: Back_ = js.native
  inline def back_=(x: Back_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("back")(x.asInstanceOf[js.Any])
  
  inline def cleanAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanAll")().asInstanceOf[Unit]
  
  inline def define(defs: js.Array[Definition]): js.Array[Scope] = ^.asInstanceOf[js.Dynamic].applyDynamic("define")(defs.asInstanceOf[js.Any]).asInstanceOf[js.Array[Scope]]
  
  inline def disableNetConnect(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableNetConnect")().asInstanceOf[Unit]
  
  @JSImport("nock", "emitter")
  @js.native
  def emitter: EventEmitter = js.native
  inline def emitter_=(x: EventEmitter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emitter")(x.asInstanceOf[js.Any])
  
  inline def enableNetConnect(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableNetConnect")().asInstanceOf[Unit]
  inline def enableNetConnect(matcher: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableNetConnect")(matcher.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def enableNetConnect(matcher: js.Function1[/* host */ String, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableNetConnect")(matcher.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def enableNetConnect(matcher: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableNetConnect")(matcher.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def isActive(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isActive")().asInstanceOf[Boolean]
  
  inline def isDone(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDone")().asInstanceOf[Boolean]
  
  inline def load(path: String): js.Array[Scope] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[Scope]]
  
  inline def loadDefs(path: String): js.Array[Definition] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadDefs")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[Definition]]
  
  inline def pendingMocks(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("pendingMocks")().asInstanceOf[js.Array[String]]
  
  @JSImport("nock", "recorder")
  @js.native
  def recorder: Recorder_ = js.native
  inline def recorder_=(x: Recorder_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("recorder")(x.asInstanceOf[js.Any])
  
  inline def removeInterceptor(interceptor: Interceptor): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("removeInterceptor")(interceptor.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def removeInterceptor(interceptor: ReqOptions): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("removeInterceptor")(interceptor.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def restore(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("restore")().asInstanceOf[Unit]
  
  trait BackContext extends StObject {
    
    def assertScopesFinished(): Unit
    
    var isLoaded: Boolean
    
    var scopes: js.Array[Scope]
  }
  object BackContext {
    
    inline def apply(assertScopesFinished: Callback, isLoaded: Boolean, scopes: js.Array[Scope]): BackContext = {
      val __obj = js.Dynamic.literal(assertScopesFinished = assertScopesFinished.toJsFn, isLoaded = isLoaded.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
      __obj.asInstanceOf[BackContext]
    }
    
    extension [Self <: BackContext](x: Self) {
      
      inline def setAssertScopesFinished(value: Callback): Self = StObject.set(x, "assertScopesFinished", value.toJsFn)
      
      inline def setIsLoaded(value: Boolean): Self = StObject.set(x, "isLoaded", value.asInstanceOf[js.Any])
      
      inline def setScopes(value: js.Array[Scope]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      inline def setScopesVarargs(value: Scope*): Self = StObject.set(x, "scopes", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.nock.nockStrings.wild
    - typingsJapgolly.nock.nockStrings.dryrun
    - typingsJapgolly.nock.nockStrings.record
    - typingsJapgolly.nock.nockStrings.update
    - typingsJapgolly.nock.nockStrings.lockdown
  */
  trait BackMode extends StObject
  object BackMode {
    
    inline def dryrun: typingsJapgolly.nock.nockStrings.dryrun = "dryrun".asInstanceOf[typingsJapgolly.nock.nockStrings.dryrun]
    
    inline def lockdown: typingsJapgolly.nock.nockStrings.lockdown = "lockdown".asInstanceOf[typingsJapgolly.nock.nockStrings.lockdown]
    
    inline def record: typingsJapgolly.nock.nockStrings.record = "record".asInstanceOf[typingsJapgolly.nock.nockStrings.record]
    
    inline def update: typingsJapgolly.nock.nockStrings.update = "update".asInstanceOf[typingsJapgolly.nock.nockStrings.update]
    
    inline def wild: typingsJapgolly.nock.nockStrings.wild = "wild".asInstanceOf[typingsJapgolly.nock.nockStrings.wild]
  }
  
  trait BackOptions extends StObject {
    
    var after: js.UndefOr[js.Function1[/* scope */ Scope, Unit]] = js.undefined
    
    var afterRecord: js.UndefOr[js.Function1[/* defs */ js.Array[Definition], js.Array[Definition]]] = js.undefined
    
    var before: js.UndefOr[js.Function1[/* def */ Definition, Unit]] = js.undefined
    
    var recorder: js.UndefOr[RecorderOptions] = js.undefined
  }
  object BackOptions {
    
    inline def apply(): BackOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BackOptions]
    }
    
    extension [Self <: BackOptions](x: Self) {
      
      inline def setAfter(value: /* scope */ Scope => Callback): Self = StObject.set(x, "after", js.Any.fromFunction1((t0: /* scope */ Scope) => value(t0).runNow()))
      
      inline def setAfterRecord(value: /* defs */ js.Array[Definition] => js.Array[Definition]): Self = StObject.set(x, "afterRecord", js.Any.fromFunction1(value))
      
      inline def setAfterRecordUndefined: Self = StObject.set(x, "afterRecord", js.undefined)
      
      inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
      
      inline def setBefore(value: /* def */ Definition => Callback): Self = StObject.set(x, "before", js.Any.fromFunction1((t0: /* def */ Definition) => value(t0).runNow()))
      
      inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      inline def setRecorder(value: RecorderOptions): Self = StObject.set(x, "recorder", value.asInstanceOf[js.Any])
      
      inline def setRecorderUndefined: Self = StObject.set(x, "recorder", js.undefined)
    }
  }
  
  @js.native
  trait Back_ extends StObject {
    
    def apply(fixtureName: String): js.Promise[Context] = js.native
    def apply(fixtureName: String, nockedFn: js.Function1[/* nockDone */ js.Function0[Unit], Unit]): Unit = js.native
    def apply(fixtureName: String, options: BackOptions): js.Promise[Context] = js.native
    def apply(
      fixtureName: String,
      options: BackOptions,
      nockedFn: js.Function1[/* nockDone */ js.Function0[Unit], Unit]
    ): Unit = js.native
    
    var currentMode: BackMode = js.native
    
    var fixtures: String = js.native
    
    def setMode(mode: BackMode): Unit = js.native
  }
  
  type Body = String | (Record[String, Any])
  
  // Essentially valid, decoded JSON with the addition of possible RegExp. TS doesn't currently have
  // a great way to represent JSON type data, this data matcher design is based off this comment.
  // https://github.com/microsoft/TypeScript/issues/1897#issuecomment-338650717
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - scala.Double
    - java.lang.String
    - scala.Null
    - scala.Unit
    - js.RegExp
    - typingsJapgolly.nock.mod.DataMatcherArray
    - typingsJapgolly.nock.mod.DataMatcherMap
  */
  type DataMatcher = js.UndefOr[_DataMatcher | Boolean | Double | String | Null | js.RegExp]
  
  @js.native
  trait DataMatcherArray
    extends StObject
       with ReadonlyArray[DataMatcher]
       with _DataMatcher
  
  trait DataMatcherMap
    extends StObject
       with /* key */ StringDictionary[DataMatcher]
       with _DataMatcher
  object DataMatcherMap {
    
    inline def apply(): DataMatcherMap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataMatcherMap]
    }
  }
  
  trait Definition extends StObject {
    
    var body: js.UndefOr[RequestBodyMatcher] = js.undefined
    
    var headers: js.UndefOr[ReplyHeaders] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var options: js.UndefOr[Options] = js.undefined
    
    var path: String | js.RegExp
    
    var port: js.UndefOr[Double | String] = js.undefined
    
    var reqheaders: js.UndefOr[Record[String, RequestHeaderMatcher]] = js.undefined
    
    var response: js.UndefOr[ReplyBody] = js.undefined
    
    var scope: String | js.RegExp
    
    var status: js.UndefOr[Double] = js.undefined
  }
  object Definition {
    
    inline def apply(path: String | js.RegExp, scope: String | js.RegExp): Definition = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[Definition]
    }
    
    extension [Self <: Definition](x: Self) {
      
      inline def setBody(value: RequestBodyMatcher): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyFunction1(value: /* body */ Any => Boolean): Self = StObject.set(x, "body", js.Any.fromFunction1(value))
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setHeaders(value: ReplyHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHeadersVarargs(value: ReplyHeaderValue*): Self = StObject.set(x, "headers", js.Array(value*))
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setPath(value: String | js.RegExp): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double | String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setReqheaders(value: Record[String, RequestHeaderMatcher]): Self = StObject.set(x, "reqheaders", value.asInstanceOf[js.Any])
      
      inline def setReqheadersUndefined: Self = StObject.set(x, "reqheaders", js.undefined)
      
      inline def setResponse(value: ReplyBody): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
      
      inline def setScope(value: String | js.RegExp): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  @js.native
  trait InterceptFunction extends StObject {
    
    def apply(uri: String): Interceptor = js.native
    def apply(uri: String, requestBody: Unit, interceptorOptions: Options): Interceptor = js.native
    def apply(uri: String, requestBody: RequestBodyMatcher): Interceptor = js.native
    def apply(uri: String, requestBody: RequestBodyMatcher, interceptorOptions: Options): Interceptor = js.native
    def apply(uri: js.Function1[/* uri */ String, Boolean]): Interceptor = js.native
    def apply(uri: js.Function1[/* uri */ String, Boolean], requestBody: Unit, interceptorOptions: Options): Interceptor = js.native
    def apply(uri: js.Function1[/* uri */ String, Boolean], requestBody: RequestBodyMatcher): Interceptor = js.native
    def apply(
      uri: js.Function1[/* uri */ String, Boolean],
      requestBody: RequestBodyMatcher,
      interceptorOptions: Options
    ): Interceptor = js.native
    def apply(uri: js.RegExp): Interceptor = js.native
    def apply(uri: js.RegExp, requestBody: Unit, interceptorOptions: Options): Interceptor = js.native
    def apply(uri: js.RegExp, requestBody: RequestBodyMatcher): Interceptor = js.native
    def apply(uri: js.RegExp, requestBody: RequestBodyMatcher, interceptorOptions: Options): Interceptor = js.native
  }
  
  @js.native
  trait Interceptor extends StObject {
    
    def basicAuth(options: Pass): this.type = js.native
    
    def delay(opts: Double): this.type = js.native
    def delay(opts: typingsJapgolly.nock.anon.Body): this.type = js.native
    
    def delayBody(timeMs: Double): this.type = js.native
    
    def delayConnection(timeMs: Double): this.type = js.native
    
    def matchHeader(name: String, value: RequestHeaderMatcher): this.type = js.native
    
    def once(): this.type = js.native
    
    def optionally(): this.type = js.native
    def optionally(flag: Boolean): this.type = js.native
    
    def query(matcher: String): this.type = js.native
    def query(
      matcher: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ /* parsedObj */ Any, 
          Boolean
        ]
    ): this.type = js.native
    def query(matcher: Boolean): this.type = js.native
    def query(matcher: DataMatcherMap): this.type = js.native
    def query(matcher: URLSearchParams): this.type = js.native
    
    def reply(): Scope = js.native
    // tslint (as of 5.16) is under the impression that the callback types can be unified,
    // however, doing so causes the params to lose their inherited types during use.
    // the order of the overrides is important for determining the param types in the replay fns.
    /* tslint:disable:unified-signatures */
    def reply(
      replyFnWithCallback: js.ThisFunction3[
          /* this */ ReplyFnContext, 
          /* uri */ String, 
          /* body */ Body, 
          /* callback */ js.Function2[/* err */ ErrnoException | Null, /* result */ ReplyFnResult, Unit], 
          Unit
        ]
    ): Scope = js.native
    def reply(
      replyFn: js.ThisFunction2[
          /* this */ ReplyFnContext, 
          /* uri */ String, 
          /* body */ Body, 
          ReplyFnResult | js.Promise[ReplyFnResult]
        ]
    ): Scope = js.native
    def reply(responseCode: Unit, body: Unit, headers: ReplyHeaders): Scope = js.native
    def reply(responseCode: Unit, body: Body): Scope = js.native
    def reply(responseCode: Unit, body: Body, headers: ReplyHeaders): Scope = js.native
    def reply(responseCode: StatusCode): Scope = js.native
    def reply(responseCode: StatusCode, body: Unit, headers: ReplyHeaders): Scope = js.native
    def reply(responseCode: StatusCode, body: Body): Scope = js.native
    def reply(responseCode: StatusCode, body: Body, headers: ReplyHeaders): Scope = js.native
    def reply(
      statusCode: StatusCode,
      replyBodyFnWithCallback: js.ThisFunction3[
          /* this */ ReplyFnContext, 
          /* uri */ String, 
          /* body */ Body, 
          /* callback */ js.Function2[/* err */ ErrnoException | Null, /* result */ ReplyBody, Unit], 
          Unit
        ]
    ): Scope = js.native
    def reply(
      statusCode: StatusCode,
      replyBodyFnWithCallback: js.ThisFunction3[
          /* this */ ReplyFnContext, 
          /* uri */ String, 
          /* body */ Body, 
          /* callback */ js.Function2[/* err */ ErrnoException | Null, /* result */ ReplyBody, Unit], 
          Unit
        ],
      headers: ReplyHeaders
    ): Scope = js.native
    def reply(
      statusCode: StatusCode,
      replyBodyFn: js.ThisFunction2[
          /* this */ ReplyFnContext, 
          /* uri */ String, 
          /* body */ Body, 
          ReplyBody | js.Promise[ReplyBody]
        ]
    ): Scope = js.native
    def reply(
      statusCode: StatusCode,
      replyBodyFn: js.ThisFunction2[
          /* this */ ReplyFnContext, 
          /* uri */ String, 
          /* body */ Body, 
          ReplyBody | js.Promise[ReplyBody]
        ],
      headers: ReplyHeaders
    ): Scope = js.native
    
    /* tslint:enable:unified-signatures */
    def replyWithError(errorMessage: String): Scope = js.native
    def replyWithError(errorMessage: js.Object): Scope = js.native
    
    def replyWithFile(statusCode: StatusCode, fileName: String): Scope = js.native
    def replyWithFile(statusCode: StatusCode, fileName: String, headers: ReplyHeaders): Scope = js.native
    
    def thrice(): this.type = js.native
    
    def times(newCounter: Double): this.type = js.native
    
    def twice(): this.type = js.native
  }
  
  trait Options extends StObject {
    
    var allowUnmocked: js.UndefOr[Boolean] = js.undefined
    
    var badheaders: js.UndefOr[js.Array[String]] = js.undefined
    
    var encodedQueryParams: js.UndefOr[Boolean] = js.undefined
    
    var filteringScope: js.UndefOr[js.Function1[/* scope */ String, Boolean]] = js.undefined
    
    var reqheaders: js.UndefOr[Record[String, RequestHeaderMatcher]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAllowUnmocked(value: Boolean): Self = StObject.set(x, "allowUnmocked", value.asInstanceOf[js.Any])
      
      inline def setAllowUnmockedUndefined: Self = StObject.set(x, "allowUnmocked", js.undefined)
      
      inline def setBadheaders(value: js.Array[String]): Self = StObject.set(x, "badheaders", value.asInstanceOf[js.Any])
      
      inline def setBadheadersUndefined: Self = StObject.set(x, "badheaders", js.undefined)
      
      inline def setBadheadersVarargs(value: String*): Self = StObject.set(x, "badheaders", js.Array(value*))
      
      inline def setEncodedQueryParams(value: Boolean): Self = StObject.set(x, "encodedQueryParams", value.asInstanceOf[js.Any])
      
      inline def setEncodedQueryParamsUndefined: Self = StObject.set(x, "encodedQueryParams", js.undefined)
      
      inline def setFilteringScope(value: /* scope */ String => Boolean): Self = StObject.set(x, "filteringScope", js.Any.fromFunction1(value))
      
      inline def setFilteringScopeUndefined: Self = StObject.set(x, "filteringScope", js.undefined)
      
      inline def setReqheaders(value: Record[String, RequestHeaderMatcher]): Self = StObject.set(x, "reqheaders", value.asInstanceOf[js.Any])
      
      inline def setReqheadersUndefined: Self = StObject.set(x, "reqheaders", js.undefined)
    }
  }
  
  trait RecorderOptions extends StObject {
    
    var dont_print: js.UndefOr[Boolean] = js.undefined
    
    var enable_reqheaders_recording: js.UndefOr[Boolean] = js.undefined
    
    var logging: js.UndefOr[js.Function1[/* content */ String, Unit]] = js.undefined
    
    var output_objects: js.UndefOr[Boolean] = js.undefined
    
    var use_separator: js.UndefOr[Boolean] = js.undefined
  }
  object RecorderOptions {
    
    inline def apply(): RecorderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RecorderOptions]
    }
    
    extension [Self <: RecorderOptions](x: Self) {
      
      inline def setDont_print(value: Boolean): Self = StObject.set(x, "dont_print", value.asInstanceOf[js.Any])
      
      inline def setDont_printUndefined: Self = StObject.set(x, "dont_print", js.undefined)
      
      inline def setEnable_reqheaders_recording(value: Boolean): Self = StObject.set(x, "enable_reqheaders_recording", value.asInstanceOf[js.Any])
      
      inline def setEnable_reqheaders_recordingUndefined: Self = StObject.set(x, "enable_reqheaders_recording", js.undefined)
      
      inline def setLogging(value: /* content */ String => Callback): Self = StObject.set(x, "logging", js.Any.fromFunction1((t0: /* content */ String) => value(t0).runNow()))
      
      inline def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
      
      inline def setOutput_objects(value: Boolean): Self = StObject.set(x, "output_objects", value.asInstanceOf[js.Any])
      
      inline def setOutput_objectsUndefined: Self = StObject.set(x, "output_objects", js.undefined)
      
      inline def setUse_separator(value: Boolean): Self = StObject.set(x, "use_separator", value.asInstanceOf[js.Any])
      
      inline def setUse_separatorUndefined: Self = StObject.set(x, "use_separator", js.undefined)
    }
  }
  
  @js.native
  trait Recorder_ extends StObject {
    
    def clear(): Unit = js.native
    
    def play(): js.Array[Definition | String] = js.native
    
    def rec(): Unit = js.native
    def rec(options: Boolean): Unit = js.native
    def rec(options: RecorderOptions): Unit = js.native
  }
  
  // a string or decoded JSON
  type ReplyBody = Body | Buffer | ReadStream
  
  @js.native
  trait ReplyFnContext
    extends StObject
       with Interceptor {
    
    var req: ClientRequest & Headers = js.native
  }
  
  type ReplyFnResult = js.Array[StatusCode] | (js.Tuple2[StatusCode, ReplyBody]) | (js.Tuple3[StatusCode, ReplyBody, ReplyHeaders])
  
  type ReplyHeaderFunction = js.Function3[
    /* req */ ClientRequest, 
    /* res */ IncomingMessage, 
    /* body */ String | Buffer, 
    String | js.Array[String]
  ]
  
  type ReplyHeaderValue = String | js.Array[String] | ReplyHeaderFunction
  
  type ReplyHeaders = (Record[String, ReplyHeaderValue]) | (Map[String, ReplyHeaderValue]) | js.Array[ReplyHeaderValue]
  
  trait ReqOptions
    extends StObject
       with ClientRequestArgs {
    
    var proto: js.UndefOr[String] = js.undefined
  }
  object ReqOptions {
    
    inline def apply(): ReqOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReqOptions]
    }
    
    extension [Self <: ReqOptions](x: Self) {
      
      inline def setProto(value: String): Self = StObject.set(x, "proto", value.asInstanceOf[js.Any])
      
      inline def setProtoUndefined: Self = StObject.set(x, "proto", js.undefined)
    }
  }
  
  type RequestBodyMatcher = String | Buffer | js.RegExp | Any | DataMatcherMap | (js.Function1[/* body */ Any, Boolean])
  
  type RequestHeaderMatcher = String | js.RegExp | (js.Function1[/* fieldValue */ String, Boolean])
  
  @js.native
  trait Scope
    extends StObject
       with EventEmitter {
    
    def activeMocks(): js.Array[String] = js.native
    
    def defaultReplyHeaders(headers: ReplyHeaders): this.type = js.native
    
    def delete(uri: String): Interceptor = js.native
    def delete(uri: String, requestBody: Unit, interceptorOptions: Options): Interceptor = js.native
    def delete(uri: String, requestBody: RequestBodyMatcher): Interceptor = js.native
    def delete(uri: String, requestBody: RequestBodyMatcher, interceptorOptions: Options): Interceptor = js.native
    def delete(uri: js.Function1[/* uri */ String, Boolean]): Interceptor = js.native
    def delete(uri: js.Function1[/* uri */ String, Boolean], requestBody: Unit, interceptorOptions: Options): Interceptor = js.native
    def delete(uri: js.Function1[/* uri */ String, Boolean], requestBody: RequestBodyMatcher): Interceptor = js.native
    def delete(
      uri: js.Function1[/* uri */ String, Boolean],
      requestBody: RequestBodyMatcher,
      interceptorOptions: Options
    ): Interceptor = js.native
    def delete(uri: js.RegExp): Interceptor = js.native
    def delete(uri: js.RegExp, requestBody: Unit, interceptorOptions: Options): Interceptor = js.native
    def delete(uri: js.RegExp, requestBody: RequestBodyMatcher): Interceptor = js.native
    def delete(uri: js.RegExp, requestBody: RequestBodyMatcher, interceptorOptions: Options): Interceptor = js.native
    @JSName("delete")
    var delete_Original: InterceptFunction = js.native
    
    def done(): Unit = js.native
    
    def filteringPath(fn: js.Function1[/* path */ String, String]): this.type = js.native
    def filteringPath(regex: js.RegExp, replace: String): this.type = js.native
    
    def filteringRequestBody(fn: js.Function1[/* body */ String, String]): this.type = js.native
    def filteringRequestBody(regex: js.RegExp, replace: String): this.type = js.native
    
    def get(uri: String): Interceptor = js.native
    def get(uri: String, requestBody: Unit, interceptorOptions: Options): Interceptor = js.native
    def get(uri: String, requestBody: RequestBodyMatcher): Interceptor = js.native
    def get(uri: String, requestBody: RequestBodyMatcher, interceptorOptions: Options): Interceptor = js.native
    def get(uri: js.Function1[/* uri */ String, Boolean]): Interceptor = js.native
    def get(uri: js.Function1[/* uri */ String, Boolean], requestBody: Unit, interceptorOptions: Options): Interceptor = js.native
    def get(uri: js.Function1[/* uri */ String, Boolean], requestBody: RequestBodyMatcher): Interceptor = js.native
    def get(
      uri: js.Function1[/* uri */ String, Boolean],
      requestBody: RequestBodyMatcher,
      interceptorOptions: Options
    ): Interceptor = js.native
    def get(uri: js.RegExp): Interceptor = js.native
    def get(uri: js.RegExp, requestBody: Unit, interceptorOptions: Options): Interceptor = js.native
    def get(uri: js.RegExp, requestBody: RequestBodyMatcher): Interceptor = js.native
    def get(uri: js.RegExp, requestBody: RequestBodyMatcher, interceptorOptions: Options): Interceptor = js.native
    @JSName("get")
    var get_Original: InterceptFunction = js.native
    
    def head(uri: String): Interceptor = js.native
    def head(uri: String, requestBody: Unit, interceptorOptions: Options): Interceptor = js.native
    def head(uri: String, requestBody: RequestBodyMatcher): Interceptor = js.native
    def head(uri: String, requestBody: RequestBodyMatcher, interceptorOptions: Options): Interceptor = js.native
    def head(uri: js.Function1[/* uri */ String, Boolean]): Interceptor = js.native
    def head(uri: js.Function1[/* uri */ String, Boolean], requestBody: Unit, interceptorOptions: Options): Interceptor = js.native
    def head(uri: js.Function1[/* uri */ String, Boolean], requestBody: RequestBodyMatcher): Interceptor = js.native
    def head(
      uri: js.Function1[/* uri */ String, Boolean],
      requestBody: RequestBodyMatcher,
      interceptorOptions: Options
    ): Interceptor = js.native
    def head(uri: js.RegExp): Interceptor = js.native
    def head(uri: js.RegExp, requestBody: Unit, interceptorOptions: Options): Interceptor = js.native
    def head(uri: js.RegExp, requestBody: RequestBodyMatcher): Interceptor = js.native
    def head(uri: js.RegExp, requestBody: RequestBodyMatcher, interceptorOptions: Options): Interceptor = js.native
    @JSName("head")
    var head_Original: InterceptFunction = js.native
    
    def intercept(uri: String, method: String): Interceptor = js.native
    def intercept(uri: String, method: String, requestBody: Unit, options: Options): Interceptor = js.native
    def intercept(uri: String, method: String, requestBody: RequestBodyMatcher): Interceptor = js.native
    def intercept(uri: String, method: String, requestBody: RequestBodyMatcher, options: Options): Interceptor = js.native
    def intercept(uri: js.Function1[/* uri */ String, Boolean], method: String): Interceptor = js.native
    def intercept(uri: js.Function1[/* uri */ String, Boolean], method: String, requestBody: Unit, options: Options): Interceptor = js.native
    def intercept(uri: js.Function1[/* uri */ String, Boolean], method: String, requestBody: RequestBodyMatcher): Interceptor = js.native
    def intercept(
      uri: js.Function1[/* uri */ String, Boolean],
      method: String,
      requestBody: RequestBodyMatcher,
      options: Options
    ): Interceptor = js.native
    def intercept(uri: js.RegExp, method: String): Interceptor = js.native
    def intercept(uri: js.RegExp, method: String, requestBody: Unit, options: Options): Interceptor = js.native
    def intercept(uri: js.RegExp, method: String, requestBody: RequestBodyMatcher): Interceptor = js.native
    def intercept(uri: js.RegExp, method: String, requestBody: RequestBodyMatcher, options: Options): Interceptor = js.native
    
    def isDone(): Boolean = js.native
    
    def matchHeader(name: String, value: RequestHeaderMatcher): this.type = js.native
    
    def merge(uri: String): Interceptor = js.native
    def merge(uri: String, requestBody: Unit, interceptorOptions: Options): Interceptor = js.native
    def merge(uri: String, requestBody: RequestBodyMatcher): Interceptor = js.native
    def merge(uri: String, requestBody: RequestBodyMatcher, interceptorOptions: Options): Interceptor = js.native
    def merge(uri: js.Function1[/* uri */ String, Boolean]): Interceptor = js.native
    def merge(uri: js.Function1[/* uri */ String, Boolean], requestBody: Unit, interceptorOptions: Options): Interceptor = js.native
    def merge(uri: js.Function1[/* uri */ String, Boolean], requestBody: RequestBodyMatcher): Interceptor = js.native
    def merge(
      uri: js.Function1[/* uri */ String, Boolean],
      requestBody: RequestBodyMatcher,
      interceptorOptions: Options
    ): Interceptor = js.native
    def merge(uri: js.RegExp): Interceptor = js.native
    def merge(uri: js.RegExp, requestBody: Unit, interceptorOptions: Options): Interceptor = js.native
    def merge(uri: js.RegExp, requestBody: RequestBodyMatcher): Interceptor = js.native
    def merge(uri: js.RegExp, requestBody: RequestBodyMatcher, interceptorOptions: Options): Interceptor = js.native
    @JSName("merge")
    var merge_Original: InterceptFunction = js.native
    
    def options(uri: String): Interceptor = js.native
    def options(uri: String, requestBody: Unit, interceptorOptions: Options): Interceptor = js.native
    def options(uri: String, requestBody: RequestBodyMatcher): Interceptor = js.native
    def options(uri: String, requestBody: RequestBodyMatcher, interceptorOptions: Options): Interceptor = js.native
    def options(uri: js.Function1[/* uri */ String, Boolean]): Interceptor = js.native
    def options(uri: js.Function1[/* uri */ String, Boolean], requestBody: Unit, interceptorOptions: Options): Interceptor = js.native
    def options(uri: js.Function1[/* uri */ String, Boolean], requestBody: RequestBodyMatcher): Interceptor = js.native
    def options(
      uri: js.Function1[/* uri */ String, Boolean],
      requestBody: RequestBodyMatcher,
      interceptorOptions: Options
    ): Interceptor = js.native
    def options(uri: js.RegExp): Interceptor = js.native
    def options(uri: js.RegExp, requestBody: Unit, interceptorOptions: Options): Interceptor = js.native
    def options(uri: js.RegExp, requestBody: RequestBodyMatcher): Interceptor = js.native
    def options(uri: js.RegExp, requestBody: RequestBodyMatcher, interceptorOptions: Options): Interceptor = js.native
    @JSName("options")
    var options_Original: InterceptFunction = js.native
    
    def patch(uri: String): Interceptor = js.native
    def patch(uri: String, requestBody: Unit, interceptorOptions: Options): Interceptor = js.native
    def patch(uri: String, requestBody: RequestBodyMatcher): Interceptor = js.native
    def patch(uri: String, requestBody: RequestBodyMatcher, interceptorOptions: Options): Interceptor = js.native
    def patch(uri: js.Function1[/* uri */ String, Boolean]): Interceptor = js.native
    def patch(uri: js.Function1[/* uri */ String, Boolean], requestBody: Unit, interceptorOptions: Options): Interceptor = js.native
    def patch(uri: js.Function1[/* uri */ String, Boolean], requestBody: RequestBodyMatcher): Interceptor = js.native
    def patch(
      uri: js.Function1[/* uri */ String, Boolean],
      requestBody: RequestBodyMatcher,
      interceptorOptions: Options
    ): Interceptor = js.native
    def patch(uri: js.RegExp): Interceptor = js.native
    def patch(uri: js.RegExp, requestBody: Unit, interceptorOptions: Options): Interceptor = js.native
    def patch(uri: js.RegExp, requestBody: RequestBodyMatcher): Interceptor = js.native
    def patch(uri: js.RegExp, requestBody: RequestBodyMatcher, interceptorOptions: Options): Interceptor = js.native
    @JSName("patch")
    var patch_Original: InterceptFunction = js.native
    
    def pendingMocks(): js.Array[String] = js.native
    
    def persist(): this.type = js.native
    def persist(flag: Boolean): this.type = js.native
    
    def post(uri: String): Interceptor = js.native
    def post(uri: String, requestBody: Unit, interceptorOptions: Options): Interceptor = js.native
    def post(uri: String, requestBody: RequestBodyMatcher): Interceptor = js.native
    def post(uri: String, requestBody: RequestBodyMatcher, interceptorOptions: Options): Interceptor = js.native
    def post(uri: js.Function1[/* uri */ String, Boolean]): Interceptor = js.native
    def post(uri: js.Function1[/* uri */ String, Boolean], requestBody: Unit, interceptorOptions: Options): Interceptor = js.native
    def post(uri: js.Function1[/* uri */ String, Boolean], requestBody: RequestBodyMatcher): Interceptor = js.native
    def post(
      uri: js.Function1[/* uri */ String, Boolean],
      requestBody: RequestBodyMatcher,
      interceptorOptions: Options
    ): Interceptor = js.native
    def post(uri: js.RegExp): Interceptor = js.native
    def post(uri: js.RegExp, requestBody: Unit, interceptorOptions: Options): Interceptor = js.native
    def post(uri: js.RegExp, requestBody: RequestBodyMatcher): Interceptor = js.native
    def post(uri: js.RegExp, requestBody: RequestBodyMatcher, interceptorOptions: Options): Interceptor = js.native
    @JSName("post")
    var post_Original: InterceptFunction = js.native
    
    def put(uri: String): Interceptor = js.native
    def put(uri: String, requestBody: Unit, interceptorOptions: Options): Interceptor = js.native
    def put(uri: String, requestBody: RequestBodyMatcher): Interceptor = js.native
    def put(uri: String, requestBody: RequestBodyMatcher, interceptorOptions: Options): Interceptor = js.native
    def put(uri: js.Function1[/* uri */ String, Boolean]): Interceptor = js.native
    def put(uri: js.Function1[/* uri */ String, Boolean], requestBody: Unit, interceptorOptions: Options): Interceptor = js.native
    def put(uri: js.Function1[/* uri */ String, Boolean], requestBody: RequestBodyMatcher): Interceptor = js.native
    def put(
      uri: js.Function1[/* uri */ String, Boolean],
      requestBody: RequestBodyMatcher,
      interceptorOptions: Options
    ): Interceptor = js.native
    def put(uri: js.RegExp): Interceptor = js.native
    def put(uri: js.RegExp, requestBody: Unit, interceptorOptions: Options): Interceptor = js.native
    def put(uri: js.RegExp, requestBody: RequestBodyMatcher): Interceptor = js.native
    def put(uri: js.RegExp, requestBody: RequestBodyMatcher, interceptorOptions: Options): Interceptor = js.native
    @JSName("put")
    var put_Original: InterceptFunction = js.native
    
    def replyContentLength(): this.type = js.native
    
    def replyDate(): this.type = js.native
    def replyDate(d: js.Date): this.type = js.native
  }
  
  type StatusCode = Double
  
  trait _DataMatcher extends StObject
}
