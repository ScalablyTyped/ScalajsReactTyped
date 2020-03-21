package typingsJapgolly.dojo.dojox.editor.plugins

import org.scalajs.dom.raw.HTMLDocument
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.dojo.AnonUnwatch
import typingsJapgolly.dojo.dijit.Widget
import typingsJapgolly.dojo.dojoStrings.active
import typingsJapgolly.dojo.dojoStrings.attachScope
import typingsJapgolly.dojo.dojoStrings.cellClass
import typingsJapgolly.dojo.dojoStrings.cssStateNodes
import typingsJapgolly.dojo.dojoStrings.defaultTimeout
import typingsJapgolly.dojo.dojoStrings.hovering
import typingsJapgolly.dojo.dojoStrings.searchContainerNode
import typingsJapgolly.dojo.dojoStrings.style
import typingsJapgolly.dojo.dojoStrings.tabIndex
import typingsJapgolly.dojo.dojoStrings.templatePath
import typingsJapgolly.dojo.dojoStrings.templateString
import typingsJapgolly.dojo.dojoStrings.timeoutChangeRate
import typingsJapgolly.dojo.dojoStrings.value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/editor/plugins/_SmileyPalette.html
  *
  * A keyboard accessible emoticon-picking widget (for inserting smiley characters)
  * Grid showing various emoticons.
  * Can be used standalone, or as a popup.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.dojo.dijit.CssStateMixin because Inheritance from two classes. Inlined 
- typingsJapgolly.dojo.dijit.AttachMixin because Inheritance from two classes. Inlined 
- typingsJapgolly.dojo.dijit.PaletteMixin because Inheritance from two classes. Inlined active, cellClass, cssStateNodes, defaultTimeout, dyeClass, hovering, tabIndex, timeoutChangeRate, value, focus, postCreate, onChange
- typingsJapgolly.dojo.dijit.TemplatedMixin because Inheritance from two classes. Inlined attachScope, searchContainerNode, templatePath, templateString, buildRendering, destroyRendering, getCachedTemplate, getCachedTemplate */ @JSGlobal("dojox.editor.plugins._SmileyPalette")
@js.native
class SmileyPalette () extends Widget {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
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
    * CSS class applied to each cell in the palette
    *
    */
  var cellClass: String = js.native
  /**
    * Subclasses may define a cssStateNodes property that lists sub-nodes within the widget that
    * need CSS classes applied on mouse hover/press and focus.
    *
    * Each entry in this optional hash is a an attach-point name (like "upArrowButton") mapped to a CSS class name
    * (like "dijitUpArrowButton"). Example:
    *
    * {
    *     "upArrowButton": "dijitUpArrowButton",
    *     "downArrowButton": "dijitDownArrowButton"
    * }
    * The above will set the CSS class dijitUpArrowButton to the this.upArrowButton DOMNode when it
    *
    * is hovered, etc.
    *
    */
  var cssStateNodes: js.Object = js.native
  /**
    * Number of milliseconds before a held key or button becomes typematic
    *
    */
  var defaultTimeout: Double = js.native
  /**
    * Constructor for Object created for each cell of the palette.
    * dyeClass should implement the dijit/_PaletteMixin.__Dye interface.
    * 
    */
  @JSName("dyeClass")
  var dyeClass_FSmileyPalette: js.Object = js.native
  /**
    * True if cursor is over this widget
    *
    */
  var hovering: Boolean = js.native
  /**
    *
    */
  var searchContainerNode: Boolean = js.native
  /**
    * HTML style attributes as cssText string or name/value hash
    *
    */
  @JSName("style")
  var style_SmileyPalette: String = js.native
  /**
    * Widget tab index.
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
    * The template of this widget.
    *
    */
  var templateString: String = js.native
  /**
    * Fraction of time used to change the typematic timer between events
    * 1.0 means that each typematic event fires at defaultTimeout intervals
    * Less than 1.0 means that each typematic event fires at an increasing faster rate
    *
    */
  var timeoutChangeRate: Double = js.native
  /**
    * Currently selected color/emoticon/etc.
    *
    */
  var value: String = js.native
  /**
    *
    */
  def Emoticon(): Unit = js.native
  /**
    *
    */
  def dyeClass(): Unit = js.native
  /**
    * Focus this widget.  Puts focus on the most recently focused cell.
    *
    */
  /**
    * Focus this widget.  Puts focus on the most recently focused cell.
    * 
    */
  def focus(): Unit = js.native
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
  def get_active(property: active): Boolean = js.native
  @JSName("get")
  def get_attachScope(property: attachScope): js.Object = js.native
  @JSName("get")
  def get_cellClass(property: cellClass): String = js.native
  @JSName("get")
  def get_cssStateNodes(property: cssStateNodes): js.Object = js.native
  @JSName("get")
  def get_defaultTimeout(property: defaultTimeout): Double = js.native
  @JSName("get")
  def get_hovering(property: hovering): Boolean = js.native
  @JSName("get")
  def get_searchContainerNode(property: searchContainerNode): Boolean = js.native
  @JSName("get")
  def get_tabIndex(property: tabIndex): String = js.native
  @JSName("get")
  def get_templatePath(property: templatePath): String = js.native
  @JSName("get")
  def get_templateString(property: templateString): String = js.native
  @JSName("get")
  def get_timeoutChangeRate(property: timeoutChangeRate): Double = js.native
  @JSName("get")
  def get_value(property: value): String = js.native
  /**
    * Callback when a cell is selected.
    *
    * @param value Value corresponding to cell.
    */
  /**
    * Callback when a cell is selected.
    * 
    * @param value Value corresponding to cell.             
    */
  def onChange(value: String): Unit = js.native
  @JSName("set")
  def set_active(property: active, value: Boolean): Unit = js.native
  @JSName("set")
  def set_attachScope(property: attachScope, value: js.Object): Unit = js.native
  @JSName("set")
  def set_cellClass(property: cellClass, value: String): Unit = js.native
  @JSName("set")
  def set_cssStateNodes(property: cssStateNodes, value: js.Object): Unit = js.native
  @JSName("set")
  def set_defaultTimeout(property: defaultTimeout, value: Double): Unit = js.native
  @JSName("set")
  def set_hovering(property: hovering, value: Boolean): Unit = js.native
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
  def set_timeoutChangeRate(property: timeoutChangeRate, value: Double): Unit = js.native
  @JSName("set")
  def set_value(property: value, value: String): Unit = js.native
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
  def watch_cellClass(
    property: cellClass,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
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
  def watch_defaultTimeout(
    property: defaultTimeout,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
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
  def watch_timeoutChangeRate(
    property: timeoutChangeRate,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_value(
    property: value,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
}

@JSGlobal("dojox.editor.plugins._SmileyPalette")
@js.native
object SmileyPalette extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/editor/plugins/_SmileyPalette.Emoticon.html
    *
    * JS Object representing an emoticon
    *
    * @param id
    */
  @js.native
  class Emoticon protected () extends js.Object {
    def this(id: String) = this()
    /**
      *
      */
    var ascii: js.Object = js.native
    /**
      *
      * @param cell
      * @param blankGif
      */
    def fillCell(cell: HTMLElement, blankGif: String): Unit = js.native
    /**
      * Factory to create Emoticon object based on string like ":-)" rather than id like "smile"
      *
      * @param str
      */
    def fromAscii(str: String): Unit = js.native
    /**
      * Returns a emoticon string in ascii representation, ex: :-)
      *
      */
    def getValue(): js.Any = js.native
    /**
      * Return the HTML string for an <img> node that shows this smiley
      *
      * @param clazz
      */
    def imgHtml(clazz: String): js.Any = js.native
  }
  
}

