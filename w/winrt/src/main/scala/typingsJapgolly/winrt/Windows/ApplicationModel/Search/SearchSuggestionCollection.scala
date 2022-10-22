package typingsJapgolly.winrt.Windows.ApplicationModel.Search

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrt.Windows.Foundation.Collections.IIterable
import typingsJapgolly.winrt.Windows.Storage.Streams.IRandomAccessStreamReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchSuggestionCollection
  extends StObject
     with ISearchSuggestionCollection
object SearchSuggestionCollection {
  
  inline def apply(
    appendQuerySuggestion: String => Callback,
    appendQuerySuggestions: IIterable[String] => Callback,
    appendResultSuggestion: (String, String, String, IRandomAccessStreamReference, String) => Callback,
    appendSearchSeparator: String => Callback,
    size: Double
  ): SearchSuggestionCollection = {
    val __obj = js.Dynamic.literal(appendQuerySuggestion = js.Any.fromFunction1((t0: String) => appendQuerySuggestion(t0).runNow()), appendQuerySuggestions = js.Any.fromFunction1((t0: IIterable[String]) => appendQuerySuggestions(t0).runNow()), appendResultSuggestion = js.Any.fromFunction5((t0: String, t1: String, t2: String, t3: IRandomAccessStreamReference, t4: String) => (appendResultSuggestion(t0, t1, t2, t3, t4)).runNow()), appendSearchSeparator = js.Any.fromFunction1((t0: String) => appendSearchSeparator(t0).runNow()), size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchSuggestionCollection]
  }
}
