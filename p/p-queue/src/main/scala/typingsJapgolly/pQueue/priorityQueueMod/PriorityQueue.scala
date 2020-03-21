package typingsJapgolly.pQueue.priorityQueueMod

import typingsJapgolly.pQueue.PartialPriorityQueueOptio
import typingsJapgolly.pQueue.queueMod.Queue
import typingsJapgolly.pQueue.queueMod.RunFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PriorityQueue extends Queue[PriorityQueueOptions] {
  val _queue: js.Any = js.native
  def enqueue(run: RunFunction, options: PartialPriorityQueueOptio): Unit = js.native
  @JSName("size")
  def size_MPriorityQueue(): Double = js.native
}

