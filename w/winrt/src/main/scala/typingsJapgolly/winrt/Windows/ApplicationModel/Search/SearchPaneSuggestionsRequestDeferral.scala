package typingsJapgolly.winrt.Windows.ApplicationModel.Search

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchPaneSuggestionsRequestDeferral
  extends StObject
     with ISearchPaneSuggestionsRequestDeferral
object SearchPaneSuggestionsRequestDeferral {
  
  inline def apply(complete: Callback): SearchPaneSuggestionsRequestDeferral = {
    val __obj = js.Dynamic.literal(complete = complete.toJsFn)
    __obj.asInstanceOf[SearchPaneSuggestionsRequestDeferral]
  }
}
