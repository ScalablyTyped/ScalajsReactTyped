package typingsJapgolly.typescript.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceMapSource extends js.Object {
  var fileName: java.lang.String
  var skipTrivia: js.UndefOr[js.Function1[/* pos */ Double, Double]] = js.undefined
  var text: java.lang.String
  def getLineAndCharacterOfPosition(pos: Double): LineAndCharacter
}

object SourceMapSource {
  @scala.inline
  def apply(
    fileName: java.lang.String,
    getLineAndCharacterOfPosition: Double => CallbackTo[LineAndCharacter],
    text: java.lang.String,
    skipTrivia: /* pos */ Double => CallbackTo[Double] = null
  ): SourceMapSource = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("getLineAndCharacterOfPosition")(js.Any.fromFunction1((t0: scala.Double) => getLineAndCharacterOfPosition(t0).runNow()))
    if (skipTrivia != null) __obj.updateDynamic("skipTrivia")(js.Any.fromFunction1((t0: /* pos */ scala.Double) => skipTrivia(t0).runNow()))
    __obj.asInstanceOf[SourceMapSource]
  }
}

