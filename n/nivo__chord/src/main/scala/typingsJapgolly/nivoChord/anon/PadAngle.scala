package typingsJapgolly.nivoChord.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PadAngle extends StObject {
  
  var padAngle: Double
}
object PadAngle {
  
  inline def apply(padAngle: Double): PadAngle = {
    val __obj = js.Dynamic.literal(padAngle = padAngle.asInstanceOf[js.Any])
    __obj.asInstanceOf[PadAngle]
  }
  
  extension [Self <: PadAngle](x: Self) {
    
    inline def setPadAngle(value: Double): Self = StObject.set(x, "padAngle", value.asInstanceOf[js.Any])
  }
}
