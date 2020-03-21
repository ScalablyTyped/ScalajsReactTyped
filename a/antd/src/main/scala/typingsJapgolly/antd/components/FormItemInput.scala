package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antd.formItemInputMod.FormItemInputMiscProps
import typingsJapgolly.antd.formItemInputMod.FormItemInputProps
import typingsJapgolly.antd.formItemMod.ValidateStatus
import typingsJapgolly.antd.gridColMod.ColProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FormItemInput {
  def apply(
    errors: js.Array[Node],
    prefixCls: String,
    onDomErrorVisibleChange: Boolean => Callback,
    extra: VdomNode = null,
    hasFeedback: js.UndefOr[Boolean] = js.undefined,
    help: VdomNode = null,
    validateStatus: ValidateStatus = null,
    wrapperCol: ColProps = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    FormItemInputProps with FormItemInputMiscProps, 
    MountedWithRawType[
      FormItemInputProps with FormItemInputMiscProps, 
      js.Object, 
      RawMounted[FormItemInputProps with FormItemInputMiscProps, js.Object]
    ]
  ] = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onDomErrorVisibleChange")(js.Any.fromFunction1((t0: scala.Boolean) => onDomErrorVisibleChange(t0).runNow()))
    if (extra != null) __obj.updateDynamic("extra")(extra.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(hasFeedback)) __obj.updateDynamic("hasFeedback")(hasFeedback.asInstanceOf[js.Any])
    if (help != null) __obj.updateDynamic("help")(help.rawNode.asInstanceOf[js.Any])
    if (validateStatus != null) __obj.updateDynamic("validateStatus")(validateStatus.asInstanceOf[js.Any])
    if (wrapperCol != null) __obj.updateDynamic("wrapperCol")(wrapperCol.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.antd.formItemInputMod.FormItemInputProps with typingsJapgolly.antd.formItemInputMod.FormItemInputMiscProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antd.formItemInputMod.FormItemInputProps with typingsJapgolly.antd.formItemInputMod.FormItemInputMiscProps])(children: _*)
  }
  @JSImport("antd/lib/form/FormItemInput", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

