package typingsJapgolly.winrt.Windows.ApplicationModel.Search

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrt.Windows.Foundation.Collections.IIterable
import typingsJapgolly.winrt.Windows.Storage.Streams.IRandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISearchSuggestionCollection extends js.Object {
  var size: Double
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
}

object ISearchSuggestionCollection {
  @scala.inline
  def apply(
    appendQuerySuggestion: String => Callback,
    appendQuerySuggestions: IIterable[String] => Callback,
    appendResultSuggestion: (String, String, String, IRandomAccessStreamReference, String) => Callback,
    appendSearchSeparator: String => Callback,
    size: Double
  ): ISearchSuggestionCollection = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("appendQuerySuggestion")(js.Any.fromFunction1((t0: java.lang.String) => appendQuerySuggestion(t0).runNow()))
    __obj.updateDynamic("appendQuerySuggestions")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Foundation.Collections.IIterable[java.lang.String]) => appendQuerySuggestions(t0).runNow()))
    __obj.updateDynamic("appendResultSuggestion")(js.Any.fromFunction5((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String, t3: typingsJapgolly.winrt.Windows.Storage.Streams.IRandomAccessStreamReference, t4: java.lang.String) => appendResultSuggestion(t0, t1, t2, t3, t4).runNow()))
    __obj.updateDynamic("appendSearchSeparator")(js.Any.fromFunction1((t0: java.lang.String) => appendSearchSeparator(t0).runNow()))
    __obj.asInstanceOf[ISearchSuggestionCollection]
  }
}

