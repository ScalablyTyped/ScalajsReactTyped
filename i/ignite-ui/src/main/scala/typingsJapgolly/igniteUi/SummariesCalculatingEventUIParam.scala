package typingsJapgolly.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SummariesCalculatingEventUIParam extends StObject {
  
  /**
    * Gets the igGridSummaries widget object.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object SummariesCalculatingEventUIParam {
  
  inline def apply(): SummariesCalculatingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SummariesCalculatingEventUIParam]
  }
  
  extension [Self <: SummariesCalculatingEventUIParam](x: Self) {
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
