package typingsJapgolly.rmcTabs.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.rmcTabs.tabPaneMod.PropsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TabPane {
  def apply(
    active: Boolean,
    className: String = null,
    fixX: js.UndefOr[Boolean] = js.undefined,
    fixY: js.UndefOr[Boolean] = js.undefined,
    role: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[PropsType, typingsJapgolly.rmcTabs.tabPaneMod.TabPane, Unit, PropsType] = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(fixX)) __obj.updateDynamic("fixX")(fixX.asInstanceOf[js.Any])
    if (!js.isUndefined(fixY)) __obj.updateDynamic("fixY")(fixY.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.rmcTabs.tabPaneMod.PropsType, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.rmcTabs.tabPaneMod.TabPane](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.rmcTabs.tabPaneMod.PropsType])(children: _*)
  }
  @JSImport("rmc-tabs/lib/TabPane", "TabPane")
  @js.native
  object componentImport extends js.Object
  
}

