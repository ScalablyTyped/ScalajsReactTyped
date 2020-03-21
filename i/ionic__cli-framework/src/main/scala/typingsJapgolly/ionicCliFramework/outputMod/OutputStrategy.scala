package typingsJapgolly.ionicCliFramework.outputMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ionicCliFramework.tasksMod.TaskChain
import typingsJapgolly.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputStrategy extends js.Object {
  val stream: WritableStream
  def createTaskChain(): TaskChain
}

object OutputStrategy {
  @scala.inline
  def apply(createTaskChain: CallbackTo[TaskChain], stream: WritableStream): OutputStrategy = {
    val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
    __obj.updateDynamic("createTaskChain")(createTaskChain.toJsFn)
    __obj.asInstanceOf[OutputStrategy]
  }
}

