package typingsJapgolly.next

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.SubtleCrypto
import typingsJapgolly.next.anon.BodyParser
import typingsJapgolly.next.anon.CookiesNextApiRequestCookies
import typingsJapgolly.next.anon.Locale
import typingsJapgolly.next.distServerNextMod.NextServer
import typingsJapgolly.next.distServerNextMod.NextServerOptions
import typingsJapgolly.next.distSharedLibUtilsMod.NextComponentType
import typingsJapgolly.next.distSharedLibUtilsMod.NextPageContext
import typingsJapgolly.next.nextBooleans.`false`
import typingsJapgolly.next.nextInts.`301`
import typingsJapgolly.next.nextInts.`302`
import typingsJapgolly.next.nextInts.`303`
import typingsJapgolly.next.nextInts.`307`
import typingsJapgolly.next.nextInts.`308`
import typingsJapgolly.next.nextStrings.blocking
import typingsJapgolly.next.nextStrings.hybrid
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.ServerResponse
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.std.Awaited
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @JSImport("next/types", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(options: NextServerOptions): NextServer = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[NextServer]
  
  // Extend the React types with missing properties
  /* augmented module */
  object reactAugmentingMod {
    
    @JSImport("react", JSImport.Namespace)
    @js.native
    val ^ : js.Any = js.native
    
    // TODO-APP: check if this is the right type.
    inline def experimentalUse[T](promise: js.Promise[T]): Awaited[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("experimental_use")(promise.asInstanceOf[js.Any]).asInstanceOf[Awaited[T]]
    
    // <html amp=""> support
    trait HtmlHTMLAttributes[T]
      extends StObject
         with HTMLAttributes[T] {
      
      var amp: js.UndefOr[String] = js.undefined
    }
    object HtmlHTMLAttributes {
      
      inline def apply[T](): HtmlHTMLAttributes[T] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[HtmlHTMLAttributes[T]]
      }
      
      extension [Self <: HtmlHTMLAttributes[?], T](x: Self & HtmlHTMLAttributes[T]) {
        
        inline def setAmp(value: String): Self = StObject.set(x, "amp", value.asInstanceOf[js.Any])
        
        inline def setAmpUndefined: Self = StObject.set(x, "amp", js.undefined)
      }
    }
    
    // <link nonce=""> support
    trait LinkHTMLAttributes[T]
      extends StObject
         with HTMLAttributes[T] {
      
      var nonce: js.UndefOr[String] = js.undefined
    }
    object LinkHTMLAttributes {
      
      inline def apply[T](): LinkHTMLAttributes[T] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LinkHTMLAttributes[T]]
      }
      
      extension [Self <: LinkHTMLAttributes[?], T](x: Self & LinkHTMLAttributes[T]) {
        
        inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
        
        inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      }
    }
  }
  
  type GetServerSideProps[P /* <: StringDictionary[Any] */, Q /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any */, D /* <: PreviewData */] = js.Function1[
    /* context */ GetServerSidePropsContext[Q, D], 
    js.Promise[GetServerSidePropsResult[P]]
  ]
  
  trait GetServerSidePropsContext[Q /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any */, D /* <: PreviewData */] extends StObject {
    
    var defaultLocale: js.UndefOr[String] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var locales: js.UndefOr[js.Array[String]] = js.undefined
    
    var params: js.UndefOr[Q] = js.undefined
    
    var preview: js.UndefOr[Boolean] = js.undefined
    
    var previewData: js.UndefOr[D] = js.undefined
    
    var query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
    
    var req: IncomingMessage & CookiesNextApiRequestCookies
    
    var res: ServerResponse[IncomingMessage]
    
    var resolvedUrl: String
  }
  object GetServerSidePropsContext {
    
    inline def apply[Q /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any */, D /* <: PreviewData */](
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any,
      req: IncomingMessage & CookiesNextApiRequestCookies,
      res: ServerResponse[IncomingMessage],
      resolvedUrl: String
    ): GetServerSidePropsContext[Q, D] = {
      val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any], resolvedUrl = resolvedUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetServerSidePropsContext[Q, D]]
    }
    
    extension [Self <: GetServerSidePropsContext[?, ?], Q /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any */, D /* <: PreviewData */](x: Self & (GetServerSidePropsContext[Q, D])) {
      
      inline def setDefaultLocale(value: String): Self = StObject.set(x, "defaultLocale", value.asInstanceOf[js.Any])
      
      inline def setDefaultLocaleUndefined: Self = StObject.set(x, "defaultLocale", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setLocales(value: js.Array[String]): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
      
      inline def setLocalesUndefined: Self = StObject.set(x, "locales", js.undefined)
      
      inline def setLocalesVarargs(value: String*): Self = StObject.set(x, "locales", js.Array(value*))
      
      inline def setParams(value: Q): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setPreview(value: Boolean): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
      
      inline def setPreviewData(value: D): Self = StObject.set(x, "previewData", value.asInstanceOf[js.Any])
      
      inline def setPreviewDataUndefined: Self = StObject.set(x, "previewData", js.undefined)
      
      inline def setPreviewUndefined: Self = StObject.set(x, "preview", js.undefined)
      
      inline def setQuery(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
      ): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setReq(value: IncomingMessage & CookiesNextApiRequestCookies): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
      
      inline def setRes(value: ServerResponse[IncomingMessage]): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
      
      inline def setResolvedUrl(value: String): Self = StObject.set(x, "resolvedUrl", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.next.anon.Props[P]
    - typingsJapgolly.next.anon.Redirect
    - typingsJapgolly.next.anon.NotFound
  */
  trait GetServerSidePropsResult[P] extends StObject
  object GetServerSidePropsResult {
    
    inline def NotFound(): typingsJapgolly.next.anon.NotFound = {
      val __obj = js.Dynamic.literal(notFound = true)
      __obj.asInstanceOf[typingsJapgolly.next.anon.NotFound]
    }
    
    inline def Props[P](props: P | js.Promise[P]): typingsJapgolly.next.anon.Props[P] = {
      val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.next.anon.Props[P]]
    }
    
    inline def Redirect(redirect: typingsJapgolly.next.typesMod.Redirect): typingsJapgolly.next.anon.Redirect = {
      val __obj = js.Dynamic.literal(redirect = redirect.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.next.anon.Redirect]
    }
  }
  
  type GetStaticPaths[P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any */] = js.Function1[
    /* context */ GetStaticPathsContext, 
    js.Promise[GetStaticPathsResult[P]] | GetStaticPathsResult[P]
  ]
  
  trait GetStaticPathsContext extends StObject {
    
    var defaultLocale: js.UndefOr[String] = js.undefined
    
    var locales: js.UndefOr[js.Array[String]] = js.undefined
  }
  object GetStaticPathsContext {
    
    inline def apply(): GetStaticPathsContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetStaticPathsContext]
    }
    
    extension [Self <: GetStaticPathsContext](x: Self) {
      
      inline def setDefaultLocale(value: String): Self = StObject.set(x, "defaultLocale", value.asInstanceOf[js.Any])
      
      inline def setDefaultLocaleUndefined: Self = StObject.set(x, "defaultLocale", js.undefined)
      
      inline def setLocales(value: js.Array[String]): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
      
      inline def setLocalesUndefined: Self = StObject.set(x, "locales", js.undefined)
      
      inline def setLocalesVarargs(value: String*): Self = StObject.set(x, "locales", js.Array(value*))
    }
  }
  
  trait GetStaticPathsResult[P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any */] extends StObject {
    
    var fallback: Boolean | blocking
    
    var paths: js.Array[String | Locale[P]]
  }
  object GetStaticPathsResult {
    
    inline def apply[P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any */](fallback: Boolean | blocking, paths: js.Array[String | Locale[P]]): GetStaticPathsResult[P] = {
      val __obj = js.Dynamic.literal(fallback = fallback.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetStaticPathsResult[P]]
    }
    
    extension [Self <: GetStaticPathsResult[?], P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any */](x: Self & GetStaticPathsResult[P]) {
      
      inline def setFallback(value: Boolean | blocking): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      inline def setPaths(value: js.Array[String | Locale[P]]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      inline def setPathsVarargs(value: (String | Locale[P])*): Self = StObject.set(x, "paths", js.Array(value*))
    }
  }
  
  type GetStaticProps[P /* <: StringDictionary[Any] */, Q /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any */, D /* <: PreviewData */] = js.Function1[
    /* context */ GetStaticPropsContext[Q, D], 
    js.Promise[GetStaticPropsResult[P]] | GetStaticPropsResult[P]
  ]
  
  trait GetStaticPropsContext[Q /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any */, D /* <: PreviewData */] extends StObject {
    
    var defaultLocale: js.UndefOr[String] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var locales: js.UndefOr[js.Array[String]] = js.undefined
    
    var params: js.UndefOr[Q] = js.undefined
    
    var preview: js.UndefOr[Boolean] = js.undefined
    
    var previewData: js.UndefOr[D] = js.undefined
  }
  object GetStaticPropsContext {
    
    inline def apply[Q /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any */, D /* <: PreviewData */](): GetStaticPropsContext[Q, D] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetStaticPropsContext[Q, D]]
    }
    
    extension [Self <: GetStaticPropsContext[?, ?], Q /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any */, D /* <: PreviewData */](x: Self & (GetStaticPropsContext[Q, D])) {
      
      inline def setDefaultLocale(value: String): Self = StObject.set(x, "defaultLocale", value.asInstanceOf[js.Any])
      
      inline def setDefaultLocaleUndefined: Self = StObject.set(x, "defaultLocale", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setLocales(value: js.Array[String]): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
      
      inline def setLocalesUndefined: Self = StObject.set(x, "locales", js.undefined)
      
      inline def setLocalesVarargs(value: String*): Self = StObject.set(x, "locales", js.Array(value*))
      
      inline def setParams(value: Q): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setPreview(value: Boolean): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
      
      inline def setPreviewData(value: D): Self = StObject.set(x, "previewData", value.asInstanceOf[js.Any])
      
      inline def setPreviewDataUndefined: Self = StObject.set(x, "previewData", js.undefined)
      
      inline def setPreviewUndefined: Self = StObject.set(x, "preview", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.next.anon.PropsRevalidate[P]
    - typingsJapgolly.next.anon.RedirectRevalidate
    - typingsJapgolly.next.anon.NotFoundRevalidate
  */
  trait GetStaticPropsResult[P] extends StObject
  object GetStaticPropsResult {
    
    inline def NotFoundRevalidate(): typingsJapgolly.next.anon.NotFoundRevalidate = {
      val __obj = js.Dynamic.literal(notFound = true)
      __obj.asInstanceOf[typingsJapgolly.next.anon.NotFoundRevalidate]
    }
    
    inline def PropsRevalidate[P](props: P): typingsJapgolly.next.anon.PropsRevalidate[P] = {
      val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.next.anon.PropsRevalidate[P]]
    }
    
    inline def RedirectRevalidate(redirect: Redirect): typingsJapgolly.next.anon.RedirectRevalidate = {
      val __obj = js.Dynamic.literal(redirect = redirect.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.next.anon.RedirectRevalidate]
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends next.next/types.GetServerSideProps<infer P, any, next.next/types.PreviewData> ? P : T extends (context : next.next/types.GetServerSidePropsContext<any, next.next/types.PreviewData> | undefined): std.Promise<next.next/types.GetServerSidePropsResult<infer P>> ? P : never
    }}}
    */
  @js.native
  trait InferGetServerSidePropsType[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends next.next/types.GetStaticProps<infer P, any, next.next/types.PreviewData> ? P : T extends (context : next.next/types.GetStaticPropsContext<any, next.next/types.PreviewData> | undefined): std.Promise<next.next/types.GetStaticPropsResult<infer P>> | next.next/types.GetStaticPropsResult<infer P> ? P : never
    }}}
    */
  @js.native
  trait InferGetStaticPropsType[T] extends StObject
  
  type NextPage[P, IP] = NextComponentType[NextPageContext, IP, P]
  
  trait PageConfig extends StObject {
    
    var amp: js.UndefOr[Boolean | hybrid] = js.undefined
    
    var api: js.UndefOr[BodyParser] = js.undefined
    
    var env: js.UndefOr[js.Array[String]] = js.undefined
    
    var runtime: js.UndefOr[ServerRuntime] = js.undefined
    
    var unstable_JsPreload: js.UndefOr[`false`] = js.undefined
    
    var unstable_excludeFiles: js.UndefOr[js.Array[String]] = js.undefined
    
    var unstable_includeFiles: js.UndefOr[js.Array[String]] = js.undefined
    
    var unstable_runtimeJS: js.UndefOr[`false`] = js.undefined
  }
  object PageConfig {
    
    inline def apply(): PageConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageConfig]
    }
    
    extension [Self <: PageConfig](x: Self) {
      
      inline def setAmp(value: Boolean | hybrid): Self = StObject.set(x, "amp", value.asInstanceOf[js.Any])
      
      inline def setAmpUndefined: Self = StObject.set(x, "amp", js.undefined)
      
      inline def setApi(value: BodyParser): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      inline def setApiUndefined: Self = StObject.set(x, "api", js.undefined)
      
      inline def setEnv(value: js.Array[String]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setEnvVarargs(value: String*): Self = StObject.set(x, "env", js.Array(value*))
      
      inline def setRuntime(value: ServerRuntime): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
      
      inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
      
      inline def setUnstable_JsPreload(value: `false`): Self = StObject.set(x, "unstable_JsPreload", value.asInstanceOf[js.Any])
      
      inline def setUnstable_JsPreloadUndefined: Self = StObject.set(x, "unstable_JsPreload", js.undefined)
      
      inline def setUnstable_excludeFiles(value: js.Array[String]): Self = StObject.set(x, "unstable_excludeFiles", value.asInstanceOf[js.Any])
      
      inline def setUnstable_excludeFilesUndefined: Self = StObject.set(x, "unstable_excludeFiles", js.undefined)
      
      inline def setUnstable_excludeFilesVarargs(value: String*): Self = StObject.set(x, "unstable_excludeFiles", js.Array(value*))
      
      inline def setUnstable_includeFiles(value: js.Array[String]): Self = StObject.set(x, "unstable_includeFiles", value.asInstanceOf[js.Any])
      
      inline def setUnstable_includeFilesUndefined: Self = StObject.set(x, "unstable_includeFiles", js.undefined)
      
      inline def setUnstable_includeFilesVarargs(value: String*): Self = StObject.set(x, "unstable_includeFiles", js.Array(value*))
      
      inline def setUnstable_runtimeJS(value: `false`): Self = StObject.set(x, "unstable_runtimeJS", value.asInstanceOf[js.Any])
      
      inline def setUnstable_runtimeJSUndefined: Self = StObject.set(x, "unstable_runtimeJS", js.undefined)
    }
  }
  
  type PreviewData = js.UndefOr[String | `false` | js.Object]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.next.anon.StatusCode
    - typingsJapgolly.next.anon.BasePathDestination
  */
  trait Redirect extends StObject
  object Redirect {
    
    inline def BasePathDestination(destination: String, permanent: Boolean): typingsJapgolly.next.anon.BasePathDestination = {
      val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], permanent = permanent.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.next.anon.BasePathDestination]
    }
    
    inline def StatusCode(destination: String, statusCode: `301` | `302` | `303` | `307` | `308`): typingsJapgolly.next.anon.StatusCode = {
      val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.next.anon.StatusCode]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.next.nextStrings.nodejs
    - typingsJapgolly.next.nextStrings.`experimental-edge`
    - scala.Unit
  */
  type ServerRuntime = js.UndefOr[_ServerRuntime]
  
  trait _ServerRuntime extends StObject
  
  object global {
    
    @js.native
    trait Crypto extends StObject {
      
      def getRandomValues(array: js.typedarray.DataView): js.typedarray.DataView = js.native
      def getRandomValues(array: js.typedarray.Float32Array): js.typedarray.Float32Array = js.native
      def getRandomValues(array: js.typedarray.Float64Array): js.typedarray.Float64Array = js.native
      def getRandomValues(array: js.typedarray.Int16Array): js.typedarray.Int16Array = js.native
      def getRandomValues(array: js.typedarray.Int32Array): js.typedarray.Int32Array = js.native
      def getRandomValues(array: js.typedarray.Int8Array): js.typedarray.Int8Array = js.native
      def getRandomValues(array: js.typedarray.Uint16Array): js.typedarray.Uint16Array = js.native
      def getRandomValues(array: js.typedarray.Uint32Array): js.typedarray.Uint32Array = js.native
      def getRandomValues(array: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
      def getRandomValues(array: js.typedarray.Uint8ClampedArray): js.typedarray.Uint8ClampedArray = js.native
      def getRandomValues(array: Null): Null = js.native
      
      def randomUUID(): String = js.native
      
      val subtle: SubtleCrypto = js.native
    }
  }
}
