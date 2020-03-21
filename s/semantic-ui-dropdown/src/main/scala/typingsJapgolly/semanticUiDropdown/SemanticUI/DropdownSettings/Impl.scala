package typingsJapgolly.semanticUiDropdown.SemanticUI.DropdownSettings

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.semanticUiApi.SemanticUI.ApiSettings
import typingsJapgolly.semanticUiDropdown.JQuery
import typingsJapgolly.semanticUiDropdown.SemanticUI.Dropdown.ClassNameSettings
import typingsJapgolly.semanticUiDropdown.SemanticUI.Dropdown.DelaySettings
import typingsJapgolly.semanticUiDropdown.SemanticUI.Dropdown.ErrorSettings
import typingsJapgolly.semanticUiDropdown.SemanticUI.Dropdown.FieldsSettings
import typingsJapgolly.semanticUiDropdown.SemanticUI.Dropdown.KeySettings
import typingsJapgolly.semanticUiDropdown.SemanticUI.Dropdown.LabelSettings
import typingsJapgolly.semanticUiDropdown.SemanticUI.Dropdown.MessageSettings
import typingsJapgolly.semanticUiDropdown.SemanticUI.Dropdown.MetadataSettings
import typingsJapgolly.semanticUiDropdown.SemanticUI.Dropdown.RegExpSettings
import typingsJapgolly.semanticUiDropdown.SemanticUI.Dropdown.SelectorSettings
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownBooleans.`false`
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.activate
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.auto
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.both
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.combo
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.downward
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.exact
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.hide
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.nothing
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.select
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.text
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.upward
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
  /**
    * Sets a default action to occur. (See usage guide)
    *
    * @default 'activate'
    * @see {@link http://semantic-ui.com/modules/dropdown.html#/usage}
    */
  var action: activate | select | combo | nothing | hide | (js.ThisFunction3[
    /* this */ JQuery, 
    /* text */ String, 
    /* value */ String | `false`, 
    /* element */ JQuery, 
    Unit
  ])
  /**
    * Whether search selection should allow users to add their own selections, works for single or multi-select.
    *
    * @default false
    */
  var allowAdditions: Boolean
  /**
    * Whether menu items with sub-menus (categories) should be selectable
    *
    * @default false
    */
  var allowCategorySelection: Boolean
  /**
    * When set to true will fire onChange even when the value a user select matches the currently selected value.
    *
    * @default false
    */
  var allowReselection: Boolean
  /**
    * Whether to allow the element to be navigable by keyboard, by automatically creating a tabindex
    *
    * @default true
    */
  var allowTab: Boolean
  // endregion
  // region Remote Settings
  /**
    * Can be set to an object to specify API settings for retrieving remote selection menu content from an API endpoint
    *
    * @default false
    * @see {@link http://semantic-ui.com/behaviors/api.html}
    */
  var apiSettings: `false` | ApiSettings
  var className: ClassNameSettings
  /**
    * Element context to use when checking whether can show when keepOnScreen: true
    *
    * @default 'window'
    */
  var context: String | JQuery
  /**
    * Debug output to console
    */
  var debug: Boolean
  /**
    * Time in milliseconds to debounce show or hide behavior when on: hover is used, or when touch is used.
    */
  var delay: DelaySettings
  // endregion
  // region Additional Settings
  /**
    * When set to auto determines direction based on whether dropdown can fit on screen. Set to upward or downward to always force a direction.
    *
    * @default 'auto'
    */
  var direction: auto | upward | downward
  /**
    * Duration of animation events
    *
    * @default 200
    */
  var duration: Double
  // endregion
  // region Debug Settings
  var error: ErrorSettings
  /**
    * List mapping dropdown content to JSON Property when using API
    */
  var fields: FieldsSettings
  /**
    * When set to true API will be expected to return the complete result set, which will then be filtered clientside to only display matching results.
    *
    * @default false
    * @since 2.2.8
    */
  var filterRemoteData: Boolean
  /**
    * Whether search selection will force currently selected choice when element is blurred.
    *
    * @default true
    */
  var forceSelection: Boolean
  /**
    * Specifying to "true" will use a fuzzy full text search, setting to "exact" will force the exact search to be matched somewhere in the string
    *
    * @default false
    */
  var fullTextSearch: Boolean | exact
  /**
    * Maximum glyph width, used to calculate search size. This is usually size of a "W" in your font in em
    *
    * @default 1.0714
    */
  var glyphWidth: Double
  /**
    * When disabled user additions will appear in the results menu using a specially formatted selection item formatted by templates.addition.
    *
    * @default true
    */
  var hideAdditions: Boolean
  /**
    * Whether dropdown should try to keep itself on screen by checking whether menus display position in its context (Default context is page).
    *
    * @default true
    */
  var keepOnScreen: Boolean
  /**
    * The keycode used to represent keyboard shortcuts. To avoid issues with some foreign languages, you can pass false for comma delimiter's value
    */
  var keys: KeySettings
  /**
    * Allows customization of multi-select labels
    */
  var label: LabelSettings
  /**
    * When using search selection specifies how to match values.
    *
    * @default 'both'
    */
  var `match`: both | value | text
  /**
    * When set to a number, sets the maximum number of selections
    *
    * @default false
    */
  var maxSelections: `false` | Double
  // endregion
  // region DOM Settings
  /**
    * You can specify site wide messages by modifying $.fn.dropdown.settings.message that will apply on any dropdown if it appears in the page.
    */
  var message: MessageSettings
  var metadata: MetadataSettings
  /**
    * The minimum characters for a search to begin showing results
    *
    * @default 1
    */
  var minCharacters: Double
  // endregion
  // region Debug Settings
  /**
    * Name used in log statements
    */
  var name: String
  // endregion
  // region Component Settings
  // region DOM Settings
  /**
    * Event namespace. Makes sure module teardown does not effect other events attached to an element.
    */
  var namespace: String
  // region Frequently Used Settings
  /**
    * Event used to trigger dropdown (Hover, Click, Custom Event)
    *
    * @default 'click'
    */
  var on: String
  /**
    * Show console.table output with performance metrics
    */
  var performance: Boolean
  /**
    * @default 'auto'
    */
  var placeholder: auto | value | `false`
  /**
    * Whether HTML included in dropdown values should be preserved. (Allows icons to show up in selected value)
    *
    * @default true
    */
  var preserveHTML: Boolean
  var regExp: RegExpSettings
  /**
    * When enabled will automatically store selected name/value pairs in sessionStorage to preserve user selection on page refresh. Disabling will clear remote dropdown values on refresh.
    *
    * @default true
    */
  var saveRemoteData: Boolean
  /**
    * Whether dropdown should select new option when using keyboard shortcuts. Setting to false will require enter or left click to confirm a choice.
    *
    * @default true
    */
  var selectOnKeydown: Boolean
  var selector: SelectorSettings
  /**
    * Whether to show dropdown menu automatically on element focus.
    *
    * @default true
    */
  var showOnFocus: Boolean
  /**
    * Silences all console output including error messages, regardless of other debug settings.
    */
  var silent: Boolean
  /**
    * Whether to sort values when creating a dropdown automatically from a select element.
    *
    * @default false
    */
  var sortSelect: Boolean
  /**
    * Named transition to use when animating menu in and out.
    * Defaults to slide down or slide up depending on dropdown direction.
    * Fade and slide down are available without including ui transitions
    *
    * @default 'auto'
    * @see {@link http://semantic-ui.com/modules/transition.html}
    */
  var transition: auto | String
  // endregion
  // region Multiple Select Settings
  /**
    * Whether multiselect should use labels. Must be set to true when allowAdditions is true
    *
    * @default true
    */
  var useLabels: Boolean
  /**
    * When specified allows you to initialize dropdown with specific values. See usage guide for details.
    *
    * @default false
    */
  var values: js.Any
  /**
    * Debug output includes all internal behaviors
    */
  var verbose: Boolean
  /**
    * Is called after a dropdown selection is added using a multiple select dropdown, only receives the added value
    */
  def onAdd(addedValue: js.Any, addedText: String, $addedChoice: JQuery): Unit
  // endregion
  // region Callbacks
  /**
    * Is called after a dropdown value changes. Receives the name and value of selection and the active menu element
    */
  def onChange(value: js.Any, text: String, $choice: JQuery): Unit
  /**
    * Is called before a dropdown is hidden. If false is returned, dropdown will not be hidden.
    */
  def onHide(): `false` | Unit
  /**
    * Allows you to modify a label before it is added. Expects the jQ DOM element for a label to be returned.
    */
  def onLabelCreate(value: js.Any, text: String): JQuery
  /**
    * Called when a label is remove, return false; will prevent the label from being removed.
    */
  def onLabelRemove(value: js.Any): `false` | Unit
  /**
    * Is called after a label is selected by a user
    */
  def onLabelSelect($selectedLabels: JQuery): Unit
  /**
    * Is called after a dropdown is searched with no matching values
    */
  def onNoResults(searchValue: js.Any): Unit
  /**
    * Is called after a dropdown selection is removed using a multiple select dropdown, only receives the removed value
    */
  def onRemove(removedValue: js.Any, removedText: String, $removedChoice: JQuery): Unit
  /**
    * Is called before a dropdown is shown. If false is returned, dropdown will not be shown.
    */
  def onShow(): `false` | Unit
}

object Impl {
  @scala.inline
  def apply(
    action: activate | select | combo | nothing | hide | (js.ThisFunction3[
      /* this */ JQuery, 
      /* text */ String, 
      /* value */ String | `false`, 
      /* element */ JQuery, 
      Unit
    ]),
    allowAdditions: Boolean,
    allowCategorySelection: Boolean,
    allowReselection: Boolean,
    allowTab: Boolean,
    apiSettings: `false` | ApiSettings,
    className: ClassNameSettings,
    context: String | JQuery,
    debug: Boolean,
    delay: DelaySettings,
    direction: auto | upward | downward,
    duration: Double,
    error: ErrorSettings,
    fields: FieldsSettings,
    filterRemoteData: Boolean,
    forceSelection: Boolean,
    fullTextSearch: Boolean | exact,
    glyphWidth: Double,
    hideAdditions: Boolean,
    keepOnScreen: Boolean,
    keys: KeySettings,
    label: LabelSettings,
    `match`: both | value | text,
    maxSelections: `false` | Double,
    message: MessageSettings,
    metadata: MetadataSettings,
    minCharacters: Double,
    name: String,
    namespace: String,
    on: String,
    onAdd: (js.Any, String, JQuery) => Callback,
    onChange: (js.Any, String, JQuery) => Callback,
    onHide: CallbackTo[`false` | Unit],
    onLabelCreate: (js.Any, String) => CallbackTo[JQuery],
    onLabelRemove: js.Any => CallbackTo[`false` | Unit],
    onLabelSelect: JQuery => Callback,
    onNoResults: js.Any => Callback,
    onRemove: (js.Any, String, JQuery) => Callback,
    onShow: CallbackTo[`false` | Unit],
    performance: Boolean,
    placeholder: auto | value | `false`,
    preserveHTML: Boolean,
    regExp: RegExpSettings,
    saveRemoteData: Boolean,
    selectOnKeydown: Boolean,
    selector: SelectorSettings,
    showOnFocus: Boolean,
    silent: Boolean,
    sortSelect: Boolean,
    transition: auto | String,
    useLabels: Boolean,
    values: js.Any,
    verbose: Boolean
  ): Impl = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], allowAdditions = allowAdditions.asInstanceOf[js.Any], allowCategorySelection = allowCategorySelection.asInstanceOf[js.Any], allowReselection = allowReselection.asInstanceOf[js.Any], allowTab = allowTab.asInstanceOf[js.Any], apiSettings = apiSettings.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], filterRemoteData = filterRemoteData.asInstanceOf[js.Any], forceSelection = forceSelection.asInstanceOf[js.Any], fullTextSearch = fullTextSearch.asInstanceOf[js.Any], glyphWidth = glyphWidth.asInstanceOf[js.Any], hideAdditions = hideAdditions.asInstanceOf[js.Any], keepOnScreen = keepOnScreen.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], maxSelections = maxSelections.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], minCharacters = minCharacters.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any], performance = performance.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], preserveHTML = preserveHTML.asInstanceOf[js.Any], regExp = regExp.asInstanceOf[js.Any], saveRemoteData = saveRemoteData.asInstanceOf[js.Any], selectOnKeydown = selectOnKeydown.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], showOnFocus = showOnFocus.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], sortSelect = sortSelect.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], useLabels = useLabels.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.updateDynamic("onAdd")(js.Any.fromFunction3((t0: js.Any, t1: java.lang.String, t2: typingsJapgolly.semanticUiDropdown.JQuery) => onAdd(t0, t1, t2).runNow()))
    __obj.updateDynamic("onChange")(js.Any.fromFunction3((t0: js.Any, t1: java.lang.String, t2: typingsJapgolly.semanticUiDropdown.JQuery) => onChange(t0, t1, t2).runNow()))
    __obj.updateDynamic("onHide")(onHide.toJsFn)
    __obj.updateDynamic("onLabelCreate")(js.Any.fromFunction2((t0: js.Any, t1: java.lang.String) => onLabelCreate(t0, t1).runNow()))
    __obj.updateDynamic("onLabelRemove")(js.Any.fromFunction1((t0: js.Any) => onLabelRemove(t0).runNow()))
    __obj.updateDynamic("onLabelSelect")(js.Any.fromFunction1((t0: typingsJapgolly.semanticUiDropdown.JQuery) => onLabelSelect(t0).runNow()))
    __obj.updateDynamic("onNoResults")(js.Any.fromFunction1((t0: js.Any) => onNoResults(t0).runNow()))
    __obj.updateDynamic("onRemove")(js.Any.fromFunction3((t0: js.Any, t1: java.lang.String, t2: typingsJapgolly.semanticUiDropdown.JQuery) => onRemove(t0, t1, t2).runNow()))
    __obj.updateDynamic("onShow")(onShow.toJsFn)
    __obj.asInstanceOf[Impl]
  }
}

