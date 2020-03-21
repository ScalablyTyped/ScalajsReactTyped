package typingsJapgolly.vegaTypings.dataMod

import typingsJapgolly.vegaTypings.vegaTypingsStrings.dsv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatDSV extends _Format {
  var delimiter: String
  var header: js.UndefOr[js.Array[String]] = js.undefined
  var parse: js.UndefOr[Parse] = js.undefined
  var `type`: dsv
}

object FormatDSV {
  @scala.inline
  def apply(delimiter: String, `type`: dsv, header: js.Array[String] = null, parse: Parse = null): FormatDSV = {
    val __obj = js.Dynamic.literal(delimiter = delimiter.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (parse != null) __obj.updateDynamic("parse")(parse.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatDSV]
  }
}

