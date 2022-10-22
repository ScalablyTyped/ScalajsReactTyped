package typingsJapgolly.winrt.Windows.Networking.BackgroundTransfer

import typingsJapgolly.winrt.Windows.Web.WebErrorStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBackgroundTransferErrorStaticMethods extends StObject {
  
  def getStatus(hresult: Double): WebErrorStatus
}
object IBackgroundTransferErrorStaticMethods {
  
  inline def apply(getStatus: Double => WebErrorStatus): IBackgroundTransferErrorStaticMethods = {
    val __obj = js.Dynamic.literal(getStatus = js.Any.fromFunction1(getStatus))
    __obj.asInstanceOf[IBackgroundTransferErrorStaticMethods]
  }
  
  extension [Self <: IBackgroundTransferErrorStaticMethods](x: Self) {
    
    inline def setGetStatus(value: Double => WebErrorStatus): Self = StObject.set(x, "getStatus", js.Any.fromFunction1(value))
  }
}
