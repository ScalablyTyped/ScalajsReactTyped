package typingsJapgolly.restfulJs.mod

import typingsJapgolly.restfulJs.AnonData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemberResponse[T] extends ResponseBase {
  def apply(): AnonData[T] = js.native
  def body(): ResponseBody[T] = js.native
}

