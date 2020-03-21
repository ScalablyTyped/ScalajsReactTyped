package typingsJapgolly.gapiClientServiceuser.gapi.client.serviceuser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Enum extends js.Object {
  /** Enum value definitions. */
  var enumvalue: js.UndefOr[js.Array[EnumValue]] = js.undefined
  /** Enum type name. */
  var name: js.UndefOr[String] = js.undefined
  /** Protocol buffer options. */
  var options: js.UndefOr[js.Array[Option]] = js.undefined
  /** The source context. */
  var sourceContext: js.UndefOr[SourceContext] = js.undefined
  /** The source syntax. */
  var syntax: js.UndefOr[String] = js.undefined
}

object Enum {
  @scala.inline
  def apply(
    enumvalue: js.Array[EnumValue] = null,
    name: String = null,
    options: js.Array[Option] = null,
    sourceContext: SourceContext = null,
    syntax: String = null
  ): Enum = {
    val __obj = js.Dynamic.literal()
    if (enumvalue != null) __obj.updateDynamic("enumvalue")(enumvalue.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (sourceContext != null) __obj.updateDynamic("sourceContext")(sourceContext.asInstanceOf[js.Any])
    if (syntax != null) __obj.updateDynamic("syntax")(syntax.asInstanceOf[js.Any])
    __obj.asInstanceOf[Enum]
  }
}

