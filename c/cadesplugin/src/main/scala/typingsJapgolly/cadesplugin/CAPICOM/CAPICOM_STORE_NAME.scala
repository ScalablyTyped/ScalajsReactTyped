package typingsJapgolly.cadesplugin.CAPICOM

import typingsJapgolly.cadesplugin.cadespluginStrings.AddressBook
import typingsJapgolly.cadesplugin.cadespluginStrings.Ca
import typingsJapgolly.cadesplugin.cadespluginStrings.Root
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CAPICOM_STORE_NAME
  extends StObject
     with StoreNamePlugin {
  
  val CAPICOM_CA_STORE: Ca
  
  val CAPICOM_OTHER_STORE: AddressBook
  
  val CAPICOM_ROOT_STORE: Root
}
object CAPICOM_STORE_NAME {
  
  inline def apply(): CAPICOM_STORE_NAME = {
    val __obj = js.Dynamic.literal(CAPICOM_CA_STORE = "Ca", CAPICOM_MY_STORE = "My", CAPICOM_OTHER_STORE = "AddressBook", CAPICOM_ROOT_STORE = "Root")
    __obj.asInstanceOf[CAPICOM_STORE_NAME]
  }
  
  extension [Self <: CAPICOM_STORE_NAME](x: Self) {
    
    inline def setCAPICOM_CA_STORE(value: Ca): Self = StObject.set(x, "CAPICOM_CA_STORE", value.asInstanceOf[js.Any])
    
    inline def setCAPICOM_OTHER_STORE(value: AddressBook): Self = StObject.set(x, "CAPICOM_OTHER_STORE", value.asInstanceOf[js.Any])
    
    inline def setCAPICOM_ROOT_STORE(value: Root): Self = StObject.set(x, "CAPICOM_ROOT_STORE", value.asInstanceOf[js.Any])
  }
}
