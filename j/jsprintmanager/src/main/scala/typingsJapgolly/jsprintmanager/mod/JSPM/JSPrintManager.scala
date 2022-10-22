package typingsJapgolly.jsprintmanager.mod.JSPM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JSPrintManager {
  
  @JSImport("jsprintmanager", "JSPM.JSPrintManager")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("jsprintmanager", "JSPM.JSPrintManager.WS")
  @js.native
  def WS: JSPMWebSocket = js.native
  inline def WS_=(x: JSPMWebSocket): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WS")(x.asInstanceOf[js.Any])
  
  @JSImport("jsprintmanager", "JSPM.JSPrintManager.auto_reconnect")
  @js.native
  def autoReconnect: Boolean = js.native
  
  inline def autoReconnect_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("auto_reconnect")(x.asInstanceOf[js.Any])
  
  inline def getPrinters(): js.Promise[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPrinters")().asInstanceOf[js.Promise[js.Object]]
  
  inline def getPrintersInfo(): js.Promise[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPrintersInfo")().asInstanceOf[js.Promise[js.Object]]
  
  inline def showAbout(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("showAbout")().asInstanceOf[js.Promise[Any]]
  
  inline def start(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("start")().asInstanceOf[js.Promise[Unit]]
  inline def start(secure: Boolean): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(secure.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def start(secure: Boolean, host: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(secure.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def start(secure: Boolean, host: String, port: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(secure.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def start(secure: Boolean, host: Unit, port: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(secure.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def start(secure: Unit, host: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(secure.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def start(secure: Unit, host: String, port: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(secure.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def start(secure: Unit, host: Unit, port: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(secure.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def stop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")().asInstanceOf[Unit]
  
  inline def updateClient(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("updateClient")().asInstanceOf[js.Promise[Any]]
  
  @JSImport("jsprintmanager", "JSPM.JSPrintManager.websocket_status")
  @js.native
  val websocketStatus: WSStatus = js.native
}
