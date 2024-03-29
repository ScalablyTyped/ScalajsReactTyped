package typingsJapgolly.jqueryui

import org.scalajs.dom.Element
import org.scalajs.dom.MouseEvent
import typingsJapgolly.jquery.JQueryEventObject
import typingsJapgolly.jqueryui.JQueryUI.AccordionOptions
import typingsJapgolly.jqueryui.JQueryUI.AutocompleteOptions
import typingsJapgolly.jqueryui.JQueryUI.ButtonOptions
import typingsJapgolly.jqueryui.JQueryUI.DatepickerOptions
import typingsJapgolly.jqueryui.JQueryUI.DialogOptions
import typingsJapgolly.jqueryui.JQueryUI.DraggableOptions
import typingsJapgolly.jqueryui.JQueryUI.DroppableOptions
import typingsJapgolly.jqueryui.JQueryUI.JQueryPositionOptions
import typingsJapgolly.jqueryui.JQueryUI.MenuOptions
import typingsJapgolly.jqueryui.JQueryUI.ProgressbarOptions
import typingsJapgolly.jqueryui.JQueryUI.ResizableOptions
import typingsJapgolly.jqueryui.JQueryUI.SelectMenuOptions
import typingsJapgolly.jqueryui.JQueryUI.SelectableOptions
import typingsJapgolly.jqueryui.JQueryUI.SliderOptions
import typingsJapgolly.jqueryui.JQueryUI.SortableOptions
import typingsJapgolly.jqueryui.JQueryUI.SpinnerOptions
import typingsJapgolly.jqueryui.JQueryUI.TabsOptions
import typingsJapgolly.jqueryui.JQueryUI.TooltipOptions
import typingsJapgolly.jqueryui.JQueryUI.Widget
import typingsJapgolly.jqueryui.JQueryUI.WidgetCommonProperties
import typingsJapgolly.jqueryui.JQueryUI.WidgetOptions
import typingsJapgolly.jqueryui.anon.Attribute
import typingsJapgolly.jqueryui.anon.Call
import typingsJapgolly.jqueryui.anon.Expression
import typingsJapgolly.jqueryui.jqueryuiStrings.altField
import typingsJapgolly.jqueryui.jqueryuiStrings.altFormat
import typingsJapgolly.jqueryui.jqueryuiStrings.appendText
import typingsJapgolly.jqueryui.jqueryuiStrings.autoSize
import typingsJapgolly.jqueryui.jqueryuiStrings.autohide
import typingsJapgolly.jqueryui.jqueryuiStrings.beforeShow
import typingsJapgolly.jqueryui.jqueryuiStrings.beforeShowDay
import typingsJapgolly.jqueryui.jqueryuiStrings.blur
import typingsJapgolly.jqueryui.jqueryuiStrings.buttonImage
import typingsJapgolly.jqueryui.jqueryuiStrings.buttonImageOnly
import typingsJapgolly.jqueryui.jqueryuiStrings.buttonText
import typingsJapgolly.jqueryui.jqueryuiStrings.calculateWeek
import typingsJapgolly.jqueryui.jqueryuiStrings.changeMonth
import typingsJapgolly.jqueryui.jqueryuiStrings.changeYear
import typingsJapgolly.jqueryui.jqueryuiStrings.close
import typingsJapgolly.jqueryui.jqueryuiStrings.closeText
import typingsJapgolly.jqueryui.jqueryuiStrings.collapse
import typingsJapgolly.jqueryui.jqueryuiStrings.collapseAll
import typingsJapgolly.jqueryui.jqueryuiStrings.constrainInput
import typingsJapgolly.jqueryui.jqueryuiStrings.currentText
import typingsJapgolly.jqueryui.jqueryuiStrings.dateFormat
import typingsJapgolly.jqueryui.jqueryuiStrings.dayNames
import typingsJapgolly.jqueryui.jqueryuiStrings.dayNamesMin
import typingsJapgolly.jqueryui.jqueryuiStrings.dayNamesShort
import typingsJapgolly.jqueryui.jqueryuiStrings.defaultDate
import typingsJapgolly.jqueryui.jqueryuiStrings.destroy
import typingsJapgolly.jqueryui.jqueryuiStrings.dialog
import typingsJapgolly.jqueryui.jqueryuiStrings.disable
import typingsJapgolly.jqueryui.jqueryuiStrings.duration
import typingsJapgolly.jqueryui.jqueryuiStrings.enable
import typingsJapgolly.jqueryui.jqueryuiStrings.endDate
import typingsJapgolly.jqueryui.jqueryuiStrings.firstDay
import typingsJapgolly.jqueryui.jqueryuiStrings.focus
import typingsJapgolly.jqueryui.jqueryuiStrings.getDate
import typingsJapgolly.jqueryui.jqueryuiStrings.gotoCurrent
import typingsJapgolly.jqueryui.jqueryuiStrings.hide
import typingsJapgolly.jqueryui.jqueryuiStrings.instance
import typingsJapgolly.jqueryui.jqueryuiStrings.isDisabled
import typingsJapgolly.jqueryui.jqueryuiStrings.isFirstItem
import typingsJapgolly.jqueryui.jqueryuiStrings.isLastItem
import typingsJapgolly.jqueryui.jqueryuiStrings.isOpen
import typingsJapgolly.jqueryui.jqueryuiStrings.load
import typingsJapgolly.jqueryui.jqueryuiStrings.menuWidget
import typingsJapgolly.jqueryui.jqueryuiStrings.moveToTop
import typingsJapgolly.jqueryui.jqueryuiStrings.next
import typingsJapgolly.jqueryui.jqueryuiStrings.nextPage
import typingsJapgolly.jqueryui.jqueryuiStrings.open
import typingsJapgolly.jqueryui.jqueryuiStrings.option
import typingsJapgolly.jqueryui.jqueryuiStrings.pageDown
import typingsJapgolly.jqueryui.jqueryuiStrings.pageUp
import typingsJapgolly.jqueryui.jqueryuiStrings.previous
import typingsJapgolly.jqueryui.jqueryuiStrings.previousPage
import typingsJapgolly.jqueryui.jqueryuiStrings.refresh
import typingsJapgolly.jqueryui.jqueryuiStrings.search
import typingsJapgolly.jqueryui.jqueryuiStrings.select
import typingsJapgolly.jqueryui.jqueryuiStrings.serialize
import typingsJapgolly.jqueryui.jqueryuiStrings.setDate
import typingsJapgolly.jqueryui.jqueryuiStrings.show
import typingsJapgolly.jqueryui.jqueryuiStrings.stepDown
import typingsJapgolly.jqueryui.jqueryuiStrings.stepUp
import typingsJapgolly.jqueryui.jqueryuiStrings.toArray
import typingsJapgolly.jqueryui.jqueryuiStrings.value
import typingsJapgolly.jqueryui.jqueryuiStrings.values
import typingsJapgolly.jqueryui.jqueryuiStrings.widget
import typingsJapgolly.std.ThisType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  def accordion(): JQuery = js.native
  def accordion(methodName: String): JQuery = js.native
  def accordion(optionLiteral: String, optionName: String): Any = js.native
  def accordion(optionLiteral: String, optionName: String, optionValue: Any): JQuery = js.native
  def accordion(optionLiteral: String, options: AccordionOptions): Any = js.native
  def accordion(options: AccordionOptions): JQuery = js.native
  @JSName("accordion")
  def accordion_destroy(methodName: destroy): Unit = js.native
  @JSName("accordion")
  def accordion_disable(methodName: disable): Unit = js.native
  @JSName("accordion")
  def accordion_enable(methodName: enable): Unit = js.native
  @JSName("accordion")
  def accordion_refresh(methodName: refresh): Unit = js.native
  @JSName("accordion")
  def accordion_widget(methodName: widget): JQuery = js.native
  
  def addClass(classNames: String): this.type = js.native
  def addClass(classNames: String, speed: String): this.type = js.native
  def addClass(classNames: String, speed: String, callback: js.Function): this.type = js.native
  def addClass(classNames: String, speed: String, easing: String): this.type = js.native
  def addClass(classNames: String, speed: String, easing: String, callback: js.Function): this.type = js.native
  def addClass(classNames: String, speed: String, easing: Unit, callback: js.Function): this.type = js.native
  def addClass(classNames: String, speed: Double): this.type = js.native
  def addClass(classNames: String, speed: Double, callback: js.Function): this.type = js.native
  def addClass(classNames: String, speed: Double, easing: String): this.type = js.native
  def addClass(classNames: String, speed: Double, easing: String, callback: js.Function): this.type = js.native
  def addClass(classNames: String, speed: Double, easing: Unit, callback: js.Function): this.type = js.native
  def addClass(classNames: String, speed: Unit, callback: js.Function): this.type = js.native
  def addClass(classNames: String, speed: Unit, easing: String): this.type = js.native
  def addClass(classNames: String, speed: Unit, easing: String, callback: js.Function): this.type = js.native
  def addClass(classNames: String, speed: Unit, easing: Unit, callback: js.Function): this.type = js.native
  
  def autocomplete(): JQuery = js.native
  def autocomplete(methodName: String): JQuery = js.native
  def autocomplete(optionLiteral: String, optionName: String): Any = js.native
  def autocomplete(optionLiteral: String, optionName: String, optionValue: Any): JQuery = js.native
  def autocomplete(optionLiteral: String, options: AutocompleteOptions): Any = js.native
  def autocomplete(options: AutocompleteOptions): JQuery = js.native
  @JSName("autocomplete")
  def autocomplete_close(methodName: close): Unit = js.native
  @JSName("autocomplete")
  def autocomplete_destroy(methodName: destroy): Unit = js.native
  @JSName("autocomplete")
  def autocomplete_disable(methodName: disable): Unit = js.native
  @JSName("autocomplete")
  def autocomplete_enable(methodName: enable): Unit = js.native
  @JSName("autocomplete")
  def autocomplete_search(methodName: search): Unit = js.native
  @JSName("autocomplete")
  def autocomplete_search(methodName: search, value: String): Unit = js.native
  @JSName("autocomplete")
  def autocomplete_widget(methodName: widget): JQuery = js.native
  
  def button(): JQuery = js.native
  def button(methodName: String): JQuery = js.native
  def button(optionLiteral: String, optionName: String): Any = js.native
  def button(optionLiteral: String, optionName: String, optionValue: Any): JQuery = js.native
  def button(optionLiteral: String, options: ButtonOptions): Any = js.native
  def button(options: ButtonOptions): JQuery = js.native
  @JSName("button")
  def button_destroy(methodName: destroy): Unit = js.native
  @JSName("button")
  def button_disable(methodName: disable): Unit = js.native
  @JSName("button")
  def button_enable(methodName: enable): Unit = js.native
  @JSName("button")
  def button_refresh(methodName: refresh): Unit = js.native
  @JSName("button")
  def button_widget(methodName: widget): JQuery = js.native
  
  def buttonset(): JQuery = js.native
  def buttonset(methodName: String): JQuery = js.native
  def buttonset(optionLiteral: String, optionName: String): Any = js.native
  def buttonset(optionLiteral: String, optionName: String, optionValue: Any): JQuery = js.native
  def buttonset(optionLiteral: String, options: ButtonOptions): Any = js.native
  def buttonset(options: ButtonOptions): JQuery = js.native
  @JSName("buttonset")
  def buttonset_destroy(methodName: destroy): Unit = js.native
  @JSName("buttonset")
  def buttonset_disable(methodName: disable): Unit = js.native
  @JSName("buttonset")
  def buttonset_enable(methodName: enable): Unit = js.native
  @JSName("buttonset")
  def buttonset_refresh(methodName: refresh): Unit = js.native
  @JSName("buttonset")
  def buttonset_widget(methodName: widget): JQuery = js.native
  
  /**
    * Initialize a datepicker
    */
  def datepicker(): JQuery = js.native
  // Used for getting and setting options
  def datepicker(methodName: String, otherParams: Any*): Any = js.native
  /**
    * Get the altField option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'altField'
    */
  def datepicker(methodName: option, optionName: altField): Any = js.native
  /**
    * Set the altField option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'altField'
    * @param altFieldValue An input element that is to be updated with the selected date from the datepicker. Use the altFormat option to change the format of the date within this field. Leave as blank for no alternate field.
    */
  def datepicker(methodName: option, optionName: altField, altFieldValue: String): JQuery = js.native
  /**
    * Set the altField option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'altField'
    * @param altFieldValue An input element that is to be updated with the selected date from the datepicker. Use the altFormat option to change the format of the date within this field. Leave as blank for no alternate field.
    */
  def datepicker(methodName: option, optionName: altField, altFieldValue: Element): JQuery = js.native
  /**
    * Set the altField option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'altField'
    * @param altFieldValue An input element that is to be updated with the selected date from the datepicker. Use the altFormat option to change the format of the date within this field. Leave as blank for no alternate field.
    */
  def datepicker(methodName: option, optionName: altField, altFieldValue: JQuery): JQuery = js.native
  /**
    * Get the altFormat option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'altFormat'
    */
  def datepicker(methodName: option, optionName: altFormat): String = js.native
  /**
    * Set the altFormat option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'altFormat'
    * @param altFormatValue The dateFormat to be used for the altField option. This allows one date format to be shown to the user for selection purposes, while a different format is actually sent behind the scenes. For a full list of the possible formats see the formatDate function
    */
  def datepicker(methodName: option, optionName: altFormat, altFormatValue: String): JQuery = js.native
  /**
    * Get the appendText option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'appendText'
    */
  def datepicker(methodName: option, optionName: appendText): String = js.native
  /**
    * Set the appendText option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'appendText'
    * @param appendTextValue The text to display after each date field, e.g., to show the required format.
    */
  def datepicker(methodName: option, optionName: appendText, appendTextValue: String): JQuery = js.native
  /**
    * Get the autoSize option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'autoSize'
    */
  def datepicker(methodName: option, optionName: autoSize): Boolean = js.native
  /**
    * Set the autoSize option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'autoSize'
    * @param autoSizeValue Set to true to automatically resize the input field to accommodate dates in the current dateFormat.
    */
  def datepicker(methodName: option, optionName: autoSize, autoSizeValue: Boolean): JQuery = js.native
  /**
    * Get the autohide option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'autohide'
    */
  def datepicker(methodName: option, optionName: autohide): Boolean = js.native
  /**
    * Get the beforeShow option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'beforeShow'
    */
  def datepicker(methodName: option, optionName: beforeShow): js.Function2[/* input */ Element, /* inst */ Any, DatepickerOptions] = js.native
  /**
    * Get the beforeShow option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'beforeShowDay'
    */
  def datepicker(methodName: option, optionName: beforeShowDay): js.Function1[/* date */ js.Date, js.Array[Any]] = js.native
  /**
    * Set the beforeShow option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'beforeShowDay'
    * @param beforeShowDayValue A function that takes a date as a parameter and must return an array with:
    * [0]: true/false indicating whether or not this date is selectable
    * [1]: a CSS class name to add to the date's cell or "" for the default presentation
    * [2]: an optional popup tooltip for this date
    * The function is called for each day in the datepicker before it is displayed.
    */
  def datepicker(
    methodName: option,
    optionName: beforeShowDay,
    beforeShowDayValue: js.Function1[/* date */ js.Date, js.Array[Any]]
  ): JQuery = js.native
  /**
    * Set the beforeShow option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'beforeShow'
    * @param beforeShowValue A function that takes an input field and current datepicker instance and returns an options object to update the datepicker with. It is called just before the datepicker is displayed.
    */
  def datepicker(
    methodName: option,
    optionName: beforeShow,
    beforeShowValue: js.Function2[/* input */ Element, /* inst */ Any, DatepickerOptions]
  ): JQuery = js.native
  /**
    * Get the buttonImage option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'buttonImage'
    */
  def datepicker(methodName: option, optionName: buttonImage): String = js.native
  /**
    * Get the buttonImageOnly option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'buttonImageOnly'
    */
  def datepicker(methodName: option, optionName: buttonImageOnly): Boolean = js.native
  /**
    * Set the buttonImageOnly option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'buttonImageOnly'
    * @param buttonImageOnlyValue Whether the button image should be rendered by itself instead of inside a button element. This option is only relevant if the buttonImage option has also been set.
    */
  def datepicker(methodName: option, optionName: buttonImageOnly, buttonImageOnlyValue: Boolean): JQuery = js.native
  /**
    * Set the buttonImage option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'buttonImage'
    * @param buttonImageValue A URL of an image to use to display the datepicker when the showOn option is set to "button" or "both". If set, the buttonText option becomes the alt value and is not directly displayed.
    */
  def datepicker(methodName: option, optionName: buttonImage, buttonImageValue: String): JQuery = js.native
  /**
    * Get the buttonText option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'buttonText'
    */
  def datepicker(methodName: option, optionName: buttonText): String = js.native
  /**
    * Set the buttonText option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'buttonText'
    * @param buttonTextValue The text to display on the trigger button. Use in conjunction with the showOn option set to "button" or "both".
    */
  def datepicker(methodName: option, optionName: buttonText, buttonTextValue: String): JQuery = js.native
  /**
    * Get the calculateWeek option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'calculateWeek'
    */
  def datepicker(methodName: option, optionName: calculateWeek): js.Function1[/* date */ js.Date, String] = js.native
  /**
    * Set the calculateWeek option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'calculateWeek'
    * @param calculateWeekValue A function to calculate the week of the year for a given date. The default implementation uses the ISO 8601 definition: weeks start on a Monday; the first week of the year contains the first Thursday of the year.
    */
  def datepicker(
    methodName: option,
    optionName: calculateWeek,
    calculateWeekValue: js.Function1[/* date */ js.Date, String]
  ): JQuery = js.native
  /**
    * Get the changeMonth option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'changeMonth'
    */
  def datepicker(methodName: option, optionName: changeMonth): Boolean = js.native
  /**
    * Set the changeMonth option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'changeMonth'
    * @param changeMonthValue Whether the month should be rendered as a dropdown instead of text.
    */
  def datepicker(methodName: option, optionName: changeMonth, changeMonthValue: Boolean): JQuery = js.native
  /**
    * Get the changeYear option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'changeYear'
    */
  def datepicker(methodName: option, optionName: changeYear): Boolean = js.native
  /**
    * Set the changeYear option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'changeYear'
    * @param changeYearValue Whether the year should be rendered as a dropdown instead of text. Use the yearRange option to control which years are made available for selection.
    */
  def datepicker(methodName: option, optionName: changeYear, changeYearValue: Boolean): JQuery = js.native
  /**
    * Get the closeText option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'closeText'
    */
  def datepicker(methodName: option, optionName: closeText): String = js.native
  /**
    * Set the closeText option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'closeText'
    * @param closeTextValue The text to display for the close link. Use the showButtonPanel option to display this button.
    */
  def datepicker(methodName: option, optionName: closeText, closeTextValue: String): JQuery = js.native
  /**
    * Get the constrainInput option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'constrainInput'
    */
  def datepicker(methodName: option, optionName: constrainInput): Boolean = js.native
  /**
    * Set the constrainInput option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'constrainInput'
    * @param constrainInputValue When true, entry in the input field is constrained to those characters allowed by the current dateFormat option.
    */
  def datepicker(methodName: option, optionName: constrainInput, constrainInputValue: Boolean): JQuery = js.native
  /**
    * Get the currentText option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'currentText'
    */
  def datepicker(methodName: option, optionName: currentText): String = js.native
  /**
    * Set the currentText option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'currentText'
    * @param currentTextValue The text to display for the current day link. Use the showButtonPanel option to display this button.
    */
  def datepicker(methodName: option, optionName: currentText, currentTextValue: String): JQuery = js.native
  /**
    * Get the dateFormat option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'dateFormat'
    */
  def datepicker(methodName: option, optionName: dateFormat): String = js.native
  /**
    * Set the dateFormat option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'dateFormat'
    * @param dateFormatValue The format for parsed and displayed dates. For a full list of the possible formats see the formatDate function.
    */
  def datepicker(methodName: option, optionName: dateFormat, dateFormatValue: String): JQuery = js.native
  /**
    * Get the dayNames option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'dayNames'
    */
  def datepicker(methodName: option, optionName: dayNames): js.Array[String] = js.native
  /**
    * Get the dayNamesMin option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'dayNamesMin'
    */
  def datepicker(methodName: option, optionName: dayNamesMin): js.Array[String] = js.native
  /**
    * Set the dayNamesMin option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'dayNamesMin'
    * @param dayNamesMinValue The list of minimised day names, starting from Sunday, for use as column headers within the datepicker.
    */
  def datepicker(methodName: option, optionName: dayNamesMin, dayNamesMinValue: js.Array[String]): JQuery = js.native
  /**
    * Get the dayNamesShort option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'dayNamesShort'
    */
  def datepicker(methodName: option, optionName: dayNamesShort): js.Array[String] = js.native
  /**
    * Set the dayNamesShort option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'dayNamesShort'
    * @param dayNamesShortValue The list of abbreviated day names, starting from Sunday, for use as requested via the dateFormat option.
    */
  def datepicker(methodName: option, optionName: dayNamesShort, dayNamesShortValue: js.Array[String]): JQuery = js.native
  /**
    * Set the dayNames option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'dayNames'
    * @param dayNamesValue The list of long day names, starting from Sunday, for use as requested via the dateFormat option.
    */
  def datepicker(methodName: option, optionName: dayNames, dayNamesValue: js.Array[String]): JQuery = js.native
  /**
    * Get the defaultDate option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'defaultDate'
    */
  def datepicker(methodName: option, optionName: defaultDate): Any = js.native
  /**
    * Set the defaultDate option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'defaultDate'
    * @param defaultDateValue A string in the format defined by the dateFormat option, or a relative date. Relative dates must contain value and period pairs; valid periods are "y" for years, "m" for months, "w" for weeks, and "d" for days. For example, "+1m +7d" represents one month and seven days from today.
    */
  def datepicker(methodName: option, optionName: defaultDate, defaultDateValue: String): JQuery = js.native
  /**
    * Set the defaultDate option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'defaultDate'
    * @param defaultDateValue A date object containing the default date.
    */
  def datepicker(methodName: option, optionName: defaultDate, defaultDateValue: js.Date): JQuery = js.native
  /**
    * Set the defaultDate option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'defaultDate'
    * @param defaultDateValue A number of days from today. For example 2 represents two days from today and -1 represents yesterday.
    */
  def datepicker(methodName: option, optionName: defaultDate, defaultDateValue: Double): JQuery = js.native
  /**
    * Get the duration option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'duration'
    */
  def datepicker(methodName: option, optionName: duration): String = js.native
  /**
    * Set the duration option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'duration'
    * @param durationValue Control the speed at which the datepicker appears, it may be a time in milliseconds or a string representing one of the three predefined speeds ("slow", "normal", "fast").
    */
  def datepicker(methodName: option, optionName: duration, durationValue: String): JQuery = js.native
  /**
    * Get the endDate after initialization
    *
    * @param methodName 'option'
    * @param optionName 'endDate'
    */
  def datepicker(methodName: option, optionName: endDate): js.Date = js.native
  /**
    * Get the firstDay option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'firstDay'
    */
  def datepicker(methodName: option, optionName: firstDay): Double = js.native
  /**
    * Set the firstDay option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'firstDay'
    * @param firstDayValue Set the first day of the week: Sunday is 0, Monday is 1, etc.
    */
  def datepicker(methodName: option, optionName: firstDay, firstDayValue: Double): JQuery = js.native
  /**
    * Get the gotoCurrent option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'gotoCurrent'
    */
  def datepicker(methodName: option, optionName: gotoCurrent): Boolean = js.native
  /**
    * Set the gotoCurrent option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'gotoCurrent'
    * @param gotoCurrentValue When true, the current day link moves to the currently selected date instead of today.
    */
  def datepicker(methodName: option, optionName: gotoCurrent, gotoCurrentValue: Boolean): JQuery = js.native
  /**
    * Initialize a datepicker with the given options
    */
  def datepicker(options: DatepickerOptions): JQuery = js.native
  /**
    * Removes the datepicker functionality completely. This will return the element back to its pre-init state.
    *
    * @param methodName 'destroy'
    */
  @JSName("datepicker")
  def datepicker_destroy(methodName: destroy): JQuery = js.native
  /**
    * Opens the datepicker in a dialog box.
    *
    * @param methodName 'dialog'
    * @param date The initial date.
    * @param onSelect A callback function when a date is selected. The function receives the date text and date picker instance as parameters.
    * @param settings The new settings for the date picker.
    * @param pos The position of the top/left of the dialog as [x, y] or a MouseEvent that contains the coordinates. If not specified the dialog is centered on the screen.
    */
  @JSName("datepicker")
  def datepicker_dialog(methodName: dialog, date: String): JQuery = js.native
  @JSName("datepicker")
  def datepicker_dialog(methodName: dialog, date: String, onSelect: js.Function0[Unit]): JQuery = js.native
  @JSName("datepicker")
  def datepicker_dialog(
    methodName: dialog,
    date: String,
    onSelect: js.Function0[Unit],
    settings: Unit,
    pos: js.Array[Double]
  ): JQuery = js.native
  @JSName("datepicker")
  def datepicker_dialog(methodName: dialog, date: String, onSelect: js.Function0[Unit], settings: Unit, pos: MouseEvent): JQuery = js.native
  @JSName("datepicker")
  def datepicker_dialog(methodName: dialog, date: String, onSelect: js.Function0[Unit], settings: DatepickerOptions): JQuery = js.native
  @JSName("datepicker")
  def datepicker_dialog(
    methodName: dialog,
    date: String,
    onSelect: js.Function0[Unit],
    settings: DatepickerOptions,
    pos: js.Array[Double]
  ): JQuery = js.native
  @JSName("datepicker")
  def datepicker_dialog(
    methodName: dialog,
    date: String,
    onSelect: js.Function0[Unit],
    settings: DatepickerOptions,
    pos: MouseEvent
  ): JQuery = js.native
  @JSName("datepicker")
  def datepicker_dialog(methodName: dialog, date: String, onSelect: Unit, settings: Unit, pos: js.Array[Double]): JQuery = js.native
  @JSName("datepicker")
  def datepicker_dialog(methodName: dialog, date: String, onSelect: Unit, settings: Unit, pos: MouseEvent): JQuery = js.native
  @JSName("datepicker")
  def datepicker_dialog(methodName: dialog, date: String, onSelect: Unit, settings: DatepickerOptions): JQuery = js.native
  @JSName("datepicker")
  def datepicker_dialog(
    methodName: dialog,
    date: String,
    onSelect: Unit,
    settings: DatepickerOptions,
    pos: js.Array[Double]
  ): JQuery = js.native
  @JSName("datepicker")
  def datepicker_dialog(methodName: dialog, date: String, onSelect: Unit, settings: DatepickerOptions, pos: MouseEvent): JQuery = js.native
  /**
    * Opens the datepicker in a dialog box.
    *
    * @param methodName 'dialog'
    * @param date The initial date.
    * @param onSelect A callback function when a date is selected. The function receives the date text and date picker instance as parameters.
    * @param settings The new settings for the date picker.
    * @param pos The position of the top/left of the dialog as [x, y] or a MouseEvent that contains the coordinates. If not specified the dialog is centered on the screen.
    */
  @JSName("datepicker")
  def datepicker_dialog(methodName: dialog, date: js.Date): JQuery = js.native
  @JSName("datepicker")
  def datepicker_dialog(methodName: dialog, date: js.Date, onSelect: js.Function0[Unit]): JQuery = js.native
  @JSName("datepicker")
  def datepicker_dialog(
    methodName: dialog,
    date: js.Date,
    onSelect: js.Function0[Unit],
    settings: Unit,
    pos: js.Array[Double]
  ): JQuery = js.native
  @JSName("datepicker")
  def datepicker_dialog(methodName: dialog, date: js.Date, onSelect: js.Function0[Unit], settings: Unit, pos: MouseEvent): JQuery = js.native
  @JSName("datepicker")
  def datepicker_dialog(methodName: dialog, date: js.Date, onSelect: js.Function0[Unit], settings: DatepickerOptions): JQuery = js.native
  @JSName("datepicker")
  def datepicker_dialog(
    methodName: dialog,
    date: js.Date,
    onSelect: js.Function0[Unit],
    settings: DatepickerOptions,
    pos: js.Array[Double]
  ): JQuery = js.native
  @JSName("datepicker")
  def datepicker_dialog(
    methodName: dialog,
    date: js.Date,
    onSelect: js.Function0[Unit],
    settings: DatepickerOptions,
    pos: MouseEvent
  ): JQuery = js.native
  @JSName("datepicker")
  def datepicker_dialog(methodName: dialog, date: js.Date, onSelect: Unit, settings: Unit, pos: js.Array[Double]): JQuery = js.native
  @JSName("datepicker")
  def datepicker_dialog(methodName: dialog, date: js.Date, onSelect: Unit, settings: Unit, pos: MouseEvent): JQuery = js.native
  @JSName("datepicker")
  def datepicker_dialog(methodName: dialog, date: js.Date, onSelect: Unit, settings: DatepickerOptions): JQuery = js.native
  @JSName("datepicker")
  def datepicker_dialog(
    methodName: dialog,
    date: js.Date,
    onSelect: Unit,
    settings: DatepickerOptions,
    pos: js.Array[Double]
  ): JQuery = js.native
  @JSName("datepicker")
  def datepicker_dialog(methodName: dialog, date: js.Date, onSelect: Unit, settings: DatepickerOptions, pos: MouseEvent): JQuery = js.native
  /**
    * Returns the current date for the datepicker or null if no date has been selected.
    *
    * @param methodName 'getDate'
    */
  @JSName("datepicker")
  def datepicker_getDate(methodName: getDate): js.Date = js.native
  /**
    * Close a previously opened date picker.
    *
    * @param methodName 'hide'
    */
  @JSName("datepicker")
  def datepicker_hide(methodName: hide): JQuery = js.native
  /**
    * Determine whether a date picker has been disabled.
    *
    * @param methodName 'isDisabled'
    */
  @JSName("datepicker")
  def datepicker_isDisabled(methodName: isDisabled): Boolean = js.native
  /**
    * Gets the value currently associated with the specified optionName.
    *
    * @param methodName 'option'
    * @param optionName The name of the option to get.
    */
  @JSName("datepicker")
  def datepicker_option(methodName: option, optionName: String): Any = js.native
  @JSName("datepicker")
  def datepicker_option(methodName: option, optionName: String, otherParams: Any*): Any = js.native
  /**
    * Redraw the date picker, after having made some external modifications.
    *
    * @param methodName 'refresh'
    */
  @JSName("datepicker")
  def datepicker_refresh(methodName: refresh): JQuery = js.native
  /**
    * Sets the date for the datepicker. The new date may be a Date object or a string in the current date format (e.g., "01/26/2009"), a number of days from today (e.g., +7) or a string of values and periods ("y" for years, "m" for months, "w" for weeks, "d" for days, e.g., "+1m +7d"), or null to clear the selected date.
    *
    * @param methodName 'setDate'
    * @param date The new date.
    */
  @JSName("datepicker")
  def datepicker_setDate(methodName: setDate, date: String): JQuery = js.native
  /**
    * Sets the date for the datepicker. The new date may be a Date object or a string in the current date format (e.g., "01/26/2009"), a number of days from today (e.g., +7) or a string of values and periods ("y" for years, "m" for months, "w" for weeks, "d" for days, e.g., "+1m +7d"), or null to clear the selected date.
    *
    * @param methodName 'setDate'
    * @param date The new date.
    */
  @JSName("datepicker")
  def datepicker_setDate(methodName: setDate, date: js.Date): JQuery = js.native
  /**
    * Open the date picker. If the datepicker is attached to an input, the input must be visible for the datepicker to be shown.
    *
    * @param methodName 'show'
    */
  @JSName("datepicker")
  def datepicker_show(methodName: show): JQuery = js.native
  /**
    * Returns a jQuery object containing the datepicker.
    *
    * @param methodName 'widget'
    */
  @JSName("datepicker")
  def datepicker_widget(methodName: widget): JQuery = js.native
  
  def dialog(): JQuery = js.native
  def dialog(methodName: String): JQuery = js.native
  def dialog(optionLiteral: String, optionName: String): Any = js.native
  def dialog(optionLiteral: String, optionName: String, optionValue: Any): JQuery = js.native
  def dialog(optionLiteral: String, options: DialogOptions): Any = js.native
  def dialog(options: DialogOptions): JQuery = js.native
  @JSName("dialog")
  def dialog_close(methodName: close): JQuery = js.native
  @JSName("dialog")
  def dialog_destroy(methodName: destroy): JQuery = js.native
  @JSName("dialog")
  def dialog_isOpen(methodName: isOpen): Boolean = js.native
  @JSName("dialog")
  def dialog_moveToTop(methodName: moveToTop): JQuery = js.native
  @JSName("dialog")
  def dialog_open(methodName: open): JQuery = js.native
  @JSName("dialog")
  def dialog_widget(methodName: widget): JQuery = js.native
  
  def disableSelection(): JQuery = js.native
  
  def draggable(): JQuery = js.native
  def draggable(methodName: String): JQuery = js.native
  def draggable(optionLiteral: String, optionName: String): Any = js.native
  def draggable(optionLiteral: String, optionName: String, optionValue: Any): JQuery = js.native
  def draggable(optionLiteral: String, options: DraggableOptions): Any = js.native
  def draggable(options: DraggableOptions): JQuery = js.native
  @JSName("draggable")
  def draggable_destroy(methodName: destroy): Unit = js.native
  @JSName("draggable")
  def draggable_disable(methodName: disable): Unit = js.native
  @JSName("draggable")
  def draggable_enable(methodName: enable): Unit = js.native
  @JSName("draggable")
  def draggable_widget(methodName: widget): JQuery = js.native
  
  def droppable(): JQuery = js.native
  def droppable(methodName: String): JQuery = js.native
  def droppable(optionLiteral: String, optionName: String): Any = js.native
  def droppable(optionLiteral: String, optionName: String, optionValue: Any): JQuery = js.native
  def droppable(optionLiteral: String, options: DraggableOptions): Any = js.native
  def droppable(options: DroppableOptions): JQuery = js.native
  @JSName("droppable")
  def droppable_destroy(methodName: destroy): Unit = js.native
  @JSName("droppable")
  def droppable_disable(methodName: disable): Unit = js.native
  @JSName("droppable")
  def droppable_enable(methodName: enable): Unit = js.native
  @JSName("droppable")
  def droppable_widget(methodName: widget): JQuery = js.native
  
  def effect(effect: String): this.type = js.native
  def effect(effect: String, options: Any): this.type = js.native
  def effect(effect: String, options: Any, duration: String): this.type = js.native
  def effect(effect: String, options: Any, duration: String, complete: js.Function): this.type = js.native
  def effect(effect: String, options: Any, duration: Double): this.type = js.native
  def effect(effect: String, options: Any, duration: Double, complete: js.Function): this.type = js.native
  def effect(effect: String, options: Any, duration: Unit, complete: js.Function): this.type = js.native
  def effect(effect: String, options: Unit, duration: String): this.type = js.native
  def effect(effect: String, options: Unit, duration: String, complete: js.Function): this.type = js.native
  def effect(effect: String, options: Unit, duration: Double): this.type = js.native
  def effect(effect: String, options: Unit, duration: Double, complete: js.Function): this.type = js.native
  def effect(effect: String, options: Unit, duration: Unit, complete: js.Function): this.type = js.native
  def effect(options: Any): this.type = js.native
  
  def enableSelection(): JQuery = js.native
  
  def focus(delay: Double): JQuery = js.native
  def focus(delay: Double, callback: js.Function): JQuery = js.native
  
  def hide(effect: String): this.type = js.native
  def hide(effect: String, options: Any): this.type = js.native
  def hide(effect: String, options: Any, duration: String): this.type = js.native
  def hide(effect: String, options: Any, duration: String, complete: js.Function): this.type = js.native
  def hide(effect: String, options: Any, duration: Double): this.type = js.native
  def hide(effect: String, options: Any, duration: Double, complete: js.Function): this.type = js.native
  def hide(effect: String, options: Any, duration: Unit, complete: js.Function): this.type = js.native
  def hide(effect: String, options: Unit, duration: String): this.type = js.native
  def hide(effect: String, options: Unit, duration: String, complete: js.Function): this.type = js.native
  def hide(effect: String, options: Unit, duration: Double): this.type = js.native
  def hide(effect: String, options: Unit, duration: Double, complete: js.Function): this.type = js.native
  def hide(effect: String, options: Unit, duration: Unit, complete: js.Function): this.type = js.native
  def hide(options: Any): this.type = js.native
  
  var jQuery: JQueryStatic = js.native
  
  def menu(): JQuery = js.native
  def menu(methodName: String): JQuery = js.native
  def menu(methodName: String, event: JQueryEventObject, item: JQuery): Unit = js.native
  def menu(optionLiteral: String, optionName: String): Any = js.native
  def menu(optionLiteral: String, optionName: String, optionValue: Any): JQuery = js.native
  def menu(optionLiteral: String, options: MenuOptions): Any = js.native
  def menu(options: MenuOptions): JQuery = js.native
  @JSName("menu")
  var menu_Original: Call = js.native
  @JSName("menu")
  def menu_blur(methodName: blur): Unit = js.native
  @JSName("menu")
  def menu_collapse(methodName: collapse): Unit = js.native
  @JSName("menu")
  def menu_collapse(methodName: collapse, event: JQueryEventObject): Unit = js.native
  @JSName("menu")
  def menu_collapseAll(methodName: collapseAll): Unit = js.native
  @JSName("menu")
  def menu_collapseAll(methodName: collapseAll, event: Unit, all: Boolean): Unit = js.native
  @JSName("menu")
  def menu_collapseAll(methodName: collapseAll, event: JQueryEventObject): Unit = js.native
  @JSName("menu")
  def menu_collapseAll(methodName: collapseAll, event: JQueryEventObject, all: Boolean): Unit = js.native
  @JSName("menu")
  def menu_destroy(methodName: destroy): Unit = js.native
  @JSName("menu")
  def menu_disable(methodName: disable): Unit = js.native
  @JSName("menu")
  def menu_enable(methodName: enable): Unit = js.native
  @JSName("menu")
  def menu_focus(methodName: focus, event: JQueryEventObject, item: JQuery): Unit = js.native
  @JSName("menu")
  def menu_isFirstItem(methodName: isFirstItem): Boolean = js.native
  @JSName("menu")
  def menu_isLastItem(methodName: isLastItem): Boolean = js.native
  @JSName("menu")
  def menu_next(methodName: next): Unit = js.native
  @JSName("menu")
  def menu_next(methodName: next, event: JQueryEventObject): Unit = js.native
  @JSName("menu")
  def menu_nextPage(methodName: nextPage): Unit = js.native
  @JSName("menu")
  def menu_nextPage(methodName: nextPage, event: JQueryEventObject): Unit = js.native
  @JSName("menu")
  def menu_previous(methodName: previous): Unit = js.native
  @JSName("menu")
  def menu_previous(methodName: previous, event: JQueryEventObject): Unit = js.native
  @JSName("menu")
  def menu_previousPage(methodName: previousPage): Unit = js.native
  @JSName("menu")
  def menu_previousPage(methodName: previousPage, event: JQueryEventObject): Unit = js.native
  @JSName("menu")
  def menu_refresh(methodName: refresh): Unit = js.native
  @JSName("menu")
  def menu_select(methodName: select): Unit = js.native
  @JSName("menu")
  def menu_select(methodName: select, event: JQueryEventObject): Unit = js.native
  @JSName("menu")
  def menu_widget(methodName: widget): JQuery = js.native
  
  def position(options: JQueryPositionOptions): JQuery = js.native
  
  def progressbar(): JQuery = js.native
  def progressbar(methodName: String): JQuery = js.native
  def progressbar(optionLiteral: String, optionName: String): Any = js.native
  def progressbar(optionLiteral: String, optionName: String, optionValue: Any): JQuery = js.native
  def progressbar(optionLiteral: String, options: ProgressbarOptions): Any = js.native
  def progressbar(options: ProgressbarOptions): JQuery = js.native
  @JSName("progressbar")
  def progressbar_destroy(methodName: destroy): Unit = js.native
  @JSName("progressbar")
  def progressbar_disable(methodName: disable): Unit = js.native
  @JSName("progressbar")
  def progressbar_enable(methodName: enable): Unit = js.native
  @JSName("progressbar")
  def progressbar_refresh(methodName: refresh): Unit = js.native
  @JSName("progressbar")
  def progressbar_value(methodName: value): Any = js.native
  @JSName("progressbar")
  def progressbar_value(methodName: value, value: Boolean): Unit = js.native
  // number or boolean
  @JSName("progressbar")
  def progressbar_value(methodName: value, value: Double): Unit = js.native
  @JSName("progressbar")
  def progressbar_widget(methodName: widget): JQuery = js.native
  
  def removeClass(classNames: String): this.type = js.native
  def removeClass(classNames: String, speed: String): this.type = js.native
  def removeClass(classNames: String, speed: String, callback: js.Function): this.type = js.native
  def removeClass(classNames: String, speed: String, easing: String): this.type = js.native
  def removeClass(classNames: String, speed: String, easing: String, callback: js.Function): this.type = js.native
  def removeClass(classNames: String, speed: String, easing: Unit, callback: js.Function): this.type = js.native
  def removeClass(classNames: String, speed: Double): this.type = js.native
  def removeClass(classNames: String, speed: Double, callback: js.Function): this.type = js.native
  def removeClass(classNames: String, speed: Double, easing: String): this.type = js.native
  def removeClass(classNames: String, speed: Double, easing: String, callback: js.Function): this.type = js.native
  def removeClass(classNames: String, speed: Double, easing: Unit, callback: js.Function): this.type = js.native
  def removeClass(classNames: String, speed: Unit, callback: js.Function): this.type = js.native
  def removeClass(classNames: String, speed: Unit, easing: String): this.type = js.native
  def removeClass(classNames: String, speed: Unit, easing: String, callback: js.Function): this.type = js.native
  def removeClass(classNames: String, speed: Unit, easing: Unit, callback: js.Function): this.type = js.native
  
  def removeUniqueId(): JQuery = js.native
  
  def resizable(): JQuery = js.native
  def resizable(methodName: String): JQuery = js.native
  def resizable(optionLiteral: String, optionName: String): Any = js.native
  def resizable(optionLiteral: String, optionName: String, optionValue: Any): JQuery = js.native
  def resizable(optionLiteral: String, options: ResizableOptions): Any = js.native
  def resizable(options: ResizableOptions): JQuery = js.native
  @JSName("resizable")
  def resizable_destroy(methodName: destroy): Unit = js.native
  @JSName("resizable")
  def resizable_disable(methodName: disable): Unit = js.native
  @JSName("resizable")
  def resizable_enable(methodName: enable): Unit = js.native
  @JSName("resizable")
  def resizable_widget(methodName: widget): JQuery = js.native
  
  def scrollParent(): JQuery = js.native
  
  def selectable(): JQuery = js.native
  def selectable(methodName: String): JQuery = js.native
  def selectable(optionLiteral: String, optionName: String): Any = js.native
  def selectable(optionLiteral: String, optionName: String, optionValue: Any): JQuery = js.native
  def selectable(optionLiteral: String, options: SelectableOptions): Any = js.native
  def selectable(options: SelectableOptions): JQuery = js.native
  @JSName("selectable")
  def selectable_destroy(methodName: destroy): Unit = js.native
  @JSName("selectable")
  def selectable_disable(methodName: disable): Unit = js.native
  @JSName("selectable")
  def selectable_enable(methodName: enable): Unit = js.native
  @JSName("selectable")
  def selectable_widget(methodName: widget): JQuery = js.native
  
  def selectmenu(): JQuery = js.native
  def selectmenu(methodName: String): JQuery = js.native
  def selectmenu(optionLiteral: String, optionName: String): Any = js.native
  def selectmenu(optionLiteral: String, optionName: String, optionValue: Any): JQuery = js.native
  def selectmenu(optionLiteral: String, options: SelectMenuOptions): Any = js.native
  def selectmenu(options: SelectMenuOptions): JQuery = js.native
  @JSName("selectmenu")
  def selectmenu_close(methodName: close): JQuery = js.native
  @JSName("selectmenu")
  def selectmenu_destroy(methodName: destroy): JQuery = js.native
  @JSName("selectmenu")
  def selectmenu_disable(methodName: disable): JQuery = js.native
  @JSName("selectmenu")
  def selectmenu_enable(methodName: enable): JQuery = js.native
  @JSName("selectmenu")
  def selectmenu_instance(methodName: instance): Any = js.native
  @JSName("selectmenu")
  def selectmenu_menuWidget(methodName: menuWidget): JQuery = js.native
  @JSName("selectmenu")
  def selectmenu_open(methodName: open): JQuery = js.native
  @JSName("selectmenu")
  def selectmenu_refresh(methodName: refresh): JQuery = js.native
  @JSName("selectmenu")
  def selectmenu_widget(methodName: widget): JQuery = js.native
  
  def show(effect: String): this.type = js.native
  def show(effect: String, options: Any): this.type = js.native
  def show(effect: String, options: Any, duration: String): this.type = js.native
  def show(effect: String, options: Any, duration: String, complete: js.Function): this.type = js.native
  def show(effect: String, options: Any, duration: Double): this.type = js.native
  def show(effect: String, options: Any, duration: Double, complete: js.Function): this.type = js.native
  def show(effect: String, options: Any, duration: Unit, complete: js.Function): this.type = js.native
  def show(effect: String, options: Unit, duration: String): this.type = js.native
  def show(effect: String, options: Unit, duration: String, complete: js.Function): this.type = js.native
  def show(effect: String, options: Unit, duration: Double): this.type = js.native
  def show(effect: String, options: Unit, duration: Double, complete: js.Function): this.type = js.native
  def show(effect: String, options: Unit, duration: Unit, complete: js.Function): this.type = js.native
  def show(options: Any): this.type = js.native
  
  def slider(): JQuery = js.native
  def slider(methodName: String): JQuery = js.native
  def slider(methodName: String, index: Double, value: Double): Unit = js.native
  def slider(methodName: String, values: js.Array[Double]): Unit = js.native
  def slider(optionLiteral: String, optionName: String): Any = js.native
  def slider(optionLiteral: String, optionName: String, optionValue: Any): JQuery = js.native
  def slider(optionLiteral: String, options: SliderOptions): Any = js.native
  def slider(options: SliderOptions): JQuery = js.native
  @JSName("slider")
  def slider_destroy(methodName: destroy): Unit = js.native
  @JSName("slider")
  def slider_disable(methodName: disable): Unit = js.native
  @JSName("slider")
  def slider_enable(methodName: enable): Unit = js.native
  @JSName("slider")
  def slider_refresh(methodName: refresh): Unit = js.native
  @JSName("slider")
  def slider_value(methodName: value): Double = js.native
  @JSName("slider")
  def slider_value(methodName: value, value: Double): Unit = js.native
  @JSName("slider")
  def slider_values(methodName: values): js.Array[Double] = js.native
  @JSName("slider")
  def slider_values(methodName: values, index: Double): Double = js.native
  @JSName("slider")
  def slider_values(methodName: values, index: Double, value: Double): Unit = js.native
  @JSName("slider")
  def slider_values(methodName: values, values: js.Array[Double]): Unit = js.native
  @JSName("slider")
  def slider_widget(methodName: widget): JQuery = js.native
  
  def sortable(): JQuery = js.native
  def sortable(methodName: String): JQuery = js.native
  def sortable(optionLiteral: String, optionName: String): Any = js.native
  def sortable(optionLiteral: String, optionName: String, optionValue: Any): JQuery = js.native
  def sortable(optionLiteral: String, options: SortableOptions): Any = js.native
  def sortable(options: SortableOptions): JQuery = js.native
  @JSName("sortable")
  def sortable_destroy(methodName: destroy): Unit = js.native
  @JSName("sortable")
  def sortable_disable(methodName: disable): Unit = js.native
  @JSName("sortable")
  def sortable_enable(methodName: enable): Unit = js.native
  @JSName("sortable")
  def sortable_serialize(methodName: serialize): String = js.native
  @JSName("sortable")
  def sortable_serialize(methodName: serialize, options: Expression): String = js.native
  @JSName("sortable")
  def sortable_toArray(methodName: toArray): js.Array[String] = js.native
  @JSName("sortable")
  def sortable_toArray(methodName: toArray, options: Attribute): js.Array[String] = js.native
  @JSName("sortable")
  def sortable_widget(methodName: widget): JQuery = js.native
  
  def spinner(): JQuery = js.native
  def spinner(methodName: String): JQuery = js.native
  def spinner(optionLiteral: String, optionName: String): Any = js.native
  def spinner(optionLiteral: String, optionName: String, optionValue: Any): JQuery = js.native
  def spinner(optionLiteral: String, options: SpinnerOptions): Any = js.native
  def spinner(options: SpinnerOptions): JQuery = js.native
  @JSName("spinner")
  def spinner_destroy(methodName: destroy): Unit = js.native
  @JSName("spinner")
  def spinner_disable(methodName: disable): Unit = js.native
  @JSName("spinner")
  def spinner_enable(methodName: enable): Unit = js.native
  @JSName("spinner")
  def spinner_pageDown(methodName: pageDown): Unit = js.native
  @JSName("spinner")
  def spinner_pageDown(methodName: pageDown, pages: Double): Unit = js.native
  @JSName("spinner")
  def spinner_pageUp(methodName: pageUp): Unit = js.native
  @JSName("spinner")
  def spinner_pageUp(methodName: pageUp, pages: Double): Unit = js.native
  @JSName("spinner")
  def spinner_stepDown(methodName: stepDown): Unit = js.native
  @JSName("spinner")
  def spinner_stepDown(methodName: stepDown, steps: Double): Unit = js.native
  @JSName("spinner")
  def spinner_stepUp(methodName: stepUp): Unit = js.native
  @JSName("spinner")
  def spinner_stepUp(methodName: stepUp, steps: Double): Unit = js.native
  @JSName("spinner")
  def spinner_value(methodName: value): Double = js.native
  @JSName("spinner")
  def spinner_value(methodName: value, value: Double): Unit = js.native
  @JSName("spinner")
  def spinner_widget(methodName: widget): JQuery = js.native
  
  def switchClass(removeClassName: String, addClassName: String): this.type = js.native
  def switchClass(removeClassName: String, addClassName: String, duration: String): this.type = js.native
  def switchClass(removeClassName: String, addClassName: String, duration: String, easing: String): this.type = js.native
  def switchClass(
    removeClassName: String,
    addClassName: String,
    duration: String,
    easing: String,
    complete: js.Function
  ): this.type = js.native
  def switchClass(
    removeClassName: String,
    addClassName: String,
    duration: String,
    easing: Unit,
    complete: js.Function
  ): this.type = js.native
  def switchClass(removeClassName: String, addClassName: String, duration: Double): this.type = js.native
  def switchClass(removeClassName: String, addClassName: String, duration: Double, easing: String): this.type = js.native
  def switchClass(
    removeClassName: String,
    addClassName: String,
    duration: Double,
    easing: String,
    complete: js.Function
  ): this.type = js.native
  def switchClass(
    removeClassName: String,
    addClassName: String,
    duration: Double,
    easing: Unit,
    complete: js.Function
  ): this.type = js.native
  def switchClass(removeClassName: String, addClassName: String, duration: Unit, easing: String): this.type = js.native
  def switchClass(
    removeClassName: String,
    addClassName: String,
    duration: Unit,
    easing: String,
    complete: js.Function
  ): this.type = js.native
  def switchClass(removeClassName: String, addClassName: String, duration: Unit, easing: Unit, complete: js.Function): this.type = js.native
  
  def tabs(): JQuery = js.native
  def tabs(methodName: String): JQuery = js.native
  def tabs(optionLiteral: String, optionName: String): Any = js.native
  def tabs(optionLiteral: String, optionName: String, optionValue: Any): JQuery = js.native
  def tabs(optionLiteral: String, options: TabsOptions): Any = js.native
  def tabs(options: TabsOptions): JQuery = js.native
  @JSName("tabs")
  def tabs_destroy(methodName: destroy): Unit = js.native
  @JSName("tabs")
  def tabs_disable(methodName: disable): Unit = js.native
  @JSName("tabs")
  def tabs_disable(methodName: disable, index: Double): Unit = js.native
  @JSName("tabs")
  def tabs_enable(methodName: enable): Unit = js.native
  @JSName("tabs")
  def tabs_enable(methodName: enable, index: Double): Unit = js.native
  @JSName("tabs")
  def tabs_load(methodName: load, index: Double): Unit = js.native
  @JSName("tabs")
  def tabs_refresh(methodName: refresh): Unit = js.native
  @JSName("tabs")
  def tabs_select(methodName: select, index: Double): JQuery = js.native
  @JSName("tabs")
  def tabs_widget(methodName: widget): JQuery = js.native
  
  def toggle(effect: String): this.type = js.native
  def toggle(effect: String, options: Any): this.type = js.native
  def toggle(effect: String, options: Any, duration: String): this.type = js.native
  def toggle(effect: String, options: Any, duration: String, complete: js.Function): this.type = js.native
  def toggle(effect: String, options: Any, duration: Double): this.type = js.native
  def toggle(effect: String, options: Any, duration: Double, complete: js.Function): this.type = js.native
  def toggle(effect: String, options: Any, duration: Unit, complete: js.Function): this.type = js.native
  def toggle(effect: String, options: Unit, duration: String): this.type = js.native
  def toggle(effect: String, options: Unit, duration: String, complete: js.Function): this.type = js.native
  def toggle(effect: String, options: Unit, duration: Double): this.type = js.native
  def toggle(effect: String, options: Unit, duration: Double, complete: js.Function): this.type = js.native
  def toggle(effect: String, options: Unit, duration: Unit, complete: js.Function): this.type = js.native
  def toggle(options: Any): this.type = js.native
  
  def toggleClass(className: String): this.type = js.native
  def toggleClass(className: String, aswitch: Boolean): this.type = js.native
  def toggleClass(className: String, aswitch: Boolean, duration: String): this.type = js.native
  def toggleClass(className: String, aswitch: Boolean, duration: String, easing: String): this.type = js.native
  def toggleClass(className: String, aswitch: Boolean, duration: String, easing: String, complete: js.Function): this.type = js.native
  def toggleClass(className: String, aswitch: Boolean, duration: String, easing: Unit, complete: js.Function): this.type = js.native
  def toggleClass(className: String, aswitch: Boolean, duration: Double): this.type = js.native
  def toggleClass(className: String, aswitch: Boolean, duration: Double, easing: String): this.type = js.native
  def toggleClass(className: String, aswitch: Boolean, duration: Double, easing: String, complete: js.Function): this.type = js.native
  def toggleClass(className: String, aswitch: Boolean, duration: Double, easing: Unit, complete: js.Function): this.type = js.native
  def toggleClass(className: String, aswitch: Boolean, duration: Unit, easing: String): this.type = js.native
  def toggleClass(className: String, aswitch: Boolean, duration: Unit, easing: String, complete: js.Function): this.type = js.native
  def toggleClass(className: String, aswitch: Boolean, duration: Unit, easing: Unit, complete: js.Function): this.type = js.native
  def toggleClass(className: String, aswitch: Unit, duration: String, easing: String): this.type = js.native
  def toggleClass(className: String, aswitch: Unit, duration: String, easing: String, complete: js.Function): this.type = js.native
  def toggleClass(className: String, aswitch: Unit, duration: String, easing: Unit, complete: js.Function): this.type = js.native
  def toggleClass(className: String, aswitch: Unit, duration: Double): this.type = js.native
  def toggleClass(className: String, aswitch: Unit, duration: Double, easing: String): this.type = js.native
  def toggleClass(className: String, aswitch: Unit, duration: Double, easing: String, complete: js.Function): this.type = js.native
  def toggleClass(className: String, aswitch: Unit, duration: Double, easing: Unit, complete: js.Function): this.type = js.native
  def toggleClass(className: String, aswitch: Unit, duration: Unit, easing: String): this.type = js.native
  def toggleClass(className: String, aswitch: Unit, duration: Unit, easing: String, complete: js.Function): this.type = js.native
  def toggleClass(className: String, aswitch: Unit, duration: Unit, easing: Unit, complete: js.Function): this.type = js.native
  def toggleClass(className: String, duration: String): this.type = js.native
  def toggleClass(className: String, duration: String, easing: String): this.type = js.native
  def toggleClass(className: String, duration: String, easing: String, complete: js.Function): this.type = js.native
  def toggleClass(className: String, duration: String, easing: Unit, complete: js.Function): this.type = js.native
  def toggleClass(className: String, duration: Double): this.type = js.native
  def toggleClass(className: String, duration: Double, easing: String): this.type = js.native
  def toggleClass(className: String, duration: Double, easing: String, complete: js.Function): this.type = js.native
  def toggleClass(className: String, duration: Double, easing: Unit, complete: js.Function): this.type = js.native
  def toggleClass(className: String, duration: Unit, easing: String): this.type = js.native
  def toggleClass(className: String, duration: Unit, easing: String, complete: js.Function): this.type = js.native
  def toggleClass(className: String, duration: Unit, easing: Unit, complete: js.Function): this.type = js.native
  
  def tooltip(): JQuery = js.native
  def tooltip(methodName: String): JQuery = js.native
  def tooltip(optionLiteral: String, optionName: String): Any = js.native
  def tooltip(optionLiteral: String, optionName: String, optionValue: Any): JQuery = js.native
  def tooltip(optionLiteral: String, options: TooltipOptions): Any = js.native
  def tooltip(options: TooltipOptions): JQuery = js.native
  @JSName("tooltip")
  def tooltip_close(methodName: close): Unit = js.native
  @JSName("tooltip")
  def tooltip_destroy(methodName: destroy): Unit = js.native
  @JSName("tooltip")
  def tooltip_disable(methodName: disable): Unit = js.native
  @JSName("tooltip")
  def tooltip_enable(methodName: enable): Unit = js.native
  @JSName("tooltip")
  def tooltip_open(methodName: open): Unit = js.native
  @JSName("tooltip")
  def tooltip_widget(methodName: widget): JQuery = js.native
  
  def uniqueId(): JQuery = js.native
  
  def widget(methodName: String): JQuery = js.native
  def widget(optionLiteral: String, optionName: String): Any = js.native
  def widget(optionLiteral: String, optionName: String, optionValue: Any): JQuery = js.native
  def widget(optionLiteral: String, options: WidgetOptions): Any = js.native
  def widget(options: AccordionOptions): JQuery = js.native
  def widget(options: WidgetOptions): JQuery = js.native
  def widget[T](name: String, base: js.Function, prototype: T & (ThisType[T & WidgetCommonProperties])): JQuery = js.native
  def widget[T](name: String, prototype: T & (ThisType[T & WidgetCommonProperties])): JQuery = js.native
  @JSName("widget")
  var widget_Original: Widget = js.native
  
  def zIndex(): Double = js.native
  def zIndex(zIndex: Double): JQuery = js.native
}
