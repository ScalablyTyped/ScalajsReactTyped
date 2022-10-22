package typingsJapgolly.spdy

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.node.nodeColonnetMod.Socket
import typingsJapgolly.spdy.anon.Connection
import typingsJapgolly.spdy.anon.Plain
import typingsJapgolly.spdy.mod.agent.Agent
import typingsJapgolly.spdy.mod.server.Server
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("spdy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object agent {
    
    @JSImport("spdy", "agent")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("spdy", "agent.Agent")
    @js.native
    open class Agent ()
      extends typingsJapgolly.node.httpsMod.Agent {
      def this(options: typingsJapgolly.node.httpsMod.AgentOptions) = this()
    }
    
    @JSImport("spdy", "agent.PlainAgent")
    @js.native
    open class PlainAgent ()
      extends typingsJapgolly.node.httpMod.Agent {
      def this(opts: typingsJapgolly.node.httpMod.AgentOptions) = this()
    }
    
    inline def create(base: Any, options: typingsJapgolly.spdy.mod.agent.AgentOptions): Agent | typingsJapgolly.spdy.mod.agent.PlainAgent = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(base.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Agent | typingsJapgolly.spdy.mod.agent.PlainAgent]
    
    trait AgentOptions
      extends StObject
         with typingsJapgolly.node.httpsMod.AgentOptions {
      
      var spdy: js.UndefOr[Plain] = js.undefined
    }
    object AgentOptions {
      
      inline def apply(): typingsJapgolly.spdy.mod.agent.AgentOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsJapgolly.spdy.mod.agent.AgentOptions]
      }
      
      extension [Self <: typingsJapgolly.spdy.mod.agent.AgentOptions](x: Self) {
        
        inline def setSpdy(value: Plain): Self = StObject.set(x, "spdy", value.asInstanceOf[js.Any])
        
        inline def setSpdyUndefined: Self = StObject.set(x, "spdy", js.undefined)
      }
    }
  }
  
  inline def createAgent(base: Any, options: AgentOptions): Agent_ | PlainAgent = (^.asInstanceOf[js.Dynamic].applyDynamic("createAgent")(base.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Agent_ | PlainAgent]
  inline def createAgent(options: AgentOptions): Agent_ | PlainAgent = ^.asInstanceOf[js.Dynamic].applyDynamic("createAgent")(options.asInstanceOf[js.Any]).asInstanceOf[Agent_ | PlainAgent]
  
  inline def createServer(
    base: Any,
    options: ServerOptions,
    handler: js.Function2[
      /* request */ IncomingMessage, 
      /* response */ typingsJapgolly.node.httpMod.ServerResponse[typingsJapgolly.node.httpMod.IncomingMessage], 
      Unit
    ]
  ): Server_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(base.asInstanceOf[js.Any], options.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Server_]
  inline def createServer(
    handler: js.Function2[
      /* request */ IncomingMessage, 
      /* response */ typingsJapgolly.node.httpMod.ServerResponse[typingsJapgolly.node.httpMod.IncomingMessage], 
      Unit
    ]
  ): Server_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(handler.asInstanceOf[js.Any]).asInstanceOf[Server_]
  inline def createServer(
    options: ServerOptions,
    handler: js.Function2[
      /* request */ IncomingMessage, 
      /* response */ typingsJapgolly.node.httpMod.ServerResponse[typingsJapgolly.node.httpMod.IncomingMessage], 
      Unit
    ]
  ): Server_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Server_]
  
  object request {
    
    @JSImport("spdy", "request")
    @js.native
    val ^ : js.Any = js.native
    
    inline def onNewListener(`type`: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onNewListener")(`type`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  object response {
    
    @JSImport("spdy", "response")
    @js.native
    val ^ : js.Any = js.native
    
    inline def end(data: Any, encoding: String, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("end")(data.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def writeHead(statusCode: Double, obj: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeHead")(statusCode.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def writeHead(statusCode: Double, reason: String, obj: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeHead")(statusCode.asInstanceOf[js.Any], reason.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  object server {
    
    @JSImport("spdy", "server")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(
      base: Any,
      options: typingsJapgolly.node.httpsMod.ServerOptions[
          Instantiable1[/* socket */ Socket, typingsJapgolly.node.nodeColonhttpMod.IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            typingsJapgolly.node.nodeColonhttpMod.ServerResponse[typingsJapgolly.node.httpMod.IncomingMessage]
          ]
        ],
      handler: js.Function2[
          /* request */ typingsJapgolly.spdy.mod.server.IncomingMessage, 
          /* response */ typingsJapgolly.spdy.mod.server.ServerResponse | typingsJapgolly.node.httpMod.ServerResponse[typingsJapgolly.node.httpMod.IncomingMessage], 
          Unit
        ]
    ): Server = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(base.asInstanceOf[js.Any], options.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Server]
    inline def create(
      handler: js.Function2[
          /* request */ typingsJapgolly.spdy.mod.server.IncomingMessage, 
          /* response */ typingsJapgolly.spdy.mod.server.ServerResponse | typingsJapgolly.node.httpMod.ServerResponse[typingsJapgolly.node.httpMod.IncomingMessage], 
          Unit
        ]
    ): Server = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(handler.asInstanceOf[js.Any]).asInstanceOf[Server]
    inline def create(
      options: typingsJapgolly.node.httpsMod.ServerOptions[
          Instantiable1[/* socket */ Socket, typingsJapgolly.node.nodeColonhttpMod.IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            typingsJapgolly.node.nodeColonhttpMod.ServerResponse[typingsJapgolly.node.httpMod.IncomingMessage]
          ]
        ],
      handler: js.Function2[
          /* request */ typingsJapgolly.spdy.mod.server.IncomingMessage, 
          /* response */ typingsJapgolly.node.httpMod.ServerResponse[typingsJapgolly.node.httpMod.IncomingMessage], 
          Unit
        ]
    ): Server = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Server]
    
    type IncomingMessage = typingsJapgolly.node.httpMod.IncomingMessage
    
    type PlainServer = typingsJapgolly.node.httpMod.Server[
        Instantiable1[/* socket */ Socket, typingsJapgolly.node.httpMod.IncomingMessage], 
        Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
          typingsJapgolly.node.httpMod.ServerResponse[typingsJapgolly.node.httpMod.IncomingMessage]
        ]
      ]
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.spdy.spdyStrings.h2
      - typingsJapgolly.spdy.spdyStrings.spdySlash3Dot1
      - typingsJapgolly.spdy.spdyStrings.spdySlash3
      - typingsJapgolly.spdy.spdyStrings.spdySlash2
      - typingsJapgolly.spdy.spdyStrings.httpSlash1Dot1
      - typingsJapgolly.spdy.spdyStrings.httpSlash1Dot0
    */
    trait Protocol extends StObject
    object Protocol {
      
      inline def h2: typingsJapgolly.spdy.spdyStrings.h2 = "h2".asInstanceOf[typingsJapgolly.spdy.spdyStrings.h2]
      
      inline def httpSlash1Dot0: typingsJapgolly.spdy.spdyStrings.httpSlash1Dot0 = "http/1.0".asInstanceOf[typingsJapgolly.spdy.spdyStrings.httpSlash1Dot0]
      
      inline def httpSlash1Dot1: typingsJapgolly.spdy.spdyStrings.httpSlash1Dot1 = "http/1.1".asInstanceOf[typingsJapgolly.spdy.spdyStrings.httpSlash1Dot1]
      
      inline def spdySlash2: typingsJapgolly.spdy.spdyStrings.spdySlash2 = "spdy/2".asInstanceOf[typingsJapgolly.spdy.spdyStrings.spdySlash2]
      
      inline def spdySlash3: typingsJapgolly.spdy.spdyStrings.spdySlash3 = "spdy/3".asInstanceOf[typingsJapgolly.spdy.spdyStrings.spdySlash3]
      
      inline def spdySlash3Dot1: typingsJapgolly.spdy.spdyStrings.spdySlash3Dot1 = "spdy/3.1".asInstanceOf[typingsJapgolly.spdy.spdyStrings.spdySlash3Dot1]
    }
    
    trait PushOptions extends StObject {
      
      var method: js.UndefOr[String] = js.undefined
      
      var request: js.UndefOr[Any] = js.undefined
      
      var response: js.UndefOr[Any] = js.undefined
      
      var status: js.UndefOr[Double] = js.undefined
    }
    object PushOptions {
      
      inline def apply(): PushOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PushOptions]
      }
      
      extension [Self <: PushOptions](x: Self) {
        
        inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
        
        inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
        
        inline def setRequest(value: Any): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
        
        inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
        
        inline def setResponse(value: Any): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
        
        inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
        
        inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      }
    }
    
    type Server = typingsJapgolly.node.httpsMod.Server[
        Instantiable1[/* socket */ Socket, typingsJapgolly.node.nodeColonhttpMod.IncomingMessage], 
        Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
          typingsJapgolly.node.nodeColonhttpMod.ServerResponse[typingsJapgolly.node.httpMod.IncomingMessage]
        ]
      ]
    
    trait ServerOptions
      extends StObject
         with typingsJapgolly.node.httpsMod.ServerOptions[
              Instantiable1[/* socket */ Socket, typingsJapgolly.node.nodeColonhttpMod.IncomingMessage], 
              Instantiable1[
                /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
                typingsJapgolly.node.nodeColonhttpMod.ServerResponse[typingsJapgolly.node.httpMod.IncomingMessage]
              ]
            ] {
      
      var spdy: js.UndefOr[Connection] = js.undefined
    }
    object ServerOptions {
      
      inline def apply(): typingsJapgolly.spdy.mod.server.ServerOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsJapgolly.spdy.mod.server.ServerOptions]
      }
      
      extension [Self <: typingsJapgolly.spdy.mod.server.ServerOptions](x: Self) {
        
        inline def setSpdy(value: Connection): Self = StObject.set(x, "spdy", value.asInstanceOf[js.Any])
        
        inline def setSpdyUndefined: Self = StObject.set(x, "spdy", js.undefined)
      }
    }
    
    @js.native
    trait ServerResponse
      extends typingsJapgolly.node.httpMod.ServerResponse[typingsJapgolly.node.httpMod.IncomingMessage] {
      
      def push(filename: String, options: PushOptions): Any = js.native
    }
  }
  
  type AgentOptions = typingsJapgolly.spdy.mod.agent.AgentOptions
  
  type Agent_ = Agent
  
  @js.native
  trait Handle extends StObject {
    
    def assignClientRequest(req: Any): Unit = js.native
    
    def assignRequest(req: Any): Unit = js.native
    
    def assignResponse(res: Any): Unit = js.native
    
    def assignSocket(socket: Socket_, options: js.Object): Unit = js.native
    
    def create(options: js.Object, stream: Any, socket: Socket_): Handle = js.native
    
    def emitRequest(): Unit = js.native
    
    def emitResponse(status: Any, headers: Any): Unit = js.native
    
    def getStream(): Any = js.native
    def getStream(callback: js.Function1[/* stream */ Any, Unit]): Any = js.native
  }
  
  type IncomingMessage = typingsJapgolly.spdy.mod.server.IncomingMessage
  
  type PlainAgent = typingsJapgolly.spdy.mod.agent.PlainAgent
  
  type PlainServer = typingsJapgolly.spdy.mod.server.PlainServer
  
  type ServerOptions = typingsJapgolly.spdy.mod.server.ServerOptions
  
  type ServerRequest = typingsJapgolly.spdy.mod.server.IncomingMessage
  
  type ServerResponse = typingsJapgolly.spdy.mod.server.ServerResponse
  
  type Server_ = Server
  
  type Socket_ = typingsJapgolly.spdy.mod.socket.Socket
  
  object socket {
    
    // tslint:disable-next-line no-empty-interface
    trait Socket extends StObject
  }
}
