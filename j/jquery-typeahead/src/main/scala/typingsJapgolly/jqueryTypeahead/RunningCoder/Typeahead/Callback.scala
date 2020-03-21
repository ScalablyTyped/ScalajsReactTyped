package typingsJapgolly.jqueryTypeahead.RunningCoder.Typeahead

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jquery.JQueryEventObject
import typingsJapgolly.jqueryTypeahead.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Callback extends js.Object {
  /** Perform operation on the source data before it gets in Typeahead cache */
  var onCacheSave: js.UndefOr[
    js.Function4[
      /* node */ js.UndefOr[JQuery], 
      /* data */ js.UndefOr[js.Any], 
      /* group */ js.UndefOr[js.Any], 
      /* path */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  /**
    * Any time there is text inside the input and it gets cleared (Backspace, Esc, Cancel button, etc).
    * It is possible to track back the event that cleared the input using event.originalEvent
    */
  var onCancel: js.UndefOr[
    js.Function2[/* node */ js.UndefOr[JQuery], /* event */ js.UndefOr[JQueryEventObject], Unit]
  ] = js.undefined
  /**
    * Will be executed when a result item is clicked or the right arrow is pressed when an item is selected from
    * the results list. This function will trigger before the regular behaviors.
    */
  var onClick: js.UndefOr[
    js.Function4[
      /* node */ js.UndefOr[JQuery], 
      /* a */ js.UndefOr[JQuery], 
      /* item */ js.UndefOr[js.Any], 
      /* event */ js.UndefOr[JQueryEventObject], 
      Unit
    ]
  ] = js.undefined
  /**
    * Will be executed when a result item is clicked or the right arrow is pressed when an item is selected from
    * the results list. This function will trigger after the regular behaviors.
    */
  var onClickAfter: js.UndefOr[
    js.Function4[
      /* node */ js.UndefOr[JQuery], 
      /* a */ js.UndefOr[JQuery], 
      /* item */ js.UndefOr[js.Any], 
      /* event */ js.UndefOr[JQueryEventObject], 
      Unit
    ]
  ] = js.undefined
  /**
    * Will be executed when a result item is clicked or the right arrow is pressed when an item is selected from
    * the results list. This function will trigger before the regular behaviors.
    */
  var onClickBefore: js.UndefOr[
    js.Function4[
      /* node */ js.UndefOr[JQuery], 
      /* a */ js.UndefOr[JQuery], 
      /* item */ js.UndefOr[js.Any], 
      /* event */ js.UndefOr[JQueryEventObject], 
      Unit
    ]
  ] = js.undefined
  /** Will be executed when a dropdown filter is selected. Requires `dropdownFilter: true`. */
  var onDropdownFilter: js.UndefOr[
    js.Function4[
      /* node */ js.UndefOr[JQuery], 
      /* a */ js.UndefOr[JQuery], 
      /* item */ js.UndefOr[js.Any], 
      /* event */ js.UndefOr[JQueryEventObject], 
      Unit
    ]
  ] = js.undefined
  /** When an item in the result list is focused */
  var onEnter: js.UndefOr[
    js.Function4[
      /* node */ js.UndefOr[JQuery], 
      /* item */ js.UndefOr[js.Any], 
      /* result */ js.UndefOr[js.Any], 
      /* event */ js.UndefOr[JQueryEventObject], 
      Unit
    ]
  ] = js.undefined
  /** Triggers when the Typeahead results layout is requested to hide. */
  var onHideLayout: js.UndefOr[
    js.Function2[/* node */ js.UndefOr[JQuery], /* query */ js.UndefOr[String], Unit]
  ] = js.undefined
  /** Will be executed on Typeahead initialization, before anything else. */
  var onInit: js.UndefOr[js.Function1[/* node */ js.UndefOr[JQuery], Unit]] = js.undefined
  /** Perform an action right after the result HTML gets inserted into Typeahead's DOM. */
  var onLayoutBuiltAfter: js.UndefOr[
    js.Function3[
      /* node */ js.UndefOr[JQuery], 
      /* query */ js.UndefOr[String], 
      /* result */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  /**
    * When the result HTML is build, modify it before it get showed.
    * This callback should be used to modify the result DOM before it gets inserted into Typeahead.
    * * If you are using this callback, the resultHtmlList param needs to be returned at the end of your function.
    */
  var onLayoutBuiltBefore: js.UndefOr[
    js.Function4[
      /* node */ js.UndefOr[JQuery], 
      /* query */ js.UndefOr[String], 
      /* result */ js.UndefOr[js.Any], 
      /* resultHtmlList */ js.UndefOr[JQuery], 
      JQuery
    ]
  ] = js.undefined
  /** When an item in the result list is blurred */
  var onLeave: js.UndefOr[
    js.Function4[
      /* node */ js.UndefOr[JQuery], 
      /* item */ js.UndefOr[js.Any], 
      /* result */ js.UndefOr[js.Any], 
      /* event */ js.UndefOr[JQueryEventObject], 
      Unit
    ]
  ] = js.undefined
  /** Will be executed when a item is hovered inside the result list. */
  var onMouseEnter: js.UndefOr[
    js.Function4[
      /* node */ js.UndefOr[JQuery], 
      /* a */ js.UndefOr[JQuery], 
      /* item */ js.UndefOr[js.Any], 
      /* event */ js.UndefOr[JQueryEventObject], 
      Unit
    ]
  ] = js.undefined
  /** Will be executed when a result item is hovered out. */
  var onMouseLeave: js.UndefOr[
    js.Function4[
      /* node */ js.UndefOr[JQuery], 
      /* a */ js.UndefOr[JQuery], 
      /* item */ js.UndefOr[js.Any], 
      /* event */ js.UndefOr[JQueryEventObject], 
      Unit
    ]
  ] = js.undefined
  /** Called at the end of Navigate (once the `.active` class and other operations are completed). */
  var onNavigateAfter: js.UndefOr[
    js.Function6[
      /* node */ js.UndefOr[JQuery], 
      /* lis */ js.UndefOr[JQuery], 
      /* a */ js.UndefOr[JQuery], 
      /* item */ js.UndefOr[js.Any], 
      /* query */ js.UndefOr[String], 
      /* event */ js.UndefOr[JQueryEventObject], 
      Unit
    ]
  ] = js.undefined
  /**
    * When a key is pressed to navigate the results. It is possible to disable the input text change
    * when using up and down arrows when `event.preventInputChange` is set to true
    */
  var onNavigateBefore: js.UndefOr[
    js.Function3[
      /* node */ js.UndefOr[JQuery], 
      /* query */ js.UndefOr[String], 
      /* event */ js.UndefOr[JQueryEventObject], 
      Unit
    ]
  ] = js.undefined
  /**
    * Gets called after the Ajax requests are all received and the data is populated inside Typeahead.
    * This is the place where extra parsing or filtering should occure before the data gets available inside any Typeahead query
    * For example, the Backend sends the "display" key separated by underscores "_" instead of spaces " ".
    * * The `data` parameter HAS to be returned after it's transformed.
    */
  var onPopulateSource: js.UndefOr[
    js.Function4[
      /* node */ js.UndefOr[JQuery], 
      /* data */ js.UndefOr[js.Array[_]], 
      /* group */ js.UndefOr[js.Any], 
      /* path */ js.UndefOr[js.Any], 
      js.Array[_]
    ]
  ] = js.undefined
  /** Triggers when the Typeahead initial preparation is completed. */
  var onReady: js.UndefOr[js.Function1[/* node */ js.UndefOr[JQuery], Unit]] = js.undefined
  /** Gets called when the Ajax request(s) are all received */
  var onReceiveRequest: js.UndefOr[
    js.Function2[/* node */ js.UndefOr[JQuery], /* query */ js.UndefOr[String], Unit]
  ] = js.undefined
  /** Whenever the result changes, this callback will be triggered. */
  var onResult: js.UndefOr[
    js.Function4[
      /* node */ js.UndefOr[JQuery], 
      /* query */ js.UndefOr[String], 
      /* result */ js.UndefOr[js.Any], 
      /* resultCount */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.undefined
  /** Triggers every time a new search is executed in Typeahead. */
  var onSearch: js.UndefOr[
    js.Function2[/* node */ js.UndefOr[JQuery], /* query */ js.UndefOr[String], Unit]
  ] = js.undefined
  /** Gets called when the Ajax request(s) are sent. Either on initial requests or on every dynamic requests. */
  var onSendRequest: js.UndefOr[
    js.Function2[/* node */ js.UndefOr[JQuery], /* query */ js.UndefOr[String], Unit]
  ] = js.undefined
  /** Triggers when the Typeahead results layout is displayed. */
  var onShowLayout: js.UndefOr[
    js.Function2[/* node */ js.UndefOr[JQuery], /* query */ js.UndefOr[String], Unit]
  ] = js.undefined
  /**
    * Override the native onSubmit function by your own.
    * If after performing a set of action(s) you want to submit the form, simply do `form.submit()`.
    * * The item parameter is not always defined. An item object will be sent if the submit happens after an item from the list has been selected.
    */
  var onSubmit: js.UndefOr[
    js.Function4[
      /* node */ js.UndefOr[JQuery], 
      /* form */ js.UndefOr[js.Any], 
      /* item */ js.UndefOr[js.Any], 
      /* event */ js.UndefOr[JQueryEventObject], 
      Unit
    ]
  ] = js.undefined
}

object Callback {
  @scala.inline
  def apply(
    onCacheSave: (/* node */ js.UndefOr[JQuery], /* data */ js.UndefOr[js.Any], /* group */ js.UndefOr[js.Any], /* path */ js.UndefOr[js.Any]) => japgolly.scalajs.react.Callback = null,
    onCancel: (/* node */ js.UndefOr[JQuery], /* event */ js.UndefOr[JQueryEventObject]) => japgolly.scalajs.react.Callback = null,
    onClick: (/* node */ js.UndefOr[JQuery], /* a */ js.UndefOr[JQuery], /* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[JQueryEventObject]) => japgolly.scalajs.react.Callback = null,
    onClickAfter: (/* node */ js.UndefOr[JQuery], /* a */ js.UndefOr[JQuery], /* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[JQueryEventObject]) => japgolly.scalajs.react.Callback = null,
    onClickBefore: (/* node */ js.UndefOr[JQuery], /* a */ js.UndefOr[JQuery], /* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[JQueryEventObject]) => japgolly.scalajs.react.Callback = null,
    onDropdownFilter: (/* node */ js.UndefOr[JQuery], /* a */ js.UndefOr[JQuery], /* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[JQueryEventObject]) => japgolly.scalajs.react.Callback = null,
    onEnter: (/* node */ js.UndefOr[JQuery], /* item */ js.UndefOr[js.Any], /* result */ js.UndefOr[js.Any], /* event */ js.UndefOr[JQueryEventObject]) => japgolly.scalajs.react.Callback = null,
    onHideLayout: (/* node */ js.UndefOr[JQuery], /* query */ js.UndefOr[String]) => japgolly.scalajs.react.Callback = null,
    onInit: /* node */ js.UndefOr[JQuery] => japgolly.scalajs.react.Callback = null,
    onLayoutBuiltAfter: (/* node */ js.UndefOr[JQuery], /* query */ js.UndefOr[String], /* result */ js.UndefOr[js.Any]) => japgolly.scalajs.react.Callback = null,
    onLayoutBuiltBefore: (/* node */ js.UndefOr[JQuery], /* query */ js.UndefOr[String], /* result */ js.UndefOr[js.Any], /* resultHtmlList */ js.UndefOr[JQuery]) => CallbackTo[JQuery] = null,
    onLeave: (/* node */ js.UndefOr[JQuery], /* item */ js.UndefOr[js.Any], /* result */ js.UndefOr[js.Any], /* event */ js.UndefOr[JQueryEventObject]) => japgolly.scalajs.react.Callback = null,
    onMouseEnter: (/* node */ js.UndefOr[JQuery], /* a */ js.UndefOr[JQuery], /* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[JQueryEventObject]) => japgolly.scalajs.react.Callback = null,
    onMouseLeave: (/* node */ js.UndefOr[JQuery], /* a */ js.UndefOr[JQuery], /* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[JQueryEventObject]) => japgolly.scalajs.react.Callback = null,
    onNavigateAfter: (/* node */ js.UndefOr[JQuery], /* lis */ js.UndefOr[JQuery], /* a */ js.UndefOr[JQuery], /* item */ js.UndefOr[js.Any], /* query */ js.UndefOr[String], /* event */ js.UndefOr[JQueryEventObject]) => japgolly.scalajs.react.Callback = null,
    onNavigateBefore: (/* node */ js.UndefOr[JQuery], /* query */ js.UndefOr[String], /* event */ js.UndefOr[JQueryEventObject]) => japgolly.scalajs.react.Callback = null,
    onPopulateSource: (/* node */ js.UndefOr[JQuery], /* data */ js.UndefOr[js.Array[js.Any]], /* group */ js.UndefOr[js.Any], /* path */ js.UndefOr[js.Any]) => CallbackTo[js.Array[js.Any]] = null,
    onReady: /* node */ js.UndefOr[JQuery] => japgolly.scalajs.react.Callback = null,
    onReceiveRequest: (/* node */ js.UndefOr[JQuery], /* query */ js.UndefOr[String]) => japgolly.scalajs.react.Callback = null,
    onResult: (/* node */ js.UndefOr[JQuery], /* query */ js.UndefOr[String], /* result */ js.UndefOr[js.Any], /* resultCount */ js.UndefOr[Double]) => japgolly.scalajs.react.Callback = null,
    onSearch: (/* node */ js.UndefOr[JQuery], /* query */ js.UndefOr[String]) => japgolly.scalajs.react.Callback = null,
    onSendRequest: (/* node */ js.UndefOr[JQuery], /* query */ js.UndefOr[String]) => japgolly.scalajs.react.Callback = null,
    onShowLayout: (/* node */ js.UndefOr[JQuery], /* query */ js.UndefOr[String]) => japgolly.scalajs.react.Callback = null,
    onSubmit: (/* node */ js.UndefOr[JQuery], /* form */ js.UndefOr[js.Any], /* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[JQueryEventObject]) => japgolly.scalajs.react.Callback = null
  ): Callback = {
    val __obj = js.Dynamic.literal()
    if (onCacheSave != null) __obj.updateDynamic("onCacheSave")(js.Any.fromFunction4((t0: /* node */ js.UndefOr[typingsJapgolly.jqueryTypeahead.JQuery], t1: /* data */ js.UndefOr[js.Any], t2: /* group */ js.UndefOr[js.Any], t3: /* path */ js.UndefOr[js.Any]) => onCacheSave(t0, t1, t2, t3).runNow()))
    if (onCancel != null) __obj.updateDynamic("onCancel")(js.Any.fromFunction2((t0: /* node */ js.UndefOr[typingsJapgolly.jqueryTypeahead.JQuery], t1: /* event */ js.UndefOr[typingsJapgolly.jquery.JQueryEventObject]) => onCancel(t0, t1).runNow()))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction4((t0: /* node */ js.UndefOr[typingsJapgolly.jqueryTypeahead.JQuery], t1: /* a */ js.UndefOr[typingsJapgolly.jqueryTypeahead.JQuery], t2: /* item */ js.UndefOr[js.Any], t3: /* event */ js.UndefOr[typingsJapgolly.jquery.JQueryEventObject]) => onClick(t0, t1, t2, t3).runNow()))
    if (onClickAfter != null) __obj.updateDynamic("onClickAfter")(js.Any.fromFunction4((t0: /* node */ js.UndefOr[typingsJapgolly.jqueryTypeahead.JQuery], t1: /* a */ js.UndefOr[typingsJapgolly.jqueryTypeahead.JQuery], t2: /* item */ js.UndefOr[js.Any], t3: /* event */ js.UndefOr[typingsJapgolly.jquery.JQueryEventObject]) => onClickAfter(t0, t1, t2, t3).runNow()))
    if (onClickBefore != null) __obj.updateDynamic("onClickBefore")(js.Any.fromFunction4((t0: /* node */ js.UndefOr[typingsJapgolly.jqueryTypeahead.JQuery], t1: /* a */ js.UndefOr[typingsJapgolly.jqueryTypeahead.JQuery], t2: /* item */ js.UndefOr[js.Any], t3: /* event */ js.UndefOr[typingsJapgolly.jquery.JQueryEventObject]) => onClickBefore(t0, t1, t2, t3).runNow()))
    if (onDropdownFilter != null) __obj.updateDynamic("onDropdownFilter")(js.Any.fromFunction4((t0: /* node */ js.UndefOr[typingsJapgolly.jqueryTypeahead.JQuery], t1: /* a */ js.UndefOr[typingsJapgolly.jqueryTypeahead.JQuery], t2: /* item */ js.UndefOr[js.Any], t3: /* event */ js.UndefOr[typingsJapgolly.jquery.JQueryEventObject]) => onDropdownFilter(t0, t1, t2, t3).runNow()))
    if (onEnter != null) __obj.updateDynamic("onEnter")(js.Any.fromFunction4((t0: /* node */ js.UndefOr[typingsJapgolly.jqueryTypeahead.JQuery], t1: /* item */ js.UndefOr[js.Any], t2: /* result */ js.UndefOr[js.Any], t3: /* event */ js.UndefOr[typingsJapgolly.jquery.JQueryEventObject]) => onEnter(t0, t1, t2, t3).runNow()))
    if (onHideLayout != null) __obj.updateDynamic("onHideLayout")(js.Any.fromFunction2((t0: /* node */ js.UndefOr[typingsJapgolly.jqueryTypeahead.JQuery], t1: /* query */ js.UndefOr[java.lang.String]) => onHideLayout(t0, t1).runNow()))
    if (onInit != null) __obj.updateDynamic("onInit")(js.Any.fromFunction1((t0: /* node */ js.UndefOr[typingsJapgolly.jqueryTypeahead.JQuery]) => onInit(t0).runNow()))
    if (onLayoutBuiltAfter != null) __obj.updateDynamic("onLayoutBuiltAfter")(js.Any.fromFunction3((t0: /* node */ js.UndefOr[typingsJapgolly.jqueryTypeahead.JQuery], t1: /* query */ js.UndefOr[java.lang.String], t2: /* result */ js.UndefOr[js.Any]) => onLayoutBuiltAfter(t0, t1, t2).runNow()))
    if (onLayoutBuiltBefore != null) __obj.updateDynamic("onLayoutBuiltBefore")(js.Any.fromFunction4((t0: /* node */ js.UndefOr[typingsJapgolly.jqueryTypeahead.JQuery], t1: /* query */ js.UndefOr[java.lang.String], t2: /* result */ js.UndefOr[js.Any], t3: /* resultHtmlList */ js.UndefOr[typingsJapgolly.jqueryTypeahead.JQuery]) => onLayoutBuiltBefore(t0, t1, t2, t3).runNow()))
    if (onLeave != null) __obj.updateDynamic("onLeave")(js.Any.fromFunction4((t0: /* node */ js.UndefOr[typingsJapgolly.jqueryTypeahead.JQuery], t1: /* item */ js.UndefOr[js.Any], t2: /* result */ js.UndefOr[js.Any], t3: /* event */ js.UndefOr[typingsJapgolly.jquery.JQueryEventObject]) => onLeave(t0, t1, t2, t3).runNow()))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction4((t0: /* node */ js.UndefOr[typingsJapgolly.jqueryTypeahead.JQuery], t1: /* a */ js.UndefOr[typingsJapgolly.jqueryTypeahead.JQuery], t2: /* item */ js.UndefOr[js.Any], t3: /* event */ js.UndefOr[typingsJapgolly.jquery.JQueryEventObject]) => onMouseEnter(t0, t1, t2, t3).runNow()))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction4((t0: /* node */ js.UndefOr[typingsJapgolly.jqueryTypeahead.JQuery], t1: /* a */ js.UndefOr[typingsJapgolly.jqueryTypeahead.JQuery], t2: /* item */ js.UndefOr[js.Any], t3: /* event */ js.UndefOr[typingsJapgolly.jquery.JQueryEventObject]) => onMouseLeave(t0, t1, t2, t3).runNow()))
    if (onNavigateAfter != null) __obj.updateDynamic("onNavigateAfter")(js.Any.fromFunction6((t0: /* node */ js.UndefOr[typingsJapgolly.jqueryTypeahead.JQuery], t1: /* lis */ js.UndefOr[typingsJapgolly.jqueryTypeahead.JQuery], t2: /* a */ js.UndefOr[typingsJapgolly.jqueryTypeahead.JQuery], t3: /* item */ js.UndefOr[js.Any], t4: /* query */ js.UndefOr[java.lang.String], t5: /* event */ js.UndefOr[typingsJapgolly.jquery.JQueryEventObject]) => onNavigateAfter(t0, t1, t2, t3, t4, t5).runNow()))
    if (onNavigateBefore != null) __obj.updateDynamic("onNavigateBefore")(js.Any.fromFunction3((t0: /* node */ js.UndefOr[typingsJapgolly.jqueryTypeahead.JQuery], t1: /* query */ js.UndefOr[java.lang.String], t2: /* event */ js.UndefOr[typingsJapgolly.jquery.JQueryEventObject]) => onNavigateBefore(t0, t1, t2).runNow()))
    if (onPopulateSource != null) __obj.updateDynamic("onPopulateSource")(js.Any.fromFunction4((t0: /* node */ js.UndefOr[typingsJapgolly.jqueryTypeahead.JQuery], t1: /* data */ js.UndefOr[js.Array[js.Any]], t2: /* group */ js.UndefOr[js.Any], t3: /* path */ js.UndefOr[js.Any]) => onPopulateSource(t0, t1, t2, t3).runNow()))
    if (onReady != null) __obj.updateDynamic("onReady")(js.Any.fromFunction1((t0: /* node */ js.UndefOr[typingsJapgolly.jqueryTypeahead.JQuery]) => onReady(t0).runNow()))
    if (onReceiveRequest != null) __obj.updateDynamic("onReceiveRequest")(js.Any.fromFunction2((t0: /* node */ js.UndefOr[typingsJapgolly.jqueryTypeahead.JQuery], t1: /* query */ js.UndefOr[java.lang.String]) => onReceiveRequest(t0, t1).runNow()))
    if (onResult != null) __obj.updateDynamic("onResult")(js.Any.fromFunction4((t0: /* node */ js.UndefOr[typingsJapgolly.jqueryTypeahead.JQuery], t1: /* query */ js.UndefOr[java.lang.String], t2: /* result */ js.UndefOr[js.Any], t3: /* resultCount */ js.UndefOr[scala.Double]) => onResult(t0, t1, t2, t3).runNow()))
    if (onSearch != null) __obj.updateDynamic("onSearch")(js.Any.fromFunction2((t0: /* node */ js.UndefOr[typingsJapgolly.jqueryTypeahead.JQuery], t1: /* query */ js.UndefOr[java.lang.String]) => onSearch(t0, t1).runNow()))
    if (onSendRequest != null) __obj.updateDynamic("onSendRequest")(js.Any.fromFunction2((t0: /* node */ js.UndefOr[typingsJapgolly.jqueryTypeahead.JQuery], t1: /* query */ js.UndefOr[java.lang.String]) => onSendRequest(t0, t1).runNow()))
    if (onShowLayout != null) __obj.updateDynamic("onShowLayout")(js.Any.fromFunction2((t0: /* node */ js.UndefOr[typingsJapgolly.jqueryTypeahead.JQuery], t1: /* query */ js.UndefOr[java.lang.String]) => onShowLayout(t0, t1).runNow()))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction4((t0: /* node */ js.UndefOr[typingsJapgolly.jqueryTypeahead.JQuery], t1: /* form */ js.UndefOr[js.Any], t2: /* item */ js.UndefOr[js.Any], t3: /* event */ js.UndefOr[typingsJapgolly.jquery.JQueryEventObject]) => onSubmit(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[Callback]
  }
}

