package typingsJapgolly.textract

import typingsJapgolly.textract.textractStrings.ASCII7
import typingsJapgolly.textract.textractStrings.Latin1
import typingsJapgolly.textract.textractStrings.Symbol
import typingsJapgolly.textract.textractStrings.ZapfDingbats
import typingsJapgolly.textract.textractStrings.`UCS-2`
import typingsJapgolly.textract.textractStrings.`UTF-8`
import typingsJapgolly.textract.textractStrings.dos
import typingsJapgolly.textract.textractStrings.htmlmeta
import typingsJapgolly.textract.textractStrings.layout
import typingsJapgolly.textract.textractStrings.mac
import typingsJapgolly.textract.textractStrings.raw
import typingsJapgolly.textract.textractStrings.unix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCrop extends js.Object {
  var crop: js.UndefOr[AnonH] = js.undefined
  /**
    * @default "UTF-8"
    */
  var encoding: js.UndefOr[`UCS-2` | ASCII7 | Latin1 | `UTF-8` | ZapfDingbats | Symbol] = js.undefined
  var eol: js.UndefOr[unix | dos | mac] = js.undefined
  var firstPage: js.UndefOr[Double] = js.undefined
  var lastPage: js.UndefOr[Double] = js.undefined
  /**
    * Do not change unless you know what you are doing!
    * @default "raw"
    */
  var layout: js.UndefOr[typingsJapgolly.textract.textractStrings.layout | raw | htmlmeta] = js.undefined
  var ownerPassword: js.UndefOr[String] = js.undefined
  var resolution: js.UndefOr[Double] = js.undefined
  /**
    * @default true
    */
  var splitPages: js.UndefOr[Boolean] = js.undefined
  var userPassword: js.UndefOr[String] = js.undefined
}

object AnonCrop {
  @scala.inline
  def apply(
    crop: AnonH = null,
    encoding: `UCS-2` | ASCII7 | Latin1 | `UTF-8` | ZapfDingbats | Symbol = null,
    eol: unix | dos | mac = null,
    firstPage: Int | Double = null,
    lastPage: Int | Double = null,
    layout: layout | raw | htmlmeta = null,
    ownerPassword: String = null,
    resolution: Int | Double = null,
    splitPages: js.UndefOr[Boolean] = js.undefined,
    userPassword: String = null
  ): AnonCrop = {
    val __obj = js.Dynamic.literal()
    if (crop != null) __obj.updateDynamic("crop")(crop.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (eol != null) __obj.updateDynamic("eol")(eol.asInstanceOf[js.Any])
    if (firstPage != null) __obj.updateDynamic("firstPage")(firstPage.asInstanceOf[js.Any])
    if (lastPage != null) __obj.updateDynamic("lastPage")(lastPage.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (ownerPassword != null) __obj.updateDynamic("ownerPassword")(ownerPassword.asInstanceOf[js.Any])
    if (resolution != null) __obj.updateDynamic("resolution")(resolution.asInstanceOf[js.Any])
    if (!js.isUndefined(splitPages)) __obj.updateDynamic("splitPages")(splitPages.asInstanceOf[js.Any])
    if (userPassword != null) __obj.updateDynamic("userPassword")(userPassword.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCrop]
  }
}

