package typingsJapgolly.devtoolsProtocol.mod.Protocol.DOM

import typingsJapgolly.devtoolsProtocol.mod.Protocol.Runtime.StackTrace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetNodeStackTracesResponse extends StObject {
  
  /**
    * Creation stack trace, if available.
    */
  var creation: js.UndefOr[StackTrace] = js.undefined
}
object GetNodeStackTracesResponse {
  
  inline def apply(): GetNodeStackTracesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetNodeStackTracesResponse]
  }
  
  extension [Self <: GetNodeStackTracesResponse](x: Self) {
    
    inline def setCreation(value: StackTrace): Self = StObject.set(x, "creation", value.asInstanceOf[js.Any])
    
    inline def setCreationUndefined: Self = StObject.set(x, "creation", js.undefined)
  }
}
