package typingsJapgolly.reactOverlays.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactOverlays.dropdownMenuMod.DropdownMenuProps
import typingsJapgolly.reactOverlays.dropdownMenuMod.DropdownMenuRenderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DropdownMenu {
  def apply(
    alignEnd: js.UndefOr[Boolean] = js.undefined,
    flip: js.UndefOr[Boolean] = js.undefined,
    popperConfig: js.Object = null,
    rootCloseEvent: String = null,
    show: js.UndefOr[Boolean] = js.undefined,
    usePopper: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: DropdownMenuRenderProps => CallbackTo[Element]
  ): UnmountedWithRoot[
    DropdownMenuProps, 
    typingsJapgolly.reactOverlays.mod.DropdownMenu, 
    Unit, 
    DropdownMenuProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.reactOverlays.dropdownMenuMod.DropdownMenuRenderProps) => children(t0).runNow()))
    if (!js.isUndefined(alignEnd)) __obj.updateDynamic("alignEnd")(alignEnd.asInstanceOf[js.Any])
    if (!js.isUndefined(flip)) __obj.updateDynamic("flip")(flip.asInstanceOf[js.Any])
    if (popperConfig != null) __obj.updateDynamic("popperConfig")(popperConfig.asInstanceOf[js.Any])
    if (rootCloseEvent != null) __obj.updateDynamic("rootCloseEvent")(rootCloseEvent.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (!js.isUndefined(usePopper)) __obj.updateDynamic("usePopper")(usePopper.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactOverlays.dropdownMenuMod.DropdownMenuProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactOverlays.mod.DropdownMenu](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactOverlays.dropdownMenuMod.DropdownMenuProps])
  }
  @JSImport("react-overlays", "DropdownMenu")
  @js.native
  object componentImport extends js.Object
  
}

