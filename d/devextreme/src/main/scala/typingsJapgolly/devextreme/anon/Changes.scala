package typingsJapgolly.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Changes[TMappedItem] extends StObject {
  
  val changes: js.UndefOr[js.Array[TMappedItem]] = js.undefined
}
object Changes {
  
  inline def apply[TMappedItem](): Changes[TMappedItem] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Changes[TMappedItem]]
  }
  
  extension [Self <: Changes[?], TMappedItem](x: Self & Changes[TMappedItem]) {
    
    inline def setChanges(value: js.Array[TMappedItem]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    
    inline def setChangesUndefined: Self = StObject.set(x, "changes", js.undefined)
    
    inline def setChangesVarargs(value: TMappedItem*): Self = StObject.set(x, "changes", js.Array(value*))
  }
}
