package typingsJapgolly.std

import typingsJapgolly.std.stdStrings.unhandledrejection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_unhandledrejection extends js.Object {
  def apply(
    `type`: unhandledrejection,
    listener: js.ThisFunction1[/* this */ Window_, /* ev */ PromiseRejectionEvent, _]
  ): Unit = js.native
  def apply(
    `type`: unhandledrejection,
    listener: js.ThisFunction1[/* this */ Window_, /* ev */ PromiseRejectionEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: unhandledrejection,
    listener: js.ThisFunction1[/* this */ Window_, /* ev */ PromiseRejectionEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
}

