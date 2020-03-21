package typingsJapgolly.pdfmake.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TDocumentInformation extends js.Object {
  var author: js.UndefOr[String] = js.undefined
  var keywords: js.UndefOr[String] = js.undefined
  var subject: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object TDocumentInformation {
  @scala.inline
  def apply(author: String = null, keywords: String = null, subject: String = null, title: String = null): TDocumentInformation = {
    val __obj = js.Dynamic.literal()
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (keywords != null) __obj.updateDynamic("keywords")(keywords.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[TDocumentInformation]
  }
}

