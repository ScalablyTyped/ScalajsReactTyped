package typingsJapgolly.trezorConnect.anon

import typingsJapgolly.trezorConnect.trezorConnectStrings.divisibility
import typingsJapgolly.trezorConnect.trezorConnectStrings.initialSupply
import typingsJapgolly.trezorConnect.trezorConnectStrings.supplyMutable
import typingsJapgolly.trezorConnect.trezorConnectStrings.transferable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NameValue extends StObject {
  
  var name: divisibility | initialSupply | supplyMutable | transferable
  
  var value: String
}
object NameValue {
  
  inline def apply(name: divisibility | initialSupply | supplyMutable | transferable, value: String): NameValue = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameValue]
  }
  
  extension [Self <: NameValue](x: Self) {
    
    inline def setName(value: divisibility | initialSupply | supplyMutable | transferable): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
