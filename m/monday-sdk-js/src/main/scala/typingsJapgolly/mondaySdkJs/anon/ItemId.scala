package typingsJapgolly.mondaySdkJs.anon

import typingsJapgolly.mondaySdkJs.mondaySdkJsStrings.columns
import typingsJapgolly.mondaySdkJs.mondaySdkJsStrings.updates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemId extends StObject {
  
  /**
    * The ID of the item to open
    */
  var itemId: Double
  
  /**
    * On which view to open the item card.
    * Can be "updates" / "columns"
    * Defaults to "columns"
    */
  var kind: js.UndefOr[updates | columns] = js.undefined
}
object ItemId {
  
  inline def apply(itemId: Double): ItemId = {
    val __obj = js.Dynamic.literal(itemId = itemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemId]
  }
  
  extension [Self <: ItemId](x: Self) {
    
    inline def setItemId(value: Double): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
    
    inline def setKind(value: updates | columns): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
