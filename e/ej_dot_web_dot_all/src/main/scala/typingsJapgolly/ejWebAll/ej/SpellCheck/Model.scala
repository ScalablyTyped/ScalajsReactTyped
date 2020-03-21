package typingsJapgolly.ejWebAll.ej.SpellCheck

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Triggers on the AJAX call request beginning.
    */
  var actionBegin: js.UndefOr[js.Function1[/* e */ ActionBeginEventArgs, Unit]] = js.undefined
  /** Triggers when the AJAX call request failure.
    */
  var actionFailure: js.UndefOr[js.Function1[/* e */ ActionFailureEventArgs, Unit]] = js.undefined
  /** Triggers on the success of AJAX call request.
    */
  var actionSuccess: js.UndefOr[js.Function1[/* e */ ActionSuccessEventArgs, Unit]] = js.undefined
  /** Sets the data type for the ajax call used within the SpellCheck control, denoting the type of data that are expected to be retrieved from the server. The applicable values are
    * json and jsonp.
    * @Default {jsonp}
    */
  var ajaxDataType: js.UndefOr[String] = js.undefined
  /** To set either â€˜Postâ€™ or â€˜Getâ€™ for ajax request type which invokes when validate, get suggestion and dictionary action.Possible values are â€˜POSTâ€™ or â€˜GETâ€™
    * @Default {GET}
    */
  var ajaxRequestType: js.UndefOr[String] = js.undefined
  /** Triggers when the spell check operations completed through dialog mode.
    */
  var complete: js.UndefOr[js.Function1[/* e */ CompleteEventArgs, Unit]] = js.undefined
  /** Triggers when the context menu item clicked.
    */
  var contextClick: js.UndefOr[js.Function1[/* e */ ContextClickEventArgs, Unit]] = js.undefined
  /** Holds all options related to the context menu settings of SpellCheck.
    */
  var contextMenuSettings: js.UndefOr[ContextMenuSettings] = js.undefined
  /** Triggers before context menu opening.
    */
  var contextOpen: js.UndefOr[js.Function1[/* e */ ContextOpenEventArgs, Unit]] = js.undefined
  /** It allows to spell check the multiple target HTML element's texts and correct its error words.
    * @Default {null}
    */
  var controlsToValidate: js.UndefOr[String] = js.undefined
  /** Triggers before the spell check dialog opens.
    */
  var dialogBeforeOpen: js.UndefOr[js.Function1[/* e */ DialogBeforeOpenEventArgs, Unit]] = js.undefined
  /** Triggers when the spell check dialog closed.
    */
  var dialogClose: js.UndefOr[js.Function1[/* e */ DialogCloseEventArgs, Unit]] = js.undefined
  /** Triggers after the spell check dialog opens.
    */
  var dialogOpen: js.UndefOr[js.Function1[/* e */ DialogOpenEventArgs, Unit]] = js.undefined
  /** It includes the service method path to find the error words and its suggestions also adding the custom word into the custom dictionary.
    */
  var dictionarySettings: js.UndefOr[DictionarySettings] = js.undefined
  /** When set to true, allows sending Asynchronous ajax request for checking the spelling errors.
    * @Default {true}
    */
  var enableAsync: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable the spellcheck operation on Enter/Space key-press.
    * @Default {false}
    */
  var enableValidateOnType: js.UndefOr[Boolean] = js.undefined
  /** It helps to ignore the uppercase, mixed case words, alpha numeric words, file path and email addresses based on the property values.
    */
  var ignoreSettings: js.UndefOr[IgnoreSettings] = js.undefined
  /** To ignore the words from the error word consideration.
    * @Default {[]}
    */
  var ignoreWords: js.UndefOr[js.Array[_]] = js.undefined
  /** When set to true, allows the spellcheck to render based upon screen size.
    * @Default {true}
    */
  var isResponsive: js.UndefOr[Boolean] = js.undefined
  /** Sets the specific culture to the SpellCheck.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.undefined
  /** To set the maximum suggestion display count.
    * @Default {6}
    */
  var maxSuggestionCount: js.UndefOr[Double] = js.undefined
  /** To display the error word in a customized style.
    * @Default {e-errorword}
    */
  var misspellWordCss: js.UndefOr[String] = js.undefined
  /** Triggers when the dialog mode spell check starting.
    */
  var start: js.UndefOr[js.Function1[/* e */ StartEventArgs, Unit]] = js.undefined
  /** Triggers before loading the target HTML element text into the dialog sentence area.
    */
  var targetUpdating: js.UndefOr[js.Function1[/* e */ TargetUpdatingEventArgs, Unit]] = js.undefined
  /** Triggers when the spell check control performing the spell check operations such as ignore, ignoreAll, change, changeAll and addToDictionary.
    */
  var validating: js.UndefOr[js.Function1[/* e */ ValidatingEventArgs, Unit]] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    actionBegin: /* e */ ActionBeginEventArgs => Callback = null,
    actionFailure: /* e */ ActionFailureEventArgs => Callback = null,
    actionSuccess: /* e */ ActionSuccessEventArgs => Callback = null,
    ajaxDataType: String = null,
    ajaxRequestType: String = null,
    complete: /* e */ CompleteEventArgs => Callback = null,
    contextClick: /* e */ ContextClickEventArgs => Callback = null,
    contextMenuSettings: ContextMenuSettings = null,
    contextOpen: /* e */ ContextOpenEventArgs => Callback = null,
    controlsToValidate: String = null,
    dialogBeforeOpen: /* e */ DialogBeforeOpenEventArgs => Callback = null,
    dialogClose: /* e */ DialogCloseEventArgs => Callback = null,
    dialogOpen: /* e */ DialogOpenEventArgs => Callback = null,
    dictionarySettings: DictionarySettings = null,
    enableAsync: js.UndefOr[Boolean] = js.undefined,
    enableValidateOnType: js.UndefOr[Boolean] = js.undefined,
    ignoreSettings: IgnoreSettings = null,
    ignoreWords: js.Array[_] = null,
    isResponsive: js.UndefOr[Boolean] = js.undefined,
    locale: String = null,
    maxSuggestionCount: Int | Double = null,
    misspellWordCss: String = null,
    start: /* e */ StartEventArgs => Callback = null,
    targetUpdating: /* e */ TargetUpdatingEventArgs => Callback = null,
    validating: /* e */ ValidatingEventArgs => Callback = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (actionBegin != null) __obj.updateDynamic("actionBegin")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.SpellCheck.ActionBeginEventArgs) => actionBegin(t0).runNow()))
    if (actionFailure != null) __obj.updateDynamic("actionFailure")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.SpellCheck.ActionFailureEventArgs) => actionFailure(t0).runNow()))
    if (actionSuccess != null) __obj.updateDynamic("actionSuccess")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.SpellCheck.ActionSuccessEventArgs) => actionSuccess(t0).runNow()))
    if (ajaxDataType != null) __obj.updateDynamic("ajaxDataType")(ajaxDataType.asInstanceOf[js.Any])
    if (ajaxRequestType != null) __obj.updateDynamic("ajaxRequestType")(ajaxRequestType.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.SpellCheck.CompleteEventArgs) => complete(t0).runNow()))
    if (contextClick != null) __obj.updateDynamic("contextClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.SpellCheck.ContextClickEventArgs) => contextClick(t0).runNow()))
    if (contextMenuSettings != null) __obj.updateDynamic("contextMenuSettings")(contextMenuSettings.asInstanceOf[js.Any])
    if (contextOpen != null) __obj.updateDynamic("contextOpen")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.SpellCheck.ContextOpenEventArgs) => contextOpen(t0).runNow()))
    if (controlsToValidate != null) __obj.updateDynamic("controlsToValidate")(controlsToValidate.asInstanceOf[js.Any])
    if (dialogBeforeOpen != null) __obj.updateDynamic("dialogBeforeOpen")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.SpellCheck.DialogBeforeOpenEventArgs) => dialogBeforeOpen(t0).runNow()))
    if (dialogClose != null) __obj.updateDynamic("dialogClose")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.SpellCheck.DialogCloseEventArgs) => dialogClose(t0).runNow()))
    if (dialogOpen != null) __obj.updateDynamic("dialogOpen")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.SpellCheck.DialogOpenEventArgs) => dialogOpen(t0).runNow()))
    if (dictionarySettings != null) __obj.updateDynamic("dictionarySettings")(dictionarySettings.asInstanceOf[js.Any])
    if (!js.isUndefined(enableAsync)) __obj.updateDynamic("enableAsync")(enableAsync.asInstanceOf[js.Any])
    if (!js.isUndefined(enableValidateOnType)) __obj.updateDynamic("enableValidateOnType")(enableValidateOnType.asInstanceOf[js.Any])
    if (ignoreSettings != null) __obj.updateDynamic("ignoreSettings")(ignoreSettings.asInstanceOf[js.Any])
    if (ignoreWords != null) __obj.updateDynamic("ignoreWords")(ignoreWords.asInstanceOf[js.Any])
    if (!js.isUndefined(isResponsive)) __obj.updateDynamic("isResponsive")(isResponsive.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (maxSuggestionCount != null) __obj.updateDynamic("maxSuggestionCount")(maxSuggestionCount.asInstanceOf[js.Any])
    if (misspellWordCss != null) __obj.updateDynamic("misspellWordCss")(misspellWordCss.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.SpellCheck.StartEventArgs) => start(t0).runNow()))
    if (targetUpdating != null) __obj.updateDynamic("targetUpdating")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.SpellCheck.TargetUpdatingEventArgs) => targetUpdating(t0).runNow()))
    if (validating != null) __obj.updateDynamic("validating")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.SpellCheck.ValidatingEventArgs) => validating(t0).runNow()))
    __obj.asInstanceOf[Model]
  }
}

