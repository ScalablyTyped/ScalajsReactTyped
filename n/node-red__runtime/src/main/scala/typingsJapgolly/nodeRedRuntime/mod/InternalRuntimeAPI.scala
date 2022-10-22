package typingsJapgolly.nodeRedRuntime.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.express.mod.Express
import typingsJapgolly.expressServeStaticCore.mod.Application
import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.node.httpsMod.Server
import typingsJapgolly.node.nodeColonhttpMod.IncomingMessage
import typingsJapgolly.node.nodeColonhttpMod.ServerResponse
import typingsJapgolly.node.nodeColonnetMod.Socket
import typingsJapgolly.nodeRedUtil.mod.I18n
import typingsJapgolly.nodeRedUtil.mod.Log
import typingsJapgolly.nodeRedUtil.mod.Util
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-line:no-empty-interface
trait InternalRuntimeAPI extends StObject {
  
  val adminApi: js.Object
  
  def adminApp(): Application
  @JSName("adminApp")
  val adminApp_Original: Express
  
  var events: EventEmitter
  
  var exec: InternalExecModule
  
  val i18n: I18n
  
  def isStarted(): Boolean
  
  var library: InternalLibraryModule
  
  val log: Log
  
  def nodeApp(): Application
  @JSName("nodeApp")
  val nodeApp_Original: Express
  
  var nodes: InternalNodesModule
  
  val server: Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[typingsJapgolly.node.httpMod.IncomingMessage]
    ]
  ]
  
  var settings: PersistentSettings
  
  var storage: StorageModule
  
  var util: Util
  
  def version(): String
}
object InternalRuntimeAPI {
  
  inline def apply(
    adminApi: js.Object,
    adminApp: Express,
    events: EventEmitter,
    exec: InternalExecModule,
    i18n: I18n,
    isStarted: CallbackTo[Boolean],
    library: InternalLibraryModule,
    log: Log,
    nodeApp: Express,
    nodes: InternalNodesModule,
    server: Server[
      Instantiable1[/* socket */ Socket, IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[typingsJapgolly.node.httpMod.IncomingMessage]
      ]
    ],
    settings: PersistentSettings,
    storage: StorageModule,
    util: Util,
    version: CallbackTo[String]
  ): InternalRuntimeAPI = {
    val __obj = js.Dynamic.literal(adminApi = adminApi.asInstanceOf[js.Any], adminApp = adminApp.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], exec = exec.asInstanceOf[js.Any], i18n = i18n.asInstanceOf[js.Any], isStarted = isStarted.toJsFn, library = library.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], nodeApp = nodeApp.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any], util = util.asInstanceOf[js.Any], version = version.toJsFn)
    __obj.asInstanceOf[InternalRuntimeAPI]
  }
  
  extension [Self <: InternalRuntimeAPI](x: Self) {
    
    inline def setAdminApi(value: js.Object): Self = StObject.set(x, "adminApi", value.asInstanceOf[js.Any])
    
    inline def setAdminApp(value: Express): Self = StObject.set(x, "adminApp", value.asInstanceOf[js.Any])
    
    inline def setEvents(value: EventEmitter): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setExec(value: InternalExecModule): Self = StObject.set(x, "exec", value.asInstanceOf[js.Any])
    
    inline def setI18n(value: I18n): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
    
    inline def setIsStarted(value: CallbackTo[Boolean]): Self = StObject.set(x, "isStarted", value.toJsFn)
    
    inline def setLibrary(value: InternalLibraryModule): Self = StObject.set(x, "library", value.asInstanceOf[js.Any])
    
    inline def setLog(value: Log): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    inline def setNodeApp(value: Express): Self = StObject.set(x, "nodeApp", value.asInstanceOf[js.Any])
    
    inline def setNodes(value: InternalNodesModule): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setServer(
      value: Server[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[typingsJapgolly.node.httpMod.IncomingMessage]
          ]
        ]
    ): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    inline def setSettings(value: PersistentSettings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setStorage(value: StorageModule): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
    
    inline def setUtil(value: Util): Self = StObject.set(x, "util", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: CallbackTo[String]): Self = StObject.set(x, "version", value.toJsFn)
  }
}
