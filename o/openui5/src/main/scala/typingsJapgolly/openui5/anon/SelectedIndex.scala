package typingsJapgolly.openui5.anon

import typingsJapgolly.openui5.int
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectedIndex extends StObject {
  
  /**
    * Index of the selected RadioButton.
    */
  var selectedIndex: js.UndefOr[int] = js.undefined
}
object SelectedIndex {
  
  inline def apply(): SelectedIndex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectedIndex]
  }
  
  extension [Self <: SelectedIndex](x: Self) {
    
    inline def setSelectedIndex(value: int): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
    
    inline def setSelectedIndexUndefined: Self = StObject.set(x, "selectedIndex", js.undefined)
  }
}
