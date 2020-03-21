package typingsJapgolly.reactTagAutocomplete.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.SFC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactTagsProps extends js.Object {
  /**
    * Creates a tag from the current input value when focus on the input is lost. Default: false.
    */
  var addOnBlur: js.UndefOr[Boolean] = js.undefined
  /**
    * Disables ability to delete the selected tags when backspace is pressed while focussed on the text input. Default: true.
    */
  var allowBackspace: js.UndefOr[Boolean] = js.undefined
  /**
    * Allows users to add new (not suggested) tags. Default: false.
    */
  var allowNew: js.UndefOr[Boolean] = js.undefined
  /**
    * Boolean parameter to control whether the text-input should be autofocused on mount. Default: true.
    */
  var autofocus: js.UndefOr[Boolean] = js.undefined
  /**
    * Boolean parameter to control whether the text-input should be automatically resized to fit its value. Default: true.
    */
  var autoresize: js.UndefOr[Boolean] = js.undefined
  var classNames: js.UndefOr[ClassNames] = js.undefined
  /**
    * Clear the text input when a tag is deleted. Default: true.
    */
  var clearInputOnDelete: js.UndefOr[Boolean] = js.undefined
  /**
    * Array of characters matching keyboard event key values. This is useful when needing to support a specific character irrespective of the keyboard layout.
    * Note, that this list is separate from the one specified by the delimiters option, so you'll need to set the value there to [],
    * if you wish to disable those keys. Example usage: delimiterChars={[',', ' ']}. Default: []
    */
  var delimiterChars: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Array of integers matching keyboard event keyCode values. When a corresponding key is pressed, the preceding string is finalised as tag. Default: [9, 13] (Tab and return keys).
    */
  var delimiters: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * Optional event handler when focus on the input is lost. Receives no arguments.
    */
  var handleBlur: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Optional event handler when the input receives focus. Receives no arguments.
    */
  var handleFocus: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Optional event handler when the input changes. Receives the current input value.
    */
  var handleInputChange: js.UndefOr[js.Function1[/* input */ String, Unit]] = js.undefined
  /**
    * Optional validation function that determines if tag should be added to tags. Receives a tag object. Should return a boolean.
    */
  var handleValidate: js.UndefOr[js.Function1[/* tag */ Tag, Boolean]] = js.undefined
  /**
    * An object containing additional attributes that will be applied to the underlying <input /> field.
    */
  var inputAttributes: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /**
    * Maximum number of suggestions to display. Default: 6.
    */
  var maxSuggestionsLength: js.UndefOr[Double] = js.undefined
  /**
    * How many characters are needed for suggestions to appear. Default: 2.
    */
  var minQueryLength: js.UndefOr[Double] = js.undefined
  /**
    * Message shown if there are no matching suggestions. Default: null.
    */
  var noSuggestionsText: js.UndefOr[String] = js.undefined
  /**
    * The placeholder string shown for the input. Default: 'Add new tag'.
    */
  var placeholder: js.UndefOr[String] = js.undefined
  /**
    * An array of suggestions that are used as basis for showing suggestions. Each suggestion must have an id and a name property and an optional disabled property. Default: []
    */
  var suggestions: js.UndefOr[js.Array[Tag]] = js.undefined
  /**
    * A callback function to filter suggestion items with. The callback receives two arguments; a suggestion and the current query and must return a boolean value.
    * If no function is supplied the default filter is applied. Default: null.
    */
  var suggestionsFilter: js.UndefOr[js.Function2[/* suggestion */ Tag, /* query */ String, Boolean]] = js.undefined
  /**
    * Provide a custom tag component to render. Default: null.
    */
  var tagComponent: js.UndefOr[SFC[TagComponentProps]] = js.undefined
  /**
    * An array of tags that are displayed as pre-selected. Each tag must have an id and a name property. Default: []
    */
  var tags: js.UndefOr[js.Array[Tag]] = js.undefined
  /**
    * Function called when the user wants to add a tag. Receives the tag
    */
  def handleAddition(tag: Tag): Unit
  /**
    * Function called when the user wants to delete a tag. Receives the tag index.
    */
  def handleDelete(index: Double): Unit
}

object ReactTagsProps {
  @scala.inline
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
    tags: js.Array[Tag] = null
  ): ReactTagsProps = {
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
    __obj.asInstanceOf[ReactTagsProps]
  }
}

