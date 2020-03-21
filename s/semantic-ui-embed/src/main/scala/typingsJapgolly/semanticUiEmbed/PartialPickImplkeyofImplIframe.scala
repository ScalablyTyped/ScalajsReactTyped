package typingsJapgolly.semanticUiEmbed

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-embed.SemanticUI.Embed.TemplatesSettings._Impl, keyof semantic-ui-embed.SemanticUI.Embed.TemplatesSettings._Impl>> */
trait PartialPickImplkeyofImplIframe extends js.Object {
  var iframe: js.UndefOr[js.Function2[/* url */ String, /* parameters */ String, String]] = js.undefined
  var placeholder: js.UndefOr[js.Function2[/* image */ String, /* icon */ String, String]] = js.undefined
}

object PartialPickImplkeyofImplIframe {
  @scala.inline
  def apply(
    iframe: (/* url */ String, /* parameters */ String) => CallbackTo[String] = null,
    placeholder: (/* image */ String, /* icon */ String) => CallbackTo[String] = null
  ): PartialPickImplkeyofImplIframe = {
    val __obj = js.Dynamic.literal()
    if (iframe != null) __obj.updateDynamic("iframe")(js.Any.fromFunction2((t0: /* url */ java.lang.String, t1: /* parameters */ java.lang.String) => iframe(t0, t1).runNow()))
    if (placeholder != null) __obj.updateDynamic("placeholder")(js.Any.fromFunction2((t0: /* image */ java.lang.String, t1: /* icon */ java.lang.String) => placeholder(t0, t1).runNow()))
    __obj.asInstanceOf[PartialPickImplkeyofImplIframe]
  }
}

