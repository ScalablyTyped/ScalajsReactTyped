package typingsJapgolly.nodeRedEditorApi

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.express.mod.Express
import typingsJapgolly.express.mod.NextFunction
import typingsJapgolly.express.mod.Request_
import typingsJapgolly.express.mod.Response_
import typingsJapgolly.expressServeStaticCore.mod.Application
import typingsJapgolly.node.httpsMod.Server
import typingsJapgolly.node.nodeColonhttpMod.IncomingMessage
import typingsJapgolly.node.nodeColonhttpMod.ServerResponse
import typingsJapgolly.node.nodeColonnetMod.Socket
import typingsJapgolly.nodeRedRuntime.mod.LocalSettings
import typingsJapgolly.nodeRedRuntime.mod.RuntimeModule
import typingsJapgolly.nodeRedRuntime.mod.StorageModule
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@node-red/editor-api", JSImport.Namespace)
  @js.native
  val ^ : EditorAPIModule = js.native
  
  trait Auth extends StObject {
    
    def needsPermission(permission: String): js.Function3[
        /* req */ Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ], 
        /* res */ Response_[Any, Record[String, Any]], 
        /* next */ NextFunction, 
        Unit
      ]
  }
  object Auth {
    
    inline def apply(
      needsPermission: String => js.Function3[
          /* req */ Request_[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
            Any, 
            Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
            Record[String, Any]
          ], 
          /* res */ Response_[Any, Record[String, Any]], 
          /* next */ NextFunction, 
          Unit
        ]
    ): Auth = {
      val __obj = js.Dynamic.literal(needsPermission = js.Any.fromFunction1(needsPermission))
      __obj.asInstanceOf[Auth]
    }
    
    extension [Self <: Auth](x: Self) {
      
      inline def setNeedsPermission(
        value: String => js.Function3[
              /* req */ Request_[
                /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
                Any, 
                Any, 
                /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
                Record[String, Any]
              ], 
              /* res */ Response_[Any, Record[String, Any]], 
              /* next */ NextFunction, 
              Unit
            ]
      ): Self = StObject.set(x, "needsPermission", js.Any.fromFunction1(value))
    }
  }
  
  trait EditorAPIModule extends StObject {
    
    var auth: Auth
    
    /**
      * The Express app used to serve the Node-RED Editor
      */
    def httpAdmin(): Application
    /**
      * The Express app used to serve the Node-RED Editor
      */
    @JSName("httpAdmin")
    val httpAdmin_Original: Express
    
    /**
      * Initialise the module.
      * @param  settings   The runtime settings
      * @param  _server    An instance of HTTP Server
      * @param  storage    An instance of Node-RED Storage
      * @param  runtimeAPI An instance of Node-RED Runtime
      */
    def init(
      settings: LocalSettings,
      _server: Server[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[typingsJapgolly.node.httpMod.IncomingMessage]
          ]
        ],
      storage: StorageModule,
      runtimeAPI: RuntimeModule
    ): Unit
    
    /**
      * Start the module.
      */
    def start(): js.Promise[Unit]
    
    /**
      * Stop the module.
      */
    def stop(): js.Promise[Unit]
  }
  object EditorAPIModule {
    
    inline def apply(
      auth: Auth,
      httpAdmin: Express,
      init: (LocalSettings, Server[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[typingsJapgolly.node.httpMod.IncomingMessage]
          ]
        ], StorageModule, RuntimeModule) => Callback,
      start: CallbackTo[js.Promise[Unit]],
      stop: CallbackTo[js.Promise[Unit]]
    ): EditorAPIModule = {
      val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], httpAdmin = httpAdmin.asInstanceOf[js.Any], init = js.Any.fromFunction4((t0: LocalSettings, t1: Server[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[typingsJapgolly.node.httpMod.IncomingMessage]
          ]
        ], t2: StorageModule, t3: RuntimeModule) => (init(t0, t1, t2, t3)).runNow()), start = start.toJsFn, stop = stop.toJsFn)
      __obj.asInstanceOf[EditorAPIModule]
    }
    
    extension [Self <: EditorAPIModule](x: Self) {
      
      inline def setAuth(value: Auth): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setHttpAdmin(value: Express): Self = StObject.set(x, "httpAdmin", value.asInstanceOf[js.Any])
      
      inline def setInit(
        value: (LocalSettings, Server[
              Instantiable1[/* socket */ Socket, IncomingMessage], 
              Instantiable1[
                /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
                ServerResponse[typingsJapgolly.node.httpMod.IncomingMessage]
              ]
            ], StorageModule, RuntimeModule) => Callback
      ): Self = StObject.set(x, "init", js.Any.fromFunction4((t0: LocalSettings, t1: Server[
              Instantiable1[/* socket */ Socket, IncomingMessage], 
              Instantiable1[
                /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
                ServerResponse[typingsJapgolly.node.httpMod.IncomingMessage]
              ]
            ], t2: StorageModule, t3: RuntimeModule) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setStart(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "start", value.toJsFn)
      
      inline def setStop(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "stop", value.toJsFn)
    }
  }
  
  type _To = EditorAPIModule
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: EditorAPIModule = ^
}
