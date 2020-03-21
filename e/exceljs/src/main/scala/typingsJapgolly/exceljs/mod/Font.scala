package typingsJapgolly.exceljs.mod

import typingsJapgolly.exceljs.PartialColor
import typingsJapgolly.exceljs.exceljsStrings.double
import typingsJapgolly.exceljs.exceljsStrings.doubleAccounting
import typingsJapgolly.exceljs.exceljsStrings.major
import typingsJapgolly.exceljs.exceljsStrings.minor
import typingsJapgolly.exceljs.exceljsStrings.none_
import typingsJapgolly.exceljs.exceljsStrings.single
import typingsJapgolly.exceljs.exceljsStrings.singleAccounting
import typingsJapgolly.exceljs.exceljsStrings.subscript
import typingsJapgolly.exceljs.exceljsStrings.superscript
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Font extends js.Object {
  var bold: Boolean
  var charset: Double
  var color: PartialColor
  var family: Double
  var italic: Boolean
  var name: String
  var outline: Boolean
  var scheme: minor | major | none_
  var size: Double
  var strike: Boolean
  var underline: Boolean | none_ | single | double | singleAccounting | doubleAccounting
  var vertAlign: superscript | subscript
}

object Font {
  @scala.inline
  def apply(
    bold: Boolean,
    charset: Double,
    color: PartialColor,
    family: Double,
    italic: Boolean,
    name: String,
    outline: Boolean,
    scheme: minor | major | none_,
    size: Double,
    strike: Boolean,
    underline: Boolean | none_ | single | double | singleAccounting | doubleAccounting,
    vertAlign: superscript | subscript
  ): Font = {
    val __obj = js.Dynamic.literal(bold = bold.asInstanceOf[js.Any], charset = charset.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any], italic = italic.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outline = outline.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], strike = strike.asInstanceOf[js.Any], underline = underline.asInstanceOf[js.Any], vertAlign = vertAlign.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Font]
  }
}

