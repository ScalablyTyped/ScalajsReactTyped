package typingsJapgolly.exceljs

import typingsJapgolly.exceljs.mod.Anchor
import typingsJapgolly.exceljs.mod.ImageHyperlinkValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  editAs ? :string,   hyperlinks ? :exceljs.exceljs.ImageHyperlinkValue} & exceljs.exceljs.ImageRange */
trait editAsstringhyperlinksIma extends js.Object {
  var br: AnonCol | Anchor
  var editAs: js.UndefOr[String] = js.undefined
  var hyperlinks: js.UndefOr[ImageHyperlinkValue] = js.undefined
  var tl: AnonCol | Anchor
}

object editAsstringhyperlinksIma {
  @scala.inline
  def apply(
    br: AnonCol | Anchor,
    tl: AnonCol | Anchor,
    editAs: String = null,
    hyperlinks: ImageHyperlinkValue = null
  ): editAsstringhyperlinksIma = {
    val __obj = js.Dynamic.literal(br = br.asInstanceOf[js.Any], tl = tl.asInstanceOf[js.Any])
    if (editAs != null) __obj.updateDynamic("editAs")(editAs.asInstanceOf[js.Any])
    if (hyperlinks != null) __obj.updateDynamic("hyperlinks")(hyperlinks.asInstanceOf[js.Any])
    __obj.asInstanceOf[editAsstringhyperlinksIma]
  }
}

