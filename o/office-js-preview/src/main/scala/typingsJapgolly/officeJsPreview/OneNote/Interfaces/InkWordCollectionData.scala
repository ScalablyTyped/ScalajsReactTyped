package typingsJapgolly.officeJsPreview.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `inkWordCollection.toJSON()`. */
trait InkWordCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[InkWordData]] = js.undefined
}
object InkWordCollectionData {
  
  inline def apply(): InkWordCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InkWordCollectionData]
  }
  
  extension [Self <: InkWordCollectionData](x: Self) {
    
    inline def setItems(value: js.Array[InkWordData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: InkWordData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
