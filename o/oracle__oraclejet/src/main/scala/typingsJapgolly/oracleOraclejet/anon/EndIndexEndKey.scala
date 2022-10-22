package typingsJapgolly.oracleOraclejet.anon

import typingsJapgolly.oracleOraclejet.ojtableMod.ojTable.RowSelectionEnd
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndIndexEndKey[K]
  extends StObject
     with RowSelectionEnd[K] {
  
  var endIndex: `24`
  
  var endKey: js.UndefOr[`25`[K]] = js.undefined
}
object EndIndexEndKey {
  
  inline def apply[K](endIndex: `24`): EndIndexEndKey[K] = {
    val __obj = js.Dynamic.literal(endIndex = endIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndIndexEndKey[K]]
  }
  
  extension [Self <: EndIndexEndKey[?], K](x: Self & EndIndexEndKey[K]) {
    
    inline def setEndIndex(value: `24`): Self = StObject.set(x, "endIndex", value.asInstanceOf[js.Any])
    
    inline def setEndKey(value: `25`[K]): Self = StObject.set(x, "endKey", value.asInstanceOf[js.Any])
    
    inline def setEndKeyUndefined: Self = StObject.set(x, "endKey", js.undefined)
  }
}
