package typingsJapgolly.dojo.dojox.layout

import org.scalajs.dom.raw.HTMLDocument
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.dojo.AnonUnwatch
import typingsJapgolly.dojo.dojoStrings.attachScope
import typingsJapgolly.dojo.dojoStrings.closable
import typingsJapgolly.dojo.dojoStrings.contentClass
import typingsJapgolly.dojo.dojoStrings.dockTo
import typingsJapgolly.dojo.dojoStrings.dockable
import typingsJapgolly.dojo.dojoStrings.duration
import typingsJapgolly.dojo.dojoStrings.iconSrc
import typingsJapgolly.dojo.dojoStrings.maxable
import typingsJapgolly.dojo.dojoStrings.resizable
import typingsJapgolly.dojo.dojoStrings.resizeAxis
import typingsJapgolly.dojo.dojoStrings.searchContainerNode
import typingsJapgolly.dojo.dojoStrings.templatePath
import typingsJapgolly.dojo.dojoStrings.templateString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/layout/FloatingPane.html
  *
  * A non-modal Floating window.
  * Makes a dojox.layout.ContentPane float and draggable by it's title [similar to TitlePane]
  * and over-rides onClick to onDblClick for wipeIn/Out of containerNode
  * provides minimize(dock) / show() and hide() methods, and resize [almost]
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.dojo.dijit.AttachMixin because Inheritance from two classes. Inlined 
- typingsJapgolly.dojo.dijit.TemplatedMixin because Inheritance from two classes. Inlined attachScope, searchContainerNode, templatePath, templateString, buildRendering, destroyRendering, getCachedTemplate, getCachedTemplate */ @JSGlobal("dojox.layout.FloatingPane")
@js.native
class FloatingPane () extends ContentPane {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * Object to which attach points and events will be scoped.  Defaults
    * to 'this'.
    *
    */
  var attachScope: js.Object = js.native
  /**
    * Allow closure of this Node
    *
    */
  var closable: Boolean = js.native
  /**
    * The className to give to the inner node which has the content
    *
    */
  var contentClass: String = js.native
  /**
    * if empty, will create private layout.Dock that scrolls with viewport
    * on bottom span of viewport.
    *
    */
  var dockTo: js.Object = js.native
  /**
    * Allow minimizing of pane if true
    *
    */
  var dockable: Boolean = js.native
  /**
    * Time is MS to spend toggling in/out node
    *
    */
  var duration: Double = js.native
  var focusNode: HTMLElement = js.native
  /**
    * [not implemented yet] will be either icon in titlepane to left
    * of Title, and/or icon show when docked in a fisheye-like dock
    * or maybe dockIcon would be better?
    *
    */
  var iconSrc: String = js.native
  /**
    * Horrible param name for "Can you maximize this floating pane?"
    *
    */
  var maxable: Boolean = js.native
  /**
    * Allow resizing of pane true if true
    *
    */
  var resizable: Boolean = js.native
  /**
    * One of: x | xy | y to limit pane's sizing direction
    *
    */
  var resizeAxis: String = js.native
  /**
    *
    */
  var searchContainerNode: Boolean = js.native
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
    * bring this FloatingPane above all other panes
    *
    */
  def bringToTop(): Unit = js.native
  /**
    * Close and destroy this widget
    *
    */
  def close(): Unit = js.native
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
  def get_closable(property: closable): Boolean = js.native
  @JSName("get")
  def get_contentClass(property: contentClass): String = js.native
  @JSName("get")
  def get_dockTo(property: dockTo): js.Object = js.native
  @JSName("get")
  def get_dockable(property: dockable): Boolean = js.native
  @JSName("get")
  def get_duration(property: duration): Double = js.native
  @JSName("get")
  def get_iconSrc(property: iconSrc): String = js.native
  @JSName("get")
  def get_maxable(property: maxable): Boolean = js.native
  @JSName("get")
  def get_resizable(property: resizable): Boolean = js.native
  @JSName("get")
  def get_resizeAxis(property: resizeAxis): String = js.native
  @JSName("get")
  def get_searchContainerNode(property: searchContainerNode): Boolean = js.native
  @JSName("get")
  def get_templatePath(property: templatePath): String = js.native
  @JSName("get")
  def get_templateString(property: templateString): String = js.native
  /**
    * Close, but do not destroy this FloatingPane
    *
    * @param callback               Optional
    */
  def hide(callback: js.Function): Unit = js.native
  /**
    * Make this FloatingPane full-screen (viewport)
    *
    */
  def maximize(): Unit = js.native
  /**
    * Hide and dock the FloatingPane
    *
    */
  def minimize(): Unit = js.native
  /**
    * Size the FloatingPane and place accordingly
    *
    * @param dim
    */
  def resize(dim: js.Object): Unit = js.native
  /**
    * Update the Title bar with a new string
    *
    * @param title
    */
  def setTitle(title: String): Unit = js.native
  @JSName("set")
  def set_attachScope(property: attachScope, value: js.Object): Unit = js.native
  @JSName("set")
  def set_closable(property: closable, value: Boolean): Unit = js.native
  @JSName("set")
  def set_contentClass(property: contentClass, value: String): Unit = js.native
  @JSName("set")
  def set_dockTo(property: dockTo, value: js.Object): Unit = js.native
  @JSName("set")
  def set_dockable(property: dockable, value: Boolean): Unit = js.native
  @JSName("set")
  def set_duration(property: duration, value: Double): Unit = js.native
  @JSName("set")
  def set_iconSrc(property: iconSrc, value: String): Unit = js.native
  @JSName("set")
  def set_maxable(property: maxable, value: Boolean): Unit = js.native
  @JSName("set")
  def set_resizable(property: resizable, value: Boolean): Unit = js.native
  @JSName("set")
  def set_resizeAxis(property: resizeAxis, value: String): Unit = js.native
  @JSName("set")
  def set_searchContainerNode(property: searchContainerNode, value: Boolean): Unit = js.native
  @JSName("set")
  def set_templatePath(property: templatePath, value: String): Unit = js.native
  @JSName("set")
  def set_templateString(property: templateString, value: String): Unit = js.native
  /**
    * Show the FloatingPane
    *
    * @param callback               Optional
    */
  def show(): Unit = js.native
  def show(callback: js.Function): Unit = js.native
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
  def watch_closable(
    property: closable,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_contentClass(
    property: contentClass,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_dockTo(
    property: dockTo,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_dockable(
    property: dockable,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_duration(
    property: duration,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_iconSrc(
    property: iconSrc,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_maxable(
    property: maxable,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_resizable(
    property: resizable,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_resizeAxis(
    property: resizeAxis,
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

