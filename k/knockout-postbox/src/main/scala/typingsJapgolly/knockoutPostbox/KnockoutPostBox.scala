package typingsJapgolly.knockoutPostbox

import typingsJapgolly.knockout.KnockoutSubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutPostBox extends js.Object {
  def defaultComparer[T](newValue: T, oldValue: T): Boolean = js.native
  def publish[T](topic: String): Unit = js.native
  def publish[T](topic: String, value: T): Unit = js.native
  def reset(): Unit = js.native
  def serializer(`object`: js.Any): String = js.native
  def subscribe[T](topic: String, handler: js.Function1[/* value */ T, Unit]): KnockoutSubscription = js.native
  def subscribe[T](topic: String, handler: js.Function1[/* value */ T, Unit], target: js.Any): KnockoutSubscription = js.native
}

