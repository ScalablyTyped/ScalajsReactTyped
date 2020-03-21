package typingsJapgolly.baseui.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.baseui.ReadonlyToasterProps
import typingsJapgolly.baseui.baseuiStrings.bottom
import typingsJapgolly.baseui.baseuiStrings.bottomLeft
import typingsJapgolly.baseui.baseuiStrings.bottomRight
import typingsJapgolly.baseui.baseuiStrings.top
import typingsJapgolly.baseui.baseuiStrings.topLeft
import typingsJapgolly.baseui.baseuiStrings.topRight
import typingsJapgolly.baseui.toastMod.ToasterOverrides
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ToasterContainer {
  def apply(
    autoHideDuration: Int | Double = null,
    overrides: ToasterOverrides = null,
    placement: topLeft | topRight | bottomLeft | bottomRight | bottom | top = null,
    usePortal: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ReadonlyToasterProps, 
    typingsJapgolly.baseui.toastMod.ToasterContainer, 
    Unit, 
    ReadonlyToasterProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (autoHideDuration != null) __obj.updateDynamic("autoHideDuration")(autoHideDuration.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (!js.isUndefined(usePortal)) __obj.updateDynamic("usePortal")(usePortal.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.baseui.ReadonlyToasterProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.baseui.toastMod.ToasterContainer](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.baseui.ReadonlyToasterProps])(children: _*)
  }
  @JSImport("baseui/toast", "ToasterContainer")
  @js.native
  object componentImport extends js.Object
  
}

