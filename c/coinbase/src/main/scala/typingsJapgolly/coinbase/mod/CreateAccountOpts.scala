package typingsJapgolly.coinbase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAccountOpts extends StObject {
  
  /**
    * Account name
    */
  var name: js.UndefOr[String] = js.undefined
}
object CreateAccountOpts {
  
  inline def apply(): CreateAccountOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAccountOpts]
  }
  
  extension [Self <: CreateAccountOpts](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
