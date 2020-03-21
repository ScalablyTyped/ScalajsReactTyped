package typingsJapgolly.rcSlider.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.rcSlider.PartialProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithTooltipProps extends js.Object {
  var tipFormatter: js.UndefOr[js.Function1[/* value */ Double, Node]] = js.undefined
  var tipProps: js.UndefOr[PartialProps] = js.undefined
}

object WithTooltipProps {
  @scala.inline
  def apply(tipFormatter: /* value */ Double => CallbackTo[Node] = null, tipProps: PartialProps = null): WithTooltipProps = {
    val __obj = js.Dynamic.literal()
    if (tipFormatter != null) __obj.updateDynamic("tipFormatter")(js.Any.fromFunction1((t0: /* value */ scala.Double) => tipFormatter(t0).runNow()))
    if (tipProps != null) __obj.updateDynamic("tipProps")(tipProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithTooltipProps]
  }
}

