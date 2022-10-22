package typingsJapgolly.fastify

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.node.http2Mod.Http2SecureServer
import typingsJapgolly.node.http2Mod.Http2Server
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.Server
import typingsJapgolly.node.httpMod.ServerResponse
import typingsJapgolly.node.nodeColonnetMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilsMod {
  
  type ContextConfigDefault = Any
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.fastify.fastifyStrings.DELETE
    - typingsJapgolly.fastify.fastifyStrings.GET
    - typingsJapgolly.fastify.fastifyStrings.HEAD
    - typingsJapgolly.fastify.fastifyStrings.PATCH
    - typingsJapgolly.fastify.fastifyStrings.POST
    - typingsJapgolly.fastify.fastifyStrings.PUT
    - typingsJapgolly.fastify.fastifyStrings.OPTIONS
    - typingsJapgolly.fastify.fastifyStrings.PROPFIND
    - typingsJapgolly.fastify.fastifyStrings.PROPPATCH
    - typingsJapgolly.fastify.fastifyStrings.MKCOL
    - typingsJapgolly.fastify.fastifyStrings.COPY
    - typingsJapgolly.fastify.fastifyStrings.MOVE
    - typingsJapgolly.fastify.fastifyStrings.LOCK
    - typingsJapgolly.fastify.fastifyStrings.UNLOCK
    - typingsJapgolly.fastify.fastifyStrings.TRACE
    - typingsJapgolly.fastify.fastifyStrings.SEARCH
  */
  trait HTTPMethods extends StObject
  object HTTPMethods {
    
    inline def COPY: typingsJapgolly.fastify.fastifyStrings.COPY = "COPY".asInstanceOf[typingsJapgolly.fastify.fastifyStrings.COPY]
    
    inline def DELETE: typingsJapgolly.fastify.fastifyStrings.DELETE = "DELETE".asInstanceOf[typingsJapgolly.fastify.fastifyStrings.DELETE]
    
    inline def GET: typingsJapgolly.fastify.fastifyStrings.GET = "GET".asInstanceOf[typingsJapgolly.fastify.fastifyStrings.GET]
    
    inline def HEAD: typingsJapgolly.fastify.fastifyStrings.HEAD = "HEAD".asInstanceOf[typingsJapgolly.fastify.fastifyStrings.HEAD]
    
    inline def LOCK: typingsJapgolly.fastify.fastifyStrings.LOCK = "LOCK".asInstanceOf[typingsJapgolly.fastify.fastifyStrings.LOCK]
    
    inline def MKCOL: typingsJapgolly.fastify.fastifyStrings.MKCOL = "MKCOL".asInstanceOf[typingsJapgolly.fastify.fastifyStrings.MKCOL]
    
    inline def MOVE: typingsJapgolly.fastify.fastifyStrings.MOVE = "MOVE".asInstanceOf[typingsJapgolly.fastify.fastifyStrings.MOVE]
    
    inline def OPTIONS: typingsJapgolly.fastify.fastifyStrings.OPTIONS = "OPTIONS".asInstanceOf[typingsJapgolly.fastify.fastifyStrings.OPTIONS]
    
    inline def PATCH: typingsJapgolly.fastify.fastifyStrings.PATCH = "PATCH".asInstanceOf[typingsJapgolly.fastify.fastifyStrings.PATCH]
    
    inline def POST: typingsJapgolly.fastify.fastifyStrings.POST = "POST".asInstanceOf[typingsJapgolly.fastify.fastifyStrings.POST]
    
    inline def PROPFIND: typingsJapgolly.fastify.fastifyStrings.PROPFIND = "PROPFIND".asInstanceOf[typingsJapgolly.fastify.fastifyStrings.PROPFIND]
    
    inline def PROPPATCH: typingsJapgolly.fastify.fastifyStrings.PROPPATCH = "PROPPATCH".asInstanceOf[typingsJapgolly.fastify.fastifyStrings.PROPPATCH]
    
    inline def PUT: typingsJapgolly.fastify.fastifyStrings.PUT = "PUT".asInstanceOf[typingsJapgolly.fastify.fastifyStrings.PUT]
    
    inline def SEARCH: typingsJapgolly.fastify.fastifyStrings.SEARCH = "SEARCH".asInstanceOf[typingsJapgolly.fastify.fastifyStrings.SEARCH]
    
    inline def TRACE: typingsJapgolly.fastify.fastifyStrings.TRACE = "TRACE".asInstanceOf[typingsJapgolly.fastify.fastifyStrings.TRACE]
    
    inline def UNLOCK: typingsJapgolly.fastify.fastifyStrings.UNLOCK = "UNLOCK".asInstanceOf[typingsJapgolly.fastify.fastifyStrings.UNLOCK]
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    RawServer extends node.http.Server<new (socket : node.node:net.Socket): node.http.IncomingMessage, new <Request extends node.http.IncomingMessage = node.http.IncomingMessage>(req : / * import warning: RewrittenClass.unapply cls was tparam Request * / any): node.http.ServerResponse<Request>> | node.https.Server<new (socket : node.node:net.Socket): node.node:http.IncomingMessage, new <Request extends node.http.IncomingMessage = node.http.IncomingMessage>(req : / * import warning: RewrittenClass.unapply cls was tparam Request * / any): node.node:http.ServerResponse<Request>> ? node.http.ServerResponse<node.http.IncomingMessage> : RawServer extends node.http2.Http2Server | node.http2.Http2SecureServer ? node.http2.Http2ServerResponse : never
    }}}
    */
  @js.native
  trait RawReplyDefaultExpression[RawServer /* <: RawServerBase */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    RawServer extends node.http.Server<new (socket : node.node:net.Socket): node.http.IncomingMessage, new <Request extends node.http.IncomingMessage = node.http.IncomingMessage>(req : / * import warning: RewrittenClass.unapply cls was tparam Request * / any): node.http.ServerResponse<Request>> | node.https.Server<new (socket : node.node:net.Socket): node.node:http.IncomingMessage, new <Request extends node.http.IncomingMessage = node.http.IncomingMessage>(req : / * import warning: RewrittenClass.unapply cls was tparam Request * / any): node.node:http.ServerResponse<Request>> ? node.http.IncomingMessage : RawServer extends node.http2.Http2Server | node.http2.Http2SecureServer ? node.http2.Http2ServerRequest : never
    }}}
    */
  @js.native
  trait RawRequestDefaultExpression[RawServer /* <: RawServerBase */] extends StObject
  
  type RawServerBase = (Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[IncomingMessage]
    ]
  ]) | (typingsJapgolly.node.httpsMod.Server[
    Instantiable1[/* socket */ Socket, typingsJapgolly.node.nodeColonhttpMod.IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      typingsJapgolly.node.nodeColonhttpMod.ServerResponse[IncomingMessage]
    ]
  ]) | Http2Server | Http2SecureServer
  
  type RawServerDefault = Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[IncomingMessage]
    ]
  ]
  
  type ReplyDefault = Any
  
  type RequestBodyDefault = Any
  
  type RequestHeadersDefault = Any
  
  type RequestParamsDefault = Any
  
  type RequestQuerystringDefault = Any
}
