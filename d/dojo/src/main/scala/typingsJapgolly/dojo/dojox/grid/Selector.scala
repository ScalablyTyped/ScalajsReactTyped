package typingsJapgolly.dojo.dojox.grid

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.dojo.AnonUnwatch
import typingsJapgolly.dojo.dojoStrings.inputType
import typingsJapgolly.dojo.dojoStrings.noscroll
import typingsJapgolly.dojo.dojoStrings.padBorderWidth
import typingsJapgolly.dojo.dojoStrings.selectionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/_Selector.html
  *
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
@JSGlobal("dojox.grid._Selector")
@js.native
class Selector () extends View {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    *
    */
  var inputType: String = js.native
  /**
    *
    */
  var noscroll: Boolean = js.native
  /**
    *
    */
  var padBorderWidth: Double = js.native
  /**
    *
    */
  var selectionMode: String = js.native
  @JSName("get")
  def get_inputType(property: inputType): String = js.native
  @JSName("get")
  def get_noscroll(property: noscroll): Boolean = js.native
  @JSName("get")
  def get_padBorderWidth(property: padBorderWidth): Double = js.native
  @JSName("get")
  def get_selectionMode(property: selectionMode): String = js.native
  /**
    *
    * @param inIndex
    */
  def onDeselected(inIndex: js.Any): Unit = js.native
  /**
    *
    * @param inIndex
    */
  def onSelected(inIndex: js.Any): Unit = js.native
  @JSName("set")
  def set_inputType(property: inputType, value: String): Unit = js.native
  @JSName("set")
  def set_noscroll(property: noscroll, value: Boolean): Unit = js.native
  @JSName("set")
  def set_padBorderWidth(property: padBorderWidth, value: Double): Unit = js.native
  @JSName("set")
  def set_selectionMode(property: selectionMode, value: String): Unit = js.native
  @JSName("watch")
  def watch_inputType(
    property: inputType,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_noscroll(
    property: noscroll,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_padBorderWidth(
    property: padBorderWidth,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_selectionMode(
    property: selectionMode,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
}

