package typingsJapgolly.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataRenderingEventUIParam extends StObject {
  
  /**
    * Gets a reference to the grid.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object DataRenderingEventUIParam {
  
  inline def apply(): DataRenderingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataRenderingEventUIParam]
  }
  
  extension [Self <: DataRenderingEventUIParam](x: Self) {
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
