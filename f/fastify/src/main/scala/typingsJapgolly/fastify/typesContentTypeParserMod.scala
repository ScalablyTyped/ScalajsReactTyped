package typingsJapgolly.fastify

import typingsJapgolly.fastify.anon.BodyLimit
import typingsJapgolly.fastify.anon.ParseAs
import typingsJapgolly.fastify.typesLoggerMod.FastifyBaseLogger
import typingsJapgolly.fastify.typesRequestMod.FastifyRequest
import typingsJapgolly.fastify.typesRouteMod.RouteGenericInterface
import typingsJapgolly.fastify.typesSchemaMod.FastifySchema
import typingsJapgolly.fastify.typesTypeProviderMod.FastifyTypeProvider
import typingsJapgolly.fastify.typesTypeProviderMod.FastifyTypeProviderDefault
import typingsJapgolly.fastify.typesTypeProviderMod.ResolveFastifyRequestType
import typingsJapgolly.fastify.typesUtilsMod.ContextConfigDefault
import typingsJapgolly.fastify.typesUtilsMod.RawRequestDefaultExpression
import typingsJapgolly.fastify.typesUtilsMod.RawServerBase
import typingsJapgolly.fastify.typesUtilsMod.RawServerDefault
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesContentTypeParserMod {
  
  @js.native
  trait AddContentTypeParser[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RouteGeneric /* <: RouteGenericInterface */, SchemaCompiler /* <: FastifySchema */, TypeProvider /* <: FastifyTypeProvider */] extends StObject {
    
    def apply(
      contentType: String,
      opts: BodyLimit,
      parser: FastifyContentTypeParser[RawServer, RawRequest, RouteGeneric, SchemaCompiler, TypeProvider]
    ): Unit = js.native
    def apply(
      contentType: String,
      parser: FastifyContentTypeParser[RawServer, RawRequest, RouteGeneric, SchemaCompiler, TypeProvider]
    ): Unit = js.native
    def apply(
      contentType: js.Array[String],
      opts: BodyLimit,
      parser: FastifyContentTypeParser[RawServer, RawRequest, RouteGeneric, SchemaCompiler, TypeProvider]
    ): Unit = js.native
    def apply(
      contentType: js.Array[String],
      parser: FastifyContentTypeParser[RawServer, RawRequest, RouteGeneric, SchemaCompiler, TypeProvider]
    ): Unit = js.native
    def apply(
      contentType: js.RegExp,
      opts: BodyLimit,
      parser: FastifyContentTypeParser[RawServer, RawRequest, RouteGeneric, SchemaCompiler, TypeProvider]
    ): Unit = js.native
    def apply(
      contentType: js.RegExp,
      parser: FastifyContentTypeParser[RawServer, RawRequest, RouteGeneric, SchemaCompiler, TypeProvider]
    ): Unit = js.native
    def apply[parseAs /* <: String | Buffer */](
      contentType: String,
      opts: ParseAs[parseAs],
      parser: FastifyBodyParser[parseAs, RawServer, RawRequest, RouteGeneric, SchemaCompiler, TypeProvider]
    ): Unit = js.native
    def apply[parseAs /* <: String | Buffer */](
      contentType: js.Array[String],
      opts: ParseAs[parseAs],
      parser: FastifyBodyParser[parseAs, RawServer, RawRequest, RouteGeneric, SchemaCompiler, TypeProvider]
    ): Unit = js.native
    def apply[parseAs /* <: String | Buffer */](
      contentType: js.RegExp,
      opts: ParseAs[parseAs],
      parser: FastifyBodyParser[parseAs, RawServer, RawRequest, RouteGeneric, SchemaCompiler, TypeProvider]
    ): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.fastify.fastifyStrings.error
    - typingsJapgolly.fastify.fastifyStrings.remove
    - typingsJapgolly.fastify.fastifyStrings.ignore
  */
  trait ConstructorAction extends StObject
  object ConstructorAction {
    
    inline def error: typingsJapgolly.fastify.fastifyStrings.error = "error".asInstanceOf[typingsJapgolly.fastify.fastifyStrings.error]
    
    inline def ignore: typingsJapgolly.fastify.fastifyStrings.ignore = "ignore".asInstanceOf[typingsJapgolly.fastify.fastifyStrings.ignore]
    
    inline def remove: typingsJapgolly.fastify.fastifyStrings.remove = "remove".asInstanceOf[typingsJapgolly.fastify.fastifyStrings.remove]
  }
  
  type ContentTypeParserDoneFunction = js.Function2[/* err */ js.Error | Null, /* body */ js.UndefOr[Any], Unit]
  
  type FastifyBodyParser[RawBody /* <: String | Buffer */, RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RouteGeneric /* <: RouteGenericInterface */, SchemaCompiler /* <: FastifySchema */, TypeProvider /* <: FastifyTypeProvider */] = (js.Function3[
    /* request */ FastifyRequest[
      RouteGeneric, 
      RawServer, 
      RawRequest, 
      SchemaCompiler, 
      TypeProvider, 
      ContextConfigDefault, 
      FastifyBaseLogger, 
      ResolveFastifyRequestType[TypeProvider, SchemaCompiler, RouteGeneric]
    ], 
    /* rawBody */ RawBody, 
    /* done */ ContentTypeParserDoneFunction, 
    Unit
  ]) | (js.Function2[
    /* request */ FastifyRequest[
      RouteGeneric, 
      RawServer, 
      RawRequest, 
      SchemaCompiler, 
      TypeProvider, 
      ContextConfigDefault, 
      FastifyBaseLogger, 
      ResolveFastifyRequestType[TypeProvider, SchemaCompiler, RouteGeneric]
    ], 
    /* rawBody */ RawBody, 
    js.Promise[Any]
  ])
  
  type FastifyContentTypeParser[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RouteGeneric /* <: RouteGenericInterface */, SchemaCompiler /* <: FastifySchema */, TypeProvider /* <: FastifyTypeProvider */] = (js.Function2[
    /* request */ FastifyRequest[
      RouteGeneric, 
      RawServer, 
      RawRequest, 
      SchemaCompiler, 
      TypeProvider, 
      ContextConfigDefault, 
      FastifyBaseLogger, 
      ResolveFastifyRequestType[TypeProvider, SchemaCompiler, RouteGeneric]
    ], 
    /* payload */ RawRequest, 
    js.Promise[Any]
  ]) | (js.Function3[
    /* request */ FastifyRequest[
      RouteGeneric, 
      RawServer, 
      RawRequest, 
      SchemaCompiler, 
      TypeProvider, 
      ContextConfigDefault, 
      FastifyBaseLogger, 
      ResolveFastifyRequestType[TypeProvider, SchemaCompiler, RouteGeneric]
    ], 
    /* payload */ RawRequest, 
    /* done */ ContentTypeParserDoneFunction, 
    Unit
  ])
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.fastify.fastifyStrings.error
    - typingsJapgolly.fastify.fastifyStrings.remove
    - typingsJapgolly.fastify.fastifyStrings.ignore
  */
  trait ProtoAction extends StObject
  object ProtoAction {
    
    inline def error: typingsJapgolly.fastify.fastifyStrings.error = "error".asInstanceOf[typingsJapgolly.fastify.fastifyStrings.error]
    
    inline def ignore: typingsJapgolly.fastify.fastifyStrings.ignore = "ignore".asInstanceOf[typingsJapgolly.fastify.fastifyStrings.ignore]
    
    inline def remove: typingsJapgolly.fastify.fastifyStrings.remove = "remove".asInstanceOf[typingsJapgolly.fastify.fastifyStrings.remove]
  }
  
  type getDefaultJsonParser = js.Function2[
    /* onProtoPoisoning */ ProtoAction, 
    /* onConstructorPoisoning */ ConstructorAction, 
    FastifyBodyParser[
      String, 
      RawServerDefault, 
      RawRequestDefaultExpression[RawServerDefault], 
      RouteGenericInterface, 
      FastifySchema, 
      FastifyTypeProviderDefault
    ]
  ]
  
  type hasContentTypeParser = js.Function1[/* contentType */ String | js.RegExp, Boolean]
  
  type removeAllContentTypeParsers = js.Function0[Unit]
  
  type removeContentTypeParser = js.Function1[/* contentType */ String | js.RegExp | (js.Array[String | js.RegExp]), Unit]
}
