package typingsJapgolly.reactTypist.mod.Typist

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrentTextProps extends js.Object {
  var charIdx: Double
  var character: String
  var line: String
  var lineIdx: Double
  def defDelayGenerator(mn: Double, st: Double): js.Function1[/* params */ js.Any, Double]
}

object CurrentTextProps {
  @scala.inline
  def apply(
    charIdx: Double,
    character: String,
    defDelayGenerator: (Double, Double) => CallbackTo[js.Function1[/* params */ js.Any, Double]],
    line: String,
    lineIdx: Double
  ): CurrentTextProps = {
    val __obj = js.Dynamic.literal(charIdx = charIdx.asInstanceOf[js.Any], character = character.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], lineIdx = lineIdx.asInstanceOf[js.Any])
    __obj.updateDynamic("defDelayGenerator")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => defDelayGenerator(t0, t1).runNow()))
    __obj.asInstanceOf[CurrentTextProps]
  }
}

