package typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Footnote extends js.Object {
  var content: js.UndefOr[js.Array[StructuralElement]] = js.undefined
  var footnoteId: js.UndefOr[String] = js.undefined
}

object Footnote {
  @scala.inline
  def apply(content: js.Array[StructuralElement] = null, footnoteId: String = null): Footnote = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (footnoteId != null) __obj.updateDynamic("footnoteId")(footnoteId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Footnote]
  }
}

