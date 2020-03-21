package typingsJapgolly.jsforce.mod

import typingsJapgolly.jsforce.chatterMod.RequestParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsforce", "Request")
@js.native
class Request[T] protected ()
  extends typingsJapgolly.jsforce.chatterMod.Request[T] {
  def this(chatter: typingsJapgolly.jsforce.chatterMod.Chatter, params: RequestParams) = this()
}

