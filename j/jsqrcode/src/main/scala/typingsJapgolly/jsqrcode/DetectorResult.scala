package typingsJapgolly.jsqrcode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectorResult extends StObject {
  
  var bits: BitMatrix
  
  var points: (js.Tuple3[DetectorResult, DetectorResult, DetectorResult]) | (js.Tuple4[DetectorResult, DetectorResult, DetectorResult, DetectorResult])
}
object DetectorResult {
  
  inline def apply(
    bits: BitMatrix,
    points: (js.Tuple3[DetectorResult, DetectorResult, DetectorResult]) | (js.Tuple4[DetectorResult, DetectorResult, DetectorResult, DetectorResult])
  ): DetectorResult = {
    val __obj = js.Dynamic.literal(bits = bits.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectorResult]
  }
  
  extension [Self <: DetectorResult](x: Self) {
    
    inline def setBits(value: BitMatrix): Self = StObject.set(x, "bits", value.asInstanceOf[js.Any])
    
    inline def setPoints(
      value: (js.Tuple3[DetectorResult, DetectorResult, DetectorResult]) | (js.Tuple4[DetectorResult, DetectorResult, DetectorResult, DetectorResult])
    ): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
  }
}
