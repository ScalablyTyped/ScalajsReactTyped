package typingsJapgolly.whenDomReady

import org.scalajs.dom.raw.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("when-dom-ready", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(): js.Promise[Unit] = js.native
  def apply(callback: js.Function0[Unit]): js.Promise[Unit] = js.native
  def apply(callback: js.Function0[Unit], document: EventTarget): js.Promise[Unit] = js.native
  def apply(document: typingsJapgolly.std.EventTarget): js.Promise[Unit] = js.native
  def resume[T](): js.Function1[/* value */ T, js.Promise[T]] = js.native
  def resume[T](document: EventTarget): js.Function1[/* value */ T, js.Promise[T]] = js.native
}

