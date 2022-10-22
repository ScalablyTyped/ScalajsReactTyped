package typingsJapgolly.winrt.Windows.Devices.Sensors

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAccelerometerStatics extends StObject {
  
  def getDefault(): Accelerometer
}
object IAccelerometerStatics {
  
  inline def apply(getDefault: CallbackTo[Accelerometer]): IAccelerometerStatics = {
    val __obj = js.Dynamic.literal(getDefault = getDefault.toJsFn)
    __obj.asInstanceOf[IAccelerometerStatics]
  }
  
  extension [Self <: IAccelerometerStatics](x: Self) {
    
    inline def setGetDefault(value: CallbackTo[Accelerometer]): Self = StObject.set(x, "getDefault", value.toJsFn)
  }
}
