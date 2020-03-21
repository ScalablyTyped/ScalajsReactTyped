package typingsJapgolly.prettier.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parser extends js.Object {
  var astFormat: String
  var hasPragma: js.UndefOr[js.Function1[/* text */ String, Boolean]] = js.undefined
  var preprocess: js.UndefOr[js.Function2[/* text */ String, /* options */ ParserOptions, String]] = js.undefined
  def locEnd(node: js.Any): Double
  def locStart(node: js.Any): Double
  def parse(text: String, parsers: StringDictionary[Parser], options: ParserOptions): AST
}

object Parser {
  @scala.inline
  def apply(
    astFormat: String,
    locEnd: js.Any => CallbackTo[Double],
    locStart: js.Any => CallbackTo[Double],
    parse: (String, StringDictionary[Parser], ParserOptions) => CallbackTo[AST],
    hasPragma: /* text */ String => CallbackTo[Boolean] = null,
    preprocess: (/* text */ String, /* options */ ParserOptions) => CallbackTo[String] = null
  ): Parser = {
    val __obj = js.Dynamic.literal(astFormat = astFormat.asInstanceOf[js.Any])
    __obj.updateDynamic("locEnd")(js.Any.fromFunction1((t0: js.Any) => locEnd(t0).runNow()))
    __obj.updateDynamic("locStart")(js.Any.fromFunction1((t0: js.Any) => locStart(t0).runNow()))
    __obj.updateDynamic("parse")(js.Any.fromFunction3((t0: java.lang.String, t1: org.scalablytyped.runtime.StringDictionary[typingsJapgolly.prettier.mod.Parser], t2: typingsJapgolly.prettier.mod.ParserOptions) => parse(t0, t1, t2).runNow()))
    if (hasPragma != null) __obj.updateDynamic("hasPragma")(js.Any.fromFunction1((t0: /* text */ java.lang.String) => hasPragma(t0).runNow()))
    if (preprocess != null) __obj.updateDynamic("preprocess")(js.Any.fromFunction2((t0: /* text */ java.lang.String, t1: /* options */ typingsJapgolly.prettier.mod.ParserOptions) => preprocess(t0, t1).runNow()))
    __obj.asInstanceOf[Parser]
  }
}

