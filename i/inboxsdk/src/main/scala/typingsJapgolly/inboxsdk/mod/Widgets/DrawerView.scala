package typingsJapgolly.inboxsdk.mod.Widgets

import typingsJapgolly.inboxsdk.inboxsdkStrings.closing
import typingsJapgolly.inboxsdk.inboxsdkStrings.destroy
import typingsJapgolly.inboxsdk.inboxsdkStrings.preautoclose
import typingsJapgolly.inboxsdk.inboxsdkStrings.slideAnimationDone
import typingsJapgolly.inboxsdk.mod.Common.PreAutoCloseEvent
import typingsJapgolly.inboxsdk.mod.Compose.ComposeView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawerView extends js.Object {
  var destroyed: Boolean = js.native
  def associateComposeView(composeView: ComposeView, closeWithCompose: Boolean): Unit = js.native
  def close(): Unit = js.native
  def disassociateComposeView(): Unit = js.native
  @JSName("on")
  def on_closing(name: closing, cb: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_destroy(name: destroy, cb: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_preautoclose(name: preautoclose, cb: js.Function1[/* event */ PreAutoCloseEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_slideAnimationDone(name: slideAnimationDone, cb: js.Function0[Unit]): Unit = js.native
}

