package typingsJapgolly.winrt.Windows.Foundation

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Diagnostics {
  
  @js.native
  sealed trait ErrorOptions extends StObject
  @JSGlobal("Windows.Foundation.Diagnostics.ErrorOptions")
  @js.native
  object ErrorOptions extends StObject {
    
    @js.native
    sealed trait forceExceptions
      extends StObject
         with ErrorOptions
    
    @js.native
    sealed trait none
      extends StObject
         with ErrorOptions
    
    @js.native
    sealed trait suppressExceptions
      extends StObject
         with ErrorOptions
    
    @js.native
    sealed trait suppressSetErrorInfo
      extends StObject
         with ErrorOptions
    
    @js.native
    sealed trait useSetErrorInfo
      extends StObject
         with ErrorOptions
  }
  
  trait IErrorReportingSettings extends StObject {
    
    def getErrorOptions(): ErrorOptions
    
    def setErrorOptions(value: ErrorOptions): Unit
  }
  object IErrorReportingSettings {
    
    inline def apply(getErrorOptions: CallbackTo[ErrorOptions], setErrorOptions: ErrorOptions => Callback): IErrorReportingSettings = {
      val __obj = js.Dynamic.literal(getErrorOptions = getErrorOptions.toJsFn, setErrorOptions = js.Any.fromFunction1((t0: ErrorOptions) => setErrorOptions(t0).runNow()))
      __obj.asInstanceOf[IErrorReportingSettings]
    }
    
    extension [Self <: IErrorReportingSettings](x: Self) {
      
      inline def setGetErrorOptions(value: CallbackTo[ErrorOptions]): Self = StObject.set(x, "getErrorOptions", value.toJsFn)
      
      inline def setSetErrorOptions(value: ErrorOptions => Callback): Self = StObject.set(x, "setErrorOptions", js.Any.fromFunction1((t0: ErrorOptions) => value(t0).runNow()))
    }
  }
  
  trait RuntimeBrokerErrorSettings
    extends StObject
       with IErrorReportingSettings
  object RuntimeBrokerErrorSettings {
    
    inline def apply(getErrorOptions: CallbackTo[ErrorOptions], setErrorOptions: ErrorOptions => Callback): RuntimeBrokerErrorSettings = {
      val __obj = js.Dynamic.literal(getErrorOptions = getErrorOptions.toJsFn, setErrorOptions = js.Any.fromFunction1((t0: ErrorOptions) => setErrorOptions(t0).runNow()))
      __obj.asInstanceOf[RuntimeBrokerErrorSettings]
    }
  }
}
