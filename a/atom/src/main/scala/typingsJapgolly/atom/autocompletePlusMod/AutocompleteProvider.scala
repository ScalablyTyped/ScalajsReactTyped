package typingsJapgolly.atom.autocompletePlusMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutocompleteProvider extends js.Object {
  /**
    *  Defines the scope selector(s) (can be comma-separated) for which your provider
    *  should not be used.
    */
  var disableForSelector: js.UndefOr[String] = js.undefined
  /** Will be called if your provider is being destroyed by autocomplete+ */
  var dispose: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** Will not use lower priority providers when this provider is used. */
  var excludeLowerPriority: js.UndefOr[Boolean] = js.undefined
  /**
    *  (experimental) Is called when a suggestion is selected by the user for
    *  the purpose of loading more information about the suggestion. Return a
    *  Promise of the new suggestion to replace it with or return null if
    *  no change is needed.
    */
  var getSuggestionDetailsOnSelect: js.UndefOr[
    js.Function1[
      /* suggestion */ AnySuggestion, 
      (js.Promise[AnySuggestion | Null]) | AnySuggestion | Null
    ]
  ] = js.undefined
  /**
    *  A number to indicate its priority to be included in a suggestions request.
    *  The default provider has an inclusion priority of 0. Higher priority providers
    *  can suppress lower priority providers with excludeLowerPriority.
    */
  var inclusionPriority: js.UndefOr[Double] = js.undefined
  /**
    *  Function that is called when a suggestion from your provider was inserted
    *  into the buffer.
    */
  var onDidInsertSuggestion: js.UndefOr[js.Function1[/* params */ SuggestionInsertedEvent, Unit]] = js.undefined
  /**
    *  Defines the scope selector(s) (can be comma-separated) for which your provider
    *  should receive suggestion requests.
    */
  var selector: String
  /**
    *  A number to determine the sort order of suggestions. The default provider has
    *  an suggestion priority of 1.
    */
  var suggestionPriority: js.UndefOr[Double] = js.undefined
  /**
    *  Is called when a suggestion request has been dispatched by autocomplete+ to
    *  your provider. Return an array of suggestions (if any) in the order you would
    *  like them displayed to the user. Returning a Promise of an array of suggestions
    *  is also supported.
    */
  def getSuggestions(params: SuggestionsRequestedEvent): Suggestions | js.Promise[Suggestions]
}

object AutocompleteProvider {
  @scala.inline
  def apply(
    getSuggestions: SuggestionsRequestedEvent => CallbackTo[Suggestions | js.Promise[Suggestions]],
    selector: String,
    disableForSelector: String = null,
    dispose: js.UndefOr[Callback] = js.undefined,
    excludeLowerPriority: js.UndefOr[Boolean] = js.undefined,
    getSuggestionDetailsOnSelect: /* suggestion */ AnySuggestion => CallbackTo[(js.Promise[AnySuggestion | Null]) | AnySuggestion | Null] = null,
    inclusionPriority: Int | Double = null,
    onDidInsertSuggestion: /* params */ SuggestionInsertedEvent => Callback = null,
    suggestionPriority: Int | Double = null
  ): AutocompleteProvider = {
    val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
    __obj.updateDynamic("getSuggestions")(js.Any.fromFunction1((t0: typingsJapgolly.atom.autocompletePlusMod.SuggestionsRequestedEvent) => getSuggestions(t0).runNow()))
    if (disableForSelector != null) __obj.updateDynamic("disableForSelector")(disableForSelector.asInstanceOf[js.Any])
    dispose.foreach(p => __obj.updateDynamic("dispose")(p.toJsFn))
    if (!js.isUndefined(excludeLowerPriority)) __obj.updateDynamic("excludeLowerPriority")(excludeLowerPriority.asInstanceOf[js.Any])
    if (getSuggestionDetailsOnSelect != null) __obj.updateDynamic("getSuggestionDetailsOnSelect")(js.Any.fromFunction1((t0: /* suggestion */ typingsJapgolly.atom.autocompletePlusMod.AnySuggestion) => getSuggestionDetailsOnSelect(t0).runNow()))
    if (inclusionPriority != null) __obj.updateDynamic("inclusionPriority")(inclusionPriority.asInstanceOf[js.Any])
    if (onDidInsertSuggestion != null) __obj.updateDynamic("onDidInsertSuggestion")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.atom.autocompletePlusMod.SuggestionInsertedEvent) => onDidInsertSuggestion(t0).runNow()))
    if (suggestionPriority != null) __obj.updateDynamic("suggestionPriority")(suggestionPriority.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutocompleteProvider]
  }
}

