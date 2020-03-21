package typingsJapgolly.dojo.dojox.calc.Grapher

import org.scalajs.dom.raw.HTMLDocument
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.dojo.AnonUnwatch
import typingsJapgolly.dojo.dijit.WidgetBase
import typingsJapgolly.dojo.dojoStrings.attachScope
import typingsJapgolly.dojo.dojoStrings.chartIndex
import typingsJapgolly.dojo.dojoStrings.checkboxIndex
import typingsJapgolly.dojo.dojoStrings.colorBoxFieldsetIndex
import typingsJapgolly.dojo.dojoStrings.colorIndex
import typingsJapgolly.dojo.dojoStrings.contextRequire
import typingsJapgolly.dojo.dojoStrings.dropDownIndex
import typingsJapgolly.dojo.dojoStrings.evaluatedExpression
import typingsJapgolly.dojo.dojoStrings.expressionIndex
import typingsJapgolly.dojo.dojoStrings.funcNumberIndex
import typingsJapgolly.dojo.dojoStrings.functionMode
import typingsJapgolly.dojo.dojoStrings.functionRef
import typingsJapgolly.dojo.dojoStrings.searchContainerNode
import typingsJapgolly.dojo.dojoStrings.statusIndex
import typingsJapgolly.dojo.dojoStrings.style
import typingsJapgolly.dojo.dojoStrings.templatePath
import typingsJapgolly.dojo.dojoStrings.templateString
import typingsJapgolly.dojo.dojoStrings.tooltipIndex
import typingsJapgolly.dojo.dojoStrings.widgetsInTemplate
import typingsJapgolly.dojo.dojox.charting.Chart2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/calc/Grapher.Grapher.html
  *
  * The dialog layout for making graphs
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.dojo.dijit.AttachMixin because Inheritance from two classes. Inlined 
- typingsJapgolly.dojo.dijit.WidgetsInTemplateMixin because Inheritance from two classes. Inlined contextRequire, widgetsInTemplate, startup
- typingsJapgolly.dojo.dijit.TemplatedMixin because Inheritance from two classes. Inlined attachScope, searchContainerNode, templatePath, templateString, buildRendering, destroyRendering, getCachedTemplate, getCachedTemplate */ @JSGlobal("dojox.calc.Grapher.Grapher")
@js.native
class Grapher () extends WidgetBase {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * Object to which attach points and events will be scoped.  Defaults
    * to 'this'.
    *
    */
  var attachScope: js.Object = js.native
  /**
    *
    */
  var chartIndex: Double = js.native
  /**
    *
    */
  var checkboxIndex: Double = js.native
  /**
    *
    */
  var colorBoxFieldsetIndex: Double = js.native
  /**
    *
    */
  var colorIndex: Double = js.native
  /**
    * Used to provide a context require to the dojo/parser in order to be
    * able to use relative MIDs (e.g. ./Widget) in the widget's template.
    *
    */
  var contextRequire: js.Function = js.native
  /**
    *
    */
  var dropDownIndex: Double = js.native
  /**
    *
    */
  var evaluatedExpression: Double = js.native
  /**
    *
    */
  var expressionIndex: Double = js.native
  /**
    *
    */
  var funcNumberIndex: Double = js.native
  /**
    *
    */
  var functionMode: Double = js.native
  /**
    *
    */
  var functionRef: Double = js.native
  /**
    *
    */
  var searchContainerNode: Boolean = js.native
  /**
    *
    */
  var statusIndex: Double = js.native
  /**
    * HTML style attributes as cssText string or name/value hash
    *
    */
  @JSName("style")
  var style_Grapher: String = js.native
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
    *
    */
  var tooltipIndex: Double = js.native
  /**
    * Should we parse the template to find widgets that might be
    * declared in markup inside it?  (Remove for 2.0 and assume true)
    *
    */
  var widgetsInTemplate: Boolean = js.native
  /**
    * add or re-add the default x/y axes to the Chart provided
    *
    * @param chart
    */
  def addXYAxes(chart: Chart2D): js.Any = js.native
  /**
    * Make the color of the chart the new color.
    * The context is changed to the colorPalette, and a reference to chart was added to it a an attribute.
    *
    */
  def changedColor(): Unit = js.native
  /**
    * adjust all charts in this.array according to any changes in window options
    *
    */
  def checkDirty(): Unit = js.native
  /**
    * to stay in sync with onChange, checkDirty is called with a timeout
    *
    */
  def checkDirty1(): Unit = js.native
  /**
    * create a new row in the table with all of the dojo objects.
    *
    */
  def createFunction(): Unit = js.native
  /**
    * deselect all checkboxes inside the function table
    *
    */
  def deselectAll(): Unit = js.native
  /**
    *
    * @param i
    */
  def drawOne(i: js.Any): Unit = js.native
  /**
    * erase the chart inside this.array with the index i
    *
    * @param i index to this.array that represents the current row number in the table
    */
  def erase(i: Double): Unit = js.native
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
  @JSName("get")
  def get_attachScope(property: attachScope): js.Object = js.native
  @JSName("get")
  def get_chartIndex(property: chartIndex): Double = js.native
  @JSName("get")
  def get_checkboxIndex(property: checkboxIndex): Double = js.native
  @JSName("get")
  def get_colorBoxFieldsetIndex(property: colorBoxFieldsetIndex): Double = js.native
  @JSName("get")
  def get_colorIndex(property: colorIndex): Double = js.native
  @JSName("get")
  def get_contextRequire(property: contextRequire): js.Function = js.native
  @JSName("get")
  def get_dropDownIndex(property: dropDownIndex): Double = js.native
  @JSName("get")
  def get_evaluatedExpression(property: evaluatedExpression): Double = js.native
  @JSName("get")
  def get_expressionIndex(property: expressionIndex): Double = js.native
  @JSName("get")
  def get_funcNumberIndex(property: funcNumberIndex): Double = js.native
  @JSName("get")
  def get_functionMode(property: functionMode): Double = js.native
  @JSName("get")
  def get_functionRef(property: functionRef): Double = js.native
  @JSName("get")
  def get_searchContainerNode(property: searchContainerNode): Boolean = js.native
  @JSName("get")
  def get_statusIndex(property: statusIndex): Double = js.native
  @JSName("get")
  def get_templatePath(property: templatePath): String = js.native
  @JSName("get")
  def get_templateString(property: templateString): String = js.native
  @JSName("get")
  def get_tooltipIndex(property: tooltipIndex): Double = js.native
  @JSName("get")
  def get_widgetsInTemplate(property: widgetsInTemplate): Boolean = js.native
  /**
    * if something in the window options is changed, this is called
    *
    */
  def makeDirty(): Unit = js.native
  /**
    * The delete button's onClick method.
    * Delete all of the selected rows.
    *
    */
  def onDelete(): Unit = js.native
  /**
    *
    */
  def onDraw(): Unit = js.native
  /**
    * the erase button's onClick method
    * it see's if the checkbox is checked and then erases it if it is.
    *
    */
  def onErase(): Unit = js.native
  /**
    * Track specified handles and remove/destroy them when this instance is destroyed, unless they were
    * already removed/destroyed manually.
    *
    */
  def own(): js.Any = js.native
  /**
    * select all checkboxes inside the function table
    *
    */
  def selectAll(): Unit = js.native
  /**
    * set the status of the row i to be status
    *
    * @param i index of this.array as well as a row index
    * @param status either Error, Hidden, or Drawn
    */
  def setStatus(i: Double, status: String): Unit = js.native
  @JSName("set")
  def set_attachScope(property: attachScope, value: js.Object): Unit = js.native
  @JSName("set")
  def set_chartIndex(property: chartIndex, value: Double): Unit = js.native
  @JSName("set")
  def set_checkboxIndex(property: checkboxIndex, value: Double): Unit = js.native
  @JSName("set")
  def set_colorBoxFieldsetIndex(property: colorBoxFieldsetIndex, value: Double): Unit = js.native
  @JSName("set")
  def set_colorIndex(property: colorIndex, value: Double): Unit = js.native
  @JSName("set")
  def set_contextRequire(property: contextRequire, value: js.Function): Unit = js.native
  @JSName("set")
  def set_dropDownIndex(property: dropDownIndex, value: Double): Unit = js.native
  @JSName("set")
  def set_evaluatedExpression(property: evaluatedExpression, value: Double): Unit = js.native
  @JSName("set")
  def set_expressionIndex(property: expressionIndex, value: Double): Unit = js.native
  @JSName("set")
  def set_funcNumberIndex(property: funcNumberIndex, value: Double): Unit = js.native
  @JSName("set")
  def set_functionMode(property: functionMode, value: Double): Unit = js.native
  @JSName("set")
  def set_functionRef(property: functionRef, value: Double): Unit = js.native
  @JSName("set")
  def set_searchContainerNode(property: searchContainerNode, value: Boolean): Unit = js.native
  @JSName("set")
  def set_statusIndex(property: statusIndex, value: Double): Unit = js.native
  @JSName("set")
  def set_style(property: style, value: String): Unit = js.native
  @JSName("set")
  def set_templatePath(property: templatePath, value: String): Unit = js.native
  @JSName("set")
  def set_templateString(property: templateString, value: String): Unit = js.native
  @JSName("set")
  def set_tooltipIndex(property: tooltipIndex, value: Double): Unit = js.native
  @JSName("set")
  def set_widgetsInTemplate(property: widgetsInTemplate, value: Boolean): Unit = js.native
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
  def watch_chartIndex(
    property: chartIndex,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_checkboxIndex(
    property: checkboxIndex,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_colorBoxFieldsetIndex(
    property: colorBoxFieldsetIndex,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_colorIndex(
    property: colorIndex,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
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
  def watch_dropDownIndex(
    property: dropDownIndex,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_evaluatedExpression(
    property: evaluatedExpression,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_expressionIndex(
    property: expressionIndex,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_funcNumberIndex(
    property: funcNumberIndex,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_functionMode(
    property: functionMode,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_functionRef(
    property: functionRef,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
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
  def watch_statusIndex(
    property: statusIndex,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
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
  def watch_tooltipIndex(
    property: tooltipIndex,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
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

