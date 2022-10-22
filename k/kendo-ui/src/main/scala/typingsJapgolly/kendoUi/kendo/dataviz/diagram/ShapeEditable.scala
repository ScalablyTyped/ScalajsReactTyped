package typingsJapgolly.kendoUi.kendo.dataviz.diagram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShapeEditable extends StObject {
  
  var connect: js.UndefOr[Boolean] = js.undefined
}
object ShapeEditable {
  
  inline def apply(): ShapeEditable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShapeEditable]
  }
  
  extension [Self <: ShapeEditable](x: Self) {
    
    inline def setConnect(value: Boolean): Self = StObject.set(x, "connect", value.asInstanceOf[js.Any])
    
    inline def setConnectUndefined: Self = StObject.set(x, "connect", js.undefined)
  }
}
