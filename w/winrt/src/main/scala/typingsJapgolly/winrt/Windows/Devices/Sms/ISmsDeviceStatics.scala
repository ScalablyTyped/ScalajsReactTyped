package typingsJapgolly.winrt.Windows.Devices.Sms

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISmsDeviceStatics extends StObject {
  
  def fromIdAsync(deviceInstanceId: String): IAsyncOperation[SmsDevice]
  
  def getDefaultAsync(): IAsyncOperation[SmsDevice]
  
  def getDeviceSelector(): String
}
object ISmsDeviceStatics {
  
  inline def apply(
    fromIdAsync: String => IAsyncOperation[SmsDevice],
    getDefaultAsync: CallbackTo[IAsyncOperation[SmsDevice]],
    getDeviceSelector: CallbackTo[String]
  ): ISmsDeviceStatics = {
    val __obj = js.Dynamic.literal(fromIdAsync = js.Any.fromFunction1(fromIdAsync), getDefaultAsync = getDefaultAsync.toJsFn, getDeviceSelector = getDeviceSelector.toJsFn)
    __obj.asInstanceOf[ISmsDeviceStatics]
  }
  
  extension [Self <: ISmsDeviceStatics](x: Self) {
    
    inline def setFromIdAsync(value: String => IAsyncOperation[SmsDevice]): Self = StObject.set(x, "fromIdAsync", js.Any.fromFunction1(value))
    
    inline def setGetDefaultAsync(value: CallbackTo[IAsyncOperation[SmsDevice]]): Self = StObject.set(x, "getDefaultAsync", value.toJsFn)
    
    inline def setGetDeviceSelector(value: CallbackTo[String]): Self = StObject.set(x, "getDeviceSelector", value.toJsFn)
  }
}
