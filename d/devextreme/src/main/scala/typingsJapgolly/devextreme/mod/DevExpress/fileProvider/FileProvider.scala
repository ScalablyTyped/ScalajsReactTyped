package typingsJapgolly.devextreme.mod.DevExpress.fileProvider

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.devextreme.mod._Global_.JQueryPromise
import typingsJapgolly.devextreme.mod._Global_.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileProvider extends js.Object {
  /** Gets the specified items' content. */
  def getItemContent(items: js.Array[_]): Promise[_] with JQueryPromise[_]
}

object FileProvider {
  @scala.inline
  def apply(getItemContent: js.Array[js.Any] => CallbackTo[Promise[js.Any] with JQueryPromise[js.Any]]): FileProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getItemContent")(js.Any.fromFunction1((t0: js.Array[js.Any]) => getItemContent(t0).runNow()))
    __obj.asInstanceOf[FileProvider]
  }
}

