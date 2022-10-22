package typingsJapgolly.algoliaClientCommon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.algoliaClientCommon.algoliaClientCommonStrings.headers
import typingsJapgolly.algoliaClientCommon.algoliaClientCommonStrings.hosts
import typingsJapgolly.algoliaClientCommon.algoliaClientCommonStrings.hostsCache
import typingsJapgolly.algoliaClientCommon.algoliaClientCommonStrings.logger
import typingsJapgolly.algoliaClientCommon.algoliaClientCommonStrings.queryParameters
import typingsJapgolly.algoliaClientCommon.algoliaClientCommonStrings.requester
import typingsJapgolly.algoliaClientCommon.algoliaClientCommonStrings.requestsCache
import typingsJapgolly.algoliaClientCommon.algoliaClientCommonStrings.responsesCache
import typingsJapgolly.algoliaClientCommon.algoliaClientCommonStrings.timeouts
import typingsJapgolly.algoliaClientCommon.algoliaClientCommonStrings.userAgent
import typingsJapgolly.algoliaClientCommon.anon.Headers
import typingsJapgolly.algoliaClientCommon.anon.ReadonlyPromiseany
import typingsJapgolly.algoliaClientCommon.anon.ReadonlyPromisevoid
import typingsJapgolly.algoliaClientCommon.anon.Transporter
import typingsJapgolly.algoliaTransporter.mod.RequestOptions
import typingsJapgolly.algoliaTransporter.mod.TransporterOptions
import typingsJapgolly.std.Exclude
import typingsJapgolly.std.Pick
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@algolia/client-common", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@algolia/client-common", "AuthMode")
  @js.native
  val AuthMode: Record[String, AuthModeType] = js.native
  
  inline def addMethods[TBase /* <: js.Object */, TMethods /* <: Methods[TBase] */](base: TBase): AddedMethods[TBase, TMethods] = ^.asInstanceOf[js.Dynamic].applyDynamic("addMethods")(base.asInstanceOf[js.Any]).asInstanceOf[AddedMethods[TBase, TMethods]]
  inline def addMethods[TBase /* <: js.Object */, TMethods /* <: Methods[TBase] */](base: TBase, methods: TMethods): AddedMethods[TBase, TMethods] = (^.asInstanceOf[js.Dynamic].applyDynamic("addMethods")(base.asInstanceOf[js.Any], methods.asInstanceOf[js.Any])).asInstanceOf[AddedMethods[TBase, TMethods]]
  
  inline def createAuth(authMode: AuthModeType, appId: String, apiKey: String): Auth = (^.asInstanceOf[js.Dynamic].applyDynamic("createAuth")(authMode.asInstanceOf[js.Any], appId.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any])).asInstanceOf[Auth]
  
  inline def createRetryablePromise[TResponse](callback: js.Function1[/* retry */ js.Function0[js.Promise[TResponse]], js.Promise[TResponse]]): js.Promise[TResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRetryablePromise")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TResponse]]
  
  inline def createWaitablePromise[TResponse](promise: js.Promise[TResponse]): WaitablePromise[TResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("createWaitablePromise")(promise.asInstanceOf[js.Any]).asInstanceOf[WaitablePromise[TResponse]]
  inline def createWaitablePromise[TResponse](promise: js.Promise[TResponse], wait: Wait[TResponse]): WaitablePromise[TResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWaitablePromise")(promise.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[WaitablePromise[TResponse]]
  
  inline def destroy(base: Transporter): js.Function0[ReadonlyPromisevoid] = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function0[ReadonlyPromisevoid]]
  
  inline def encode(format: String, args: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(scala.List(format.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
  
  inline def shuffle[TData](array: js.Array[TData]): js.Array[TData] = ^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[TData]]
  
  @JSImport("@algolia/client-common", "version")
  @js.native
  val version: /* "4.14.2" */ String = js.native
  
  type AddedMethods[TBase, TMethods /* <: Methods[TBase] */] = TBase & (/* import warning: importer.ImportType#apply Failed type conversion: {[ TKey in keyof TMethods extends string? keyof TMethods : never ]: std.ReturnType<TMethods[TKey]>} */ js.Any)
  
  trait Auth extends StObject {
    
    /**
      * Returns the headers related to auth. Should be
      * merged to the transporter headers.
      */
    def headers(): Record[String, String]
    
    /**
      * Returns the query parameters related to auth. Should be
      * merged to the query parameters headers.
      */
    def queryParameters(): Record[String, String]
  }
  object Auth {
    
    inline def apply(headers: CallbackTo[Record[String, String]], queryParameters: CallbackTo[Record[String, String]]): Auth = {
      val __obj = js.Dynamic.literal(headers = headers.toJsFn, queryParameters = queryParameters.toJsFn)
      __obj.asInstanceOf[Auth]
    }
    
    extension [Self <: Auth](x: Self) {
      
      inline def setHeaders(value: CallbackTo[Record[String, String]]): Self = StObject.set(x, "headers", value.toJsFn)
      
      inline def setQueryParameters(value: CallbackTo[Record[String, String]]): Self = StObject.set(x, "queryParameters", value.toJsFn)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.algoliaClientCommon.algoliaClientCommonInts.`0`
    - typingsJapgolly.algoliaClientCommon.algoliaClientCommonInts.`1`
  */
  trait AuthModeType extends StObject
  object AuthModeType {
    
    inline def `0`: typingsJapgolly.algoliaClientCommon.algoliaClientCommonInts.`0` = 0.asInstanceOf[typingsJapgolly.algoliaClientCommon.algoliaClientCommonInts.`0`]
    
    inline def `1`: typingsJapgolly.algoliaClientCommon.algoliaClientCommonInts.`1` = 1.asInstanceOf[typingsJapgolly.algoliaClientCommon.algoliaClientCommonInts.`1`]
  }
  
  type ClientTransporterOptions = (Pick[
    TransporterOptions, 
    (Exclude[
      hostsCache | logger | requester | requestsCache | responsesCache | timeouts | hosts | headers | queryParameters | userAgent, 
      headers
    ]) & (Exclude[
      hostsCache | logger | requester | requestsCache | responsesCache | timeouts | hosts | headers | queryParameters | userAgent, 
      queryParameters
    ]) & (Exclude[
      hostsCache | logger | requester | requestsCache | responsesCache | timeouts | hosts | headers | queryParameters | userAgent, 
      hosts
    ])
  ]) & Headers
  
  type CreateClient[TClient, TOptions] = js.Function1[
    /* options */ TOptions & (typingsJapgolly.algoliaClientCommon.anon.Methods[
      StringDictionary[js.Function1[/* base */ TClient, js.Function1[/* args */ Any, Any]]], 
      TClient
    ]), 
    TClient & (/* import warning: importer.ImportType#apply Failed type conversion: {[ key in keyof {readonly [key: string] : (base : TClient): (args : any): any} extends string? keyof {readonly [key: string] : (base : TClient): (args : any): any} : never ]: std.ReturnType<{readonly [key: string] : (base : TClient): (args : any): any}[key]>} */ js.Any)
  ]
  
  type Methods[TBase] = StringDictionary[js.Function1[/* base */ TBase, js.Function1[/* repeated */ Any, Any]]]
  
  type Wait[TResponse] = js.Function2[
    /* response */ TResponse, 
    /* requestOptions */ js.UndefOr[RequestOptions], 
    ReadonlyPromiseany
  ]
  
  /* Inlined std.Readonly<std.Promise<TResponse>> & {readonly wait (requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<TResponse>>} */
  @js.native
  trait WaitablePromise[TResponse] extends StObject {
    
    def `catch`[TResult](): js.Promise[TResponse | TResult] = js.native
    
    def `finally`(): js.Promise[TResponse] = js.native
    
    def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
    
    def wait(requestOptions: RequestOptions): WaitablePromise[TResponse] = js.native
  }
}
