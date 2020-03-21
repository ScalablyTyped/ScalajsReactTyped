package typingsJapgolly.w3cScreenOrientation

import typingsJapgolly.std.EventTarget
import typingsJapgolly.std.Event_
import typingsJapgolly.w3cScreenOrientation.w3cScreenOrientationStrings.change
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScreenOrientation extends EventTarget {
  val angle: Double = js.native
  val `type`: OrientationType = js.native
  @JSName("addEventListener")
  def addEventListener_change(`type`: change, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  def lock(orientation: ScreenOrientationLockType): js.Promise[Unit] = js.native
  def unlock(): Unit = js.native
}

