package typingsJapgolly.winrt.Windows.ApplicationModel.Search

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISearchPaneStatics extends StObject {
  
  def getForCurrentView(): SearchPane
}
object ISearchPaneStatics {
  
  inline def apply(getForCurrentView: CallbackTo[SearchPane]): ISearchPaneStatics = {
    val __obj = js.Dynamic.literal(getForCurrentView = getForCurrentView.toJsFn)
    __obj.asInstanceOf[ISearchPaneStatics]
  }
  
  extension [Self <: ISearchPaneStatics](x: Self) {
    
    inline def setGetForCurrentView(value: CallbackTo[SearchPane]): Self = StObject.set(x, "getForCurrentView", value.toJsFn)
  }
}
