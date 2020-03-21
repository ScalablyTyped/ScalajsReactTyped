package typingsJapgolly.reactBootstrapTypeahead.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<react-bootstrap-typeahead.react-bootstrap-typeahead.TypeaheadProps<any>, 'align' | 'dropup' | 'flip' | 'onMenuHide' | 'onMenuShow' | 'onMenuToggle'> */
trait OverlayTypeaheadProps extends js.Object {
  var align: js.UndefOr[TypeaheadAlign] = js.undefined
  var dropup: js.UndefOr[Boolean] = js.undefined
  var flip: js.UndefOr[Boolean] = js.undefined
  var onMenuHide: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onMenuShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onMenuToggle: js.UndefOr[js.Function1[/* show */ Boolean, Unit]] = js.undefined
}

object OverlayTypeaheadProps {
  @scala.inline
  def apply(
    align: TypeaheadAlign = null,
    dropup: js.UndefOr[Boolean] = js.undefined,
    flip: js.UndefOr[Boolean] = js.undefined,
    onMenuHide: js.UndefOr[Callback] = js.undefined,
    onMenuShow: js.UndefOr[Callback] = js.undefined,
    onMenuToggle: /* show */ Boolean => Callback = null
  ): OverlayTypeaheadProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(dropup)) __obj.updateDynamic("dropup")(dropup.asInstanceOf[js.Any])
    if (!js.isUndefined(flip)) __obj.updateDynamic("flip")(flip.asInstanceOf[js.Any])
    onMenuHide.foreach(p => __obj.updateDynamic("onMenuHide")(p.toJsFn))
    onMenuShow.foreach(p => __obj.updateDynamic("onMenuShow")(p.toJsFn))
    if (onMenuToggle != null) __obj.updateDynamic("onMenuToggle")(js.Any.fromFunction1((t0: /* show */ scala.Boolean) => onMenuToggle(t0).runNow()))
    __obj.asInstanceOf[OverlayTypeaheadProps]
  }
}

