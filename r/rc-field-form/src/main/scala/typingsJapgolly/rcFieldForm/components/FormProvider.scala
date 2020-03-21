package typingsJapgolly.rcFieldForm.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.rcFieldForm.formContextMod.FormChangeInfo
import typingsJapgolly.rcFieldForm.formContextMod.FormFinishInfo
import typingsJapgolly.rcFieldForm.formContextMod.FormProviderProps
import typingsJapgolly.rcFieldForm.interfaceMod.ValidateMessages
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FormProvider {
  def apply(
    onFormChange: (/* name */ String, /* info */ FormChangeInfo) => Callback = null,
    onFormFinish: (/* name */ String, /* info */ FormFinishInfo) => Callback = null,
    validateMessages: ValidateMessages = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    FormProviderProps, 
    MountedWithRawType[FormProviderProps, js.Object, RawMounted[FormProviderProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (onFormChange != null) __obj.updateDynamic("onFormChange")(js.Any.fromFunction2((t0: /* name */ java.lang.String, t1: /* info */ typingsJapgolly.rcFieldForm.formContextMod.FormChangeInfo) => onFormChange(t0, t1).runNow()))
    if (onFormFinish != null) __obj.updateDynamic("onFormFinish")(js.Any.fromFunction2((t0: /* name */ java.lang.String, t1: /* info */ typingsJapgolly.rcFieldForm.formContextMod.FormFinishInfo) => onFormFinish(t0, t1).runNow()))
    if (validateMessages != null) __obj.updateDynamic("validateMessages")(validateMessages.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.rcFieldForm.formContextMod.FormProviderProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.rcFieldForm.formContextMod.FormProviderProps])(children: _*)
  }
  @JSImport("rc-field-form/lib", "FormProvider")
  @js.native
  object componentImport extends js.Object
  
}

