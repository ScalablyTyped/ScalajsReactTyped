package typingsJapgolly.luaparse.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.luaparse.astMod.Chunk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parser extends js.Object {
  def end(segment: String): Chunk
  def lex(): Token
  def write(segment: String): Unit
}

object Parser {
  @scala.inline
  def apply(end: String => CallbackTo[Chunk], lex: CallbackTo[Token], write: String => Callback): Parser = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end")(js.Any.fromFunction1((t0: java.lang.String) => end(t0).runNow()))
    __obj.updateDynamic("lex")(lex.toJsFn)
    __obj.updateDynamic("write")(js.Any.fromFunction1((t0: java.lang.String) => write(t0).runNow()))
    __obj.asInstanceOf[Parser]
  }
}

