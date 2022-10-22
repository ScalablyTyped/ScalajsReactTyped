package typingsJapgolly.vscodeLanguageserver.libCommonServerMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.ClientCapabilities
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.ServerCapabilities
import typingsJapgolly.vscodeLanguageserverTypes.mod.LSPAny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureBase extends StObject {
  
  /**
    * Called to fill in the server capabilities this feature implements.
    *
    * @param capabilities The server capabilities to fill.
    */
  def fillServerCapabilities(capabilities: ServerCapabilities[LSPAny]): Unit
  
  /**
    * Called to initialize the remote with the given
    * client capabilities
    *
    * @param capabilities The client capabilities
    */
  def initialize(capabilities: ClientCapabilities): Unit
}
object FeatureBase {
  
  inline def apply(
    fillServerCapabilities: ServerCapabilities[LSPAny] => Callback,
    initialize: ClientCapabilities => Callback
  ): FeatureBase = {
    val __obj = js.Dynamic.literal(fillServerCapabilities = js.Any.fromFunction1((t0: ServerCapabilities[LSPAny]) => fillServerCapabilities(t0).runNow()), initialize = js.Any.fromFunction1((t0: ClientCapabilities) => initialize(t0).runNow()))
    __obj.asInstanceOf[FeatureBase]
  }
  
  extension [Self <: FeatureBase](x: Self) {
    
    inline def setFillServerCapabilities(value: ServerCapabilities[LSPAny] => Callback): Self = StObject.set(x, "fillServerCapabilities", js.Any.fromFunction1((t0: ServerCapabilities[LSPAny]) => value(t0).runNow()))
    
    inline def setInitialize(value: ClientCapabilities => Callback): Self = StObject.set(x, "initialize", js.Any.fromFunction1((t0: ClientCapabilities) => value(t0).runNow()))
  }
}
