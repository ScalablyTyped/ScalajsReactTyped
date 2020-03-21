package typingsJapgolly.bullBoard.mod

import typingsJapgolly.bull.mod.Queue
import typingsJapgolly.express.mod.Express
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  def UI(): Express = js.native
  def createQueues(redisURL: String): CreateQueue = js.native
  def setQueues(bullQueues: js.Array[Queue[_]]): Queue[_] = js.native
  def setQueues(bullQueues: Queue[_]): Queue[_] = js.native
}

