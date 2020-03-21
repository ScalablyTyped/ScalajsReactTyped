package typingsJapgolly.ebml.mod

import typingsJapgolly.ebml.ebmlStrings.Informational
import typingsJapgolly.ebml.ebmlStrings.`1 - bzlibComma`
import typingsJapgolly.ebml.ebmlStrings.`2 - lzo1x`
import typingsJapgolly.ebml.ebmlStrings.informational_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EBMLTagSchemaBase extends EBMLTagSchema {
  var cppname: js.UndefOr[String] = js.undefined
  var del: js.UndefOr[(js.Tuple2[`1 - bzlibComma`, `2 - lzo1x`]) | (`1 - bzlibComma`) | (`2 - lzo1x`)] = js.undefined
  var description: String
  var divx: js.UndefOr[Boolean] = js.undefined
  var i: js.UndefOr[String] = js.undefined
  var level: Double
  var mandatory: js.UndefOr[Boolean] = js.undefined
  var maxver: js.UndefOr[String] = js.undefined
  var minver: js.UndefOr[Double] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
  var name: String
  var recursive: js.UndefOr[Boolean] = js.undefined
  var strong: js.UndefOr[informational_ | Informational] = js.undefined
  var `type`: TagType
  var webm: js.UndefOr[Boolean] = js.undefined
}

object EBMLTagSchemaBase {
  @scala.inline
  def apply(
    description: String,
    level: Double,
    name: String,
    `type`: TagType,
    cppname: String = null,
    del: (js.Tuple2[`1 - bzlibComma`, `2 - lzo1x`]) | (`1 - bzlibComma`) | (`2 - lzo1x`) = null,
    divx: js.UndefOr[Boolean] = js.undefined,
    i: String = null,
    mandatory: js.UndefOr[Boolean] = js.undefined,
    maxver: String = null,
    minver: Int | Double = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    recursive: js.UndefOr[Boolean] = js.undefined,
    strong: informational_ | Informational = null,
    webm: js.UndefOr[Boolean] = js.undefined
  ): EBMLTagSchemaBase = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (cppname != null) __obj.updateDynamic("cppname")(cppname.asInstanceOf[js.Any])
    if (del != null) __obj.updateDynamic("del")(del.asInstanceOf[js.Any])
    if (!js.isUndefined(divx)) __obj.updateDynamic("divx")(divx.asInstanceOf[js.Any])
    if (i != null) __obj.updateDynamic("i")(i.asInstanceOf[js.Any])
    if (!js.isUndefined(mandatory)) __obj.updateDynamic("mandatory")(mandatory.asInstanceOf[js.Any])
    if (maxver != null) __obj.updateDynamic("maxver")(maxver.asInstanceOf[js.Any])
    if (minver != null) __obj.updateDynamic("minver")(minver.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (!js.isUndefined(recursive)) __obj.updateDynamic("recursive")(recursive.asInstanceOf[js.Any])
    if (strong != null) __obj.updateDynamic("strong")(strong.asInstanceOf[js.Any])
    if (!js.isUndefined(webm)) __obj.updateDynamic("webm")(webm.asInstanceOf[js.Any])
    __obj.asInstanceOf[EBMLTagSchemaBase]
  }
}

