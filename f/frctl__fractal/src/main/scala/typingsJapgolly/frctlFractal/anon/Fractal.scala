package typingsJapgolly.frctlFractal.anon

import typingsJapgolly.frctlFractal.mod.Fractal_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fractal extends StObject {
  
  var fractal: Fractal_
}
object Fractal {
  
  inline def apply(fractal: Fractal_): Fractal = {
    val __obj = js.Dynamic.literal(fractal = fractal.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fractal]
  }
  
  extension [Self <: Fractal](x: Self) {
    
    inline def setFractal(value: Fractal_): Self = StObject.set(x, "fractal", value.asInstanceOf[js.Any])
  }
}
