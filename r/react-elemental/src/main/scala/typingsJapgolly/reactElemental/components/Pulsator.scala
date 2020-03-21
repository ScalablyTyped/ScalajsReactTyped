package typingsJapgolly.reactElemental.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactElemental.mod.PulsatorProps
import typingsJapgolly.reactElemental.mod.PulsatorSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Pulsator {
  def apply(
    color: String = null,
    inactive: js.UndefOr[Boolean] = js.undefined,
    size: PulsatorSize = null,
    style: CSSProperties = null,
    transparent: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[PulsatorProps, typingsJapgolly.reactElemental.mod.Pulsator, Unit, PulsatorProps] = {
    val __obj = js.Dynamic.literal()
  
      if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(inactive)) __obj.updateDynamic("inactive")(inactive.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(transparent)) __obj.updateDynamic("transparent")(transparent.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactElemental.mod.PulsatorProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactElemental.mod.Pulsator](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactElemental.mod.PulsatorProps])(children: _*)
  }
  @JSImport("react-elemental", "Pulsator")
  @js.native
  object componentImport extends js.Object
  
}

