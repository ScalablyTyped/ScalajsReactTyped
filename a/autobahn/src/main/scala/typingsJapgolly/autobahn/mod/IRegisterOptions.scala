package typingsJapgolly.autobahn.mod

import typingsJapgolly.autobahn.autobahnStrings.first
import typingsJapgolly.autobahn.autobahnStrings.last
import typingsJapgolly.autobahn.autobahnStrings.random
import typingsJapgolly.autobahn.autobahnStrings.roundrobin
import typingsJapgolly.autobahn.autobahnStrings.single
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRegisterOptions extends StObject {
  
  var disclose_caller: js.UndefOr[Boolean] = js.undefined
  
  var invoke: js.UndefOr[single | roundrobin | random | first | last] = js.undefined
}
object IRegisterOptions {
  
  inline def apply(): IRegisterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRegisterOptions]
  }
  
  extension [Self <: IRegisterOptions](x: Self) {
    
    inline def setDisclose_caller(value: Boolean): Self = StObject.set(x, "disclose_caller", value.asInstanceOf[js.Any])
    
    inline def setDisclose_callerUndefined: Self = StObject.set(x, "disclose_caller", js.undefined)
    
    inline def setInvoke(value: single | roundrobin | random | first | last): Self = StObject.set(x, "invoke", value.asInstanceOf[js.Any])
    
    inline def setInvokeUndefined: Self = StObject.set(x, "invoke", js.undefined)
  }
}
