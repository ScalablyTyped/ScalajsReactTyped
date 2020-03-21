package typingsJapgolly.googleAppsScript.GoogleAppsScript.Script

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A builder for document triggers.
  */
trait DocumentTriggerBuilder extends js.Object {
  def create(): Trigger
  def onOpen(): DocumentTriggerBuilder
}

object DocumentTriggerBuilder {
  @scala.inline
  def apply(create: CallbackTo[Trigger], onOpen: CallbackTo[DocumentTriggerBuilder]): DocumentTriggerBuilder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(create.toJsFn)
    __obj.updateDynamic("onOpen")(onOpen.toJsFn)
    __obj.asInstanceOf[DocumentTriggerBuilder]
  }
}

