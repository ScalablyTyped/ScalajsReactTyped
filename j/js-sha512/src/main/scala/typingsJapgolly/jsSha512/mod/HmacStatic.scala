package typingsJapgolly.jsSha512.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HmacStatic extends js.Object {
  def apply(key: String, messageToHash: String): String = js.native
  def create(key: String): Hash = js.native
  def update(key: String, messageToHash: String): Hash = js.native
}

