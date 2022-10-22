package typingsJapgolly.winrt.global.Windows.Foundation

import typingsJapgolly.winrt.Windows.Foundation.Diagnostics.ErrorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Diagnostics {
  
  @JSGlobal("Windows.Foundation.Diagnostics.ErrorOptions")
  @js.native
  object ErrorOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.Foundation.Diagnostics.ErrorOptions & Double] = js.native
    
    /* 2 */ val forceExceptions: typingsJapgolly.winrt.Windows.Foundation.Diagnostics.ErrorOptions.forceExceptions & Double = js.native
    
    /* 0 */ val none: typingsJapgolly.winrt.Windows.Foundation.Diagnostics.ErrorOptions.none & Double = js.native
    
    /* 1 */ val suppressExceptions: typingsJapgolly.winrt.Windows.Foundation.Diagnostics.ErrorOptions.suppressExceptions & Double = js.native
    
    /* 4 */ val suppressSetErrorInfo: typingsJapgolly.winrt.Windows.Foundation.Diagnostics.ErrorOptions.suppressSetErrorInfo & Double = js.native
    
    /* 3 */ val useSetErrorInfo: typingsJapgolly.winrt.Windows.Foundation.Diagnostics.ErrorOptions.useSetErrorInfo & Double = js.native
  }
  
  @JSGlobal("Windows.Foundation.Diagnostics.RuntimeBrokerErrorSettings")
  @js.native
  open class RuntimeBrokerErrorSettings ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Foundation.Diagnostics.RuntimeBrokerErrorSettings {
    
    /* CompleteClass */
    override def getErrorOptions(): ErrorOptions = js.native
    
    /* CompleteClass */
    override def setErrorOptions(value: ErrorOptions): Unit = js.native
  }
}
