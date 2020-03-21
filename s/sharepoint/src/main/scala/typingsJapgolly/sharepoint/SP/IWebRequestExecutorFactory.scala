package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.microsoftAjax.Sys.Net.WebRequestExecutor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait IWebRequestExecutorFactory extends js.Object {
  def createWebRequestExecutor(): WebRequestExecutor
}

object IWebRequestExecutorFactory {
  @scala.inline
  def apply(createWebRequestExecutor: CallbackTo[WebRequestExecutor]): IWebRequestExecutorFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createWebRequestExecutor")(createWebRequestExecutor.toJsFn)
    __obj.asInstanceOf[IWebRequestExecutorFactory]
  }
}

