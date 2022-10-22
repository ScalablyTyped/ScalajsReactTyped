package typingsJapgolly.winrtUwp.Windows.ApplicationModel.Search

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IIterable
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a collection of search suggestions to be displayed in the search pane in response to a suggestionsrequested event. */
trait SearchSuggestionCollection extends StObject {
  
  /**
    * Appends a query suggestion to the list of search suggestions for the search pane.
    * @param text The text of the query suggestion.
    */
  def appendQuerySuggestion(text: String): Unit
  
  /**
    * Appends a list of query suggestions to the list of search suggestions for the search pane.
    * @param suggestions The list of query suggestions.
    */
  def appendQuerySuggestions(suggestions: IIterable[String]): Unit
  
  /**
    * Appends a suggested search result to the list of suggestions to display in the search pane.
    * @param text The text of the suggested result.
    * @param detailText The detail text for the suggested result.
    * @param tag The unique tag that identifies this suggested result.
    * @param image The image to accompany the results suggestion.
    * @param imageAlternateText The alternate text for the image.
    */
  def appendResultSuggestion(
    text: String,
    detailText: String,
    tag: String,
    image: IRandomAccessStreamReference,
    imageAlternateText: String
  ): Unit
  
  /**
    * Appends a text label that is used to separate groups of suggestions in the search pane.
    * @param label The text to use as a separator. This text should be descriptive of any suggestions that are appended after it.
    */
  def appendSearchSeparator(label: String): Unit
  
  /** The number of suggestions in the collection. */
  var size: Double
}
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
  
  extension [Self <: SearchSuggestionCollection](x: Self) {
    
    inline def setAppendQuerySuggestion(value: String => Callback): Self = StObject.set(x, "appendQuerySuggestion", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setAppendQuerySuggestions(value: IIterable[String] => Callback): Self = StObject.set(x, "appendQuerySuggestions", js.Any.fromFunction1((t0: IIterable[String]) => value(t0).runNow()))
    
    inline def setAppendResultSuggestion(value: (String, String, String, IRandomAccessStreamReference, String) => Callback): Self = StObject.set(x, "appendResultSuggestion", js.Any.fromFunction5((t0: String, t1: String, t2: String, t3: IRandomAccessStreamReference, t4: String) => (value(t0, t1, t2, t3, t4)).runNow()))
    
    inline def setAppendSearchSeparator(value: String => Callback): Self = StObject.set(x, "appendSearchSeparator", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
