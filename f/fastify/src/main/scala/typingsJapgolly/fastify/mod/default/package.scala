package typingsJapgolly.fastify.mod.default

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.fastify.mod.FastifyHttp2Options
import typingsJapgolly.fastify.mod.FastifyHttp2SecureOptions
import typingsJapgolly.fastify.mod.FastifyHttpsOptions
import typingsJapgolly.fastify.mod.FastifyServerOptions
import typingsJapgolly.fastify.mod.default.^
import typingsJapgolly.fastify.typesInstanceMod.FastifyInstance
import typingsJapgolly.fastify.typesLoggerMod.FastifyBaseLogger
import typingsJapgolly.fastify.typesTypeProviderMod.FastifyTypeProvider
import typingsJapgolly.fastify.typesUtilsMod.RawReplyDefaultExpression
import typingsJapgolly.fastify.typesUtilsMod.RawRequestDefaultExpression
import typingsJapgolly.node.http2Mod.Http2SecureServer
import typingsJapgolly.node.http2Mod.Http2Server
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.ServerResponse
import typingsJapgolly.node.nodeColonnetMod.Socket
import typingsJapgolly.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def apply[Server /* <: typingsJapgolly.node.httpMod.Server[
Instantiable1[/* socket */ Socket, IncomingMessage], 
Instantiable1[
  /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
  ServerResponse[IncomingMessage]
]] */, Request /* <: RawRequestDefaultExpression[Server] */, Reply /* <: RawReplyDefaultExpression[Server] */, Logger /* <: FastifyBaseLogger */, TypeProvider /* <: FastifyTypeProvider */](): (FastifyInstance[Server, Request, Reply, Logger, TypeProvider]) & (PromiseLike[FastifyInstance[Server, Request, Reply, Logger, TypeProvider]]) = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[(FastifyInstance[Server, Request, Reply, Logger, TypeProvider]) & (PromiseLike[FastifyInstance[Server, Request, Reply, Logger, TypeProvider]])]
inline def apply[Server /* <: Http2Server */, Request /* <: RawRequestDefaultExpression[Server] */, Reply /* <: RawReplyDefaultExpression[Server] */, Logger /* <: FastifyBaseLogger */, TypeProvider /* <: FastifyTypeProvider */](opts: FastifyHttp2Options[Server, Logger]): (FastifyInstance[Server, Request, Reply, Logger, TypeProvider]) & (PromiseLike[FastifyInstance[Server, Request, Reply, Logger, TypeProvider]]) = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[(FastifyInstance[Server, Request, Reply, Logger, TypeProvider]) & (PromiseLike[FastifyInstance[Server, Request, Reply, Logger, TypeProvider]])]
/**
  * Fastify factory function for the standard fastify http, https, or http2 server instance.
  *
  * The default function utilizes http
  *
  * @param opts Fastify server options
  * @returns Fastify server instance
  */
inline def apply[Server /* <: Http2SecureServer */, Request /* <: RawRequestDefaultExpression[Server] */, Reply /* <: RawReplyDefaultExpression[Server] */, Logger /* <: FastifyBaseLogger */, TypeProvider /* <: FastifyTypeProvider */](opts: FastifyHttp2SecureOptions[Server, Logger]): (FastifyInstance[Server, Request, Reply, Logger, TypeProvider]) & (PromiseLike[FastifyInstance[Server, Request, Reply, Logger, TypeProvider]]) = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[(FastifyInstance[Server, Request, Reply, Logger, TypeProvider]) & (PromiseLike[FastifyInstance[Server, Request, Reply, Logger, TypeProvider]])]
inline def apply[Server /* <: typingsJapgolly.node.httpsMod.Server[
Instantiable1[/* socket */ Socket, typingsJapgolly.node.nodeColonhttpMod.IncomingMessage], 
Instantiable1[
  /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
  typingsJapgolly.node.nodeColonhttpMod.ServerResponse[IncomingMessage]
]] */, Request /* <: RawRequestDefaultExpression[Server] */, Reply /* <: RawReplyDefaultExpression[Server] */, Logger /* <: FastifyBaseLogger */, TypeProvider /* <: FastifyTypeProvider */](opts: FastifyHttpsOptions[Server, Logger]): (FastifyInstance[Server, Request, Reply, Logger, TypeProvider]) & (PromiseLike[FastifyInstance[Server, Request, Reply, Logger, TypeProvider]]) = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[(FastifyInstance[Server, Request, Reply, Logger, TypeProvider]) & (PromiseLike[FastifyInstance[Server, Request, Reply, Logger, TypeProvider]])]
inline def apply[Server /* <: typingsJapgolly.node.httpMod.Server[
Instantiable1[/* socket */ Socket, IncomingMessage], 
Instantiable1[
  /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
  ServerResponse[IncomingMessage]
]] */, Request /* <: RawRequestDefaultExpression[Server] */, Reply /* <: RawReplyDefaultExpression[Server] */, Logger /* <: FastifyBaseLogger */, TypeProvider /* <: FastifyTypeProvider */](opts: FastifyServerOptions[Server, Logger]): (FastifyInstance[Server, Request, Reply, Logger, TypeProvider]) & (PromiseLike[FastifyInstance[Server, Request, Reply, Logger, TypeProvider]]) = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[(FastifyInstance[Server, Request, Reply, Logger, TypeProvider]) & (PromiseLike[FastifyInstance[Server, Request, Reply, Logger, TypeProvider]])]
