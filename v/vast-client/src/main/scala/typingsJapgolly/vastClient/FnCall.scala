package typingsJapgolly.vastClient

import typingsJapgolly.std.Error
import typingsJapgolly.std.XMLDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply(err: Null, xml: XMLDocument): Unit = js.native
  def apply(err: Error): Unit = js.native
}

