package typingsJapgolly.mailgen.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Created by kiettv on 7/24/16.
  */
trait Mailgen extends js.Object {
  def cacheThemes(): Unit
  def generate(params: Content): js.Any
  def generatePlaintext(params: Content): js.Any
  def parseParams(params: js.Any): js.Any
}

object Mailgen {
  @scala.inline
  def apply(
    cacheThemes: Callback,
    generate: Content => CallbackTo[js.Any],
    generatePlaintext: Content => CallbackTo[js.Any],
    parseParams: js.Any => CallbackTo[js.Any]
  ): Mailgen = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cacheThemes")(cacheThemes.toJsFn)
    __obj.updateDynamic("generate")(js.Any.fromFunction1((t0: typingsJapgolly.mailgen.mod.Content) => generate(t0).runNow()))
    __obj.updateDynamic("generatePlaintext")(js.Any.fromFunction1((t0: typingsJapgolly.mailgen.mod.Content) => generatePlaintext(t0).runNow()))
    __obj.updateDynamic("parseParams")(js.Any.fromFunction1((t0: js.Any) => parseParams(t0).runNow()))
    __obj.asInstanceOf[Mailgen]
  }
}

