package typingsJapgolly.baseui.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Ref
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.baseui.baseuiStrings.auto
import typingsJapgolly.baseui.baseuiStrings.bottom
import typingsJapgolly.baseui.baseuiStrings.bottomLeft
import typingsJapgolly.baseui.baseuiStrings.bottomRight
import typingsJapgolly.baseui.baseuiStrings.left
import typingsJapgolly.baseui.baseuiStrings.leftBottom
import typingsJapgolly.baseui.baseuiStrings.leftTop
import typingsJapgolly.baseui.baseuiStrings.right
import typingsJapgolly.baseui.baseuiStrings.rightBottom
import typingsJapgolly.baseui.baseuiStrings.rightTop
import typingsJapgolly.baseui.baseuiStrings.top
import typingsJapgolly.baseui.baseuiStrings.topLeft
import typingsJapgolly.baseui.baseuiStrings.topRight
import typingsJapgolly.baseui.layerMod.NormalizedOffsets
import typingsJapgolly.baseui.layerMod.PopperDataObject
import typingsJapgolly.baseui.layerMod.TetherProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TetherBehavior {
  def apply(
    anchorRef: Ref = null,
    arrowRef: Ref = null,
    onPopperUpdate: (/* offsets */ NormalizedOffsets, /* popper */ PopperDataObject) => CallbackTo[js.Any] = null,
    placement: topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top = null,
    popperOptions: js.Any = null,
    popperRef: Ref = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[TetherProps, typingsJapgolly.baseui.layerMod.TetherBehavior, Unit, TetherProps] = {
    val __obj = js.Dynamic.literal()
  
      if (anchorRef != null) __obj.updateDynamic("anchorRef")(anchorRef.asInstanceOf[js.Any])
    if (arrowRef != null) __obj.updateDynamic("arrowRef")(arrowRef.asInstanceOf[js.Any])
    if (onPopperUpdate != null) __obj.updateDynamic("onPopperUpdate")(js.Any.fromFunction2((t0: /* offsets */ typingsJapgolly.baseui.layerMod.NormalizedOffsets, t1: /* popper */ typingsJapgolly.baseui.layerMod.PopperDataObject) => onPopperUpdate(t0, t1).runNow()))
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (popperOptions != null) __obj.updateDynamic("popperOptions")(popperOptions.asInstanceOf[js.Any])
    if (popperRef != null) __obj.updateDynamic("popperRef")(popperRef.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.baseui.layerMod.TetherProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.baseui.layerMod.TetherBehavior](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.baseui.layerMod.TetherProps])(children: _*)
  }
  @JSImport("baseui/layer", "TetherBehavior")
  @js.native
  object componentImport extends js.Object
  
}

