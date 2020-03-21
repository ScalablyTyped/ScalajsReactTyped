package typingsJapgolly.highlightJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICompiledMode extends IModeBase {
  var compiled: Boolean
  var contains: js.UndefOr[js.Array[ICompiledMode]] = js.undefined
  var keywords: js.UndefOr[js.Object] = js.undefined
  var terminator_end: js.UndefOr[String] = js.undefined
  var terminators: js.RegExp
}

object ICompiledMode {
  @scala.inline
  def apply(
    compiled: Boolean,
    terminators: js.RegExp,
    aliases: js.Array[String] = null,
    begin: String | js.RegExp = null,
    beginKeyword: String = null,
    case_insensitive: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    contains: js.Array[ICompiledMode] = null,
    end: String | js.RegExp = null,
    endsWithParent: js.UndefOr[Boolean] = js.undefined,
    excludeBegin: js.UndefOr[Boolean] = js.undefined,
    excludeEnd: js.UndefOr[Boolean] = js.undefined,
    illegal: String = null,
    keywords: js.Object = null,
    lexems: String = null,
    relevance: Int | Double = null,
    returnBegin: js.UndefOr[Boolean] = js.undefined,
    returnEnd: js.UndefOr[Boolean] = js.undefined,
    starts: String = null,
    subLanguage: String = null,
    subLanguageMode: String = null,
    terminator_end: String = null,
    variants: js.Array[IMode] = null
  ): ICompiledMode = {
    val __obj = js.Dynamic.literal(compiled = compiled.asInstanceOf[js.Any], terminators = terminators.asInstanceOf[js.Any])
    if (aliases != null) __obj.updateDynamic("aliases")(aliases.asInstanceOf[js.Any])
    if (begin != null) __obj.updateDynamic("begin")(begin.asInstanceOf[js.Any])
    if (beginKeyword != null) __obj.updateDynamic("beginKeyword")(beginKeyword.asInstanceOf[js.Any])
    if (!js.isUndefined(case_insensitive)) __obj.updateDynamic("case_insensitive")(case_insensitive.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (contains != null) __obj.updateDynamic("contains")(contains.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (!js.isUndefined(endsWithParent)) __obj.updateDynamic("endsWithParent")(endsWithParent.asInstanceOf[js.Any])
    if (!js.isUndefined(excludeBegin)) __obj.updateDynamic("excludeBegin")(excludeBegin.asInstanceOf[js.Any])
    if (!js.isUndefined(excludeEnd)) __obj.updateDynamic("excludeEnd")(excludeEnd.asInstanceOf[js.Any])
    if (illegal != null) __obj.updateDynamic("illegal")(illegal.asInstanceOf[js.Any])
    if (keywords != null) __obj.updateDynamic("keywords")(keywords.asInstanceOf[js.Any])
    if (lexems != null) __obj.updateDynamic("lexems")(lexems.asInstanceOf[js.Any])
    if (relevance != null) __obj.updateDynamic("relevance")(relevance.asInstanceOf[js.Any])
    if (!js.isUndefined(returnBegin)) __obj.updateDynamic("returnBegin")(returnBegin.asInstanceOf[js.Any])
    if (!js.isUndefined(returnEnd)) __obj.updateDynamic("returnEnd")(returnEnd.asInstanceOf[js.Any])
    if (starts != null) __obj.updateDynamic("starts")(starts.asInstanceOf[js.Any])
    if (subLanguage != null) __obj.updateDynamic("subLanguage")(subLanguage.asInstanceOf[js.Any])
    if (subLanguageMode != null) __obj.updateDynamic("subLanguageMode")(subLanguageMode.asInstanceOf[js.Any])
    if (terminator_end != null) __obj.updateDynamic("terminator_end")(terminator_end.asInstanceOf[js.Any])
    if (variants != null) __obj.updateDynamic("variants")(variants.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICompiledMode]
  }
}

