package typingsJapgolly.dojo.dojox.widget

import org.scalajs.dom.raw.HTMLDocument
import typingsJapgolly.dojo.AnonUnwatch
import typingsJapgolly.dojo.dijit.Widget
import typingsJapgolly.dojo.dojo.date
import typingsJapgolly.dojo.dojoStrings.active
import typingsJapgolly.dojo.dojoStrings.attachScope
import typingsJapgolly.dojo.dojoStrings.contextRequire
import typingsJapgolly.dojo.dojoStrings.cssStateNodes
import typingsJapgolly.dojo.dojoStrings.currentFocus
import typingsJapgolly.dojo.dojoStrings.datePackage
import typingsJapgolly.dojo.dojoStrings.dayWidth
import typingsJapgolly.dojo.dojoStrings.hovering
import typingsJapgolly.dojo.dojoStrings.returnIsoRanges
import typingsJapgolly.dojo.dojoStrings.searchContainerNode
import typingsJapgolly.dojo.dojoStrings.style
import typingsJapgolly.dojo.dojoStrings.tabIndex
import typingsJapgolly.dojo.dojoStrings.templatePath
import typingsJapgolly.dojo.dojoStrings.templateString
import typingsJapgolly.dojo.dojoStrings.value
import typingsJapgolly.dojo.dojoStrings.widgetsInTemplate
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/widget/MultiSelectCalendar.html
  *
  * A simple GUI for choosing several dates in the context of a monthly calendar.
  * A simple GUI for choosing several dates in the context of a monthly calendar.
  * This widget serialises its selected dates to ISO dates or ISO ranges of dates,
  * depending on developer selection
  * Note that it accepts an Array of ISO dates as its input
  *
  * @param args
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.dojo.dijit.AttachMixin because Inheritance from two classes. Inlined 
- typingsJapgolly.dojo.dijit.CssStateMixin because Inheritance from two classes. Inlined active, cssStateNodes, hovering
- typingsJapgolly.dojo.dijit.WidgetsInTemplateMixin because Inheritance from two classes. Inlined contextRequire, widgetsInTemplate, startup
- typingsJapgolly.dojo.dijit.TemplatedMixin because Inheritance from two classes. Inlined attachScope, searchContainerNode, templatePath, templateString, buildRendering, destroyRendering, getCachedTemplate, getCachedTemplate */ @JSGlobal("dojox.widget.MultiSelectCalendar")
@js.native
class MultiSelectCalendar_ protected () extends Widget {
  def this(args: js.Object) = this()
  /**
    * True if mouse was pressed while over this widget, and hasn't been released yet
    *
    */
  var active: Boolean = js.native
  /**
    * Object to which attach points and events will be scoped.  Defaults
    * to 'this'.
    *
    */
  var attachScope: js.Object = js.native
  /**
    * Used to provide a context require to the dojo/parser in order to be
    * able to use relative MIDs (e.g. ./Widget) in the widget's template.
    *
    */
  var contextRequire: js.Function = js.native
  /**
    *
    */
  var cssStateNodes: js.Object = js.native
  /**
    * Date object containing the currently focused date, or the date which would be focused
    * if the calendar itself was focused.   Also indicates which year and month to display,
    * i.e. the current "page" the calendar is on.
    *
    */
  var currentFocus: js.Date = js.native
  /**
    * JavaScript namespace to find Calendar routines.  Uses Gregorian Calendar routines
    * at dojo.date by default.
    *
    */
  var datePackage: String = js.native
  /**
    * How to represent the days of the week in the calendar header. See dojo.date.locale
    *
    */
  var dayWidth: String = js.native
  /**
    * True if cursor is over this widget
    *
    */
  var hovering: Boolean = js.native
  /**
    *
    */
  var returnIsoRanges: Boolean = js.native
  /**
    *
    */
  var searchContainerNode: Boolean = js.native
  /**
    * HTML style attributes as cssText string or name/value hash
    *
    */
  @JSName("style")
  var style_MultiSelectCalendar_ : String = js.native
  /**
    * Order fields are traversed when user hits the tab key
    *
    */
  var tabIndex: String = js.native
  /**
    * Path to template (HTML file) for this widget relative to dojo.baseUrl.
    * Deprecated: use templateString with require([... "dojo/text!..."], ...) instead
    *
    */
  var templatePath: String = js.native
  /**
    *
    */
  var templateString: String = js.native
  /**
    * The currently selected Dates, initially set to an empty object to indicate no selection.
    *
    */
  var value: js.Date = js.native
  /**
    *
    */
  var widgetsInTemplate: Boolean = js.native
  /**
    * Focus the calendar by focusing one of the calendar cells
    *
    */
  def focus(): Unit = js.native
  /**
    *
    * @param lastElement
    */
  def focusOnLastDate(lastElement: js.Any): Unit = js.native
  /**
    * Static method to get a template based on the templatePath or
    * templateString key
    */
  def getCachedTemplate(): js.Any = js.native
  /**
    * Static method to get a template based on the templatePath or
    * templateString key
    * 
    * @param templateString The template             
    * @param alwaysUseString Don't cache the DOM tree for this template, even if it doesn't have any variables             
    * @param doc               OptionalThe target document.   Defaults to document global if unspecified.             
    */
  def getCachedTemplate(templateString: String, alwaysUseString: Boolean): js.Any = js.native
  def getCachedTemplate(templateString: String, alwaysUseString: Boolean, doc: HTMLDocument): js.Any = js.native
  /**
    * May be overridden to return CSS classes to associate with the date entry for the given dateObject,
    * for example to indicate a holiday in specified locale.
    *
    * @param dateObject
    * @param locale               Optional
    */
  def getClassForDate(dateObject: js.Date, locale: String): String = js.native
  @JSName("get")
  def get_active(property: active): Boolean = js.native
  @JSName("get")
  def get_attachScope(property: attachScope): js.Object = js.native
  @JSName("get")
  def get_contextRequire(property: contextRequire): js.Function = js.native
  @JSName("get")
  def get_cssStateNodes(property: cssStateNodes): js.Object = js.native
  @JSName("get")
  def get_currentFocus(property: currentFocus): js.Date = js.native
  @JSName("get")
  def get_datePackage(property: datePackage): String = js.native
  @JSName("get")
  def get_dayWidth(property: dayWidth): String = js.native
  @JSName("get")
  def get_hovering(property: hovering): Boolean = js.native
  @JSName("get")
  def get_returnIsoRanges(property: returnIsoRanges): Boolean = js.native
  @JSName("get")
  def get_searchContainerNode(property: searchContainerNode): Boolean = js.native
  @JSName("get")
  def get_tabIndex(property: tabIndex): String = js.native
  @JSName("get")
  def get_templatePath(property: templatePath): String = js.native
  @JSName("get")
  def get_templateString(property: templateString): String = js.native
  @JSName("get")
  def get_value(property: value): js.Date = js.native
  @JSName("get")
  def get_widgetsInTemplate(property: widgetsInTemplate): Boolean = js.native
  /**
    * We go to today but we do no select it
    *
    */
  def goToToday(): Unit = js.native
  /**
    * Provides keyboard navigation of calendar.
    * Called from _onKeyDown() to handle keypress on a stand alone Calendar,
    * and also from dijit.form._DateTimeTextBox to pass a keypress event
    * from the dijit.form.DateTextBox to be handled in this widget
    *
    * @param evt
    */
  def handleKey(evt: Event_): js.Any = js.native
  /**
    * May be overridden to disable certain dates in the calendar e.g. isDisabledDate=dojo.date.locale.isWeekend
    *
    * @param dateObject
    * @param locale               Optional
    */
  def isDisabledDate(dateObject: js.Date, locale: String): Boolean = js.native
  /**
    * Called only when the selected date has changed
    *
    * @param date
    */
  def onChange(date: js.Date): Unit = js.native
  /**
    * Notification that a date cell or more were selected.
    * Passes on the list of ISO dates that are selected
    *
    * @param dates
    */
  def onValueSelected(dates: js.Array[js.Date]): Unit = js.native
  /**
    * Notification that a date cell or more were unselected.
    * Passes on the list of ISO dates that are unselected
    *
    * @param dates
    */
  def onValueUnselected(dates: js.Array[js.Date]): Unit = js.native
  /**
    *
    * @param dateToSelect
    * @param selectedDates
    */
  def selectDate(dateToSelect: date, selectedDates: js.Array[js.Date]): Unit = js.native
  @JSName("set")
  def set_active(property: active, value: Boolean): Unit = js.native
  @JSName("set")
  def set_attachScope(property: attachScope, value: js.Object): Unit = js.native
  @JSName("set")
  def set_contextRequire(property: contextRequire, value: js.Function): Unit = js.native
  @JSName("set")
  def set_cssStateNodes(property: cssStateNodes, value: js.Object): Unit = js.native
  @JSName("set")
  def set_currentFocus(property: currentFocus, value: js.Date): Unit = js.native
  @JSName("set")
  def set_datePackage(property: datePackage, value: String): Unit = js.native
  @JSName("set")
  def set_dayWidth(property: dayWidth, value: String): Unit = js.native
  @JSName("set")
  def set_hovering(property: hovering, value: Boolean): Unit = js.native
  @JSName("set")
  def set_returnIsoRanges(property: returnIsoRanges, value: Boolean): Unit = js.native
  @JSName("set")
  def set_searchContainerNode(property: searchContainerNode, value: Boolean): Unit = js.native
  @JSName("set")
  def set_style(property: style, value: String): Unit = js.native
  @JSName("set")
  def set_tabIndex(property: tabIndex, value: String): Unit = js.native
  @JSName("set")
  def set_templatePath(property: templatePath, value: String): Unit = js.native
  @JSName("set")
  def set_templateString(property: templateString, value: String): Unit = js.native
  @JSName("set")
  def set_value(property: value, value: js.Date): Unit = js.native
  @JSName("set")
  def set_widgetsInTemplate(property: widgetsInTemplate, value: Boolean): Unit = js.native
  /**
    *
    * @param dateToToggle
    * @param selectedDates
    * @param unselectedDates
    */
  def toggleDate(dateToToggle: date, selectedDates: js.Array[js.Date], unselectedDates: js.Array[js.Date]): Unit = js.native
  /**
    *
    * @param dateToUnselect
    * @param unselectedDates
    */
  def unselectDate(dateToUnselect: date, unselectedDates: js.Array[js.Date]): Unit = js.native
  @JSName("watch")
  def watch_active(
    property: active,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_attachScope(
    property: attachScope,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_contextRequire(
    property: contextRequire,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Function], 
      /* newValue */ js.UndefOr[js.Function], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_cssStateNodes(
    property: cssStateNodes,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_currentFocus(
    property: currentFocus,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Date], 
      /* newValue */ js.UndefOr[js.Date], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_datePackage(
    property: datePackage,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_dayWidth(
    property: dayWidth,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_hovering(
    property: hovering,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_returnIsoRanges(
    property: returnIsoRanges,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_searchContainerNode(
    property: searchContainerNode,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_tabIndex(
    property: tabIndex,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_templatePath(
    property: templatePath,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_templateString(
    property: templateString,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_value(
    property: value,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Date], 
      /* newValue */ js.UndefOr[js.Date], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_widgetsInTemplate(
    property: widgetsInTemplate,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
}

