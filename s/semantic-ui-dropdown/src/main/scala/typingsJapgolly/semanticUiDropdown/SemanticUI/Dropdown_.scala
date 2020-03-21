package typingsJapgolly.semanticUiDropdown.SemanticUI

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
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.`bind intent`
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.`bind mouse events`
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.`bind touch events`
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.`determine intent`
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.`determine select action`
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.`get default text`
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.`get item`
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.`get placeholder text`
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.`get text`
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.`get value`
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.`hide others`
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.`is animated`
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.`is hidden`
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.`is selection`
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.`is visible`
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.`match`
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.`remove active`
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.`remove selected`
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.`remove visible`
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.`restore default text`
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.`restore default value`
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.`restore defaults`
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.`restore placeholder text`
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.`save defaults`
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.`set active`
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.`set exactly`
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.`set selected`
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.`set text`
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.`set value`
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.`set visible`
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.`setup menu`
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.`unbind intent`
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.action
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.activate
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.allowAdditions
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.allowCategorySelection
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.allowReselection
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.allowTab
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.apiSettings
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.auto
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.both
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.className
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.clear
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.combo
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.context
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.debug
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.delay
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.destroy
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.direction
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.downward
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.duration
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.error
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.exact
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.fields
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.filterRemoteData
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.forceSelection
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.fullTextSearch
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.glyphWidth
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.hide
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.hideAdditions
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.keepOnScreen
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.keys
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.label
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.maxSelections
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.message
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.metadata
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.minCharacters
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.name
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.namespace
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.nothing
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.on
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.onAdd
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.onChange
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.onHide
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.onLabelCreate
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.onLabelRemove
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.onLabelSelect
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.onNoResults
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.onRemove
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.onShow
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.performance
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.placeholder
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.preserveHTML
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.refresh
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.regExp
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.saveRemoteData
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.select
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.selectOnKeydown
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.selector
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.setting
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.show
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.showOnFocus
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.silent
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.sortSelect
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.text
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.toggle
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.transition
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.upward
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.useLabels
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.value
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.values
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.verbose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// TODO: Should 'value'/'values' parameters be of type 'string' instead of 'any'?
@js.native
trait Dropdown_ extends js.Object {
  var settings: DropdownSettings = js.native
  def apply(): JQuery = js.native
  /**
    * Binds a click to document to determine if you click away from a dropdown
    */
  def apply(behavior: `bind intent`): JQuery = js.native
  /**
    * Adds mouse events to element
    */
  def apply(behavior: `bind mouse events`): JQuery = js.native
  /**
    * Adds touch events to element
    */
  def apply(behavior: `bind touch events`): JQuery = js.native
  /**
    * Returns whether event occurred inside dropdown
    */
  def apply(behavior: `determine intent`): Boolean = js.native
  /**
    * Triggers preset item selection action based on settings passing text/value
    */
  def apply(behavior: `determine select action`, text: String, value: js.Any): JQuery = js.native
  /**
    * Returns dropdown value as set on page load
    */
  def apply(behavior: `get default text`): String = js.native
  /**
    * Returns DOM element that matches a given input value
    */
  def apply(behavior: `get item`, value: js.Any): JQuery = js.native
  /**
    * Returns placeholder text
    */
  def apply(behavior: `get placeholder text`): String = js.native
  /**
    * Returns current dropdown text
    */
  def apply(behavior: `get text`): String = js.native
  /**
    * Returns current dropdown input value
    */
  def apply(behavior: `get value`): js.Any = js.native
  /**
    * Hides all other dropdowns that is not current dropdown
    */
  def apply(behavior: `hide others`): JQuery = js.native
  /**
    * Returns whether dropdown is animated
    */
  def apply(behavior: `is animated`): Boolean = js.native
  /**
    * Returns whether dropdown is hidden
    */
  def apply(behavior: `is hidden`): Boolean = js.native
  /**
    * Returns whether dropdown is a selection dropdown
    */
  def apply(behavior: `is selection`): Boolean = js.native
  /**
    * Returns whether dropdown is visible
    */
  def apply(behavior: `is visible`): Boolean = js.native
  /**
    * Removes dropdown active state
    */
  def apply(behavior: `remove active`): JQuery = js.native
  /**
    * Remove value from selected
    */
  def apply(behavior: `remove selected`, value: js.Any): JQuery = js.native
  /**
    * Removes dropdown visible state
    */
  def apply(behavior: `remove visible`): JQuery = js.native
  /**
    * Restores dropdown text to its value on page load
    */
  def apply(behavior: `restore default text`): JQuery = js.native
  /**
    * Restores dropdown value to its value on page load
    */
  def apply(behavior: `restore default value`): JQuery = js.native
  /**
    * Restores dropdown text and value to its value on page load
    */
  def apply(behavior: `restore defaults`): JQuery = js.native
  /**
    * Restores dropdown text to its prompt, placeholder text
    */
  def apply(behavior: `restore placeholder text`): JQuery = js.native
  /**
    * Saves current text and value as new defaults (for use with restore)
    */
  def apply(behavior: `save defaults`): JQuery = js.native
  /**
    * Sets dropdown to active state
    */
  def apply(behavior: `set active`): JQuery = js.native
  /**
    * Sets selected values to exactly specified values, removing current selection
    */
  def apply(behavior: `set exactly`, values: js.Array[_]): JQuery = js.native
  /**
    * Sets value as selected
    */
  def apply(behavior: `set selected`, value: js.Any): JQuery = js.native
  /**
    * Adds a group of values as selected
    */
  def apply(behavior: `set selected`, values: js.Array[_]): JQuery = js.native
  /**
    * Sets dropdown text to a value
    */
  def apply(behavior: `set text`, text: String): JQuery = js.native
  /**
    * Sets dropdown input to value (does not update display state)
    */
  def apply(behavior: `set value`, value: js.Any): JQuery = js.native
  /**
    * Sets dropdown to visible state
    */
  def apply(behavior: `set visible`): JQuery = js.native
  /**
    * Recreates dropdown menu from select option values.
    */
  def apply(behavior: `setup menu`): JQuery = js.native
  /**
    * Unbinds document intent click
    */
  def apply(behavior: `unbind intent`): JQuery = js.native
  /**
    * Clears dropdown of selection
    */
  def apply(behavior: clear): JQuery = js.native
  def apply(behavior: destroy): JQuery = js.native
  /**
    * Hides dropdown
    */
  def apply(behavior: hide): JQuery = js.native
  /**
    * Refreshes all cached selectors and data
    */
  def apply(behavior: refresh): JQuery = js.native
  def apply(behavior: setting, name: `match`): both | value | text = js.native
  def apply(behavior: setting, name: `match`, value: both): JQuery = js.native
  def apply(behavior: setting, name: `match`, value: text): JQuery = js.native
  def apply(behavior: setting, name: `match`, value: value): JQuery = js.native
  def apply(behavior: setting, name: action): activate | select | combo | nothing | hide | (js.ThisFunction3[
    /* this */ JQuery, 
    /* text */ String, 
    /* value */ String | `false`, 
    /* element */ JQuery, 
    Unit
  ]) = js.native
  def apply(
    behavior: setting,
    name: action,
    value: js.ThisFunction3[
      /* this */ JQuery, 
      /* text */ String, 
      /* value */ String | `false`, 
      /* element */ JQuery, 
      Unit
    ]
  ): JQuery = js.native
  def apply(behavior: setting, name: action, value: activate): JQuery = js.native
  def apply(behavior: setting, name: action, value: combo): JQuery = js.native
  def apply(behavior: setting, name: action, value: hide): JQuery = js.native
  def apply(behavior: setting, name: action, value: nothing): JQuery = js.native
  def apply(behavior: setting, name: action, value: select): JQuery = js.native
  def apply(behavior: setting, name: allowAdditions): Boolean = js.native
  def apply(behavior: setting, name: allowAdditions, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: allowCategorySelection): Boolean = js.native
  def apply(behavior: setting, name: allowCategorySelection, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: allowReselection): Boolean = js.native
  def apply(behavior: setting, name: allowReselection, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: allowTab): Boolean = js.native
  def apply(behavior: setting, name: allowTab, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: apiSettings): `false` | ApiSettings = js.native
  def apply(behavior: setting, name: apiSettings, value: ApiSettings): JQuery = js.native
  def apply(behavior: setting, name: apiSettings, value: `false`): JQuery = js.native
  def apply(behavior: setting, name: className): ClassNameSettings = js.native
  def apply(behavior: setting, name: className, value: ClassNameSettings): JQuery = js.native
  def apply(behavior: setting, name: context): String | JQuery = js.native
  def apply(behavior: setting, name: context, value: String): JQuery = js.native
  def apply(behavior: setting, name: context, value: JQuery): JQuery = js.native
  def apply(behavior: setting, name: debug): Boolean = js.native
  def apply(behavior: setting, name: debug, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: delay): DelaySettings = js.native
  def apply(behavior: setting, name: delay, value: DelaySettings): JQuery = js.native
  def apply(behavior: setting, name: direction): auto | upward | downward = js.native
  def apply(behavior: setting, name: direction, value: auto): JQuery = js.native
  def apply(behavior: setting, name: direction, value: downward): JQuery = js.native
  def apply(behavior: setting, name: direction, value: upward): JQuery = js.native
  def apply(behavior: setting, name: duration): Double = js.native
  def apply(behavior: setting, name: duration, value: Double): JQuery = js.native
  def apply(behavior: setting, name: error): ErrorSettings = js.native
  def apply(behavior: setting, name: error, value: ErrorSettings): JQuery = js.native
  def apply(behavior: setting, name: fields): FieldsSettings = js.native
  def apply(behavior: setting, name: fields, value: FieldsSettings): JQuery = js.native
  def apply(behavior: setting, name: filterRemoteData): Boolean = js.native
  def apply(behavior: setting, name: filterRemoteData, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: forceSelection): Boolean = js.native
  def apply(behavior: setting, name: forceSelection, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: fullTextSearch): Boolean | exact = js.native
  def apply(behavior: setting, name: fullTextSearch, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: fullTextSearch, value: exact): JQuery = js.native
  def apply(behavior: setting, name: glyphWidth): Double = js.native
  def apply(behavior: setting, name: glyphWidth, value: Double): JQuery = js.native
  def apply(behavior: setting, name: hideAdditions): Boolean = js.native
  def apply(behavior: setting, name: hideAdditions, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: keepOnScreen): Boolean = js.native
  def apply(behavior: setting, name: keepOnScreen, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: keys): KeySettings = js.native
  def apply(behavior: setting, name: keys, value: KeySettings): JQuery = js.native
  def apply(behavior: setting, name: label): LabelSettings = js.native
  def apply(behavior: setting, name: label, value: LabelSettings): JQuery = js.native
  def apply(behavior: setting, name: maxSelections): `false` | Double = js.native
  def apply(behavior: setting, name: maxSelections, value: Double): JQuery = js.native
  def apply(behavior: setting, name: maxSelections, value: `false`): JQuery = js.native
  def apply(behavior: setting, name: message): MessageSettings = js.native
  def apply(behavior: setting, name: message, value: MessageSettings): JQuery = js.native
  def apply(behavior: setting, name: metadata): MetadataSettings = js.native
  def apply(behavior: setting, name: metadata, value: MetadataSettings): JQuery = js.native
  def apply(behavior: setting, name: minCharacters): Double = js.native
  def apply(behavior: setting, name: minCharacters, value: Double): JQuery = js.native
  def apply(behavior: setting, name: name): String = js.native
  def apply(behavior: setting, name: namespace): String = js.native
  def apply(behavior: setting, name: namespace, value: String): JQuery = js.native
  def apply(behavior: setting, name: name, value: String): JQuery = js.native
  def apply(behavior: setting, name: on): String = js.native
  def apply(behavior: setting, name: onAdd): js.ThisFunction3[
    /* this */ JQuery, 
    /* addedValue */ js.Any, 
    /* addedText */ String, 
    /* $addedChoice */ JQuery, 
    Unit
  ] = js.native
  def apply(
    behavior: setting,
    name: onAdd,
    value: js.ThisFunction3[
      /* this */ JQuery, 
      /* addedValue */ js.Any, 
      /* addedText */ String, 
      /* $addedChoice */ JQuery, 
      Unit
    ]
  ): JQuery = js.native
  def apply(behavior: setting, name: onChange): js.ThisFunction3[/* this */ JQuery, /* value */ js.Any, /* text */ String, /* $choice */ JQuery, Unit] = js.native
  def apply(
    behavior: setting,
    name: onChange,
    value: js.ThisFunction3[/* this */ JQuery, /* value */ js.Any, /* text */ String, /* $choice */ JQuery, Unit]
  ): JQuery = js.native
  def apply(behavior: setting, name: onHide): js.ThisFunction0[/* this */ JQuery, `false` | Unit] = js.native
  def apply(behavior: setting, name: onHide, value: js.ThisFunction0[/* this */ JQuery, `false` | Unit]): JQuery = js.native
  def apply(behavior: setting, name: onLabelCreate): js.ThisFunction2[/* this */ JQuery, /* value */ js.Any, /* text */ String, JQuery] = js.native
  def apply(
    behavior: setting,
    name: onLabelCreate,
    value: js.ThisFunction2[/* this */ JQuery, /* value */ js.Any, /* text */ String, JQuery]
  ): JQuery = js.native
  def apply(behavior: setting, name: onLabelRemove): js.ThisFunction1[/* this */ JQuery, /* value */ js.Any, `false` | Unit] = js.native
  def apply(
    behavior: setting,
    name: onLabelRemove,
    value: js.ThisFunction1[/* this */ JQuery, /* value */ js.Any, `false` | Unit]
  ): JQuery = js.native
  def apply(behavior: setting, name: onLabelSelect): js.ThisFunction1[/* this */ JQuery, /* $selectedLabels */ JQuery, Unit] = js.native
  def apply(
    behavior: setting,
    name: onLabelSelect,
    value: js.ThisFunction1[/* this */ JQuery, /* $selectedLabels */ JQuery, Unit]
  ): JQuery = js.native
  def apply(behavior: setting, name: onNoResults): js.ThisFunction1[/* this */ JQuery, /* searchValue */ js.Any, Unit] = js.native
  def apply(
    behavior: setting,
    name: onNoResults,
    value: js.ThisFunction1[/* this */ JQuery, /* searchValue */ js.Any, Unit]
  ): JQuery = js.native
  def apply(behavior: setting, name: onRemove): js.ThisFunction3[
    /* this */ JQuery, 
    /* removedValue */ js.Any, 
    /* removedText */ String, 
    /* $removedChoice */ JQuery, 
    Unit
  ] = js.native
  def apply(
    behavior: setting,
    name: onRemove,
    value: js.ThisFunction3[
      /* this */ JQuery, 
      /* removedValue */ js.Any, 
      /* removedText */ String, 
      /* $removedChoice */ JQuery, 
      Unit
    ]
  ): JQuery = js.native
  def apply(behavior: setting, name: onShow): js.ThisFunction0[/* this */ JQuery, `false` | Unit] = js.native
  def apply(behavior: setting, name: onShow, value: js.ThisFunction0[/* this */ JQuery, `false` | Unit]): JQuery = js.native
  def apply(behavior: setting, name: on, value: String): JQuery = js.native
  def apply(behavior: setting, name: performance): Boolean = js.native
  def apply(behavior: setting, name: performance, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: placeholder): auto | value | `false` = js.native
  def apply(behavior: setting, name: placeholder, value: `false`): JQuery = js.native
  def apply(behavior: setting, name: placeholder, value: auto): JQuery = js.native
  def apply(behavior: setting, name: placeholder, value: value): JQuery = js.native
  def apply(behavior: setting, name: preserveHTML): Boolean = js.native
  def apply(behavior: setting, name: preserveHTML, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: regExp): RegExpSettings = js.native
  def apply(behavior: setting, name: regExp, value: RegExpSettings): JQuery = js.native
  def apply(behavior: setting, name: saveRemoteData): Boolean = js.native
  def apply(behavior: setting, name: saveRemoteData, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: selectOnKeydown): Boolean = js.native
  def apply(behavior: setting, name: selectOnKeydown, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: selector): SelectorSettings = js.native
  def apply(behavior: setting, name: selector, value: SelectorSettings): JQuery = js.native
  def apply(behavior: setting, name: showOnFocus): Boolean = js.native
  def apply(behavior: setting, name: showOnFocus, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: silent): Boolean = js.native
  def apply(behavior: setting, name: silent, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: sortSelect): Boolean = js.native
  def apply(behavior: setting, name: sortSelect, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: transition): auto | String = js.native
  def apply(behavior: setting, name: transition, value: String): JQuery = js.native
  def apply(behavior: setting, name: transition, value: auto): JQuery = js.native
  def apply(behavior: setting, name: useLabels): Boolean = js.native
  def apply(behavior: setting, name: useLabels, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: values): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl['values'] */ js.Any = js.native
  def apply(
    behavior: setting,
    name: values,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl['values'] */ js.Any
  ): JQuery = js.native
  def apply(behavior: setting, name: verbose): Boolean = js.native
  def apply(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
  def apply(behavior: setting, value: DropdownSettings): JQuery = js.native
  /**
    * Shows dropdown
    */
  def apply(behavior: show): JQuery = js.native
  /**
    * Toggles current visibility of dropdown
    */
  def apply(behavior: toggle): JQuery = js.native
  def apply(settings: DropdownSettings): JQuery = js.native
}

