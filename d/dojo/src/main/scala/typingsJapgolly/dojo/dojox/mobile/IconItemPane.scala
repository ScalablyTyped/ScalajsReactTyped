package typingsJapgolly.dojo.dojox.mobile

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.dojo.AnonUnwatch
import typingsJapgolly.dojo.dojoStrings.closeIcon
import typingsJapgolly.dojo.dojoStrings.closeIconRole
import typingsJapgolly.dojo.dojoStrings.closeIconTitle
import typingsJapgolly.dojo.dojoStrings.iconPos
import typingsJapgolly.dojo.dojoStrings.label
import typingsJapgolly.dojo.dojoStrings.tabIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/_IconItemPane.html
  *
  * An internal widget used for IconContainer.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
@JSGlobal("dojox.mobile._IconItemPane")
@js.native
class IconItemPane () extends Pane {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * CSS class for the close icon.
    *
    */
  var closeIcon: String = js.native
  /**
    * The HTML role of the close icon. Example: "button".
    *
    */
  var closeIconRole: String = js.native
  /**
    * The title of the close icon.
    *
    */
  var closeIconTitle: String = js.native
  /**
    * The default icon position for child items.
    *
    */
  var iconPos: String = js.native
  /**
    * The label of the item.
    *
    */
  var label: String = js.native
  /**
    * Tab index for the close button, such that users can hit the tab
    * key to focus on it.
    *
    */
  var tabIndex: String = js.native
  @JSName("get")
  def get_closeIcon(property: closeIcon): String = js.native
  @JSName("get")
  def get_closeIconRole(property: closeIconRole): String = js.native
  @JSName("get")
  def get_closeIconTitle(property: closeIconTitle): String = js.native
  @JSName("get")
  def get_iconPos(property: iconPos): String = js.native
  @JSName("get")
  def get_label(property: label): String = js.native
  @JSName("get")
  def get_tabIndex(property: tabIndex): String = js.native
  /**
    * Hides the widget.
    *
    */
  def hide(): Unit = js.native
  /**
    * Tests whether the widget is open.
    *
    * @param e
    */
  def isOpen(e: js.Any): Boolean = js.native
  @JSName("set")
  def set_closeIcon(property: closeIcon, value: String): Unit = js.native
  @JSName("set")
  def set_closeIconRole(property: closeIconRole, value: String): Unit = js.native
  @JSName("set")
  def set_closeIconTitle(property: closeIconTitle, value: String): Unit = js.native
  @JSName("set")
  def set_iconPos(property: iconPos, value: String): Unit = js.native
  @JSName("set")
  def set_label(property: label, value: String): Unit = js.native
  @JSName("set")
  def set_tabIndex(property: tabIndex, value: String): Unit = js.native
  /**
    * Shows the widget.
    *
    */
  def show(): Unit = js.native
  @JSName("watch")
  def watch_closeIcon(
    property: closeIcon,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_closeIconRole(
    property: closeIconRole,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_closeIconTitle(
    property: closeIconTitle,
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
  def watch_tabIndex(
    property: tabIndex,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
}

