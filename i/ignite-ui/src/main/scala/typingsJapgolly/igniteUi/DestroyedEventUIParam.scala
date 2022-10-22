package typingsJapgolly.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DestroyedEventUIParam extends StObject {
  
  /**
    * Gets a reference to the grid.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object DestroyedEventUIParam {
  
  inline def apply(): DestroyedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestroyedEventUIParam]
  }
  
  extension [Self <: DestroyedEventUIParam](x: Self) {
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
