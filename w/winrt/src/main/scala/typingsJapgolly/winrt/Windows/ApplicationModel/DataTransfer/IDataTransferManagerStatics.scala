package typingsJapgolly.winrt.Windows.ApplicationModel.DataTransfer

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDataTransferManagerStatics extends StObject {
  
  def getForCurrentView(): DataTransferManager
  
  def showShareUI(): Unit
}
object IDataTransferManagerStatics {
  
  inline def apply(getForCurrentView: CallbackTo[DataTransferManager], showShareUI: Callback): IDataTransferManagerStatics = {
    val __obj = js.Dynamic.literal(getForCurrentView = getForCurrentView.toJsFn, showShareUI = showShareUI.toJsFn)
    __obj.asInstanceOf[IDataTransferManagerStatics]
  }
  
  extension [Self <: IDataTransferManagerStatics](x: Self) {
    
    inline def setGetForCurrentView(value: CallbackTo[DataTransferManager]): Self = StObject.set(x, "getForCurrentView", value.toJsFn)
    
    inline def setShowShareUI(value: Callback): Self = StObject.set(x, "showShareUI", value.toJsFn)
  }
}
