package typingsJapgolly.prismReactRenderer.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderProps extends js.Object {
  var className: String
  var style: StyleObj
  var tokens: js.Array[js.Array[Token]]
  def getLineProps(input: LineInputProps): LineOutputProps
  def getTokenProps(input: TokenInputProps): TokenOutputProps
}

object RenderProps {
  @scala.inline
  def apply(
    className: String,
    getLineProps: LineInputProps => CallbackTo[LineOutputProps],
    getTokenProps: TokenInputProps => CallbackTo[TokenOutputProps],
    style: StyleObj,
    tokens: js.Array[js.Array[Token]]
  ): RenderProps = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.updateDynamic("getLineProps")(js.Any.fromFunction1((t0: typingsJapgolly.prismReactRenderer.mod.LineInputProps) => getLineProps(t0).runNow()))
    __obj.updateDynamic("getTokenProps")(js.Any.fromFunction1((t0: typingsJapgolly.prismReactRenderer.mod.TokenInputProps) => getTokenProps(t0).runNow()))
    __obj.asInstanceOf[RenderProps]
  }
}

