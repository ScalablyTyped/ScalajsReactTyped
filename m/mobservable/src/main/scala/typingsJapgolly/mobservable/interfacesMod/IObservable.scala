package typingsJapgolly.mobservable.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObservable extends js.Object {
  def observe(callback: js.Function1[/* repeated */ js.Any, Unit]): Lambda = js.native
  def observe(callback: js.Function1[/* repeated */ js.Any, Unit], fireImmediately: Boolean): Lambda = js.native
}

