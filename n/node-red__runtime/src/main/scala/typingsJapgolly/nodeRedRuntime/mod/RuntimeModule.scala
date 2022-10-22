package typingsJapgolly.nodeRedRuntime.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.express.mod.Express
import typingsJapgolly.expressServeStaticCore.mod.Application
import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.node.httpsMod.Server
import typingsJapgolly.node.nodeColonhttpMod.IncomingMessage
import typingsJapgolly.node.nodeColonhttpMod.ServerResponse
import typingsJapgolly.node.nodeColonnetMod.Socket
import typingsJapgolly.nodeRedUtil.mod.Hooks
import typingsJapgolly.nodeRedUtil.mod.Util
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuntimeModule extends StObject {
  
  @JSName("_")
  var _underscore: InternalRuntimeAPI
  
  var comms: CommsModule
  
  var context: ContextModule
  
  var events: EventEmitter
  
  var flows: FlowsModule
  
  var hooks: Hooks
  
  def httpAdmin(): Application
  @JSName("httpAdmin")
  val httpAdmin_Original: Express
  
  def httpNode(): Application
  @JSName("httpNode")
  val httpNode_Original: Express
  
  /**
    * Initialise the runtime module.
    * @param settings - the runtime settings object
    * @param server - the http server instance for the server to use
    * @param adminApi - an instance of @node-red/editor-api
    */
  def init(
    userSettings: LocalSettings,
    httpServer: Server[
      Instantiable1[/* socket */ Socket, IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[typingsJapgolly.node.httpMod.IncomingMessage]
      ]
    ],
    _adminApi: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorAPIModule */ Any
  ): Unit
  
  /**
    * Returns whether the runtime is started
    */
  def isStarted(): js.Promise[Boolean]
  
  var library: LibraryModule
  
  var nodes: NodesModule
  
  var projects: ProjectsModule
  
  val server: Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[typingsJapgolly.node.httpMod.IncomingMessage]
    ]
  ]
  
  var settings: SettingsModule
  
  /**
    * Start the runtime. Resolves when the runtime is started. This does not
    *   mean the flows will be running as they are started asynchronously.
    */
  def start(): js.Promise[Unit]
  
  /**
    * Stops the runtime. Resolves when the runtime is stopped.
    */
  def stop(): js.Promise[Unit]
  
  var storage: StorageModule
  
  var util: Util
  
  /**
    * Returns version number of the runtime
    */
  def version(): js.Promise[String]
}
object RuntimeModule {
  
  inline def apply(
    _underscore: InternalRuntimeAPI,
    comms: CommsModule,
    context: ContextModule,
    events: EventEmitter,
    flows: FlowsModule,
    hooks: Hooks,
    httpAdmin: Express,
    httpNode: Express,
    init: (LocalSettings, Server[
      Instantiable1[/* socket */ Socket, IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[typingsJapgolly.node.httpMod.IncomingMessage]
      ]
    ], /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorAPIModule */ Any) => Callback,
    isStarted: CallbackTo[js.Promise[Boolean]],
    library: LibraryModule,
    nodes: NodesModule,
    projects: ProjectsModule,
    server: Server[
      Instantiable1[/* socket */ Socket, IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[typingsJapgolly.node.httpMod.IncomingMessage]
      ]
    ],
    settings: SettingsModule,
    start: CallbackTo[js.Promise[Unit]],
    stop: CallbackTo[js.Promise[Unit]],
    storage: StorageModule,
    util: Util,
    version: CallbackTo[js.Promise[String]]
  ): RuntimeModule = {
    val __obj = js.Dynamic.literal(comms = comms.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], flows = flows.asInstanceOf[js.Any], hooks = hooks.asInstanceOf[js.Any], httpAdmin = httpAdmin.asInstanceOf[js.Any], httpNode = httpNode.asInstanceOf[js.Any], init = js.Any.fromFunction3((t0: LocalSettings, t1: Server[
      Instantiable1[/* socket */ Socket, IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[typingsJapgolly.node.httpMod.IncomingMessage]
      ]
    ], t2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorAPIModule */ Any) => (init(t0, t1, t2)).runNow()), isStarted = isStarted.toJsFn, library = library.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], projects = projects.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], start = start.toJsFn, stop = stop.toJsFn, storage = storage.asInstanceOf[js.Any], util = util.asInstanceOf[js.Any], version = version.toJsFn)
    __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuntimeModule]
  }
  
  extension [Self <: RuntimeModule](x: Self) {
    
    inline def setComms(value: CommsModule): Self = StObject.set(x, "comms", value.asInstanceOf[js.Any])
    
    inline def setContext(value: ContextModule): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setEvents(value: EventEmitter): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setFlows(value: FlowsModule): Self = StObject.set(x, "flows", value.asInstanceOf[js.Any])
    
    inline def setHooks(value: Hooks): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
    
    inline def setHttpAdmin(value: Express): Self = StObject.set(x, "httpAdmin", value.asInstanceOf[js.Any])
    
    inline def setHttpNode(value: Express): Self = StObject.set(x, "httpNode", value.asInstanceOf[js.Any])
    
    inline def setInit(
      value: (LocalSettings, Server[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[typingsJapgolly.node.httpMod.IncomingMessage]
          ]
        ], /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorAPIModule */ Any) => Callback
    ): Self = StObject.set(x, "init", js.Any.fromFunction3((t0: LocalSettings, t1: Server[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[typingsJapgolly.node.httpMod.IncomingMessage]
          ]
        ], t2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorAPIModule */ Any) => (value(t0, t1, t2)).runNow()))
    
    inline def setIsStarted(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isStarted", value.toJsFn)
    
    inline def setLibrary(value: LibraryModule): Self = StObject.set(x, "library", value.asInstanceOf[js.Any])
    
    inline def setNodes(value: NodesModule): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setProjects(value: ProjectsModule): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
    
    inline def setServer(
      value: Server[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[typingsJapgolly.node.httpMod.IncomingMessage]
          ]
        ]
    ): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    inline def setSettings(value: SettingsModule): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setStart(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "start", value.toJsFn)
    
    inline def setStop(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "stop", value.toJsFn)
    
    inline def setStorage(value: StorageModule): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
    
    inline def setUtil(value: Util): Self = StObject.set(x, "util", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "version", value.toJsFn)
    
    inline def set_underscore(value: InternalRuntimeAPI): Self = StObject.set(x, "_", value.asInstanceOf[js.Any])
  }
}
