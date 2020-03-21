package typingsJapgolly.pdfkit.PDFKit

import typingsJapgolly.pdfkit.AnonBottom
import typingsJapgolly.pdfkit.pdfkitStrings.`1Dot3`
import typingsJapgolly.pdfkit.pdfkitStrings.`1Dot4`
import typingsJapgolly.pdfkit.pdfkitStrings.`1Dot5`
import typingsJapgolly.pdfkit.pdfkitStrings.`1Dot6`
import typingsJapgolly.pdfkit.pdfkitStrings.`1Dot7`
import typingsJapgolly.pdfkit.pdfkitStrings.`1Dot7ext3`
import typingsJapgolly.pdfkit.pdfkitStrings.landscape
import typingsJapgolly.pdfkit.pdfkitStrings.portrait
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFDocumentOptions extends js.Object {
  var autoFirstPage: js.UndefOr[Boolean] = js.undefined
  var bufferPages: js.UndefOr[Boolean] = js.undefined
  var compress: js.UndefOr[Boolean] = js.undefined
  var info: js.UndefOr[DocumentInfo] = js.undefined
  var layout: js.UndefOr[portrait | landscape] = js.undefined
  var margin: js.UndefOr[Double] = js.undefined
  var margins: js.UndefOr[AnonBottom] = js.undefined
  var ownerPassword: js.UndefOr[String] = js.undefined
  var pdfVersion: js.UndefOr[`1Dot3` | `1Dot4` | `1Dot5` | `1Dot6` | `1Dot7` | `1Dot7ext3`] = js.undefined
  var permissions: js.UndefOr[DocumentPermissions] = js.undefined
  var size: js.UndefOr[js.Array[Double] | String] = js.undefined
  var userPassword: js.UndefOr[String] = js.undefined
}

object PDFDocumentOptions {
  @scala.inline
  def apply(
    autoFirstPage: js.UndefOr[Boolean] = js.undefined,
    bufferPages: js.UndefOr[Boolean] = js.undefined,
    compress: js.UndefOr[Boolean] = js.undefined,
    info: DocumentInfo = null,
    layout: portrait | landscape = null,
    margin: Int | Double = null,
    margins: AnonBottom = null,
    ownerPassword: String = null,
    pdfVersion: `1Dot3` | `1Dot4` | `1Dot5` | `1Dot6` | `1Dot7` | `1Dot7ext3` = null,
    permissions: DocumentPermissions = null,
    size: js.Array[Double] | String = null,
    userPassword: String = null
  ): PDFDocumentOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFirstPage)) __obj.updateDynamic("autoFirstPage")(autoFirstPage.asInstanceOf[js.Any])
    if (!js.isUndefined(bufferPages)) __obj.updateDynamic("bufferPages")(bufferPages.asInstanceOf[js.Any])
    if (!js.isUndefined(compress)) __obj.updateDynamic("compress")(compress.asInstanceOf[js.Any])
    if (info != null) __obj.updateDynamic("info")(info.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (margins != null) __obj.updateDynamic("margins")(margins.asInstanceOf[js.Any])
    if (ownerPassword != null) __obj.updateDynamic("ownerPassword")(ownerPassword.asInstanceOf[js.Any])
    if (pdfVersion != null) __obj.updateDynamic("pdfVersion")(pdfVersion.asInstanceOf[js.Any])
    if (permissions != null) __obj.updateDynamic("permissions")(permissions.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (userPassword != null) __obj.updateDynamic("userPassword")(userPassword.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDFDocumentOptions]
  }
}

