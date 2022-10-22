package typingsJapgolly.devtoolsProtocol.mod.Protocol.Overlay

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetShowAdHighlightsRequest extends StObject {
  
  /**
    * True for showing ad highlights
    */
  var show: Boolean
}
object SetShowAdHighlightsRequest {
  
  inline def apply(show: Boolean): SetShowAdHighlightsRequest = {
    val __obj = js.Dynamic.literal(show = show.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetShowAdHighlightsRequest]
  }
  
  extension [Self <: SetShowAdHighlightsRequest](x: Self) {
    
    inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
  }
}
