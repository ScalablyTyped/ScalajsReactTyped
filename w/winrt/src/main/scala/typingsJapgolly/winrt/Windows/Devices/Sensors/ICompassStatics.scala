package typingsJapgolly.winrt.Windows.Devices.Sensors

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICompassStatics extends StObject {
  
  def getDefault(): Compass
}
object ICompassStatics {
  
  inline def apply(getDefault: CallbackTo[Compass]): ICompassStatics = {
    val __obj = js.Dynamic.literal(getDefault = getDefault.toJsFn)
    __obj.asInstanceOf[ICompassStatics]
  }
  
  extension [Self <: ICompassStatics](x: Self) {
    
    inline def setGetDefault(value: CallbackTo[Compass]): Self = StObject.set(x, "getDefault", value.toJsFn)
  }
}
