package typingsJapgolly.blockingProxy.webdriverProxyMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.blockingProxy.webdriverCommandsMod.WebDriverCommand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebDriverBarrier extends js.Object {
  def onCommand(command: WebDriverCommand): js.Promise[Unit]
}

object WebDriverBarrier {
  @scala.inline
  def apply(onCommand: WebDriverCommand => CallbackTo[js.Promise[Unit]]): WebDriverBarrier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onCommand")(js.Any.fromFunction1((t0: typingsJapgolly.blockingProxy.webdriverCommandsMod.WebDriverCommand) => onCommand(t0).runNow()))
    __obj.asInstanceOf[WebDriverBarrier]
  }
}

