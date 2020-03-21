package typingsJapgolly.jpm

import typingsJapgolly.jpm.FFAddonSDK.Tab
import typingsJapgolly.jpm.jpmStrings.activate
import typingsJapgolly.jpm.jpmStrings.close
import typingsJapgolly.jpm.jpmStrings.deactivate
import typingsJapgolly.jpm.jpmStrings.load
import typingsJapgolly.jpm.jpmStrings.open
import typingsJapgolly.jpm.jpmStrings.pageshow
import typingsJapgolly.jpm.jpmStrings.ready
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Open, manipulate, and access tabs, and receive tab events
  */
@JSImport("sdk/tabs", JSImport.Namespace)
@js.native
object tabsMod extends js.Object {
  val activeTab: Tab = js.native
  val length: Double = js.native
  @JSName("on")
  def on_activate(event: activate, handler: js.Function1[/* tab */ Tab, _]): Unit = js.native
  @JSName("on")
  def on_close(event: close, handler: js.Function1[/* tab */ Tab, _]): Unit = js.native
  @JSName("on")
  def on_deactivate(event: deactivate, handler: js.Function1[/* tab */ Tab, _]): Unit = js.native
  @JSName("on")
  def on_load(event: load, handler: js.Function1[/* tab */ Tab, _]): Unit = js.native
  @JSName("on")
  def on_open(event: open, handler: js.Function1[/* tab */ Tab, _]): Unit = js.native
  @JSName("on")
  def on_pageshow(event: pageshow, handler: js.Function1[/* tab */ Tab, _]): Unit = js.native
  @JSName("on")
  def on_ready(event: ready, handler: js.Function1[/* tab */ Tab, _]): Unit = js.native
  def open(options: String): Unit = js.native
  def open(options: AnonInBackground): Unit = js.native
}

