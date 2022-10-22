package typingsJapgolly.openui5.anon

import typingsJapgolly.openui5.int
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewLeadSelectedIndex extends StObject {
  
  /**
    * New lead selected index
    */
  var newLeadSelectedIndex: js.UndefOr[int] = js.undefined
  
  /**
    * Old lead selected index
    */
  var oldLeadSelectedIndex: js.UndefOr[int] = js.undefined
}
object NewLeadSelectedIndex {
  
  inline def apply(): NewLeadSelectedIndex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NewLeadSelectedIndex]
  }
  
  extension [Self <: NewLeadSelectedIndex](x: Self) {
    
    inline def setNewLeadSelectedIndex(value: int): Self = StObject.set(x, "newLeadSelectedIndex", value.asInstanceOf[js.Any])
    
    inline def setNewLeadSelectedIndexUndefined: Self = StObject.set(x, "newLeadSelectedIndex", js.undefined)
    
    inline def setOldLeadSelectedIndex(value: int): Self = StObject.set(x, "oldLeadSelectedIndex", value.asInstanceOf[js.Any])
    
    inline def setOldLeadSelectedIndexUndefined: Self = StObject.set(x, "oldLeadSelectedIndex", js.undefined)
  }
}
