package typingsJapgolly.kendoUi.kendo.dataviz.map

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShapeLayerOptions extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
}
object ShapeLayerOptions {
  
  inline def apply(): ShapeLayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShapeLayerOptions]
  }
  
  extension [Self <: ShapeLayerOptions](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
