package typingsJapgolly.fastify.anon

import typingsJapgolly.fastify.typesHooksMod.preHandlerHookHandler
import typingsJapgolly.fastify.typesHooksMod.preValidationHookHandler
import typingsJapgolly.fastify.typesLoggerMod.FastifyBaseLogger
import typingsJapgolly.fastify.typesRouteMod.RouteGenericInterface
import typingsJapgolly.fastify.typesSchemaMod.FastifySchema
import typingsJapgolly.fastify.typesTypeProviderMod.FastifyTypeProvider
import typingsJapgolly.fastify.typesUtilsMod.ContextConfigDefault
import typingsJapgolly.fastify.typesUtilsMod.RawReplyDefaultExpression
import typingsJapgolly.fastify.typesUtilsMod.RawRequestDefaultExpression
import typingsJapgolly.fastify.typesUtilsMod.RawServerBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreHandler[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, RouteGeneric /* <: RouteGenericInterface */, ContextConfig /* <: ContextConfigDefault */, SchemaCompiler /* <: FastifySchema */, TypeProvider /* <: FastifyTypeProvider */] extends StObject {
  
  var preHandler: js.UndefOr[
    (preHandlerHookHandler[
      RawServer, 
      RawRequest, 
      RawReply, 
      RouteGeneric, 
      ContextConfig, 
      SchemaCompiler, 
      TypeProvider, 
      FastifyBaseLogger
    ]) | (js.Array[
      preHandlerHookHandler[
        RawServer, 
        RawRequest, 
        RawReply, 
        RouteGeneric, 
        ContextConfig, 
        SchemaCompiler, 
        TypeProvider, 
        FastifyBaseLogger
      ]
    ])
  ] = js.undefined
  
  var preValidation: js.UndefOr[
    (preValidationHookHandler[
      RawServer, 
      RawRequest, 
      RawReply, 
      RouteGeneric, 
      ContextConfig, 
      SchemaCompiler, 
      TypeProvider, 
      FastifyBaseLogger
    ]) | (js.Array[
      preValidationHookHandler[
        RawServer, 
        RawRequest, 
        RawReply, 
        RouteGeneric, 
        ContextConfig, 
        SchemaCompiler, 
        TypeProvider, 
        FastifyBaseLogger
      ]
    ])
  ] = js.undefined
}
object PreHandler {
  
  inline def apply[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, RouteGeneric /* <: RouteGenericInterface */, ContextConfig /* <: ContextConfigDefault */, SchemaCompiler /* <: FastifySchema */, TypeProvider /* <: FastifyTypeProvider */](): PreHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig, SchemaCompiler, TypeProvider] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig, SchemaCompiler, TypeProvider]]
  }
  
  extension [Self <: PreHandler[?, ?, ?, ?, ?, ?, ?], RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, RouteGeneric /* <: RouteGenericInterface */, ContextConfig /* <: ContextConfigDefault */, SchemaCompiler /* <: FastifySchema */, TypeProvider /* <: FastifyTypeProvider */](x: Self & (PreHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig, SchemaCompiler, TypeProvider])) {
    
    inline def setPreHandler(
      value: (preHandlerHookHandler[
          RawServer, 
          RawRequest, 
          RawReply, 
          RouteGeneric, 
          ContextConfig, 
          SchemaCompiler, 
          TypeProvider, 
          FastifyBaseLogger
        ]) | (js.Array[
          preHandlerHookHandler[
            RawServer, 
            RawRequest, 
            RawReply, 
            RouteGeneric, 
            ContextConfig, 
            SchemaCompiler, 
            TypeProvider, 
            FastifyBaseLogger
          ]
        ])
    ): Self = StObject.set(x, "preHandler", value.asInstanceOf[js.Any])
    
    inline def setPreHandlerUndefined: Self = StObject.set(x, "preHandler", js.undefined)
    
    inline def setPreHandlerVarargs(
      value: (preHandlerHookHandler[
          RawServer, 
          RawRequest, 
          RawReply, 
          RouteGeneric, 
          ContextConfig, 
          SchemaCompiler, 
          TypeProvider, 
          FastifyBaseLogger
        ])*
    ): Self = StObject.set(x, "preHandler", js.Array(value*))
    
    inline def setPreValidation(
      value: (preValidationHookHandler[
          RawServer, 
          RawRequest, 
          RawReply, 
          RouteGeneric, 
          ContextConfig, 
          SchemaCompiler, 
          TypeProvider, 
          FastifyBaseLogger
        ]) | (js.Array[
          preValidationHookHandler[
            RawServer, 
            RawRequest, 
            RawReply, 
            RouteGeneric, 
            ContextConfig, 
            SchemaCompiler, 
            TypeProvider, 
            FastifyBaseLogger
          ]
        ])
    ): Self = StObject.set(x, "preValidation", value.asInstanceOf[js.Any])
    
    inline def setPreValidationUndefined: Self = StObject.set(x, "preValidation", js.undefined)
    
    inline def setPreValidationVarargs(
      value: (preValidationHookHandler[
          RawServer, 
          RawRequest, 
          RawReply, 
          RouteGeneric, 
          ContextConfig, 
          SchemaCompiler, 
          TypeProvider, 
          FastifyBaseLogger
        ])*
    ): Self = StObject.set(x, "preValidation", js.Array(value*))
  }
}
