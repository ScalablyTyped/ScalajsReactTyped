package typingsJapgolly.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataRenderedEventUIParam extends StObject {
  
  /**
    * Gets a reference to the grid.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object DataRenderedEventUIParam {
  
  inline def apply(): DataRenderedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataRenderedEventUIParam]
  }
  
  extension [Self <: DataRenderedEventUIParam](x: Self) {
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
