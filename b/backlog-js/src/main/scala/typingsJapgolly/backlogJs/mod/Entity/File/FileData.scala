package typingsJapgolly.backlogJs.mod.Entity.File

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Blob
import typingsJapgolly.node.streamMod.PassThrough
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.backlogJs.mod.Entity.File.NodeFileData
  - typingsJapgolly.backlogJs.mod.Entity.File.BrowserFileData
*/
trait FileData extends js.Object

object FileData {
  @scala.inline
  def NodeFileData(body: PassThrough, filename: String, url: String): FileData = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FileData]
  }
  @scala.inline
  def BrowserFileData(body: js.Any, url: String, blob: js.UndefOr[CallbackTo[js.Promise[Blob]]] = js.undefined): FileData = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    blob.foreach(p => __obj.updateDynamic("blob")(p.toJsFn))
    __obj.asInstanceOf[FileData]
  }
}

