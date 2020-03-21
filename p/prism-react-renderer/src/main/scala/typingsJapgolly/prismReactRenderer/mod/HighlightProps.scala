package typingsJapgolly.prismReactRenderer.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighlightProps extends js.Object {
  var Prism: PrismLib
  var code: String
  var language: Language
  var theme: js.UndefOr[PrismTheme] = js.undefined
  def children(props: RenderProps): Node
}

object HighlightProps {
  @scala.inline
  def apply(
    Prism: PrismLib,
    children: RenderProps => CallbackTo[Node],
    code: String,
    language: Language,
    theme: PrismTheme = null
  ): HighlightProps = {
    val __obj = js.Dynamic.literal(Prism = Prism.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any])
    __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.prismReactRenderer.mod.RenderProps) => children(t0).runNow()))
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightProps]
  }
}

