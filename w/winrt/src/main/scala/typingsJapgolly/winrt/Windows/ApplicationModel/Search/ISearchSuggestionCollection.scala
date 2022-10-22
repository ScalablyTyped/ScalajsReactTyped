package typingsJapgolly.winrt.Windows.ApplicationModel.Search

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrt.Windows.Foundation.Collections.IIterable
import typingsJapgolly.winrt.Windows.Storage.Streams.IRandomAccessStreamReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISearchSuggestionCollection extends StObject {
  
  def appendQuerySuggestion(text: String): Unit
  
  def appendQuerySuggestions(suggestions: IIterable[String]): Unit
  
  def appendResultSuggestion(
    text: String,
    detailText: String,
    tag: String,
    image: IRandomAccessStreamReference,
    imageAlternateText: String
  ): Unit
  
  def appendSearchSeparator(label: String): Unit
  
  var size: Double
}
object ISearchSuggestionCollection {
  
  inline def apply(
    appendQuerySuggestion: String => Callback,
    appendQuerySuggestions: IIterable[String] => Callback,
    appendResultSuggestion: (String, String, String, IRandomAccessStreamReference, String) => Callback,
    appendSearchSeparator: String => Callback,
    size: Double
  ): ISearchSuggestionCollection = {
    val __obj = js.Dynamic.literal(appendQuerySuggestion = js.Any.fromFunction1((t0: String) => appendQuerySuggestion(t0).runNow()), appendQuerySuggestions = js.Any.fromFunction1((t0: IIterable[String]) => appendQuerySuggestions(t0).runNow()), appendResultSuggestion = js.Any.fromFunction5((t0: String, t1: String, t2: String, t3: IRandomAccessStreamReference, t4: String) => (appendResultSuggestion(t0, t1, t2, t3, t4)).runNow()), appendSearchSeparator = js.Any.fromFunction1((t0: String) => appendSearchSeparator(t0).runNow()), size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchSuggestionCollection]
  }
  
  extension [Self <: ISearchSuggestionCollection](x: Self) {
    
    inline def setAppendQuerySuggestion(value: String => Callback): Self = StObject.set(x, "appendQuerySuggestion", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setAppendQuerySuggestions(value: IIterable[String] => Callback): Self = StObject.set(x, "appendQuerySuggestions", js.Any.fromFunction1((t0: IIterable[String]) => value(t0).runNow()))
    
    inline def setAppendResultSuggestion(value: (String, String, String, IRandomAccessStreamReference, String) => Callback): Self = StObject.set(x, "appendResultSuggestion", js.Any.fromFunction5((t0: String, t1: String, t2: String, t3: IRandomAccessStreamReference, t4: String) => (value(t0, t1, t2, t3, t4)).runNow()))
    
    inline def setAppendSearchSeparator(value: String => Callback): Self = StObject.set(x, "appendSearchSeparator", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
