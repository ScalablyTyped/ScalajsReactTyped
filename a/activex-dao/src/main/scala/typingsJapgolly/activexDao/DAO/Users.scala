package typingsJapgolly.activexDao.DAO

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Users extends js.Object {
  val Count: Double = js.native
  def apply(Item: String): User = js.native
  def apply(Item: Double): User = js.native
  def Append(User: User): Unit = js.native
  def Delete(Name: String): Unit = js.native
  def Item(Item: String): User = js.native
  def Item(Item: Double): User = js.native
  def Refresh(): Unit = js.native
}

