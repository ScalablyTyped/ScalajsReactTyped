package typingsJapgolly.reactTagInput.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Component
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.ReactChild
import typingsJapgolly.reactTagInput.AnonActiveSuggestion
import typingsJapgolly.reactTagInput.AnonId
import typingsJapgolly.reactTagInput.mod.ReactTagsProps
import typingsJapgolly.reactTagInput.mod.Tag
import typingsJapgolly.reactTagInput.reactTagInputNumbers.`1`
import typingsJapgolly.reactTagInput.reactTagInputStrings.`inline`
import typingsJapgolly.reactTagInput.reactTagInputStrings.bottom
import typingsJapgolly.reactTagInput.reactTagInputStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_ReactTagsProps1609989372[ComponentRef] () {
  val componentImport: js.Any
  def apply(
    handleAddition: AnonId => Callback,
    handleDelete: Double => Callback,
    allowAdditionFromPaste: js.UndefOr[Boolean] = js.undefined,
    allowDeleteFromEmptyInput: js.UndefOr[Boolean] = js.undefined,
    allowDragDrop: js.UndefOr[Boolean] = js.undefined,
    allowUnique: js.UndefOr[Boolean] = js.undefined,
    autocomplete: Boolean | `1` = null,
    autofocus: js.UndefOr[Boolean] = js.undefined,
    classNames: AnonActiveSuggestion = null,
    delimiters: js.Array[Double] = null,
    handleDrag: (/* tag */ AnonId, /* currPos */ Double, /* newPos */ Double) => Callback = null,
    handleFilterSuggestions: (/* textInputValue */ String, /* possibleSuggestionsArray */ js.Array[Tag]) => CallbackTo[js.Array[Tag]] = null,
    handleInputBlur: /* textInputValue */ String => Callback = null,
    handleInputChange: /* value */ String => Callback = null,
    handleInputFocus: /* value */ String => Callback = null,
    handleTagClick: /* i */ Double => Callback = null,
    id: String = null,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    inputFieldPosition: top | bottom | `inline` = null,
    inputValue: String = null,
    labelField: String = null,
    maxLength: Int | Double = null,
    minQueryLength: Int | Double = null,
    name: String = null,
    placeholder: String = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    removeComponent: Component[js.Object, js.Object] = null,
    renderSuggestion: (/* tag */ Tag, /* query */ String) => CallbackTo[ReactChild | Unit] = null,
    resetInputOnDelete: js.UndefOr[Boolean] = js.undefined,
    shouldRenderSuggestions: /* query */ String => CallbackTo[Boolean] = null,
    suggestions: js.Array[Tag] = null,
    tags: js.Array[Tag] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ReactTagsProps, ComponentRef, Unit, ReactTagsProps] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("handleAddition")(js.Any.fromFunction1((t0: typingsJapgolly.reactTagInput.AnonId) => handleAddition(t0).runNow()))
    __obj.updateDynamic("handleDelete")(js.Any.fromFunction1((t0: scala.Double) => handleDelete(t0).runNow()))
    if (!js.isUndefined(allowAdditionFromPaste)) __obj.updateDynamic("allowAdditionFromPaste")(allowAdditionFromPaste.asInstanceOf[js.Any])
    if (!js.isUndefined(allowDeleteFromEmptyInput)) __obj.updateDynamic("allowDeleteFromEmptyInput")(allowDeleteFromEmptyInput.asInstanceOf[js.Any])
    if (!js.isUndefined(allowDragDrop)) __obj.updateDynamic("allowDragDrop")(allowDragDrop.asInstanceOf[js.Any])
    if (!js.isUndefined(allowUnique)) __obj.updateDynamic("allowUnique")(allowUnique.asInstanceOf[js.Any])
    if (autocomplete != null) __obj.updateDynamic("autocomplete")(autocomplete.asInstanceOf[js.Any])
    if (!js.isUndefined(autofocus)) __obj.updateDynamic("autofocus")(autofocus.asInstanceOf[js.Any])
    if (classNames != null) __obj.updateDynamic("classNames")(classNames.asInstanceOf[js.Any])
    if (delimiters != null) __obj.updateDynamic("delimiters")(delimiters.asInstanceOf[js.Any])
    if (handleDrag != null) __obj.updateDynamic("handleDrag")(js.Any.fromFunction3((t0: /* tag */ typingsJapgolly.reactTagInput.AnonId, t1: /* currPos */ scala.Double, t2: /* newPos */ scala.Double) => handleDrag(t0, t1, t2).runNow()))
    if (handleFilterSuggestions != null) __obj.updateDynamic("handleFilterSuggestions")(js.Any.fromFunction2((t0: /* textInputValue */ java.lang.String, t1: /* possibleSuggestionsArray */ js.Array[typingsJapgolly.reactTagInput.mod.Tag]) => handleFilterSuggestions(t0, t1).runNow()))
    if (handleInputBlur != null) __obj.updateDynamic("handleInputBlur")(js.Any.fromFunction1((t0: /* textInputValue */ java.lang.String) => handleInputBlur(t0).runNow()))
    if (handleInputChange != null) __obj.updateDynamic("handleInputChange")(js.Any.fromFunction1((t0: /* value */ java.lang.String) => handleInputChange(t0).runNow()))
    if (handleInputFocus != null) __obj.updateDynamic("handleInputFocus")(js.Any.fromFunction1((t0: /* value */ java.lang.String) => handleInputFocus(t0).runNow()))
    if (handleTagClick != null) __obj.updateDynamic("handleTagClick")(js.Any.fromFunction1((t0: /* i */ scala.Double) => handleTagClick(t0).runNow()))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (inputFieldPosition != null) __obj.updateDynamic("inputFieldPosition")(inputFieldPosition.asInstanceOf[js.Any])
    if (inputValue != null) __obj.updateDynamic("inputValue")(inputValue.asInstanceOf[js.Any])
    if (labelField != null) __obj.updateDynamic("labelField")(labelField.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (minQueryLength != null) __obj.updateDynamic("minQueryLength")(minQueryLength.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (removeComponent != null) __obj.updateDynamic("removeComponent")(removeComponent.asInstanceOf[js.Any])
    if (renderSuggestion != null) __obj.updateDynamic("renderSuggestion")(js.Any.fromFunction2((t0: /* tag */ typingsJapgolly.reactTagInput.mod.Tag, t1: /* query */ java.lang.String) => renderSuggestion(t0, t1).runNow()))
    if (!js.isUndefined(resetInputOnDelete)) __obj.updateDynamic("resetInputOnDelete")(resetInputOnDelete.asInstanceOf[js.Any])
    if (shouldRenderSuggestions != null) __obj.updateDynamic("shouldRenderSuggestions")(js.Any.fromFunction1((t0: /* query */ java.lang.String) => shouldRenderSuggestions(t0).runNow()))
    if (suggestions != null) __obj.updateDynamic("suggestions")(suggestions.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactTagInput.mod.ReactTagsProps, 
  japgolly.scalajs.react.Children.Varargs, 
  ComponentRef](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactTagInput.mod.ReactTagsProps])(children: _*)
  }
}

