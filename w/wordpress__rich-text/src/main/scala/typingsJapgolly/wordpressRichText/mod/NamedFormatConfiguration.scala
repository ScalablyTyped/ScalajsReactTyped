package typingsJapgolly.wordpressRichText.mod

import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamedFormatConfiguration extends FormatConfiguration {
  var name: String
}

object NamedFormatConfiguration {
  @scala.inline
  def apply(
    edit: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentType<FormatProps> */ js.Any,
    name: String,
    tagName: (/* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any) with String,
    title: String,
    attributes: Record[String, String] = null,
    className: String = null,
    keywords: js.Array[String] | (js.Tuple2[String, String]) | (js.Tuple3[String, String, String]) = null,
    `object`: js.UndefOr[Boolean] = js.undefined
  ): NamedFormatConfiguration = {
    val __obj = js.Dynamic.literal(edit = edit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (keywords != null) __obj.updateDynamic("keywords")(keywords.asInstanceOf[js.Any])
    if (!js.isUndefined(`object`)) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamedFormatConfiguration]
  }
}

