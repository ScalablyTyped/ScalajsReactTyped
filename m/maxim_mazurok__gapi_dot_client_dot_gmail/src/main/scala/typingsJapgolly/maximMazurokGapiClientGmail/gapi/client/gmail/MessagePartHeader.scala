package typingsJapgolly.maximMazurokGapiClientGmail.gapi.client.gmail

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessagePartHeader extends StObject {
  
  /** The name of the header before the `:` separator. For example, `To`. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The value of the header after the `:` separator. For example, `someuser@example.com`. */
  var value: js.UndefOr[String] = js.undefined
}
object MessagePartHeader {
  
  inline def apply(): MessagePartHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessagePartHeader]
  }
  
  extension [Self <: MessagePartHeader](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
