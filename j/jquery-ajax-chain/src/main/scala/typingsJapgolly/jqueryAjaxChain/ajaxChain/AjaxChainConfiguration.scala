package typingsJapgolly.jqueryAjaxChain.ajaxChain

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jquery.JQueryAjaxSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A set of key/value pairs that configure the AjaxChain request; 'ajaxSettings' is mandatory.
  */
trait AjaxChainConfiguration extends js.Object {
  /**
    * jQuery $.ajax method settings (required).
    */
  var ajaxSettings: JQueryAjaxSettings
  /**
    * Returning a truthy value (String) allows to append a string to the next queued
    * Ajax call 'url' property value specified in original jQuery $.ajax method configuration
    * object ('ajaxSettings') (optional).
    */
  var appendToUrl: js.UndefOr[js.Function1[/* response */ js.Any, String]] = js.undefined
  /**
    * Returning a truthy value allows to prevent the related Ajax call from being executed,
    * passing the former as a parameter to any registered handler(s); useful to create
    * caching mechanisms (optional).
    */
  var hasCache: js.UndefOr[js.Function1[/* response */ js.Any, _]] = js.undefined
  /**
    * Returning a truthy value determines any registered fail callback(s) to be called immediately,
    * passing the former as an argument to the latter; the queue is then rejected (optional).
    */
  var hasErrors: js.UndefOr[js.Function1[/* response */ js.Any, _]] = js.undefined
  /**
    * Returning a truthy value prevents the queue from further progressing to the succeeding
    * Ajax calls; the queue is then resolved (optional).
    */
  var hasHaltingCapabilities: js.UndefOr[js.Function1[/* response */ js.Any, Boolean]] = js.undefined
  /**
    * Returning a truthy value prevents the queue from being halted in case of Ajax error (optional).
    */
  var isSkippable: js.UndefOr[js.Function1[/* response */ js.Any, Boolean]] = js.undefined
  /**
    * Configuration object label (optional).
    */
  var label: js.UndefOr[String] = js.undefined
  /**
    * Returning a truthy value (Object) allows to arbitrarily overwrite the next queued Ajax call
    * 'data' property value specified in the original jQuery $.ajax method configuration
    * object ('ajaxSettings') (optional).
    */
  var transform: js.UndefOr[js.Function1[/* response */ js.Any, String | js.Object | js.Array[js.Object]]] = js.undefined
}

object AjaxChainConfiguration {
  @scala.inline
  def apply(
    ajaxSettings: JQueryAjaxSettings,
    appendToUrl: /* response */ js.Any => CallbackTo[String] = null,
    hasCache: /* response */ js.Any => CallbackTo[js.Any] = null,
    hasErrors: /* response */ js.Any => CallbackTo[js.Any] = null,
    hasHaltingCapabilities: /* response */ js.Any => CallbackTo[Boolean] = null,
    isSkippable: /* response */ js.Any => CallbackTo[Boolean] = null,
    label: String = null,
    transform: /* response */ js.Any => CallbackTo[String | js.Object | js.Array[js.Object]] = null
  ): AjaxChainConfiguration = {
    val __obj = js.Dynamic.literal(ajaxSettings = ajaxSettings.asInstanceOf[js.Any])
    if (appendToUrl != null) __obj.updateDynamic("appendToUrl")(js.Any.fromFunction1((t0: /* response */ js.Any) => appendToUrl(t0).runNow()))
    if (hasCache != null) __obj.updateDynamic("hasCache")(js.Any.fromFunction1((t0: /* response */ js.Any) => hasCache(t0).runNow()))
    if (hasErrors != null) __obj.updateDynamic("hasErrors")(js.Any.fromFunction1((t0: /* response */ js.Any) => hasErrors(t0).runNow()))
    if (hasHaltingCapabilities != null) __obj.updateDynamic("hasHaltingCapabilities")(js.Any.fromFunction1((t0: /* response */ js.Any) => hasHaltingCapabilities(t0).runNow()))
    if (isSkippable != null) __obj.updateDynamic("isSkippable")(js.Any.fromFunction1((t0: /* response */ js.Any) => isSkippable(t0).runNow()))
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction1((t0: /* response */ js.Any) => transform(t0).runNow()))
    __obj.asInstanceOf[AjaxChainConfiguration]
  }
}

