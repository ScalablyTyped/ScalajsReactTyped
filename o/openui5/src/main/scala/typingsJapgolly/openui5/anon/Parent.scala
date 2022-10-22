package typingsJapgolly.openui5.anon

import typingsJapgolly.openui5.sapUiCoreControlMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parent extends StObject {
  
  /**
    * Parent control that has this Callout as a tooltip
    */
  var parent: js.UndefOr[default] = js.undefined
}
object Parent {
  
  inline def apply(): Parent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Parent]
  }
  
  extension [Self <: Parent](x: Self) {
    
    inline def setParent(value: default): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
