package typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Footer extends js.Object {
  var content: js.UndefOr[js.Array[StructuralElement]] = js.undefined
  var footerId: js.UndefOr[String] = js.undefined
}

object Footer {
  @scala.inline
  def apply(content: js.Array[StructuralElement] = null, footerId: String = null): Footer = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (footerId != null) __obj.updateDynamic("footerId")(footerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Footer]
  }
}

