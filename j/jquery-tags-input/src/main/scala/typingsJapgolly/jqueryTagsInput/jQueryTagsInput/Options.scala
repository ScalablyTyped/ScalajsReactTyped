package typingsJapgolly.jqueryTagsInput.jQueryTagsInput

import japgolly.scalajs.react.Callback
import typingsJapgolly.jqueryTagsInput.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Autocomplete options
    */
  var autocomplete: js.UndefOr[js.Object] = js.undefined
  /**
    * Url for autocomplete
    */
  var autocomplete_url: js.UndefOr[String] = js.undefined
  /**
    * Placeholder of field when tags is empty
    */
  var defaultText: js.UndefOr[String] = js.undefined
  /**
    * Delimiters on tags creation
    */
  var delimiter: js.UndefOr[js.Array[String] | String] = js.undefined
  /**
    * Height of tag
    */
  var height: js.UndefOr[String] = js.undefined
  /**
    * Interactive tags
    */
  var interactive: js.UndefOr[Boolean] = js.undefined
  /**
    * Max char length for tag
    */
  var maxChars: js.UndefOr[Double] = js.undefined
  /**
    * Minimun char length for tag
    */
  var minChars: js.UndefOr[Double] = js.undefined
  /**
    * Callback function on add tag
    */
  var onAddTag: js.UndefOr[js.Function1[/* addedValue */ String, Unit]] = js.undefined
  /**
    * Callback function on change list of tags
    */
  var onChange: js.UndefOr[js.Function2[/* element */ JQuery, /* changedValue */ String, Unit]] = js.undefined
  /**
    * Callback function on remove tag
    */
  var onRemoveTag: js.UndefOr[js.Function1[/* removedValue */ String, Unit]] = js.undefined
  /**
    * Placeholder color of tags
    */
  var placeholderColor: js.UndefOr[String] = js.undefined
  /**
    * Remove with tag backspace
    */
  var removeWithBackspace: js.UndefOr[Boolean] = js.undefined
  /**
    * Width of tag
    */
  var width: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    autocomplete: js.Object = null,
    autocomplete_url: String = null,
    defaultText: String = null,
    delimiter: js.Array[String] | String = null,
    height: String = null,
    interactive: js.UndefOr[Boolean] = js.undefined,
    maxChars: Int | Double = null,
    minChars: Int | Double = null,
    onAddTag: /* addedValue */ String => Callback = null,
    onChange: (/* element */ JQuery, /* changedValue */ String) => Callback = null,
    onRemoveTag: /* removedValue */ String => Callback = null,
    placeholderColor: String = null,
    removeWithBackspace: js.UndefOr[Boolean] = js.undefined,
    width: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (autocomplete != null) __obj.updateDynamic("autocomplete")(autocomplete.asInstanceOf[js.Any])
    if (autocomplete_url != null) __obj.updateDynamic("autocomplete_url")(autocomplete_url.asInstanceOf[js.Any])
    if (defaultText != null) __obj.updateDynamic("defaultText")(defaultText.asInstanceOf[js.Any])
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive.asInstanceOf[js.Any])
    if (maxChars != null) __obj.updateDynamic("maxChars")(maxChars.asInstanceOf[js.Any])
    if (minChars != null) __obj.updateDynamic("minChars")(minChars.asInstanceOf[js.Any])
    if (onAddTag != null) __obj.updateDynamic("onAddTag")(js.Any.fromFunction1((t0: /* addedValue */ java.lang.String) => onAddTag(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2((t0: /* element */ typingsJapgolly.jqueryTagsInput.JQuery, t1: /* changedValue */ java.lang.String) => onChange(t0, t1).runNow()))
    if (onRemoveTag != null) __obj.updateDynamic("onRemoveTag")(js.Any.fromFunction1((t0: /* removedValue */ java.lang.String) => onRemoveTag(t0).runNow()))
    if (placeholderColor != null) __obj.updateDynamic("placeholderColor")(placeholderColor.asInstanceOf[js.Any])
    if (!js.isUndefined(removeWithBackspace)) __obj.updateDynamic("removeWithBackspace")(removeWithBackspace.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

