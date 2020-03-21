package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.Callback
import typingsJapgolly.baiduApp.baiduAppStrings.doc
import typingsJapgolly.baiduApp.baiduAppStrings.docx
import typingsJapgolly.baiduApp.baiduAppStrings.pdf
import typingsJapgolly.baiduApp.baiduAppStrings.ppt
import typingsJapgolly.baiduApp.baiduAppStrings.pptx
import typingsJapgolly.baiduApp.baiduAppStrings.xls
import typingsJapgolly.baiduApp.baiduAppStrings.xlsx
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenDocumentOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 文件路径，可通过 downFile 获得
  		 */
  var filePath: String
  /**
  		 * 文件类型，指定文件类型打开文件，有效值 doc, xls, ppt, pdf, docx, xlsx, pptx
  		 */
  var fileType: js.UndefOr[doc | xls | ppt | pdf | docx | xlsx | pptx] = js.undefined
}

object OpenDocumentOptions {
  @scala.inline
  def apply(
    filePath: String,
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null,
    fileType: doc | xls | ppt | pdf | docx | xlsx | pptx = null,
    success: js.Any => Callback = null
  ): OpenDocumentOptions = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (fileType != null) __obj.updateDynamic("fileType")(fileType.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: js.Any) => success(t0).runNow()))
    __obj.asInstanceOf[OpenDocumentOptions]
  }
}

