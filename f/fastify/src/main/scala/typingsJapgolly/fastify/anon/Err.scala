package typingsJapgolly.fastify.anon

import typingsJapgolly.fastify.typesLoggerMod.FastifyBaseLogger
import typingsJapgolly.fastify.typesReplyMod.FastifyReply
import typingsJapgolly.fastify.typesRequestMod.FastifyRequest
import typingsJapgolly.fastify.typesRouteMod.RouteGenericInterface
import typingsJapgolly.fastify.typesSchemaMod.FastifySchema
import typingsJapgolly.fastify.typesTypeProviderMod.FastifyTypeProvider
import typingsJapgolly.fastify.typesTypeProviderMod.ResolveFastifyReplyType
import typingsJapgolly.fastify.typesTypeProviderMod.ResolveFastifyRequestType
import typingsJapgolly.fastify.typesUtilsMod.ContextConfigDefault
import typingsJapgolly.fastify.typesUtilsMod.RawReplyDefaultExpression
import typingsJapgolly.fastify.typesUtilsMod.RawRequestDefaultExpression
import typingsJapgolly.fastify.typesUtilsMod.RawServerBase
import typingsJapgolly.fastifyError.mod.FastifyError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Err[RawRequest /* <: FastifyRequest[
RouteGenericInterface, 
RawServer, 
RawRequestDefaultExpression[RawServer], 
FastifySchema, 
FastifyTypeProvider, 
ContextConfigDefault, 
FastifyBaseLogger, 
ResolveFastifyRequestType[FastifyTypeProvider, FastifySchema, RouteGenericInterface]] */, RawReply /* <: FastifyReply[
RawServer, 
RawRequestDefaultExpression[RawServer], 
RawReplyDefaultExpression[RawServer], 
RouteGenericInterface, 
ContextConfigDefault, 
FastifySchema, 
FastifyTypeProvider, 
ResolveFastifyReplyType[FastifyTypeProvider, FastifySchema, RouteGenericInterface]] */, RawServer /* <: RawServerBase */] extends StObject {
  
  var err: js.UndefOr[js.Function1[/* err */ FastifyError, Message]] = js.undefined
  
  var req: js.UndefOr[js.Function1[/* req */ RawRequest, Dictkey]] = js.undefined
  
  var res: js.UndefOr[js.Function1[/* res */ RawReply, StatusCode]] = js.undefined
}
object Err {
  
  inline def apply[RawRequest /* <: FastifyRequest[
    RouteGenericInterface, 
    RawServer, 
    RawRequestDefaultExpression[RawServer], 
    FastifySchema, 
    FastifyTypeProvider, 
    ContextConfigDefault, 
    FastifyBaseLogger, 
    ResolveFastifyRequestType[FastifyTypeProvider, FastifySchema, RouteGenericInterface]
  ] */, RawReply /* <: FastifyReply[
    RawServer, 
    RawRequestDefaultExpression[RawServer], 
    RawReplyDefaultExpression[RawServer], 
    RouteGenericInterface, 
    ContextConfigDefault, 
    FastifySchema, 
    FastifyTypeProvider, 
    ResolveFastifyReplyType[FastifyTypeProvider, FastifySchema, RouteGenericInterface]
  ] */, RawServer /* <: RawServerBase */](): Err[RawRequest, RawReply, RawServer] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Err[RawRequest, RawReply, RawServer]]
  }
  
  extension [Self <: Err[?, ?, ?], RawRequest /* <: FastifyRequest[
    RouteGenericInterface, 
    RawServer, 
    RawRequestDefaultExpression[RawServer], 
    FastifySchema, 
    FastifyTypeProvider, 
    ContextConfigDefault, 
    FastifyBaseLogger, 
    ResolveFastifyRequestType[FastifyTypeProvider, FastifySchema, RouteGenericInterface]
  ] */, RawReply /* <: FastifyReply[
    RawServer, 
    RawRequestDefaultExpression[RawServer], 
    RawReplyDefaultExpression[RawServer], 
    RouteGenericInterface, 
    ContextConfigDefault, 
    FastifySchema, 
    FastifyTypeProvider, 
    ResolveFastifyReplyType[FastifyTypeProvider, FastifySchema, RouteGenericInterface]
  ] */, RawServer /* <: RawServerBase */](x: Self & (Err[RawRequest, RawReply, RawServer])) {
    
    inline def setErr(value: /* err */ FastifyError => Message): Self = StObject.set(x, "err", js.Any.fromFunction1(value))
    
    inline def setErrUndefined: Self = StObject.set(x, "err", js.undefined)
    
    inline def setReq(value: /* req */ RawRequest => Dictkey): Self = StObject.set(x, "req", js.Any.fromFunction1(value))
    
    inline def setReqUndefined: Self = StObject.set(x, "req", js.undefined)
    
    inline def setRes(value: /* res */ RawReply => StatusCode): Self = StObject.set(x, "res", js.Any.fromFunction1(value))
    
    inline def setResUndefined: Self = StObject.set(x, "res", js.undefined)
  }
}
