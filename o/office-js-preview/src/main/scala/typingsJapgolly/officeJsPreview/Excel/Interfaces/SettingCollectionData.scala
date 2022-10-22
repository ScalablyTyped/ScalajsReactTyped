package typingsJapgolly.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `settingCollection.toJSON()`. */
trait SettingCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[SettingData]] = js.undefined
}
object SettingCollectionData {
  
  inline def apply(): SettingCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettingCollectionData]
  }
  
  extension [Self <: SettingCollectionData](x: Self) {
    
    inline def setItems(value: js.Array[SettingData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SettingData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
