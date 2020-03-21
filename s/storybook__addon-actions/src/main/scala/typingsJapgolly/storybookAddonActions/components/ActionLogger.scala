package typingsJapgolly.storybookAddonActions.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.storybookAddonActions.containersActionLoggerMod.ActionLoggerProps
import typingsJapgolly.storybookAddonActions.containersActionLoggerMod.default
import typingsJapgolly.storybookApi.mod.API
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ActionLogger {
  def apply(
    active: Boolean,
    api: API,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ActionLoggerProps, default, Unit, ActionLoggerProps] = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], api = api.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.storybookAddonActions.containersActionLoggerMod.ActionLoggerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.storybookAddonActions.containersActionLoggerMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.storybookAddonActions.containersActionLoggerMod.ActionLoggerProps])(children: _*)
  }
  @JSImport("@storybook/addon-actions/dist/containers/ActionLogger", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

