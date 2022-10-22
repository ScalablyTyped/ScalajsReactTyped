package typingsJapgolly.winrt.Windows.Devices.Sensors

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IInclinometerStatics extends StObject {
  
  def getDefault(): Inclinometer
}
object IInclinometerStatics {
  
  inline def apply(getDefault: CallbackTo[Inclinometer]): IInclinometerStatics = {
    val __obj = js.Dynamic.literal(getDefault = getDefault.toJsFn)
    __obj.asInstanceOf[IInclinometerStatics]
  }
  
  extension [Self <: IInclinometerStatics](x: Self) {
    
    inline def setGetDefault(value: CallbackTo[Inclinometer]): Self = StObject.set(x, "getDefault", value.toJsFn)
  }
}
