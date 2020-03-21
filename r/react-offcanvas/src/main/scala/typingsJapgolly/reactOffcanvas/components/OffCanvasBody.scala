package typingsJapgolly.reactOffcanvas.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactOffcanvas.mod.OffCanvasBodyProps
import typingsJapgolly.reactOffcanvas.reactOffcanvasStrings.left
import typingsJapgolly.reactOffcanvas.reactOffcanvasStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object OffCanvasBody {
  def apply(
    className: String = null,
    isMenuOpened: js.UndefOr[Boolean] = js.undefined,
    position: left | right = null,
    style: CSSProperties = null,
    transitionDuration: Int | Double = null,
    width: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    OffCanvasBodyProps, 
    typingsJapgolly.reactOffcanvas.mod.OffCanvasBody, 
    Unit, 
    OffCanvasBodyProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(isMenuOpened)) __obj.updateDynamic("isMenuOpened")(isMenuOpened.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactOffcanvas.mod.OffCanvasBodyProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactOffcanvas.mod.OffCanvasBody](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactOffcanvas.mod.OffCanvasBodyProps])(children: _*)
  }
  @JSImport("react-offcanvas", "OffCanvasBody")
  @js.native
  object componentImport extends js.Object
  
}

