package typingsJapgolly.dojo.dijit

import org.scalajs.dom.raw.HTMLDocument
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.dojo.AnonUnwatch
import typingsJapgolly.dojo.dojoStrings.accelKey
import typingsJapgolly.dojo.dojoStrings.active
import typingsJapgolly.dojo.dojoStrings.attachScope
import typingsJapgolly.dojo.dojoStrings.cssStateNodes
import typingsJapgolly.dojo.dojoStrings.disabled
import typingsJapgolly.dojo.dojoStrings.hovering
import typingsJapgolly.dojo.dojoStrings.iconClass
import typingsJapgolly.dojo.dojoStrings.label
import typingsJapgolly.dojo.dojoStrings.searchContainerNode
import typingsJapgolly.dojo.dojoStrings.shortcutKey
import typingsJapgolly.dojo.dojoStrings.style
import typingsJapgolly.dojo.dojoStrings.templatePath
import typingsJapgolly.dojo.dojoStrings.templateString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/MenuItem.html
  *
  * 
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.dojo.dijit.AttachMixin because Inheritance from two classes. Inlined 
- typingsJapgolly.dojo.dijit.CssStateMixin because Inheritance from two classes. Inlined active, cssStateNodes, hovering
- typingsJapgolly.dojo.dijit.Contained because Inheritance from two classes. Inlined getIndexInParent, getNextSibling, getPreviousSibling
- typingsJapgolly.dojo.dijit.TemplatedMixin because Inheritance from two classes. Inlined attachScope, searchContainerNode, templatePath, templateString, buildRendering, destroyRendering, getCachedTemplate, getCachedTemplate */ @JSGlobal("dijit.MenuItem")
@js.native
class MenuItem () extends Widget {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * Text for the accelerator (shortcut) key combination, a control, alt, etc. modified keystroke meant to
    * execute the menu item regardless of where the focus is on the page.
    * 
    * Note that although Menu can display accelerator keys, there is no infrastructure to actually catch and
    * execute those accelerators.
    * 
    */
  var accelKey: String = js.native
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
    * If true, the menu item is disabled.
    * If false, the menu item is enabled.
    * 
    */
  var disabled: Boolean = js.native
  /**
    * True if cursor is over this widget
    * 
    */
  var hovering: Boolean = js.native
  /**
    * Class to apply to DOMNode to make it display an icon.
    * 
    */
  var iconClass: String = js.native
  /**
    * Menu text as HTML
    * 
    */
  var label: String = js.native
  /**
    * 
    */
  var searchContainerNode: Boolean = js.native
  /**
    * Single character (underlined when the parent Menu is focused) used to navigate directly to this widget,
    * also known as a mnemonic.
    * This is denoted in the label by surrounding the single character with {}.
    * For example, if label="{F}ile", then shortcutKey="F".
    * 
    */
  var shortcutKey: String = js.native
  /**
    * HTML style attributes as cssText string or name/value hash
    * 
    */
  @JSName("style")
  var style_MenuItem: String = js.native
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
    * Focus on this MenuItem
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
  /**
    * Returns the index of this widget within its container parent.
    * It returns -1 if the parent does not exist, or if the parent
    * is not a dijit/_Container
    * 
    */
  def getIndexInParent(): js.Any = js.native
  /**
    * Returns null if this is the last child of the parent,
    * otherwise returns the next element sibling to the "right".
    * 
    */
  def getNextSibling(): js.Any = js.native
  /**
    * Returns null if this is the first child of the parent,
    * otherwise returns the next element sibling to the "left".
    * 
    */
  def getPreviousSibling(): js.Any = js.native
  @JSName("get")
  def get_accelKey(property: accelKey): String = js.native
  @JSName("get")
  def get_active(property: active): Boolean = js.native
  @JSName("get")
  def get_attachScope(property: attachScope): js.Object = js.native
  @JSName("get")
  def get_cssStateNodes(property: cssStateNodes): js.Object = js.native
  @JSName("get")
  def get_disabled(property: disabled): Boolean = js.native
  @JSName("get")
  def get_hovering(property: hovering): Boolean = js.native
  @JSName("get")
  def get_iconClass(property: iconClass): String = js.native
  @JSName("get")
  def get_label(property: label): String = js.native
  @JSName("get")
  def get_searchContainerNode(property: searchContainerNode): Boolean = js.native
  @JSName("get")
  def get_shortcutKey(property: shortcutKey): String = js.native
  @JSName("get")
  def get_templatePath(property: templatePath): String = js.native
  @JSName("get")
  def get_templateString(property: templateString): String = js.native
  /**
    * User defined function to handle clicks
    * 
    */
  def onClick(): Unit = js.native
  /**
    * Deprecated.   Use set('disabled', bool) instead.
    * 
    * @param disabled             
    */
  def setDisabled(disabled: Boolean): Unit = js.native
  /**
    * Deprecated.   Use set('label', ...) instead.
    * 
    * @param content             
    */
  def setLabel(content: String): Unit = js.native
  @JSName("set")
  def set_accelKey(property: accelKey, value: String): Unit = js.native
  @JSName("set")
  def set_active(property: active, value: Boolean): Unit = js.native
  @JSName("set")
  def set_attachScope(property: attachScope, value: js.Object): Unit = js.native
  @JSName("set")
  def set_cssStateNodes(property: cssStateNodes, value: js.Object): Unit = js.native
  @JSName("set")
  def set_disabled(property: disabled, value: Boolean): Unit = js.native
  @JSName("set")
  def set_hovering(property: hovering, value: Boolean): Unit = js.native
  @JSName("set")
  def set_iconClass(property: iconClass, value: String): Unit = js.native
  @JSName("set")
  def set_label(property: label, value: String): Unit = js.native
  @JSName("set")
  def set_searchContainerNode(property: searchContainerNode, value: Boolean): Unit = js.native
  @JSName("set")
  def set_shortcutKey(property: shortcutKey, value: String): Unit = js.native
  @JSName("set")
  def set_style(property: style, value: String): Unit = js.native
  @JSName("set")
  def set_templatePath(property: templatePath, value: String): Unit = js.native
  @JSName("set")
  def set_templateString(property: templateString, value: String): Unit = js.native
  @JSName("watch")
  def watch_accelKey(
    property: accelKey,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
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
  def watch_disabled(
    property: disabled,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
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
  def watch_iconClass(
    property: iconClass,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_label(
    property: label,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
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
  def watch_shortcutKey(
    property: shortcutKey,
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
}

