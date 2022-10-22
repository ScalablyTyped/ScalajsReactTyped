package typingsJapgolly.maximMazurokGapiClientChat.gapi.client.chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringInputs extends StObject {
  
  /** An array of strings entered by the user. */
  var value: js.UndefOr[js.Array[String]] = js.undefined
}
object StringInputs {
  
  inline def apply(): StringInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StringInputs]
  }
  
  extension [Self <: StringInputs](x: Self) {
    
    inline def setValue(value: js.Array[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
