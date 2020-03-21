package typingsJapgolly.hoganJs

import typingsJapgolly.hoganJs.hoganJsBooleans.`true`
import typingsJapgolly.hoganJs.mod.SectionTags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined hogan.js.hogan.js.HoganOptions & {  asString  :true} */
trait HoganOptionsasStringtrue extends js.Object {
  var asString: js.UndefOr[Boolean with `true`] = js.undefined
  var delimiters: js.UndefOr[String] = js.undefined
  var disableLambda: js.UndefOr[Boolean] = js.undefined
  var sectionTags: js.UndefOr[js.Array[SectionTags]] = js.undefined
}

object HoganOptionsasStringtrue {
  @scala.inline
  def apply(
    asString: js.UndefOr[Boolean with `true`] = js.undefined,
    delimiters: String = null,
    disableLambda: js.UndefOr[Boolean] = js.undefined,
    sectionTags: js.Array[SectionTags] = null
  ): HoganOptionsasStringtrue = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(asString)) __obj.updateDynamic("asString")(asString.asInstanceOf[js.Any])
    if (delimiters != null) __obj.updateDynamic("delimiters")(delimiters.asInstanceOf[js.Any])
    if (!js.isUndefined(disableLambda)) __obj.updateDynamic("disableLambda")(disableLambda.asInstanceOf[js.Any])
    if (sectionTags != null) __obj.updateDynamic("sectionTags")(sectionTags.asInstanceOf[js.Any])
    __obj.asInstanceOf[HoganOptionsasStringtrue]
  }
}

