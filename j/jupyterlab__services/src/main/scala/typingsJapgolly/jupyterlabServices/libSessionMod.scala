package typingsJapgolly.jupyterlabServices

import typingsJapgolly.jupyterlabServices.anon.PickIModelidDeepPartialOm
import typingsJapgolly.jupyterlabServices.libServerconnectionMod.ServerConnection.ISettings
import typingsJapgolly.jupyterlabServices.libSessionManagerMod.SessionManager.IOptions
import typingsJapgolly.jupyterlabServices.libSessionSessionMod.IModel
import typingsJapgolly.jupyterlabServices.libSessionSessionMod.ISessionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSessionMod {
  
  object SessionAPI {
    
    @JSImport("@jupyterlab/services/lib/session", "SessionAPI")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@jupyterlab/services/lib/session", "SessionAPI.SESSION_SERVICE_URL")
    @js.native
    val SESSION_SERVICE_URL: /* "api/sessions" */ String = js.native
    
    inline def getSessionModel(id: String): js.Promise[IModel] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSessionModel")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IModel]]
    inline def getSessionModel(id: String, settings: ISettings): js.Promise[IModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSessionModel")(id.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IModel]]
    
    inline def getSessionUrl(baseUrl: String, id: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSessionUrl")(baseUrl.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def listRunning(): js.Promise[js.Array[IModel]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listRunning")().asInstanceOf[js.Promise[js.Array[IModel]]]
    inline def listRunning(settings: ISettings): js.Promise[js.Array[IModel]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listRunning")(settings.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[IModel]]]
    
    inline def shutdownSession(id: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("shutdownSession")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def shutdownSession(id: String, settings: ISettings): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("shutdownSession")(id.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    inline def startSession(options: ISessionOptions): js.Promise[IModel] = ^.asInstanceOf[js.Dynamic].applyDynamic("startSession")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IModel]]
    inline def startSession(options: ISessionOptions, settings: ISettings): js.Promise[IModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("startSession")(options.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IModel]]
    
    inline def updateSession(model: PickIModelidDeepPartialOm): js.Promise[IModel] = ^.asInstanceOf[js.Dynamic].applyDynamic("updateSession")(model.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IModel]]
    inline def updateSession(model: PickIModelidDeepPartialOm, settings: ISettings): js.Promise[IModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSession")(model.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IModel]]
  }
  
  @JSImport("@jupyterlab/services/lib/session", "SessionManager")
  @js.native
  open class SessionManager protected ()
    extends typingsJapgolly.jupyterlabServices.libSessionManagerMod.SessionManager {
    /**
      * Construct a new session manager.
      *
      * @param options - The default options for each session.
      */
    def this(options: IOptions) = this()
  }
}
