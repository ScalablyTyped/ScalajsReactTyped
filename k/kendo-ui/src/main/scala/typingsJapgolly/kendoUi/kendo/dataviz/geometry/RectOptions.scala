package typingsJapgolly.kendoUi.kendo.dataviz.geometry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RectOptions extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
}
object RectOptions {
  
  inline def apply(): RectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RectOptions]
  }
  
  extension [Self <: RectOptions](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
