package typingsJapgolly.awsSdkNodeHttpHandler

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.awsSdkTypes.distTypesHttpMod.HttpResponse
import typingsJapgolly.node.http2Mod.Http2Server
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.Server
import typingsJapgolly.node.httpMod.ServerResponse
import typingsJapgolly.node.nodeColonnetMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesServerDotmockMod {
  
  @JSImport("@aws-sdk/node-http-handler/dist-types/server.mock", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createContinueResponseFunction(httpResp: HttpResponse): js.Function2[/* request */ IncomingMessage, /* response */ ServerResponse[IncomingMessage], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("createContinueResponseFunction")(httpResp.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* request */ IncomingMessage, /* response */ ServerResponse[IncomingMessage], Unit]]
  
  inline def createMockHttp2Server(): Http2Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createMockHttp2Server")().asInstanceOf[Http2Server]
  
  inline def createMockHttpServer(): Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[IncomingMessage]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createMockHttpServer")().asInstanceOf[Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[IncomingMessage]
    ]
  ]]
  
  inline def createMockHttpsServer(): typingsJapgolly.node.httpsMod.Server[
    Instantiable1[/* socket */ Socket, typingsJapgolly.node.nodeColonhttpMod.IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      typingsJapgolly.node.nodeColonhttpMod.ServerResponse[IncomingMessage]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createMockHttpsServer")().asInstanceOf[typingsJapgolly.node.httpsMod.Server[
    Instantiable1[/* socket */ Socket, typingsJapgolly.node.nodeColonhttpMod.IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      typingsJapgolly.node.nodeColonhttpMod.ServerResponse[IncomingMessage]
    ]
  ]]
  
  inline def createResponseFunction(httpResp: HttpResponse): js.Function2[/* request */ IncomingMessage, /* response */ ServerResponse[IncomingMessage], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("createResponseFunction")(httpResp.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* request */ IncomingMessage, /* response */ ServerResponse[IncomingMessage], Unit]]
  
  inline def createResponseFunctionWithDelay(httpResp: HttpResponse, delay: Double): js.Function2[/* request */ IncomingMessage, /* response */ ServerResponse[IncomingMessage], Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("createResponseFunctionWithDelay")(httpResp.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* request */ IncomingMessage, /* response */ ServerResponse[IncomingMessage], Unit]]
}
