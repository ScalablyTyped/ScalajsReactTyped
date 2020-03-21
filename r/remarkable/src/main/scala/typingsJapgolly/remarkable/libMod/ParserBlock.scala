package typingsJapgolly.remarkable.libMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserBlock extends js.Object {
  def parse(str: String, options: Options, env: Env, tokens: js.Array[Token]): Unit
  def tokenize(state: StateBlock, startLine: Double, endLine: Double): Unit
}

object ParserBlock {
  @scala.inline
  def apply(
    parse: (String, Options, Env, js.Array[Token]) => Callback,
    tokenize: (StateBlock, Double, Double) => Callback
  ): ParserBlock = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("parse")(js.Any.fromFunction4((t0: java.lang.String, t1: typingsJapgolly.remarkable.libMod.Options, t2: typingsJapgolly.remarkable.libMod.Env, t3: js.Array[typingsJapgolly.remarkable.libMod.Token]) => parse(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("tokenize")(js.Any.fromFunction3((t0: typingsJapgolly.remarkable.libMod.StateBlock, t1: scala.Double, t2: scala.Double) => tokenize(t0, t1, t2).runNow()))
    __obj.asInstanceOf[ParserBlock]
  }
}

