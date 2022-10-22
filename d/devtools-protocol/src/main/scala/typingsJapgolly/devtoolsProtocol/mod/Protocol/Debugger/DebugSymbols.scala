package typingsJapgolly.devtoolsProtocol.mod.Protocol.Debugger

import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.EmbeddedDWARF
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.ExternalDWARF
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.None
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.SourceMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DebugSymbols extends StObject {
  
  /**
    * URL of the external symbol source.
    */
  var externalURL: js.UndefOr[String] = js.undefined
  
  /**
    * Type of the debug symbols. (DebugSymbolsType enum)
    */
  var `type`: None | SourceMap | EmbeddedDWARF | ExternalDWARF
}
object DebugSymbols {
  
  inline def apply(`type`: None | SourceMap | EmbeddedDWARF | ExternalDWARF): DebugSymbols = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebugSymbols]
  }
  
  extension [Self <: DebugSymbols](x: Self) {
    
    inline def setExternalURL(value: String): Self = StObject.set(x, "externalURL", value.asInstanceOf[js.Any])
    
    inline def setExternalURLUndefined: Self = StObject.set(x, "externalURL", js.undefined)
    
    inline def setType(value: None | SourceMap | EmbeddedDWARF | ExternalDWARF): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
