package typingsJapgolly.socketcluster

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.Server
import typingsJapgolly.node.httpMod.ServerResponse
import typingsJapgolly.node.nodeColonnetMod.Socket
import typingsJapgolly.scAuth.mod.SCAuthEngine
import typingsJapgolly.scBrokerCluster.mod.SCExchange
import typingsJapgolly.socketcluster.anon.ClientCount
import typingsJapgolly.socketcluster.socketclusterStrings.connection
import typingsJapgolly.socketcluster.socketclusterStrings.error
import typingsJapgolly.socketcluster.socketclusterStrings.exit
import typingsJapgolly.socketcluster.socketclusterStrings.masterMessage
import typingsJapgolly.socketcluster.socketclusterStrings.ready
import typingsJapgolly.socketcluster.socketclusterStrings.start
import typingsJapgolly.socketcluster.socketclusterStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scworkerMod {
  
  @JSImport("socketcluster/scworker", JSImport.Namespace)
  @js.native
  open class ^ () extends SCWorker {
    def this(options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SCServer.SCServerOptions */ Any) = this()
  }
  
  @js.native
  trait SCWorker extends EventEmitter {
    
    val EVENT_CONNECTION: connection = js.native
    
    val EVENT_ERROR: error = js.native
    
    val EVENT_EXIT: exit = js.native
    
    val EVENT_READY: ready = js.native
    
    val EVENT_WARNING: warning = js.native
    
    val MIDDLEWARE_START: start = js.native
    
    @JSName("addMiddleware")
    def addMiddleware_start(`type`: start, middlewareFn: middlewareFunction): Unit = js.native
    
    var auth: SCAuthEngine = js.native
    
    def close(): Unit = js.native
    def close(callback: js.Function0[Unit]): Unit = js.native
    
    var exchange: SCExchange = js.native
    
    def getHTTPServer(): (Server[
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
      ]) = js.native
    
    def getSCServer(): Any = js.native
    
    def getSocketPath(): String = js.native
    
    def getStatus(): ClientCount = js.native
    
    var httpServer: (Server[
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
      ]) = js.native
    
    var id: Double = js.native
    
    var isLeader: Boolean = js.native
    
    @JSName("on")
    def on_connection(
      event: connection,
      listener: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SCServerSocket */ /* scSocket */ Any, 
          Unit
        ]
    ): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("on")
    def on_masterMessage(
      event: masterMessage,
      listener: js.Function2[
          /* data */ Any, 
          /* respond */ js.Function2[/* err */ js.Error | Null, /* responseData */ Any, Unit], 
          Unit
        ]
    ): this.type = js.native
    @JSName("on")
    def on_ready(event: ready, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_warning(event: warning, listener: js.Function1[/* warning */ js.Error, Unit]): this.type = js.native
    
    def open(): Unit = js.native
    
    var options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SCServer.SCServerOptions */ Any = js.native
    
    @JSName("removeMiddleware")
    def removeMiddleware_start(`type`: start, middlewareFn: middlewareFunction): Unit = js.native
    
    def respondToMaster(err: js.Error, data: Any, rid: Double): Unit = js.native
    def respondToMaster(err: Null, data: Any, rid: Double): Unit = js.native
    
    def run(): Unit = js.native
    
    var scServer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SCServer */ Any = js.native
    
    def sendToMaster(data: Any, callback: js.Function2[/* err */ js.Error | Null, /* data */ Any, Unit]): Unit = js.native
    
    def setAuthEngine(authEngine: SCAuthEngine): Unit = js.native
    
    def setCodecEngine(
      codecEngine: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SCServer.SCCodecEngine */ Any
    ): Unit = js.native
    
    def start(): js.Promise[Unit] = js.native
    
    def startHTTPServer(): Unit = js.native
  }
  
  type middlewareFunction = js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SCServer.SCServerOptions */ /* options */ Any, 
    /* next */ js.Function1[/* error */ js.UndefOr[String | js.Error], Unit], 
    Unit
  ]
}
