package typingsJapgolly.reactSizeme.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactSizeme.mod.SizeMeProps
import typingsJapgolly.reactSizeme.mod.SizeMeRenderProps
import typingsJapgolly.reactSizeme.reactSizemeStrings.debounce
import typingsJapgolly.reactSizeme.reactSizemeStrings.throttle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SizeMe {
  def apply(
    monitorHeight: js.UndefOr[Boolean] = js.undefined,
    monitorPosition: js.UndefOr[Boolean] = js.undefined,
    monitorWidth: js.UndefOr[Boolean] = js.undefined,
    noPlaceholder: js.UndefOr[Boolean] = js.undefined,
    refreshMode: throttle | debounce = null,
    refreshRate: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: SizeMeProps => CallbackTo[Element]
  ): UnmountedWithRoot[SizeMeRenderProps, typingsJapgolly.reactSizeme.mod.SizeMe, Unit, SizeMeRenderProps] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.reactSizeme.mod.SizeMeProps) => children(t0).runNow()))
    if (!js.isUndefined(monitorHeight)) __obj.updateDynamic("monitorHeight")(monitorHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(monitorPosition)) __obj.updateDynamic("monitorPosition")(monitorPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(monitorWidth)) __obj.updateDynamic("monitorWidth")(monitorWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(noPlaceholder)) __obj.updateDynamic("noPlaceholder")(noPlaceholder.asInstanceOf[js.Any])
    if (refreshMode != null) __obj.updateDynamic("refreshMode")(refreshMode.asInstanceOf[js.Any])
    if (refreshRate != null) __obj.updateDynamic("refreshRate")(refreshRate.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactSizeme.mod.SizeMeRenderProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactSizeme.mod.SizeMe](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactSizeme.mod.SizeMeRenderProps])
  }
  @JSImport("react-sizeme", "SizeMe")
  @js.native
  object componentImport extends js.Object
  
}

