package typingsJapgolly.openui5.anon

import typingsJapgolly.openui5.sapUiCommonsResponsiveContainerRangeMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurrentRange extends StObject {
  
  /**
    * The current range
    */
  var currentRange: js.UndefOr[default] = js.undefined
}
object CurrentRange {
  
  inline def apply(): CurrentRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CurrentRange]
  }
  
  extension [Self <: CurrentRange](x: Self) {
    
    inline def setCurrentRange(value: default): Self = StObject.set(x, "currentRange", value.asInstanceOf[js.Any])
    
    inline def setCurrentRangeUndefined: Self = StObject.set(x, "currentRange", js.undefined)
  }
}
