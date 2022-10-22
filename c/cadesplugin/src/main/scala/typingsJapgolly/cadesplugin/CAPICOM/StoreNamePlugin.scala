package typingsJapgolly.cadesplugin.CAPICOM

import typingsJapgolly.cadesplugin.cadespluginStrings.My
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StoreNamePlugin extends StObject {
  
  val CAPICOM_MY_STORE: My
}
object StoreNamePlugin {
  
  inline def apply(): StoreNamePlugin = {
    val __obj = js.Dynamic.literal(CAPICOM_MY_STORE = "My")
    __obj.asInstanceOf[StoreNamePlugin]
  }
  
  extension [Self <: StoreNamePlugin](x: Self) {
    
    inline def setCAPICOM_MY_STORE(value: My): Self = StObject.set(x, "CAPICOM_MY_STORE", value.asInstanceOf[js.Any])
  }
}
