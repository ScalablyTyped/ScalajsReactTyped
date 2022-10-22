package typingsJapgolly.fastify.mod

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.fastify.typesLoggerMod.FastifyBaseLogger
import typingsJapgolly.node.httpsMod.ServerOptions
import typingsJapgolly.node.nodeColonhttpMod.IncomingMessage
import typingsJapgolly.node.nodeColonhttpMod.ServerResponse
import typingsJapgolly.node.nodeColonnetMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FastifyHttpsOptions[Server /* <: typingsJapgolly.node.httpsMod.Server[
Instantiable1[/* socket */ Socket, IncomingMessage], 
Instantiable1[
  /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
  ServerResponse[typingsJapgolly.node.httpMod.IncomingMessage]
]] */, Logger /* <: FastifyBaseLogger */]
  extends StObject
     with FastifyServerOptions[Server, Logger] {
  
  var https: (ServerOptions[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[typingsJapgolly.node.httpMod.IncomingMessage]
    ]
  ]) | Null
}
object FastifyHttpsOptions {
  
  inline def apply[Server /* <: typingsJapgolly.node.httpsMod.Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[typingsJapgolly.node.httpMod.IncomingMessage]
    ]
  ] */, Logger /* <: FastifyBaseLogger */](): FastifyHttpsOptions[Server, Logger] = {
    val __obj = js.Dynamic.literal(https = null)
    __obj.asInstanceOf[FastifyHttpsOptions[Server, Logger]]
  }
  
  extension [Self <: FastifyHttpsOptions[?, ?], Server /* <: typingsJapgolly.node.httpsMod.Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[typingsJapgolly.node.httpMod.IncomingMessage]
    ]
  ] */, Logger /* <: FastifyBaseLogger */](x: Self & (FastifyHttpsOptions[Server, Logger])) {
    
    inline def setHttps(
      value: ServerOptions[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[typingsJapgolly.node.httpMod.IncomingMessage]
          ]
        ]
    ): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
    
    inline def setHttpsNull: Self = StObject.set(x, "https", null)
  }
}
