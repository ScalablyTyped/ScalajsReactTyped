package typingsJapgolly.reactMarkdown.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkdownAbstractSyntaxTree extends js.Object {
  var align: js.UndefOr[js.Array[AlignType]] = js.undefined
  var alt: js.UndefOr[String | Null] = js.undefined
  var checked: js.UndefOr[Boolean | Null] = js.undefined
  var children: js.UndefOr[js.Array[MarkdownAbstractSyntaxTree]] = js.undefined
  var data: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var depth: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var identifier: js.UndefOr[String] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var lang: js.UndefOr[String | Null] = js.undefined
  var loose: js.UndefOr[Boolean] = js.undefined
  var ordered: js.UndefOr[Boolean] = js.undefined
  var position: js.UndefOr[Position] = js.undefined
  var referenceType: js.UndefOr[ReferenceType] = js.undefined
  var start: js.UndefOr[Double | Null] = js.undefined
  var title: js.UndefOr[String | Null] = js.undefined
  var `type`: String
  var url: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object MarkdownAbstractSyntaxTree {
  @scala.inline
  def apply(
    `type`: String,
    align: js.Array[AlignType] = null,
    alt: String = null,
    checked: js.UndefOr[Boolean] = js.undefined,
    children: js.Array[MarkdownAbstractSyntaxTree] = null,
    data: StringDictionary[js.Any] = null,
    depth: Int | Double = null,
    height: Int | Double = null,
    identifier: String = null,
    index: Int | Double = null,
    lang: String = null,
    loose: js.UndefOr[Boolean] = js.undefined,
    ordered: js.UndefOr[Boolean] = js.undefined,
    position: Position = null,
    referenceType: ReferenceType = null,
    start: Int | Double = null,
    title: String = null,
    url: String = null,
    value: String = null,
    width: Int | Double = null
  ): MarkdownAbstractSyntaxTree = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (!js.isUndefined(loose)) __obj.updateDynamic("loose")(loose.asInstanceOf[js.Any])
    if (!js.isUndefined(ordered)) __obj.updateDynamic("ordered")(ordered.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (referenceType != null) __obj.updateDynamic("referenceType")(referenceType.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkdownAbstractSyntaxTree]
  }
}

