package typingsJapgolly.ionicAngular.anon

import typingsJapgolly.ionicAngular.ionicAngularStrings.color
import typingsJapgolly.ionicAngular.ionicAngularStrings.itemsAfterCollapse
import typingsJapgolly.ionicAngular.ionicAngularStrings.itemsBeforeCollapse
import typingsJapgolly.ionicAngular.ionicAngularStrings.maxItems
import typingsJapgolly.ionicAngular.ionicAngularStrings.mode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemsAfterCollapse extends StObject {
  
  var color: typingsJapgolly.ionicAngular.ionicAngularStrings.color
  
  var itemsAfterCollapse: typingsJapgolly.ionicAngular.ionicAngularStrings.itemsAfterCollapse
  
  var itemsBeforeCollapse: typingsJapgolly.ionicAngular.ionicAngularStrings.itemsBeforeCollapse
  
  var maxItems: typingsJapgolly.ionicAngular.ionicAngularStrings.maxItems
  
  var mode: typingsJapgolly.ionicAngular.ionicAngularStrings.mode
}
object ItemsAfterCollapse {
  
  inline def apply(): ItemsAfterCollapse = {
    val __obj = js.Dynamic.literal(color = "color", itemsAfterCollapse = "itemsAfterCollapse", itemsBeforeCollapse = "itemsBeforeCollapse", maxItems = "maxItems", mode = "mode")
    __obj.asInstanceOf[ItemsAfterCollapse]
  }
  
  extension [Self <: ItemsAfterCollapse](x: Self) {
    
    inline def setColor(value: color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setItemsAfterCollapse(value: itemsAfterCollapse): Self = StObject.set(x, "itemsAfterCollapse", value.asInstanceOf[js.Any])
    
    inline def setItemsBeforeCollapse(value: itemsBeforeCollapse): Self = StObject.set(x, "itemsBeforeCollapse", value.asInstanceOf[js.Any])
    
    inline def setMaxItems(value: maxItems): Self = StObject.set(x, "maxItems", value.asInstanceOf[js.Any])
    
    inline def setMode(value: mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
