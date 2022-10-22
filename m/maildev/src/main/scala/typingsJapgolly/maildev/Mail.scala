package typingsJapgolly.maildev

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for mail.
  */
trait Mail extends StObject {
  
  /**
    * Client.
    */
  var envelope: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Identifier.
    */
  var id: js.UndefOr[String] = js.undefined
}
object Mail {
  
  inline def apply(): Mail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mail]
  }
  
  extension [Self <: Mail](x: Self) {
    
    inline def setEnvelope(value: js.Object): Self = StObject.set(x, "envelope", value.asInstanceOf[js.Any])
    
    inline def setEnvelopeUndefined: Self = StObject.set(x, "envelope", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
