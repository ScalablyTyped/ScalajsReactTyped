package typingsJapgolly.kuromoji.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenizerBuilder[T] extends js.Object {
  def build(callback: js.Function2[/* err */ js.Error, /* tokenizer */ Tokenizer[T], Unit]): Unit
}

object TokenizerBuilder {
  @scala.inline
  def apply[T](build: js.Function2[/* err */ js.Error, /* tokenizer */ Tokenizer[T], Unit] => Callback): TokenizerBuilder[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("build")(js.Any.fromFunction1((t0: js.Function2[
  /* err */ js.Error, 
  /* tokenizer */ typingsJapgolly.kuromoji.mod.Tokenizer[T], 
  scala.Unit]) => build(t0).runNow()))
    __obj.asInstanceOf[TokenizerBuilder[T]]
  }
}

