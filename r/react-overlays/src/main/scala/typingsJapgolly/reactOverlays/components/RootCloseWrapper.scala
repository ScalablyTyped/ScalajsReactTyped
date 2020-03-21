package typingsJapgolly.reactOverlays.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.reactOverlays.reactOverlaysStrings.click
import typingsJapgolly.reactOverlays.reactOverlaysStrings.mousedown
import typingsJapgolly.reactOverlays.rootCloseWrapperMod.RootCloseWrapperProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RootCloseWrapper {
  def apply(
    disabled: js.UndefOr[Boolean] = js.undefined,
    event: click | mousedown = null,
    onRootClose: /* e */ ReactEventFrom[Element] => Callback = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    RootCloseWrapperProps, 
    typingsJapgolly.reactOverlays.mod.RootCloseWrapper, 
    Unit, 
    RootCloseWrapperProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (onRootClose != null) __obj.updateDynamic("onRootClose")(js.Any.fromFunction1((t0: /* e */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]) => onRootClose(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactOverlays.rootCloseWrapperMod.RootCloseWrapperProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactOverlays.mod.RootCloseWrapper](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactOverlays.rootCloseWrapperMod.RootCloseWrapperProps])(children: _*)
  }
  @JSImport("react-overlays", "RootCloseWrapper")
  @js.native
  object componentImport extends js.Object
  
}

