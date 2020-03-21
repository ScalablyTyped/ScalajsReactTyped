package typingsJapgolly.reactOffcanvas.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactOffcanvas.mod.OffCanvasProps
import typingsJapgolly.reactOffcanvas.reactOffcanvasStrings.left
import typingsJapgolly.reactOffcanvas.reactOffcanvasStrings.overlay
import typingsJapgolly.reactOffcanvas.reactOffcanvasStrings.parallax
import typingsJapgolly.reactOffcanvas.reactOffcanvasStrings.push
import typingsJapgolly.reactOffcanvas.reactOffcanvasStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object OffCanvas {
  def apply(
    effect: push | overlay | parallax = null,
    isMenuOpened: js.UndefOr[Boolean] = js.undefined,
    position: left | right = null,
    transitionDuration: Int | Double = null,
    width: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[OffCanvasProps, typingsJapgolly.reactOffcanvas.mod.OffCanvas, Unit, OffCanvasProps] = {
    val __obj = js.Dynamic.literal()
  
      if (effect != null) __obj.updateDynamic("effect")(effect.asInstanceOf[js.Any])
    if (!js.isUndefined(isMenuOpened)) __obj.updateDynamic("isMenuOpened")(isMenuOpened.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactOffcanvas.mod.OffCanvasProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactOffcanvas.mod.OffCanvas](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactOffcanvas.mod.OffCanvasProps])(children: _*)
  }
  @JSImport("react-offcanvas", "OffCanvas")
  @js.native
  object componentImport extends js.Object
  
}

