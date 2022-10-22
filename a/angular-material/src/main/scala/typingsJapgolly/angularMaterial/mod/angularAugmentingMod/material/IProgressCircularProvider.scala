package typingsJapgolly.angularMaterial.mod.angularAugmentingMod.material

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IProgressCircularProvider extends StObject {
  
  def configure(options: IProgressCircularConfig): Unit
}
object IProgressCircularProvider {
  
  inline def apply(configure: IProgressCircularConfig => Callback): IProgressCircularProvider = {
    val __obj = js.Dynamic.literal(configure = js.Any.fromFunction1((t0: IProgressCircularConfig) => configure(t0).runNow()))
    __obj.asInstanceOf[IProgressCircularProvider]
  }
  
  extension [Self <: IProgressCircularProvider](x: Self) {
    
    inline def setConfigure(value: IProgressCircularConfig => Callback): Self = StObject.set(x, "configure", js.Any.fromFunction1((t0: IProgressCircularConfig) => value(t0).runNow()))
  }
}
