package typingsJapgolly.gestalt.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.gestalt.gestaltStrings.circle
import typingsJapgolly.gestalt.gestaltStrings.rounded
import typingsJapgolly.gestalt.gestaltStrings.square
import typingsJapgolly.gestalt.mod.MaskProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Mask {
  def apply(
    height: Double | String = null,
    shape: circle | rounded | square = null,
    wash: js.UndefOr[Boolean] = js.undefined,
    width: Double | String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[MaskProps, typingsJapgolly.gestalt.mod.Mask, Unit, MaskProps] = {
    val __obj = js.Dynamic.literal()
  
      if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (!js.isUndefined(wash)) __obj.updateDynamic("wash")(wash.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.gestalt.mod.MaskProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.gestalt.mod.Mask](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.gestalt.mod.MaskProps])(children: _*)
  }
  @JSImport("gestalt", "Mask")
  @js.native
  object componentImport extends js.Object
  
}

