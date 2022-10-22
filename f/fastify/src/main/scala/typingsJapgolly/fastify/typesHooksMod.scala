package typingsJapgolly.fastify

import typingsJapgolly.fastify.anon.Path
import typingsJapgolly.fastify.typesInstanceMod.FastifyInstance
import typingsJapgolly.fastify.typesLoggerMod.FastifyBaseLogger
import typingsJapgolly.fastify.typesPluginMod.FastifyPluginOptions
import typingsJapgolly.fastify.typesRegisterMod.RegisterOptions
import typingsJapgolly.fastify.typesReplyMod.FastifyReply
import typingsJapgolly.fastify.typesRequestMod.FastifyRequest
import typingsJapgolly.fastify.typesRouteMod.RouteGenericInterface
import typingsJapgolly.fastify.typesRouteMod.RouteOptions
import typingsJapgolly.fastify.typesSchemaMod.FastifySchema
import typingsJapgolly.fastify.typesTypeProviderMod.FastifyTypeProvider
import typingsJapgolly.fastify.typesTypeProviderMod.ResolveFastifyReplyType
import typingsJapgolly.fastify.typesTypeProviderMod.ResolveFastifyRequestType
import typingsJapgolly.fastify.typesUtilsMod.RawReplyDefaultExpression
import typingsJapgolly.fastify.typesUtilsMod.RawRequestDefaultExpression
import typingsJapgolly.fastify.typesUtilsMod.RawServerBase
import typingsJapgolly.fastifyError.mod.FastifyError
import typingsJapgolly.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesHooksMod {
  
  // This is used within the `preSerialization` and `onSend` hook handlers
  @js.native
  trait DoneFuncWithErrOrRes extends StObject {
    
    def apply(): Unit = js.native
    def apply(err: Null, res: Any): Unit = js.native
    def apply[TError /* <: js.Error */](err: TError): Unit = js.native
  }
  
  type HookHandlerDoneFunction = js.Function1[/* err */ js.UndefOr[FastifyError], Unit]
  
  @js.native
  trait RequestPayload extends Readable {
    
    var receivedEncodedLength: js.UndefOr[Double] = js.native
  }
  
  type onCloseAsyncHookHandler[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, Logger /* <: FastifyBaseLogger */, TypeProvider /* <: FastifyTypeProvider */] = js.Function1[
    /* instance */ FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider], 
    js.Promise[Any]
  ]
  
  type onCloseHookHandler[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, Logger /* <: FastifyBaseLogger */, TypeProvider /* <: FastifyTypeProvider */] = js.Function2[
    /* instance */ FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider], 
    /* done */ HookHandlerDoneFunction, 
    Unit
  ]
  
  type onErrorAsyncHookHandler[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, RouteGeneric /* <: RouteGenericInterface */, ContextConfig, TError /* <: js.Error */, SchemaCompiler /* <: FastifySchema */, TypeProvider /* <: FastifyTypeProvider */, Logger /* <: FastifyBaseLogger */] = js.ThisFunction3[
    /* this */ FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider], 
    /* request */ FastifyRequest[
      RouteGeneric, 
      RawServer, 
      RawRequest, 
      SchemaCompiler, 
      TypeProvider, 
      ContextConfig, 
      Logger, 
      ResolveFastifyRequestType[TypeProvider, SchemaCompiler, RouteGeneric]
    ], 
    /* reply */ FastifyReply[
      RawServer, 
      RawRequest, 
      RawReply, 
      RouteGeneric, 
      ContextConfig, 
      SchemaCompiler, 
      TypeProvider, 
      ResolveFastifyReplyType[TypeProvider, SchemaCompiler, RouteGeneric]
    ], 
    /* error */ TError, 
    js.Promise[Any]
  ]
  
  type onErrorHookHandler[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, RouteGeneric /* <: RouteGenericInterface */, ContextConfig, TError /* <: js.Error */, SchemaCompiler /* <: FastifySchema */, TypeProvider /* <: FastifyTypeProvider */, Logger /* <: FastifyBaseLogger */] = js.ThisFunction4[
    /* this */ FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider], 
    /* request */ FastifyRequest[
      RouteGeneric, 
      RawServer, 
      RawRequest, 
      SchemaCompiler, 
      TypeProvider, 
      ContextConfig, 
      Logger, 
      ResolveFastifyRequestType[TypeProvider, SchemaCompiler, RouteGeneric]
    ], 
    /* reply */ FastifyReply[
      RawServer, 
      RawRequest, 
      RawReply, 
      RouteGeneric, 
      ContextConfig, 
      SchemaCompiler, 
      TypeProvider, 
      ResolveFastifyReplyType[TypeProvider, SchemaCompiler, RouteGeneric]
    ], 
    /* error */ TError, 
    /* done */ js.Function0[Unit], 
    Unit
  ]
  
  type onReadyAsyncHookHandler[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, Logger /* <: FastifyBaseLogger */, TypeProvider /* <: FastifyTypeProvider */] = js.ThisFunction0[
    /* this */ FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider], 
    js.Promise[Any]
  ]
  
  type onReadyHookHandler[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, Logger /* <: FastifyBaseLogger */, TypeProvider /* <: FastifyTypeProvider */] = js.ThisFunction1[
    /* this */ FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider], 
    /* done */ HookHandlerDoneFunction, 
    Unit
  ]
  
  type onRegisterHookHandler[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, Logger /* <: FastifyBaseLogger */, TypeProvider /* <: FastifyTypeProvider */, Options /* <: FastifyPluginOptions */] = js.Function3[
    /* instance */ FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider], 
    /* opts */ RegisterOptions & Options, 
    /* done */ HookHandlerDoneFunction, 
    js.Promise[Any] | Unit
  ]
  
  type onRequestAsyncHookHandler[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */, TypeProvider /* <: FastifyTypeProvider */, Logger /* <: FastifyBaseLogger */] = js.ThisFunction2[
    /* this */ FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider], 
    /* request */ FastifyRequest[
      RouteGeneric, 
      RawServer, 
      RawRequest, 
      SchemaCompiler, 
      TypeProvider, 
      ContextConfig, 
      Logger, 
      ResolveFastifyRequestType[TypeProvider, SchemaCompiler, RouteGeneric]
    ], 
    /* reply */ FastifyReply[
      RawServer, 
      RawRequest, 
      RawReply, 
      RouteGeneric, 
      ContextConfig, 
      SchemaCompiler, 
      TypeProvider, 
      ResolveFastifyReplyType[TypeProvider, SchemaCompiler, RouteGeneric]
    ], 
    js.Promise[Any]
  ]
  
  type onRequestHookHandler[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */, TypeProvider /* <: FastifyTypeProvider */, Logger /* <: FastifyBaseLogger */] = js.ThisFunction3[
    /* this */ FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider], 
    /* request */ FastifyRequest[
      RouteGeneric, 
      RawServer, 
      RawRequest, 
      SchemaCompiler, 
      TypeProvider, 
      ContextConfig, 
      Logger, 
      ResolveFastifyRequestType[TypeProvider, SchemaCompiler, RouteGeneric]
    ], 
    /* reply */ FastifyReply[
      RawServer, 
      RawRequest, 
      RawReply, 
      RouteGeneric, 
      ContextConfig, 
      SchemaCompiler, 
      TypeProvider, 
      ResolveFastifyReplyType[TypeProvider, SchemaCompiler, RouteGeneric]
    ], 
    /* done */ HookHandlerDoneFunction, 
    Unit
  ]
  
  type onResponseAsyncHookHandler[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */, TypeProvider /* <: FastifyTypeProvider */, Logger /* <: FastifyBaseLogger */] = js.ThisFunction2[
    /* this */ FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider], 
    /* request */ FastifyRequest[
      RouteGeneric, 
      RawServer, 
      RawRequest, 
      SchemaCompiler, 
      TypeProvider, 
      ContextConfig, 
      Logger, 
      ResolveFastifyRequestType[TypeProvider, SchemaCompiler, RouteGeneric]
    ], 
    /* reply */ FastifyReply[
      RawServer, 
      RawRequest, 
      RawReply, 
      RouteGeneric, 
      ContextConfig, 
      SchemaCompiler, 
      TypeProvider, 
      ResolveFastifyReplyType[TypeProvider, SchemaCompiler, RouteGeneric]
    ], 
    js.Promise[Any]
  ]
  
  type onResponseHookHandler[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */, TypeProvider /* <: FastifyTypeProvider */, Logger /* <: FastifyBaseLogger */] = js.ThisFunction3[
    /* this */ FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider], 
    /* request */ FastifyRequest[
      RouteGeneric, 
      RawServer, 
      RawRequest, 
      SchemaCompiler, 
      TypeProvider, 
      ContextConfig, 
      Logger, 
      ResolveFastifyRequestType[TypeProvider, SchemaCompiler, RouteGeneric]
    ], 
    /* reply */ FastifyReply[
      RawServer, 
      RawRequest, 
      RawReply, 
      RouteGeneric, 
      ContextConfig, 
      SchemaCompiler, 
      TypeProvider, 
      ResolveFastifyReplyType[TypeProvider, SchemaCompiler, RouteGeneric]
    ], 
    /* done */ HookHandlerDoneFunction, 
    Unit
  ]
  
  type onRouteHookHandler[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */, TypeProvider /* <: FastifyTypeProvider */, Logger /* <: FastifyBaseLogger */] = js.ThisFunction1[
    /* this */ FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider], 
    /* opts */ (RouteOptions[
      RawServer, 
      RawRequest, 
      RawReply, 
      RouteGeneric, 
      ContextConfig, 
      SchemaCompiler, 
      TypeProvider, 
      FastifyBaseLogger
    ]) & Path, 
    js.Promise[Any] | Unit
  ]
  
  type onSendAsyncHookHandler[OnSendPayload, RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */, TypeProvider /* <: FastifyTypeProvider */, Logger /* <: FastifyBaseLogger */] = js.ThisFunction3[
    /* this */ FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider], 
    /* request */ FastifyRequest[
      RouteGeneric, 
      RawServer, 
      RawRequest, 
      SchemaCompiler, 
      TypeProvider, 
      ContextConfig, 
      Logger, 
      ResolveFastifyRequestType[TypeProvider, SchemaCompiler, RouteGeneric]
    ], 
    /* reply */ FastifyReply[
      RawServer, 
      RawRequest, 
      RawReply, 
      RouteGeneric, 
      ContextConfig, 
      SchemaCompiler, 
      TypeProvider, 
      ResolveFastifyReplyType[TypeProvider, SchemaCompiler, RouteGeneric]
    ], 
    /* payload */ OnSendPayload, 
    js.Promise[Any]
  ]
  
  type onSendHookHandler[OnSendPayload, RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */, TypeProvider /* <: FastifyTypeProvider */, Logger /* <: FastifyBaseLogger */] = js.ThisFunction4[
    /* this */ FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider], 
    /* request */ FastifyRequest[
      RouteGeneric, 
      RawServer, 
      RawRequest, 
      SchemaCompiler, 
      TypeProvider, 
      ContextConfig, 
      Logger, 
      ResolveFastifyRequestType[TypeProvider, SchemaCompiler, RouteGeneric]
    ], 
    /* reply */ FastifyReply[
      RawServer, 
      RawRequest, 
      RawReply, 
      RouteGeneric, 
      ContextConfig, 
      SchemaCompiler, 
      TypeProvider, 
      ResolveFastifyReplyType[TypeProvider, SchemaCompiler, RouteGeneric]
    ], 
    /* payload */ OnSendPayload, 
    /* done */ DoneFuncWithErrOrRes, 
    Unit
  ]
  
  type onTimeoutAsyncHookHandler[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */, TypeProvider /* <: FastifyTypeProvider */, Logger /* <: FastifyBaseLogger */] = js.ThisFunction2[
    /* this */ FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider], 
    /* request */ FastifyRequest[
      RouteGeneric, 
      RawServer, 
      RawRequest, 
      SchemaCompiler, 
      TypeProvider, 
      ContextConfig, 
      Logger, 
      ResolveFastifyRequestType[TypeProvider, SchemaCompiler, RouteGeneric]
    ], 
    /* reply */ FastifyReply[
      RawServer, 
      RawRequest, 
      RawReply, 
      RouteGeneric, 
      ContextConfig, 
      SchemaCompiler, 
      TypeProvider, 
      ResolveFastifyReplyType[TypeProvider, SchemaCompiler, RouteGeneric]
    ], 
    js.Promise[Any]
  ]
  
  type onTimeoutHookHandler[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */, TypeProvider /* <: FastifyTypeProvider */, Logger /* <: FastifyBaseLogger */] = js.ThisFunction3[
    /* this */ FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider], 
    /* request */ FastifyRequest[
      RouteGeneric, 
      RawServer, 
      RawRequest, 
      SchemaCompiler, 
      TypeProvider, 
      ContextConfig, 
      Logger, 
      ResolveFastifyRequestType[TypeProvider, SchemaCompiler, RouteGeneric]
    ], 
    /* reply */ FastifyReply[
      RawServer, 
      RawRequest, 
      RawReply, 
      RouteGeneric, 
      ContextConfig, 
      SchemaCompiler, 
      TypeProvider, 
      ResolveFastifyReplyType[TypeProvider, SchemaCompiler, RouteGeneric]
    ], 
    /* done */ HookHandlerDoneFunction, 
    Unit
  ]
  
  type preHandlerAsyncHookHandler[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */, TypeProvider /* <: FastifyTypeProvider */, Logger /* <: FastifyBaseLogger */] = js.ThisFunction2[
    /* this */ FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider], 
    /* request */ FastifyRequest[
      RouteGeneric, 
      RawServer, 
      RawRequest, 
      SchemaCompiler, 
      TypeProvider, 
      ContextConfig, 
      Logger, 
      ResolveFastifyRequestType[TypeProvider, SchemaCompiler, RouteGeneric]
    ], 
    /* reply */ FastifyReply[
      RawServer, 
      RawRequest, 
      RawReply, 
      RouteGeneric, 
      ContextConfig, 
      SchemaCompiler, 
      TypeProvider, 
      ResolveFastifyReplyType[TypeProvider, SchemaCompiler, RouteGeneric]
    ], 
    js.Promise[Any]
  ]
  
  type preHandlerHookHandler[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */, TypeProvider /* <: FastifyTypeProvider */, Logger /* <: FastifyBaseLogger */] = js.ThisFunction3[
    /* this */ FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider], 
    /* request */ FastifyRequest[
      RouteGeneric, 
      RawServer, 
      RawRequest, 
      SchemaCompiler, 
      TypeProvider, 
      ContextConfig, 
      Logger, 
      ResolveFastifyRequestType[TypeProvider, SchemaCompiler, RouteGeneric]
    ], 
    /* reply */ FastifyReply[
      RawServer, 
      RawRequest, 
      RawReply, 
      RouteGeneric, 
      ContextConfig, 
      SchemaCompiler, 
      TypeProvider, 
      ResolveFastifyReplyType[TypeProvider, SchemaCompiler, RouteGeneric]
    ], 
    /* done */ HookHandlerDoneFunction, 
    Unit
  ]
  
  type preParsingAsyncHookHandler[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */, TypeProvider /* <: FastifyTypeProvider */, Logger /* <: FastifyBaseLogger */] = js.ThisFunction3[
    /* this */ FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider], 
    /* request */ FastifyRequest[
      RouteGeneric, 
      RawServer, 
      RawRequest, 
      SchemaCompiler, 
      TypeProvider, 
      ContextConfig, 
      Logger, 
      ResolveFastifyRequestType[TypeProvider, SchemaCompiler, RouteGeneric]
    ], 
    /* reply */ FastifyReply[
      RawServer, 
      RawRequest, 
      RawReply, 
      RouteGeneric, 
      ContextConfig, 
      SchemaCompiler, 
      TypeProvider, 
      ResolveFastifyReplyType[TypeProvider, SchemaCompiler, RouteGeneric]
    ], 
    /* payload */ RequestPayload, 
    js.Promise[RequestPayload | Any]
  ]
  
  type preParsingHookHandler[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */, TypeProvider /* <: FastifyTypeProvider */, Logger /* <: FastifyBaseLogger */] = js.ThisFunction4[
    /* this */ FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider], 
    /* request */ FastifyRequest[
      RouteGeneric, 
      RawServer, 
      RawRequest, 
      SchemaCompiler, 
      TypeProvider, 
      ContextConfig, 
      Logger, 
      ResolveFastifyRequestType[TypeProvider, SchemaCompiler, RouteGeneric]
    ], 
    /* reply */ FastifyReply[
      RawServer, 
      RawRequest, 
      RawReply, 
      RouteGeneric, 
      ContextConfig, 
      SchemaCompiler, 
      TypeProvider, 
      ResolveFastifyReplyType[TypeProvider, SchemaCompiler, RouteGeneric]
    ], 
    /* payload */ RequestPayload, 
    /* done */ js.Function2[
      /* err */ js.UndefOr[FastifyError | Null], 
      /* res */ js.UndefOr[RequestPayload], 
      Unit
    ], 
    Unit
  ]
  
  type preSerializationAsyncHookHandler[PreSerializationPayload, RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */, TypeProvider /* <: FastifyTypeProvider */, Logger /* <: FastifyBaseLogger */] = js.ThisFunction3[
    /* this */ FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider], 
    /* request */ FastifyRequest[
      RouteGeneric, 
      RawServer, 
      RawRequest, 
      SchemaCompiler, 
      TypeProvider, 
      ContextConfig, 
      Logger, 
      ResolveFastifyRequestType[TypeProvider, SchemaCompiler, RouteGeneric]
    ], 
    /* reply */ FastifyReply[
      RawServer, 
      RawRequest, 
      RawReply, 
      RouteGeneric, 
      ContextConfig, 
      SchemaCompiler, 
      TypeProvider, 
      ResolveFastifyReplyType[TypeProvider, SchemaCompiler, RouteGeneric]
    ], 
    /* payload */ PreSerializationPayload, 
    js.Promise[Any]
  ]
  
  type preSerializationHookHandler[PreSerializationPayload, RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */, TypeProvider /* <: FastifyTypeProvider */, Logger /* <: FastifyBaseLogger */] = js.ThisFunction4[
    /* this */ FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider], 
    /* request */ FastifyRequest[
      RouteGeneric, 
      RawServer, 
      RawRequest, 
      SchemaCompiler, 
      TypeProvider, 
      ContextConfig, 
      Logger, 
      ResolveFastifyRequestType[TypeProvider, SchemaCompiler, RouteGeneric]
    ], 
    /* reply */ FastifyReply[
      RawServer, 
      RawRequest, 
      RawReply, 
      RouteGeneric, 
      ContextConfig, 
      SchemaCompiler, 
      TypeProvider, 
      ResolveFastifyReplyType[TypeProvider, SchemaCompiler, RouteGeneric]
    ], 
    /* payload */ PreSerializationPayload, 
    /* done */ DoneFuncWithErrOrRes, 
    Unit
  ]
  
  type preValidationAsyncHookHandler[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */, TypeProvider /* <: FastifyTypeProvider */, Logger /* <: FastifyBaseLogger */] = js.ThisFunction2[
    /* this */ FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider], 
    /* request */ FastifyRequest[
      RouteGeneric, 
      RawServer, 
      RawRequest, 
      SchemaCompiler, 
      TypeProvider, 
      ContextConfig, 
      Logger, 
      ResolveFastifyRequestType[TypeProvider, SchemaCompiler, RouteGeneric]
    ], 
    /* reply */ FastifyReply[
      RawServer, 
      RawRequest, 
      RawReply, 
      RouteGeneric, 
      ContextConfig, 
      SchemaCompiler, 
      TypeProvider, 
      ResolveFastifyReplyType[TypeProvider, SchemaCompiler, RouteGeneric]
    ], 
    js.Promise[Any]
  ]
  
  type preValidationHookHandler[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, RouteGeneric /* <: RouteGenericInterface */, ContextConfig, SchemaCompiler /* <: FastifySchema */, TypeProvider /* <: FastifyTypeProvider */, Logger /* <: FastifyBaseLogger */] = js.ThisFunction3[
    /* this */ FastifyInstance[RawServer, RawRequest, RawReply, Logger, TypeProvider], 
    /* request */ FastifyRequest[
      RouteGeneric, 
      RawServer, 
      RawRequest, 
      SchemaCompiler, 
      TypeProvider, 
      ContextConfig, 
      Logger, 
      ResolveFastifyRequestType[TypeProvider, SchemaCompiler, RouteGeneric]
    ], 
    /* reply */ FastifyReply[
      RawServer, 
      RawRequest, 
      RawReply, 
      RouteGeneric, 
      ContextConfig, 
      SchemaCompiler, 
      TypeProvider, 
      ResolveFastifyReplyType[TypeProvider, SchemaCompiler, RouteGeneric]
    ], 
    /* done */ HookHandlerDoneFunction, 
    Unit
  ]
}
