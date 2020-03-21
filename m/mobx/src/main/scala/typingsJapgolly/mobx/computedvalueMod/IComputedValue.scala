package typingsJapgolly.mobx.computedvalueMod

import typingsJapgolly.mobx.observablevalueMod.IValueDidChange
import typingsJapgolly.mobx.utilsMod.Lambda
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IComputedValue[T] extends js.Object {
  def get(): T = js.native
  def observe(listener: js.Function1[/* change */ IValueDidChange[T], Unit]): Lambda = js.native
  def observe(listener: js.Function1[/* change */ IValueDidChange[T], Unit], fireImmediately: Boolean): Lambda = js.native
  def set(value: T): Unit = js.native
}

