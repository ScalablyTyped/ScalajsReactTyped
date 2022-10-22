package typingsJapgolly.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PagerRenderedEventUIParam extends StObject {
  
  /**
    * Gets a reference to grid's data source.
    */
  var dataSource: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets reference to GridPaging.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object PagerRenderedEventUIParam {
  
  inline def apply(): PagerRenderedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PagerRenderedEventUIParam]
  }
  
  extension [Self <: PagerRenderedEventUIParam](x: Self) {
    
    inline def setDataSource(value: Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
