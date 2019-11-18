package typingsJapgolly.reactDashDom.reactDashDomMod

import typingsJapgolly.react.reactMod.ReactChild
import typingsJapgolly.react.reactMod.ReactNodeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Root extends js.Object {
  def render(children: ReactChild): Unit = js.native
  def render(children: ReactChild, callback: js.Function0[Unit]): Unit = js.native
  def render(children: ReactNodeArray): Unit = js.native
  def render(children: ReactNodeArray, callback: js.Function0[Unit]): Unit = js.native
  def unmount(): Unit = js.native
  def unmount(callback: js.Function0[Unit]): Unit = js.native
}

