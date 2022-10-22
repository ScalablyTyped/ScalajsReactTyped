package typingsJapgolly.fastify.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.fastJsonStringify.mod.Options
import typingsJapgolly.fastify.anon.Bucket
import typingsJapgolly.fastify.anon.CustomOptions
import typingsJapgolly.fastify.anon.DeriveVersion
import typingsJapgolly.fastify.fastifyBooleans.`false`
import typingsJapgolly.fastify.fastifyStrings.idle
import typingsJapgolly.fastify.typesContentTypeParserMod.ConstructorAction
import typingsJapgolly.fastify.typesContentTypeParserMod.ProtoAction
import typingsJapgolly.fastify.typesContextMod.FastifyContextConfig
import typingsJapgolly.fastify.typesLoggerMod.FastifyBaseLogger
import typingsJapgolly.fastify.typesLoggerMod.FastifyLoggerOptions
import typingsJapgolly.fastify.typesLoggerMod.PinoLoggerOptions
import typingsJapgolly.fastify.typesReplyMod.FastifyReply
import typingsJapgolly.fastify.typesRequestMod.FastifyRequest
import typingsJapgolly.fastify.typesRequestMod.RequestGenericInterface
import typingsJapgolly.fastify.typesRouteMod.RouteGenericInterface
import typingsJapgolly.fastify.typesSchemaMod.FastifySchema
import typingsJapgolly.fastify.typesSchemaMod.FastifySchemaValidationError
import typingsJapgolly.fastify.typesServerFactoryMod.FastifyServerFactory
import typingsJapgolly.fastify.typesServerFactoryMod.FastifyServerFactoryHandler
import typingsJapgolly.fastify.typesTypeProviderMod.FastifyTypeProviderDefault
import typingsJapgolly.fastify.typesTypeProviderMod.ResolveFastifyReplyType
import typingsJapgolly.fastify.typesTypeProviderMod.ResolveFastifyRequestType
import typingsJapgolly.fastify.typesUtilsMod.ContextConfigDefault
import typingsJapgolly.fastify.typesUtilsMod.RawReplyDefaultExpression
import typingsJapgolly.fastify.typesUtilsMod.RawRequestDefaultExpression
import typingsJapgolly.fastify.typesUtilsMod.RawServerBase
import typingsJapgolly.fastifyError.mod.FastifyError
import typingsJapgolly.findMyWay.mod.ConstraintStrategy
import typingsJapgolly.node.netMod.Socket
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FastifyServerOptions[RawServer /* <: RawServerBase */, Logger /* <: FastifyBaseLogger */] extends StObject {
  
  var ajv: js.UndefOr[CustomOptions] = js.undefined
  
  var bodyLimit: js.UndefOr[Double] = js.undefined
  
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * listener to error events emitted by client connections
    */
  var clientErrorHandler: js.UndefOr[js.Function2[/* error */ ConnectionError, /* socket */ Socket, Unit]] = js.undefined
  
  var connectionTimeout: js.UndefOr[Double] = js.undefined
  
  var constraints: js.UndefOr[StringDictionary[ConstraintStrategy[FindMyWayVersion[RawServer], Any]]] = js.undefined
  
  var disableRequestLogging: js.UndefOr[Boolean] = js.undefined
  
  var exposeHeadRoutes: js.UndefOr[Boolean] = js.undefined
  
  var forceCloseConnections: js.UndefOr[Boolean | idle] = js.undefined
  
  var frameworkErrors: js.UndefOr[
    js.Function3[
      /* error */ FastifyError, 
      /* req */ FastifyRequest[
        RequestGenericInterface, 
        RawServer, 
        RawRequestDefaultExpression[RawServer], 
        FastifySchema, 
        FastifyTypeProviderDefault, 
        ContextConfigDefault, 
        FastifyBaseLogger, 
        ResolveFastifyRequestType[FastifyTypeProviderDefault, FastifySchema, RequestGenericInterface]
      ], 
      /* res */ FastifyReply[
        RawServer, 
        RawRequestDefaultExpression[RawServer], 
        RawReplyDefaultExpression[RawServer], 
        RequestGenericInterface, 
        FastifyContextConfig, 
        FastifySchema, 
        FastifyTypeProviderDefault, 
        ResolveFastifyReplyType[FastifyTypeProviderDefault, FastifySchema, RequestGenericInterface]
      ], 
      Unit
    ]
  ] = js.undefined
  
  var genReqId: js.UndefOr[
    js.Function1[
      /* req */ FastifyRequest[
        RequestGenericInterface, 
        RawServer, 
        RawRequestDefaultExpression[RawServer], 
        FastifySchema, 
        FastifyTypeProviderDefault, 
        ContextConfigDefault, 
        FastifyBaseLogger, 
        ResolveFastifyRequestType[FastifyTypeProviderDefault, FastifySchema, RequestGenericInterface]
      ], 
      String
    ]
  ] = js.undefined
  
  var ignoreDuplicateSlashes: js.UndefOr[Boolean] = js.undefined
  
  var ignoreTrailingSlash: js.UndefOr[Boolean] = js.undefined
  
  var jsonShorthand: js.UndefOr[Boolean] = js.undefined
  
  var keepAliveTimeout: js.UndefOr[Double] = js.undefined
  
  var logger: js.UndefOr[
    Boolean | ((FastifyLoggerOptions[
      RawServer, 
      FastifyRequest[
        RouteGenericInterface, 
        RawServer, 
        RawRequestDefaultExpression[RawServer], 
        FastifySchema, 
        FastifyTypeProviderDefault, 
        ContextConfigDefault, 
        FastifyBaseLogger, 
        ResolveFastifyRequestType[FastifyTypeProviderDefault, FastifySchema, RouteGenericInterface]
      ], 
      FastifyReply[
        RawServer, 
        RawRequestDefaultExpression[RawServer], 
        RawReplyDefaultExpression[RawServer], 
        RouteGenericInterface, 
        ContextConfigDefault, 
        FastifySchema, 
        FastifyTypeProviderDefault, 
        ResolveFastifyReplyType[FastifyTypeProviderDefault, FastifySchema, RouteGenericInterface]
      ]
    ]) & PinoLoggerOptions) | Logger
  ] = js.undefined
  
  var maxParamLength: js.UndefOr[Double] = js.undefined
  
  var maxRequestsPerSocket: js.UndefOr[Double] = js.undefined
  
  var onConstructorPoisoning: js.UndefOr[ConstructorAction] = js.undefined
  
  var onProtoPoisoning: js.UndefOr[ProtoAction] = js.undefined
  
  var pluginTimeout: js.UndefOr[Double] = js.undefined
  
  var querystringParser: js.UndefOr[js.Function1[/* str */ String, StringDictionary[Any]]] = js.undefined
  
  var requestIdHeader: js.UndefOr[String | `false`] = js.undefined
  
  var requestIdLogLabel: js.UndefOr[String] = js.undefined
  
  var requestTimeout: js.UndefOr[Double] = js.undefined
  
  var return503OnClosing: js.UndefOr[Boolean] = js.undefined
  
  var rewriteUrl: js.UndefOr[js.Function1[/* req */ RawRequestDefaultExpression[RawServer], String]] = js.undefined
  
  var schemaController: js.UndefOr[Bucket] = js.undefined
  
  var schemaErrorFormatter: js.UndefOr[
    js.Function2[/* errors */ js.Array[FastifySchemaValidationError], /* dataVar */ String, js.Error]
  ] = js.undefined
  
  var serializerOpts: js.UndefOr[Options | (Record[String, Any])] = js.undefined
  
  var serverFactory: js.UndefOr[FastifyServerFactory[RawServer]] = js.undefined
  
  var trustProxy: js.UndefOr[Boolean | String | js.Array[String] | Double | TrustProxyFunction] = js.undefined
  
  /**
    * @deprecated Prefer using the `constraints.version` property
    */
  var versioning: js.UndefOr[DeriveVersion] = js.undefined
}
object FastifyServerOptions {
  
  inline def apply[RawServer /* <: RawServerBase */, Logger /* <: FastifyBaseLogger */](): FastifyServerOptions[RawServer, Logger] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FastifyServerOptions[RawServer, Logger]]
  }
  
  extension [Self <: FastifyServerOptions[?, ?], RawServer /* <: RawServerBase */, Logger /* <: FastifyBaseLogger */](x: Self & (FastifyServerOptions[RawServer, Logger])) {
    
    inline def setAjv(value: CustomOptions): Self = StObject.set(x, "ajv", value.asInstanceOf[js.Any])
    
    inline def setAjvUndefined: Self = StObject.set(x, "ajv", js.undefined)
    
    inline def setBodyLimit(value: Double): Self = StObject.set(x, "bodyLimit", value.asInstanceOf[js.Any])
    
    inline def setBodyLimitUndefined: Self = StObject.set(x, "bodyLimit", js.undefined)
    
    inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
    
    inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
    
    inline def setClientErrorHandler(value: (/* error */ ConnectionError, /* socket */ Socket) => Callback): Self = StObject.set(x, "clientErrorHandler", js.Any.fromFunction2((t0: /* error */ ConnectionError, t1: /* socket */ Socket) => (value(t0, t1)).runNow()))
    
    inline def setClientErrorHandlerUndefined: Self = StObject.set(x, "clientErrorHandler", js.undefined)
    
    inline def setConnectionTimeout(value: Double): Self = StObject.set(x, "connectionTimeout", value.asInstanceOf[js.Any])
    
    inline def setConnectionTimeoutUndefined: Self = StObject.set(x, "connectionTimeout", js.undefined)
    
    inline def setConstraints(value: StringDictionary[ConstraintStrategy[FindMyWayVersion[RawServer], Any]]): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
    
    inline def setConstraintsUndefined: Self = StObject.set(x, "constraints", js.undefined)
    
    inline def setDisableRequestLogging(value: Boolean): Self = StObject.set(x, "disableRequestLogging", value.asInstanceOf[js.Any])
    
    inline def setDisableRequestLoggingUndefined: Self = StObject.set(x, "disableRequestLogging", js.undefined)
    
    inline def setExposeHeadRoutes(value: Boolean): Self = StObject.set(x, "exposeHeadRoutes", value.asInstanceOf[js.Any])
    
    inline def setExposeHeadRoutesUndefined: Self = StObject.set(x, "exposeHeadRoutes", js.undefined)
    
    inline def setForceCloseConnections(value: Boolean | idle): Self = StObject.set(x, "forceCloseConnections", value.asInstanceOf[js.Any])
    
    inline def setForceCloseConnectionsUndefined: Self = StObject.set(x, "forceCloseConnections", js.undefined)
    
    inline def setFrameworkErrors(
      value: (/* error */ FastifyError, /* req */ FastifyRequest[
          RequestGenericInterface, 
          RawServer, 
          RawRequestDefaultExpression[RawServer], 
          FastifySchema, 
          FastifyTypeProviderDefault, 
          ContextConfigDefault, 
          FastifyBaseLogger, 
          ResolveFastifyRequestType[FastifyTypeProviderDefault, FastifySchema, RequestGenericInterface]
        ], /* res */ FastifyReply[
          RawServer, 
          RawRequestDefaultExpression[RawServer], 
          RawReplyDefaultExpression[RawServer], 
          RequestGenericInterface, 
          FastifyContextConfig, 
          FastifySchema, 
          FastifyTypeProviderDefault, 
          ResolveFastifyReplyType[FastifyTypeProviderDefault, FastifySchema, RequestGenericInterface]
        ]) => Callback
    ): Self = StObject.set(x, "frameworkErrors", js.Any.fromFunction3((t0: /* error */ FastifyError, t1: /* req */ FastifyRequest[
          RequestGenericInterface, 
          RawServer, 
          RawRequestDefaultExpression[RawServer], 
          FastifySchema, 
          FastifyTypeProviderDefault, 
          ContextConfigDefault, 
          FastifyBaseLogger, 
          ResolveFastifyRequestType[FastifyTypeProviderDefault, FastifySchema, RequestGenericInterface]
        ], t2: /* res */ FastifyReply[
          RawServer, 
          RawRequestDefaultExpression[RawServer], 
          RawReplyDefaultExpression[RawServer], 
          RequestGenericInterface, 
          FastifyContextConfig, 
          FastifySchema, 
          FastifyTypeProviderDefault, 
          ResolveFastifyReplyType[FastifyTypeProviderDefault, FastifySchema, RequestGenericInterface]
        ]) => (value(t0, t1, t2)).runNow()))
    
    inline def setFrameworkErrorsUndefined: Self = StObject.set(x, "frameworkErrors", js.undefined)
    
    inline def setGenReqId(
      value: /* req */ FastifyRequest[
          RequestGenericInterface, 
          RawServer, 
          RawRequestDefaultExpression[RawServer], 
          FastifySchema, 
          FastifyTypeProviderDefault, 
          ContextConfigDefault, 
          FastifyBaseLogger, 
          ResolveFastifyRequestType[FastifyTypeProviderDefault, FastifySchema, RequestGenericInterface]
        ] => String
    ): Self = StObject.set(x, "genReqId", js.Any.fromFunction1(value))
    
    inline def setGenReqIdUndefined: Self = StObject.set(x, "genReqId", js.undefined)
    
    inline def setIgnoreDuplicateSlashes(value: Boolean): Self = StObject.set(x, "ignoreDuplicateSlashes", value.asInstanceOf[js.Any])
    
    inline def setIgnoreDuplicateSlashesUndefined: Self = StObject.set(x, "ignoreDuplicateSlashes", js.undefined)
    
    inline def setIgnoreTrailingSlash(value: Boolean): Self = StObject.set(x, "ignoreTrailingSlash", value.asInstanceOf[js.Any])
    
    inline def setIgnoreTrailingSlashUndefined: Self = StObject.set(x, "ignoreTrailingSlash", js.undefined)
    
    inline def setJsonShorthand(value: Boolean): Self = StObject.set(x, "jsonShorthand", value.asInstanceOf[js.Any])
    
    inline def setJsonShorthandUndefined: Self = StObject.set(x, "jsonShorthand", js.undefined)
    
    inline def setKeepAliveTimeout(value: Double): Self = StObject.set(x, "keepAliveTimeout", value.asInstanceOf[js.Any])
    
    inline def setKeepAliveTimeoutUndefined: Self = StObject.set(x, "keepAliveTimeout", js.undefined)
    
    inline def setLogger(
      value: Boolean | ((FastifyLoggerOptions[
          RawServer, 
          FastifyRequest[
            RouteGenericInterface, 
            RawServer, 
            RawRequestDefaultExpression[RawServer], 
            FastifySchema, 
            FastifyTypeProviderDefault, 
            ContextConfigDefault, 
            FastifyBaseLogger, 
            ResolveFastifyRequestType[FastifyTypeProviderDefault, FastifySchema, RouteGenericInterface]
          ], 
          FastifyReply[
            RawServer, 
            RawRequestDefaultExpression[RawServer], 
            RawReplyDefaultExpression[RawServer], 
            RouteGenericInterface, 
            ContextConfigDefault, 
            FastifySchema, 
            FastifyTypeProviderDefault, 
            ResolveFastifyReplyType[FastifyTypeProviderDefault, FastifySchema, RouteGenericInterface]
          ]
        ]) & PinoLoggerOptions) | Logger
    ): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    
    inline def setMaxParamLength(value: Double): Self = StObject.set(x, "maxParamLength", value.asInstanceOf[js.Any])
    
    inline def setMaxParamLengthUndefined: Self = StObject.set(x, "maxParamLength", js.undefined)
    
    inline def setMaxRequestsPerSocket(value: Double): Self = StObject.set(x, "maxRequestsPerSocket", value.asInstanceOf[js.Any])
    
    inline def setMaxRequestsPerSocketUndefined: Self = StObject.set(x, "maxRequestsPerSocket", js.undefined)
    
    inline def setOnConstructorPoisoning(value: ConstructorAction): Self = StObject.set(x, "onConstructorPoisoning", value.asInstanceOf[js.Any])
    
    inline def setOnConstructorPoisoningUndefined: Self = StObject.set(x, "onConstructorPoisoning", js.undefined)
    
    inline def setOnProtoPoisoning(value: ProtoAction): Self = StObject.set(x, "onProtoPoisoning", value.asInstanceOf[js.Any])
    
    inline def setOnProtoPoisoningUndefined: Self = StObject.set(x, "onProtoPoisoning", js.undefined)
    
    inline def setPluginTimeout(value: Double): Self = StObject.set(x, "pluginTimeout", value.asInstanceOf[js.Any])
    
    inline def setPluginTimeoutUndefined: Self = StObject.set(x, "pluginTimeout", js.undefined)
    
    inline def setQuerystringParser(value: /* str */ String => StringDictionary[Any]): Self = StObject.set(x, "querystringParser", js.Any.fromFunction1(value))
    
    inline def setQuerystringParserUndefined: Self = StObject.set(x, "querystringParser", js.undefined)
    
    inline def setRequestIdHeader(value: String | `false`): Self = StObject.set(x, "requestIdHeader", value.asInstanceOf[js.Any])
    
    inline def setRequestIdHeaderUndefined: Self = StObject.set(x, "requestIdHeader", js.undefined)
    
    inline def setRequestIdLogLabel(value: String): Self = StObject.set(x, "requestIdLogLabel", value.asInstanceOf[js.Any])
    
    inline def setRequestIdLogLabelUndefined: Self = StObject.set(x, "requestIdLogLabel", js.undefined)
    
    inline def setRequestTimeout(value: Double): Self = StObject.set(x, "requestTimeout", value.asInstanceOf[js.Any])
    
    inline def setRequestTimeoutUndefined: Self = StObject.set(x, "requestTimeout", js.undefined)
    
    inline def setReturn503OnClosing(value: Boolean): Self = StObject.set(x, "return503OnClosing", value.asInstanceOf[js.Any])
    
    inline def setReturn503OnClosingUndefined: Self = StObject.set(x, "return503OnClosing", js.undefined)
    
    inline def setRewriteUrl(value: /* req */ RawRequestDefaultExpression[RawServer] => String): Self = StObject.set(x, "rewriteUrl", js.Any.fromFunction1(value))
    
    inline def setRewriteUrlUndefined: Self = StObject.set(x, "rewriteUrl", js.undefined)
    
    inline def setSchemaController(value: Bucket): Self = StObject.set(x, "schemaController", value.asInstanceOf[js.Any])
    
    inline def setSchemaControllerUndefined: Self = StObject.set(x, "schemaController", js.undefined)
    
    inline def setSchemaErrorFormatter(value: (/* errors */ js.Array[FastifySchemaValidationError], /* dataVar */ String) => js.Error): Self = StObject.set(x, "schemaErrorFormatter", js.Any.fromFunction2(value))
    
    inline def setSchemaErrorFormatterUndefined: Self = StObject.set(x, "schemaErrorFormatter", js.undefined)
    
    inline def setSerializerOpts(value: Options | (Record[String, Any])): Self = StObject.set(x, "serializerOpts", value.asInstanceOf[js.Any])
    
    inline def setSerializerOptsUndefined: Self = StObject.set(x, "serializerOpts", js.undefined)
    
    inline def setServerFactory(
      value: (/* handler */ FastifyServerFactoryHandler[
          RawServer, 
          RawRequestDefaultExpression[RawServer], 
          RawReplyDefaultExpression[RawServer]
        ], /* opts */ Record[String, Any]) => RawServer
    ): Self = StObject.set(x, "serverFactory", js.Any.fromFunction2(value))
    
    inline def setServerFactoryUndefined: Self = StObject.set(x, "serverFactory", js.undefined)
    
    inline def setTrustProxy(value: Boolean | String | js.Array[String] | Double | TrustProxyFunction): Self = StObject.set(x, "trustProxy", value.asInstanceOf[js.Any])
    
    inline def setTrustProxyFunction2(value: (/* address */ String, /* hop */ Double) => Boolean): Self = StObject.set(x, "trustProxy", js.Any.fromFunction2(value))
    
    inline def setTrustProxyUndefined: Self = StObject.set(x, "trustProxy", js.undefined)
    
    inline def setTrustProxyVarargs(value: String*): Self = StObject.set(x, "trustProxy", js.Array(value*))
    
    inline def setVersioning(value: DeriveVersion): Self = StObject.set(x, "versioning", value.asInstanceOf[js.Any])
    
    inline def setVersioningUndefined: Self = StObject.set(x, "versioning", js.undefined)
  }
}
