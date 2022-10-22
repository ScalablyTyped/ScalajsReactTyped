package typingsJapgolly.vscodeLanguageserver.libCommonServerMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.ClientCapabilities
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.ServerCapabilities
import typingsJapgolly.vscodeLanguageserverTypes.mod.LSPAny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Telemetry
  extends StObject
     with FeatureBase {
  
  /**
    * The connection this remote is attached to.
    */
  var connection: Connection
  
  /**
    * Log the given data to telemetry.
    *
    * @param data The data to log. Must be a JSON serializable object.
    */
  def logEvent(data: Any): Unit
}
object Telemetry {
  
  inline def apply(
    connection: Connection,
    fillServerCapabilities: ServerCapabilities[LSPAny] => Callback,
    initialize: ClientCapabilities => Callback,
    logEvent: Any => Callback
  ): Telemetry = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], fillServerCapabilities = js.Any.fromFunction1((t0: ServerCapabilities[LSPAny]) => fillServerCapabilities(t0).runNow()), initialize = js.Any.fromFunction1((t0: ClientCapabilities) => initialize(t0).runNow()), logEvent = js.Any.fromFunction1((t0: Any) => logEvent(t0).runNow()))
    __obj.asInstanceOf[Telemetry]
  }
  
  extension [Self <: Telemetry](x: Self) {
    
    inline def setConnection(value: Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    inline def setLogEvent(value: Any => Callback): Self = StObject.set(x, "logEvent", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
  }
}
