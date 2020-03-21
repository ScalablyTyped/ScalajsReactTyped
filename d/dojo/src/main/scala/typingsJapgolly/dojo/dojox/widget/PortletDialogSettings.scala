package typingsJapgolly.dojo.dojox.widget

import typingsJapgolly.dojo.AnonUnwatch
import typingsJapgolly.dojo.dojoStrings.dimensions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/widget/PortletDialogSettings.html
  *
  * A settings widget to be used with a dojox.widget.Portlet, which displays
  * the contents of this widget in a dijit.Dialog box.
  *
  * @param props
  * @param node
  */
@JSGlobal("dojox.widget.PortletDialogSettings")
@js.native
class PortletDialogSettings protected () extends PortletSettings {
  def this(props: js.Any, node: js.Any) = this()
  /**
    * The size of the dialog to display.  This defaults to [300, 300]
    *
    */
  var dimensions: js.Array[_] = js.native
  @JSName("get")
  def get_dimensions(property: dimensions): js.Array[_] = js.native
  @JSName("set")
  def set_dimensions(property: dimensions, value: js.Array[_]): Unit = js.native
  @JSName("watch")
  def watch_dimensions(
    property: dimensions,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Array[_]], 
      /* newValue */ js.UndefOr[js.Array[_]], 
      Unit
    ]
  ): AnonUnwatch = js.native
}

