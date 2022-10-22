package typingsJapgolly.vscodeLanguageserver.libCommonServerMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.ClientCapabilities
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.ServerCapabilities
import typingsJapgolly.vscodeLanguageserverTypes.mod.LSPAny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Remote
  extends StObject
     with FeatureBase {
  
  /**
    * Attach the remote to the given connection.
    *
    * @param connection The connection this remote is operating on.
    */
  def attach(connection: Connection): Unit
  
  /**
    * The connection this remote is attached to.
    */
  var connection: Connection
}
object Remote {
  
  inline def apply(
    attach: Connection => Callback,
    connection: Connection,
    fillServerCapabilities: ServerCapabilities[LSPAny] => Callback,
    initialize: ClientCapabilities => Callback
  ): Remote = {
    val __obj = js.Dynamic.literal(attach = js.Any.fromFunction1((t0: Connection) => attach(t0).runNow()), connection = connection.asInstanceOf[js.Any], fillServerCapabilities = js.Any.fromFunction1((t0: ServerCapabilities[LSPAny]) => fillServerCapabilities(t0).runNow()), initialize = js.Any.fromFunction1((t0: ClientCapabilities) => initialize(t0).runNow()))
    __obj.asInstanceOf[Remote]
  }
  
  extension [Self <: Remote](x: Self) {
    
    inline def setAttach(value: Connection => Callback): Self = StObject.set(x, "attach", js.Any.fromFunction1((t0: Connection) => value(t0).runNow()))
    
    inline def setConnection(value: Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
  }
}
