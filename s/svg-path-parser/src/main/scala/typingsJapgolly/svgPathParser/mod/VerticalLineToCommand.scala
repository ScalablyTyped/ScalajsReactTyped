package typingsJapgolly.svgPathParser.mod

import typingsJapgolly.svgPathParser.svgPathParserStrings.V
import typingsJapgolly.svgPathParser.svgPathParserStrings.`vertical lineto`
import typingsJapgolly.svgPathParser.svgPathParserStrings.v_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerticalLineToCommand extends js.Object {
  var code: v_ | V
  var command: `vertical lineto`
  var relative: js.UndefOr[Boolean] = js.undefined
  var y: Double
}

object VerticalLineToCommand {
  @scala.inline
  def apply(code: v_ | V, command: `vertical lineto`, y: Double, relative: js.UndefOr[Boolean] = js.undefined): VerticalLineToCommand = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (!js.isUndefined(relative)) __obj.updateDynamic("relative")(relative.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerticalLineToCommand]
  }
}

