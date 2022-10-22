package typingsJapgolly.devextreme.anon

import typingsJapgolly.devextreme.mod.DevExpress.data.PivotGridDataSource.PivotGridStoreType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type extends StObject {
  
  /**
    * Specifies the PivotGridDataSource&apos;s storage type.
    */
  var `type`: js.UndefOr[PivotGridStoreType] = js.undefined
}
object Type {
  
  inline def apply(): Type = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Type]
  }
  
  extension [Self <: Type](x: Self) {
    
    inline def setType(value: PivotGridStoreType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
