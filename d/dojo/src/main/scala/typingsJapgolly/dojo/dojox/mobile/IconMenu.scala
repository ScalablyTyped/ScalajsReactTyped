package typingsJapgolly.dojo.dojox.mobile

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.dojo.AnonUnwatch
import typingsJapgolly.dojo.dijit.WidgetBase
import typingsJapgolly.dojo.dojoStrings.childItemClass
import typingsJapgolly.dojo.dojoStrings.cols
import typingsJapgolly.dojo.dojoStrings.iconBase
import typingsJapgolly.dojo.dojoStrings.iconPos
import typingsJapgolly.dojo.dojoStrings.selectOne
import typingsJapgolly.dojo.dojoStrings.style
import typingsJapgolly.dojo.dojoStrings.tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/IconMenu.html
  *
  * A pop-up menu.
  * The dojox/mobile/IconMenu widget displays a pop-up menu just
  * like iPhone's call options menu that is shown while you are on a
  * call. Each menu item must be dojox/mobile/IconMenuItem.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.dojo.dijit.Contained because Inheritance from two classes. Inlined getIndexInParent, getNextSibling, getPreviousSibling
- typingsJapgolly.dojo.dijit.Container because Inheritance from two classes. Inlined addChild, addChild, buildRendering, getIndexOfChild, hasChildren, removeChild, removeChild */ @JSGlobal("dojox.mobile.IconMenu")
@js.native
class IconMenu () extends WidgetBase {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * The name of the CSS class of menu items.
    *
    */
  var childItemClass: String = js.native
  /**
    * The number of child items in a row.
    *
    */
  var cols: Double = js.native
  /**
    * The default icon path for child items.
    *
    */
  var iconBase: String = js.native
  /**
    * The default icon position for child items.
    *
    */
  var iconPos: String = js.native
  /**
    *
    */
  var selectOne: Boolean = js.native
  /**
    * HTML style attributes as cssText string or name/value hash
    *
    */
  @JSName("style")
  var style_IconMenu: String = js.native
  /**
    * A name of html tag to create as domNode.
    *
    */
  var tag: String = js.native
  /**
    * The default animated transition effect for child items.
    *
    */
  var transition: String = js.native
  /**
    *
    * @param widget
    * @param insertIndex               Optional
    */
  def addChild(widget: js.Any, insertIndex: Double): Unit = js.native
  /**
    * Makes the given widget a child of this widget.
    * Inserts specified child widget's dom node as a child of this widget's
    * container node, and possibly does other processing (such as layout).
    * 
    * @param widget             
    * @param insertIndex               Optional            
    */
  def addChild(widget: WidgetBase): Unit = js.native
  def addChild(widget: WidgetBase, insertIndex: Double): Unit = js.native
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
  @JSName("get")
  def get_childItemClass(property: childItemClass): String = js.native
  @JSName("get")
  def get_cols(property: cols): Double = js.native
  @JSName("get")
  def get_iconBase(property: iconBase): String = js.native
  @JSName("get")
  def get_iconPos(property: iconPos): String = js.native
  @JSName("get")
  def get_selectOne(property: selectOne): Boolean = js.native
  @JSName("get")
  def get_tag(property: tag): String = js.native
  @JSName("get")
  def get_transition(property: typingsJapgolly.dojo.dojoStrings.transition): String = js.native
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
    *
    */
  def hide(): Unit = js.native
  /**
    * Track specified handles and remove/destroy them when this instance is destroyed, unless they were
    * already removed/destroyed manually.
    *
    */
  def own(): js.Any = js.native
  /**
    *
    */
  def refresh(): Unit = js.native
  /**
    * Removes the passed widget instance from this widget but does
    * not destroy it.  You can also pass in an integer indicating
    * the index within the container to remove (ie, removeChild(5) removes the sixth widget).
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
    * Removes the passed widget instance from this widget but does
    * not destroy it.  You can also pass in an integer indicating
    * the index within the container to remove (ie, removeChild(5) removes the sixth widget).
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
  @JSName("set")
  def set_childItemClass(property: childItemClass, value: String): Unit = js.native
  @JSName("set")
  def set_cols(property: cols, value: Double): Unit = js.native
  @JSName("set")
  def set_iconBase(property: iconBase, value: String): Unit = js.native
  @JSName("set")
  def set_iconPos(property: iconPos, value: String): Unit = js.native
  @JSName("set")
  def set_selectOne(property: selectOne, value: Boolean): Unit = js.native
  @JSName("set")
  def set_style(property: style, value: String): Unit = js.native
  @JSName("set")
  def set_tag(property: tag, value: String): Unit = js.native
  @JSName("set")
  def set_transition(property: typingsJapgolly.dojo.dojoStrings.transition, value: String): Unit = js.native
  @JSName("watch")
  def watch_childItemClass(
    property: childItemClass,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_cols(
    property: cols,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
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
  def watch_selectOne(
    property: selectOne,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_tag(
    property: tag,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_transition(
    property: typingsJapgolly.dojo.dojoStrings.transition,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
}

