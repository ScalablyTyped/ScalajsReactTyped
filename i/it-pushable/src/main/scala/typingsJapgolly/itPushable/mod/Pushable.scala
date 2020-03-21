package typingsJapgolly.itPushable.mod

import typingsJapgolly.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pushable[T, R] extends AsyncIterable[R] {
  def end(): this.type = js.native
  def end(err: js.Error): this.type = js.native
  def push(value: T): this.type = js.native
}

