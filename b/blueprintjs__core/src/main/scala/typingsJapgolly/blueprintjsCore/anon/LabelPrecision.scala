package typingsJapgolly.blueprintjsCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelPrecision extends StObject {
  
  var labelPrecision: Double
}
object LabelPrecision {
  
  inline def apply(labelPrecision: Double): LabelPrecision = {
    val __obj = js.Dynamic.literal(labelPrecision = labelPrecision.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelPrecision]
  }
  
  extension [Self <: LabelPrecision](x: Self) {
    
    inline def setLabelPrecision(value: Double): Self = StObject.set(x, "labelPrecision", value.asInstanceOf[js.Any])
  }
}
