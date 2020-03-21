package typingsJapgolly.googleapis.pagespeedonlineV4Mod.pagespeedonlineV4

import typingsJapgolly.googleapis.AnonRects
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPagespeedApiFormatStringV4 extends js.Object {
  /**
    * List of arguments for the format string.
    */
  var args: js.UndefOr[js.Array[AnonRects]] = js.native
  /**
    * A localized format string with {{FOO}} placeholders, where &#39;FOO&#39;
    * is the key of the argument whose value should be substituted. For
    * HYPERLINK arguments, the format string will instead contain {{BEGIN_FOO}}
    * and {{END_FOO}} for the argument with key &#39;FOO&#39;.
    */
  var format: js.UndefOr[String] = js.native
}

object SchemaPagespeedApiFormatStringV4 {
  @scala.inline
  def apply(args: js.Array[AnonRects] = null, format: String = null): SchemaPagespeedApiFormatStringV4 = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPagespeedApiFormatStringV4]
  }
}

