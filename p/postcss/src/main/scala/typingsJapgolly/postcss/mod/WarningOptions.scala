package typingsJapgolly.postcss.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.postcss.PickProcessOptionsmapfrom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WarningOptions extends ResultOptions {
  /**
    * The index inside a node's string that should be highlighted as
    * source of warning.
    */
  var index: js.UndefOr[Double] = js.undefined
  /**
    * A word inside a node's string that should be highlighted as source
    * of warning.
    */
  var word: js.UndefOr[String] = js.undefined
}

object WarningOptions {
  @scala.inline
  def apply(
    from: String = null,
    index: Int | Double = null,
    map: SourceMapOptions | Boolean = null,
    node: Node = null,
    parser: (/* css */ ParserInput, /* opts */ js.UndefOr[PickProcessOptionsmapfrom]) => CallbackTo[Root_] = null,
    plugin: String = null,
    stringifier: (/* node */ Node, /* builder */ Builder) => Callback = null,
    syntax: Syntax = null,
    to: String = null,
    word: String = null
  ): WarningOptions = {
    val __obj = js.Dynamic.literal()
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    if (parser != null) __obj.updateDynamic("parser")(js.Any.fromFunction2((t0: /* css */ typingsJapgolly.postcss.mod.ParserInput, t1: /* opts */ js.UndefOr[typingsJapgolly.postcss.PickProcessOptionsmapfrom]) => parser(t0, t1).runNow()))
    if (plugin != null) __obj.updateDynamic("plugin")(plugin.asInstanceOf[js.Any])
    if (stringifier != null) __obj.updateDynamic("stringifier")(js.Any.fromFunction2((t0: /* node */ typingsJapgolly.postcss.mod.Node, t1: /* builder */ typingsJapgolly.postcss.mod.Builder) => stringifier(t0, t1).runNow()))
    if (syntax != null) __obj.updateDynamic("syntax")(syntax.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    if (word != null) __obj.updateDynamic("word")(word.asInstanceOf[js.Any])
    __obj.asInstanceOf[WarningOptions]
  }
}

