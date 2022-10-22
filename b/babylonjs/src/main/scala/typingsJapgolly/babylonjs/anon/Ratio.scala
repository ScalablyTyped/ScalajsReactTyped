package typingsJapgolly.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ratio extends StObject {
  
  var ratio: Double
}
object Ratio {
  
  inline def apply(ratio: Double): Ratio = {
    val __obj = js.Dynamic.literal(ratio = ratio.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ratio]
  }
  
  extension [Self <: Ratio](x: Self) {
    
    inline def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
  }
}
