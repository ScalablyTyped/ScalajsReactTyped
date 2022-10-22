package typingsJapgolly.gestalt.mod

import typingsJapgolly.gestalt.gestaltStrings.auto
import typingsJapgolly.gestalt.gestaltStrings.scroll
import typingsJapgolly.gestalt.gestaltStrings.scrollX
import typingsJapgolly.gestalt.gestaltStrings.scrollY
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollBoundaryContainerProps extends StObject {
  
  var height: js.UndefOr[Double | String] = js.undefined
  
  var overflow: js.UndefOr[scroll | scrollX | scrollY | auto] = js.undefined
}
object ScrollBoundaryContainerProps {
  
  inline def apply(): ScrollBoundaryContainerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollBoundaryContainerProps]
  }
  
  extension [Self <: ScrollBoundaryContainerProps](x: Self) {
    
    inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setOverflow(value: scroll | scrollX | scrollY | auto): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
    
    inline def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
  }
}
