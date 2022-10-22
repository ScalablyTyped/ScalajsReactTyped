package typingsJapgolly.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgFocusEventUIParam extends StObject {
  
  /**
    * Gets a reference to the igDialog widget.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object IgFocusEventUIParam {
  
  inline def apply(): IgFocusEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgFocusEventUIParam]
  }
  
  extension [Self <: IgFocusEventUIParam](x: Self) {
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
