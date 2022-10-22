package typingsJapgolly.devtoolsProtocol.mod.Protocol.Input

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsertTextRequest extends StObject {
  
  /**
    * The text to insert.
    */
  var text: String
}
object InsertTextRequest {
  
  inline def apply(text: String): InsertTextRequest = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertTextRequest]
  }
  
  extension [Self <: InsertTextRequest](x: Self) {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
