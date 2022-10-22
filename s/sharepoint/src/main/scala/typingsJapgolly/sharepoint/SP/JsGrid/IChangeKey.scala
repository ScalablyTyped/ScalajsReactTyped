package typingsJapgolly.sharepoint.SP.JsGrid

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IChangeKey extends StObject {
  
  def CompareTo(changeKey: IChangeKey): Double
  
  def GetVersionNumber(): Double
  
  def Release(): Unit
  
  def Reserve(): Unit
}
object IChangeKey {
  
  inline def apply(
    CompareTo: IChangeKey => Double,
    GetVersionNumber: CallbackTo[Double],
    Release: Callback,
    Reserve: Callback
  ): IChangeKey = {
    val __obj = js.Dynamic.literal(CompareTo = js.Any.fromFunction1(CompareTo), GetVersionNumber = GetVersionNumber.toJsFn, Release = Release.toJsFn, Reserve = Reserve.toJsFn)
    __obj.asInstanceOf[IChangeKey]
  }
  
  extension [Self <: IChangeKey](x: Self) {
    
    inline def setCompareTo(value: IChangeKey => Double): Self = StObject.set(x, "CompareTo", js.Any.fromFunction1(value))
    
    inline def setGetVersionNumber(value: CallbackTo[Double]): Self = StObject.set(x, "GetVersionNumber", value.toJsFn)
    
    inline def setRelease(value: Callback): Self = StObject.set(x, "Release", value.toJsFn)
    
    inline def setReserve(value: Callback): Self = StObject.set(x, "Reserve", value.toJsFn)
  }
}
