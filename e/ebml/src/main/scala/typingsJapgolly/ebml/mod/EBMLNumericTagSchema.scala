package typingsJapgolly.ebml.mod

import typingsJapgolly.ebml.ebmlStrings.Informational
import typingsJapgolly.ebml.ebmlStrings.`1 - bzlibComma`
import typingsJapgolly.ebml.ebmlStrings.`2 - lzo1x`
import typingsJapgolly.ebml.ebmlStrings.f
import typingsJapgolly.ebml.ebmlStrings.i
import typingsJapgolly.ebml.ebmlStrings.informational_
import typingsJapgolly.ebml.ebmlStrings.u
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.ebml.mod.EBMLTagSchema because Already inherited */ trait EBMLNumericTagSchema extends EBMLDefaultableTagSchema {
  var br: js.UndefOr[
    String | (js.Tuple2[String, String]) | (js.Tuple3[String, String, String]) | (js.Tuple4[String, String, String, String])
  ] = js.undefined
  var range: String
  @JSName("type")
  var type_EBMLNumericTagSchema: u | i | f
}

object EBMLNumericTagSchema {
  @scala.inline
  def apply(
    description: String,
    level: Double,
    name: String,
    range: String,
    `type`: u | i | f,
    br: String | (js.Tuple2[String, String]) | (js.Tuple3[String, String, String]) | (js.Tuple4[String, String, String, String]) = null,
    cppname: String = null,
    default: js.Any = null,
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
  ): EBMLNumericTagSchema = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (br != null) __obj.updateDynamic("br")(br.asInstanceOf[js.Any])
    if (cppname != null) __obj.updateDynamic("cppname")(cppname.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[EBMLNumericTagSchema]
  }
}

