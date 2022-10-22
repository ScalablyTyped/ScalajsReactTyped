package typingsJapgolly.winrt.Windows.ApplicationModel.Search

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISearchPaneSuggestionsRequestDeferral extends StObject {
  
  def complete(): Unit
}
object ISearchPaneSuggestionsRequestDeferral {
  
  inline def apply(complete: Callback): ISearchPaneSuggestionsRequestDeferral = {
    val __obj = js.Dynamic.literal(complete = complete.toJsFn)
    __obj.asInstanceOf[ISearchPaneSuggestionsRequestDeferral]
  }
  
  extension [Self <: ISearchPaneSuggestionsRequestDeferral](x: Self) {
    
    inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
  }
}
