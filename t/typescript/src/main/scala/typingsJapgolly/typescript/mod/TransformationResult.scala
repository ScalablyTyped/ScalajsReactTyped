package typingsJapgolly.typescript.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformationResult[T /* <: Node */] extends js.Object {
  /** Gets diagnostics for the transformation. */
  var diagnostics: js.UndefOr[js.Array[DiagnosticWithLocation]] = js.undefined
  /**
    * Indicates if a given node needs an emit notification
    *
    * @param node The node to emit.
    */
  var isEmitNotificationEnabled: js.UndefOr[js.Function1[/* node */ Node, Boolean]] = js.undefined
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
    diagnostics: js.Array[DiagnosticWithLocation] = null,
    isEmitNotificationEnabled: /* node */ Node => CallbackTo[Boolean] = null
  ): TransformationResult[T] = {
    val __obj = js.Dynamic.literal(transformed = transformed.asInstanceOf[js.Any])
    __obj.updateDynamic("dispose")(dispose.toJsFn)
    __obj.updateDynamic("emitNodeWithNotification")(js.Any.fromFunction3((t0: typingsJapgolly.typescript.mod.EmitHint, t1: typingsJapgolly.typescript.mod.Node, t2: js.Function2[
  /* hint */ typingsJapgolly.typescript.mod.EmitHint, 
  /* node */ typingsJapgolly.typescript.mod.Node, 
  scala.Unit]) => emitNodeWithNotification(t0, t1, t2).runNow()))
    __obj.updateDynamic("substituteNode")(js.Any.fromFunction2((t0: typingsJapgolly.typescript.mod.EmitHint, t1: typingsJapgolly.typescript.mod.Node) => substituteNode(t0, t1).runNow()))
    if (diagnostics != null) __obj.updateDynamic("diagnostics")(diagnostics.asInstanceOf[js.Any])
    if (isEmitNotificationEnabled != null) __obj.updateDynamic("isEmitNotificationEnabled")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.typescript.mod.Node) => isEmitNotificationEnabled(t0).runNow()))
    __obj.asInstanceOf[TransformationResult[T]]
  }
}

