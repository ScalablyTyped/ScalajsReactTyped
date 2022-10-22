package typingsJapgolly.winrt.Windows.Devices.Sensors

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGyrometerStatics extends StObject {
  
  def getDefault(): Gyrometer
}
object IGyrometerStatics {
  
  inline def apply(getDefault: CallbackTo[Gyrometer]): IGyrometerStatics = {
    val __obj = js.Dynamic.literal(getDefault = getDefault.toJsFn)
    __obj.asInstanceOf[IGyrometerStatics]
  }
  
  extension [Self <: IGyrometerStatics](x: Self) {
    
    inline def setGetDefault(value: CallbackTo[Gyrometer]): Self = StObject.set(x, "getDefault", value.toJsFn)
  }
}
