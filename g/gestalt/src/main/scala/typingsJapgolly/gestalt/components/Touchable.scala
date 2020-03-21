package typingsJapgolly.gestalt.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.gestalt.Anon1
import typingsJapgolly.gestalt.AnonEventSyntheticEvent
import typingsJapgolly.gestalt.gestaltStrings.circle
import typingsJapgolly.gestalt.gestaltStrings.copy
import typingsJapgolly.gestalt.gestaltStrings.grab
import typingsJapgolly.gestalt.gestaltStrings.grabbing
import typingsJapgolly.gestalt.gestaltStrings.move
import typingsJapgolly.gestalt.gestaltStrings.noDrop
import typingsJapgolly.gestalt.gestaltStrings.pill
import typingsJapgolly.gestalt.gestaltStrings.pointer
import typingsJapgolly.gestalt.gestaltStrings.rounded
import typingsJapgolly.gestalt.gestaltStrings.roundedBottom
import typingsJapgolly.gestalt.gestaltStrings.roundedLeft
import typingsJapgolly.gestalt.gestaltStrings.roundedRight
import typingsJapgolly.gestalt.gestaltStrings.roundedTop
import typingsJapgolly.gestalt.gestaltStrings.square
import typingsJapgolly.gestalt.gestaltStrings.zoomIn
import typingsJapgolly.gestalt.gestaltStrings.zoomOut
import typingsJapgolly.gestalt.mod.TouchableProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Touchable {
  def apply(
    onTouch: Anon1 => Callback,
    fullHeight: js.UndefOr[Boolean] = js.undefined,
    fullWidth: js.UndefOr[Boolean] = js.undefined,
    mouseCursor: copy | grab | grabbing | move | noDrop | pointer | zoomIn | zoomOut = null,
    onMouseEnter: /* args */ AnonEventSyntheticEvent => Callback = null,
    onMouseLeave: /* args */ AnonEventSyntheticEvent => Callback = null,
    shape: square | rounded | pill | circle | roundedTop | roundedBottom | roundedLeft | roundedRight = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[TouchableProps, typingsJapgolly.gestalt.mod.Touchable, Unit, TouchableProps] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("onTouch")(js.Any.fromFunction1((t0: typingsJapgolly.gestalt.Anon1) => onTouch(t0).runNow()))
    if (!js.isUndefined(fullHeight)) __obj.updateDynamic("fullHeight")(fullHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(fullWidth)) __obj.updateDynamic("fullWidth")(fullWidth.asInstanceOf[js.Any])
    if (mouseCursor != null) __obj.updateDynamic("mouseCursor")(mouseCursor.asInstanceOf[js.Any])
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.gestalt.AnonEventSyntheticEvent) => onMouseEnter(t0).runNow()))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.gestalt.AnonEventSyntheticEvent) => onMouseLeave(t0).runNow()))
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.gestalt.mod.TouchableProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.gestalt.mod.Touchable](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.gestalt.mod.TouchableProps])(children: _*)
  }
  @JSImport("gestalt", "Touchable")
  @js.native
  object componentImport extends js.Object
  
}

