package typingsJapgolly.redom.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedomComponent extends js.Object {
  var el: HTMLElement
  var onmount: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onremount: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onunmount: js.UndefOr[js.Function0[Unit]] = js.undefined
  var update: js.UndefOr[
    js.Function4[
      /* item */ js.Any, 
      /* index */ Double, 
      /* data */ js.Any, 
      /* context */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
}

object RedomComponent {
  @scala.inline
  def apply(
    el: HTMLElement,
    onmount: js.UndefOr[Callback] = js.undefined,
    onremount: js.UndefOr[Callback] = js.undefined,
    onunmount: js.UndefOr[Callback] = js.undefined,
    update: (/* item */ js.Any, /* index */ Double, /* data */ js.Any, /* context */ js.UndefOr[js.Any]) => Callback = null
  ): RedomComponent = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any])
    onmount.foreach(p => __obj.updateDynamic("onmount")(p.toJsFn))
    onremount.foreach(p => __obj.updateDynamic("onremount")(p.toJsFn))
    onunmount.foreach(p => __obj.updateDynamic("onunmount")(p.toJsFn))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction4((t0: /* item */ js.Any, t1: /* index */ scala.Double, t2: /* data */ js.Any, t3: /* context */ js.UndefOr[js.Any]) => update(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[RedomComponent]
  }
}

