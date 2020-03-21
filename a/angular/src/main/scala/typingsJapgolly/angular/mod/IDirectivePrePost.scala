package typingsJapgolly.angular.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.angular.JQLite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDirectivePrePost[TScope /* <: IScope */, TElement /* <: JQLite */, TAttributes /* <: IAttributes */, TController /* <: IDirectiveController */] extends js.Object {
  var post: js.UndefOr[IDirectiveLinkFn[TScope, TElement, TAttributes, TController]] = js.undefined
  var pre: js.UndefOr[IDirectiveLinkFn[TScope, TElement, TAttributes, TController]] = js.undefined
}

object IDirectivePrePost {
  @scala.inline
  def apply[TScope /* <: IScope */, TElement /* <: JQLite */, TAttributes /* <: IAttributes */, TController /* <: IDirectiveController */](
    post: (TScope, TElement, TAttributes, /* controller */ js.UndefOr[TController], /* transclude */ js.UndefOr[ITranscludeFunction]) => Callback = null,
    pre: (TScope, TElement, TAttributes, /* controller */ js.UndefOr[TController], /* transclude */ js.UndefOr[ITranscludeFunction]) => Callback = null
  ): IDirectivePrePost[TScope, TElement, TAttributes, TController] = {
    val __obj = js.Dynamic.literal()
    if (post != null) __obj.updateDynamic("post")(js.Any.fromFunction5((t0: TScope, t1: TElement, t2: TAttributes, t3: /* controller */ js.UndefOr[TController], t4: /* transclude */ js.UndefOr[typingsJapgolly.angular.mod.ITranscludeFunction]) => post(t0, t1, t2, t3, t4).runNow()))
    if (pre != null) __obj.updateDynamic("pre")(js.Any.fromFunction5((t0: TScope, t1: TElement, t2: TAttributes, t3: /* controller */ js.UndefOr[TController], t4: /* transclude */ js.UndefOr[typingsJapgolly.angular.mod.ITranscludeFunction]) => pre(t0, t1, t2, t3, t4).runNow()))
    __obj.asInstanceOf[IDirectivePrePost[TScope, TElement, TAttributes, TController]]
  }
}

