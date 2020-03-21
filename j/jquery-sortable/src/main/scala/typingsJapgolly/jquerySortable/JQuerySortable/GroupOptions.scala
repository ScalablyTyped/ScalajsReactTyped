package typingsJapgolly.jquerySortable.JQuerySortable

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import typingsJapgolly.jquerySortable.JQuery
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupOptions extends js.Object {
  var afterMove: js.UndefOr[
    js.Function3[
      /* $placeholder */ JQuery, 
      /* container */ Container, 
      /* $closestItemOrContainer */ JQuery, 
      Unit
    ]
  ] = js.undefined
  var containerPath: js.UndefOr[String] = js.undefined
  var containerSelector: js.UndefOr[String] = js.undefined
  var delay: js.UndefOr[Double] = js.undefined
  var distance: js.UndefOr[Double] = js.undefined
  var handle: js.UndefOr[String] = js.undefined
  var isValidTarget: js.UndefOr[js.Function2[/* $item */ JQuery, /* container */ Container, Boolean]] = js.undefined
  var itemPath: js.UndefOr[String] = js.undefined
  var itemSelector: js.UndefOr[String] = js.undefined
  var onCancel: js.UndefOr[OnCancelHandler] = js.undefined
  var onDrag: js.UndefOr[OnDragEventHandler] = js.undefined
  var onDragStart: js.UndefOr[GenericEventHandler] = js.undefined
  var onDrop: js.UndefOr[GenericEventHandler] = js.undefined
  var onMousedown: js.UndefOr[OnMousedownHandler] = js.undefined
  var placeholder: js.UndefOr[JQuery | js.Array[_] | Element | String] = js.undefined
  var pullPlaceholder: js.UndefOr[Boolean] = js.undefined
  var serialize: js.UndefOr[SerializeFunc] = js.undefined
  var tolerance: js.UndefOr[Double] = js.undefined
}

object GroupOptions {
  @scala.inline
  def apply(
    afterMove: (/* $placeholder */ JQuery, /* container */ Container, /* $closestItemOrContainer */ JQuery) => Callback = null,
    containerPath: String = null,
    containerSelector: String = null,
    delay: Int | Double = null,
    distance: Int | Double = null,
    handle: String = null,
    isValidTarget: (/* $item */ JQuery, /* container */ Container) => CallbackTo[Boolean] = null,
    itemPath: String = null,
    itemSelector: String = null,
    onCancel: (/* $item */ js.UndefOr[JQuery], /* container */ js.UndefOr[Container], /* _super */ js.UndefOr[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias jquery-sortable.JQuerySortable.OnCancelHandler */ js.Object
    ], /* event */ js.UndefOr[Event_]) => Callback = null,
    onDrag: (/* $item */ js.UndefOr[JQuery], /* position */ js.UndefOr[Position], /* _super */ js.UndefOr[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias jquery-sortable.JQuerySortable.OnDragEventHandler */ js.Object
    ], /* event */ js.UndefOr[Event_]) => Callback = null,
    onDragStart: (/* $item */ js.UndefOr[JQuery], /* container */ js.UndefOr[Container], /* _super */ js.UndefOr[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias jquery-sortable.JQuerySortable.GenericEventHandler */ js.Object
    ], /* event */ js.UndefOr[Event_]) => Callback = null,
    onDrop: (/* $item */ js.UndefOr[JQuery], /* container */ js.UndefOr[Container], /* _super */ js.UndefOr[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias jquery-sortable.JQuerySortable.GenericEventHandler */ js.Object
    ], /* event */ js.UndefOr[Event_]) => Callback = null,
    onMousedown: (/* $item */ js.UndefOr[JQuery], /* _super */ js.UndefOr[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias jquery-sortable.JQuerySortable.OnMousedownHandler */ js.Object
    ], /* event */ js.UndefOr[Event_]) => Callback = null,
    placeholder: JQuery | js.Array[_] | Element | String = null,
    pullPlaceholder: js.UndefOr[Boolean] = js.undefined,
    serialize: (/* $parent */ JQuery, /* $children */ js.Any, /* parentIsContainer */ Boolean) => Callback = null,
    tolerance: Int | Double = null
  ): GroupOptions = {
    val __obj = js.Dynamic.literal()
    if (afterMove != null) __obj.updateDynamic("afterMove")(js.Any.fromFunction3((t0: /* $placeholder */ typingsJapgolly.jquerySortable.JQuery, t1: /* container */ typingsJapgolly.jquerySortable.JQuerySortable.Container, t2: /* $closestItemOrContainer */ typingsJapgolly.jquerySortable.JQuery) => afterMove(t0, t1, t2).runNow()))
    if (containerPath != null) __obj.updateDynamic("containerPath")(containerPath.asInstanceOf[js.Any])
    if (containerSelector != null) __obj.updateDynamic("containerSelector")(containerSelector.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    if (isValidTarget != null) __obj.updateDynamic("isValidTarget")(js.Any.fromFunction2((t0: /* $item */ typingsJapgolly.jquerySortable.JQuery, t1: /* container */ typingsJapgolly.jquerySortable.JQuerySortable.Container) => isValidTarget(t0, t1).runNow()))
    if (itemPath != null) __obj.updateDynamic("itemPath")(itemPath.asInstanceOf[js.Any])
    if (itemSelector != null) __obj.updateDynamic("itemSelector")(itemSelector.asInstanceOf[js.Any])
    if (onCancel != null) __obj.updateDynamic("onCancel")(js.Any.fromFunction4((t0: /* $item */ js.UndefOr[typingsJapgolly.jquerySortable.JQuery], t1: /* container */ js.UndefOr[typingsJapgolly.jquerySortable.JQuerySortable.Container], t2: /* _super */ js.UndefOr[
  /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias jquery-sortable.JQuerySortable.OnCancelHandler */ js.Object], t3: /* event */ js.UndefOr[typingsJapgolly.std.Event_]) => onCancel(t0, t1, t2, t3).runNow()))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction4((t0: /* $item */ js.UndefOr[typingsJapgolly.jquerySortable.JQuery], t1: /* position */ js.UndefOr[typingsJapgolly.jquerySortable.JQuerySortable.Position], t2: /* _super */ js.UndefOr[
  /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias jquery-sortable.JQuerySortable.OnDragEventHandler */ js.Object], t3: /* event */ js.UndefOr[typingsJapgolly.std.Event_]) => onDrag(t0, t1, t2, t3).runNow()))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction4((t0: /* $item */ js.UndefOr[typingsJapgolly.jquerySortable.JQuery], t1: /* container */ js.UndefOr[typingsJapgolly.jquerySortable.JQuerySortable.Container], t2: /* _super */ js.UndefOr[
  /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias jquery-sortable.JQuerySortable.GenericEventHandler */ js.Object], t3: /* event */ js.UndefOr[typingsJapgolly.std.Event_]) => onDragStart(t0, t1, t2, t3).runNow()))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction4((t0: /* $item */ js.UndefOr[typingsJapgolly.jquerySortable.JQuery], t1: /* container */ js.UndefOr[typingsJapgolly.jquerySortable.JQuerySortable.Container], t2: /* _super */ js.UndefOr[
  /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias jquery-sortable.JQuerySortable.GenericEventHandler */ js.Object], t3: /* event */ js.UndefOr[typingsJapgolly.std.Event_]) => onDrop(t0, t1, t2, t3).runNow()))
    if (onMousedown != null) __obj.updateDynamic("onMousedown")(js.Any.fromFunction3((t0: /* $item */ js.UndefOr[typingsJapgolly.jquerySortable.JQuery], t1: /* _super */ js.UndefOr[
  /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias jquery-sortable.JQuerySortable.OnMousedownHandler */ js.Object], t2: /* event */ js.UndefOr[typingsJapgolly.std.Event_]) => onMousedown(t0, t1, t2).runNow()))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(pullPlaceholder)) __obj.updateDynamic("pullPlaceholder")(pullPlaceholder.asInstanceOf[js.Any])
    if (serialize != null) __obj.updateDynamic("serialize")(js.Any.fromFunction3((t0: /* $parent */ typingsJapgolly.jquerySortable.JQuery, t1: /* $children */ js.Any, t2: /* parentIsContainer */ scala.Boolean) => serialize(t0, t1, t2).runNow()))
    if (tolerance != null) __obj.updateDynamic("tolerance")(tolerance.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupOptions]
  }
}

