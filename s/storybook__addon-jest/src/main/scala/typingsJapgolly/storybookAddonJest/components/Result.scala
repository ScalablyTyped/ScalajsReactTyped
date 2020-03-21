package typingsJapgolly.storybookAddonJest.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.storybookAddonJest.resultMod.ResultProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Result {
  def apply(
    failureMessages: js.Any,
    status: String,
    fullName: String = null,
    title: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    ResultProps, 
    MountedWithRawType[ResultProps, js.Object, RawMounted[ResultProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(failureMessages = failureMessages.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
      if (fullName != null) __obj.updateDynamic("fullName")(fullName.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.storybookAddonJest.resultMod.ResultProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.storybookAddonJest.resultMod.ResultProps])(children: _*)
  }
  @JSImport("@storybook/addon-jest/dist/components/Result", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

