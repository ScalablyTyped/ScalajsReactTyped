package typingsJapgolly.dojo.dojox.form

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.dojo.AnonUnwatch
import typingsJapgolly.dojo.dijit.form.Button
import typingsJapgolly.dojo.dojoStrings.busyLabel
import typingsJapgolly.dojo.dojoStrings.isBusy
import typingsJapgolly.dojo.dojoStrings.timeout
import typingsJapgolly.dojo.dojoStrings.useIcon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/form/BusyButton.html
  *
  * BusyButton is a simple widget which provides implementing more
  * user friendly form submission.
  * When a form gets submitted by a user, many times it is recommended to disable
  * the submit buttons to prevent double submission. BusyButton provides a simple set
  * of features for this purpose
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
@JSGlobal("dojox.form.BusyButton")
@js.native
class BusyButton () extends Button {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * text while button is busy
    *
    */
  var busyLabel: String = js.native
  /**
    *
    */
  var isBusy: Boolean = js.native
  /**
    *
    */
  var timeout: js.Object = js.native
  /**
    * use a busy icon
    *
    */
  var useIcon: Boolean = js.native
  /**
    * if no timeout is set or for other reason the user can put the button back
    * to being idle
    *
    */
  def cancel(): Unit = js.native
  @JSName("get")
  def get_busyLabel(property: busyLabel): String = js.native
  @JSName("get")
  def get_isBusy(property: isBusy): Boolean = js.native
  @JSName("get")
  def get_timeout(property: timeout): js.Object = js.native
  @JSName("get")
  def get_useIcon(property: useIcon): Boolean = js.native
  /**
    * sets state from idle to busy
    *
    */
  def makeBusy(): Unit = js.native
  /**
    * to reset existing timeout and setting a new timeout
    *
    * @param timeout
    */
  def resetTimeout(timeout: Double): Unit = js.native
  @JSName("set")
  def set_busyLabel(property: busyLabel, value: String): Unit = js.native
  @JSName("set")
  def set_isBusy(property: isBusy, value: Boolean): Unit = js.native
  @JSName("set")
  def set_timeout(property: timeout, value: js.Object): Unit = js.native
  @JSName("set")
  def set_useIcon(property: useIcon, value: Boolean): Unit = js.native
  @JSName("watch")
  def watch_busyLabel(
    property: busyLabel,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_isBusy(
    property: isBusy,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_timeout(
    property: timeout,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_useIcon(
    property: useIcon,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
}

