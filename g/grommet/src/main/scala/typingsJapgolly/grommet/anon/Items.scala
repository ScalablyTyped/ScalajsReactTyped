package typingsJapgolly.grommet.anon

import typingsJapgolly.grommet.es6ComponentsVideoMod.controlsItems
import typingsJapgolly.grommet.grommetBooleans.`false`
import typingsJapgolly.grommet.grommetStrings.below
import typingsJapgolly.grommet.grommetStrings.over
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Items extends StObject {
  
  var items: js.UndefOr[js.Array[controlsItems]] = js.undefined
  
  var position: js.UndefOr[`false` | over | below] = js.undefined
}
object Items {
  
  inline def apply(): Items = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Items]
  }
  
  extension [Self <: Items](x: Self) {
    
    inline def setItems(value: js.Array[controlsItems]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: controlsItems*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setPosition(value: `false` | over | below): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
