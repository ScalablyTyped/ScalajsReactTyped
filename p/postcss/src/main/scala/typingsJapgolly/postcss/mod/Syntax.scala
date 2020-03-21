package typingsJapgolly.postcss.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.postcss.PickProcessOptionsmapfrom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Syntax extends js.Object {
  /**
    * Function to generate AST by string.
    */
  var parse: js.UndefOr[Parser] = js.undefined
  /**
    * Class to generate string by AST.
    */
  var stringify: js.UndefOr[Stringifier] = js.undefined
}

object Syntax {
  @scala.inline
  def apply(
    parse: (/* css */ ParserInput, /* opts */ js.UndefOr[PickProcessOptionsmapfrom]) => CallbackTo[Root_] = null,
    stringify: (/* node */ Node, /* builder */ Builder) => Callback = null
  ): Syntax = {
    val __obj = js.Dynamic.literal()
    if (parse != null) __obj.updateDynamic("parse")(js.Any.fromFunction2((t0: /* css */ typingsJapgolly.postcss.mod.ParserInput, t1: /* opts */ js.UndefOr[typingsJapgolly.postcss.PickProcessOptionsmapfrom]) => parse(t0, t1).runNow()))
    if (stringify != null) __obj.updateDynamic("stringify")(js.Any.fromFunction2((t0: /* node */ typingsJapgolly.postcss.mod.Node, t1: /* builder */ typingsJapgolly.postcss.mod.Builder) => stringify(t0, t1).runNow()))
    __obj.asInstanceOf[Syntax]
  }
}

