package typingsJapgolly.antd

import typingsJapgolly.antd.esUploadInterfaceMod.UploadFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FileList extends js.Object {
  var fileList: js.Array[UploadFile]
}

object Anon_FileList {
  @scala.inline
  def apply(fileList: js.Array[UploadFile]): Anon_FileList = {
    val __obj = js.Dynamic.literal(fileList = fileList.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_FileList]
  }
}

