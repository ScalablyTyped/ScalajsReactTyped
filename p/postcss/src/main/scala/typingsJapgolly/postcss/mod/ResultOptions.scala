package typingsJapgolly.postcss.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.postcss.PickProcessOptionsmapfrom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultOptions extends ProcessOptions {
  /**
    * The CSS node that was the source of the warning.
    */
  var node: js.UndefOr[Node] = js.undefined
  /**
    * Name of plugin that created this warning. Result#warn() will fill it
    * automatically with plugin.postcssPlugin value.
    */
  var plugin: js.UndefOr[String] = js.undefined
}

object ResultOptions {
  @scala.inline
  def apply(
    from: String = null,
    map: SourceMapOptions | Boolean = null,
    node: Node = null,
    parser: (/* css */ ParserInput, /* opts */ js.UndefOr[PickProcessOptionsmapfrom]) => CallbackTo[Root_] = null,
    plugin: String = null,
    stringifier: (/* node */ Node, /* builder */ Builder) => Callback = null,
    syntax: Syntax = null,
    to: String = null
  ): ResultOptions = {
    val __obj = js.Dynamic.literal()
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    if (parser != null) __obj.updateDynamic("parser")(js.Any.fromFunction2((t0: /* css */ typingsJapgolly.postcss.mod.ParserInput, t1: /* opts */ js.UndefOr[typingsJapgolly.postcss.PickProcessOptionsmapfrom]) => parser(t0, t1).runNow()))
    if (plugin != null) __obj.updateDynamic("plugin")(plugin.asInstanceOf[js.Any])
    if (stringifier != null) __obj.updateDynamic("stringifier")(js.Any.fromFunction2((t0: /* node */ typingsJapgolly.postcss.mod.Node, t1: /* builder */ typingsJapgolly.postcss.mod.Builder) => stringifier(t0, t1).runNow()))
    if (syntax != null) __obj.updateDynamic("syntax")(syntax.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultOptions]
  }
}

