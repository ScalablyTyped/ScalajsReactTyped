package typingsJapgolly.hippyReact.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PixelRatio extends StObject {
  
  def get(): Double
}
object PixelRatio {
  
  @JSImport("@hippy/react", "PixelRatio")
  @js.native
  val ^ : PixelRatio = js.native
  
  extension [Self <: PixelRatio](x: Self) {
    
    inline def setGet(value: CallbackTo[Double]): Self = StObject.set(x, "get", value.toJsFn)
  }
}
