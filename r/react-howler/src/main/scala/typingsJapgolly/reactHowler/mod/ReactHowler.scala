package typingsJapgolly.reactHowler.mod

import typingsJapgolly.howler.mod.Howl
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactHowler
  extends Component[Props, js.Object, js.Any] {
  var howler: Howl = js.native
  def duration(): Double = js.native
  def duration(id: Double): Double = js.native
  def howlerState(): HOWLER_STATE = js.native
  def seek(time: Double): Double = js.native
  def stop(): Unit = js.native
  def stop(id: Double): Unit = js.native
}

