package typingsJapgolly.winrt.Windows.Graphics.Printing

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPrintManagerStatic extends StObject {
  
  def getForCurrentView(): PrintManager
  
  def showPrintUIAsync(): IAsyncOperation[Boolean]
}
object IPrintManagerStatic {
  
  inline def apply(
    getForCurrentView: CallbackTo[PrintManager],
    showPrintUIAsync: CallbackTo[IAsyncOperation[Boolean]]
  ): IPrintManagerStatic = {
    val __obj = js.Dynamic.literal(getForCurrentView = getForCurrentView.toJsFn, showPrintUIAsync = showPrintUIAsync.toJsFn)
    __obj.asInstanceOf[IPrintManagerStatic]
  }
  
  extension [Self <: IPrintManagerStatic](x: Self) {
    
    inline def setGetForCurrentView(value: CallbackTo[PrintManager]): Self = StObject.set(x, "getForCurrentView", value.toJsFn)
    
    inline def setShowPrintUIAsync(value: CallbackTo[IAsyncOperation[Boolean]]): Self = StObject.set(x, "showPrintUIAsync", value.toJsFn)
  }
}
