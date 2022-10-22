package typingsJapgolly.nodeRed

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.express.mod.Express
import typingsJapgolly.expressServeStaticCore.mod.Application
import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.Server
import typingsJapgolly.node.httpMod.ServerResponse
import typingsJapgolly.node.nodeColonnetMod.Socket
import typingsJapgolly.nodeRedEditorApi.mod.Auth
import typingsJapgolly.nodeRedEditorClient.mod.NodeInstance
import typingsJapgolly.nodeRedEditorClient.mod.NodeProperties
import typingsJapgolly.nodeRedEditorClient.mod.NodePropertiesDef
import typingsJapgolly.nodeRedEditorClient.mod.NodePropertyDef
import typingsJapgolly.nodeRedEditorClient.mod.RED
import typingsJapgolly.nodeRedEditorClient.mod.WidgetEditableList
import typingsJapgolly.nodeRedEditorClient.mod.WidgetEditableListOptions
import typingsJapgolly.nodeRedEditorClient.mod.WidgetTypedInput
import typingsJapgolly.nodeRedEditorClient.mod.WidgetTypedInputOptions
import typingsJapgolly.nodeRedEditorClient.mod.WidgetTypedInputType
import typingsJapgolly.nodeRedEditorClient.mod.WidgetTypedInputTypeDefinition
import typingsJapgolly.nodeRedRuntime.mod.InternalNodesModule
import typingsJapgolly.nodeRedRuntime.mod.LocalSettings
import typingsJapgolly.nodeRedRuntime.mod.PersistentSettings
import typingsJapgolly.nodeRedRuntime.mod.RuntimeModule
import typingsJapgolly.nodeRedUtil.mod.Hooks
import typingsJapgolly.nodeRedUtil.mod.Log
import typingsJapgolly.nodeRedUtil.mod.Util
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("node-red", JSImport.Namespace)
  @js.native
  val ^ : NodeRedApp = js.native
  
  type EditorNodeCredential = typingsJapgolly.nodeRedEditorClient.mod.NodeCredential
  
  type EditorNodeCredentials[T] = typingsJapgolly.nodeRedEditorClient.mod.NodeCredentials[T]
  
  /**
    * Node Definition
    * Read more: https://nodered.org/docs/creating-nodes/node-html#node-definition
    */
  type EditorNodeDef[TProps /* <: EditorNodeProperties */, TCreds, TInstProps /* <: TProps */] = typingsJapgolly.nodeRedEditorClient.mod.NodeDef[TProps, TCreds, TInstProps]
  
  type EditorNodeInstance[TProps /* <: EditorNodeProperties */] = NodeInstance[TProps]
  
  /**
    * Node properties
    * Read more: https://nodered.org/docs/creating-nodes/properties
    */
  type EditorNodeProperties = NodeProperties
  
  /**
    * Properties definitions (`defaults` object)
    * Read more: https://nodered.org/docs/creating-nodes/properties
    */
  type EditorNodePropertiesDef[TProps /* <: EditorNodeProperties */, TInstProps /* <: TProps */] = NodePropertiesDef[TProps, TInstProps]
  
  /********************************************************************
    * Type shortcuts for writing the editor side of nodes (.html file)
    ********************************************************************/
  /**
    * Property definition
    * Read more: https://nodered.org/docs/creating-nodes/properties#property-definitions
    */
  type EditorNodePropertyDef[TVal, TInstProps /* <: EditorNodeProperties */] = NodePropertyDef[TVal, TInstProps]
  
  /**
    * Type def for the global `RED` in the node .html files.
    * Should be used to access `RED.nodes.registerType` function
    * registering a node with the editor.
    *
    * Example:
    * ```
    * declare const RED: EditorRED;
    *
    * RED.nodes.registerType<
    *   MyNodeProps
    * >("my-node", {
    *   ...
    * })
    * ```
    *
    */
  type EditorRED = RED
  
  type EditorWidgetEditableList = WidgetEditableList
  
  /**
    * WIDGETS
    */
  type EditorWidgetEditableListOptions[T] = WidgetEditableListOptions[T]
  
  type EditorWidgetTypedInput = WidgetTypedInput
  
  type EditorWidgetTypedInputOptions = WidgetTypedInputOptions
  
  type EditorWidgetTypedInputType = WidgetTypedInputType
  
  type EditorWidgetTypedInputTypeDefinition = WidgetTypedInputTypeDefinition
  
  type Node[TCreds /* <: js.Object */] = typingsJapgolly.nodeRedRegistry.mod.Node[TCreds]
  
  type NodeAPI[TSets /* <: NodeAPISettingsWithData */] = typingsJapgolly.nodeRedRegistry.mod.NodeAPI[TSets]
  
  type NodeAPISettingsWithData = typingsJapgolly.nodeRedRegistry.mod.NodeAPISettingsWithData
  
  type NodeConstructor[TNode /* <: Node[TCreds] */, TNodeDef /* <: NodeDef */, TCreds /* <: js.Object */] = typingsJapgolly.nodeRedRegistry.mod.NodeConstructor[TNode, TNodeDef, TCreds]
  
  type NodeContext = typingsJapgolly.nodeRedRegistry.mod.NodeContext
  
  type NodeContextData = typingsJapgolly.nodeRedRegistry.mod.NodeContextData
  
  type NodeCredential = typingsJapgolly.nodeRedRegistry.mod.NodeCredential
  
  type NodeCredentials[TCreds] = typingsJapgolly.nodeRedRegistry.mod.NodeCredentials[TCreds]
  
  type NodeDef = typingsJapgolly.nodeRedRegistry.mod.NodeDef
  
  /*******************************************************************
    * Type shortcuts for writing the runtime side of nodes (.js file)
    *******************************************************************/
  /**
    * Type def for the functions that should be exported
    * by the node .js files.
    */
  type NodeInitializer[TSets /* <: NodeAPISettingsWithData */] = typingsJapgolly.nodeRedRegistry.mod.NodeInitializer[TSets]
  
  type NodeMessage = typingsJapgolly.nodeRedRegistry.mod.NodeMessage
  
  type NodeMessageInFlow = typingsJapgolly.nodeRedRegistry.mod.NodeMessageInFlow
  
  type NodeMessageParts = typingsJapgolly.nodeRedRegistry.mod.NodeMessageParts
  
  trait NodeRedApp extends StObject {
    
    /**
      * The editor authentication api.
      */
    var auth: Auth
    
    /**
      * Runtime events emitter
      */
    var events: EventEmitter
    
    /**
      * Runtime hooks engine
      */
    var hooks: Hooks
    
    /**
      * The express application for the Editor Admin API
      */
    def httpAdmin(): Application
    /**
      * The express application for the Editor Admin API
      */
    @JSName("httpAdmin")
    val httpAdmin_Original: Express
    
    /**
      * The express application for HTTP Nodes
      */
    def httpNode(): Application
    /**
      * The express application for HTTP Nodes
      */
    @JSName("httpNode")
    val httpNode_Original: Express
    
    /**
      * Initialise the Node-RED application.
      * @param httpServer - the HTTP server object to use
      * @param userSettings - an object containing the runtime settings
      */
    def init(
      httpServer: Server[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[IncomingMessage]
          ]
        ],
      userSettings: LocalSettings
    ): Unit
    
    /**
      * Logging utilities
      */
    var log: Log
    
    /**
      * This provides access to the internal nodes module of the
      * runtime. The details of this API remain undocumented as they should not
      * be used directly.
      *
      * Most administrative actions should be performed use the runtime api
      * under @node-red/runtime.
      */
    val nodes: InternalNodesModule
    
    /**
      * The runtime api
      */
    var runtime: RuntimeModule
    
    /**
      * The HTTP Server used by the runtime
      */
    val server: Server[
        Instantiable1[/* socket */ Socket, IncomingMessage], 
        Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
          ServerResponse[IncomingMessage]
        ]
      ]
    
    /**
      * This provides access to the internal settings module of the
      * runtime.
      */
    val settings: PersistentSettings
    
    /**
      * Start the Node-RED application.
      */
    def start(): js.Promise[Unit]
    
    /**
      * Stop the Node-RED application.
      */
    def stop(): js.Promise[Unit]
    
    /**
      * General utilities
      */
    var util: Util
    
    /**
      * Get the version of the runtime
      */
    val version: String
  }
  object NodeRedApp {
    
    inline def apply(
      auth: Auth,
      events: EventEmitter,
      hooks: Hooks,
      httpAdmin: Express,
      httpNode: Express,
      init: (Server[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[IncomingMessage]
          ]
        ], LocalSettings) => Callback,
      log: Log,
      nodes: InternalNodesModule,
      runtime: RuntimeModule,
      server: Server[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[IncomingMessage]
          ]
        ],
      settings: PersistentSettings,
      start: CallbackTo[js.Promise[Unit]],
      stop: CallbackTo[js.Promise[Unit]],
      util: Util,
      version: String
    ): NodeRedApp = {
      val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], hooks = hooks.asInstanceOf[js.Any], httpAdmin = httpAdmin.asInstanceOf[js.Any], httpNode = httpNode.asInstanceOf[js.Any], init = js.Any.fromFunction2((t0: Server[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[IncomingMessage]
          ]
        ], t1: LocalSettings) => (init(t0, t1)).runNow()), log = log.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], start = start.toJsFn, stop = stop.toJsFn, util = util.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeRedApp]
    }
    
    extension [Self <: NodeRedApp](x: Self) {
      
      inline def setAuth(value: Auth): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setEvents(value: EventEmitter): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setHooks(value: Hooks): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
      
      inline def setHttpAdmin(value: Express): Self = StObject.set(x, "httpAdmin", value.asInstanceOf[js.Any])
      
      inline def setHttpNode(value: Express): Self = StObject.set(x, "httpNode", value.asInstanceOf[js.Any])
      
      inline def setInit(
        value: (Server[
              Instantiable1[/* socket */ Socket, IncomingMessage], 
              Instantiable1[
                /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
                ServerResponse[IncomingMessage]
              ]
            ], LocalSettings) => Callback
      ): Self = StObject.set(x, "init", js.Any.fromFunction2((t0: Server[
              Instantiable1[/* socket */ Socket, IncomingMessage], 
              Instantiable1[
                /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
                ServerResponse[IncomingMessage]
              ]
            ], t1: LocalSettings) => (value(t0, t1)).runNow()))
      
      inline def setLog(value: Log): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setNodes(value: InternalNodesModule): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setRuntime(value: RuntimeModule): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
      
      inline def setServer(
        value: Server[
              Instantiable1[/* socket */ Socket, IncomingMessage], 
              Instantiable1[
                /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
                ServerResponse[IncomingMessage]
              ]
            ]
      ): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
      
      inline def setSettings(value: PersistentSettings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      inline def setStart(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "start", value.toJsFn)
      
      inline def setStop(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "stop", value.toJsFn)
      
      inline def setUtil(value: Util): Self = StObject.set(x, "util", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  type NodeSetting[T] = typingsJapgolly.nodeRedRegistry.mod.NodeSetting[T]
  
  type NodeSettings[TSets] = typingsJapgolly.nodeRedRegistry.mod.NodeSettings[TSets]
  
  type NodeStatus = typingsJapgolly.nodeRedRegistry.mod.NodeStatus
  
  type NodeStatusFill = typingsJapgolly.nodeRedRegistry.mod.NodeStatusFill
  
  type NodeStatusShape = typingsJapgolly.nodeRedRegistry.mod.NodeStatusShape
  
  type _To = NodeRedApp
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: NodeRedApp = ^
}
