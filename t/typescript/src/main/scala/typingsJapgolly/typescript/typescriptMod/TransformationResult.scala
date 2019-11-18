package typingsJapgolly.typescript.typescriptMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformationResult[T /* <: Node */] extends js.Object {
  /** Gets diagnostics for the transformation. */
  var diagnostics: js.UndefOr[js.Array[DiagnosticWithLocation]] = js.undefined
  /** Gets the transformed source files. */
  var transformed: js.Array[T]
  /**
    * Clean up EmitNode entries on any parse-tree nodes.
    */
  def dispose(): Unit
  /**
    * Emits a node with possible notification.
    *
    * @param hint A hint as to the intended usage of the node.
    * @param node The node to emit.
    * @param emitCallback A callback used to emit the node.
    */
  def emitNodeWithNotification(hint: EmitHint, node: Node, emitCallback: js.Function2[/* hint */ EmitHint, /* node */ Node, Unit]): Unit
  /**
    * Gets a substitute for a node, if one is available; otherwise, returns the original node.
    *
    * @param hint A hint as to the intended usage of the node.
    * @param node The node to substitute.
    */
  def substituteNode(hint: EmitHint, node: Node): Node
}

object TransformationResult {
  @scala.inline
  def apply[T /* <: Node */](
    dispose: Callback,
    emitNodeWithNotification: (EmitHint, Node, js.Function2[/* hint */ EmitHint, /* node */ Node, Unit]) => Callback,
    substituteNode: (EmitHint, Node) => CallbackTo[Node],
    transformed: js.Array[T],
    diagnostics: js.Array[DiagnosticWithLocation] = null
  ): TransformationResult[T] = {
    val __obj = js.Dynamic.literal(transformed = transformed.asInstanceOf[js.Any])
    __obj.updateDynamic("dispose")(dispose.toJsFn)
    __obj.updateDynamic("emitNodeWithNotification")(js.Any.fromFunction3((t0: typingsJapgolly.typescript.typescriptMod.EmitHint, t1: typingsJapgolly.typescript.typescriptMod.Node, t2: js.Function2[
  /* hint */ typingsJapgolly.typescript.typescriptMod.EmitHint, 
  /* node */ typingsJapgolly.typescript.typescriptMod.Node, 
  scala.Unit]) => emitNodeWithNotification(t0, t1, t2).runNow()))
    __obj.updateDynamic("substituteNode")(js.Any.fromFunction2((t0: typingsJapgolly.typescript.typescriptMod.EmitHint, t1: typingsJapgolly.typescript.typescriptMod.Node) => substituteNode(t0, t1).runNow()))
    if (diagnostics != null) __obj.updateDynamic("diagnostics")(diagnostics.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformationResult[T]]
  }
}

