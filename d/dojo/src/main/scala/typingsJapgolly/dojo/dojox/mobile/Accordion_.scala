package typingsJapgolly.dojo.dojox.mobile

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.dojo.AnonUnwatch
import typingsJapgolly.dojo.dijit.WidgetBase
import typingsJapgolly.dojo.dojoStrings.ChildWidgetProperties
import typingsJapgolly.dojo.dojoStrings.animation
import typingsJapgolly.dojo.dojoStrings.duration
import typingsJapgolly.dojo.dojoStrings.fixedHeight
import typingsJapgolly.dojo.dojoStrings.iconBase
import typingsJapgolly.dojo.dojoStrings.iconPos
import typingsJapgolly.dojo.dojoStrings.roundRect
import typingsJapgolly.dojo.dojoStrings.singleOpen
import typingsJapgolly.dojo.dojoStrings.style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/Accordion.html
  *
  * A container widget that can display a group of child panes in a stacked format.
  * Typically, dojox/mobile/Pane, dojox/mobile/Container, or dojox/mobile/ContentPane are
  * used as child widgets, but Accordion requires no specific child widget.
  * Accordion supports three modes for opening child panes: multiselect, fixed-height,
  * and single-select. Accordion can have rounded corners, and it can lazy-load the
  * content modules.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.dojo.dijit.Contained because Inheritance from two classes. Inlined getIndexInParent, getNextSibling, getPreviousSibling
- typingsJapgolly.dojo.dijit.Container because Inheritance from two classes. Inlined addChild, addChild, buildRendering, getIndexOfChild, hasChildren, removeChild, removeChild */ @JSGlobal("dojox.mobile.Accordion")
@js.native
class Accordion_ () extends WidgetBase {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * These properties can be specified for the children of a dojox/mobile/Accordion.
    *
    */
  var ChildWidgetProperties: js.Object = js.native
  /**
    * If true, animation is used when a pane is opened or
    * collapsed. The animation works only on webkit browsers.
    *
    */
  var animation: Boolean = js.native
  /**
    *
    */
  var duration: Double = js.native
  /**
    * If true, the entire accordion widget has fixed height regardless
    * of the height of each pane; in this mode, there is always an open pane and
    * collapsing a pane can only be done by opening a different pane.
    *
    */
  var fixedHeight: Boolean = js.native
  /**
    * The default icon path for child widgets.
    *
    */
  var iconBase: String = js.native
  /**
    * The default icon position for child widgets.
    *
    */
  var iconPos: String = js.native
  /**
    * If true, the widget shows rounded corners.
    * Adding the "mblAccordionRoundRect" class to domNode has the same effect.
    *
    */
  var roundRect: Boolean = js.native
  /**
    * If true, only one pane is open at a time. The current open pane
    * is collapsed, when another pane is opened.
    *
    */
  var singleOpen: Boolean = js.native
  /**
    * HTML style attributes as cssText string or name/value hash
    *
    */
  @JSName("style")
  var style_Accordion_ : String = js.native
  /**
    * Makes the given widget a child of this widget.
    * Inserts specified child widget's dom node as a child of this widget's
    * container node, and possibly does other processing (such as layout).
    * 
    * @param widget             
    * @param insertIndex               Optional            
    */
  def addChild(widget: WidgetBase): Unit = js.native
  /**
    *
    * @param widget
    * @param insertIndex               Optional
    */
  def addChild(widget: WidgetBase, insertIndex: Double): Unit = js.native
  /**
    * Collapses the given pane to close it.
    *
    * @param pane A pane widget to collapse.
    * @param noAnimation If true, the pane collapses immediately without animation effect.
    */
  def collapse(pane: WidgetBase, noAnimation: Boolean): Unit = js.native
  /**
    * Unhighlights the title bar of the given pane.
    *
    * @param pane A pane widget to unhighlight.
    */
  def deselect(pane: WidgetBase): Unit = js.native
  /**
    * Expands the given pane to make it visible.
    *
    * @param pane A pane widget to expand.
    * @param noAnimation If true, the pane expands immediately without animation effect.
    */
  def expand(pane: WidgetBase, noAnimation: Boolean): Unit = js.native
  /**
    * Returns the index of this widget within its container parent.
    * It returns -1 if the parent does not exist, or if the parent
    * is not a dijit/_Container
    *
    */
  /**
    * Returns the index of this widget within its container parent.
    * It returns -1 if the parent does not exist, or if the parent
    * is not a dijit/_Container
    * 
    */
  def getIndexInParent(): js.Any = js.native
  /**
    * Gets the index of the child in this container or -1 if not found
    *
    * @param child
    */
  /**
    * Gets the index of the child in this container or -1 if not found
    * 
    * @param child             
    */
  def getIndexOfChild(child: WidgetBase): js.Any = js.native
  /**
    * Returns null if this is the last child of the parent,
    * otherwise returns the next element sibling to the "right".
    *
    */
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
  /**
    * Returns null if this is the first child of the parent,
    * otherwise returns the next element sibling to the "left".
    * 
    */
  def getPreviousSibling(): js.Any = js.native
  /**
    *
    */
  def getSelectedPanes(): js.Any = js.native
  @JSName("get")
  def get_ChildWidgetProperties(property: ChildWidgetProperties): js.Object = js.native
  @JSName("get")
  def get_animation(property: animation): Boolean = js.native
  @JSName("get")
  def get_duration(property: duration): Double = js.native
  @JSName("get")
  def get_fixedHeight(property: fixedHeight): Boolean = js.native
  @JSName("get")
  def get_iconBase(property: iconBase): String = js.native
  @JSName("get")
  def get_iconPos(property: iconPos): String = js.native
  @JSName("get")
  def get_roundRect(property: roundRect): Boolean = js.native
  @JSName("get")
  def get_singleOpen(property: singleOpen): Boolean = js.native
  /**
    * Returns true if widget has child widgets, i.e. if this.containerNode contains widgets.
    *
    */
  /**
    * Returns true if widget has child widgets, i.e. if this.containerNode contains widgets.
    * 
    */
  def hasChildren(): Boolean = js.native
  /**
    * Track specified handles and remove/destroy them when this instance is destroyed, unless they were
    * already removed/destroyed manually.
    *
    */
  def own(): js.Any = js.native
  /**
    *
    * @param widget
    */
  /**
    * Removes the passed widget instance from this widget but does
    * not destroy it.  You can also pass in an integer indicating
    * the index within the container to remove (ie, removeChild(5) removes the sixth widget).
    * 
    * @param widget             
    */
  def removeChild(widget: Double): Unit = js.native
  /**
    *
    * @param widget
    */
  /**
    * Removes the passed widget instance from this widget but does
    * not destroy it.  You can also pass in an integer indicating
    * the index within the container to remove (ie, removeChild(5) removes the sixth widget).
    * 
    * @param widget             
    */
  def removeChild(widget: WidgetBase): Unit = js.native
  /**
    *
    */
  def resize(): Unit = js.native
  /**
    * Highlights the title bar of the given pane.
    *
    * @param pane A pane widget to highlight.
    */
  def select(pane: WidgetBase): Unit = js.native
  @JSName("set")
  def set_ChildWidgetProperties(property: ChildWidgetProperties, value: js.Object): Unit = js.native
  @JSName("set")
  def set_animation(property: animation, value: Boolean): Unit = js.native
  @JSName("set")
  def set_duration(property: duration, value: Double): Unit = js.native
  @JSName("set")
  def set_fixedHeight(property: fixedHeight, value: Boolean): Unit = js.native
  @JSName("set")
  def set_iconBase(property: iconBase, value: String): Unit = js.native
  @JSName("set")
  def set_iconPos(property: iconPos, value: String): Unit = js.native
  @JSName("set")
  def set_roundRect(property: roundRect, value: Boolean): Unit = js.native
  @JSName("set")
  def set_singleOpen(property: singleOpen, value: Boolean): Unit = js.native
  @JSName("set")
  def set_style(property: style, value: String): Unit = js.native
  @JSName("watch")
  def watch_ChildWidgetProperties(
    property: ChildWidgetProperties,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_animation(
    property: animation,
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
  def watch_fixedHeight(
    property: fixedHeight,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_iconBase(
    property: iconBase,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_iconPos(
    property: iconPos,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_roundRect(
    property: roundRect,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_singleOpen(
    property: singleOpen,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
}

