package typingsJapgolly.reactBootstrapTypeahead.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.reactBootstrapTypeahead.mod.OverlayProps
import typingsJapgolly.reactBootstrapTypeahead.mod.TypeaheadAlign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Overlay {
  def apply(
    container: HTMLElement,
    align: TypeaheadAlign = null,
    className: String = null,
    dropup: js.UndefOr[Boolean] = js.undefined,
    flip: js.UndefOr[Boolean] = js.undefined,
    onMenuHide: js.UndefOr[Callback] = js.undefined,
    onMenuShow: js.UndefOr[Callback] = js.undefined,
    onMenuToggle: /* show */ Boolean => Callback = null,
    referenceElement: HTMLElement = null,
    show: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[OverlayProps, typingsJapgolly.reactBootstrapTypeahead.mod.Overlay, Unit, OverlayProps] = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
  
      if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(dropup)) __obj.updateDynamic("dropup")(dropup.asInstanceOf[js.Any])
    if (!js.isUndefined(flip)) __obj.updateDynamic("flip")(flip.asInstanceOf[js.Any])
    onMenuHide.foreach(p => __obj.updateDynamic("onMenuHide")(p.toJsFn))
    onMenuShow.foreach(p => __obj.updateDynamic("onMenuShow")(p.toJsFn))
    if (onMenuToggle != null) __obj.updateDynamic("onMenuToggle")(js.Any.fromFunction1((t0: /* show */ scala.Boolean) => onMenuToggle(t0).runNow()))
    if (referenceElement != null) __obj.updateDynamic("referenceElement")(referenceElement.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactBootstrapTypeahead.mod.OverlayProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactBootstrapTypeahead.mod.Overlay](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactBootstrapTypeahead.mod.OverlayProps])(children: _*)
  }
  @JSImport("react-bootstrap-typeahead", "Overlay")
  @js.native
  object componentImport extends js.Object
  
}

