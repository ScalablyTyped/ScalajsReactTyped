package typingsJapgolly.winrtUwp.anon

import typingsJapgolly.winrtUwp.Windows.Media.Protection.PlayReady.IPlayReadyDomain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemsIPlayReadyDomain extends StObject {
  
  /** The items in the collection. */ var items: IPlayReadyDomain
  
  /** The number of items in the collection. */ var returnValue: Double
}
object ItemsIPlayReadyDomain {
  
  inline def apply(items: IPlayReadyDomain, returnValue: Double): ItemsIPlayReadyDomain = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsIPlayReadyDomain]
  }
  
  extension [Self <: ItemsIPlayReadyDomain](x: Self) {
    
    inline def setItems(value: IPlayReadyDomain): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setReturnValue(value: Double): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
