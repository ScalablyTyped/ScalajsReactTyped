package typingsJapgolly.actioncable

import typingsJapgolly.actioncable.ActionCable.Cable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actioncable", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def createConsumer(): Cable = js.native
  def createConsumer(url: String): Cable = js.native
}

