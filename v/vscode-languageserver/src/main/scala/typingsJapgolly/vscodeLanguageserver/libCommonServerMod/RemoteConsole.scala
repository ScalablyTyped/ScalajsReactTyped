package typingsJapgolly.vscodeLanguageserver.libCommonServerMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.ClientCapabilities
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.ServerCapabilities
import typingsJapgolly.vscodeLanguageserverTypes.mod.LSPAny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoteConsole
  extends StObject
     with FeatureBase {
  
  /**
    * The connection this remote is attached to.
    */
  var connection: Connection
  
  /**
    * Show an error message.
    *
    * @param message The message to show.
    */
  def error(message: String): Unit
  
  /**
    * Show an information message.
    *
    * @param message The message to show.
    */
  def info(message: String): Unit
  
  /**
    * Log a message.
    *
    * @param message The message to log.
    */
  def log(message: String): Unit
  
  /**
    * Show a warning message.
    *
    * @param message The message to show.
    */
  def warn(message: String): Unit
}
object RemoteConsole {
  
  inline def apply(
    connection: Connection,
    error: String => Callback,
    fillServerCapabilities: ServerCapabilities[LSPAny] => Callback,
    info: String => Callback,
    initialize: ClientCapabilities => Callback,
    log: String => Callback,
    warn: String => Callback
  ): RemoteConsole = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], error = js.Any.fromFunction1((t0: String) => error(t0).runNow()), fillServerCapabilities = js.Any.fromFunction1((t0: ServerCapabilities[LSPAny]) => fillServerCapabilities(t0).runNow()), info = js.Any.fromFunction1((t0: String) => info(t0).runNow()), initialize = js.Any.fromFunction1((t0: ClientCapabilities) => initialize(t0).runNow()), log = js.Any.fromFunction1((t0: String) => log(t0).runNow()), warn = js.Any.fromFunction1((t0: String) => warn(t0).runNow()))
    __obj.asInstanceOf[RemoteConsole]
  }
  
  extension [Self <: RemoteConsole](x: Self) {
    
    inline def setConnection(value: Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    inline def setError(value: String => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setInfo(value: String => Callback): Self = StObject.set(x, "info", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setLog(value: String => Callback): Self = StObject.set(x, "log", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setWarn(value: String => Callback): Self = StObject.set(x, "warn", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
