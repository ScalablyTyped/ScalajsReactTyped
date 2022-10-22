package typingsJapgolly.activexOutlook.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StoreStore extends StObject {
  
  val Store: typingsJapgolly.activexOutlook.Outlook.Store
}
object StoreStore {
  
  inline def apply(Store: typingsJapgolly.activexOutlook.Outlook.Store): StoreStore = {
    val __obj = js.Dynamic.literal(Store = Store.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreStore]
  }
  
  extension [Self <: StoreStore](x: Self) {
    
    inline def setStore(value: typingsJapgolly.activexOutlook.Outlook.Store): Self = StObject.set(x, "Store", value.asInstanceOf[js.Any])
  }
}
