package typingsJapgolly.backlogJs.mod.Entity.File

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrowserFileData extends FileData {
  var blob: js.UndefOr[js.Function0[js.Promise[Blob]]] = js.undefined
  var body: js.Any
  var url: String
}

object BrowserFileData {
  @scala.inline
  def apply(body: js.Any, url: String, blob: js.UndefOr[CallbackTo[js.Promise[Blob]]] = js.undefined): BrowserFileData = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    blob.foreach(p => __obj.updateDynamic("blob")(p.toJsFn))
    __obj.asInstanceOf[BrowserFileData]
  }
}

