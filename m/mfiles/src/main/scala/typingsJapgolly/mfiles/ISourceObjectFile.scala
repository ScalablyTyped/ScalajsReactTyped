package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISourceObjectFile extends js.Object {
  var Extension: String
  var SourceFilePath: String
  var Title: String
  def Clone(): ISourceObjectFile
}

object ISourceObjectFile {
  @scala.inline
  def apply(Clone: CallbackTo[ISourceObjectFile], Extension: String, SourceFilePath: String, Title: String): ISourceObjectFile = {
    val __obj = js.Dynamic.literal(Extension = Extension.asInstanceOf[js.Any], SourceFilePath = SourceFilePath.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.asInstanceOf[ISourceObjectFile]
  }
}

