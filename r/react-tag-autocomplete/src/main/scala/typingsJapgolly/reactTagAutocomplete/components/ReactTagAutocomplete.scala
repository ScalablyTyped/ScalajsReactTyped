package typingsJapgolly.reactTagAutocomplete.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.SFC
import typingsJapgolly.reactTagAutocomplete.mod.ClassNames
import typingsJapgolly.reactTagAutocomplete.mod.ReactTagsProps
import typingsJapgolly.reactTagAutocomplete.mod.Tag
import typingsJapgolly.reactTagAutocomplete.mod.TagComponentProps
import typingsJapgolly.reactTagAutocomplete.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactTagAutocomplete {
  def apply(
    handleAddition: Tag => Callback,
    handleDelete: Double => Callback,
    addOnBlur: js.UndefOr[Boolean] = js.undefined,
    allowBackspace: js.UndefOr[Boolean] = js.undefined,
    allowNew: js.UndefOr[Boolean] = js.undefined,
    autofocus: js.UndefOr[Boolean] = js.undefined,
    autoresize: js.UndefOr[Boolean] = js.undefined,
    classNames: ClassNames = null,
    clearInputOnDelete: js.UndefOr[Boolean] = js.undefined,
    delimiterChars: js.Array[String] = null,
    delimiters: js.Array[Double] = null,
    handleBlur: js.UndefOr[Callback] = js.undefined,
    handleFocus: js.UndefOr[Callback] = js.undefined,
    handleInputChange: /* input */ String => Callback = null,
    handleValidate: /* tag */ Tag => CallbackTo[Boolean] = null,
    inputAttributes: StringDictionary[js.Any] = null,
    maxSuggestionsLength: Int | Double = null,
    minQueryLength: Int | Double = null,
    noSuggestionsText: String = null,
    placeholder: String = null,
    suggestions: js.Array[Tag] = null,
    suggestionsFilter: (/* suggestion */ Tag, /* query */ String) => CallbackTo[Boolean] = null,
    tagComponent: SFC[TagComponentProps] = null,
    tags: js.Array[Tag] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ReactTagsProps, default, Unit, ReactTagsProps] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("handleAddition")(js.Any.fromFunction1((t0: typingsJapgolly.reactTagAutocomplete.mod.Tag) => handleAddition(t0).runNow()))
    __obj.updateDynamic("handleDelete")(js.Any.fromFunction1((t0: scala.Double) => handleDelete(t0).runNow()))
    if (!js.isUndefined(addOnBlur)) __obj.updateDynamic("addOnBlur")(addOnBlur.asInstanceOf[js.Any])
    if (!js.isUndefined(allowBackspace)) __obj.updateDynamic("allowBackspace")(allowBackspace.asInstanceOf[js.Any])
    if (!js.isUndefined(allowNew)) __obj.updateDynamic("allowNew")(allowNew.asInstanceOf[js.Any])
    if (!js.isUndefined(autofocus)) __obj.updateDynamic("autofocus")(autofocus.asInstanceOf[js.Any])
    if (!js.isUndefined(autoresize)) __obj.updateDynamic("autoresize")(autoresize.asInstanceOf[js.Any])
    if (classNames != null) __obj.updateDynamic("classNames")(classNames.asInstanceOf[js.Any])
    if (!js.isUndefined(clearInputOnDelete)) __obj.updateDynamic("clearInputOnDelete")(clearInputOnDelete.asInstanceOf[js.Any])
    if (delimiterChars != null) __obj.updateDynamic("delimiterChars")(delimiterChars.asInstanceOf[js.Any])
    if (delimiters != null) __obj.updateDynamic("delimiters")(delimiters.asInstanceOf[js.Any])
    handleBlur.foreach(p => __obj.updateDynamic("handleBlur")(p.toJsFn))
    handleFocus.foreach(p => __obj.updateDynamic("handleFocus")(p.toJsFn))
    if (handleInputChange != null) __obj.updateDynamic("handleInputChange")(js.Any.fromFunction1((t0: /* input */ java.lang.String) => handleInputChange(t0).runNow()))
    if (handleValidate != null) __obj.updateDynamic("handleValidate")(js.Any.fromFunction1((t0: /* tag */ typingsJapgolly.reactTagAutocomplete.mod.Tag) => handleValidate(t0).runNow()))
    if (inputAttributes != null) __obj.updateDynamic("inputAttributes")(inputAttributes.asInstanceOf[js.Any])
    if (maxSuggestionsLength != null) __obj.updateDynamic("maxSuggestionsLength")(maxSuggestionsLength.asInstanceOf[js.Any])
    if (minQueryLength != null) __obj.updateDynamic("minQueryLength")(minQueryLength.asInstanceOf[js.Any])
    if (noSuggestionsText != null) __obj.updateDynamic("noSuggestionsText")(noSuggestionsText.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (suggestions != null) __obj.updateDynamic("suggestions")(suggestions.asInstanceOf[js.Any])
    if (suggestionsFilter != null) __obj.updateDynamic("suggestionsFilter")(js.Any.fromFunction2((t0: /* suggestion */ typingsJapgolly.reactTagAutocomplete.mod.Tag, t1: /* query */ java.lang.String) => suggestionsFilter(t0, t1).runNow()))
    if (tagComponent != null) __obj.updateDynamic("tagComponent")(tagComponent.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactTagAutocomplete.mod.ReactTagsProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactTagAutocomplete.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactTagAutocomplete.mod.ReactTagsProps])(children: _*)
  }
  @JSImport("react-tag-autocomplete", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

