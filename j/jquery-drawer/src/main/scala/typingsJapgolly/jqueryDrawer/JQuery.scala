package typingsJapgolly.jqueryDrawer

import typingsJapgolly.jqueryDrawer.jqueryDrawerStrings.close
import typingsJapgolly.jqueryDrawer.jqueryDrawerStrings.destroy
import typingsJapgolly.jqueryDrawer.jqueryDrawerStrings.drawerDotclosed
import typingsJapgolly.jqueryDrawer.jqueryDrawerStrings.drawerDotopened
import typingsJapgolly.jqueryDrawer.jqueryDrawerStrings.open
import typingsJapgolly.jqueryDrawer.jqueryDrawerStrings.toggle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  def drawer(): JQuery = js.native
  def drawer(options: JQueryDrawerOptions): JQuery = js.native
  @JSName("drawer")
  def drawer_close(method: close): JQuery = js.native
  @JSName("drawer")
  def drawer_destroy(method: destroy): JQuery = js.native
  @JSName("drawer")
  def drawer_open(method: open): JQuery = js.native
  @JSName("drawer")
  def drawer_toggle(method: toggle): JQuery = js.native
  @JSName("on")
  def on_drawerclosed(event: drawerDotclosed, handler: js.Function0[Unit]): JQuery = js.native
  @JSName("on")
  def on_draweropened(event: drawerDotopened, handler: js.Function0[Unit]): JQuery = js.native
}

