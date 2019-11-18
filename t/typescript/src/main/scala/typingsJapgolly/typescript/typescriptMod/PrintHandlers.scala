package typingsJapgolly.typescript.typescriptMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrintHandlers extends js.Object {
  /**
    * A hook used by the Printer when generating unique names to avoid collisions with
    * globally defined names that exist outside of the current source file.
    */
  var hasGlobalName: js.UndefOr[js.Function1[/* name */ String, Boolean]] = js.undefined
  /**
    * A hook used by the Printer to provide notifications prior to emitting a node. A
    * compatible implementation **must** invoke `emitCallback` with the provided `hint` and
    * `node` values.
    * @param hint A hint indicating the intended purpose of the node.
    * @param node The node to emit.
    * @param emitCallback A callback that, when invoked, will emit the node.
    * @example
    * ```ts
    * var printer = createPrinter(printerOptions, {
    *   onEmitNode(hint, node, emitCallback) {
    *     // set up or track state prior to emitting the node...
    *     emitCallback(hint, node);
    *     // restore state after emitting the node...
    *   }
    * });
    * ```
    */
  var onEmitNode: js.UndefOr[
    js.Function3[
      /* hint */ EmitHint, 
      /* node */ js.UndefOr[Node], 
      /* emitCallback */ js.Function2[/* hint */ EmitHint, /* node */ js.UndefOr[Node], Unit], 
      Unit
    ]
  ] = js.undefined
  /**
    * A hook used by the Printer to perform just-in-time substitution of a node. This is
    * primarily used by node transformations that need to substitute one node for another,
    * such as replacing `myExportedVar` with `exports.myExportedVar`.
    * @param hint A hint indicating the intended purpose of the node.
    * @param node The node to emit.
    * @example
    * ```ts
    * var printer = createPrinter(printerOptions, {
    *   substituteNode(hint, node) {
    *     // perform substitution if necessary...
    *     return node;
    *   }
    * });
    * ```
    */
  var substituteNode: js.UndefOr[js.Function2[/* hint */ EmitHint, /* node */ Node, Node]] = js.undefined
}

object PrintHandlers {
  @scala.inline
  def apply(
    hasGlobalName: /* name */ String => CallbackTo[Boolean] = null,
    onEmitNode: (/* hint */ EmitHint, /* node */ js.UndefOr[Node], /* emitCallback */ js.Function2[/* hint */ EmitHint, /* node */ js.UndefOr[Node], Unit]) => Callback = null,
    substituteNode: (/* hint */ EmitHint, /* node */ Node) => CallbackTo[Node] = null
  ): PrintHandlers = {
    val __obj = js.Dynamic.literal()
    if (hasGlobalName != null) __obj.updateDynamic("hasGlobalName")(js.Any.fromFunction1((t0: /* name */ java.lang.String) => hasGlobalName(t0).runNow()))
    if (onEmitNode != null) __obj.updateDynamic("onEmitNode")(js.Any.fromFunction3((t0: /* hint */ typingsJapgolly.typescript.typescriptMod.EmitHint, t1: /* node */ js.UndefOr[typingsJapgolly.typescript.typescriptMod.Node], t2: /* emitCallback */ js.Function2[
  /* hint */ typingsJapgolly.typescript.typescriptMod.EmitHint, 
  /* node */ js.UndefOr[typingsJapgolly.typescript.typescriptMod.Node], 
  scala.Unit]) => onEmitNode(t0, t1, t2).runNow()))
    if (substituteNode != null) __obj.updateDynamic("substituteNode")(js.Any.fromFunction2((t0: /* hint */ typingsJapgolly.typescript.typescriptMod.EmitHint, t1: /* node */ typingsJapgolly.typescript.typescriptMod.Node) => substituteNode(t0, t1).runNow()))
    __obj.asInstanceOf[PrintHandlers]
  }
}

