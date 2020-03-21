package typingsJapgolly.uiSelect.mod.ui.select

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISelectConfig extends js.Object {
  var appendToBody: Boolean
  var backspaceReset: Boolean
  var closeOnSelect: Boolean
  var dropdownPosition: String
  var paste: js.UndefOr[IPasteFn] = js.undefined
  var placeholder: String
  var refreshDelay: Double
  var removeSelected: Boolean
  var resetSearchInput: Boolean
  var searchEnabled: Boolean
  var skipFocusser: Boolean
  var sortable: Boolean
  var spinnerClass: String
  var spinnerEnabled: Boolean
  var theme: String
  def generateId(): Double
}

object ISelectConfig {
  @scala.inline
  def apply(
    appendToBody: Boolean,
    backspaceReset: Boolean,
    closeOnSelect: Boolean,
    dropdownPosition: String,
    generateId: CallbackTo[Double],
    placeholder: String,
    refreshDelay: Double,
    removeSelected: Boolean,
    resetSearchInput: Boolean,
    searchEnabled: Boolean,
    skipFocusser: Boolean,
    sortable: Boolean,
    spinnerClass: String,
    spinnerEnabled: Boolean,
    theme: String,
    paste: /* data */ String => Callback = null
  ): ISelectConfig = {
    val __obj = js.Dynamic.literal(appendToBody = appendToBody.asInstanceOf[js.Any], backspaceReset = backspaceReset.asInstanceOf[js.Any], closeOnSelect = closeOnSelect.asInstanceOf[js.Any], dropdownPosition = dropdownPosition.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], refreshDelay = refreshDelay.asInstanceOf[js.Any], removeSelected = removeSelected.asInstanceOf[js.Any], resetSearchInput = resetSearchInput.asInstanceOf[js.Any], searchEnabled = searchEnabled.asInstanceOf[js.Any], skipFocusser = skipFocusser.asInstanceOf[js.Any], sortable = sortable.asInstanceOf[js.Any], spinnerClass = spinnerClass.asInstanceOf[js.Any], spinnerEnabled = spinnerEnabled.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.updateDynamic("generateId")(generateId.toJsFn)
    if (paste != null) __obj.updateDynamic("paste")(js.Any.fromFunction1((t0: /* data */ java.lang.String) => paste(t0).runNow()))
    __obj.asInstanceOf[ISelectConfig]
  }
}

