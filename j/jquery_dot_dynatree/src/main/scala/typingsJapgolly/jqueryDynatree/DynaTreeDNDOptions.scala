package typingsJapgolly.jqueryDynatree

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynaTreeDNDOptions extends js.Object {
  var autoExpandMS: js.UndefOr[Double] = js.undefined
   // Callback(sourceNode)
  // Make tree nodes accept draggables
  var onDragEnter: js.UndefOr[js.Function2[/* targetNode */ js.Any, /* sourceNode */ js.Any, Unit]] = js.undefined
   // Callback(targetNode, sourceNode, hitMode)
  var onDragLeave: js.UndefOr[js.Function2[/* targetNode */ js.Any, /* sourceNode */ js.Any, Unit]] = js.undefined
   // Callback(targetNode, sourceNode)
  var onDragOver: js.UndefOr[
    js.Function3[/* targetNode */ js.Any, /* sourceNode */ js.Any, /* hitMode */ String, Unit]
  ] = js.undefined
   // true: slide helper back to source if drop is rejected
  // Make tree nodes draggable:
  var onDragStart: js.UndefOr[js.Function1[/* sourceNode */ js.Any, Unit]] = js.undefined
   // Callback(sourceNode), return true, to enable dnd
  var onDragStop: js.UndefOr[js.Function1[/* sourceNode */ js.Any, Unit]] = js.undefined
    // Callback(targetNode, sourceNode, hitMode)
  var onDrop: js.UndefOr[
    js.Function3[/* targetNode */ js.Any, /* sourceNode */ js.Any, /* hitMode */ String, Unit]
  ] = js.undefined
   // Expand nodes after n milliseconds of hovering.
  var preventVoidMoves: js.UndefOr[Boolean] = js.undefined
   // Prevent dropping nodes 'before self', etc.
  var revert: Boolean
}

object DynaTreeDNDOptions {
  @scala.inline
  def apply(
    revert: Boolean,
    autoExpandMS: Int | Double = null,
    onDragEnter: (/* targetNode */ js.Any, /* sourceNode */ js.Any) => Callback = null,
    onDragLeave: (/* targetNode */ js.Any, /* sourceNode */ js.Any) => Callback = null,
    onDragOver: (/* targetNode */ js.Any, /* sourceNode */ js.Any, /* hitMode */ String) => Callback = null,
    onDragStart: /* sourceNode */ js.Any => Callback = null,
    onDragStop: /* sourceNode */ js.Any => Callback = null,
    onDrop: (/* targetNode */ js.Any, /* sourceNode */ js.Any, /* hitMode */ String) => Callback = null,
    preventVoidMoves: js.UndefOr[Boolean] = js.undefined
  ): DynaTreeDNDOptions = {
    val __obj = js.Dynamic.literal(revert = revert.asInstanceOf[js.Any])
    if (autoExpandMS != null) __obj.updateDynamic("autoExpandMS")(autoExpandMS.asInstanceOf[js.Any])
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction2((t0: /* targetNode */ js.Any, t1: /* sourceNode */ js.Any) => onDragEnter(t0, t1).runNow()))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction2((t0: /* targetNode */ js.Any, t1: /* sourceNode */ js.Any) => onDragLeave(t0, t1).runNow()))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction3((t0: /* targetNode */ js.Any, t1: /* sourceNode */ js.Any, t2: /* hitMode */ java.lang.String) => onDragOver(t0, t1, t2).runNow()))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1((t0: /* sourceNode */ js.Any) => onDragStart(t0).runNow()))
    if (onDragStop != null) __obj.updateDynamic("onDragStop")(js.Any.fromFunction1((t0: /* sourceNode */ js.Any) => onDragStop(t0).runNow()))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction3((t0: /* targetNode */ js.Any, t1: /* sourceNode */ js.Any, t2: /* hitMode */ java.lang.String) => onDrop(t0, t1, t2).runNow()))
    if (!js.isUndefined(preventVoidMoves)) __obj.updateDynamic("preventVoidMoves")(preventVoidMoves.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynaTreeDNDOptions]
  }
}

