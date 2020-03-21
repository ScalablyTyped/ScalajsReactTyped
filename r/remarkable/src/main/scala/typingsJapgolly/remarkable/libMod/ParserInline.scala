package typingsJapgolly.remarkable.libMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserInline extends js.Object {
  def parse(str: String, options: Options, env: Env, tokens: js.Array[Token]): Unit
  def skipToken(state: StateInline): Unit
  def tokenize(state: StateInline): Unit
  def validateLink(url: String): Boolean
}

object ParserInline {
  @scala.inline
  def apply(
    parse: (String, Options, Env, js.Array[Token]) => Callback,
    skipToken: StateInline => Callback,
    tokenize: StateInline => Callback,
    validateLink: String => CallbackTo[Boolean]
  ): ParserInline = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("parse")(js.Any.fromFunction4((t0: java.lang.String, t1: typingsJapgolly.remarkable.libMod.Options, t2: typingsJapgolly.remarkable.libMod.Env, t3: js.Array[typingsJapgolly.remarkable.libMod.Token]) => parse(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("skipToken")(js.Any.fromFunction1((t0: typingsJapgolly.remarkable.libMod.StateInline) => skipToken(t0).runNow()))
    __obj.updateDynamic("tokenize")(js.Any.fromFunction1((t0: typingsJapgolly.remarkable.libMod.StateInline) => tokenize(t0).runNow()))
    __obj.updateDynamic("validateLink")(js.Any.fromFunction1((t0: java.lang.String) => validateLink(t0).runNow()))
    __obj.asInstanceOf[ParserInline]
  }
}

