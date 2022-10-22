package typingsJapgolly.devtoolsProtocol.mod.Protocol.Debugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetBlackboxPatternsRequest extends StObject {
  
  /**
    * Array of regexps that will be used to check script url for blackbox state.
    */
  var patterns: js.Array[String]
}
object SetBlackboxPatternsRequest {
  
  inline def apply(patterns: js.Array[String]): SetBlackboxPatternsRequest = {
    val __obj = js.Dynamic.literal(patterns = patterns.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetBlackboxPatternsRequest]
  }
  
  extension [Self <: SetBlackboxPatternsRequest](x: Self) {
    
    inline def setPatterns(value: js.Array[String]): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
    
    inline def setPatternsVarargs(value: String*): Self = StObject.set(x, "patterns", js.Array(value*))
  }
}
