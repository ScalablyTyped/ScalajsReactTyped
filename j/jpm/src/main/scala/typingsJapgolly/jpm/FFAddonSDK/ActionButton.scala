package typingsJapgolly.jpm.FFAddonSDK

import typingsJapgolly.jpm.AnonDisabled
import typingsJapgolly.jpm.jpmStrings.click
import typingsJapgolly.jpm.jpmStrings.tab
import typingsJapgolly.jpm.jpmStrings.window
import typingsJapgolly.jpm.toolbarMod.ToolbarItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionButton
  extends ActionButtonState
     with ToolbarItem {
  def click(): Unit = js.native
  def destroy(): Unit = js.native
  @JSName("on")
  def on_click(event: click, handler: js.Function1[/* state */ ActionButtonState, _]): Unit = js.native
  @JSName("once")
  def once_click(event: click, handler: js.Function1[/* state */ ActionButtonState, _]): Unit = js.native
  @JSName("removeListener")
  def removeListener_click(event: click, handler: js.Function): Unit = js.native
  def state(target: ActionButton): ActionButtonState = js.native
  def state(target: ActionButton, state: AnonDisabled): ActionButtonState = js.native
  // there's a compromise here by always returning ActionButtonState. It will return undefined if no options are passed
  def state(target: BrowserWindow): ActionButtonState = js.native
  def state(target: BrowserWindow, state: AnonDisabled): ActionButtonState = js.native
  def state(target: Tab): ActionButtonState = js.native
  def state(target: Tab, state: AnonDisabled): ActionButtonState = js.native
  @JSName("state")
  def state_tab(target: tab): ActionButtonState = js.native
  @JSName("state")
  def state_tab(target: tab, state: AnonDisabled): ActionButtonState = js.native
  @JSName("state")
  def state_window(target: window): ActionButtonState = js.native
  @JSName("state")
  def state_window(target: window, state: AnonDisabled): ActionButtonState = js.native
}

