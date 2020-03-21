package typingsJapgolly.selectize.Selectize

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.selectize.AnonDirection
import typingsJapgolly.selectize.JQuery
import typingsJapgolly.selectize.selectizeStrings.focus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// see https://github.com/brianreavis/selectize.js/blob/master/docs/usage.md
// option identifiers are parameterized by T; data is parameterized by U
trait IOptions[T, U] extends js.Object {
  /**
    * Sets if the "Add..." option should be the default selection in the dropdown.
    *
    * Default: false
    */
  var addPrecedence: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, Selectize will treat any options with a "" value like normal. This defaults to false to
    * accomodate the common <select> practice of having the first empty option act as a placeholder.
    *
    * Default: false
    */
  var allowEmptyOption: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, the dropdown will be closed after a selection is made.
    *
    * Default: false
    */
  var closeAfterSelect: js.UndefOr[Boolean] = js.undefined
  /**
    * Copy the original input classes to the Dropdown element.
    *
    * Default: true
    */
  var copyClassesToDropdown: js.UndefOr[Boolean] = js.undefined
  /**
    * Allows the user to create a new items that aren't in the list of options.
    * This option can be any of the following: "true", "false" (disabled), or a function that accepts two
    * arguments: "input" and "callback". The callback should be invoked with the final data for the option.
    *
    * Default: false
    */
  var create: js.UndefOr[js.Any] = js.undefined
  /**
    * Specifies a RegExp or String containing a regular expression that the current search filter must match to
    * be allowed to be created. May also be a predicate function that takes the filter text and returns whether
    * it is allowed.
    *
    * Default: null
    */
  var createFilter: js.UndefOr[js.Any] = js.undefined
  /**
    * If true, when user exits the field (clicks outside of input or presses ESC) new option is created and
    * selected (if `create`-option is enabled).
    *
    * Default: false
    */
  var createOnBlur: js.UndefOr[Boolean] = js.undefined
  /**
    * The <option> attribute from which to read JSON data about the option.
    *
    * Default: "data-data"
    */
  var dataAttr: js.UndefOr[String] = js.undefined
  /**
    * The string to separate items by. This option is only used when Selectize is instantiated from a
    * <input type="text"> element.
    *
    * Default: ','
    */
  var delimiter: js.UndefOr[String] = js.undefined
  /**
    * Enable or disable international character support.
    *
    * Default: true
    */
  var diacritics: js.UndefOr[Boolean] = js.undefined
  /**
    * The name of the property to disabled option and optgroup.
    *
    * Default: 'disabled'
    */
  var disabledField: js.UndefOr[String] = js.undefined
  /**
    * The element the dropdown menu is appended to. This should be "body" or null.
    * If null, the dropdown will be appended as a child of the selectize control.
    *
    * Default: null
    */
  var dropdownParent: js.UndefOr[String] = js.undefined
  /**
    * If true, the items that are currently selected will not be shown in the dropdown list of available options.
    *
    * Default: false
    */
  var hideSelected: js.UndefOr[Boolean] = js.undefined
  /**
    * Toggles match highlighting within the dropdown menu.
    *
    * Default: true
    */
  var highlight: js.UndefOr[Boolean] = js.undefined
  // General
  // ------------------------------------------------------------------------------------------------------------
  /**
    * An array of the initial selected values. By default this is populated from the original input element.
    */
  var items: js.UndefOr[js.Array[T]] = js.undefined
  /**
    * The name of the property to render as an option / item label (not needed when custom rendering
    * functions are defined).
    *
    * Default: "text"
    */
  var labelField: js.UndefOr[String] = js.undefined
  // Callbacks
  // ------------------------------------------------------------------------------------------------------------
  /**
    * Invoked when new options should be loaded from the server.
    */
  var load: js.UndefOr[js.Function2[/* query */ String, /* callback */ js.Function, _]] = js.undefined
  /**
    * The number of milliseconds to wait before requesting options from the server or null.
    * If null, throttling is disabled.
    *
    * Default: 300
    */
  var loadThrottle: js.UndefOr[Double] = js.undefined
  /**
    * If truthy, Selectize will make all optgroups be in the same order as they were added (by the `$order`
    * property). Otherwise, it will order based on the score of the results in each.
    *
    * Default: false
    */
  var lockOptgroupOrder: js.UndefOr[Boolean] = js.undefined
  /**
    * The max number of items the user can select.
    *
    * Default: Infinity
    */
  var maxItems: js.UndefOr[Double] = js.undefined
  /**
    * The max number of items to render at once in the dropdown list of options.
    *
    * Default: 1000
    */
  var maxOptions: js.UndefOr[Double] = js.undefined
  /**
    * Invoked when the control loses focus.
    */
  var onBlur: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * Invoked when the value of the control changes.
    *
    * If single select, value is of type T.
    * If multi select, value is of type T[].
    */
  var onChange: js.UndefOr[js.Function1[/* value */ js.Any, _]] = js.undefined
  /**
    * Invoked when the control is manually cleared via the clear() method.
    */
  var onClear: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * Invoked when the user attempts to delete the current selection.
    */
  var onDelete: js.UndefOr[js.Function1[/* values */ js.Array[T], _]] = js.undefined
  /**
    * Invoked when the dropdown closes.
    */
  var onDropdownClose: js.UndefOr[js.Function1[/* dropdown */ JQuery, _]] = js.undefined
  /**
    * Invoked when the dropdown opens.
    */
  var onDropdownOpen: js.UndefOr[js.Function1[/* dropdown */ JQuery, _]] = js.undefined
  /**
    * Invoked when the control gains focus.
    */
  var onFocus: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * Invoked once the control is completely initialized.
    */
  var onInitialize: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * Invoked when an item is selected.
    */
  var onItemAdd: js.UndefOr[js.Function2[/* value */ T, /* item */ JQuery, _]] = js.undefined
  /**
    * Invoked when an item is deselected.
    */
  var onItemRemove: js.UndefOr[js.Function1[/* value */ T, _]] = js.undefined
  /**
    * Invoked when new options have been loaded and added to the control (via the "load" option or "load" API method).
    */
  var onLoad: js.UndefOr[js.Function1[/* data */ js.Array[U], _]] = js.undefined
  /**
    * Invoked when a new option is added to the available options list.
    */
  var onOptionAdd: js.UndefOr[js.Function2[/* value */ T, /* data */ U, _]] = js.undefined
  /**
    * Invoked when an option is removed from the available options.
    */
  var onOptionRemove: js.UndefOr[js.Function1[/* value */ T, _]] = js.undefined
  /**
    * Invoked when the user types while filtering options.
    */
  var onType: js.UndefOr[js.Function1[/* srt */ String, _]] = js.undefined
  /**
    * Show the dropdown immediately when the control receives focus.
    *
    * Default: true
    */
  var openOnFocus: js.UndefOr[Boolean] = js.undefined
  /**
    * The name of the property to group items by.
    *
    * Default: "optgroup"
    */
  var optgroupField: js.UndefOr[String] = js.undefined
  /**
    * The name of the property to render as an option group label (not needed when custom rendering
    * functions are defined).
    *
    * Default: "label"
    */
  var optgroupLabelField: js.UndefOr[String] = js.undefined
  /**
    * An array of optgroup values that indicates the order they should be listed in in the dropdown.
    * If not provided, groups will be ordered by the ranking of the options within them.
    *
    * Default: null
    */
  var optgroupOrder: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The name of the option group property that serves as its unique identifier.
    *
    * Default: "value"
    */
  var optgroupValueField: js.UndefOr[String] = js.undefined
  /**
    * Option groups that options will be bucketed into.
    * If your element is a <select> with <optgroup>s this property gets populated automatically.
    * Make sure each object in the array has a property named whatever "optgroupValueField" is set to.
    */
  var optgroups: js.UndefOr[js.Array[U]] = js.undefined
  // Data / Searching
  // ------------------------------------------------------------------------------------------------------------
  /**
    * Options available to select; array of objects. If your element is <select> with <option>s specified this
    * property gets populated accordingly. Setting this property is convenient if you have your data as an
    * array and want to automatically generate the <option>s.
    *
    * Default: []
    */
  var options: js.UndefOr[js.Array[U]] = js.undefined
  /**
    * If false, items created by the user will not show up as available options once they are unselected.
    *
    * Default: true
    */
  var persist: js.UndefOr[Boolean] = js.undefined
  /**
    * The placeholder of the control (displayed when nothing is selected / typed).
    * Defaults to input element's placeholder, unless this one is specified.
    */
  var placeholder: js.UndefOr[String] = js.undefined
  /**
    * Plugins to use
    *
    * Default: null
    */
  var plugins: js.UndefOr[(js.Array[IPluginOption | String]) | StringDictionary[js.Any]] = js.undefined
  /**
    * If true, the "load" function will be called upon control initialization (with an empty search).
    * Alternatively it can be set to "focus" to call the "load" function when control receives focus.
    *
    * Default: false
    */
  var preload: js.UndefOr[Boolean | focus] = js.undefined
  // Rendering
  // ------------------------------------------------------------------------------------------------------------
  var render: js.UndefOr[ICustomRenderers[U]] = js.undefined
  /**
    * Overrides the scoring function used to sort available options. The provided function should return a
    * function that returns a number greater than or equal to zero to represent the "score" of an item
    * (the function's first argument). If 0, the option is declared not a match.
    */
  var score: js.UndefOr[js.Function1[/* search */ ISearch, js.Function1[/* item */ _, Double]]] = js.undefined
  /**
    * The animation duration (in milliseconds) of the scroll animation triggered when going [up] and [down] in
    * the options dropdown.
    *
    * Default: 60
    */
  var scrollDuration: js.UndefOr[Double] = js.undefined
  /**
    * When searching for multiple terms (separated by a space), this is the operator used. Can be "and" or "or".
    *
    * Default: "and"
    */
  var searchConjunction: js.UndefOr[String] = js.undefined
  /**
    * An array of property names to analyze when filtering options.
    *
    * Default: ["text"]
    */
  var searchField: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * If true, the tab key will choose the currently selected item.
    *
    * Default: false
    */
  var selectOnTab: js.UndefOr[Boolean] = js.undefined
  /**
    * A single field or an array of fields to sort by. Each item in the array should be an object containing at
    * least a "field" property. Optionally, "direction" can be set to "asc" or "desc". The order of the array
    * defines the sort precedence.
    *
    * Unless present, a special "$score" field will be automatically added to the beginning of the sort list.
    * This will make results sorted primarily by match quality (descending).
    *
    * Default: "$order"
    */
  var sortField: js.UndefOr[String | js.Array[AnonDirection]] = js.undefined
  /**
    * The name of the property to use as the "value" when an item is selected.
    *
    * Default: "value"
    */
  var valueField: js.UndefOr[String] = js.undefined
}

object IOptions {
  @scala.inline
  def apply[T, U](
    addPrecedence: js.UndefOr[Boolean] = js.undefined,
    allowEmptyOption: js.UndefOr[Boolean] = js.undefined,
    closeAfterSelect: js.UndefOr[Boolean] = js.undefined,
    copyClassesToDropdown: js.UndefOr[Boolean] = js.undefined,
    create: js.Any = null,
    createFilter: js.Any = null,
    createOnBlur: js.UndefOr[Boolean] = js.undefined,
    dataAttr: String = null,
    delimiter: String = null,
    diacritics: js.UndefOr[Boolean] = js.undefined,
    disabledField: String = null,
    dropdownParent: String = null,
    hideSelected: js.UndefOr[Boolean] = js.undefined,
    highlight: js.UndefOr[Boolean] = js.undefined,
    items: js.Array[T] = null,
    labelField: String = null,
    load: (/* query */ String, /* callback */ js.Function) => CallbackTo[js.Any] = null,
    loadThrottle: Int | Double = null,
    lockOptgroupOrder: js.UndefOr[Boolean] = js.undefined,
    maxItems: Int | Double = null,
    maxOptions: Int | Double = null,
    onBlur: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    onChange: /* value */ js.Any => CallbackTo[js.Any] = null,
    onClear: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    onDelete: /* values */ js.Array[T] => CallbackTo[js.Any] = null,
    onDropdownClose: /* dropdown */ JQuery => CallbackTo[js.Any] = null,
    onDropdownOpen: /* dropdown */ JQuery => CallbackTo[js.Any] = null,
    onFocus: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    onInitialize: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    onItemAdd: (/* value */ T, /* item */ JQuery) => CallbackTo[js.Any] = null,
    onItemRemove: /* value */ T => CallbackTo[js.Any] = null,
    onLoad: /* data */ js.Array[U] => CallbackTo[js.Any] = null,
    onOptionAdd: (/* value */ T, /* data */ U) => CallbackTo[js.Any] = null,
    onOptionRemove: /* value */ T => CallbackTo[js.Any] = null,
    onType: /* srt */ String => CallbackTo[js.Any] = null,
    openOnFocus: js.UndefOr[Boolean] = js.undefined,
    optgroupField: String = null,
    optgroupLabelField: String = null,
    optgroupOrder: js.Array[String] = null,
    optgroupValueField: String = null,
    optgroups: js.Array[U] = null,
    options: js.Array[U] = null,
    persist: js.UndefOr[Boolean] = js.undefined,
    placeholder: String = null,
    plugins: (js.Array[IPluginOption | String]) | StringDictionary[js.Any] = null,
    preload: Boolean | focus = null,
    render: ICustomRenderers[U] = null,
    score: /* search */ ISearch => CallbackTo[js.Function1[js.Any, Double]] = null,
    scrollDuration: Int | Double = null,
    searchConjunction: String = null,
    searchField: String | js.Array[String] = null,
    selectOnTab: js.UndefOr[Boolean] = js.undefined,
    sortField: String | js.Array[AnonDirection] = null,
    valueField: String = null
  ): IOptions[T, U] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addPrecedence)) __obj.updateDynamic("addPrecedence")(addPrecedence.asInstanceOf[js.Any])
    if (!js.isUndefined(allowEmptyOption)) __obj.updateDynamic("allowEmptyOption")(allowEmptyOption.asInstanceOf[js.Any])
    if (!js.isUndefined(closeAfterSelect)) __obj.updateDynamic("closeAfterSelect")(closeAfterSelect.asInstanceOf[js.Any])
    if (!js.isUndefined(copyClassesToDropdown)) __obj.updateDynamic("copyClassesToDropdown")(copyClassesToDropdown.asInstanceOf[js.Any])
    if (create != null) __obj.updateDynamic("create")(create.asInstanceOf[js.Any])
    if (createFilter != null) __obj.updateDynamic("createFilter")(createFilter.asInstanceOf[js.Any])
    if (!js.isUndefined(createOnBlur)) __obj.updateDynamic("createOnBlur")(createOnBlur.asInstanceOf[js.Any])
    if (dataAttr != null) __obj.updateDynamic("dataAttr")(dataAttr.asInstanceOf[js.Any])
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (!js.isUndefined(diacritics)) __obj.updateDynamic("diacritics")(diacritics.asInstanceOf[js.Any])
    if (disabledField != null) __obj.updateDynamic("disabledField")(disabledField.asInstanceOf[js.Any])
    if (dropdownParent != null) __obj.updateDynamic("dropdownParent")(dropdownParent.asInstanceOf[js.Any])
    if (!js.isUndefined(hideSelected)) __obj.updateDynamic("hideSelected")(hideSelected.asInstanceOf[js.Any])
    if (!js.isUndefined(highlight)) __obj.updateDynamic("highlight")(highlight.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (labelField != null) __obj.updateDynamic("labelField")(labelField.asInstanceOf[js.Any])
    if (load != null) __obj.updateDynamic("load")(js.Any.fromFunction2((t0: /* query */ java.lang.String, t1: /* callback */ js.Function) => load(t0, t1).runNow()))
    if (loadThrottle != null) __obj.updateDynamic("loadThrottle")(loadThrottle.asInstanceOf[js.Any])
    if (!js.isUndefined(lockOptgroupOrder)) __obj.updateDynamic("lockOptgroupOrder")(lockOptgroupOrder.asInstanceOf[js.Any])
    if (maxItems != null) __obj.updateDynamic("maxItems")(maxItems.asInstanceOf[js.Any])
    if (maxOptions != null) __obj.updateDynamic("maxOptions")(maxOptions.asInstanceOf[js.Any])
    onBlur.foreach(p => __obj.updateDynamic("onBlur")(p.toJsFn))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* value */ js.Any) => onChange(t0).runNow()))
    onClear.foreach(p => __obj.updateDynamic("onClear")(p.toJsFn))
    if (onDelete != null) __obj.updateDynamic("onDelete")(js.Any.fromFunction1((t0: /* values */ js.Array[T]) => onDelete(t0).runNow()))
    if (onDropdownClose != null) __obj.updateDynamic("onDropdownClose")(js.Any.fromFunction1((t0: /* dropdown */ typingsJapgolly.selectize.JQuery) => onDropdownClose(t0).runNow()))
    if (onDropdownOpen != null) __obj.updateDynamic("onDropdownOpen")(js.Any.fromFunction1((t0: /* dropdown */ typingsJapgolly.selectize.JQuery) => onDropdownOpen(t0).runNow()))
    onFocus.foreach(p => __obj.updateDynamic("onFocus")(p.toJsFn))
    onInitialize.foreach(p => __obj.updateDynamic("onInitialize")(p.toJsFn))
    if (onItemAdd != null) __obj.updateDynamic("onItemAdd")(js.Any.fromFunction2((t0: /* value */ T, t1: /* item */ typingsJapgolly.selectize.JQuery) => onItemAdd(t0, t1).runNow()))
    if (onItemRemove != null) __obj.updateDynamic("onItemRemove")(js.Any.fromFunction1((t0: /* value */ T) => onItemRemove(t0).runNow()))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1((t0: /* data */ js.Array[U]) => onLoad(t0).runNow()))
    if (onOptionAdd != null) __obj.updateDynamic("onOptionAdd")(js.Any.fromFunction2((t0: /* value */ T, t1: /* data */ U) => onOptionAdd(t0, t1).runNow()))
    if (onOptionRemove != null) __obj.updateDynamic("onOptionRemove")(js.Any.fromFunction1((t0: /* value */ T) => onOptionRemove(t0).runNow()))
    if (onType != null) __obj.updateDynamic("onType")(js.Any.fromFunction1((t0: /* srt */ java.lang.String) => onType(t0).runNow()))
    if (!js.isUndefined(openOnFocus)) __obj.updateDynamic("openOnFocus")(openOnFocus.asInstanceOf[js.Any])
    if (optgroupField != null) __obj.updateDynamic("optgroupField")(optgroupField.asInstanceOf[js.Any])
    if (optgroupLabelField != null) __obj.updateDynamic("optgroupLabelField")(optgroupLabelField.asInstanceOf[js.Any])
    if (optgroupOrder != null) __obj.updateDynamic("optgroupOrder")(optgroupOrder.asInstanceOf[js.Any])
    if (optgroupValueField != null) __obj.updateDynamic("optgroupValueField")(optgroupValueField.asInstanceOf[js.Any])
    if (optgroups != null) __obj.updateDynamic("optgroups")(optgroups.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (!js.isUndefined(persist)) __obj.updateDynamic("persist")(persist.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (preload != null) __obj.updateDynamic("preload")(preload.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(render.asInstanceOf[js.Any])
    if (score != null) __obj.updateDynamic("score")(js.Any.fromFunction1((t0: /* search */ typingsJapgolly.selectize.Selectize.ISearch) => score(t0).runNow()))
    if (scrollDuration != null) __obj.updateDynamic("scrollDuration")(scrollDuration.asInstanceOf[js.Any])
    if (searchConjunction != null) __obj.updateDynamic("searchConjunction")(searchConjunction.asInstanceOf[js.Any])
    if (searchField != null) __obj.updateDynamic("searchField")(searchField.asInstanceOf[js.Any])
    if (!js.isUndefined(selectOnTab)) __obj.updateDynamic("selectOnTab")(selectOnTab.asInstanceOf[js.Any])
    if (sortField != null) __obj.updateDynamic("sortField")(sortField.asInstanceOf[js.Any])
    if (valueField != null) __obj.updateDynamic("valueField")(valueField.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions[T, U]]
  }
}

